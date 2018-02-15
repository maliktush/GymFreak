package com.example.yasir.gymfreak;

import java.util.ArrayList;

/**
 * Created by tushm on 14-02-2018.
 */

public class chest {
    String name;
    String Description;

    public chest(String name, String description) {
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

    public static ArrayList<chest> genRandCourses (int num) {
        ArrayList<chest> courses = new ArrayList<>(num);


            courses.add(new chest(
                    "Barbell Bench Press",
                    "You can generate the most power with barbell lifts," +
                            " so the standard barbell bench allows you to move the most weight." +
                            " It's also an easier lift to control than pressing with heavy dumbbells. " +
                            "The exercise is easy to spot and relatively easy to learn (if not master), " +
                            "There are plenty of bench-press programs you can follow to increase your strength."

            ));
        courses.add(new chest(
                "Flat Bench Dumbbell Press",
                "With dumbbells, each side of your body must work independently, " +
                        "which recruits more stabilizer muscles; " +
                        "dumbbells are harder to control than a barbell. " +
                        "Dumbbells also allow for a longer range of motion than the barbell" +
                        " bench press, both at the bottom and top of the movement. " +
                        "Flat dumbbell presses allow you to hoist a fairly heavy weight, " +
                        "and they make for a good alternative if you've been stuck on the barbell bench for ages."

        ));
        courses.add(new chest(
                "Seated Machine Chest Press ",
                "Free-weight pressing moves on a flat bench are great, " +
                        "but the machine press has some unique benefits. For one, it's easier to slow down the repetition," +
                        " both in the concentric and eccentric phases. " +
                        "Stack-loaded machines are also great for quickly doing dropsets."

        ));
        courses.add(new chest(
                "Machine Decline Press",
                " Some machines, like Hammer Strength, allow you to move each arm independently, " +
                        "which is a great feature on chest day. Besides doing a machine decline press straight on," +
                        " you can sit sideways on the apparatus and press " +
                        "across your body one arm at a time, which delivers a completely different feel than when you sit straight-on."

        ));
        courses.add(new chest(
                "Low-Incline Barbell Bench Press ",
                "Many benches are fixed at a very steep angle, " +
                        "which requires a larger contribution from the front delts" +
                        " than the chest to move the weight." +
                        " If possible, go for a less-steep incline to hit the upper pecs without as much stress on the delts. " +
                        "You can also easily do low-incline benches with an adjustable bench on the Smith machine."

        ));


        return  courses;
    }
}
