package com.doors.RestApp.Resident;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetResidentInfo {

    @Autowired
    private ResidentService residentService;

    @RequestMapping("/greeting")
    public String getname(){
        return "Hello User";
    }
   @RequestMapping("/residents")
    public List<Resident> getresidentinfo() {
        return residentService.getResidents();
   }

   @RequestMapping ("/residents/{id}")
   public Resident  getspecificresident(@PathVariable String id){
        return residentService.getresidentinfo(id);

   }

   @RequestMapping(method = RequestMethod.POST,value = "/residents")
   public void addresident(@RequestBody Resident resident){
        residentService.addnewresident(resident);

   }
   @RequestMapping (method = RequestMethod.PUT,value = "/residents/{id}")
    public void updateresident(@RequestBody Resident resident,@PathVariable String id){
       residentService.updateresident(id, resident);

   }

    }


