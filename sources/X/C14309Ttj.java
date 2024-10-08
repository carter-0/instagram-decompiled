package X;

import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.Ttj  reason: case insensitive filesystem */
public final class C14309Ttj implements AnonymousClass03Q {
    public final int A00;
    public final Object A01;

    public C14309Ttj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final 04k Cvn(View view, 04k r6) {
        switch (this.A00) {
            case 0:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.A01;
                04k r1 = null;
                if (collapsingToolbarLayout.getFitsSystemWindows()) {
                    r1 = r6;
                }
                if (!02S.A00(collapsingToolbarLayout.A09, r1)) {
                    collapsingToolbarLayout.A09 = r1;
                    collapsingToolbarLayout.requestLayout();
                }
                return r6.A00.A0A();
            case 1:
                W1m w1m = (W1m) this.A01;
                int A02 = r6.A02();
                Handler handler = W1m.A0D;
                w1m.A01 = A02;
                04h r12 = r6.A00;
                w1m.A02 = r12.A03().A01;
                w1m.A03 = r12.A03().A02;
                W1m.A02(w1m);
                return r6;
            default:
                UZA uza = (UZA) this.A01;
                if (uza.A01.getFitsSystemWindows()) {
                    View rootView = view.getRootView();
                    RectF rectF = 0nA.A01;
                    0qQ.A0B(rootView, 0);
                    int systemUiVisibility = rootView.getSystemUiVisibility();
                    if (!((systemUiVisibility & 2) == 0 && (systemUiVisibility & 512) == 0 && (systemUiVisibility & 4) == 0)) {
                        int A022 = r6.A02() - r6.A00.A01().A00;
                        AnonymousClass04f r0 = new AnonymousClass04f();
                        02M A002 = 02M.A00(0, 0, 0, A022);
                        AnonymousClass04g r02 = r0.A00;
                        r02.A06(A002);
                        r6 = r02.A00();
                    }
                }
                return 03v.A05(uza.A01, r6);
        }
    }
}
