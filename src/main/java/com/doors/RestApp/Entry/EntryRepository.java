package com.doors.RestApp.Entry;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends CrudRepository<Entry,String> {

    // public List<Entry> findbyResidentid (String id);
}
