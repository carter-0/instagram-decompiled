package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.immersivemedia.PostCaptureImmersivePhotoViewModel$enabled$1;

/* renamed from: X.8Cj  reason: invalid class name and case insensitive filesystem */
public final class C352208Cj extends AnonymousClass8ZF implements AnonymousClass89Y {
    public C314446iH A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final C357638Yz A03;
    public final C3499482o A04;
    public final AnonymousClass80U A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;

    public C352208Cj(UserSession userSession, C357638Yz r8, C3499482o r9, AnonymousClass80U r10) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r10, 3);
        0qQ.A0B(r8, 4);
        this.A02 = userSession;
        this.A04 = r9;
        this.A05 = r10;
        this.A03 = r8;
        02z A012 = 106.A01((Object) null);
        this.A07 = A012;
        02z r2 = new 02z(true);
        this.A09 = r2;
        this.A0C = r2;
        02z r1 = new 02z(false);
        this.A06 = r1;
        05F A022 = 10b.A02(false, C318116oQ.A00(this), AnonymousClass10H.A00(new PostCaptureImmersivePhotoViewModel$enabled$1(this, (AnonymousClass4D7) null), A012, r2, r1), AnonymousClass10A.A00);
        this.A0A = A022;
        this.A01 = C226292g8.A00(19B.A00, A022);
        02z r0 = new 02z(false);
        this.A08 = r0;
        this.A0B = r0;
    }

    public final boolean onBackPressed() {
        05G r2 = this.A08;
        if (!((Boolean) r2.getValue()).booleanValue()) {
            return false;
        }
        r2.Epw(false);
        this.A05.E3H(new Object());
        return true;
    }
}
