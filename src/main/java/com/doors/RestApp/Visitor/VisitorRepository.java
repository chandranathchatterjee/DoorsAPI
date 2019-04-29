package com.doors.RestApp.Visitor;

import com.doors.RestApp.Resident.Resident;
import org.springframework.data.repository.CrudRepository;

public interface VisitorRepository extends CrudRepository<Visitor,String> {

}
