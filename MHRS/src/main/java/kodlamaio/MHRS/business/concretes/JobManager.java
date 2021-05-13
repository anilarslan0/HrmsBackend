package kodlamaio.MHRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.MHRS.business.abstracts.JobService;
import kodlamaio.MHRS.dataAccess.abstracts.JobDao;
import kodlamaio.MHRS.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return this.jobDao.findAll();
	}

}