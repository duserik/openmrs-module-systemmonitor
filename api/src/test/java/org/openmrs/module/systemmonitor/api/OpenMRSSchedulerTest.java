package org.openmrs.module.systemmonitor.api;

import org.junit.Ignore;
import org.openmrs.test.BaseModuleContextSensitiveTest;

@Ignore
public class OpenMRSSchedulerTest extends BaseModuleContextSensitiveTest {

	/*
	 * This is registered in the module's activator through some method headed
	 * by e.g: private static boolean registerTask(String name, String
	 * description, Class<? extends Task> clazz, long interval) {
	 */
	public void test_openmrsScheduler() {
/*
		try {
			Context.addProxyPrivilege("Manage Scheduler");

			TaskDefinition taskDef = Context.getSchedulerService().getTaskByName(name);
			if (taskDef == null) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MINUTE, 20);
				taskDef = new TaskDefinition();
				//taskDef.setTaskClass(clazz.getCanonicalName());
				taskDef.setStartOnStartup(true);
				taskDef.setRepeatInterval(interval);
				taskDef.setStarted(true);
				taskDef.setStartTime(cal.getTime());
				taskDef.setName(name);
				taskDef.setUuid(UUID.randomUUID().toString());
				taskDef.setDescription(description);
				Context.getSchedulerService().scheduleTask(taskDef);
			}

		} catch (SchedulerException ex) {
			log.warn("Unable to register task '" + name + "' with scheduler", ex);
		} finally {
			Context.removeProxyPrivilege("Manage Scheduler");
		}*/
	}
}
