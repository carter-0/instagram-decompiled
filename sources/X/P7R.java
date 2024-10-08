package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class P7R implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r44, C331837So r45, AnonymousClass7L2 r46, 17i r47, boolean z) {
        C3259574v r16;
        String str;
        AnonymousClass7LQ r2 = (AnonymousClass7LQ) r45;
        Context context2 = context;
        UserSession userSession2 = userSession;
        17i r13 = r47;
        C51973G9u.A1E(context2, userSession2, r13);
        AnonymousClass9HC r3 = r44;
        AnonymousClass7L2 r14 = r46;
        C51973G9u.A0r(3, r14, r2, r3);
        0t0 A01 = AnonymousClass0eN.A01(C73776Pjb.A00);
        C254703su r1 = r2.A0e;
        2FW r5 = r1.A10;
        0qQ.A07(r5);
        AnonymousClass7FE A04 = AnonymousClass7FD.A04(userSession2, r3, r2, r14, r5, A01);
        new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3);
        C254873tC A00 = C3266377o.A00(r1);
        C2606546n r11 = r1.A0N;
        if (r11 != null) {
            r16 = C70863OPc.A01(context2, userSession2, r2, A04.A03, r11, r1.A2P, r2.A0G.A0x, AnonymousClass7F3.A01(r1, userSession2.A06), false);
        } else {
            r16 = null;
        }
        DirectMessageIdentifier A0V = r1.A0V();
        boolean A03 = C3266377o.A03(userSession2, r1);
        String str2 = r1.A1u;
        0qQ.A07(str2);
        User user = r2.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        AnonymousClass7FT A0Y = C66580MXl.A0Y(context2, userSession2, r3, r2, r1);
        AnonymousClass7SD r6 = r2.A0G;
        C254793t3 r7 = r6.A0P;
        int i = r6.A08;
        C254703su r21 = r1;
        C254873tC r22 = A00;
        C254793t3 r25 = r7;
        String str3 = str2;
        AnonymousClass7FE r18 = A04;
        AnonymousClass9HC r19 = r3;
        C328667Fr A042 = AnonymousClass773.A04(context2, r16, A0Y, r18, r19, AnonymousClass773.A01(A00, r3.A1C), r21, r22, (C254873tC) null, A0V, r25, str3, str, r1.A1V, A00.A1C, (String) null, AnonymousClass773.A05(A00, r7, i, true), i, A03, true, false, false, false, false, false, false);
        String A0s = C66582MXn.A0s(userSession2, r1, z);
        0qQ.A0A(A0s);
        return new N5R(new AnonymousClass741(AnonymousClass7FX.A03(context2, userSession2, r3, r2, r14, r13), A042, A0s));
    }
}
