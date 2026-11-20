import exemples.*;

public class Entreprise {
    public static void main(String[] args){
        System.out.println("Bienvenu dans le system du gestion de resource personnel : ");

        Commercial emp1 = new Commercial("loopi", "lack", 2024, 40000);
        Technicien emp2 = new Technicien("adventure", "fin", 2024, 3500);
        Manager emp3 = new Manager("ziane", "samir", 2022, 500);
        TechnicienRisque emp4 = new TechnicienRisque("jason", "jp", 2024, 2000);

        Employe[] employees = {emp1, emp2, emp3, emp4};

        for (int i =0 ; i<employees.length ; i++) {
            System.out.println("Employer number " + i + " : ");
            System.out.println(employees[i].toString());
            System.out.println("====================================");
        }
    }
}
