package X;

import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;

/* renamed from: X.EcD  reason: case insensitive filesystem */
public abstract class C48294EcD {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Object A02 = r9.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.Number");
        long A0R = AnonymousClass7TE.A0R(A02);
        boolean A01 = Q0A.A01(r9.A00());
        C277014uI A0P = DbW.A0P(r9, 3);
        String str = (String) DbW.A0g(r9, 4);
        C307786Rm r6 = r8.A03;
        if (r6 != null) {
            C49699F2k f2k = new C49699F2k(new C49576Eyl(r8, A0P, str, new WeakReference(r6)), A0R, A01);
            f2k.A01 = false;
            f2k.A03.postDelayed(f2k.A05, f2k.A02);
            AbstractMap abstractMap = (AbstractMap) r6.A00(R.id.bk_context_key_timers);
            C49699F2k f2k2 = (C49699F2k) abstractMap.get(str);
            if (f2k2 != null) {
                f2k2.A00();
                1Kn.A02("BloksTimer", 002.A0g("Timer with id ", str, " already exists. Overwriting previous timer."));
            }
            abstractMap.put(str, f2k);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
