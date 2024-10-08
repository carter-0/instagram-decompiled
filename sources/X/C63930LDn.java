package X;

import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.common.session.UserSession;

/* renamed from: X.LDn  reason: case insensitive filesystem */
public final class C63930LDn {
    public final AuthenticityUploadMedium A00;
    public final UserSession A01;
    public final MUX A02;
    public final String A03;
    public final String A04;

    public final void A00() {
        1iA r2 = 1iA.A0H;
        String A0Z = JTQ.A0Z();
        String A022 = AnonymousClass6SR.A02();
        0qQ.A07(A022);
        C12075SmU A0e = JTR.A0e(this.A01);
        AnonymousClass7TE.A1Z(new JVS(r2, A0e, this, A0Z, A022, (AnonymousClass4D7) null, 14), AnonymousClass1HX.A01(677, 3));
    }

    public C63930LDn(AuthenticityUploadMedium authenticityUploadMedium, UserSession userSession, MUX mux, String str, String str2) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = authenticityUploadMedium;
        this.A02 = mux;
    }
}
