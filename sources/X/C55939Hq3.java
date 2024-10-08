package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Hq3  reason: case insensitive filesystem */
public final class C55939Hq3 {
    public final Context A00;
    public final C242903Wq A01;

    public final void A00(AnonymousClass9IZ r5, C55730HmR hmR) {
        0qQ.A0B(hmR, 0);
        if (r5 != null) {
            DbX.A1G(hmR.A02, (CharSequence) r5.A03);
            View view = hmR.A00;
            C242903Wq r1 = this.A01;
            C56802ICz.A01(view, 11, r5);
            view.setVisibility(0);
            view.setEnabled(r5.A01);
            r1.Cy8(view);
            hmR.A01.setVisibility(0);
            return;
        }
        hmR.A01.setVisibility(8);
    }

    public C55939Hq3(Context context, C242903Wq r2) {
        AnonymousClass7TG.A1O(context, r2);
        this.A00 = context;
        this.A01 = r2;
    }
}
