package X;

import java.util.List;

/* renamed from: X.Olu  reason: case insensitive filesystem */
public final class C71505Olu implements C322156vL {
    public final /* synthetic */ 2Ru A00;
    public final /* synthetic */ Runnable A01;

    public C71505Olu(2Ru r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void D7T(List list, List list2) {
        this.A01.run();
        this.A00.mDiffer.A06.remove(this);
    }
}
