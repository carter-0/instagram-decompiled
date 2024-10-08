package X;

public final class IL7 implements AnonymousClass4HI {
    public final int A00;
    public final Object A01;

    public IL7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ String AWr() {
        switch (this.A00) {
            case 0:
                return (String) DbT.A0r(this.A01);
            case 1:
                return ((SUL) this.A01).A09();
            default:
                return ((IL9) this.A01).A00;
        }
    }
}
