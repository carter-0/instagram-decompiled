package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LCd  reason: case insensitive filesystem */
public final class C63917LCd {
    public final Context A00;
    public final UserSession A01;

    public final C239123Fb A00(String str, String str2) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A01;
        C239123Fb A012 = C46479Dfi.A01(userSession);
        ImmutableList of = ImmutableList.of(str);
        0qQ.A07(of);
        2IS A04 = C41845B3m.A04();
        Context context = this.A00;
        2IV r6 = new 2IV();
        r6.A05(C273654mx.A00(3001), C278514x0.A02(context, new C278504wz(userSession)));
        Pair A013 = C278514x0.A01();
        AnonymousClass0K0 r10 = GraphQlCallInput.A02;
        Object obj = A013.first;
        String A002 = C273654mx.A00(821);
        0Df A03 = C41845B3m.A03(r10, obj, A002);
        0Df.A00(A03, A013.second, "max_version");
        r6.A02().A0E(A03, C273654mx.A00(3394));
        if (182.A06(0Tu.A05, userSession, 36325729582986406L)) {
            Pair A003 = C278514x0.A00();
            0Df A032 = C41845B3m.A03(r10, A003.first, A002);
            0Df.A00(A032, A003.second, "max_version");
            r6.A02().A0E(A032, C273654mx.A00(3392));
        }
        Map A004 = C278484wx.A00();
        Boolean bool = Boolean.TRUE;
        String A005 = C273654mx.A00(2322);
        boolean equals = bool.equals(A004.get(A005));
        String A006 = C273654mx.A00(3190);
        if (!equals) {
            A005 = "";
            if (bool.equals(A004.get(A006))) {
                A005 = A006;
            }
        }
        r6.A09(A005.replace("_compression", "").replace("2", ""), C273654mx.A00(3417));
        A04.A00(r6, "device_capabilities");
        A04.A05("requested_effect_ids", of);
        A04.A04("surface", str2);
        A012.A08(new C239113Fa(A04, C60855JsO.class, "IGAREffectPreviewByIdQuery", false));
        return A012;
    }

    public C63917LCd(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
