package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1;

/* renamed from: X.Jfd  reason: case insensitive filesystem */
public final class C60097Jfd extends C361478gI {
    public String A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final 05G A04 = 106.A01(KW4.A00);
    public final int A05;
    public final C322986wk A06;
    public final String A07 = AnonymousClass7TG.A0j();
    public final boolean A08;

    public final void A0E() {
        05G r2 = this.A04;
        Object value = r2.getValue();
        C16136UpN upN = C16136UpN.A00;
        if (!0qQ.A0K(value, upN) && this.A00 != null) {
            r2.Epw(upN);
            C322986wk r4 = this.A06;
            Context A0P = JTR.A0P(this);
            UserSession userSession = this.A02;
            String str = this.A03;
            String str2 = this.A07;
            Integer valueOf = Integer.valueOf(this.A05);
            String str3 = this.A00;
            Boolean A0v = AnonymousClass7TE.A0v();
            Boolean valueOf2 = Boolean.valueOf(this.A08);
            AnonymousClass7TE.A1Z(new StoryHighlightsRepository$fetchMoreStoryHighlights$1(A0P, userSession, r4, A0v, valueOf2, valueOf, str, str2, str3, (AnonymousClass4D7) null, false), r4.A01);
        }
    }

    public final void A0F() {
        C322986wk r1 = this.A06;
        Context A0P = JTR.A0P(this);
        UserSession userSession = this.A02;
        String str = this.A03;
        r1.A00(A0P, userSession, C318466oz.A00, AnonymousClass7TE.A0v(), AnonymousClass7TE.A0u(), Boolean.valueOf(this.A08), Integer.valueOf(this.A05), str, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60097Jfd(Application application, AnonymousClass0iw r6, UserSession userSession, String str, int i, boolean z) {
        super(application);
        AnonymousClass7TG.A1O(userSession, str);
        AnonymousClass7TG.A1S(r6, application);
        this.A02 = userSession;
        this.A03 = str;
        this.A05 = i;
        this.A08 = z;
        this.A01 = r6;
        C322986wk r1 = new C322986wk(3, false);
        this.A06 = r1;
        DbY.A19(this, new C51648Fy7(this, (AnonymousClass4D7) null, 35), r1.A01);
    }
}
