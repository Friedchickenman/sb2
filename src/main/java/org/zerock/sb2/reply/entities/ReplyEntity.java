package org.zerock.sb2.reply.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.zerock.sb2.board.entities.BoardEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EntityListeners(value = AuditingEntityListener.class)
@Entity
@Table(name = "tbl_reply"  , indexes = {
    @Index(name = "idx_board", columnList = "board_bno")
  })
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String replyText;

    private String replyer;

    @ManyToOne
    private BoardEntity board;

    @CreatedDate
  @Column(name = "regdate", updatable = false)
  protected LocalDateTime regDate;

  @LastModifiedDate
  @Column(name ="moddate" )
  protected LocalDateTime modDate;
}
