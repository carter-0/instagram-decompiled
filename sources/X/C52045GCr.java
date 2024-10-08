package X;

import com.instagram.common.session.UserSession;
import org.json.JSONArray;

/* renamed from: X.GCr  reason: case insensitive filesystem */
public final class C52045GCr {
    public String A00;
    public String A01;
    public String A02;
    public final UserSession A03;
    public final GBE A04;

    public C52045GCr(UserSession userSession, GBE gbe) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = gbe;
    }

    public static final 1OC A00(C52045GCr gCr) {
        JSONArray jSONArray = new JSONArray();
        String str = gCr.A01;
        if (str != null) {
            for (Object put : 00l.A0Q(str, new char[]{','}, 0)) {
                jSONArray.put(put);
            }
        }
        String A10 = DbT.A10(jSONArray);
        gCr.A01 = null;
        1OC A032 = AnonymousClass93V.A03((AnonymousClass1O9) null, gCr.A03, A10);
        0qQ.A0C(A032, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgResponse, com.instagram.api.response.IgResponse>");
        return A032;
    }

    public static final 1OC A01(C52045GCr gCr, String str) {
        String str2 = gCr.A00;
        if (str2 == null && gCr.A02 == null && gCr.A01 == null) {
            return null;
        }
        if (gCr.A01 != null) {
            return A00(gCr);
        }
        1OC A042 = AnonymousClass93V.A04(gCr.A03, str2, gCr.A02, str);
        0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgResponse, com.instagram.api.response.IgResponse>");
        gCr.A00 = null;
        gCr.A02 = null;
        return A042;
    }

    public static final Object A02(C52045GCr gCr, AnonymousClass4D7 r5, AnonymousClass0r6 r6) {
        if (r6 != null) {
            Object A012 = AnonymousClass11O.A01(r5, JUM.A03(new C58092ImE(gCr, (AnonymousClass4D7) null, 21), JUM.A04(new C58100ImM(gCr, (AnonymousClass4D7) null, 7), JUM.A02(C58711IwK.A00(gCr, 32), r6))));
            if (A012 == 1Hj.A02) {
                return A012;
            }
        }
        return C60340gF.A00;
    }
}
