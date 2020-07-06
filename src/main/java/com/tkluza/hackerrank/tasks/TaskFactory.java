package com.tkluza.hackerrank.tasks;

import com.tkluza.hackerrank.tasks.array.ArrayDS;
import com.tkluza.hackerrank.tasks.warm_up.JumpingOnTheClouds;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {

    public static List<Task> getAllArrayTasks() {
        System.out.println("Array Tasks");

        List<Task> arrayTaskList = new ArrayList<>();
        arrayTaskList.add(new ArrayDS());

        return arrayTaskList;
    }

    public static List<Task> getAllWarmUpTasks() {
        System.out.println("Warm Up Tasks");

        List<Task> warmUpTasks = new ArrayList<>();
        warmUpTasks.add(new JumpingOnTheClouds());

        return warmUpTasks;
    }
}
