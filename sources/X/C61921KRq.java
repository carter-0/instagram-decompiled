package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.KRq  reason: case insensitive filesystem */
public final class C61921KRq extends C323586xk {
    public C63918LCj A00;
    public C363548ju A01;
    public boolean A02;
    public boolean A03;
    public final CallerContext A04 = CallerContext.A01("FxIgFbFeedCrosspostingACUpsellImpl");
    public final 1wn A05;
    public final UserSession A06;
    public final K4Y A07;

    public final void showUpsell(C66520MUy mUy, Activity activity) {
        0qQ.A0B(activity, 1);
        UserSession userSession = this.A06;
        AnonymousClass1Nd.A00(userSession).A01(this.A05, C64655Lfh.class);
        K4Y A002 = C63268KuD.A00(userSession, this.entryPoint);
        A002.A01(new M1J(activity, this, A002, mUy), activity);
        if (!0qQ.A0K(this.entryPoint, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL") || !C63269KuE.A00(userSession).booleanValue()) {
            0xY A0N = AnonymousClass7TF.A0N(userSession);
            A0N.E5T(AnonymousClass000.A00(291), true);
            A0N.apply();
        } else {
            this.A03 = true;
        }
        FFL.A02(C48152EZu.A06, userSession, "upsell_impressions", (Map) null, 2);
        A00(C368278sM.VIEW, this);
        if (182.A06(0Tu.A05, userSession, 36319746694717028L)) {
            C317826nu A003 = C317816nt.A00(userSession);
            String str = this.entryPoint;
            0qQ.A0B(str, 0);
            A003.A03.remove(str);
        }
    }

    public static final void A00(C368278sM r6, C61921KRq kRq) {
        UserSession userSession = kRq.A06;
        AnonymousClass818 r4 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_BUTTON;
        AnonymousClass819 r3 = AnonymousClass819.BOTTOMSHEET_UNLINKED_USER_FEED;
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A09(AnonymousClass7TE.A0u());
        JTT.A1C(A0O, 1);
        C368288sN.A00(r4, r6, r3, A0O, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r1.getBoolean(r0, false) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r7.A03 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r2.A02(r7.entryPoint) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r2.A01(r7.entryPoint);
        r2.A00(r7.entryPoint);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36319746694717028L) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r0 = X.C317816nt.A00(r4);
        r1 = r7.entryPoint;
        X.0qQ.A0B(r1, 0);
        r0.A03.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (X.182.A06(r3, r4, 2342162755908279907L) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        if (r5 != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01() {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r4 = r7.A06
            X.0Tu r3 = X.0Tu.A06
            r0 = 36319746693668437(0x81089e00021e55, double:3.032092284732628E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r5 = 0
            if (r0 != 0) goto L_0x00ec
            java.lang.Boolean r0 = X.C63269KuE.A00(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c2
            X.DeP r2 = new X.DeP
            r2.<init>(r4)
            java.lang.String r6 = r7.entryPoint
            X.0qQ.A0B(r6, r5)
            int r1 = r6.hashCode()
            r0 = -1574224499(0xffffffffa22b3d8d, float:-2.3207406E-18)
            if (r1 == r0) goto L_0x00ad
            r0 = -773734548(0xffffffffd1e1bf6c, float:-1.21197396E11)
            if (r1 == r0) goto L_0x0098
            r0 = 1949671265(0x74359f61, float:5.755849E31)
            if (r1 != r0) goto L_0x0051
            java.lang.String r0 = "IG_LOGOUT_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 293(0x125, float:4.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x004b:
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x0055
        L_0x0051:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00c2
        L_0x0055:
            java.lang.String r0 = r7.entryPoint
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = r7.entryPoint
            r2.A01(r0)
            java.lang.String r0 = r7.entryPoint
            r2.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319746694717028(0x81089e00121e64, double:3.032092285395761E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0082
            X.6nu r0 = X.C317816nt.A00(r4)
            java.lang.String r1 = r7.entryPoint
            X.0qQ.A0B(r1, r5)
            java.util.Map r0 = r0.A03
            r0.remove(r1)
        L_0x0082:
            r0 = 2342162755908279907(0x2081089e00101e63, double:4.065371098733567E-152)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00c2
        L_0x008d:
            r5 = 1
        L_0x008e:
            X.EZu r3 = X.C48152EZu.A06
            r2 = 2
            r1 = 0
            java.lang.String r0 = "upsell_impression_limit_hit"
            X.FFL.A02(r3, r4, r0, r1, r2)
        L_0x0097:
            return r5
        L_0x0098:
            r0 = 218(0xda, float:3.05E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 612(0x264, float:8.58E-43)
            goto L_0x00bd
        L_0x00ad:
            java.lang.String r0 = "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 291(0x123, float:4.08E-43)
        L_0x00bd:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x004b
        L_0x00c2:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314403754215962(0x8103c200000a1a, double:3.028713388308592E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x008d
            X.0xa r1 = X.AnonymousClass7TE.A0q(r4)
            r0 = 291(0x123, float:4.08E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x00ec
            r0 = 2342162755908148833(0x2081089e000e1e61, double:4.065371098622427E-152)
            boolean r5 = X.182.A06(r3, r4, r0)
        L_0x00ec:
            if (r5 == 0) goto L_0x0097
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61921KRq.A01():boolean");
    }

    public final C66543MVx getUpsellContent() {
        UserSession userSession = this.A06;
        return (M1M) userSession.A01(M1M.class, new C73662Phb(userSession, 21));
    }

    public final void prefetchEligibility() {
        boolean z;
        UserSession userSession = this.A06;
        if (!C63269KuE.A00(userSession).booleanValue()) {
            z = A01();
        } else {
            z = false;
        }
        if (!isKillswitchEnabled() && !z && !isLinked()) {
            C317816nt.A00(userSession).A09(DbT.A05(this.context), userSession, (G75) null, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL", (String) null, true, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61921KRq(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AnonymousClass7TG.A1P(userSession, str);
        this.A06 = userSession;
        this.A07 = C63268KuD.A00(userSession, str);
        this.A05 = C64698LgT.A00(this, 64);
    }

    public final boolean isUpsellEligible() {
        if (isKillswitchEnabled() || A01() || isLinked()) {
            return false;
        }
        UserSession userSession = this.A06;
        if (C363038ix.A01(userSession) && !182.A06(0Tu.A05, userSession, 36329595053555923L)) {
            return false;
        }
        if (182.A06(0Tu.A05, userSession, 36319746694520418L) || C317816nt.A00(userSession).A0B(userSession, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL", true)) {
            return 182.A06(0Tu.A06, userSession, 36315383006825628L);
        }
        return false;
    }
}
