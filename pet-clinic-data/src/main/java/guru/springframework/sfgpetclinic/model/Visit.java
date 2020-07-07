package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description" )
    private String descritption;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescritption() {
        return descritption;
    }

    public void setDescritption(String descritption) {
        this.descritption = descritption;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}


