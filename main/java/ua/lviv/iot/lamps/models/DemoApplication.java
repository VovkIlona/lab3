package ua.lviv.iot.lamps.models;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    
  }
  
  @Bean
  public CommandLineRunner demo(LampsRepository repository) {
    return (args) -> {
        repository.save(new  Lamps(15, 122, Currency.UAH, LightSourceType.ENERGYSAVING,
                 true, Rating.AVERAGE));
        repository.save(new  Lamps(200,100, Currency.USD,LightSourceType.LED,
                  true, Rating.EXCELLENT));
      repository.save(new  Lamps(300, 200, Currency.UAH,LightSourceType.INCANDESCENCE,
                   true, Rating.EXCELLENT));

      repository.findAll().forEach(Lamps -> System.out.println(Lamps));
    };
  }
}
