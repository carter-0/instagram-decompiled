package X;

import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDo  reason: case insensitive filesystem */
public final class C61587KDo extends C228042kh {
    public final LTO A00;
    public final CreatorLoggingData A01;
    public final UserSession A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        String str = this.A03;
        AnonymousClass7TG.A1N(userSession, str);
        return new C60185Jh4(this.A00, this.A01, new C59775JXt(userSession), new LAZ(new LCv(userSession, 1vm.A01(userSession), str)), AnonymousClass2BF.A00().A03(), userSession);
    }

    public C61587KDo(LTO lto, CreatorLoggingData creatorLoggingData, UserSession userSession, String str) {
        C51974G9v.A1P(userSession, lto, str, creatorLoggingData);
        this.A02 = userSession;
        this.A00 = lto;
        this.A03 = str;
        this.A01 = creatorLoggingData;
    }
}
