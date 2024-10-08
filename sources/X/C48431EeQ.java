package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.EeQ  reason: case insensitive filesystem */
public abstract class C48431EeQ {
    public static final Object A00(C307896Rx r2, AnonymousClass6Tm r3) {
        Object A02 = r3.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.Boolean");
        boolean A1a = AnonymousClass7TE.A1a(A02);
        FragmentActivity A04 = C308206Td.A04(r2);
        if (A04 == null) {
            return null;
        }
        Intent A09 = DbS.A09();
        A09.putExtra("EXTRA_IS_ONBOARDING_COMPLETE", !A1a);
        Dba.A0k(A04, A09);
        A04.overridePendingTransition(R.anim.right_in, R.anim.left_out);
        return null;
    }
}
