package kodlamaio.MHRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.MHRS.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{

}
