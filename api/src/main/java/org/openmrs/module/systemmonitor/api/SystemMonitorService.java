/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.systemmonitor.api;

import java.util.Date;

import org.json.JSONObject;
import org.openmrs.Person;
import org.openmrs.api.OpenmrsService;
import org.springframework.transaction.annotation.Transactional;

/**
 * This service exposes module's core functionality. It is a Spring managed bean
 * which is configured in moduleApplicationContext.xml.
 * <p>
 * It can be accessed only via Context:<br>
 * <code>
 * Context.getService(SystemMonitorService.class).someMethod();
 * </code>
 * 
 * @see org.openmrs.api.context.Context
 */
@Transactional
public interface SystemMonitorService extends OpenmrsService {

	Date getThisWeekEndDate();

	Date getThisWeekStartDate();

	Date getToday();

	Date getLastWeekStartDate();

	Date getLastYearEndDate();

	Date getLastYearStartDate();

	Date getThisYearEndDate();

	Date getThisYearStartDate();

	Date getLastMonthEndDate();

	Date getLastMonthStartDate();

	Date getThisMonthEndDate();

	Date getThisMonthStartDate();

	Date getLastWeekEndDate();

	Integer getTotalPatientsToday(Boolean includeRetired);

	Integer getTotalVisitsToday(Boolean includeRetired);

	Integer getTotalObservationsToday(Boolean includeRetired);

	Integer getTotalUsersToday(Boolean includeRetired);

	Integer getTotalEncountersToday(Boolean includeRetired);

	Integer getTotalEncountersThisWeek(Boolean includeRetired);

	Integer getTotalEncountersLastWeek(Boolean includeRetired);

	Integer getTotalEncountersLastMonth(Boolean includeRetired);

	Integer getTotalEncountersThisMonth(Boolean includeRetired);

	Integer getTotalEncountersThisYear(Boolean includeRetired);

	Integer getTotalEncountersLastYear(Boolean includeRetired);

	Integer getTotalUsersThisWeek(Boolean includeRetired);

	Integer getTotalUsersLastWeek(Boolean includeRetired);

	Integer getTotalUsersLastMonth(Boolean includeRetired);

	Integer getTotalUsersThisMonth(Boolean includeRetired);

	Integer getTotalUsersThisYear(Boolean includeRetired);

	Integer getTotalUsersLastYear(Boolean includeRetired);

	Integer getTotalObservationsThisWeek(Boolean includeRetired);

	Integer getTotalObservationsLastWeek(Boolean includeRetired);

	Integer getTotalObservationsLastMonth(Boolean includeRetired);

	Integer getTotalObservationsThisMonth(Boolean includeRetired);

	Integer getTotalObservationsThisYear(Boolean includeRetired);

	Integer getTotalObservationsLastYear(Boolean includeRetired);

	Integer getTotalVisitsThisWeek(Boolean includeRetired);

	Integer getTotalVisitsLastWeek(Boolean includeRetired);

	Integer getTotalVisitsThisMonth(Boolean includeRetired);

	Integer getTotalVisitsLastMonth(Boolean includeRetired);

	Integer getTotalVisitsThisYear(Boolean includeRetired);

	Integer getTotalVisitsLastYear(Boolean includeRetired);

	Integer getTotalPatientsThisWeek(Boolean includeRetired);

	Integer getTotalPatientsLastWeek(Boolean includeRetired);

	Integer getTotalPatientsLastMonth(Boolean includeRetired);

	Integer getTotalPatientsThisMonth(Boolean includeRetired);

	Integer getTotalPatientsThisYear(Boolean includeRetired);

	Integer getTotalPatientsLastYear(Boolean includeRetired);

	Integer getTotalLocationsToday(Boolean includeRetired);

	Integer getTotalLocationsThisWeek(Boolean includeRetired);

	Integer getTotalLocationsLastWeek(Boolean includeRetired);

	Integer getTotalLocationsLastMonth(Boolean includeRetired);

	Integer getTotalLocationsThisMonth(Boolean includeRetired);

	Integer getTotalLocationsThisYear(Boolean includeRetired);

	Integer getTotalLocationsLastYear(Boolean includeRetired);

	Integer getTotalConceptsLastYear(Boolean includeRetired);

	Integer getTotalConceptsToday(Boolean includeRetired);

	Integer getTotalConceptsThisWeek(Boolean includeRetired);

	Integer getTotalConceptsLastWeek(Boolean includeRetired);

	Integer getTotalConceptsLastMonth(Boolean includeRetired);

	Integer getTotalConceptsThisMonth(Boolean includeRetired);

	Integer getTotalConceptsThisYear(Boolean includeRetired);

	Integer getTotalFormsLastYear(Boolean includeRetired);

	Integer getTotalFormsToday(Boolean includeRetired);

	Integer getTotalFormsThisWeek(Boolean includeRetired);

	Integer getTotalFormsLastWeek(Boolean includeRetired);

	Integer getTotalFormsLastMonth(Boolean includeRetired);

	Integer getTotalFormsThisMonth(Boolean includeRetired);

	Integer getTotalFormsThisYear(Boolean includeRetired);

	Integer getTotalOrdersLastYear(Boolean includeRetired);

	Integer getTotalOrdersToday(Boolean includeRetired);

	Integer getTotalOrdersThisWeek(Boolean includeRetired);

	Integer getTotalOrdersLastWeek(Boolean includeRetired);

	Integer getTotalOrdersLastMonth(Boolean includeRetired);

	Integer getTotalOrdersThisMonth(Boolean includeRetired);

	Integer getTotalProvidersLastYear(Boolean includeRetired);

	Integer getTotalProvidersToday(Boolean includeRetired);

	Integer getTotalProvidersThisWeek(Boolean includeRetired);

	Integer getTotalProvidersLastWeek(Boolean includeRetired);

	Integer getTotalProvidersLastMonth(Boolean includeRetired);

	Integer getTotalProvidersThisMonth(Boolean includeRetired);

	Integer getTotalProvidersThisYear(Boolean includeRetired);

	Integer getTotalOrdersThisYear(Boolean includeRetired);

	Integer getTotalEncounters(Boolean includeRetired);

	Integer getTotalUsers(Boolean includeRetired);

	Integer getTotalObservations(Boolean includeRetired);

	Integer getTotalVisits(Boolean includeRetired);

	Integer getTotalPatients(Boolean includeRetired);

	Integer getTotalLocations(Boolean includeRetired);

	Integer getTotalConcepts(Boolean includeRetired);

	Integer getTotalForms(Boolean includeRetired);

	Integer getTotalOrders(Boolean includeRetired);

	Integer getTotalProviders(Boolean includeRetired);

	Integer getTotalViralLoadTestsEver();

	Integer getTotalViralLoadTestsLastSixMonths();

	Integer getTotalViralLoadTestsLastYear();

	Integer rwandaPIHEMTGetTotalVisits();

	Integer rwandaPIHEMTGetTotalActivePatients();

	Integer rwandaPIHEMTGetTotalNewPatients();

	Integer rwandaPIHEMTGetTotalEncounters();

	Integer rwandaPIHEMTGetTotalObservations();

	Date getOneYearBackDate();

	Integer rwandaPIHEMTGetTotalUsers();

	Person[] getAllPersonsWhoArePatients();

	Date getOneHalfYearBackDate();

	void transferMappingsFileToDataDirectory();

	String getCurrentConfiguredDHISOrgUnit();

	String getCurrentConfiguredDHISUsername();

	String getCurrentConfiguredDHISPassword();

	JSONObject getInstalledModules();
}