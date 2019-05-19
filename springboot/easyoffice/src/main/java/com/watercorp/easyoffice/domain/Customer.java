package com.watercorp.easyoffice.domain;

import java.util.Objects;
import java.util.Set;

public class Customer extends Person {

    private Set<String> services;

    private boolean active;

    private int hashCode;

    public Set<String> getServices() {
        return services;
    }

    public boolean isActive() {
        return active;
    }

    public void setServices(Set<String> services) {
        this.services = services;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static class Builder extends AbstractyEntityBuilder<Customer, Person.Builder> {

        public Builder(Customer entity) {
            super(entity);
        }

        public Builder services(Set services) {
            entity.services = services;
            return this;
        }

        public Builder active(boolean active) {
            entity.active = active;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return active == customer.active &&
                hashCode == customer.hashCode &&
                Objects.equals(services, customer.services);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(services, active);
        }

        this.hashCode = result;
        return result;
    }
}
