package X;

import android.app.Activity;

/* renamed from: X.JbP  reason: case insensitive filesystem */
public final class C59900JbP extends 0ng {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C59901JbQ A01;

    public final void run() {
        int i;
        Activity activity = this.A00;
        AnonymousClass0vF r0 = C363878kU.A00;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i = 90;
        } else if (rotation != 2) {
            i = 270;
            if (rotation != 3) {
                i = 0;
            }
        } else {
            i = 180;
        }
        C59863Jag jag = this.A01.A00;
        jag.A08.post(new C59925Jbo(jag, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59900JbP(Activity activity, C59901JbQ jbQ) {
        super(1092088265, 3, false, false);
        this.A00 = activity;
        this.A01 = jbQ;
    }
}
