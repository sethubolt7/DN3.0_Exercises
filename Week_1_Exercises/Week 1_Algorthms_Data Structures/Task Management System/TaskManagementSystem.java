public class TaskManagementSystem {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    // Method to add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to search for a task by ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Method to delete a task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        TaskManagementSystem system = new TaskManagementSystem();

        // Adding tasks
        system.addTask(new Task(1, "Design module", "Pending"));
        system.addTask(new Task(2, "Implement module", "In Progress"));
        system.addTask(new Task(3, "Test module", "Completed"));

        // Traversing tasks
        System.out.println("Task List:");
        system.traverseTasks();

        // Searching for a task
        System.out.println("Search for Task with ID 2:");
        Task task = system.searchTask(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("Deleting Task with ID 2:");
        system.deleteTask(2);
        system.traverseTasks();
    }
}
