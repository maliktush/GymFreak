package com.example.yasir.gymfreak;

import java.util.ArrayList;

/**
 * Created by tushm on 14-02-2018.
 */

public class cardio {
    String name;
    String Description;

    public cardio(String name, String description) {
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

    public static ArrayList<cardio> genRandCourses (int num) {
        ArrayList<cardio> courses = new ArrayList<>(num);


        courses.add(new cardio(
                "Kettlebells",
                "Kettlebell! It is a cannonball-shaped weight that produces a powerful, effective workout like you’ve never experienced before! Kettlebell workouts combine strength training with cardio for a complete workout. And if you want a calorie burn, look no further. These babies can help you burn up to 20 calories per minute, which is the equivalent to running a 6-minute mile. Now that’s called getting the most from your workout time!"

        ));
        courses.add(new cardio(
                "Jumping Rope",
                "One of the best cardio exercises for weight loss is jumping rope! It’s not only a calorie blaster but helps build bone density, strengthens your legs and makes your heart stronger. According to WebMd you’d have to run an eight-minute mile to work off more calories than you can burn jumping rope. Worried about the impact of jumping? Peter Schulman, MD, professor of Cardiology/Pulmonary Medicine at the University of Connecticut Health Center in Farmington says that jumping rope is something that fit adults can add to their fitness routine. Done properly it is lower impact than running."

        ));
        courses.add(new cardio(
                "Cycling ",
                "ccording to The American Council of Sports Medicine “ACSM”, an average person burns between 400-600 calories in a 45-minute class. Sound like torture? It’s actually super fun! Take riding a bike, add a room full of people, mix in some motivating music and top it off with a great instructor. Now you’ve got something fun that will push you to your limits, but in a good way. And remember—cycling is low impact!"

        ));
        courses.add(new cardio(
                "Jumping Rope",
                "One of the best cardio exercises for weight loss is jumping rope! It’s not only a calorie blaster but helps build bone density, strengthens your legs and makes your heart stronger. According to WebMd you’d have to run an eight-minute mile to work off more calories than you can burn jumping rope. Worried about the impact of jumping? Peter Schulman, MD, professor of Cardiology/Pulmonary Medicine at the University of Connecticut Health Center in Farmington says that jumping rope is something that fit adults can add to their fitness routine. Done properly it is lower impact than running."

        ));
        courses.add(new cardio(
                "Running Stairs",
                "A simple flight of stairs is about to be your new favorite workout tool. Walking, running, or lunging up a flight of stairs provides a great big calorie burn. A 150-lb person running stairs for an hour can burn 1000 calories! Wow! That’s crazy!!! Of course, it’s probably just as crazy to run stairs for an hour! But you don’t have to. Get this: A person weighing 160 lbs. will burn 102 calories walking up and down stairs for 10 minutes. That’s a lot! Even better, you can do a great cross-training workout in 30 minutes or less and burn off more than a regular running session. Look for an outdoor staircase near you that has more than one flight. If the weather is bad, use that simple flight of stairs in your home instead."

        ));


        return  courses;
    }
}
