package fr.opensagres.xdocreport.remoting.resources.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlSeeAlso;

import fr.opensagres.xdocreport.remoting.resources.domain.BinaryData;
import fr.opensagres.xdocreport.remoting.resources.domain.LargeBinaryData;
import fr.opensagres.xdocreport.remoting.resources.domain.Resource;
import fr.opensagres.xdocreport.remoting.resources.services.ResourcesException;
import fr.opensagres.xdocreport.remoting.resources.services.ResourcesService;

@Path( "/" )
public interface JAXRSResourcesService
    extends ResourcesService
{

    @GET
    @Path( "/name" )
    @Consumes( MediaType.APPLICATION_JSON )
    @Produces( MediaType.TEXT_PLAIN )
    String getName();

    @GET
    @Path( "/root" )
    @Consumes( MediaType.APPLICATION_JSON )
    @Produces( MediaType.APPLICATION_JSON )
    Resource getRoot()
        throws ResourcesException;

    @GET
    @Path( "/download/{resourceId}" )
    @Consumes( MediaType.APPLICATION_JSON )
    @Produces( MediaType.WILDCARD )
    BinaryData download( @PathParam( "resourceId" )
    String resourceId )
        throws ResourcesException;

    @POST
    @Path( "/upload" )
    //@Consumes( MediaType.APPLICATION_JSON )
    void upload( BinaryData data ) throws ResourcesException;


    @GET
    @Path( "/downloadLarge/{resourceId}" )
    @Consumes( MediaType.APPLICATION_JSON )
    @Produces( MediaType.WILDCARD )
    LargeBinaryData downloadLarge( @PathParam( "resourceId" ) String resourceId ) throws ResourcesException;

    @POST
    @Path( "/uploadLarge" )
    //@Consumes( MediaType.APPLICATION_JSON )
    void uploadLarge( LargeBinaryData data ) throws ResourcesException;


}
