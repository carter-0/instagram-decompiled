package X;

import android.app.Activity;

/* renamed from: X.Iiw  reason: case insensitive filesystem */
public final class C57941Iiw implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C53335GmL A01;
    public final /* synthetic */ GT9 A02;
    public final /* synthetic */ C331127Pr A03;

    public C57941Iiw(Activity activity, C53335GmL gmL, GT9 gt9, C331127Pr r4) {
        this.A00 = activity;
        this.A03 = r4;
        this.A02 = gt9;
        this.A01 = gmL;
    }

    public final void run() {
        Boolean bool;
        AnonymousClass37E r1 = AnonymousClass37D.A00;
        Activity activity = this.A00;
        C331157Pu A002 = C48943Emh.A00(r1.A01(activity));
        AnonymousClass37D A012 = r1.A01(activity);
        if (A012 != null) {
            bool = Boolean.valueOf(((AnonymousClass37F) A012).A0m);
        } else {
            bool = null;
        }
        if (A002 == null || !AnonymousClass7TF.A1Y(bool, false)) {
            this.A03.A00().A02(activity, this.A02);
            return;
        }
        A002.A0G(this.A02, this.A03, this.A01.A0b, false);
    }
}
