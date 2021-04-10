package com.servicio.productos.models.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@Getter
@Setter
public class Producto implements Serializable {

  private static final long serialVersionUID = -5305161939946441342L;

  /** identity = autoincremental */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;
  private Double precio;

  @Column(name = "create_at")
  private LocalDate createAt;

  @Transient private Integer port;
}
