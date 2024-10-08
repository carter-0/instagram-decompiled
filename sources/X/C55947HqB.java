package X;

/* renamed from: X.HqB  reason: case insensitive filesystem */
public abstract class C55947HqB {
    public final int A00;
    public final boolean A01;

    public final String A00() {
        C56146HtY htY;
        if (this instanceof C54518HHe) {
            C57570Icx icx = ((C54518HHe) this).A01;
            if (icx != null) {
                return icx.A04;
            }
            return null;
        } else if (!(this instanceof C54519HHf) || (htY = ((C54519HHf) this).A01.A01) == null) {
            return null;
        } else {
            return htY.A0A;
        }
    }

    public C55947HqB(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
