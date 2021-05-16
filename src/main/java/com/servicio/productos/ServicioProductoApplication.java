package com.servicio.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
/**
 * Para decirle donde tiene que buscar la clase producto
 *
 * @author Pablo
 */
@EntityScan({"com.servicio.commons.models.entity"})
public class ServicioProductoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServicioProductoApplication.class, args);
  }
}
