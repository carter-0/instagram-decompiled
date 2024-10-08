package X;

import android.app.Dialog;

/* renamed from: X.Amz  reason: case insensitive filesystem */
public final /* synthetic */ class C41015Amz implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass8HV A01;

    public /* synthetic */ C41015Amz(AnonymousClass8HV r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public final void run() {
        AnonymousClass8HV r0 = this.A01;
        float f = this.A00;
        AnonymousClass0eM r3 = r0.A00.A09;
        if (((Dialog) r3.getValue()).isShowing()) {
            ((AnonymousClass9WJ) r3.getValue()).A00.setProgress((int) (100.0f * f));
        }
        if (f == 1.0f && ((Dialog) r3.getValue()).isShowing()) {
            AnonymousClass7TF.A1N(r3);
        }
    }
}
