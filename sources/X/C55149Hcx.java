package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Hcx  reason: case insensitive filesystem */
public abstract class C55149Hcx {
    public static final C331147Pt A00(Context context, View.OnClickListener onClickListener, Integer num) {
        C331137Ps r2 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r2.A05 = onClickListener;
        String A00 = C55148Hcw.A00(context, num);
        0qQ.A0B(A00, 0);
        r2.A07 = A00;
        r2.A0A = true;
        r2.A04 = new C14673U0u(context, num);
        return r2.A00();
    }
}
