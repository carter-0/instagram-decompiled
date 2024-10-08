package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.4JZ  reason: invalid class name */
public final class AnonymousClass4JZ implements C253873rY {
    public final AnonymousClass4JX A00;
    public final AnonymousClass4EA A01;
    public final C253893ra A02;

    public AnonymousClass4JZ(Context context, 1Xj r9, AnonymousClass4JX r10, AnonymousClass4EA r11, AnonymousClass3W1 r12, int i) {
        0qQ.A0B(r10, 2);
        0qQ.A0B(r9, 4);
        0qQ.A0B(r12, 5);
        this.A00 = r10;
        this.A01 = r11;
        Context context2 = context;
        this.A02 = new C253893ra(context2, r9, new AnonymousClass4Ja(this), r12, r11.A0T, i);
    }

    public final boolean DF8(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A02.DF8(motionEvent);
    }
}
