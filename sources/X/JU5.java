package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.List;

public final class JU5 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass07V A03;
    public 1Xj A04;
    public KSf A05;
    public KSX A06;
    public String A07;
    public String A08;
    public List A09 = new ArrayList();
    public List A0A = new ArrayList();
    public List A0B = new ArrayList();
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final UserSession A0G;
    public final JU6 A0H;
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(new MMJ(this, 31));
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(new MMJ(this, 32));
    public final AnonymousClass0eM A0K = AnonymousClass0eN.A01(new MMJ(this, 33));
    public final AnonymousClass0eM A0L = AnonymousClass0eN.A01(new MMJ(this, 34));
    public final AnonymousClass0eM A0M = AnonymousClass0eN.A01(new MMJ(this, 35));
    public final C262224Cq A0N;
    public final C61480nO A0O;

    public JU5(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0G = userSession;
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "IgSignalsClipsOpenComments";
        AnonymousClass0vF r0 = new AnonymousClass0vF(A002);
        this.A0O = r0;
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U(r0).AOJ(1853356536, 3));
        this.A0N = A022;
        this.A0H = new JU6(userSession);
        C66181MGs mGs = new C66181MGs(this, (AnonymousClass4D7) null, 48);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, mGs, A022);
    }

    public static final void A00(JU5 ju5) {
        JUA.A01(ju5.A0A, true);
        JUA.A01(ju5.A0B, ju5.A0D);
        JUA.A01(ju5.A09, ju5.A0C);
        1Av A002 = 1Au.A00(ju5.A0G);
        String A0P = 00k.A0P(",", "", "", ju5.A0A, (0sP) null);
        0s0 r1 = A002.A81;
        AnonymousClass0YZ[] r3 = 1Av.A8a;
        DbS.A1a(A002, A0P, r1, r3, 41);
        DbS.A1a(A002, 00k.A0P(",", "", "", ju5.A0B, (0sP) null), A002.A80, r3, 42);
        DbS.A1a(A002, 00k.A0P(",", "", "", ju5.A09, (0sP) null), A002.A7z, r3, 45);
        if (!ju5.A0D) {
            KSX ksx = ju5.A06;
            if (ksx != null) {
                long currentTimeMillis = System.currentTimeMillis();
                KSU ksu = ksx.A01;
                if (ksu == null) {
                    ksu = LT2.A01(ksx, currentTimeMillis);
                    ksx.A01 = ksu;
                }
                ksu.A01(AnonymousClass7TE.A1I(new IgSignalsFeature(7000004, "open_reel_comments", 0.0d)));
            }
            ju5.A06 = null;
        }
        ju5.A0D = false;
        ju5.A0C = false;
        ju5.A0E = false;
    }
}
