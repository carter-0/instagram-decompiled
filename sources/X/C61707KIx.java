package X;

import android.graphics.Bitmap;

/* renamed from: X.KIx  reason: case insensitive filesystem */
public final class C61707KIx extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C63891LAu A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61707KIx(C63891LAu lAu, int i, int i2) {
        super(94, 3, false, false);
        this.A02 = lAu;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        C63891LAu lAu = this.A02;
        String str = lAu.A04.A03;
        if (str != null) {
            Bitmap A012 = C39901AIj.A01(Bitmap.Config.ARGB_8888, AnonymousClass7TE.A0t(str), this.A01, this.A00);
            if (A012 != null) {
                int size = lAu.A08.size();
                for (int i = 0; i < size; i++) {
                    lAu.A05.A00(i, A012);
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
