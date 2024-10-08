package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.Rh5  reason: case insensitive filesystem */
public abstract class C9809Rh5 {
    public static Object A00(C307896Rx r24, AnonymousClass6Tm r25) {
        AnonymousClass2gB A02;
        AnonymousClass6Tm r2 = r25;
        String A00 = Q3L.A00(r2);
        String A022 = Q3L.A02(r2.A02());
        List list = r2.A00;
        String A0t = DbU.A0t(list, 2);
        String A0t2 = DbU.A0t(list, 3);
        Map map = (Map) list.get(4);
        C277014uI A0P = DbW.A0P(r2, 5);
        C277014uI A0P2 = DbW.A0P(r2, 6);
        C307896Rx r252 = r24;
        FragmentActivity A04 = C308206Td.A04(r252);
        if (map == null) {
            map = AnonymousClass7TE.A1E();
        }
        S6S s6s = new S6S(A0t2, A022, A00, A0t, map);
        0qQ.A0B(A04, 0);
        Bundle A0a = AnonymousClass7TE.A0a();
        String str = s6s.A03;
        if (!(str == null || str.length() == 0)) {
            A0a.putString("PAYMENT_ACCOUNT_ID", str);
        }
        String str2 = s6s.A00;
        if (str2 != null) {
            A0a.putString("AUTH_METHOD_TYPE", str2);
        }
        String str3 = s6s.A01;
        A0a.putString("PAYMENT_TYPE", str3);
        C11249SHj sHj = new C11249SHj();
        sHj.A01(s6s.A02);
        sHj.A01 = str3;
        Pxi.A0y(A0a, sHj);
        Map map2 = s6s.A04;
        Object obj = map2.get("capabilities");
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        A0a.putStringArray("PTT_UTIL_CAP_NAMES", DbU.A1b((List) obj, 0));
        if ("PAYPAL_ACCESS_TOKEN".equals(str2)) {
            A0a.putBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", true);
            C10440RsH A002 = C11301SKl.A00(A0a, new C11027S6f((C45888D9m) null, (String) Pxh.A0f("secret_value", "null cannot be cast to non-null type kotlin.String", map2), (String) Pxh.A0f("credential_id", "null cannot be cast to non-null type kotlin.String", map2), (String) null, (String) null, (String) null, str2, (String) null, (String) null, (String) null), "CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
            SSY A023 = AnonymousClass2E0.A03().A02(A04);
            String str4 = (String) Pxh.A0f("target_operation", "null cannot be cast to non-null type kotlin.String", map2);
            Object obj2 = map2.get("ptt_payload");
            if (obj2 == null) {
                obj2 = 0Yt.A0E();
            }
            A02 = A023.A04(A002, obj2, str4);
        } else {
            SQ8.A02("VERIFY_PIN_TO_PAY", A0a);
            SQ8.A03("VERIFY_PIN", A0a);
            AnonymousClass2gB A0M = Pxh.A0M();
            if ("PIN".equals(str2)) {
                QDI create = AnonymousClass2E0.A03().A00().create(QDI.class);
                Pxi.A1A(create.A06, A0M, new C74179PqL(A0M, 40), 9);
                Pxi.A1A(create.A07, A0M, new C74179PqL(A0M, 41), 9);
                create.A02(A0a, (C11330SNj) null);
                create.A03((String) Pxh.A0f("secret_value", "null cannot be cast to non-null type kotlin.String", map2));
            } else if (!"CSC".equals(str2)) {
                SUj.A0K(A0M, (Object) null);
            } else {
                QDF create2 = AnonymousClass2E0.A03().A00().create(QDF.class);
                Pxi.A1A(create2.A05, A0M, new C74179PqL(A0M, 42), 9);
                AnonymousClass2gB r10 = create2.A06;
                Pxi.A1A(r10, A0M, new C74179PqL(A0M, 43), 9);
                A0a.putString("CREDENTIAL_ID", (String) Pxh.A0f("credential_id", "null cannot be cast to non-null type kotlin.String", map2));
                create2.A02(A0a);
                create2.A02 = (String) Pxh.A0f("secret_value", "null cannot be cast to non-null type kotlin.String", map2);
                r10.A0A((Object) null);
                if (!TextUtils.isEmpty(create2.A02) && create2.A02.length() == create2.A01()) {
                    QDF.A00(create2);
                }
            }
            A02 = AnonymousClass72Y.A02(A0M, new TYA(36, (Object) s6s, (Object) A0a));
        }
        A02.A06(A04, new C11650Sds(r252, A0P, A0P2, 15));
        return null;
    }
}
