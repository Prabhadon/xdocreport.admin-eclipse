package fr.opensagres.xdocreport.remoting.resources.services.ws.client;

import fr.opensagres.xdocreport.remoting.resources.services.ws.JAXWSResourcesService;

public class JAXWSResourcesServiceClientFactory
{

    public static JAXWSResourcesService create( String baseAddress )
    {
        return new JAXWSResourcesServiceClient( baseAddress, null, null, null, null );
    }

    public static JAXWSResourcesService create( String baseAddress, String user, String password, Long connectionTimeout,
                                           Boolean allowChunking )
    {
        return new JAXWSResourcesServiceClient( baseAddress, user, password, connectionTimeout, allowChunking );
    }
}
