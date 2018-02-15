package com.example.yasir.gymfreak;

import java.util.ArrayList;

/**
 * Created by tushm on 14-02-2018.
 */

public class arms {
    String name;
    String Description;

    public arms(String name, String description) {
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

    public static ArrayList<arms> genRandCourses (int num) {
        ArrayList<arms> courses = new ArrayList<>(num);


        courses.add(new arms(
                " Barbell Curl",
                "The first biceps exercise to perform is barbell biceps curls, which will also allow you to overload those biceps with a heavy weight. Most trainees are slightly stronger when lifting a barbell versus a set of dumbbells, so this is a great one for maximum strength development."

        ));
        courses.add(new arms(
                "Incline Dumbbell Curl",
                "When doing this exercise, you will feel maximum tension on the biceps muscle belly, so don't be surprised if the weight is slightly lower. As long as you're pushing yourself hard, using the lower weight but maintaining proper form will be the way to go for results."

        ));
        courses.add(new arms(
                " Standing Biceps Cable Curl ",
                "If you're looking to target the deep-tissue muscle fibers, cable curls are a good bet. Since the pattern of movement is less stable with this movement, due to the constant tension provided by the cable, you will call all the stabilization muscles surrounding the biceps into play as you execute the exercise."

        ));
        courses.add(new arms(
                "SKULLCRUSHER",
                "The guys who literally wrote the book on how to optimize training with EMG-based exercise selection point to this as the best overall triceps activation exercise.1 While this move—also known as a French press or lying triceps extension—doesn't necessarily isolate the lateral or long-triceps head more than the other exercises, the arm position perpendicular to your body combines the activity of the two heads to catapult this movement to the top of the list."


        ));
        courses.add(new arms(
                "CLOSE-GRIP BENCH PRESS",
                "If you've read any of our previous best-exercise articles, like those for chest and back, then you already know that we love compound (multijoint) exercises because they're the best for muscle growth. Even though the three-headed triceps is a fairly small muscle group, there are a handful of multijoint movements that target it."

        ));


        return  courses;
    }
}
