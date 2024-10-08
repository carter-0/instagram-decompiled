package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.HVz  reason: case insensitive filesystem */
public abstract class C54868HVz {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        C243363Yl r1;
        Object A03 = r11.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A02 = r11.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        Object A032 = r11.A03(2);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) A032;
        Object obj = r11.A00.get(3);
        UserSession A0B = C308206Td.A0B(r10);
        if (!(A0B instanceof UserSession)) {
            return null;
        }
        UserSession userSession = A0B;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, str);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        if (!str.equals("media")) {
            return null;
        }
        1E8 A00 = 1E7.A00(userSession);
        1Xj A022 = A00.A02(str2);
        if (A022 == null) {
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            1Xx parseFromJson = AnonymousClass1Xw.parseFromJson(16P.A00(002.A0g("{\"id\": \"", str2, "\"}")));
            0qQ.A07(parseFromJson);
            A022 = 1Xv.A02(parseFromJson);
            if (A022 != null) {
                A00.A01(A022, A1U, false);
            }
        }
        if (!str3.equals("has_liked")) {
            return null;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (AnonymousClass7TE.A1a(obj)) {
            r1 = C243363Yl.LIKED;
        } else {
            r1 = C243363Yl.NOT_LIKED;
        }
        if (A022 == null) {
            return null;
        }
        C54994HaR.A00(userSession, A022.A1a(), r1, A022);
        return null;
    }
}
