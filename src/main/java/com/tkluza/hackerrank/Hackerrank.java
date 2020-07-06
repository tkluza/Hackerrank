package com.tkluza.hackerrank;


import com.tkluza.hackerrank.tasks.Task;
import com.tkluza.hackerrank.tasks.TaskFactory;

import java.util.List;

public class Hackerrank {

    public static void main(String[] args) {

        List<Task> warmUpTasks = TaskFactory.getAllWarmUpTasks();
        warmUpTasks.forEach(Task::test);

        List<Task> arrayTasks = TaskFactory.getAllArrayTasks();
        arrayTasks.forEach(Task::test);
    }
}
