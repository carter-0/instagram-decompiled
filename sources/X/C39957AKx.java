package X;

import android.content.DialogInterface;

/* renamed from: X.AKx  reason: case insensitive filesystem */
public final class C39957AKx implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C353498Hw A00;

    public C39957AKx(C353498Hw r1) {
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C59767JXi jXi;
        C353498Hw r1 = this.A00;
        if (!r1.A0p && (jXi = r1.A0F) != null && jXi.A0H) {
            C66567MWv mWv = jXi.A0B;
            if (mWv == null) {
                jXi.A0E();
                return;
            }
            mWv.start();
            jXi.A0N.postOnAnimation(jXi.A0g);
        }
    }
}
