package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.FXn  reason: case insensitive filesystem */
public final class C50308FXn implements 1DN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ FQP A01;
    public final /* synthetic */ boolean A02;

    public C50308FXn(Activity activity, FQP fqp, boolean z) {
        this.A01 = fqp;
        this.A02 = z;
        this.A00 = activity;
    }

    public final void DWm(Map map) {
        1Av r0;
        0s0 r3;
        AnonymousClass0YZ[] r2;
        int i;
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        boolean A1W = AnonymousClass7TF.A1W(obj, C346927vz.GRANTED);
        FQP fqp = this.A01;
        int A0M = AnonymousClass7TE.A0M(fqp.A02);
        if (A0M == 0) {
            r0 = (1Av) fqp.A03;
            r3 = r0.A7D;
            r2 = 1Av.A8a;
            i = 32;
        } else if (A0M != 1) {
            r0 = 1Au.A00(((C48021ERk) fqp.A01).A00);
            r3 = r0.A7p;
            r2 = 1Av.A8a;
            i = 31;
        } else {
            r0 = (1Av) fqp.A03;
            r3 = r0.A7E;
            r2 = 1Av.A8a;
            i = 33;
        }
        AnonymousClass7TF.A1J(r0, r3, r2, i, A1W);
        if (!this.A02 && obj == C346927vz.DENIED_DONT_ASK_AGAIN) {
            W38.A02(this.A00, 2131974228);
        }
    }
}
