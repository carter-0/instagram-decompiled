package X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.OsH  reason: case insensitive filesystem */
public final class C71874OsH implements AnonymousClass0iw, C74502Pvw, C74370Ptk, G6V {
    public static final String __redex_internal_original_name = "DirectInboxSearchController";
    public View A00;
    public 0wc A01;
    public C72918PPc A02;
    public C46487Dfq A03;
    public C337257fy A04;
    public SearchController A05;
    public final int A06;
    public final Context A07;
    public final AnonymousClass07i A08;
    public final C249403jg A09 = new C67837Mvh(this, 8);
    public final AnonymousClass4DH A0A;
    public final AnonymousClass0iw A0B;
    public final C252243on A0C = new C50296FXb(this, 1);
    public final UserSession A0D;
    public final 2el A0E;
    public final C72208OyY A0F;
    public final O7O A0G = new O7O(this);
    public final O7P A0H = new O7P(this);
    public final C294875nB A0I;
    public final DirectSearchInboxFragment A0J;
    public final DirectSearchInboxFragment A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public final float Abo(SearchController searchController, Integer num) {
        return 0.0f;
    }

    public final void CvL(SearchController searchController, Integer num, float f, float f2) {
    }

    public final void Dhf(SearchController searchController, boolean z) {
    }

    public final void Dmq(SearchController searchController, Integer num, Integer num2) {
    }

    public final String getModuleName() {
        return "direct_inbox_search";
    }

