package com.medico.model;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.Size;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/***
 * @author ruannunes
 * @version 1.0 20/09/2020
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@MongoEntity(collection = "doctor")
public class Doctor extends PanacheMongoEntity {
    @Size(max = 100, min = 2)
    private String description;

    @Size(max = 250, min = 3)
    private String name;

    private Date dateOfBirth;
    
    @Size(max = 100, min = 0)
    private Integer serviceTime;
    
    @Size(max = 250, min = 3)
    private String specialization;
    
    @Size(max = 100, min = 0)
    private Integer specializationServiceTime;
    
    private Boolean retired;

    @Schema(readOnly = true)
    private LocalDate createdAt;
    @Schema(readOnly = true)
    private LocalDate lastUpdate;

    public void updateDoctorData(final Doctor newDoctor){

    }

    public static Doctor findById(UUID id) {
        return find("id", id).firstResult();
    }

    public static Boolean exists(Doctor entity) {
        return find("name = ?1", entity.getName()).count() > 0 ? true : false;
    }

    public static Boolean exists(Doctor entity, UUID id) {
        return find("name = ?1 AND id <> ?2", entity.getName(), id).count() > 0 ? true : false;
    }
}
