package com.example.logging_to_file;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping("/checkup")
    public String checkup(@RequestParam(defaultValue = "Nguyen Van A") String name) {
        log.info("Bệnh nhân {} đã đăng ký khám bệnh.", name);
        log.warn("Kiểm tra hồ sơ lịch sử khám bệnh của bệnh nhân: {}", name);
        return "Đã ghi nhận lịch sử khám cho bệnh nhân: " + name;
    }
}