    public static void A00(C71874OsH osH, DirectSearchPrompt directSearchPrompt, int i, boolean z) {
        String str;
        int i2;
        if (z) {
            str = "igd_universal_search:ai_prompt";
        } else {
            str = "igd_universal_search:ai_typeahead";
        }
        DirectSearchPrompt directSearchPrompt2 = directSearchPrompt;
        if (A01(C70892OQk.A00(HNL.NULL_STATE_PROMPT, (C53229Gkd) null, osH.A0D, directSearchPrompt.A02, (String) null), osH, str, directSearchPrompt.A03, false)) {
            C294875nB r2 = osH.A0I;
            int i3 = i;
            if (z) {
                i2 = i % 3;
            } else {
                i2 = i;
            }
            int i4 = 41;
            if (z) {
                i4 = 40;
            }
            r2.Dk6((C67058MhZ) null, directSearchPrompt2, str, i2, i3, -1, -1, i4);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.NSQ, java.lang.Runnable] */
    public static boolean A01(C68112N1a n1a, C71874OsH osH, String str, String str2, boolean z) {
        String str3;
        Long l;
        C71874OsH osH2 = osH;
        AnonymousClass4DH r7 = osH2.A0A;
        if (r7.getActivity() == null) {
            return false;
        }
        UserSession userSession = osH2.A0D;
        C72208OyY oyY = osH2.A0F;
        ((C67211Mk7) C73467Pd9.A00(userSession, oyY)).A01();
        NPE npe = osH2.A02.A01;
        P4D p4d = null;
        if (npe != null) {
            str3 = npe.A01;
            l = Long.valueOf(npe.A00);
        } else {
            str3 = null;
            l = null;
        }
        OO3 oo3 = oyY.A01;
        if (oo3 != null) {
            oo3.A09 = oo3.A0G.schedule(new NSQ(oo3, l, str3, z), 2, TimeUnit.SECONDS);
        }
        AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(userSession);
        FragmentActivity activity = r7.getActivity();
        DirectShareTarget directShareTarget = osH2.A02.A03;
        0Tu A0J2 = DbS.A0J(userSession, 0);
        boolean A062 = 182.A06(A0J2, userSession, 36324831934820747L);
        String str4 = str;
        String str5 = str2;
        if (!str4.equals("igd_universal_search:ai_prompt") && str2 != null && !str5.isEmpty()) {
            p4d = new P4D(osH2, 2);
        }
        boolean A0B2 = aiAgentThreadLauncher.A0B(activity, n1a, osH2, p4d, directShareTarget, (C273414mX) null, str4, str5, A062, false, false, false);
        if (!A0B2) {
            String A0k = DbS.A0k();
            if (A0k == null) {
                A0k = "";
            }
            C69836Nsy.A00(osH2.A01, osH2.A02.A03, A0k, str4, Log.getStackTraceString(new Exception()), __redex_internal_original_name, 182.A04(A0J2, userSession, 36882348756763071L), "", "");
        }
        return A0B2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r2 = this;
            X.7fy r0 = r2.A04
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.BiY()
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.trim()
        L_0x000e:
            java.util.regex.Pattern r1 = X.0mp.A06
            int r0 = X.DbX.A05(r0)
            return r0
        L_0x0015:
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = r2.A0J
            X.MtP r0 = X.C66581MXm.A0W(r0)
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x000e
        L_0x001f:
            java.lang.String r0 = ""
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71874OsH.A02():int");
    }

    public final String A03() {
        C337257fy r0 = this.A04;
        if (r0 != null) {
            String BiY = r0.BiY();
            if (BiY != null) {
                return BiY.trim();
            }
            return "";
        }
        String str = C66581MXm.A0W(this.A0J).A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void A04(String str) {
        OIK oik;
        SearchController searchController = this.A05;
        if (searchController != null && (oik = searchController.mViewHolder) != null) {
            oik.A0F.setText(str);
            SearchEditText searchEditText = oik.A0F;
            Pattern pattern = 0mp.A06;
            searchEditText.setSelection(DbX.A05(str));
        }
    }

    public final void DDU() {
        DirectSearchInboxFragment directSearchInboxFragment = this.A0K;
        FragmentActivity activity = this.A0A.getActivity();
        if (activity != null) {
            int length = A03().length();
            UserSession userSession = this.A0D;
            0qQ.A0B(userSession, 1);
            if (length >= 2 && 1Wj.A00 != null) {
                DcL.A00().A02(activity, userSession, "2220597908338813", (Map) null);
            }
        }
        if (directSearchInboxFragment != null) {
            directSearchInboxFragment.A03();
        }
        this.A0F.A06((long) A02());
    }

    public final void DRx() {
        String str;
        this.A0F.A0B(AnonymousClass05K.A0B, 1, (long) A02());
        if (A02() == 0) {
            str = "igd_universal_search:ai_nullstate_airplane_send";
        } else {
            str = "igd_universal_search:ai_typeahead_airplane_send";
        }
        A01((C68112N1a) null, this, str, A03(), false);
    }

    public final void DRz() {
        String str;
        this.A0F.A0B(AnonymousClass05K.A0B, 3, (long) A02());
        if (A02() == 0) {
            str = "igd_universal_search:ai_nullstate_donut";
        } else {
            str = "igd_universal_search:ai_typeahead_donut";
        }
        A01((C68112N1a) null, this, str, (String) null, false);
    }

    public final void Dhj() {
        C337257fy r0 = this.A04;
        if (r0 != null) {
            r0.EJE();
        }
    }

    public final void Dht(String str, boolean z) {
        UserSession userSession = this.A0D;
        0Tu A0J2 = DbS.A0J(userSession, 0);
        if (182.A06(A0J2, userSession, 36328091815001015L) && 182.A06(A0J2, userSession, 36328091815263163L)) {
            C72208OyY oyY = this.A0F;
            Pattern pattern = 0mp.A06;
            oyY.A0B((Integer) null, 5, (long) DbX.A05(str));
            C70151Ny5.A00(userSession, this.A0G, str, "KEYBOARD_SEND");
        } else if (z) {
            C72208OyY oyY2 = this.A0F;
            Pattern pattern2 = 0mp.A06;
            oyY2.A0B((Integer) null, 2, (long) DbX.A05(str));
            A01((C68112N1a) null, this, "igd_universal_search:ai_typeahead_keyboard_send", str, false);
        }
    }

    public final void Dhw(String str, String str2) {
        C72918PPc pPc = this.A02;
        pPc.A0H = false;
        C71982OuE ouE = pPc.A02;
        if (ouE != null) {
            ouE.A00 = false;
        }
        C337257fy r1 = this.A04;
        if (this.A0U) {
            str = str2;
        }
        if (r1 != null) {
            r1.EhX(str);
        }
        DirectSearchInboxFragment directSearchInboxFragment = this.A0J;
        0qQ.A0B(str, 0);
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(directSearchInboxFragment.A0Q, 0), 36323358761626734L)) {
            C67710MtP A0W = C66581MXm.A0W(directSearchInboxFragment);
            A0W.A00 = str;
            A0W.A01.FLH(str);
        }
        C68963Nbq nbq = directSearchInboxFragment.A05;
        if (nbq != null) {
            nbq.A05(str);
        }
        C72208OyY oyY = this.A0F;
        OO3 oo3 = oyY.A01;
        if (oo3 != null) {
            oo3.A04(str);
        }
        if (oyY.A06 != null) {
            oyY.A05 = str;
            System.currentTimeMillis();
            0Aj A0e = AnonymousClass7TE.A0e(oyY.A0C, "direct_compose_search");
            if (A0e.isSampled()) {
                Pattern pattern = 0mp.A06;
                C66581MXm.A1F(A0e, (long) str.length());
                A0e.AAJ("search_string", str);
                C66580MXl.A1H(A0e, oyY.A06);
                A0e.Cgf();
            }
            String str3 = oyY.A05;
            OKM okm = oyY.A02;
            if (okm != null && str3 != null && !str3.isEmpty()) {
                okm.A00 = Integer.valueOf(okm.A01.startFlow(str3.length(), str3, AnonymousClass7TG.A0A(DbT.A0j(oyY.A0D).A03.B6v()), "universal_search", ""));
            }
        }
    }

