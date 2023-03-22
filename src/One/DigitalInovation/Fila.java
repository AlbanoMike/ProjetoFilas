package One.DigitalInovation;

public class Fila {

    private No RefNoEntradaFila;

    public Fila() {

        this.RefNoEntradaFila = null;
    }

    public void Enqueue(No Novono){
        Novono.setRefNo(RefNoEntradaFila);
        RefNoEntradaFila = Novono;
    }

    public No First(){
        if(!this.isEmpty()){
            No PrimeiroNo = RefNoEntradaFila;
            while (true){
                if(PrimeiroNo.getRefNo() != null){
                    PrimeiroNo = PrimeiroNo.getRefNo();
                }else {
                    break;
                }
            }return PrimeiroNo;
        }
        return null;
    }

    public No DeQueue(){
        if(!this.isEmpty()){
            No PrimeiroNo = RefNoEntradaFila;
            No NoAuxiliar = RefNoEntradaFila;
            while (true){
                if(PrimeiroNo.getRefNo() != null){
                    NoAuxiliar = PrimeiroNo;
                    PrimeiroNo = PrimeiroNo.getRefNo();
                }else {
                    NoAuxiliar.setRefNo(null);
                    break;
                }
            }
            return PrimeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){

        return RefNoEntradaFila == null? true : false;

    }
    public boolean isempty(){
        return RefNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String StringRetorno = "";
        No NoAuxiliar = RefNoEntradaFila;
        if(RefNoEntradaFila != null){
            while (true){
                StringRetorno += "[No{Objeto=" + NoAuxiliar.getObject() + "}]-------->";
                if(NoAuxiliar.getRefNo() != null){
                    NoAuxiliar = NoAuxiliar.getRefNo();

                }else {
                    StringRetorno += "Null";
                    break;
                }
            }
        }else {
            StringRetorno = null;
        }

        return StringRetorno;
    }
}
