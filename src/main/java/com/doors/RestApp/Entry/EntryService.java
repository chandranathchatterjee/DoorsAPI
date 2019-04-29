package com.doors.RestApp.Entry;

import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntryService {
    @Autowired
    private EntryRepository entryRepository;

//    private List<Entry> entrys= new ArrayList<>(Arrays.asList(
//            new Entry("001","chandranath","432"),
//                new Entry("002","Bumba","431")
//    ));

    public List<Entry> getEntrys() {
        //return entrys;
        List<Entry> entrys = new ArrayList<>();
        entryRepository.findAll().forEach(entrys::add);
        return entrys;
    }

    public Entry getentryinfo(String id){
        //return  entrys.stream().filter(r ->r.getId().equals(id)).findFirst().get();
    return entryRepository.findById(id).orElse(null);

    }

    public void addnewentry(Entry entry) {
        //entrys.add(entry);
        entryRepository.save(entry);
    }

    public void updateentry(String id,Entry entry){
//        int i =0;
//        for (i=0;i<entrys.size();i++)
//        {
//            Entry r = entrys.get(i);
//            if (r.getId().equals(id))
//            {
//                entrys.set(i,entry);
//            }
//        }
        entryRepository.save(entry);


    }
}
