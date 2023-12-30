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

    @ManyToMany
    @JoinTable(name = "def_cream_pid",
            joinColumns = {@JoinColumn(name = "cream_pid", referencedColumnName = "pid")},
            inverseJoinColumns = {@JoinColumn(name = "cake_pid", referencedColumnName = "pid")})
    private List<Cream> creams = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "def_filling_pid",
            joinColumns = {@JoinColumn(name = "filling_pid", referencedColumnName = "pid")},
            inverseJoinColumns = {@JoinColumn(name = "cake_pid", referencedColumnName = "pid")})
    private List<Filling> fillings = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "def_decor_pid",
            joinColumns = {@JoinColumn(name = "decor_pid", referencedColumnName = "pid")},
            inverseJoinColumns = {@JoinColumn(name = "cake_pid", referencedColumnName = "pid")})
    private List<Decor> decors = new ArrayList<>();

// fixme set to CakeOrder Entity
//    @Column
//    private Boolean isHeight;

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
