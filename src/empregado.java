public class empregado {

    String name; //ATRIBUTOS - NOME
    String address; //ATRIBUTOS - ENDEREÇO - cidade
    String district; //ATRIBUTOS - ENDEREÇO - BAIRRO
    int typeofEmployee; //TIPODEEMPREGADO - HORISTAS | ASSALARIADO | COMISSIONADO
    int matricula;
    
    //String timeCard; //CARTÃODEPONTO
    
    public empregado(String name, String address, String district, int typeofEmployee, int matricula) //CONSTRUTOR É UM MÉTODO CUJO NOME DEVE SER O MESMO NOME DA CLASSE
    {                                                                               // E SEM INDICAÇÃO DE TIPO DE RETORNO
        this.name = name;
        this.address = address;
        this.district = district;
        this.typeofEmployee = typeofEmployee;
        this.matricula = matricula;
        //this.timeCard = timeCard; 
    }

    String printEmployeeInfor()
    {
        return "Nome: " + this.name + 
                "\nEndereço: " + this.address +
                "\nTipo de Empregado: " + this.typeofEmployee; //+
                //"\nCartão de Pontos: " + this.timeCard;

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




