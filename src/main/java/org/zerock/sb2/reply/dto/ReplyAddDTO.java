package org.zerock.sb2.reply.dto;

import java.time.LocalDateTime;

import groovy.transform.builder.Builder;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@lombok.Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyAddDTO {

    @NotBlank
    private String replyText;

    @NotBlank
    private String replyer;

    @NotBlank
    private Long bno;

}
