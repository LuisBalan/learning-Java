public class Droid{

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    
    public String toString(){
        return "Hello, I'm the droid: " + name + " and my battery level is: " + batteryLevel;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        int energyWaste = 10;
        System.out.println("The energy consumed by this task is: " + energyWaste);
        batteryLevel -= energyWaste;

    }

    public void energyTransfer(String receiverDroid, int transferredEnergy){
        System.out.println("\nTrasferring " + transferredEnergy + " units of energy to " + receiverDroid);
        batteryLevel -= transferredEnergy;
    }

    
    
    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        Droid Max = new Droid("Max");
        
        System.out.println(Codey.name);
        System.out.println(Codey.batteryLevel);
        System.out.println(Codey.toString());
        Codey.performTask("Eating");
        System.out.print(Codey.toString());
        Codey.energyTransfer(Max.name, 5);
        System.out.println(Codey.toString());
    }

    
    
}