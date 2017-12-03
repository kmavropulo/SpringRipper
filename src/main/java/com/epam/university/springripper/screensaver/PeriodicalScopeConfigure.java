package com.epam.university.springripper.screensaver;


import javafx.util.Pair;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.cglib.core.Local;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class PeriodicalScopeConfigure implements Scope {
    Map<String, Pair<LocalTime, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (map.containsKey(name)) {
            System.out.println(name);
            Pair<LocalTime, Object> localTimeObjectPair = map.get(name);
            int secondsSinceLastRequst = LocalTime.now().getSecond() - localTimeObjectPair.getKey().getSecond();
            if (secondsSinceLastRequst > 5) {
                map.put(name, new Pair(LocalTime.now(), objectFactory.getObject()));
            }
        } else {
            map.put(name, new Pair(LocalTime.now(), objectFactory.getObject()));
        }
        return map.get(name).getValue();
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
