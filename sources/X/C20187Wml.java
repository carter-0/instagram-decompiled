package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.Wml  reason: case insensitive filesystem */
public final class C20187Wml implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ U5O A01;

    public C20187Wml(Context context, U5O u5o) {
        this.A00 = context;
        this.A01 = u5o;
    }

    public final void run() {
        Context context = this.A00;
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e((Activity) context, 2131970287);
        A0e.A03(this.A01);
        A0e.A02();
        A0e.A0B = false;
        A0e.A0A = true;
        DbU.A1T(A0e);
    }
}
