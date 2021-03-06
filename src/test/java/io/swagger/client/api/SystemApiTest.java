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
import io.swagger.client.model.CVEWhitelist;
import io.swagger.client.model.Endpoint;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
@Ignore
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    
    /**
     * Get the system level whitelist of CVE.
     *
     * Get the system level whitelist of CVE.  This API can be called by all authenticated users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemCVEWhitelistGetTest() throws ApiException {
        CVEWhitelist response = api.systemCVEWhitelistGet();

        // TODO: test validations
    }
    
    /**
     * Update the system level whitelist of CVE.
     *
     * This API overwrites the system level whitelist of CVE with the list in request body.  Only system Admin has permission to call this API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemCVEWhitelistPutTest() throws ApiException {
        CVEWhitelist whitelist = null;
        api.systemCVEWhitelistPut(whitelist);

        // TODO: test validations
    }
    
    /**
     * Test the OIDC endpoint.
     *
     * Test the OIDC endpoint, the setting of the endpoint is provided in the request.  This API can only be called by system admin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOidcPingPostTest() throws ApiException {
        Endpoint endpoint = null;
        api.systemOidcPingPost(endpoint);

        // TODO: test validations
    }
    
}
