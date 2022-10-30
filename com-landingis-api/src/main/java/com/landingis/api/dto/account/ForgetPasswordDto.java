package com.landingis.api.dto.account;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ForgetPasswordDto {
    @Schema(name = "idHash")
    private String idHash;
}