    public final void DuH() {
        C337257fy r0 = this.A04;
        if (r0 != null) {
            r0.EJE();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
        if (X.182.A06(r2, r9, 36320416709353879L) == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C71874OsH(android.content.Context r6, X.AnonymousClass07i r7, X.AnonymousClass4DH r8, com.instagram.common.session.UserSession r9, X.2el r10, X.C72208OyY r11, X.C294875nB r12, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r13, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r14, int r15, boolean r16, boolean r17) {
        /*
            r5 = this;
            r5.<init>()
            r1 = 8
            X.Mvh r0 = new X.Mvh
            r0.<init>(r5, r1)
            r5.A09 = r0
            X.O7O r0 = new X.O7O
            r0.<init>(r5)
            r5.A0G = r0
            X.O7P r0 = new X.O7P
            r0.<init>(r5)
            r5.A0H = r0
            r1 = 1
            X.FXb r0 = new X.FXb
            r0.<init>(r5, r1)
            r5.A0C = r0
            r5.A0A = r8
            r5.A07 = r6
            r5.A0D = r9
            r5.A08 = r7
            r5.A06 = r15
            r5.A0J = r13
            r5.A0I = r12
            r5.A0F = r11
            r5.A0E = r10
            r5.A0K = r14
            X.Orr r0 = new X.Orr
            r0.<init>()
            r5.A0B = r0
            boolean r0 = X.AnonymousClass6FC.A01(r9)
            r4 = 1
            if (r0 != 0) goto L_0x00f3
            if (r16 != 0) goto L_0x0052
            X.2HN r0 = X.2HM.A00(r9)
            X.2HR r0 = r0.A0h
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x00f3
        L_0x0052:
            r0 = 1
        L_0x0053:
            r5.A0S = r0
            r0 = r17
            r5.A0O = r0
            r3 = 0
            X.0Tu r2 = X.DbS.A0J(r9, r3)
            r0 = 36320438183535023(0x81093f000421af, double:3.032529585708663E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x0078
            X.0qQ.A0B(r9, r3)
            r0 = 36320416709353879(0x81093a000e2197, double:3.032516005350038E-306)
            boolean r1 = X.182.A06(r2, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r5.A0N = r0
            r0 = 36313944192977219(0x81035700040943, double:3.0284227599307066E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0R = r0
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            X.182.A06(r2, r9, r0)
            X.0qQ.A0B(r9, r3)
            r0 = 36320438184190392(0x81093f000e21b8, double:3.032529586123121E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0U = r0
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r9)
            boolean r0 = X.2Ek.A00(r3)
            if (r0 != 0) goto L_0x00b1
            r0 = 36314811776109359(0x81042100000b2f, double:3.028971422996949E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x00c2
        L_0x00b1:
            boolean r0 = X.2Ek.A00(r3)
            if (r0 == 0) goto L_0x00f1
            r0 = 36314811776174896(0x81042100010b30, double:3.028971423038395E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00f1
        L_0x00c2:
            r5.A0L = r4
            r0 = 36314811776961332(0x810421000d0b34, double:3.02897142353574E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0M = r0
            r0 = 36321997256402829(0x810aaa0000278d, double:3.033515549668146E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0P = r0
            r0 = 36321997256468366(0x810aaa0001278e, double:3.033515549709592E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0Q = r0
            r0 = 36317521900475658(0x8106980000150a, double:3.030685316558991E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0T = r0
            return
        L_0x00f1:
            r4 = 0
            goto L_0x00c2
        L_0x00f3:
            r0 = 0
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71874OsH.<init>(android.content.Context, X.07i, X.4DH, com.instagram.common.session.UserSession, X.2el, X.OyY, X.5nB, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment, int, boolean, boolean):void");
    }
}
