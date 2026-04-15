package com.ShapeTool.ShapeArea.endpoint;

import com.ShapeTool.ShapeArea.service.ShapeAreaService;
import com.ShapeTool.ShapeArea.generated.*;
import org.springframework.ws.server.endpoint.annotation.*;

@Endpoint
public class ShapeAreaEndpoint {

    private static final String NAMESPACE = "http://ShapeTool.com/ShapeArea";

    private final ShapeAreaService service;

    public ShapeAreaEndpoint(ShapeAreaService service) {
        this.service = service;
    }

    // ================= CIRCLE =================
    @PayloadRoot(namespace = NAMESPACE, localPart = "CircleAreaRequest")
    @ResponsePayload
    public CircleAreaResponse circle(@RequestPayload CircleAreaRequest request) {

        CircleAreaResponse response = new CircleAreaResponse();
        response.setArea(service.circle(request.getRadius()));
        return response;
    }

    // ================= SQUARE =================
    @PayloadRoot(namespace = NAMESPACE, localPart = "SquareAreaRequest")
    @ResponsePayload
    public SquareAreaResponse square(@RequestPayload SquareAreaRequest request) {

        SquareAreaResponse response = new SquareAreaResponse();
        response.setArea(service.square(request.getSide()));
        return response;
    }

    // ================= RECTANGLE =================
    @PayloadRoot(namespace = NAMESPACE, localPart = "RectangleAreaRequest")
    @ResponsePayload
    public RectangleAreaResponse rectangle(@RequestPayload RectangleAreaRequest request) {

        RectangleAreaResponse response = new RectangleAreaResponse();
        response.setArea(service.rectangle(
                request.getLength(),
                request.getWidth()
        ));
        return response;
    }

    // ================= TRIANGLE =================
    @PayloadRoot(namespace = NAMESPACE, localPart = "TriangleAreaRequest")
    @ResponsePayload
    public TriangleAreaResponse triangle(@RequestPayload TriangleAreaRequest request) {

        TriangleAreaResponse response = new TriangleAreaResponse();
        response.setArea(service.triangle(
                request.getBase(),
                request.getHeight()
        ));
        return response;
    }

    // ================= PARALLELOGRAM =================
    @PayloadRoot(namespace = NAMESPACE, localPart = "ParallelogramAreaRequest")
    @ResponsePayload
    public ParallelogramAreaResponse parallelogram(@RequestPayload ParallelogramAreaRequest request) {

        ParallelogramAreaResponse response = new ParallelogramAreaResponse();
        response.setArea(service.parallelogram(
                request.getBase(),
                request.getHeight()
        ));
        return response;
    }
}
