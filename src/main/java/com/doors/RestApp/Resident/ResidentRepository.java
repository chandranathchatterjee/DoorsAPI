package com.doors.RestApp.Resident;

import com.doors.RestApp.Resident.Resident;
import org.springframework.data.repository.CrudRepository;

public interface ResidentRepository extends CrudRepository<Resident,String> {

}
