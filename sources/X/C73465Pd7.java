package X;

import com.facebook.msys.mci.CQLResultSet;

/* renamed from: X.Pd7  reason: case insensitive filesystem */
public final class C73465Pd7 implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C73465Pd7(NBH nbh, int i, int i2) {
        this.A00 = i2;
        this.A02 = nbh;
        this.A01 = i;
    }

    public final Object invoke() {
        int i;
        int i2 = this.A00;
        int i3 = this.A01;
        CQLResultSet cQLResultSet = ((C301345z0) this.A02).mResultSet;
        switch (i2) {
            case 0:
                i = 14;
                break;
            case 1:
                i = 100;
                break;
            default:
                i = 138;
                break;
        }
        return cQLResultSet.getString(i3, i);
    }
}
