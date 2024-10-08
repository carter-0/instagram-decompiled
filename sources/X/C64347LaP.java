package X;

/* renamed from: X.LaP  reason: case insensitive filesystem */
public final class C64347LaP implements C344497rx {
    public final int A00;
    public final Object A01;

    public C64347LaP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DQF(C391719tX r4) {
        if (this.A00 != 0) {
            0qQ.A0B(r4, 0);
            ((C63927LDk) this.A01).A00(r4);
            return;
        }
        0qQ.A0B(r4, 0);
        JW1.A00(((JWH) this.A01).A03).A0B(false, r4.getMessage());
    }
}
