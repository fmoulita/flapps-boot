package flapps.contoller;

import com.flapps.entity.AttendanceEntity;
import com.flapps.entity.AttendanceRepository;
import com.flapps.error.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AttendanceController {

    @Autowired
    AttendanceRepository attendanceRepository;

    @GetMapping("/user")
    List<AttendanceEntity> findAll() {
        return attendanceRepository.findAll();
    }

    @GetMapping("/user/{id}")
    AttendanceEntity findOne(@PathVariable Long id) {
        return attendanceRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    //correction Attendance
    @PatchMapping("/user/edit/{id}")
    AttendanceEntity patch(@RequestBody Map<String, String> update, @PathVariable Long id) {

        return attendanceRepository.findById(id)
                .map(x -> {

                    long clockIn = Long.parseLong(update.get("clockIn"));
                    long clockOut = Long.parseLong(update.get("clockOut"));
                    if (!StringUtils.isEmpty(clockIn) || !StringUtils.isEmpty(clockOut)) {
                        x.setClockIn(clockIn);
                        x.setClockOut(clockOut);
                        return attendanceRepository.save(x);
                    } else {
                        throw new UnsupportedOperationException(String.valueOf(update.keySet()));
                    }

                })
                .orElseGet(() -> {
                    throw new UserNotFoundException(id);
                });

    }
}
