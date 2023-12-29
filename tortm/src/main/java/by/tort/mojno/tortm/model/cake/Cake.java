package by.tort.mojno.tortm.model.cake;

import by.tort.mojno.tortm.model.common.base.entity.forsale.BaseEntityForSale;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cake extends BaseEntityForSale {

    @ManyToMany(mappedBy = "cakes")
    private List<Cream> creams = new ArrayList<>();


    @ManyToMany(mappedBy = "cakes")
    private List<Filling> fillings = new ArrayList<>();


    @ManyToMany(mappedBy = "cakes")
    private List<Decor> decors = new ArrayList<>();


    @Column
    private Boolean isHeight;

    @ManyToOne
    @JoinColumn(name = "def_cream_pid", nullable = false)
    private Cream defaultCream;

    @ManyToOne
    @JoinColumn(name = "def_filling_pid", nullable = false)
    private Filling defaultFilling;

    @ManyToOne
    @JoinColumn(name = "def_decor_pid", nullable = false)
    private Decor defaultDecor;

}
