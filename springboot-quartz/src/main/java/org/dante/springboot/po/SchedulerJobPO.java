package org.dante.springboot.po;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "t_scheduler_job")
public class SchedulerJobPO {

	@Id
	private Long id;
	private String jobId;
	private String jobName;
	private String jobClass;
	private String jobDesc;
	private Date previousFireTime;
	private Date fireTime;
	private Date nextFireTime;
	private Date startTime;
}
