package X;

import android.content.Context;

/* renamed from: X.Sxq  reason: case insensitive filesystem */
public final class C12565Sxq implements C13638Te5 {
    public final C10603Rux EL9(Context context, C13741TgD tgD, String str) {
        C10603Rux rux = new C10603Rux();
        int i = 1;
        int FPB = tgD.FPB(context, str, true);
        rux.A01 = FPB;
        if (FPB == 0) {
            int FOv = tgD.FOv(context, str);
            rux.A00 = FOv;
            if (FOv != 0) {
                i = -1;
            }
            return rux;
        }
        rux.A02 = i;
        return rux;
    }
}
