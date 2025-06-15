package org.example;
/// Single Responsibility Principle (SRP) Example
// class should have only one reason to change which means every class should have single responsibility or single jb or single purpose
//  //class with multiple responsiblity
//class Baker{
//    public void bakebBread(){
//        System.out.println("Baking braed");
//    }
//     public void manageInventory(){
//         System.out.println("manages Inventory");
//     }
//      public void manageSuppliers() {
//          System.out.println("manages suppliers");
//      }
//      public void manageCustomer(){
//          System.out.println("Hi customer");
//      }
//}

//
//
//    public class Main{
//        public static void main(String[] args) {
//            Baker baker = new Baker();
//            baker.bakebBread();
//            baker.manageInventory();
//            baker.manageSuppliers();
//            baker.manageCustomer();
//
//
//
//    }
//}

// class with single responsibility
class Baker{
    public void bakingBread(){
        System.out.println("Baking bread");
    }
}
class InventoryManager{
    public void manageInventory(){
        System.out.println("Manage Inventory");
    }
}
class HandlingCustomers {
    public void manageCustomers() {
        System.out.println("Hi customers .. welcome to our bakery");

    }

    public static void main(String[] args) {
        Baker baker = new Baker();
        baker.bakingBread();

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.manageInventory();

        HandlingCustomers handlingCustomers = new HandlingCustomers();
        handlingCustomers.manageCustomers();
    }
}