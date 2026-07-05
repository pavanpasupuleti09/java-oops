package com.java.oops.encapsulation;

class Student {

        private int id;
        private String name;

        // Setter
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public class main {
        public static void main(String[] args) {
            Student s = new Student();

            s.setId(101);
            s.setName("Pavan");

            System.out.println(s.getId());
            System.out.println(s.getName());
        }
    }

