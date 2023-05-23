package com.kardam.testproject.api;

import com.kardam.testproject.dto.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ResourceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-23T11:55:19.215386500+05:30[Asia/Calcutta]")
public interface ResourceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /resource : create Resource
     *
     * @param resource  (optional)
     * @return OK (status code 200)
     * @see ResourceApi#createResource
     */
    default ResponseEntity<Resource> createResource(Resource resource) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"resourceType\" : \"resourceType\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /resource/delete/{id} : Delete Resource By Id
     *
     * @param id Unique Id of a Resource (required)
     * @return OK (status code 200)
     * @see ResourceApi#deleteResourceById
     */
    default ResponseEntity<Void> deleteResourceById(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /resource/{id} : Get Resource By Id
     *
     * @param id Unique Id of a Resource (required)
     * @return OK (status code 200)
     * @see ResourceApi#getResourceById
     */
    default ResponseEntity<Resource> getResourceById(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"resourceType\" : \"resourceType\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /resource/update : update Resource
     *
     * @param resource  (optional)
     * @return OK (status code 200)
     * @see ResourceApi#updateResource
     */
    default ResponseEntity<Resource> updateResource(Resource resource) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"resourceType\" : \"resourceType\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
