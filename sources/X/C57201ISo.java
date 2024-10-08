package X;

import android.content.Context;

/* renamed from: X.ISo  reason: case insensitive filesystem */
public final class C57201ISo implements JPO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C263044Gz A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3V9 A03;

    public final void DoR(C54068Gyr gyr) {
    }

    public C57201ISo(Context context, C263044Gz r2, 1Xj r3, AnonymousClass3V9 r4) {
        this.A01 = r2;
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onFail(C268654dm r5) {
        C263044Gz r3 = this.A01;
        C263044Gz.A00(this.A00, r3, this.A02, this.A03);
    }
}
