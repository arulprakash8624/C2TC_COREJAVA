package com.arul.demo;

import com.arul.demo.model.Company;
import com.arul.demo.model.CompanyRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company saveCompany(Company company) {
        if (company.getCompanyName() == null || company.getJobRole() == null) {
            throw new IllegalArgumentException("Company must have a name and job role");
        }
        // Persist the company object
        Company savedCompany = companyRepository.save(company);
        return savedCompany;
    }

    public Company getCompanyById(Long companyId) {
        return companyRepository.findById(companyId)
                .orElseThrow(() -> new IllegalArgumentException("Company with ID " + companyId + " not found"));
    }
}
