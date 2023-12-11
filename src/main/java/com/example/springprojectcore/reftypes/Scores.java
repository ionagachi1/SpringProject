package com.example.springprojectcore.reftypes;

public class Scores {
    private Double maths;
    private Double physics;
    private double chemistry;

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
