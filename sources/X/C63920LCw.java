package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.LCw  reason: case insensitive filesystem */
public final class C63920LCw {
    public final MRZ A00;
    public final Context A01;
    public final MRY A02;

    public final void A00(1Xj r6, boolean z) {
        if (this.A02.BWy() == 100) {
            Context context = this.A01;
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131963419);
            Resources resources = context.getResources();
            int i = 2131963416;
            if (z) {
                i = 2131963415;
            }
            A0Y.A0q(JTS.A0i(resources, 100, i));
            int i2 = 2131963418;
            if (z) {
                i2 = 2131963417;
            }
            A0Y.A0I(LV0.A00(r6, this, 1), i2);
            A0Y.A05();
            DbT.A1V(A0Y);
            return;
        }
        this.A00.D5U(r6);
    }

    public C63920LCw(Context context, MRY mry, MRZ mrz) {
        this.A02 = mry;
        this.A00 = mrz;
        this.A01 = context;
    }
}
