package com;

import java.io.Serializable;

public class PersonBean implements Serializable
{
 private String name;
  
  public PersonBean()
   {
    this.name="";
   }
   public void setName(String name)
   {
    this.name = name;
   }
   public String getName()
   {
    return name;
   }
}