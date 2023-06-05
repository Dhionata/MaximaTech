package br.com.maximatech;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(@NotNull ApplicationReadyEvent event) {
        String swaggerUrl = "http://localhost:8080/swagger-ui/index.html#/"; // Substitua pela URL correta do seu Swagger
        System.out.println("A aplicação foi inicializada com sucesso!");
        System.out.println("Acesse o Swagger em: " + swaggerUrl);
    }
}
