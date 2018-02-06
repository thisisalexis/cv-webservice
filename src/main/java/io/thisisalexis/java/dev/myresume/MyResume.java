package io.thisisalexis.java.dev.myresume;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresume")
public class MyResume {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @Path("about-me")
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String aboutMe() {
        return "About me";
    }

    @Path("summary")
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String summary() {
        return "Summary";
    }

    @Path("education")
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String education() {
        return "education";
    }

    @Path("experience")
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String experience() {
        return "experience";
    }

    @Path("courses")
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String courses() {
        return "courses";
    }

    @Path("skills")
    @GET
    @Produces( MediaType.TEXT_PLAIN )
    public String skills() {
        return "skills";
    }
}
