package com.socgen.recovery.config;

import javax.inject.Singleton;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.socgen.recovery.resource.IStudentResource;
import com.socgen.recovery.resource.impl.StudentResourceImpl;
import com.socgen.recovery.service.IStudentService;
import com.socgen.recovery.service.impl.StudentServiceImpl;

public class ApplicationBinder extends AbstractBinder {

	@Override
	protected void configure() {
        // resources
        bind(StudentResourceImpl.class).to(IStudentResource.class);

        // services
        bind(StudentServiceImpl.class).to(IStudentService.class).in(Singleton.class);

        // dao
      //  bind(StudentDaoImpl.class).to(IStudentDao.class).in(Singleton.class);

	}

}
