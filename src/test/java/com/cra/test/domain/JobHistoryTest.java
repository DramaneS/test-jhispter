package com.cra.test.domain;

import static com.cra.test.domain.DepartmentTestSamples.*;
import static com.cra.test.domain.EmployeeTestSamples.*;
import static com.cra.test.domain.JobHistoryTestSamples.*;
import static com.cra.test.domain.JobTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.cra.test.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class JobHistoryTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(JobHistory.class);
        JobHistory jobHistory1 = getJobHistorySample1();
        JobHistory jobHistory2 = new JobHistory();
        assertThat(jobHistory1).isNotEqualTo(jobHistory2);

        jobHistory2.setId(jobHistory1.getId());
        assertThat(jobHistory1).isEqualTo(jobHistory2);

        jobHistory2 = getJobHistorySample2();
        assertThat(jobHistory1).isNotEqualTo(jobHistory2);
    }

    @Test
    void jobTest() {
        JobHistory jobHistory = getJobHistoryRandomSampleGenerator();
        Job jobBack = getJobRandomSampleGenerator();

        jobHistory.setJob(jobBack);
        assertThat(jobHistory.getJob()).isEqualTo(jobBack);

        jobHistory.job(null);
        assertThat(jobHistory.getJob()).isNull();
    }

    @Test
    void departmentTest() {
        JobHistory jobHistory = getJobHistoryRandomSampleGenerator();
        Department departmentBack = getDepartmentRandomSampleGenerator();

        jobHistory.setDepartment(departmentBack);
        assertThat(jobHistory.getDepartment()).isEqualTo(departmentBack);

        jobHistory.department(null);
        assertThat(jobHistory.getDepartment()).isNull();
    }

    @Test
    void employeeTest() {
        JobHistory jobHistory = getJobHistoryRandomSampleGenerator();
        Employee employeeBack = getEmployeeRandomSampleGenerator();

        jobHistory.setEmployee(employeeBack);
        assertThat(jobHistory.getEmployee()).isEqualTo(employeeBack);

        jobHistory.employee(null);
        assertThat(jobHistory.getEmployee()).isNull();
    }
}
