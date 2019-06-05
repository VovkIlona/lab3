package ua.lviv.iot.lamps.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface LampsRepository 
            extends CrudRepository<Lamps, Integer> {


}
