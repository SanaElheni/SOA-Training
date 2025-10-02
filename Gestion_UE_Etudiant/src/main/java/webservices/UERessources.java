package webservices;

import entities.UniteEnseignement;
import metiers.UniteEnseignementBusiness;

import javax.ws.rs.*;
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

    @DELETE
    @Path("/delete/{code}")
    public Response deleteUE(@PathParam("code") int code) {
        boolean deleted = helper.deleteUniteEnseignement(code); // ✅ int code
        if (deleted) return Response.ok("Deleted successfully").build();
        else return Response.status(Response.Status.NOT_FOUND).entity("UE not found").build();
    }

    @PUT
    @Path("/update/{code}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUE(@PathParam("code") int code, UniteEnseignement updatedUE) {
        boolean updated = helper.updateUniteEnseignement(code, updatedUE); // ✅ int code
        if (updated) return Response.ok(updatedUE).build();
        else return Response.status(Response.Status.NOT_FOUND).entity("UE not found").build();
    }


}
