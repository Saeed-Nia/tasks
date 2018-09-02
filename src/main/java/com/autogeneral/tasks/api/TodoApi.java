/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.autogeneral.tasks.api;

import java.math.BigDecimal;
import com.autogeneral.tasks.model.ToDoItem;
import com.autogeneral.tasks.model.ToDoItemAddRequest;
import com.autogeneral.tasks.model.ToDoItemNotFoundError;
import com.autogeneral.tasks.model.ToDoItemUpdateRequest;
import com.autogeneral.tasks.model.ToDoItemValidationError;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-29T00:04:46.240+10:00")

@Api(value = "todo", description = "the todo API")
public interface TodoApi {

    Logger log = LoggerFactory.getLogger(TodoApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Retrieve a specific item by id", nickname = "todoIdGet", notes = "", response = ToDoItem.class, tags={ "todo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ToDoItem.class),
        @ApiResponse(code = 400, message = "Validation error", response = ToDoItemValidationError.class),
        @ApiResponse(code = 404, message = "Not Found Error", response = ToDoItemNotFoundError.class) })
    @RequestMapping(value = "/todo/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ToDoItem> todoIdGet(@ApiParam(value = "id",required=true) @PathVariable("id") BigDecimal id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"createdAt\" : \"2017-10-13T01:50:58.735Z\",  \"id\" : 42.0,  \"text\" : \"Uulwi ifis halahs gag erh'ongg w'ssh.\",  \"isCompleted\" : false}", ToDoItem.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TodoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Modify an item", nickname = "todoIdPatch", notes = "", response = ToDoItem.class, tags={ "todo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ToDoItem.class),
        @ApiResponse(code = 400, message = "Validation error", response = ToDoItemValidationError.class),
        @ApiResponse(code = 404, message = "Not Found Error", response = ToDoItemNotFoundError.class) })
    @RequestMapping(value = "/todo/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<ToDoItem> todoIdPatch(@ApiParam(value = "id",required=true) @PathVariable("id") BigDecimal id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ToDoItemUpdateRequest body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"createdAt\" : \"2017-10-13T01:50:58.735Z\",  \"id\" : 42.0,  \"text\" : \"Uulwi ifis halahs gag erh'ongg w'ssh.\",  \"isCompleted\" : false}", ToDoItem.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TodoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Create a to do item", nickname = "todoPost", notes = "", response = ToDoItem.class, tags={ "todo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ToDoItem.class),
        @ApiResponse(code = 400, message = "Validation error", response = ToDoItemValidationError.class) })
    @RequestMapping(value = "/todo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ToDoItem> todoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ToDoItemAddRequest body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"createdAt\" : \"2017-10-13T01:50:58.735Z\",  \"id\" : 42.0,  \"text\" : \"Uulwi ifis halahs gag erh'ongg w'ssh.\",  \"isCompleted\" : false}", ToDoItem.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TodoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
