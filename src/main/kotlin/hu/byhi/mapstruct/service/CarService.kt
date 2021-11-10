package hu.byhi.mapstruct.service

import hu.byhi.mapstruct.domain.Car
import hu.byhi.mapstruct.domain.CarDto
import hu.byhi.mapstruct.mapper.CarConverter
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Service
class CarService {

    fun convertToDto(car: Car): CarDto {
        println(car)
        val converter = Mappers.getMapper(CarConverter::class.java)
        val re = converter.convertToDto(car)
        println(re)
        return re
    }
}