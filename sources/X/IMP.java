package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IMP implements C270754hF {
    public final String A00;
    public final String A01;
    public final String A02;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A00;
        String str3 = this.A02;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0Q(C54195H2p.class, C56247HvE.class);
        C51968G9o.A1K(A0b, "clips/ad_preview/", str);
        A0b.A0G("cta_text", str2);
        A0b.A0G("political_byline_text", str3);
        1OC A0M = A0b.A0M();
        0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A0M;
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A01;
        String str3 = this.A00;
        String str4 = this.A02;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0Q(C54195H2p.class, C56247HvE.class);
        C51968G9o.A1K(A0b, "clips/ad_preview/", str2);
        A0b.A0G("cta_text", str3);
        A0b.A0G("political_byline_text", str4);
        1OC A0M = A0b.A0M();
        0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A0M;
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMP(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
