package X;

import android.view.View;

public final class IAM implements View.OnClickListener {
    public final /* synthetic */ C53157GjT A00;

    public IAM(C53157GjT gjT) {
        this.A00 = gjT;
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        int A05 = AnonymousClass0fD.A05(-652656511);
        C53157GjT gjT = this.A00;
        AnonymousClass3W1 r5 = gjT.A03;
        if (r5 != null) {
            C2363233h r3 = gjT.A02;
            if (r3 != null) {
                r5.A1H = null;
                r5.A1G = null;
                1Xj r4 = gjT.A01;
                if (r4 != null) {
                    r3.DkW(r4, r5, (String) null, false, false);
                }
                AnonymousClass0fD.A0C(865515584, A05);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1962894716;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1080061472;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalStateException;
    }
}
