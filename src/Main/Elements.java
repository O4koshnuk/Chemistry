package Main;

class Elements {
    private int atomic_number;
    private double atomic_mass;
    private long round_atomic_mass;

    private int protons;
    private int neutrons;
    private int electrons;

    public Elements(int atomic_number, float atomic_mass) {
        this.atomic_number = atomic_number;
        this.atomic_mass = atomic_mass;
        round_atomic_mass = Math.round(atomic_mass);
        protons = atomic_number;
        neutrons = (int) (round_atomic_mass - atomic_number);
        electrons = protons; // количество протонов равно количеству электронов
    }

    double getAtomic_mass() {
        return atomic_mass;
    }

    int getAtomic_number() {
        return atomic_number;
    }

    int getRound_atomic_mass() {
        return (int) round_atomic_mass;
    }

    int getProtons() {
        return protons;
    }

    int getNeutrons() {
        return neutrons;
    }

    int getElectrons() {
        return electrons;
    }

}
