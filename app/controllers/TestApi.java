package controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import play.libs.Json;
import play.mvc.Result;

import javax.ws.rs.PathParam;

import static play.mvc.Results.ok;

@Api(value = "/entity", description = "Get entity meta-data")
public class TestApi extends SwaggerBaseApiController {

    @ApiOperation(value="Get entity by id")
    static public Result entity(
            @ApiParam(value = "ID of the entity to fetch") @PathParam("id") long id
    ) {
        return ok(Json.toJson("Test " + String.valueOf(id)));
    }

}
