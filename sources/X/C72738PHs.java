package X;

/* renamed from: X.PHs  reason: case insensitive filesystem */
public final class C72738PHs implements C51878G5q {
    public final int A00;
    public final Object A01;

    public C72738PHs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dfh() {
        switch (this.A00) {
            case 0:
                C331677Rx.A00((C331677Rx) this.A01).generateResponses(false);
                return;
            case 1:
                C50884Fk2.A00((C50884Fk2) this.A01);
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
    }
}
