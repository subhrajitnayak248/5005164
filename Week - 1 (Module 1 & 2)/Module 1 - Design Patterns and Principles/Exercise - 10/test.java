public class test {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("Subhrajit Nayak", 1, "A");

        // Create a StudentView
        StudentView view = new StudentView();

        // Create a StudentController
        StudentController controller = new StudentController(student, view);

        // Update the view with current student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Swayam Prakash Sahoo");
        controller.setStudentGrade("B");

        // Update the view again with updated student details
        controller.updateView();
    }
}
