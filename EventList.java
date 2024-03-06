import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class  EventList {
    private Scanner scanner;
    private List<Map<String, Object>> eventList;

    public EventList() {
        // met en place tous les outlis dont on aurais besoin a l'instance de cette
        // classe
        eventList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // function to add new event
    public void addNewEvent() {
        System.out.print("Entrez l'intituler de l'evemement: ");
        String newEventName = scanner.nextLine();
        System.out.print("Entrez la date prevue pour l'evemement: ");
        String newEventDate = scanner.nextLine();
        System.out.print("Entrez le budget prevue pour l'evemement: ");
        float newEventBudget = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Entrez la localisation prevue pour l'evemement: ");
        String newEventLocalisation = scanner.nextLine();

        Map<String, Object> envetMap = new HashMap<>();

        envetMap.put("eventName", newEventName);
        envetMap.put("eventDate", newEventDate);
        envetMap.put("eventLocalisation", newEventLocalisation);
        envetMap.put("eventBudget", newEventBudget);
        eventList.add(envetMap);
        System.out.println("Evenement ajoutée avec succès !");
    }

    // function to display all recorded events
    public void displayEvents() {
        if (eventList.isEmpty()) {
            System.out.println("La liste des evenement est vide \n ##########");
        } else {
            System.out.println("liste des evenements: ");
            int index = 0;
            for (Map<String, Object> event : eventList) {
                System.out.println(index + ". " + event + " \\n" + //
                        " ##########");
                index++;
            }
        }
    }

    // function to remove a specified event
    public void removeEvent() {
        displayEvents();
        if (!eventList.isEmpty()) {
            System.out.println("Entrer le numero de la tache a supprimer");
            int eventNumber = scanner.nextInt();
            scanner.nextLine();
            if (eventNumber > 0 && eventNumber <= eventList.size()) {
                eventList.remove(eventNumber - 1);
                System.out.println("supprimer avec ssucces");
            } else {
                System.out.println("numero d'evenement invalide");
            }
        }
    }

    // functions to output the menu
    public void displayMenu() {
        System.out.println("1. Afficher les evenements");
        System.out.println("2. Ajouter une nouvel evenement");
        System.out.println("3. Supprimer un evenement");
        System.out.println("4. Quitter");
        System.out.print("Choisissez une option : ");
    }

    // function to run all we need
    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayEvents();
                    break;
                case 2:
                    addNewEvent();
                    break;
                case 3:
                    removeEvent();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("choix invalide! veuillez reessayer");
                    break;
            }
        }
    }
}