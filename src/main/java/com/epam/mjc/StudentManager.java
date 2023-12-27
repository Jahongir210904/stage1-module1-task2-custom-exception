package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws IllegalArgumentException {
    if (Student.getValueOf(studentID)!=null){
      return Student.getValueOf(studentID);
    }
    throw new StudentCustomException(String.valueOf(studentID));
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    Student student;
    for (int i = 0; i < IDs.length; i++) {
      try {
        student = manager.find(IDs[i]);
      }catch (StudentCustomException e){
        String id=String.valueOf(i);
        throw new StudentCustomException(id);
      }
      if (student!=null){
        System.out.println("Student name " + student.getName());
      }
    }

  }
}