package ru.faang.school.task_2;

import lombok.Getter;
import lombok.Setter;

public class Server {
    @Getter @Setter private double load;
    @Getter @Setter private double maxLoad;
    @Getter @Setter private double energyConsumption;
    public void addLoad(double load){
        this.load += load;
    }

    public Server(double maxLoad, double energyConsumption) {
        this.load = 0;
        this.maxLoad = maxLoad;
        this.energyConsumption = energyConsumption;
    }

    public double getFreeLoad(){
        return maxLoad - load;
    }

}
