package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.EgS  reason: case insensitive filesystem */
public abstract class C48557EgS {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        Context context;
        C277014uI A0S = DbX.A0S(r13, 0);
        FragmentActivity A04 = C308206Td.A04(r12);
        0lg A0B = C308206Td.A0B(r12);
        C307786Rm r0 = r12.A03;
        if (r0 != null) {
            context = r0.A00;
        } else {
            context = null;
        }
        1Ng A00 = AnonymousClass1Nd.A00(A0B);
        C50295FXa fXa = new C50295FXa(r12, A0S, 1);
        String A01 = 2RR.A01();
        LTL.A06(A04, new FZD(0, A04, A00, context, A0B, fXa), A01, new int[]{A04.getColor(R.color.fan_club_purple), A04.getColor(R.color.fan_club_pink)}, new int[]{0, 0, 0, 1}, 0.2f);
        return null;
    }
}
