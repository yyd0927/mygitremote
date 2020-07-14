package pojo;

import lombok.*;

@Data
@Getter
@Setter

public class TOrderEntity {
 private Long id ;
 private String name ;
 private Double price ;
 private String dbSource ;
}
