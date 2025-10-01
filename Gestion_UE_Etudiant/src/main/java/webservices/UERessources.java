package webservices;

import entities.UniteEnseignement;
import metiers.UniteEnseignementBusiness;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/ue")
public class UERessources {
    //instance ==> object
    UniteEnseignementBusiness helper = new UniteEnseignementBusiness();
@Path("/list")
@GET
@Produces(MediaType.APPLICATION_JSON)
    public Response getList(){
        return Response
                .status(200)
                .entity(this.helper.getListeUE())
                .build();
    }

    @Path("/code/{code}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Response getByCode(@PathParam("code")int code){
        return Response
                .status(200)
                .entity(this.helper.getUEByCode(code))
                .build();
    }


    @Path("/add")
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Response add( UniteEnseignement ue){
        return Response
                .status(200)
                .entity(this.helper.addUniteEnseignement(ue))
                .build();
    }
}
