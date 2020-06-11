package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "pets")
public class Pet /*extends BaseEntity*/{

  //  @Builder
  /*  public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate, Set<Visit> visits) {
        //super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;

        if (visits == null || visits.size() > 0 ) {
            //this.visits = visits;
        }
    }*/

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    public Pet() {
    }

    //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
   // private Set<Visit> visits = new HashSet<>();

}