package com.netcracker.edu.nc2019team2.delivery.database.entity;

import java.math.BigDecimal;
import java.util.HashMap;

public class Restaurant extends Entity{
    private boolean status;
    private String location;
    private HashMap<Item, BigDecimal> menu;
}
