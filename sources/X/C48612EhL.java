package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.EhL  reason: case insensitive filesystem */
public abstract class C48612EhL {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        C307786Rm A0L = Dbb.A0L(r8);
        Object A02 = r8.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C276544tV r0 = ((C3034368u) A02).A02;
        0qQ.A07(r0);
        C276544tV A00 = C9812Rha.A00(A0L, r7, r0);
        String A0F = A00.A0F();
        String A0D = A00.A0D();
        UserSession A0B = C308206Td.A0B(r7);
        if ((A0B instanceof UserSession) && A0F != null) {
            String str = "DEFAULT";
            if (!0qQ.A0K(A0D, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) && 0qQ.A0K(A0D, "caption")) {
                str = "caption";
            }
            C309516Yo A0M = DbS.A0M(C308206Td.A04(r7), A0B);
            A0M.A0B((Bundle) null, W0l.A02(A0B, C281965Ag.A00(A0F), C308206Td.A08(r7).getModuleName(), str));
            A0M.A04();
        }
        return null;
    }
}
