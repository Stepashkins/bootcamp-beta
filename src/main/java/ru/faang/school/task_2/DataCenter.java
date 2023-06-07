package ru.faang.school.task_2;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {
    private List<Server> servers = new ArrayList<>();

    public List<Server> getServers() {
        return servers;
    }

    public void setListOfServers(List<Server> servers) {
        this.servers = servers;
    }

}
