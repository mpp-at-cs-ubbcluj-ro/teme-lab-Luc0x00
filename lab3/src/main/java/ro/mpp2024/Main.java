package ro.mpp2024;
import ro.mpp2024.repository.Repository;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        repository.add("David", "david@cs.ro", "cristian");
        repository.update(3, "ciupe");
        repository.printUsersWithPasswordStartingWithC();
    }
}