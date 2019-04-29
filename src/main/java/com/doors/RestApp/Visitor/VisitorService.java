package com.doors.RestApp.Visitor;

import com.doors.RestApp.Visitor.Visitor;
import com.doors.RestApp.Visitor.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitorService {
    @Autowired
    private VisitorRepository visitorRepository;

//    private List<Visitor> visitors= new ArrayList<>(Arrays.asList(
//            new Visitor("001","chandranath","432"),
//                new Visitor("002","Bumba","431")
//    ));

    public List<Visitor> getVisitors() {
        //return visitors;
        List<Visitor> visitors = new ArrayList<>();
    visitorRepository.findAll().forEach(visitors::add);
    return visitors;
    }

    public Visitor getvisitorinfo(String id){
        //return  visitors.stream().filter(r ->r.getId().equals(id)).findFirst().get();
    return visitorRepository.findById(id).orElse(null);

    }

    public void addnewvisitor(Visitor visitor) {
        //visitors.add(visitor);
        visitorRepository.save(visitor);
    }

    public void updatevisitor(String id,Visitor visitor){
//        int i =0;
//        for (i=0;i<visitors.size();i++)
//        {
//            Visitor r = visitors.get(i);
//            if (r.getId().equals(id))
//            {
//                visitors.set(i,visitor);
//            }
//        }
        visitorRepository.save(visitor);


    }
}
