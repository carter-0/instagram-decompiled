package X;

import android.view.View;
import android.view.ViewTreeObserver;

public final class WCJ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewTreeObserver A01;
    public final /* synthetic */ C18561VuD A02;

    public WCJ(ViewTreeObserver viewTreeObserver, C18561VuD vuD, int i) {
        this.A02 = vuD;
        this.A01 = viewTreeObserver;
        this.A00 = i;
    }

    public final boolean onPreDraw() {
        int AyP;
        this.A01.removeOnPreDrawListener(this);
        C18561VuD vuD = this.A02;
        C238133Ar r7 = vuD.A02;
        int B6L = r7.B6L();
        if (r7.AZK() != null) {
            for (int i = 0; i < r7.AnH(); i++) {
                View AnC = r7.AnC(i);
                int i2 = B6L + i;
                if (i2 < r7.AZK().getCount()) {
                    Object item = r7.AZK().getItem(i2);
                    if (item == null || !vuD.A01.CVu(item, AnC.getTag())) {
                        Number A0z = JTO.A0z(002.A0O(C18561VuD.A00(vuD, i2), AnC.hashCode()), vuD.A03);
                        int top = AnC.getTop();
                        if (A0z != null) {
                            int intValue = A0z.intValue();
                            if (intValue != top) {
                                AyP = intValue - top;
                            }
                        } else {
                            AyP = this.A00 + r7.AyP();
                        }
                        AnC.setAlpha(1.0f);
                        AnC.setTranslationY((float) AyP);
                        vuD.A00.A0A(new C15163UTo(AyP, 0, AnC, vuD));
                    } else {
                        AnC.setAlpha(0.0f);
                        AnC.animate().setDuration(100).alpha(1.0f);
                    }
                }
            }
        }
        vuD.A00.A04();
        vuD.A03.clear();
        return true;
    }
}
