package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.IhH  reason: case insensitive filesystem */
public final class C57838IhH implements Runnable {
    public final /* synthetic */ AnonymousClass3Ux A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public C57838IhH(AnonymousClass3Ux r1, AnonymousClass3W1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C238123Aq r2;
        if (this.A01.A13 == AnonymousClass05K.A00) {
            AnonymousClass3Ux r10 = this.A00;
            if (r10.A02) {
                ViewGroup viewGroup = r10.A07;
                0qQ.A0C(viewGroup, AnonymousClass000.A00(0));
                Object invoke = r10.A00().A00.A04.invoke();
                if ((invoke instanceof C238123Aq) && (r2 = (C238123Aq) invoke) != null) {
                    Rect A0W = AnonymousClass7TE.A0W();
                    Rect A0W2 = AnonymousClass7TE.A0W();
                    RectF rectF = 0nA.A01;
                    0qQ.A0B(viewGroup, 0);
                    RectF rectF2 = 0nA.A01;
                    0nA.A0L(rectF2, viewGroup);
                    rectF2.round(A0W);
                    r2.B9Z(A0W2);
                    int i = A0W.top;
                    if (i != A0W2.top) {
                        0wj r7 = 0wj.A01;
                        0f9 AEf = r7.AEf("WatchAndBrowseMediaViewHolder", 817903741);
                        AEf.ABQ(DialogModule.KEY_MESSAGE, 002.A02(i, A0W2.top, "scrolled media view distance to top of screen is: ", ", ViewPortAreaTop is: "));
                        AEf.report();
                        if (r10.A03) {
                            0f9 AEf2 = r7.AEf("WatchAndBrowseMediaViewHolder", 817903741);
                            AEf2.ABQ(DialogModule.KEY_MESSAGE, 002.A02(i, A0W2.top, "not enough space to scroll, scrolled media view distance to top of screen is: ", ", ViewPortAreaTop is: "));
                            AEf2.report();
                        }
                    }
                }
            }
        }
    }
}
