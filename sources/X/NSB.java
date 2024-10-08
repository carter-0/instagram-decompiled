package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class NSB extends 0ng {
    public final /* synthetic */ C74534PwT A00;
    public final /* synthetic */ AnonymousClass2iL A01;
    public final /* synthetic */ UserSession A02;

    public final void run() {
        AnonymousClass2iL r9 = this.A01;
        if (r9.A0Y == AnonymousClass05K.A00) {
            r9.A0Y = AnonymousClass05K.A01;
        }
        UserSession userSession = this.A02;
        1NK r0 = r9.A0c;
        AnonymousClass1Nu r8 = r0.A0F;
        ImageUrl imageUrl = r9.A0L;
        C227052iZ r11 = r9.A0A;
        0jG r7 = r0.A0E;
        1zH r10 = r0.A02;
        0fA r6 = r0.A0D;
        C51974G9v.A1K(userSession, r8, imageUrl);
        OVR ovr = new OVR(r6, r7, r8, r9, r10, r11, userSession, imageUrl);
        AnonymousClass0eM r02 = C71105Ocj.A05;
        C71105Ocj A002 = C69851NtF.A00(ovr.A06);
        ImageUrl imageUrl2 = ovr.A07;
        A002.A03(new C71877OsL(ovr, 0), JTP.A0o(imageUrl2));
        0jG r03 = ovr.A02;
        if (r03 != null) {
            r03.Cim(imageUrl2, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSB(C74534PwT pwT, AnonymousClass2iL r5, UserSession userSession, boolean z) {
        super(123263072, 2, z, true);
        this.A01 = r5;
        this.A00 = pwT;
        this.A02 = userSession;
    }
}
