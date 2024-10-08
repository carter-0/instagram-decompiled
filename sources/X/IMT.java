package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class IMT implements C270754hF {
    public Context A00;
    public GEP A01;
    public C290515fR A02 = null;
    public final AnonymousClass9JG A03;
    public final C270694h9 A04;
    public final String A05;

    public IMT(Context context, AnonymousClass9JG r3, C270694h9 r4, String str) {
        this.A00 = context;
        this.A03 = r3;
        this.A05 = str;
        this.A04 = r4;
        this.A01 = null;
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        Map map;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        String str = A002.A00;
        String str2 = A002.A01;
        Context context = this.A00;
        if (context == null) {
            context = C51966G9m.A0P(userSession);
        }
        AnonymousClass9JG r3 = this.A03;
        String str3 = this.A05;
        C290515fR r0 = this.A02;
        String str4 = null;
        if (r0 != null) {
            map = r0.Bk0();
        } else {
            map = null;
        }
        Map AUH = this.A04.AUH("ads/async_ads/");
        GEP gep = this.A01;
        if (gep != null) {
            str4 = gep.A00();
        }
        1OC A003 = GLD.A00(context, r3, userSession2, str, str2, str3, str4, map, AUH);
        0qQ.A0C(A003, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A003;
    }

    public final 1OC C42(UserSession userSession, String str) {
        Map map;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        String str2 = A002.A00;
        String str3 = A002.A01;
        Context context = this.A00;
        if (context == null) {
            context = C51966G9m.A0P(userSession);
        }
        AnonymousClass9JG r3 = this.A03;
        String str4 = this.A05;
        C290515fR r0 = this.A02;
        String str5 = null;
        if (r0 != null) {
            map = r0.Bk0();
        } else {
            map = null;
        }
        Map AUH = this.A04.AUH("ads/async_ads/");
        GEP gep = this.A01;
        if (gep != null) {
            str5 = gep.A00();
        }
        1OC A003 = GLD.A00(context, r3, userSession2, str2, str3, str4, str5, map, AUH);
        0qQ.A0C(A003, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A003;
    }

    public final void ES0(GEP gep) {
        0qQ.A0B(gep, 0);
        this.A01 = gep;
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }

    public final void ESn(Context context) {
        this.A00 = context;
    }

    public final void Elk(C290515fR r1) {
        this.A02 = r1;
    }
}
