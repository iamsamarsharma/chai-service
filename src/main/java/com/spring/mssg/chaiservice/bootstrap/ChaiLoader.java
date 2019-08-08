package com.spring.mssg.chaiservice.bootstrap;

import com.spring.mssg.chaiservice.domain.Chai;
import com.spring.mssg.chaiservice.repository.ChaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class ChaiLoader implements CommandLineRunner {

    private  final ChaiRepository chaiRepository;

    public ChaiLoader(ChaiRepository chaiRepository) {
        this.chaiRepository = chaiRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadChaiObject();
    }

    private  void loadChaiObject() {
        if (chaiRepository.count()==0){
            chaiRepository.save(Chai.builder()
                    .chaiName("Kangra Black Tea")
                    .chaiType("BLACK")
                    .quantityToBrew(666)
                    .upcCode(986754l)
                    .price(new BigDecimal("999.9"))
                    .minOnHand(23000)
                    .build());

            chaiRepository.save(Chai.builder()
                    .chaiName("Kangra Red Tea")
                    .chaiType("Red")
                    .quantityToBrew(66)
                    .upcCode(8697L)
                    .price(new BigDecimal("899.9"))
                    .minOnHand(2300)
                    .build());
        }
        }
    }
}
