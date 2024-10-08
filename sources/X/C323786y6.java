package X;

import android.database.DataSetObserver;

/* renamed from: X.6y6  reason: invalid class name and case insensitive filesystem */
public final class C323786y6 extends DataSetObserver {
    public final /* synthetic */ C323766y4 A00;

    public C323786y6(C323766y4 r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        C323766y4 r1 = this.A00;
        r1.A02 = true;
        C323766y4.A00(r1, "observer_change");
    }
}
