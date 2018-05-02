package com.socgen.recovery.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.socgen.recovery.resource.data.Student;

@Path("student")
public interface IStudentResource {

    /**
    * Method handling HTTP GET requests. The returned object will be sent to
    * the client as "text/plain" media type.
    * 
     * @return String that will be returned as a text/plain response.
    */
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String testResource();

    /**
    * Method handling HTTP GET requests. The returned object will be sent to
    * the client as "application/json" media type.
    * 
     * @return Student that will be returned as a application/json response.
    */
    @GET
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    // @JSONP
    public Student getStudent(@PathParam("name") String name);

    /**
    * Method handling HTTP GET requests. The returned object will be sent to
    * the client as "application/json" media type.
    * 
     * @return Student that will be returned as a application/json response.
    */
    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("id") Integer id);

    /**
    * Method handling HTTP POST requests. Consumed object will be converted to
    * "application/json" media type.
    * 
     * @return Response
    */
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createStudent(Student student);

    /**
    * Method handling HTTP GET requests. The returned object will be sent to
    * the client as "application/json" media type.
    * 
     * @return Student list that will be returned as a application/json
    *         response.
    */
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudentDetailsList();

    /**
    * Method handling HTTP GET requests. The returned object will be sent to
    * the client as "application/json" media type.
    * 
     * @return Student array that will be returned as a application/json
    *         response.
    */
    @GET
    @Path("/array")
    @Produces(MediaType.APPLICATION_JSON)
    public Student[] getStudentDetailsArray();
}
