package talbn1.petclinic.model;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person{

    //many to many is defult set to lazy that means that the data will read any needed time
    //eager means that it will upload the data to the memory all at once

    @JoinTable(name = "vet_specialities_id" ,joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Speciality> specialities = new HashSet<>();

}
