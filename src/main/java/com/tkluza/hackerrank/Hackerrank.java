package com.tkluza.hackerrank;

import com.tkluza.hackerrank.tasks.Task;
import com.tkluza.hackerrank.tasks.TaskFactory;

import java.util.List;

public class Hackerrank {

    public static void main(String[] args) {

        List<Task> allTasks = TaskFactory.getAllTasks();
        allTasks.forEach(Task::test);
    }
}
