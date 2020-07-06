import tasks.Task;
import tasks.TaskFactory;

import java.util.List;

public class Hackerrank {

    public static void main(String[] args) {

        List<Task> allTasks = TaskFactory.getAllTasks();
        allTasks.forEach(Task::test);
    }
}
