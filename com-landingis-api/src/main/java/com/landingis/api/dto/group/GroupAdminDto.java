package com.landingis.api.dto.group;

import com.landingis.api.dto.ABasicAdminDto;
import com.landingis.api.dto.permission.PermissionDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class GroupAdminDto extends ABasicAdminDto {

    @Schema(name = "name")
    private String name;
    @Schema(name = "description")
    private String description;
    @Schema(name = "kind")
    private int kind;
    @Schema(name = "permissions")
    private List<PermissionDto> permissions;
}
