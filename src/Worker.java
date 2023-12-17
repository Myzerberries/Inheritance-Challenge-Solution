public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){

        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));  // the method substring passes the start
                                                                            //position of the String we want to extract,
                                                                            //and since indices start with zero, the birth
                                                                            //year starts at position 6. If we only pass
                                                                            //the start position and not the end position,
                                                                            //the String returned will be whatever is from
                                                                            //the start position to the end of the String.
        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate =  endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

}
