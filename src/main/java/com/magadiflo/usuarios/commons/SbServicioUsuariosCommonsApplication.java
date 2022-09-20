package com.magadiflo.usuarios.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class }) //Excluimos la autoconfiguración de Spring Data JPA ya que por defecto pedirá una conexión
public class SbServicioUsuariosCommonsApplication {

}
