package com.doors.RestApp.Entry;

import com.doors.RestApp.Resident.Resident;
import com.doors.RestApp.Visitor.Visitor;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class GetEntryInfo {

    @Autowired
    private EntryService entryService;


   @RequestMapping("/entries")
    public List<Entry> getentryinfo() {
        return entryService.getEntrys();
   }

   @RequestMapping ("/entries/{id}")
   public Entry getspecificentry(@PathVariable String id){
        return entryService.getentryinfo(id);

   }

   @RequestMapping(method = RequestMethod.POST,value = "/addentries")
   public void addentry(@RequestBody Entry entry,@RequestParam (value = "visitor",required = true) String v_id,@RequestParam (value = "resident",required = true) String r_id )
   {
       entry.setUid(entry.getUid());
       entry.setVisitor(new Visitor(v_id,"","",""));
       entry.setResident(new Resident(r_id,"",""));
       entry.setCheckin(LocalDateTime.now());
       entry.setCheckout(null);
       entryService.addnewentry(entry);

   }

//   @RequestMapping (method = RequestMethod.PATCH,value = "/entries/{id}")
//    public void updateentry(@RequestBody Entry entry, @PathVariable String id){
//       entryService.updateentry(id,entry);
//
//   }


    }


