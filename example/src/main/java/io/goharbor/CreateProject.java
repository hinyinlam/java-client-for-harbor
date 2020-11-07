package io.goharbor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.goharbor.client.openapi.ApiClient;
import io.goharbor.client.openapi.ApiException;
import io.goharbor.client.openapi.apis.ProjectApi;
import io.goharbor.client.openapi.models.Errors;
import io.goharbor.client.openapi.models.ProjectReq;

public class CreateProject {

    public static void main(String[] args) throws JsonProcessingException {
        ApiClient client = new ApiClient();
        client.setUsername("username");
        client.setPassword("password");
        client.setBasePath("https://demo.goharbor.io/api/v2.0");

        ProjectApi api = new ProjectApi(client);
        ProjectReq projectReq = new ProjectReq();
        projectReq.setProjectName("hinlam-java-client-project");
        projectReq.setPublic(false);
        try {
            api.createProject(projectReq, "1234");
        }catch (ApiException exception){
            ObjectMapper mapper = new ObjectMapper();
            Errors errors = mapper.readValue(exception.getResponseBody(),Errors.class);
            errors.getErrors().stream().forEach(System.out::println);
        }
    }
}
