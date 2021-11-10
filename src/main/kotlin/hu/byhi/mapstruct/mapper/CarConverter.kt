package hu.byhi.mapstruct.mapper

import hu.byhi.mapstruct.domain.Car
import hu.byhi.mapstruct.domain.CarDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper
interface CarConverter {
    @Mappings(
        Mapping(source = "ownerName", target = "owner"),
        Mapping(source = "prodDate", target = "productDate")
    )
    fun convertToDto(person: Car) : CarDto

    @InheritInverseConfiguration
    fun convertToModel(carDto: CarDto) : Car
}