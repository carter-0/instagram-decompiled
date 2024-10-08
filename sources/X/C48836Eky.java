package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Eky  reason: case insensitive filesystem */
public abstract class C48836Eky {
    public static final void A00(C48136EZe eZe, AnonymousClass0iw r22, UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        int i3 = i;
        AnonymousClass0iw r3 = r22;
        UserSession userSession2 = userSession;
        int A02 = DbW.A02(0, userSession2, r3);
        int i4 = i2;
        String A00 = C69838Nt2.A00(i4);
        DirectShareTarget directShareTarget2 = directShareTarget;
        String A08 = directShareTarget2.A08();
        if (!(i4 == A02 || i4 == 6)) {
            i3 = -1;
        }
        long j = (long) i3;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        String str11 = str6;
        if (z) {
            C3265677h.A0C(eZe, r3, userSession2, directShareTarget2, A00, A08, (String) null, str, (String) null, str7, str8, str9, str10, str11, "DIRECT_RESHARE_SHEET", j, -1);
        } else {
            C3265677h.A0H(r3, userSession2, directShareTarget2, A00, A08, (String) null, str7, str8, str9, str10, str11, "DIRECT_RESHARE_SHEET", j, -1);
        }
    }
}
