package web.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Chai {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID" ,strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    public UUID id;
    @Version
    public long version;

    @CreationTimestamp
    @Column(updatable = false)
    public Timestamp createdDate;
    @CreationTimestamp
    public Timestamp lastModifiedDate;
    private String chaiName;
    private String chaiType;
    @Column(unique = true)
    private Long upcCode;
    private BigDecimal price;
    private  Integer minOnHand;
    private Integer quantityToBewq;
}
