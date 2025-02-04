package com.arul.demo;

import com.arul.demo.model.Company;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        if (company == null) {
            throw new IllegalArgumentException("Company object cannot be null");
        }
        return companyService.saveCompany(company);
    }
}
