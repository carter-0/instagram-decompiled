package X;

import android.content.Context;
import android.view.View;

public final class Oj7 implements View.OnClickListener {
    public final /* synthetic */ C254853tA A00;
    public final /* synthetic */ C314226hr A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public Oj7(C254853tA r1, C314226hr r2, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = r2;
        this.A02 = z2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(149496430);
        View view2 = view;
        0qQ.A0B(view, 0);
        if (this.A03) {
            C314226hr r1 = this.A01;
            C314226hr.A02(view, r1.A01, r1);
        } else if (this.A02) {
            C314226hr.A09(this.A01);
        } else {
            C314226hr r12 = this.A01;
            AnonymousClass6ZN r5 = r12.A0O;
            Context A0S = AnonymousClass7TE.A0S(view);
            C254853tA r0 = this.A00;
            String str = r0.A02;
            String str2 = r0.A01;
            C255773uh r9 = r12.A00;
            if (r9 != null) {
                r5.A01(A0S, view2, r12.A0D, r9, str, str2, false);
                if (C337097fg.A00(C336957fS.A01(str))) {
                    1Av r3 = r12.A0N.A05;
                    DbS.A1a(r3, str, r3.A6k, 1Av.A8a, 305);
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0C(1733545629, A05);
                throw A0y;
            }
        }
        AnonymousClass0fD.A0C(890908287, A05);
    }
}
