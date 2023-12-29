package by.tort.mojno.tortm.model.cake;

import by.tort.mojno.tortm.model.common.base.entity.forsale.BaseEntityForSaleByParentWeight;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Filling extends BaseEntityForSaleByParentWeight {

    @ManyToMany
    @JoinTable(name = "cake_filling",
            joinColumns = {@JoinColumn(name = "cake_pid", referencedColumnName = "pid")},
            inverseJoinColumns = {@JoinColumn(name = "filling_pid", referencedColumnName = "pid")})
    private List<Cake> cakes = new ArrayList<>();

}
