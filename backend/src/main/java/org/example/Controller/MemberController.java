package org.example.Controller;

import org.example.DTO.ChatUserDTO;
import org.example.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    MemberService ser;

    @PostMapping("/insert")
    public ResponseEntity<Map<String,String>> register(@RequestBody ChatUserDTO user){
        Map<String,String> map = new HashMap<>();
        ResponseEntity<Map<String,String>> res = null;
        try{
            ser.insert(user);
            map.put("msg","success");
            res = new ResponseEntity<>(map,HttpStatus.OK);
        }catch(Exception e){
            map.put("msg","fail");
            res = new ResponseEntity<>(map, HttpStatus.NOT_ACCEPTABLE);
        }

        return res;
    }

    @PostMapping("/seletone")
    public ResponseEntity<Map<String,String>> seletOne(@RequestBody ChatUserDTO user) {
        Map<String,String> map = new HashMap<>();
        ResponseEntity<Map<String,String>> res = null;
        try{
            ser.selectOne(user.getNum());
            map.put("msg","success");
            res = new ResponseEntity<>(map,HttpStatus.OK);
        }catch(Exception e){
            map.put("msg","fail");
            res = new ResponseEntity<>(map, HttpStatus.NOT_ACCEPTABLE);
        }

        return res;
    }

    @PostMapping("/update")
    public ResponseEntity<Map<String,String>> update(@RequestBody ChatUserDTO user){
        Map<String,String> map = new HashMap<>();
        ResponseEntity<Map<String,String>> res = null;
        try{
            ser.update(user);
            map.put("msg","success");
            res = new ResponseEntity<>(map,HttpStatus.OK);
        }catch(Exception e){
            map.put("msg","fail");
            res = new ResponseEntity<>(map, HttpStatus.NOT_ACCEPTABLE);
        }

        return res;
    }

    @PostMapping("/delete")
    public ResponseEntity<Map<String,String>> delete(@RequestBody ChatUserDTO user) {
        Map<String,String> map = new HashMap<>();
        ResponseEntity<Map<String,String>> res = null;
        try{
            ser.delete(user.getNum());
            map.put("msg","success");
            res = new ResponseEntity<>(map,HttpStatus.OK);
        }catch(Exception e){
            map.put("msg","fail");
            res = new ResponseEntity<>(map, HttpStatus.NOT_ACCEPTABLE);
        }

        return res;
    }

}
