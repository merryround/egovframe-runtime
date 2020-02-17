package egovframework.rte.bat.support.tasklet;

import javax.annotation.Resource;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

import egovframework.rte.bat.support.EgovResourceVariable;

public class TaskletStepResource implements Tasklet, InitializingBean {
	
	@Resource(name="egovResourceVariable")
	private EgovResourceVariable egovResourceVariable;

	  @Override
	  public void afterPropertiesSet() throws Exception {
		//Assert.notNull(directory, "directory must be set");
	  }

	  @Override
	  public RepeatStatus execute(StepContribution contribution,
	               ChunkContext chunkContext) throws Exception {
		  
		  	//System.out.println("TaskletStepResource execute START ===");
			egovResourceVariable.setVariable("VariableTEST", "VariableTEST12345");		

		return RepeatStatus.FINISHED;
	  }

	  
}
