/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.10.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Action;
import io.swagger.client.model.Action1;
import io.swagger.client.model.RetentionExecution;
import io.swagger.client.model.RetentionExecutionTask;
import io.swagger.client.model.RetentionMetadata;
import io.swagger.client.model.RetentionPolicy;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RetentionApi
 */
@Ignore
public class RetentionApiTest {

    private final RetentionApi api = new RetentionApi();

    
    /**
     * Stop a Retention job
     *
     * Stop a Retention job, only support \&quot;stop\&quot; action now.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsIdExecutionsEidPatchTest() throws ApiException {
        Long id = null;
        Long eid = null;
        Action1 action = null;
        api.retentionsIdExecutionsEidPatch(id, eid, action);

        // TODO: test validations
    }
    
    /**
     * Get Retention job tasks
     *
     * Get Retention job tasks, each repository as a task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsIdExecutionsEidTasksGetTest() throws ApiException {
        Long id = null;
        Long eid = null;
        List<RetentionExecutionTask> response = api.retentionsIdExecutionsEidTasksGet(id, eid);

        // TODO: test validations
    }
    
    /**
     * Get Retention job task log
     *
     * Get Retention job task log, tags ratain or deletion detail will be shown in a table.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsIdExecutionsEidTasksTidGetTest() throws ApiException {
        Long id = null;
        Long eid = null;
        Long tid = null;
        String response = api.retentionsIdExecutionsEidTasksTidGet(id, eid, tid);

        // TODO: test validations
    }
    
    /**
     * Get a Retention job
     *
     * Get a Retention job, job status may be delayed before job service schedule it up.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsIdExecutionsGetTest() throws ApiException {
        Long id = null;
        List<RetentionExecution> response = api.retentionsIdExecutionsGet(id);

        // TODO: test validations
    }
    
    /**
     * Trigger a Retention job
     *
     * Trigger a Retention job, if dry_run is True, nothing would be deleted actually.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsIdExecutionsPostTest() throws ApiException {
        Long id = null;
        Action action = null;
        api.retentionsIdExecutionsPost(id, action);

        // TODO: test validations
    }
    
    /**
     * Get Retention Policy
     *
     * Get Retention Policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsIdGetTest() throws ApiException {
        Long id = null;
        RetentionPolicy response = api.retentionsIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Get Retention Metadatas
     *
     * Get Retention Metadatas.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsMetadatasGetTest() throws ApiException {
        RetentionMetadata response = api.retentionsMetadatasGet();

        // TODO: test validations
    }
    
    /**
     * Create Retention Policy
     *
     * Create Retention Policy, you can reference metadatas API for the policy model. You can check project metadatas to find whether a retention policy is already binded. This method should only be called when no retention policy binded to project yet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retentionsPostTest() throws ApiException {
        RetentionPolicy policy = null;
        api.retentionsPost(policy);

        // TODO: test validations
    }
    
}
