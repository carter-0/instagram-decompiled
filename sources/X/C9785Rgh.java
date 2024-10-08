package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import java.util.Map;

/* renamed from: X.Rgh  reason: case insensitive filesystem */
public abstract class C9785Rgh {
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        0hq supportFragmentManager;
        C307896Rx r9 = r21;
        C307786Rm A09 = C308206Td.A09(r9);
        AnonymousClass6Tm r3 = r22;
        Object A02 = r3.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0p = DbX.A0p(r3, "null cannot be cast to non-null type kotlin.String");
        String A0n = Pxg.A0n(r3, 3);
        String A0n2 = Pxg.A0n(r3, 4);
        String A0n3 = Pxg.A0n(r3, 5);
        String A0n4 = Pxg.A0n(r3, 6);
        String A0n5 = Pxg.A0n(r3, 7);
        Object A03 = r3.A03(8);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A03;
        String A0n6 = Pxg.A0n(r3, 9);
        String A0n7 = Pxg.A0n(r3, 10);
        C277014uI A0P = DbW.A0P(r3, 11);
        C277014uI A0P2 = DbW.A0P(r3, 12);
        FragmentActivity A032 = C308206Td.A03(A09);
        0qQ.A0B(map, 0);
        Map map2 = (Map) Pxh.A0f("ranges", "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>", map);
        LinkableTextParams linkableTextParams = new LinkableTextParams((String) Pxh.A0f("text", "null cannot be cast to non-null type kotlin.String", map), DbW.A04(map2.get("length"), "null cannot be cast to non-null type kotlin.Int"), DbW.A04(map2.get("offset"), "null cannot be cast to non-null type kotlin.Int"), (String) Pxh.A0f("url", "null cannot be cast to non-null type kotlin.String", map2));
        AnonymousClass2E0.A01();
        if (A032 == null || (supportFragmentManager = A032.getSupportFragmentManager()) == null) {
            throw AnonymousClass7TE.A0w("Input fragment or fragmentActivity cannot be null");
        }
        SUj.A0H(C9654ReY.A00(supportFragmentManager, new PaypalConsentLaunchParams((LoggingPolicy) null, linkableTextParams, str, A0p, A0n, A0n5, A0n3, A0n4, A0n2, A0n6, A0n7, false)), new C11650Sds(r9, A0P, A0P2, 14));
        return null;
    }
}
