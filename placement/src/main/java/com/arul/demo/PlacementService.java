package com.arul.demo;

import com.arul.demo.model.Company;
import com.arul.demo.model.Placement;
import com.arul.demo.model.PlacementRepository;
import com.arul.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class PlacementService {

    private final PlacementRepository placementRepository;
    private final CompanyService companyService;
    private final StudentService studentService;

    public PlacementService(PlacementRepository placementRepository, CompanyService companyService, StudentService studentService) {
        this.placementRepository = placementRepository;
        this.companyService = companyService;
        this.studentService = studentService;
    }

    public Placement savePlacement(Placement placement) {
        // Fetch the Company and Student from the database using IDs
        Company company = companyService.getCompanyById(placement.getCompanyId());
        Student student = studentService.getStudentById(placement.getStudentId());

        if (company == null || student == null) {
            throw new IllegalArgumentException("Company or Student not found");
        }

        // Set the fetched company and student in the placement object
        placement.setCompany(company);
        placement.setStudent(student);

        // Increment the number of offers for the company
        company.incrementOffers();
        companyService.saveCompany(company);  // Save the updated company

        // Save the placement and return it
        return placementRepository.save(placement);
    }
}
