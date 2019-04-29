package com.doors.RestApp.Resident;

import com.doors.RestApp.Resident.Resident;
import com.doors.RestApp.Resident.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentService {
    @Autowired
    private ResidentRepository residentRepository;

//    private List<Resident> residents= new ArrayList<>(Arrays.asList(
//            new Resident("001","chandranath","432"),
//                new Resident("002","Bumba","431")
//    ));

    public List<Resident> getResidents() {
        //return residents;
        List<Resident> residents = new ArrayList<>();
    residentRepository.findAll().forEach(residents::add);
    return residents;
    }

    public Resident getresidentinfo(String id){
        //return  residents.stream().filter(r ->r.getId().equals(id)).findFirst().get();
    return residentRepository.findById(id).orElse(null);

    }

    public void addnewresident(Resident resident) {
        //residents.add(resident);
        residentRepository.save(resident);
    }

    public void updateresident(String id,Resident resident){
//        int i =0;
//        for (i=0;i<residents.size();i++)
//        {
//            Resident r = residents.get(i);
//            if (r.getId().equals(id))
//            {
//                residents.set(i,resident);
//            }
//        }
        residentRepository.save(resident);


    }
}
