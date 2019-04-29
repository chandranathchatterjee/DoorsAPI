package com.doors.RestApp.Visitor;

import com.doors.RestApp.Visitor.Visitor;
import com.doors.RestApp.Visitor.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetVisitorInfo {

    @Autowired
    private VisitorService visitorService;

    @RequestMapping("/vgreeting")
    public String getname(){
        return "Hello Visitor";
    }
   @RequestMapping("/visitors")
    public List<Visitor> getvisitorinfo() {
        return visitorService.getVisitors();
   }

   @RequestMapping ("/visitors/{id}")
   public Visitor  getspecificvisitor(@PathVariable String id){
        return visitorService.getvisitorinfo(id);

   }

   @RequestMapping(method = RequestMethod.POST,value = "/visitors")
   public void addvisitor(@RequestBody Visitor visitor){
        visitorService.addnewvisitor(visitor);

   }
   @RequestMapping (method = RequestMethod.PUT,value = "/visitors/{id}")
    public void updatevisitor(@RequestBody Visitor visitor,@PathVariable String id){
       visitorService.updatevisitor(id, visitor);

   }

    }


