package com.netcracker.edu.nc2019team2.delivery.controller;

import com.netcracker.edu.nc2019team2.delivery.database.entity.Client;
import com.netcracker.edu.nc2019team2.delivery.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    ClientService clientService;

    @GetMapping("/users")
    public Client getUser(@RequestParam(value = "id", defaultValue = "1") String id) {
        return clientService.getClientByID(id);
    }

    /*@RequestMapping("/getUser")
    public Client getUser(@RequestParam(value = "id", defaultValue = "1") String id) {
        return clientService.getClientByID(id);
    }*/
    @RequestMapping("/getListUser")
    public List<Client> getListUser(@RequestParam(value ="from", defaultValue = "1") String from,
                                    @RequestParam(value ="to", defaultValue = "1") String to){
         return clientService.getFirstNumberUser(from,to);
    }

    @PostMapping("/users")
    public void createUser(@RequestParam(value ="id") String id,
                           @RequestParam(value ="name") String name){
        clientService.createClient(name, id);
    }
   /* @RequestMapping("/createUser")
    public void createUser(@RequestParam(value ="id") String id,
                           @RequestParam(value ="name") String name){
        clientService.createClient(name, id);
    }*/

    @RequestMapping("/updateUser")
    public void updateUser(@RequestParam(value ="id") String id,
                           @RequestParam(value ="name") String name){
        clientService.updateClient(name,id);
    }
    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestParam(value ="id") String id){
        clientService.deleteClient(id);
    }
}
