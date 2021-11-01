package com.assign;

public class ProjectLeader extends Employee{

  private int MAX_LEAVES_CAN_APPROVE = 20;

  public void applyLeave(String employeeName, int numberofDaysLeave) {

    if (numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE) {
      ApproveLeave(employeeName, numberofDaysLeave);
    } else {
      supervisor.applyLeave(employeeName, numberofDaysLeave);
    }
  }

  private void ApproveLeave(String employeeName, int numberofDaysLeave) {
    System.out.println(
        "ProjectLeader approved "
            + numberofDaysLeave
            + " days "
            + "Leave for the employee : "
            + employeeName);
  }
}
