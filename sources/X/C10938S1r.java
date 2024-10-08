package X;

/* renamed from: X.S1r  reason: case insensitive filesystem */
public class C10938S1r {
    public final SNX A00;
    public final Object A01;
    public final Object A02;

    public String toString() {
        String str;
        SNX snx = this.A00;
        String obj = snx.A03.toString();
        switch (Rd4.A00(snx.A02).intValue()) {
            case 0:
                str = "FIRE_AND_FORGET";
                break;
            case 1:
                str = "ACKNOWLEDGED_DELIVERY";
                break;
            default:
                str = "ASSURED_DELIVERY";
                break;
        }
        return 002.A0T(obj, str, ' ');
    }

    public C10938S1r(SNX snx, Object obj, Object obj2) {
        this.A00 = snx;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
