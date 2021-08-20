package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingridient {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private BigDecimal amount;

  @OneToOne(fetch = FetchType.EAGER)
  private UnitOfMeasure uom;

  @ManyToOne
  private Recipe recipe;

}
