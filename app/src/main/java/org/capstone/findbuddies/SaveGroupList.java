package org.capstone.findbuddies;

import com.google.firebase.database.Exclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2018-03-08.
 */

public class SaveGroupList {
    int roomNo;
    String owner;
    String groupName;
    String password;
    ArrayList<String> members;
    ArrayList<Integer> memberPermission;

    public ArrayList<Integer> getMemberPermission() {
        return memberPermission;
    }

    public void setMemberPermission(ArrayList<Integer> memberPermission) {
        this.memberPermission = memberPermission;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    @Exclude
    public Map<String,Object> toMap() {
        HashMap<String,Object> hash = new HashMap<>();

        hash.put("roonNo",roomNo);
        hash.put("owner",owner);
        hash.put("groupName",groupName);
        hash.put("password",password);
        hash.put("members",members);
        hash.put("memberPermission",memberPermission);

        return hash;
    }
}
