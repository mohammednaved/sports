package com.demoapp.sport.utils;

import com.demoapp.sport.data.remote.Team;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class AppUtils {
    /**
     * Provides the league history in the string format. Api provides data in the form of dynamic keys like strLeague1, strLeague2
     *
     * @return List of leagues
     */
    @NotNull
    public static ArrayList<String> getLeagues(Team team) {
        Class aClass = Team.class;
        ArrayList<String> leagues = new ArrayList<>();
        try {
            //apis only shows the 7 league played by team
            for (int i = 1; i <= 7; i++) {
                Field field = aClass.getDeclaredField(i == 1 ? "strLeague" : "strLeague" + i);
                field.setAccessible(true);
                Object value = field.get(team);
                if (value != null) {
                    leagues.add(value.toString());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return leagues;
    }
}
