package X;

import android.view.View;
import java.util.List;

/* renamed from: X.Tzr  reason: case insensitive filesystem */
public final /* synthetic */ class C14645Tzr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C14597Tz1 A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C14645Tzr(View view, C14597Tz1 tz1, int i, boolean z) {
        this.A02 = tz1;
        this.A01 = view;
        this.A03 = z;
        this.A00 = i;
    }

    public final void run() {
        C14597Tz1 tz1 = this.A02;
        View view = this.A01;
        boolean z = this.A03;
        int i = this.A00;
        if (tz1.A04 != null) {
            int height = tz1.getHeight();
            int Bdk = height - tz1.A04.Bdk(view, height);
            C14640Tzm tzm = tz1.A05;
            int i2 = tzm.A03;
            if (z) {
                view.offsetTopAndBottom(Bdk - view.getTop());
                return;
            }
            tzm.A08 = view;
            tzm.A02 = -1;
            if (C14640Tzm.A06(tzm, Bdk, 0, i)) {
                tz1.postInvalidateOnAnimation();
                return;
            }
            List<C20941X5k> list = tz1.A0H;
            if (!list.isEmpty() && i2 == 0) {
                for (C20941X5k DYK : list) {
                    DYK.DYK(view, tz1.A04);
                }
            }
        }
    }
}
