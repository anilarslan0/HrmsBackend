package kodlamaio.MHRS.business.abstracts;

import java.util.List;

import kodlamaio.MHRS.entities.concretes.Job;

public interface JobService {
	List<Job> getAll();
}
