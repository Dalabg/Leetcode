package Coding_Caprice.graph;

import java.util.ArrayList;
import java.util.List;

public class graphtest {
    public static void main(String[] args) {
        room_and_key_841 a = new room_and_key_841();
        List<List<Integer>> rooms=new ArrayList<>();
        List<Integer> room1 = new ArrayList<>();
        room1.add(1);
        rooms.add(room1);
        List<Integer> room2 = new ArrayList<>();
        room1.add(2);
        rooms.add(room2);
        List<Integer> room3 = new ArrayList<>();
        room1.add(3);
        rooms.add(room3);
        List<Integer> room4 = new ArrayList<>();
        rooms.add(room4);
        System.out.println(a.canVisitAllRooms(rooms));
    }
}
