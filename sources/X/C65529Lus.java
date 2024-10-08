package X;

import android.widget.ProgressBar;

/* renamed from: X.Lus  reason: case insensitive filesystem */
public final class C65529Lus implements AnonymousClass2sT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65529Lus(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void DaJ(AnonymousClass3Q2 r3) {
        if (this.A00 != 0) {
            ((ProgressBar) this.A02).setProgress(((AnonymousClass3Q2) this.A01).A03());
            return;
        }
        Object obj = ((0rm) this.A02).A00;
        if (obj != null) {
            ((C249523jv) this.A01).FIG(obj);
        }
    }
}
