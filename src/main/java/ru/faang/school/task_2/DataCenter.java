package ru.faang.school.task_2;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class DataCenter {
    private Map<String,Server> allServers = new HashMap<>();


}
