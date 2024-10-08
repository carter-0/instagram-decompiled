package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.Nhq  reason: case insensitive filesystem */
public final class C69236Nhq extends C51086FoG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C69236Nhq(Activity activity, C70453O7e o7e, int i) {
        this.A00 = i;
        this.A01 = activity;
        this.A02 = o7e;
    }

    public final void Cyb(boolean z) {
        int i = this.A00;
        C70453O7e o7e = (C70453O7e) this.A02;
        if (i != 0 || o7e != null) {
            o7e.A00.A05.Cyg();
        }
    }

    public final void De7() {
        C59689JTv.A0D((Context) this.A01, "request_error");
    }
}
