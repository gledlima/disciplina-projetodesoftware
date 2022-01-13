package colabory;

public class Employee {

    public String name; //ATRIBUTOS - NOME
    public String address; //ATRIBUTOS - ENDEREÇO - cidade
    public String district; //ATRIBUTOS - ENDEREÇO - BAIRRO
    public int typeofEmployee; //TIPODEEMPREGADO - HORISTAS | ASSALARIADO | COMISSIONADO
    public int matricula;
    public double workingHorys;
    
    //String timeCard; //CARTÃODEPONTO
    
    public Employee(String name, String address, String district, int typeofEmployee, int matricula) //CONSTRUTOR É UM MÉTODO CUJO NOME DEVE SER O MESMO NOME DA CLASSE
    {                                                                               // E SEM INDICAÇÃO DE TIPO DE RETORNO
        this.name = name;
        //this.address = address;
        this.district = district;
        this.typeofEmployee = typeofEmployee;
        this.matricula = matricula;
        //super().address = address; 
    }

    String printEmployeeInfor()
    {
        return "Nome: " + this.name + 
                "\nEndereço: " + this.address +
                "\nTipo de Empregado: " + this.typeofEmployee; //+
                //"\nCartão de Pontos: " + this.timeCard;

    }

    public String printInfo()
    {
        return "ASSALARIADO: " +
            "\nHORISTA: " +
            "\nCOMISSIONADO: ";
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return name + " : " + address;
    }
    public int getmatricula(){

        return matricula;

    }



}







