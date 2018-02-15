package com.example.yasir.gymfreak;

import java.util.ArrayList;

/**
 * Created by tushm on 14-02-2018.
 */

public class back {
    String name;
    String Description;

    public back(String name, String description) {
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

    public static ArrayList<back> genRandCourses (int num) {
        ArrayList<back> courses = new ArrayList<>(num);


        courses.add(new back(
                " Barbell Deadlift",
                "This is technically more than a back exercise—it hits the entire posterior chain from your calves to your upper traps—but it's the absolute best for overall backside development. Technique is uber-important with the deadlift, but once you nail it, you can progress to lifting monster weights that will recruit maximum muscle, release muscle-building hormones, and help you get big."

        ));
        courses.add(new back(
                " Bent-Over Barbell Deadlift",
                "This is probably the second-best back movement in terms of sheer weight you can lift. EMG research has suggested that hitting bent-over barbell rows will work the larger muscle groups of the upper and lower back equally, making this a great overall back builder.[2] Like the deadlift, this is another technical move that requires excellent form but rewards you with a ton of muscle."

        ));
        courses.add(new back(
                "Wide-Grip Pull-Up",
                " It's always a good idea to have an overhead pulling movement in your back routine, and the pull-up is one of the best. Wide-grip pull-ups are excellent for putting emphasis on the upper lats. A closer grip may allow for a longer range of motion, but it may be possible to load the wide-grip pull-up to a greater degree because of an optimized starting joint position. The biggest challenge here for most trainers is training to failure in the right rep range for growth, which is 8-12."

        ));
        courses.add(new back(
                "Wide-Grip Seated Cable Row",
                "Just about everyone defaults to the close-grip bar on rows. If that sounds like you, you'll find using a wide grip on a lat bar a nice change of pace because it shifts some of the emphasis to the upper lats. Wide rows mimic some back machines, so don't do both in your workout unless you make some other kinds of changes, like grip or target rep range. You might even try flipping your grip—and going about shoulder-width apart—which better targets the lower lats as the elbows stay tighter to your sides."

        ));
        courses.add(new back(
                "Standing T-Bar Row",
                "We selected the T-bar row over a chest-supported version because you can pile on much more weight here, even though that typically translates into a bit of cheating through the knees and hips. For some, maintaining a flat back can be challenging, in which case the supported version is a better choice."

        ));


        return  courses;
    }
}
