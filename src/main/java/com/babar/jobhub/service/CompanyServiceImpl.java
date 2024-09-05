package com.babar.jobhub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babar.jobhub.entity.Company;
import com.babar.jobhub.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company updatedCompany, Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        {
            if (companyOptional.isPresent()) {
                Company company = companyOptional.get();
                company.setName(updatedCompany.getName());
                company.setDescription(updatedCompany.getDescription());
                company.setJobs(updatedCompany.getJobs());
                companyRepository.save(company);
                return true;
            }
            return false;
        }

    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
