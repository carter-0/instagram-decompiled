package X;

import com.instagram.common.session.UserSession;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;
import com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi;

/* renamed from: X.61D  reason: invalid class name */
public final class AnonymousClass61D implements AnonymousClass2Kv {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass619 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass61D(UserSession userSession, AnonymousClass619 r2, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void invoke(AnonymousClass3JD r4) {
        Object Bny;
        if (r4 != null && (Bny = r4.Bny()) != null) {
            this.A01.DoL(FetchFBToIGDefaultAudienceApi.A01(this.A00, (FBToIGDefaultAudienceSettingQueryResponseImpl) Bny, this.A02));
        }
    }
}
