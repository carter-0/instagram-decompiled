package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V9f  reason: case insensitive filesystem */
public abstract class C16876V9f {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        C276544tV A0O = DbY.A0O(r8);
        Context requireContext = C308206Td.A01(r7).requireContext();
        UserSession A0R = DbW.A0R(r7);
        String str = (String) DbW.A0d(r8);
        String A0H = A0O.A0H();
        if (A0H != null) {
            String A0D = A0O.A0D();
            if (A0D != null) {
                String A0E = A0O.A0E();
                List A0N = A0O.A0N(36);
                0qQ.A07(A0N);
                ArrayList A0r = AnonymousClass7TG.A0r(A0N);
                Iterator it = A0N.iterator();
                while (it.hasNext()) {
                    A0r.add(V70.A00(DbY.A0k(AnonymousClass7TE.A18(it))));
                }
                C305796Jo.A02(requireContext, A0R, str, A0H, A0D, A0E, A0r);
                return null;
            }
            throw new IllegalStateException("cta_type cannot be null");
        }
        throw new IllegalStateException("media_id cannot be null");
    }
}
