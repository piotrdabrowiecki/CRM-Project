package pl.coderslab.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.model.Priority;
import pl.coderslab.model.User;


import java.util.List;

public interface PriorityRepository extends JpaRepository<Priority, Long> {












}