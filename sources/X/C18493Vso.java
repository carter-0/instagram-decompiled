package X;

import android.util.SparseArray;

/* renamed from: X.Vso  reason: case insensitive filesystem */
public final class C18493Vso {
    public X7Q A00;
    public boolean A01;
    public int A02;
    public int A03;
    public final SparseArray A04 = new SparseArray();
    public final SparseArray A05 = new SparseArray();

    public static void A00(C18493Vso vso) {
        X7Q x7q = vso.A00;
        int Asw = x7q.Asw();
        int Asq = x7q.Asq();
        if (vso.A03 != Asw || vso.A02 != Asq) {
            vso.A03 = Asw;
            vso.A02 = Asq;
            vso.A04.clear();
            vso.A05.clear();
        }
    }

    public C18493Vso(X7Q x7q) {
        this.A00 = x7q;
        this.A03 = x7q.Asw();
        this.A02 = this.A00.Asq();
    }
}
