package X;

import com.instagram.android.R;
import java.util.AbstractMap;

/* renamed from: X.EcC  reason: case insensitive filesystem */
public abstract class C48293EcC {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Object A0g = DbW.A0g(r7, 0);
        C307786Rm r1 = r6.A03;
        if (r1 != null) {
            C49699F2k f2k = (C49699F2k) ((AbstractMap) r1.A00(R.id.bk_context_key_timers)).get(A0g);
            if (f2k == null || f2k.A00) {
                return null;
            }
            if (!f2k.A01) {
                f2k.A01 = true;
                f2k.A03.removeCallbacks(f2k.A05);
            }
            f2k.A01 = false;
            f2k.A03.postDelayed(f2k.A05, f2k.A02);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
