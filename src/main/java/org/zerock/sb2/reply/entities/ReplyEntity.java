package org.zerock.sb2.reply.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EntityListeners(value = AuditingEntityListener.class)
@Entity
@Table(name = "tbl_reply")
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyEntity {
    
}
