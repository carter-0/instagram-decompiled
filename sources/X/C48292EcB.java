package X;

import com.instagram.android.R;
import java.util.AbstractMap;

/* renamed from: X.EcB  reason: case insensitive filesystem */
public abstract class C48292EcB {
    public static final Object A00(C307896Rx r1, AnonymousClass6Tm r2) {
        Object A0d = DbW.A0d(r2);
        C307786Rm r12 = r1.A03;
        if (r12 != null) {
            C49699F2k f2k = (C49699F2k) ((AbstractMap) r12.A00(R.id.bk_context_key_timers)).get(A0d);
            if (f2k == null) {
                return null;
            }
            f2k.A00();
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
