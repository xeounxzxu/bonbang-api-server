package io.gonzo.middleware.web;

import io.gonzo.middleware.service.CharterMonthlyService;
import io.gonzo.middleware.web.dto.CharterMonthlyDTO;
import io.gonzo.middleware.web.dto.CharterMonthlyStoreDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/middleware/charter-monthly")
@RequiredArgsConstructor
public class CharterMonthlyResource {

    private final CharterMonthlyService service;

    @GetMapping("")
    public List<CharterMonthlyDTO> showByCharterMonthlyList(CharterMonthlyStoreDTO dto) {
        return service.getByCharterAndMonthly(dto);
    }

}