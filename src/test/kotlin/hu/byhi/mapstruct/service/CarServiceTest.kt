package hu.byhi.mapstruct.service

import hu.byhi.mapstruct.domain.Car
import hu.byhi.mapstruct.domain.CarDto
import hu.byhi.mapstruct.service.CarService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime
import java.util.function.Predicate

@SpringBootTest
internal class CarServiceTest(@Autowired val carService: CarService) {

    @Test
    fun convertToDto() {
        val car = Car(ownerName = "Bob", color = "red", prodDate = LocalDateTime.now(), numberOfPersons = 4 )
        assertThat(carService.convertToDto(car).owner).isEqualTo(car.ownerName)
    }
}