package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.V9h  reason: case insensitive filesystem */
public abstract class C16878V9h {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        C276544tV A0O = DbY.A0O(r10);
        Context requireContext = C308206Td.A01(r9).requireContext();
        UserSession A0Z = DbT.A0Z(r9);
        1Yh A00 = C18138VmE.A00();
        1Yg A002 = VA4.A00();
        String str = "";
        String str2 = str;
        String A0E = A0O.A0E();
        if (A0E != null) {
            str2 = A0E;
        }
        String str3 = str;
        String A0H = A0O.A0H();
        if (A0H != null) {
            str3 = A0H;
        }
        W29 A003 = A002.A00(requireContext, A0Z, str2, str3);
        String str4 = str;
        String A0H2 = A0O.A0H();
        if (A0H2 != null) {
            str4 = A0H2;
        }
        A003.A0A = W29.A02(str4);
        String A0E2 = A0O.A0E();
        if (A0E2 != null) {
            str = A0E2;
        }
        A003.A04 = new SimpleImageUrl(str);
        A003.A06 = A0O.A0D();
        A003.A05 = A0O.A0D();
        A003.A02 = PromoteLaunchOrigin.HEC_APPEAL;
        A00.A0B(A003);
        return null;
    }
}
