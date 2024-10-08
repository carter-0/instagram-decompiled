package X;

import android.os.Looper;

/* renamed from: X.ATp  reason: case insensitive filesystem */
public final class C40149ATp implements C346267ut {
    public final int A00;
    public final Object A01;

    public C40149ATp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DGm() {
        if (this.A00 != 0) {
            AnonymousClass9SN r2 = (AnonymousClass9SN) this.A01;
            if (AnonymousClass9SN.A00(r2).getHandler().getLooper() == Looper.myLooper()) {
                r2.A0C.run();
            }
            AnonymousClass9SN.A00(r2).getHandler().post(r2.A0C);
            return;
        }
        ((AH4) this.A01).A0F.DGm();
    }
}
