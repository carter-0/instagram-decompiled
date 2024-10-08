package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GKW extends C251343mx {
    public final int A00;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final GHN A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final AnonymousClass3W1 A07;
    public final JTB A08;
    public final String A09;
    public final String A0A;

    public GKW(ClipsViewerConfig clipsViewerConfig, C267324bN r3, GHN ghn, C52058GDe gDe, UserSession userSession, 1Xj r7, AnonymousClass3W1 r8, JTB jtb, String str, String str2, int i) {
        0qQ.A0B(ghn, 1);
        C51974G9v.A1S(r7, r8, userSession, str, clipsViewerConfig);
        C51973G9u.A0t(7, r3, gDe, jtb);
        0qQ.A0B(str2, 11);
        this.A03 = ghn;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = userSession;
        this.A09 = str;
        this.A01 = clipsViewerConfig;
        this.A02 = r3;
        this.A04 = gDe;
        this.A08 = jtb;
        this.A00 = i;
        this.A0A = str2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r21) {
        AnonymousClass3Y5 r4 = r21;
        0qQ.A0B(r4, 0);
        AnonymousClass3XV r0 = 2WX.A02;
        2V1 r5 = r4.A05;
        2WX A0x = G9t.A0x(C52112GFg.A01(C51965G9l.A0X((2WX) null, new C243543Ze(r5, C243533Zd.GLOBAL, this.A0A)), 1.0f), AnonymousClass05K.A0C, 0.0f);
        2Wb A0S = AnonymousClass7TG.A0S(r5);
        2V1 r8 = A0S.A00;
        1Xj r14 = this.A06;
        AnonymousClass3W1 r15 = this.A07;
        UserSession userSession = this.A05;
        GHN ghn = this.A03;
        String str = this.A09;
        return C51967G9n.A0N(GKb.A00(r8, this.A01, this.A02, ghn, this.A04, userSession, r14, r15, 0Pl.A0n.A00(C243803a8.A00(A0S), userSession), this.A08, str, this.A00), A0S, r4, A0x);
    }
}
