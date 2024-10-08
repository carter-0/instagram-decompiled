package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.Mqm  reason: case insensitive filesystem */
public final class C67614Mqm {
    public C331157Pu A00;
    public boolean A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final F1F A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass37D A07;
    public final C49727F3r A08;
    public final Boolean A09;
    public final String A0A;
    public final String A0B;
    public final Map A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A01(new C58175Inf(this, 1));
    public final AnonymousClass0eM A0H;
    public final 0wc A0I;
    public final Integer A0J;

    public C67614Mqm(FragmentActivity fragmentActivity, F1F f1f, AnonymousClass0iw r6, UserSession userSession, C331157Pu r8, C49727F3r f3r, Boolean bool, Integer num, String str, String str2, Map map) {
        int A022 = DbW.A02(1, userSession, fragmentActivity);
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A0C = map;
        this.A0A = str;
        this.A0J = num;
        this.A05 = r6;
        this.A08 = f3r;
        this.A0B = str2;
        this.A00 = r8;
        this.A09 = bool;
        this.A04 = f1f;
        this.A0I = AnonymousClass0kN.A01(r6, userSession);
        this.A07 = DbT.A0i(fragmentActivity);
        this.A0H = AnonymousClass0eN.A01(new C58175Inf(this, A022));
        this.A0D = AnonymousClass0eN.A01(new MMF(this, 48));
        this.A0E = AnonymousClass0eN.A01(new MMF(this, 49));
        this.A0F = AnonymousClass0eN.A01(new C58175Inf(this, 0));
    }

    public static final void A00(C21123XFn xFn, C67614Mqm mqm) {
        String A11;
        0Aj A0e = AnonymousClass7TE.A0e(mqm.A0I, "ufix_ig_ixt_trigger");
        if (A0e.isSampled()) {
            0bb r3 = new 0bb();
            Map map = mqm.A0C;
            Object obj = map.get("trigger_session_id");
            if (obj != null) {
                r3.A06(MYP.A00(), (String) obj);
                r3.A01(xFn, "event_step");
                r3.A01(C67612Mqk.IXT, "event_source");
                if (0qQ.A0K(map.get("is_e2ee"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                    A11 = "0";
                } else {
                    A11 = DbT.A11("ig_object_value", map);
                }
                r3.A06("entity_id", A11);
                A0e.AAK(r3, "core");
                A0e.AAK((0bb) AnonymousClass7TE.A14(mqm.A0G), "ig");
                A0e.AAK((0bb) AnonymousClass7TE.A14(mqm.A0H), "ixt_trigger");
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A01(C268654dm r4, C67614Mqm mqm) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(mqm.A0I, "ufix_ig_ixt_trigger_fetching_failed");
        if (A0e.isSampled()) {
            Throwable A012 = r4.A01();
            if (A012 == null || (str = A012.getMessage()) == null) {
                OAQ oaq = (OAQ) r4.A00();
                if (oaq != null) {
                    str = oaq.A00;
                } else {
                    str = null;
                }
            }
            A0e.AAK((0bb) AnonymousClass7TE.A14(mqm.A0D), "core");
            A0e.AAK((0bb) AnonymousClass7TE.A14(mqm.A0E), "ig");
            A0e.AAK((0bb) AnonymousClass7TE.A14(mqm.A0F), "ixt_trigger");
            if (str == null) {
                str = "";
            }
            A0e.AAJ("error_message", str);
            A0e.Cgf();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4DH, X.NIR] */
    public static final void A02(C67614Mqm mqm) {
        C331127Pr A0W = DbS.A0W(mqm.A06);
        DbS.A1S(A0W, true);
        A0W.A0x = true;
        A0W.A03 = 0.7f;
        String str = mqm.A0B;
        if (str != null) {
            A0W.A0d = str;
        }
        ? r3 = new AnonymousClass4DH();
        AnonymousClass37D r2 = mqm.A07;
        if (r2 != null) {
            r2.A0Q(new NgD(mqm, 3));
        }
        11Z.A02(new C73338Pax(A0W, mqm, r3));
    }

    public final AnonymousClass3M3 A03() {
        IgBloksScreenConfig A0N = DbS.A0N(this.A06);
        A0N.A05 = new C67613Mql(this);
        A0N.A0R = this.A05.getModuleName();
        F1F f1f = this.A04;
        if (f1f != null) {
            A0N.A03 = f1f;
        }
        return C49891FBs.A02(A0N, C46649DiU.A04(this.A0A, this.A0C));
    }

    public final void A04() {
        if (this.A0J.intValue() != 0) {
            UserSession userSession = this.A06;
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A05 = new C67613Mql(this);
            A0N.A0R = this.A05.getModuleName();
            String str = this.A0B;
            if (str != null) {
                A0N.A0U = str;
            }
            F1F f1f = this.A04;
            if (f1f != null) {
                A0N.A03 = f1f;
            }
            C309516Yo A0Q = DbU.A0Q(this.A03, userSession);
            String str2 = this.A0A;
            AbstractMap abstractMap = (AbstractMap) this.A0C;
            A0Q.A0D(C49891FBs.A02(A0N, C46649DiU.A04(str2, abstractMap)));
            String A0r = DbS.A0r(AnonymousClass000.A00(317), abstractMap);
            if (A0r != null) {
                A0Q.A0A = A0r;
            }
            A0Q.A04();
        } else if (DbX.A1a(this.A09)) {
            new NMN(this).A02(new Void[0]);
        } else {
            C360678ey A052 = C359988do.A05(this.A06, this.A0A, this.A0C);
            A052.A00(new E84(this, 25));
            1ES.A03(A052);
        }
    }
}
