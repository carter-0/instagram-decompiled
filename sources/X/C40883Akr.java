package X;

import android.view.View;

/* renamed from: X.Akr  reason: case insensitive filesystem */
public final class C40883Akr implements Runnable {
    public final /* synthetic */ ADC A00;

    public C40883Akr(ADC adc) {
        this.A00 = adc;
    }

    public final void run() {
        ADC adc = this.A00;
        View view = adc.A00;
        if (view != null) {
            view.setBottom(0nA.A05(adc.A04));
        }
        View view2 = adc.A00;
        if (view2 != null) {
            0nA.A0r(view2, this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
