package X;

import android.content.Context;
import android.content.DialogInterface;

public abstract class SQH {
    public static final void A00(Context context) {
        C358248ab r2 = new C358248ab(context);
        r2.A09(2131961740);
        r2.A08(2131972232);
        Dba.A0t((DialogInterface.OnClickListener) null, r2, 2131960862);
    }

    public static final void A01(0hq r1) {
        0SM A0R;
        if (r1 != null && (A0R = r1.A0R("progressDialog")) != null) {
            A0R.A08();
        }
    }

    public static final void A02(0hq r2) {
        R8F r8f = new R8F();
        if (r2 != null) {
            r8f.A0L(r2, "progressDialog");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static void A03(R8T r8t) {
        0hq r0 = r8t.A07;
        0qQ.A0A(r0);
        A01(r0);
        Context context = r8t.A00;
        0qQ.A0A(context);
        AnonymousClass0fN.A00(F8T.A00(context));
        T6A t6a = r8t.A0A;
        0qQ.A0A(t6a);
        t6a.A00(RDG.A03, RDI.A02, r8t.A0C);
    }
}
