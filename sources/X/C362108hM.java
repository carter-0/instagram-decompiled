package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.8hM  reason: invalid class name and case insensitive filesystem */
public final class C362108hM implements View.OnClickListener {
    public final /* synthetic */ C362098hL A00;

    public C362108hM(C362098hL r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1564134882);
        C362098hL r2 = this.A00;
        Activity activity = r2.A03;
        if (C2604245p.A03(activity)) {
            r2.A04.A00();
            C339797kB r0 = r2.A00;
            if (r0 != null) {
                r0.A00();
            }
            r2.A00 = null;
            r2.A05.A0U();
        } else if (r2.A01) {
            W38.A06(activity, (Integer) null);
        } else {
            r2.A02 = false;
            r2.A02 = true;
            C2604245p.A01(activity, r2);
        }
        AnonymousClass0fD.A0C(-1057703095, A05);
    }
}
