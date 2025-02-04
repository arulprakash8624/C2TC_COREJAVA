package com.arul.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "placements")
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placementId;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentId")  // Assuming studentId is the column name in Student
    private Student student;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "companyId")  // Assuming companyId is the column name in Company
    private Company company;

    private String placementDate;

    @PrePersist
    public void adjustCompanyOffers() {
        if (company != null) {
            company.incrementOffers();
        }
    }

    public Long getPlacementId() {
        return placementId;
    }

    public void setPlacementId(Long placementId) {
        this.placementId = placementId;
    }

    public Long getStudentId() {
        return student != null ? student.getStudentId() : null;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getCompanyId() {
        return company != null ? company.getCompanyId() : null;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPlacementDate() {
        return placementDate;
    }

    public void setPlacementDate(String placementDate) {
        this.placementDate = placementDate;
    }

    // Additional methods for the sake of displaying IDs in the response
    public void setStudentId(Long studentId) {
        if (this.student == null) {
            this.student = new Student();
        }
        this.student.setStudentId(studentId);
    }

    public void setCompanyId(Long companyId) {
        if (this.company == null) {
            this.company = new Company();
        }
        this.company.setCompanyId(companyId);
    }
}
