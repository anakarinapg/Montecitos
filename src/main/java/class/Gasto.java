package zzzz;
public class Gasto {
    int ID;
    int Amount;
    date Fecha;
    public Gasto(){}
    public Gasto(int id,int amount,date fecha){
        ID=id;
        Amount=amount;
        Fecha=fecha;
    }
    public int getId(){
        return ID;
    }
    public int getAmount(){
        return Amount;
    }
    public date getFecha(){
        return Fecha;
    }
    public void setId(int id){
        ID=id;
    }
    public void setAmount(int amount){
        Amount=amount;
    }
    public void setFecha(date fecha){
        Fecha=fecha;
    }
    @Override
    public String toString() {
        return "Gasto{" +
                "id=" + ID +
                ", cantidad='" + Amount + '\'' +
                ", fecha='" + Fecha + '\'' +
                '}';
    }
}
