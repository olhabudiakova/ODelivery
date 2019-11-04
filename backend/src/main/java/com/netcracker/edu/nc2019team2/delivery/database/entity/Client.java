package com.netcracker.edu.nc2019team2.delivery.database.entity;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.annotation.Generated;
import java.util.Date;
@EntityScan
public class Client extends Person {
    @Id
    private String defaultLocation;
    private Date registrationDate;

    public Client(int parseUnsignedInt, String name) {
        super();
    }

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
