package uz.colibri.os_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")
public class MainController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("requests")
    public ResponseEntity<List<Map<String,Object>>> requestsAll(@RequestBody UserModel userModel){
        System.out.println(userModel);
        if (userModel.validate()){
            return ResponseEntity.ok(jdbcTemplate.queryForList("select * from requests"));
        }
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(Collections.emptyList());
    }
}
