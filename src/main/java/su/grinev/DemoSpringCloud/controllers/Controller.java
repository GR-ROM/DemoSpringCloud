package su.grinev.DemoSpringCloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import su.grinev.DemoSpringCloud.models.ResponseValue;
import su.grinev.DemoSpringCloud.services.Value;

@RestController
public class Controller {

    private Value value;

    public Controller(
            @Autowired
            Value value) {
        this.value=value;
    }

    @GetMapping(path="/value",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getValue(){
        return new ResponseEntity<ResponseValue>(new ResponseValue(value.getValue()), HttpStatus.OK);
    }

}
