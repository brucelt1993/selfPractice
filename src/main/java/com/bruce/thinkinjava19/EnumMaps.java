package com.bruce.thinkinjava19;

import java.util.EnumMap;
import java.util.Map;

/**
 * 简易命令模式
 */
public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });
        em.put(AlarmPoints.BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroomalert!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }
    }
}

enum AlarmPoints {
    STAIR1, STAIR2, LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY, KITCHEN;
}

interface Command {
    void action();
}
