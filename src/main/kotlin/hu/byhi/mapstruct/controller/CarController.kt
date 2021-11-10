package hu.byhi.mapstruct.controller

import hu.byhi.mapstruct.domain.Car
import hu.byhi.mapstruct.service.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder

@RestController
@RequestMapping("/api/car")
class CarController (@Autowired val carService: CarService) {

    @PostMapping()
    fun convertCarToDto(@RequestBody car: Car) = ResponseEntity.ok(carService.convertToDto(car))
}