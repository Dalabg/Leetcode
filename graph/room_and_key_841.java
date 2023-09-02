package Coding_Caprice.graph;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class room_and_key_841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[]room=new int[rooms.size()];
        room[0]=1;
        Deque<Integer> keys = new LinkedList<>();
        keys.addAll(rooms.get(0));
        while(!keys.isEmpty()){
            if(room[keys.getFirst()]==1){
                keys.removeFirst();
                continue;
            }
            room[keys.getFirst()]=1;
            keys.addAll(rooms.get(keys.getFirst()));
            keys.removeFirst();
        }
//        System.out.println(keys);
        for (int i = 0; i < rooms.size(); i++) {
            if(room[i]==0){
                return false;
            }
        }
        return true;
    }
}
