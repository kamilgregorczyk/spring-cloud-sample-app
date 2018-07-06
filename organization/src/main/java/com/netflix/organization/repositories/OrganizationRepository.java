package com.netflix.organization.repositories;

import com.netflix.organization.models.Organization;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrganizationRepository {

    private List<Organization> organizations = new ArrayList<>();

    public Organization add(Organization organization) {
        organization.setId((long) (organizations.size() + 1));
        organizations.add(organization);
        return organization;
    }

    public Organization findById(Long id) {
        Optional<Organization> organizationOptional = organizations.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (organizationOptional.isPresent()) {
            Organization organization = organizationOptional.get();
            return new Organization(organization.getId(), organization.getName(), organization.getAddress(), organization.getDepartments(), organization.getEmployees());
        }
        return null;
    }

    public List<Organization> findAll() {
        return organizations;
    }

}
