package com.example.yasir.gymfreak;

import java.util.ArrayList;

/**
 * Created by tushm on 14-02-2018.
 */

public class legs {
    String name;
    String Description;

    public legs(String name, String description) {
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

    public static ArrayList<legs> genRandCourses (int num) {
        ArrayList<legs> courses = new ArrayList<>(num);


        courses.add(new legs(
                " Squat (High And Low Bar)",
                "Squats are king because they're simply the most challenging leg movement you can do, especially when loaded appropriately. They work all the lower-body musculature (we're counting glutes), and have been shown to spike muscle-building hormone release. In fact, we even know that squatting before doing curls has been shown to significantly improve arm strength!"

        ));
        courses.add(new legs(
                "Olympic Lifts: Snatch And Power Clean",
                "Movements like snatches and power cleans take some serious dedication and technique to master, but they can be unrivaled when you are trying to improve jumping power or squat strength. In fact, one scientific study found a nearly 18-percent greater improvement in squat 1RM after following an Olympic-based program compared to a traditional powerlifting program."

        ));
        courses.add(new legs(
                " Dumbbell Lunge",
                "Like all the movements listed thus far, multijoint lunges require hip and knee extension, which gives you the stimulus for the thighs and glutes. They can be done standing in place, or stepping forward or backward—decide for yourself which subtle variation you prefer. You can also choose between a barbell and dumbbells.\n" +
                        "\n" +
                        "We slightly prefer the latter because of the ease of getting into and out of the start position and the decreased likelihood of knocking something down when doing the walking version down the weight-room floor."

        ));
        courses.add(new legs(
                "Leg Press",
                "For those of you hoping leg presses could replace squats in your leg workout, the divide between the two movements can't be overstated. Because the leg press recruits less muscle mass than squats, it simply doesn't generate the same degree of testosterone release.[6] Nor is the body position here particularly functional, unless your log cabin collapses and your only way out is pushing the timber forward."

        ));
        courses.add(new legs(
                "Romanian Deadlift",
                "This upper hamstrings/glute exercise is unlike most others because you can really overload it. Plus, most hamstring routines focus on leg-curl movements, which center around the knee joint, but this one works from the hip joint. It's vastly underutilized in most trainees' workouts, another reason we believe it's a good fit."

        ));


        return  courses;
    }
}
