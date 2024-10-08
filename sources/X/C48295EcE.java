package X;

import com.instagram.android.R;
import java.util.AbstractMap;

/* renamed from: X.EcE  reason: case insensitive filesystem */
public abstract class C48295EcE {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        Object A0f = DbW.A0f(r5);
        C307786Rm r1 = r4.A03;
        if (r1 != null) {
            C49699F2k f2k = (C49699F2k) ((AbstractMap) r1.A00(R.id.bk_context_key_timers)).get(A0f);
            if (f2k == null) {
                return null;
            }
            f2k.A01 = true;
            f2k.A03.removeCallbacks(f2k.A05);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
