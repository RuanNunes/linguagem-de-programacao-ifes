package com.medico.model;
import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * @author ruannunes
 * @version 1.0 20/09/2020
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MongoEntity(collection = "doctor")
public class Doctor extends PanacheMongoEntity {
    @Size(max = 100, min = 2)
    private String description;

    @Size(max = 250, min = 3)
    private String name;
    
    private Integer serviceTime;
    
    @Size(max = 250, min = 3)
    private String specialization;
    
    private Integer specializationServiceTime;
    
    private Boolean retired;

    @Schema(readOnly = true)
    private LocalDateTime createdAt;
    @Schema(readOnly = true)
    private LocalDateTime lastUpdate;

    public void updateDoctorData(final Doctor newDoctor){
        this.description = newDoctor.description;
        this.name = newDoctor.name;
        this.serviceTime = newDoctor.serviceTime;
        this.specialization = newDoctor.specialization;
        this.specializationServiceTime = newDoctor.specializationServiceTime;
        this.retired = newDoctor.retired;
        this.createdAt = newDoctor.createdAt;
        this.lastUpdate = LocalDateTime.now();
        
    }

    public static Boolean exists(Doctor entity) {
        return find("name = ?1", entity.getName()).count() > 0 ? true : false;
    }

    public static Boolean exists(Doctor entity, String id) {
        return find("name = ?1 AND id <> ?2", entity.getName(), id).count() > 0 ? true : false;
    }
}
