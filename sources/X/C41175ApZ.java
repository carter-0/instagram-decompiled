package X;

import android.app.Activity;

/* renamed from: X.ApZ  reason: case insensitive filesystem */
public final class C41175ApZ implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C283245Gr A01;
    public final /* synthetic */ 1Av A02;

    public C41175ApZ(Activity activity, C283245Gr r2, 1Av r3) {
        this.A00 = activity;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        Activity activity = this.A00;
        if (activity != null) {
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131954807);
            A0e.A03 = this.A01;
            A0e.A01();
            A0e.A00 = 5000;
            A0e.A0A = true;
            A0e.A00().A06();
            0xY A0p = AnonymousClass7TE.A0p(this.A02);
            A0p.E5T("carousel_scrubbing_tooltip_shown", true);
            A0p.apply();
        }
    }
}
