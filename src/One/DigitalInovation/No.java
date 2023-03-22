package One.DigitalInovation;

public class No {

    private Object object;
    private No RefNo;

    public No() {
    }

    public No(Object object) {
        this.RefNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return RefNo;
    }

    public void setRefNo(No refNo) {
        RefNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
