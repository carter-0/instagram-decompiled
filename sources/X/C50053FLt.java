package X;

import android.view.View;

/* renamed from: X.FLt  reason: case insensitive filesystem */
public final class C50053FLt implements View.OnClickListener {
    public final /* synthetic */ C316006kx A00;

    public C50053FLt(C316006kx r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int A05 = AnonymousClass0fD.A05(45428378);
        C316006kx r0 = this.A00;
        C317116mk r2 = r0.A0E;
        if (r2 != null) {
            C255773uh r02 = r0.A08;
            if (r02 != null) {
                r2.DV4(r02);
                AnonymousClass0fD.A0C(593183415, A05);
                return;
            }
            illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
            i = 1134079408;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("Required value was null.");
            i = 1208037781;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalArgumentException;
    }
}
