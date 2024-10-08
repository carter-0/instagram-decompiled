package X;

import android.content.Context;
import com.instagram.api.schemas.FileCandidate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P7o  reason: case insensitive filesystem */
public final class C72479P7o implements C328347El {
    public static final C71989OuN A00(Context context, UserSession userSession, AnonymousClass9HC r16, AnonymousClass7LQ r17, AnonymousClass7L2 r18, 17i r19, boolean z) {
        String str;
        String str2;
        String str3;
        C254763t0 A02;
        List B5k;
        Context context2 = context;
        0qQ.A0B(context, 0);
        AnonymousClass7LQ r5 = r17;
        AnonymousClass7L2 r4 = r18;
        17i r3 = r19;
        UserSession userSession2 = userSession;
        C51974G9v.A1P(userSession, r3, r4, r5);
        AnonymousClass9HC r6 = r16;
        0qQ.A0B(r6, 5);
        C254703su r10 = r5.A0e;
        2FW r0 = r10.A10;
        0qQ.A07(r0);
        String str4 = null;
        String str5 = null;
        AnonymousClass7FE A0V = C66582MXn.A0V(userSession2, r6, r5, r4, r0);
        AnonymousClass7FT A00 = AnonymousClass7FG.A00(context, userSession2, r6, r5, 2FW.A0u);
        1iA A0W = r10.A0W();
        1iA r2 = 1iA.A0E;
        if (A0W == r2) {
            1Xj r02 = r10.A0s;
            if (r02 == null || (B5k = r02.A0C.B5k()) == null || B5k.isEmpty()) {
                C300925yB r11 = r10.A0v;
                if (r11 != null && r11.A01 == r2) {
                    str2 = r11.A04;
                    str5 = r11.A05;
                    str = null;
                    str3 = null;
                    AnonymousClass7SD r03 = r5.A0G;
                    0qQ.A07(r03);
                    C254793t3 r04 = r03.A0P;
                    if (!(r04 == null || (A02 = C300965yF.A02(r04)) == null)) {
                        str4 = A02.A00;
                    }
                    String A0s = C66582MXn.A0s(userSession2, r10, z);
                    0qQ.A0A(A0s);
                    return new C71989OuN(AnonymousClass7FX.A03(context2, userSession2, r6, r5, r4, r3), new NYL(A00, A0V.A03, str4, str2, str5, str, str3), A0s);
                }
            } else {
                str2 = ((FileCandidate) B5k.get(0)).C7x();
                str5 = ((FileCandidate) B5k.get(0)).B5i();
                str = ((FileCandidate) B5k.get(0)).B5e();
                str3 = ((FileCandidate) B5k.get(0)).Bd4();
                AnonymousClass7SD r032 = r5.A0G;
                0qQ.A07(r032);
                C254793t3 r042 = r032.A0P;
                str4 = A02.A00;
                String A0s2 = C66582MXn.A0s(userSession2, r10, z);
                0qQ.A0A(A0s2);
                return new C71989OuN(AnonymousClass7FX.A03(context2, userSession2, r6, r5, r4, r3), new NYL(A00, A0V.A03, str4, str2, str5, str, str3), A0s2);
            }
        }
        str2 = null;
        str = null;
        str3 = null;
        AnonymousClass7SD r0322 = r5.A0G;
        0qQ.A07(r0322);
        C254793t3 r0422 = r0322.A0P;
        str4 = A02.A00;
        String A0s22 = C66582MXn.A0s(userSession2, r10, z);
        0qQ.A0A(A0s22);
        return new C71989OuN(AnonymousClass7FX.A03(context2, userSession2, r6, r5, r4, r3), new NYL(A00, A0V.A03, str4, str2, str5, str, str3), A0s22);
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r10, C331837So r11, AnonymousClass7L2 r12, 17i r13, boolean z) {
        return A00(context, userSession, r10, (AnonymousClass7LQ) r11, r12, r13, z);
    }
}
