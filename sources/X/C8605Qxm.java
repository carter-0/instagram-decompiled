package X;

import android.content.Context;

/* renamed from: X.Qxm  reason: case insensitive filesystem */
public final class C8605Qxm extends QAL {
    public final /* synthetic */ C8608Qxp A00;
    public final /* synthetic */ C62320sa A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8605Qxm(Context context, C8608Qxp qxp, C62320sa r3, int i) {
        super(context, i);
        this.A00 = qxp;
        this.A01 = r3;
    }

    public final void cancel() {
        C62320sa r0 = this.A01;
        if (r0 == null) {
            super.cancel();
        } else {
            r0.invoke();
        }
    }

    public final void onBackPressed() {
        if (!this.A00.Cmg()) {
            super.onBackPressed();
        }
    }
}
