package com.chgvcode.companyms.company;

import com.chgvcode.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {

    List<Company> getAll();

    Company getCompanyById(Long id);

    void addCompany(Company company);

    boolean updateCompany(Long id, Company company);

    boolean deleteCompanyById(Long id);

    public void updateCompanyRating(ReviewMessage reviewMessage);
}
