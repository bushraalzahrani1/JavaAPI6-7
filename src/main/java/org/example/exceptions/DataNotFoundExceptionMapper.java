package org.example.exceptions;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import org.example.DTO.ErrorMessage;



public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException exception) {
        ErrorMessage err = new ErrorMessage();
        err.setErrorContent(exception.getMessage());
        err.setErrorCode(404);
        err.setDocumentationUrl("https://google.com");

        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(err)
                .build();
    }


}
