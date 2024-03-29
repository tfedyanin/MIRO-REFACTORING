package miet.rooms.api.web.controller;

import miet.rooms.api.model.RoomModel;
import miet.rooms.api.service.RoomService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/by-id")
    public RoomModel getRoomByName(@RequestParam Long roomId) {
        return roomService.findAllById(roomId);
    }

    @GetMapping("all")
    public Map<Long, String> getAllRooms() throws JSONException {
        return roomService.findAll();
    }
}
