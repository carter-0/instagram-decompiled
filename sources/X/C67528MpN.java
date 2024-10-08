package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MpN  reason: case insensitive filesystem */
public final class C67528MpN implements AnonymousClass2gO {
    public final /* synthetic */ C66633Ma2 A00;

    public C67528MpN(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C67541Mpb mpb;
        AnonymousClass9VE r0;
        AnonymousClass9VF r6;
        Long l;
        String str;
        C67550Mpk mpk = (C67550Mpk) obj;
        0qQ.A0B(mpk, 0);
        if (mpk.A00 != null && (mpb = this.A00.A0k) != null && (r0 = ((C67550Mpk) mpb.A05.getValue()).A00) != null && (r6 = r0.A03) != null && (l = r0.A05) != null) {
            if (AnonymousClass30M.A03(AnonymousClass30K.A04(AnonymousClass30J.SECONDS, l.longValue())) > System.currentTimeMillis()) {
                UserSession userSession = mpb.A02;
                if (AnonymousClass7TE.A0q(userSession).getInt(002.A0O("sip_education_notice_interstitial_shown_", r6.hashCode()), 0) <= 0 && (str = r6.A00) != null) {
                    C68996NcY ncY = new C68996NcY(str);
                    AnonymousClass7TE.A1Z(new C66167MGe((Object) mpb, (Object) ncY, (AnonymousClass4D7) null, 27), C318116oQ.A00(mpb));
                }
            }
        }
    }
}
