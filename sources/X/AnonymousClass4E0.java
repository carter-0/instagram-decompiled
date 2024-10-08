package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.4E0  reason: invalid class name */
public final class AnonymousClass4E0 implements C253873rY {
    public final C253863rX A00;
    public final C246663ey A01;
    public final C253893ra A02;

    public AnonymousClass4E0(1Xj r8, C253863rX r9, C246663ey r10, AnonymousClass3W1 r11, int i) {
        0qQ.A0B(r9, 1);
        1Xj r2 = r8;
        0qQ.A0B(r8, 3);
        this.A00 = r9;
        this.A01 = r10;
        Context context = r10.A00;
        if (context != null) {
            this.A02 = new C253893ra(context, r2, new AnonymousClass4E1(this), r11, r10.A01(), i);
            return;
        }
        throw new IllegalStateException(AnonymousClass000.A00(1226));
    }

    public final boolean DF8(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A02.DF8(motionEvent);
    }
}
