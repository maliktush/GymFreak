package com.example.yasir.gymfreak;

import java.util.ArrayList;

/**
 * Created by tushm on 14-02-2018.
 */

public class shoulders {
    String name;
    String Description;

    public shoulders(String name, String description) {
        this.name = name;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public static ArrayList<shoulders> genRandCourses (int num) {
        ArrayList<shoulders> courses = new ArrayList<>(num);


        courses.add(new shoulders(
                "Barbell Push Press",
                "This press allows you to load up the most weight (or do more reps) above all other overhead pressing moves. It's considered a bit more of a whole-body movement for developing explosiveness, so you lose some of the isolation effect if you do this same movement seated."

        ));
        courses.add(new shoulders(
                " Standing Military Press (Barbell Or Dumbbell)",
                "Keep the bar just off your upper chest, and press straight overhead, stopping just short of lockout. Maintain a slight bend in your knees to absorb subtle changes in your center of gravity and relieve some of the stress on your lower back. We included both the barbell and dumbbell here. Research has shown that dumbbells elicit a greater degree of EMG activation, but this usually comes at the expense of the amount of weight lifted."

        ));
        courses.add(new shoulders(
                "Dumbbell Incline Row ",
                "Because the row appears to hit both those heads particularly well, it appears it would be a good addition to your shoulder workout. Because other types of rows weren't considered in the study, it's impossible to say whether they'd be equally as good, but there are surely a number of variations to this movement, including supported T-bar rows and standing (done bent-over) T-bar rows. To best mimic the movement done in the study, which used dumbbells, use a wide grip on the machine."

        ));
        courses.add(new shoulders(
                " Seated Overhead Dumbbell Press",
                "Switching out the barbell for dumbbells on overhead presses works each side independently, making the move more challenging and requiring more input from stabilizer muscles. Moreover, the range of motion is a bit longer as you press the weights together overhead."

        ));
        courses.add(new shoulders(
                "Seated Overhead Barbell Press",
                "When you lower the barbell to the front, notice how your upper arms no longer move directly out to your sides, an indication that the anterior delts are now picking up some of the workload. In fact, this is evident in muscle activation patterns, which demonstrate significantly greater anterior delt activation with a barbell over dumbbells. Some lifters lower the bar behind their head, which more directly stimulates the middle delts. We discourage this approach, which even many longtime lifters find painful.."

        ));


        return  courses;
    }
}
