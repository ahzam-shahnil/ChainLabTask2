package com.assign;

public class Demo {
  public static void main(String[] args) {

    TeamLeader teamLeader = new TeamLeader();
    ProjectLeader projectLeader = new ProjectLeader();
    HR hr = new HR();
    teamLeader.setNextSupervisor(projectLeader);
    projectLeader.setNextSupervisor(hr);
    teamLeader.applyLeave("Amir", 9);
    System.out.println();
    teamLeader.applyLeave("Palwasha", 18);
    System.out.println();
    teamLeader.applyLeave("Maria", 30);
    System.out.println();
    teamLeader.applyLeave("Rohail", 50);
  }
}
