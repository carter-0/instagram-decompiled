package X;

import android.util.SparseArray;

/* renamed from: X.Sey  reason: case insensitive filesystem */
public final class C11701Sey implements YBZ {
    public final /* synthetic */ C12342Sro A00;

    public C11701Sey(C12342Sro sro) {
        this.A00 = sro;
    }

    public final void ASU() {
        this.A00.A08 = true;
    }

    public final void EKw(C13511Tbc tbc) {
        this.A00.A04 = tbc;
    }

    public final C13900TjN FHV(int i, int i2) {
        C12342Sro sro = this.A00;
        SparseArray sparseArray = sro.A09;
        C11717SfE sfE = (C11717SfE) sparseArray.get(i);
        if (sfE != null) {
            return sfE;
        }
        if (sro.A08) {
            return new C11716SfD();
        }
        C7457QDw qDw = new C7457QDw(sro.A0E, sro, i);
        sparseArray.put(i, qDw);
        return qDw;
    }
}
