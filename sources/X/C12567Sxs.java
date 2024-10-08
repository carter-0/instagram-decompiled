package X;

import android.content.Context;

/* renamed from: X.Sxs  reason: case insensitive filesystem */
public final class C12567Sxs implements C13638Te5 {
    public final C10603Rux EL9(Context context, C13741TgD tgD, String str) {
        C10603Rux rux = new C10603Rux();
        rux.A00 = tgD.FOv(context, str);
        int i = 1;
        int FPB = tgD.FPB(context, str, true);
        rux.A01 = FPB;
        int i2 = rux.A00;
        if (i2 == 0) {
            if (FPB == 0) {
                i = 0;
                rux.A02 = i;
                return rux;
            }
            i2 = 0;
        }
        if (FPB < i2) {
            i = -1;
        }
        rux.A02 = i;
        return rux;
    }
}
