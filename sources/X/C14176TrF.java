package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.TrF  reason: case insensitive filesystem */
public final class C14176TrF extends 2Ru implements C231272rL, G77, CallerContextable {
    public static final CallerContext A11 = CallerContext.A00(C14176TrF.class);
    public static final String __redex_internal_original_name = "ReelDashboardViewersAdapter";
    public int A00;
    public 1Xj A01;
    public Reel A02;
    public C255773uh A03;
    public C250973mM A04;
    public ReelViewerConfig A05;
    public AnonymousClass3BQ A06;
    public C17700VcV A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public int A0B;
    public int A0C;
    public String A0D;
    public boolean A0E;
    public final Context A0F;
    public final AnonymousClass2s2 A0G;
    public final AnonymousClass0iw A0H;
    public final 0wc A0I;
    public final UserSession A0J;
    public final C61478K9j A0K;
    public final C15496Udl A0L;
    public final C15556Uek A0M;
    public final C15521UeA A0N;
    public final C14632Tze A0O;
    public final C15522UeB A0P;
    public final C66971Mg4 A0Q;
    public final C46437Dez A0R;
    public final C229122ms A0S;
    public final C231762sK A0T;
    public final ReelDashboardFragment A0U;
    public final HashMap A0V;
    public final List A0W;
    public final List A0X;
    public final List A0Y;
    public final List A0Z;
    public final Set A0a;
    public final boolean A0b;
    public final AnonymousClass4DH A0c;
    public final C251033mS A0d;
    public final C250993mO A0e;
    public final C61480K9l A0f;
    public final C317746nl A0g;
    public final C15520Ue9 A0h;
    public final EAO A0i;
    public final C47624EAk A0j;
    public final C61493K9y A0k;
    public final C15565Uet A0l;
    public final C15557Uel A0m;
    public final EAP A0n;
    public final C15563Uer A0o;
    public final C15559Uen A0p;
    public final C61492K9x A0q;
    public final C14642Tzo A0r;
    public final C15555Uej A0s;
    public final C17255VOi A0t;
    public final C17256VOj A0u;
    public final C15558Uem A0v;
    public final VTE A0w;
    public final C15561Uep A0x;
    public final C47626EAm A0y;
    public final boolean A0z;
    public final boolean A10;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.Udl} */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r52v0, types: [X.2s0] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r67 == false) goto L_0x0008;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14176TrF(android.content.Context r58, X.AnonymousClass4DH r59, X.AnonymousClass0iw r60, com.instagram.common.session.UserSession r61, X.2el r62, X.C317376nA r63, X.C229122ms r64, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r65, boolean r66, boolean r67) {
        /*
            r57 = this;
            r9 = 0
            r2 = r66
            if (r66 == 0) goto L_0x0008
            r0 = 1
            if (r67 != 0) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r12 = r57
            r12.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0X = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0Z = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0V = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12.A0a = r0
            java.lang.String r0 = ""
            r12.A09 = r0
            r12.A0E = r9
            r12.A0A = r9
            X.VOi r1 = new X.VOi
            r1.<init>(r12)
            r12.A0t = r1
            X.VOj r0 = new X.VOj
            r0.<init>(r12)
            r12.A0u = r0
            r14 = r58
            r12.A0F = r14
            r11 = r61
            r12.A0J = r11
            r10 = r65
            r12.A0U = r10
            r12.A10 = r2
            r13 = r59
            r12.A0c = r13
            r2 = r60
            r12.A0H = r2
            X.0wc r3 = X.AnonymousClass0kN.A01(r2, r11)
            r12.A0I = r3
            boolean r3 = X.DbV.A1Y(r11)
            r12.A0z = r3
            X.3mS r3 = X.C251033mS.A00(r11)
            r12.A0d = r3
            X.3mO r3 = X.C250993mO.A01(r11)
            r12.A0e = r3
            X.VTE r3 = new X.VTE
            r3.<init>(r11)
            r12.A0w = r3
            X.6nl r4 = new X.6nl
            r4.<init>(r11)
            r12.A0g = r4
            X.Uem r31 = new X.Uem
            r3 = r31
            r3.<init>(r14, r10)
            r12.A0v = r3
            X.Tzo r30 = new X.Tzo
            r3 = r30
            r3.<init>(r14, r10)
            r12.A0r = r3
            X.Uet r29 = new X.Uet
            r3 = r29
            r3.<init>(r14, r11)
            r12.A0l = r3
            X.Uel r28 = new X.Uel
            r3 = r28
            r3.<init>(r14, r11)
            r12.A0m = r3
            X.0h9 r3 = r13.mLifecycleRegistry
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            X.Uep r27 = new X.Uep
            r15 = r27
            r16 = r3
            r17 = r2
            r18 = r11
            r19 = r10
            r15.<init>(r16, r17, r18, r19, r20)
            r12.A0x = r15
            X.EAP r26 = new X.EAP
            r3 = r26
            r3.<init>(r2, r11, r10)
            r12.A0n = r3
            X.K9l r25 = new X.K9l
            r5 = r63
            r3 = r25
            r3.<init>(r2, r5, r4, r10)
            r12.A0f = r3
            X.Uer r24 = new X.Uer
            r3 = r24
            r3.<init>(r10)
            r12.A0o = r3
            X.Uej r23 = new X.Uej
            r3 = r23
            r3.<init>(r11)
            r12.A0s = r3
            X.EAk r22 = new X.EAk
            r3 = r22
            r3.<init>(r10)
            r12.A0j = r3
            X.K9x r21 = new X.K9x
            r3 = r21
            r3.<init>(r11, r10)
            r12.A0q = r3
            X.Uen r20 = new X.Uen
            r3 = r20
            r3.<init>(r14, r2, r10)
            r12.A0p = r3
            X.Tze r19 = new X.Tze
            r3 = r19
            r3.<init>(r14, r2, r11, r10)
            r12.A0O = r3
            X.Uek r18 = new X.Uek
            r3 = r18
            r3.<init>(r14, r10)
            r12.A0M = r3
            X.Mg4 r17 = new X.Mg4
            r3 = r17
            r3.<init>(r14)
            r12.A0Q = r3
            X.EAm r15 = new X.EAm
            r15.<init>(r14)
            r12.A0y = r15
            X.VWH r3 = new X.VWH
            r4 = r62
            r3.<init>(r11, r4)
            X.UeB r8 = new X.UeB
            r8.<init>(r14, r3)
            r12.A0P = r8
            X.2sK r7 = new X.2sK
            r7.<init>(r14)
            r12.A0T = r7
            X.2s2 r6 = new X.2s2
            r6.<init>()
            r12.A0G = r6
            X.K9j r5 = new X.K9j
            r5.<init>(r14, r13, r11, r10)
            r12.A0K = r5
            int r3 = X.JTR.A05(r14)
            r6.A03 = r3
            X.K9y r4 = new X.K9y
            r4.<init>(r14, r10)
            r12.A0k = r4
            X.Udl r16 = new X.Udl
            r16.<init>()
            r3 = r16
            r12.A0L = r3
            r3 = r64
            r12.A0S = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r12.A0W = r3
            X.EAO r3 = new X.EAO
            r3.<init>(r2, r11, r0)
            r12.A0i = r3
            X.Ue9 r2 = new X.Ue9
            r2.<init>(r13, r1)
            r12.A0h = r2
            X.UeA r13 = new X.UeA
            r13.<init>(r12, r10)
            r12.A0N = r13
            X.Dez r10 = new X.Dez
            r10.<init>(r14)
            r12.A0R = r10
            X.0qQ.A0B(r11, r9)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36316559827800553(0x8105b8000011e9, double:3.030076897925299E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            r12.A0b = r0
            r43 = r19
            r44 = r18
            r45 = r17
            r46 = r15
            r47 = r7
            r48 = r6
            r49 = r4
            r50 = r5
            r51 = r8
            r52 = r16
            r53 = r3
            r54 = r2
            r55 = r13
            r56 = r10
            r32 = r30
            r33 = r29
            r34 = r28
            r35 = r27
            r36 = r26
            r37 = r25
            r38 = r24
            r39 = r23
            r40 = r22
            r41 = r21
            r42 = r20
            X.2s0[] r0 = new X.C231642s0[]{r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56}
            r12.init(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14176TrF.<init>(android.content.Context, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.2el, X.6nA, X.2ms, instagram.features.stories.dashboard.fragment.ReelDashboardFragment, boolean, boolean):void");
    }

    public final void onSearchCleared(String str) {
    }

    private int A00(VWC vwc, int i, int i2, boolean z) {
        String str;
        Context context = this.A0F;
        String string = context.getResources().getString(i);
        C363208jL r5 = null;
        if (i2 != -1) {
            str = context.getResources().getString(i2);
        } else {
            str = null;
        }
        if (z) {
            int A022 = AnonymousClass7TG.A02(context);
            r5 = new C363208jL(context, 1.0f, 2Yu.A0H(context, R.attr.dividerColor), 48);
            r5.A00(A022, 0, A022, 0);
        }
        return addModel(new C14641Tzn(r5, vwc, string, str), (Object) null, this.A0r);
    }

    private void A02(C255773uh r5) {
        UserSession userSession = this.A0J;
        AnonymousClass0iw r3 = this.A0H;
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "reel_viewer_dashboard_fb_anon_viewers_impression");
        DbW.A15(A0e2, r3);
        Long l = null;
        A0e2.A9F("target_user_id", (Long) null);
        1Xj r0 = r5.A0b;
        if (r0 != null) {
            String A30 = r0.A30();
            A30.getClass();
            l = DbV.A0q(A30);
        }
        A0e2.A9F("media_id", l);
        A0e2.Cgf();
    }

    public static void A03(C14176TrF trF, boolean z) {
        trF.removeModel(trF.A0C);
        trF.A0E = true;
        trF.A0B = trF.A00((VWC) null, 2131974278, 2131974277, z);
        trF.A04(trF.A0Z, false, true);
        trF.notifyDataSetChangedSmart();
        ReelDashboardFragment reelDashboardFragment = trF.A0U;
        C255773uh r1 = trF.A03;
        r1.getClass();
        reelDashboardFragment.A0K(r1, trF.A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r6 > r7.length()) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(boolean r9) {
        /*
            r8 = this;
            java.util.List r0 = r8.A0Z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = r8.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007f
            X.2ms r0 = r8.A0S
            boolean r0 = r0.CKB()
            if (r0 != 0) goto L_0x007f
            X.VTE r0 = r8.A0w
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x007f
            android.content.Context r2 = r8.A0F
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131974279(0x7f135887, float:1.9585618E38)
            java.lang.String r7 = r1.getString(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131974281(0x7f135889, float:1.9585622E38)
            java.lang.String r0 = r1.getString(r0)
            int r6 = r7.indexOf(r0)
            int r5 = X.DbX.A05(r0)
            int r5 = r5 + r6
            r4 = 0
            if (r6 < 0) goto L_0x0049
            int r0 = r7.length()
            r2 = 1
            if (r6 <= r0) goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r5 < 0) goto L_0x0053
            int r0 = r7.length()
            if (r5 > r0) goto L_0x0053
            r4 = 1
        L_0x0053:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r7)
            X.U2G r1 = new X.U2G
            r1.<init>(r8, r9)
            if (r2 == 0) goto L_0x007f
            if (r4 == 0) goto L_0x007f
            r0 = 33
            r3.setSpan(r1, r6, r5, r0)
            X.FGF r2 = new X.FGF
            r2.<init>((android.text.SpannableStringBuilder) r3)
            r0 = 1
            r2.A06 = r0
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r2.A03 = r0
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x0080
            X.Mg4 r1 = r8.A0Q
            r0 = 0
            int r0 = r8.addModel(r2, r0, r1)
            r8.A0C = r0
        L_0x007f:
            return
        L_0x0080:
            A03(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14176TrF.A05(boolean):void");
    }

    private boolean A06(User user) {
        if (!this.A0z || !this.A0e.A0C(this.A0d, user)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v111, types: [java.lang.Object, X.VcV] */
    /* JADX WARNING: type inference failed for: r1v113, types: [java.lang.Object, X.VcV] */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a0c, code lost:
        if ((!r6.A04(com.facebook.common.callercontext.CallerContext.A00(r8), r7)) != false) goto L_0x0a0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0a28, code lost:
        if (r6 == false) goto L_0x0a2a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0a96, code lost:
        if (r11.CKB() != false) goto L_0x0a98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0ac0, code lost:
        if (r11.CKB() != false) goto L_0x0ac2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0182, code lost:
        if (r1.equals(r8.A0j) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x099d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0c08  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r23 = this;
            r5 = r23
            r5.clear()
            X.3uh r2 = r5.A03
            if (r2 == 0) goto L_0x0040
            boolean r0 = r2.CWu()
            if (r0 == 0) goto L_0x0040
            X.1Xj r1 = r2.A0b
            if (r1 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r3 = r5.A0J
            boolean r0 = X.C14610TzH.A03(r3, r2)
            if (r0 == 0) goto L_0x0040
            X.UyC r1 = r1.A1Z()
            X.UyC r0 = X.C16616UyC.UNAVAILABLE
            if (r1 == r0) goto L_0x0040
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316473928454542(0x8105a40000118e, double:3.030022574832993E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0040
            X.1Xj r0 = r5.A01
            if (r0 != 0) goto L_0x003b
            X.3uh r0 = r5.A03
            r0.getClass()
            X.1Xj r0 = r0.A0b
        L_0x003b:
            X.Ue9 r1 = r5.A0h
            r5.addModel(r0, r1)
        L_0x0040:
            X.3uh r1 = r5.A03
            if (r1 == 0) goto L_0x004f
            boolean r0 = r1.A1H()
            if (r0 == 0) goto L_0x004f
            X.K9x r0 = r5.A0q
            r5.addModel(r1, r0)
        L_0x004f:
            X.3uh r1 = r5.A03
            r4 = 0
            if (r1 == 0) goto L_0x0198
            boolean r0 = r1.CWu()
            if (r0 == 0) goto L_0x0198
            X.1Xj r2 = r1.A0b
        L_0x005c:
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0152
            boolean r0 = r2.A5b()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2.A5Q()
            if (r0 == 0) goto L_0x0152
        L_0x006c:
            com.instagram.common.session.UserSession r3 = r5.A0J
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324376668549173(0x810cd400043035, double:3.0350202994906176E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x0152
            boolean r0 = r2.A5Q()
            android.content.Context r9 = r5.A0F
            android.content.res.Resources r1 = r9.getResources()
            if (r0 == 0) goto L_0x012b
            r0 = 2131976686(0x7f1361ee, float:1.95905E38)
            java.lang.String r8 = r1.getString(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131976685(0x7f1361ed, float:1.9590498E38)
            java.lang.String r0 = r1.getString(r0)
            X.VcV r1 = new X.VcV
            r1.<init>()
            r1.A08 = r8
            r1.A02 = r0
            r1.A05 = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A00 = r0
            r5.A07 = r1
        L_0x00ac:
            X.VcV r1 = r5.A07
            X.Uem r0 = r5.A0v
            r5.addModel(r1, r0)
        L_0x00b3:
            X.3uh r0 = r5.A03
            if (r0 == 0) goto L_0x00ef
            java.util.List r0 = r0.A0n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d7
            java.util.List r8 = r5.A0X
            r8.clear()
            boolean r0 = r5.A0b
            if (r0 == 0) goto L_0x0123
            java.lang.String r1 = r5.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0123
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0n
            X.C14610TzH.A00(r0, r8, r1)
        L_0x00d7:
            java.util.List r8 = r5.A0Y
            r8.clear()
            boolean r0 = r5.A0b
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r5.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x011b
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0p
            X.C14610TzH.A00(r0, r8, r1)
        L_0x00ef:
            X.3uh r0 = r5.A03
            if (r0 == 0) goto L_0x019b
            java.util.List r1 = r0.A0o
            java.util.List r0 = r5.A0Z
            r0.clear()
            r0.addAll(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x019b
            java.util.Iterator r9 = r1.iterator()
        L_0x0107:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r8 = r9.next()
            X.9J5 r8 = (X.AnonymousClass9J5) r8
            java.util.HashMap r1 = r5.A0V
            java.lang.Object r0 = r8.A05
            r1.put(r0, r8)
            goto L_0x0107
        L_0x011b:
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0p
            r8.addAll(r0)
            goto L_0x00ef
        L_0x0123:
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0n
            r8.addAll(r0)
            goto L_0x00d7
        L_0x012b:
            r0 = 2131976683(0x7f1361eb, float:1.9590493E38)
            java.lang.String r8 = r1.getString(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131976682(0x7f1361ea, float:1.9590491E38)
            java.lang.String r0 = r1.getString(r0)
            X.VcV r1 = new X.VcV
            r1.<init>()
            r1.A08 = r8
            r1.A02 = r0
            r1.A05 = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A00 = r0
            r5.A07 = r1
            goto L_0x00ac
        L_0x0152:
            X.VcV r0 = r5.A07
            X.3uh r8 = r5.A03
            com.instagram.common.session.UserSession r3 = r5.A0J
            if (r0 == 0) goto L_0x00b3
            java.lang.String r11 = r0.A09
            if (r8 == 0) goto L_0x00b3
            if (r11 == 0) goto L_0x00b3
            X.0xa r10 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r0 = "dismissed_reel_viewers_list_megaphone"
            java.lang.String r0 = X.002.A0R(r0, r11)
            boolean r0 = r10.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r9 = "reel_viewers_list_megaphone_item_id"
            java.lang.String r0 = X.002.A0R(r9, r11)
            java.lang.String r1 = r10.getString(r0, r4)
            if (r1 == 0) goto L_0x0186
            java.lang.String r0 = r8.A0j
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x0186:
            java.lang.String r8 = r8.A0j
            X.0xY r1 = r10.AR4()
            java.lang.String r0 = X.002.A0R(r9, r11)
            r1.E5g(r0, r8)
            r1.apply()
            goto L_0x00ac
        L_0x0198:
            r2 = r4
            goto L_0x005c
        L_0x019b:
            java.lang.String r0 = r5.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0814
            if (r2 == 0) goto L_0x02b8
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C0r()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            if (r0 != 0) goto L_0x02b8
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C0r()
            java.lang.Object r13 = r0.get(r7)
            X.DUZ r13 = (X.DUZ) r13
            java.util.List r0 = r13.CG0()
            boolean r11 = X.AnonymousClass7TE.A1b(r0)
            X.3uh r0 = r5.A03
            r0.getClass()
            X.4jy r0 = X.C297825sP.A00(r0)
            r0.getClass()
            java.lang.Boolean r0 = r0.CXp()
            boolean r10 = X.AnonymousClass7TG.A1X(r0)
            if (r11 == 0) goto L_0x02a4
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            android.content.Context r0 = r5.A0F
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971495(0x7f134da7, float:1.957997E38)
            java.lang.String r8 = r1.getString(r0)
            X.3uh r0 = r5.A03
            X.VWC r1 = new X.VWC
            r1.<init>(r0, r9, r8)
        L_0x01f1:
            r0 = 2131971494(0x7f134da6, float:1.9579969E38)
            r12 = -1
            r5.A00(r1, r0, r12, r7)
            X.3uh r1 = r5.A03
            if (r10 == 0) goto L_0x02a0
            X.Uel r0 = r5.A0m
        L_0x01fe:
            r5.addModel(r1, r0)
            if (r11 == 0) goto L_0x02b2
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            android.content.Context r10 = r5.A0F
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131969569(0x7f134621, float:1.9576065E38)
            java.lang.String r8 = r1.getString(r0)
            X.3uh r1 = r5.A03
            X.VWC r0 = new X.VWC
            r0.<init>(r1, r9, r8)
            X.Uek r9 = r5.A0M
            r5.addModel(r0, r9)
            java.lang.String r11 = r13.getPollId()
            java.util.List r14 = r13.CG0()
            boolean r17 = r13.BU8()
            r0 = 2131971496(0x7f134da8, float:1.9579973E38)
            r5.A00(r4, r0, r12, r6)
            X.2s2 r8 = r5.A0G
            r5.addModel(r4, r8)
            X.3uh r12 = r5.A03
            if (r12 == 0) goto L_0x025c
            X.0Tu r13 = X.0Tu.A06
            r0 = 36312544033440929(0x810211000104a1, double:3.027537293401967E-306)
            boolean r0 = X.182.A06(r13, r3, r0)
            if (r0 == 0) goto L_0x025c
            X.4jy r0 = X.C297825sP.A00(r12)
            if (r0 == 0) goto L_0x025c
            java.util.List r0 = r0.A0E
            if (r0 == 0) goto L_0x025c
            com.instagram.model.reels.Reel r0 = r5.A02
            X.Tzd r1 = new X.Tzd
            r1.<init>((com.instagram.model.reels.Reel) r0, (X.C255773uh) r12)
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
        L_0x025c:
            java.util.Iterator r16 = r14.iterator()
        L_0x0260:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r13 = r16.next()
            X.DUY r13 = (X.DUY) r13
            com.instagram.model.reels.Reel r15 = r5.A02
            X.3uh r14 = r5.A03
            com.instagram.user.model.User r12 = r13.CCd()
            r12.getClass()
            boolean r0 = r5.A06(r12)
            X.Tzd r1 = new X.Tzd
            r1.<init>(r15, r14, r12, r0)
            r1.A06 = r11
            java.lang.Integer r0 = r13.CFy()
            r1.A04 = r0
            java.lang.Boolean r0 = r13.BrC()
            if (r0 == 0) goto L_0x029a
            java.lang.Boolean r0 = r13.BrC()
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            r1.A0F = r0
        L_0x029a:
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
            goto L_0x0260
        L_0x02a0:
            X.Uet r0 = r5.A0l
            goto L_0x01fe
        L_0x02a4:
            r1 = r4
            goto L_0x01f1
        L_0x02a7:
            if (r17 == 0) goto L_0x02b4
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.VWC r0 = A01(r10, r5, r0)
            r5.addModel(r0, r9)
        L_0x02b2:
            r9 = 1
            goto L_0x02b9
        L_0x02b4:
            r5.addModel(r4, r8)
            goto L_0x02b2
        L_0x02b8:
            r9 = 0
        L_0x02b9:
            X.3uh r0 = r5.A03
            com.instagram.reels.question.model.QuestionResponsesModelIntf r12 = X.C14627TzZ.A00(r0)
            if (r12 == 0) goto L_0x0301
            java.util.List r0 = r12.Bnk()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0301
            java.util.List r0 = r12.Bnk()
            int r11 = r0.size()
            android.content.Context r10 = r5.A0F
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165609(0x7f0701a9, float:1.794544E38)
            int r8 = r1.getDimensionPixelSize(r0)
            int r1 = X.0nA.A09(r10)
            boolean r0 = r12.BU8()
            if (r0 != 0) goto L_0x03f2
            int r11 = r11 * r8
            if (r11 > r1) goto L_0x03f2
            r8 = r4
        L_0x02ee:
            r1 = 2131971499(0x7f134dab, float:1.957998E38)
            r0 = -1
            r5.A00(r8, r1, r0, r9)
            X.3uh r0 = r5.A03
            com.instagram.reels.question.model.QuestionResponsesModelIntf r1 = X.C14627TzZ.A00(r0)
            X.Uep r0 = r5.A0x
            r5.addModel(r1, r0)
            r9 = 1
        L_0x0301:
            X.3uh r8 = r5.A03
            if (r8 == 0) goto L_0x031e
            java.util.List r0 = r8.A0m
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x031e
            r1 = 2131971498(0x7f134daa, float:1.9579977E38)
            r0 = -1
            r5.A00(r4, r1, r0, r9)
            X.EAP r0 = r5.A0n
            r5.addModel(r8, r0)
            r9 = 1
        L_0x031e:
            X.3uh r0 = r5.A03
            X.DUR r12 = X.C14628Tza.A00(r0)
            if (r12 == 0) goto L_0x0411
            X.DTy r0 = r12.AyW()
            if (r0 == 0) goto L_0x0411
            X.DTy r0 = r12.AyW()
            java.util.List r0 = r0.AyX()
            if (r0 == 0) goto L_0x0411
            X.DTy r0 = r12.AyW()
            java.util.List r0 = r0.AyX()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            r11 = r0 ^ 1
            if (r11 == 0) goto L_0x03ef
            X.DTy r0 = r12.AyW()
            java.util.List r0 = r0.AyX()
            r0.getClass()
            int r1 = r0.size()
            r0 = 10
            if (r1 < r0) goto L_0x03ef
            java.lang.Integer r10 = X.AnonymousClass05K.A0j
            android.content.Context r1 = r5.A0F
            r0 = 2131971483(0x7f134d9b, float:1.9579947E38)
            java.lang.String r8 = r1.getString(r0)
            X.3uh r0 = r5.A03
            r0.getClass()
            X.VWC r1 = new X.VWC
            r1.<init>(r0, r10, r8)
        L_0x036e:
            r0 = 2131971482(0x7f134d9a, float:1.9579945E38)
            r8 = -1
            r5.A00(r1, r0, r8, r9)
            X.3uh r1 = r5.A03
            X.EAk r0 = r5.A0j
            r5.addModel(r1, r0)
            if (r11 == 0) goto L_0x0410
            java.lang.Integer r11 = X.AnonymousClass05K.A0u
            android.content.Context r10 = r5.A0F
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131962845(0x7f132bdd, float:1.9562427E38)
            java.lang.String r9 = r1.getString(r0)
            X.3uh r1 = r5.A03
            r1.getClass()
            X.VWC r0 = new X.VWC
            r0.<init>(r1, r11, r9)
            X.Uek r9 = r5.A0M
            r5.addModel(r0, r9)
            X.DTy r17 = r12.AyW()
            if (r17 == 0) goto L_0x0410
            java.util.List r0 = r17.AyX()
            if (r0 == 0) goto L_0x0410
            r0 = 2131971481(0x7f134d99, float:1.9579943E38)
            r11 = r4
            r5.A00(r4, r0, r8, r6)
            X.2s2 r8 = r5.A0G
            r5.addModel(r4, r8)
            java.lang.String r0 = r12.getFundraiserId()
            r0.getClass()
            java.util.List r0 = r17.AyX()
            java.util.Iterator r16 = r0.iterator()
        L_0x03c3:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03fa
            java.lang.Object r15 = r16.next()
            X.DTx r15 = (X.C46294DTx) r15
            com.instagram.user.model.User r14 = r15.CCd()
            com.instagram.model.reels.Reel r13 = r5.A02
            X.3uh r12 = r5.A03
            r14.getClass()
            boolean r0 = r5.A06(r14)
            X.Tzd r1 = new X.Tzd
            r1.<init>(r13, r12, r14, r0)
            java.lang.String r0 = r15.getAmount()
            r1.A05 = r0
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
            goto L_0x03c3
        L_0x03ef:
            r1 = r4
            goto L_0x036e
        L_0x03f2:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.VWC r8 = A01(r10, r5, r0)
            goto L_0x02ee
        L_0x03fa:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r17.BU7()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x040d
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.VWC r11 = A01(r10, r5, r0)
            r8 = r9
        L_0x040d:
            r5.addModel(r11, r8)
        L_0x0410:
            r9 = 1
        L_0x0411:
            if (r2 == 0) goto L_0x0669
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C12()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            if (r0 != 0) goto L_0x050d
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C12()
            java.lang.Object r10 = r0.get(r7)
            X.DUS r10 = (X.DUS) r10
            java.util.List r0 = r10.Bal()
            if (r0 == 0) goto L_0x04ef
            java.util.List r0 = r10.Bal()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04ef
            r12 = 1
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            android.content.Context r1 = r5.A0F
            r0 = 2131971503(0x7f134daf, float:1.9579987E38)
            java.lang.String r8 = r1.getString(r0)
            X.3uh r0 = r5.A03
            r0.getClass()
            X.VWC r1 = new X.VWC
            r1.<init>(r0, r11, r8)
        L_0x0451:
            r0 = 2131971502(0x7f134dae, float:1.9579985E38)
            r8 = -1
            r5.A00(r1, r0, r8, r9)
            X.3uh r1 = r5.A03
            X.Uer r0 = r5.A0o
            r5.addModel(r1, r0)
            if (r12 == 0) goto L_0x050c
            java.util.List r0 = r10.Bal()
            if (r0 == 0) goto L_0x050c
            r0 = 2131971501(0x7f134dad, float:1.9579983E38)
            r5.A00(r4, r0, r8, r6)
            X.2s2 r9 = r5.A0G
            r5.addModel(r4, r9)
            java.util.List r0 = r10.Bal()
            java.util.Iterator r15 = r0.iterator()
        L_0x047a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x04f3
            java.lang.Object r14 = r15.next()
            X.DUC r14 = (X.DUC) r14
            X.3uh r0 = r5.A03
            r0.getClass()
            X.WaJ r1 = X.C265894Ws.A01(r0)
            java.lang.Integer r0 = r14.Abv()
            if (r0 == 0) goto L_0x050c
            if (r1 == 0) goto L_0x050c
            X.UNZ r0 = r1.A02
            java.util.List r12 = r0.A0C
            if (r12 == 0) goto L_0x050c
            java.lang.Integer r0 = r14.Abv()
            int r1 = r0.intValue()
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x050c
            com.instagram.model.reels.Reel r13 = r5.A02
            X.3uh r8 = r5.A03
            com.instagram.user.model.User r1 = r14.CCd()
            r1.getClass()
            boolean r0 = r5.A06(r1)
            X.Tzd r11 = new X.Tzd
            r11.<init>(r13, r8, r1, r0)
            java.lang.String r0 = r10.Biw()
            r11.A08 = r0
            java.lang.Integer r0 = r14.Abv()
            int r0 = r0.intValue()
            java.lang.Object r0 = r12.get(r0)
            X.XAf r0 = (X.C21026XAf) r0
            X.0qQ.A0B(r0, r7)
            java.lang.String r8 = r0.getText()
            if (r8 == 0) goto L_0x04ec
            int r1 = r8.length()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 > r0) goto L_0x04ec
        L_0x04e4:
            r11.A07 = r8
            X.Tze r0 = r5.A0O
            r5.addModel(r11, r0)
            goto L_0x047a
        L_0x04ec:
            java.lang.String r8 = ""
            goto L_0x04e4
        L_0x04ef:
            r12 = 0
            r1 = r4
            goto L_0x0451
        L_0x04f3:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r10.BU7()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0603
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            android.content.Context r0 = r5.A0F
            X.VWC r1 = A01(r0, r5, r1)
            X.Uek r0 = r5.A0M
            r5.addModel(r1, r0)
        L_0x050c:
            r9 = 1
        L_0x050d:
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C1E()
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            if (r0 != 0) goto L_0x0669
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C1E()
            java.lang.Object r10 = r0.get(r7)
            X.DUe r10 = (X.C46301DUe) r10
            java.util.List r0 = r10.CG0()
            if (r0 == 0) goto L_0x05ff
            java.util.List r0 = r10.CG0()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05ff
            r11 = 1
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            android.content.Context r1 = r5.A0F
            r0 = 2131971506(0x7f134db2, float:1.9579993E38)
            java.lang.String r2 = r1.getString(r0)
            X.3uh r0 = r5.A03
            r0.getClass()
            X.VWC r1 = new X.VWC
            r1.<init>(r0, r8, r2)
        L_0x054b:
            r0 = 2131971505(0x7f134db1, float:1.9579991E38)
            r2 = -1
            r5.A00(r1, r0, r2, r9)
            X.3uh r1 = r5.A03
            X.Uej r0 = r5.A0s
            r5.addModel(r1, r0)
            if (r11 == 0) goto L_0x0668
            r0 = 2131971508(0x7f134db4, float:1.9579997E38)
            r5.A00(r4, r0, r2, r6)
            X.2s2 r8 = r5.A0G
            r5.addModel(r4, r8)
            X.2fF r2 = X.C225972fF.A00(r3)
            X.3uh r1 = r5.A03
            r1.getClass()
            X.3WT r0 = X.AnonymousClass3WT.SLIDER
            java.util.List r0 = r1.Bkd(r0)
            r0.getClass()
            java.lang.Object r0 = r0.get(r7)
            X.3ui r0 = (X.C255783ui) r0
            X.WaK r0 = r0.A0G()
            r0.getClass()
            X.Cvz r2 = r2.A0L(r0)
            java.util.List r0 = r10.CG0()
            r15 = 0
            if (r0 == 0) goto L_0x0608
            java.util.List r0 = r10.CG0()
            java.util.Iterator r14 = r0.iterator()
        L_0x0598:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0608
            java.lang.Object r13 = r14.next()
            X.DTz r13 = (X.C46296DTz) r13
            if (r2 == 0) goto L_0x05c6
            com.instagram.user.model.User r0 = r13.CCd()
            r0.getClass()
            java.lang.String r1 = r0.getId()
            X.BIu r0 = r2.A01
            r0.getClass()
            com.instagram.user.model.User r0 = r0.A00
            r0.getClass()
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05c6
            goto L_0x0598
        L_0x05c6:
            com.instagram.model.reels.Reel r12 = r5.A02
            X.3uh r11 = r5.A03
            com.instagram.user.model.User r9 = r13.CCd()
            r9.getClass()
            boolean r0 = r5.A06(r9)
            X.Tzd r1 = new X.Tzd
            r1.<init>(r12, r11, r9, r0)
            java.lang.String r0 = r10.getSliderId()
            r0.getClass()
            r1.A0A = r0
            java.lang.Float r0 = r13.CFx()
            if (r0 == 0) goto L_0x05fd
            java.lang.Float r0 = r13.CFx()
            float r0 = r0.floatValue()
        L_0x05f1:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A03 = r0
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
            goto L_0x0598
        L_0x05fd:
            r0 = 0
            goto L_0x05f1
        L_0x05ff:
            r11 = 0
            r1 = r4
            goto L_0x054b
        L_0x0603:
            r5.addModel(r4, r9)
            goto L_0x050c
        L_0x0608:
            if (r2 == 0) goto L_0x063d
            X.BIu r12 = r2.A01
            r12.getClass()
            com.instagram.model.reels.Reel r11 = r5.A02
            X.3uh r9 = r5.A03
            com.instagram.user.model.User r2 = r12.A00
            r2.getClass()
            boolean r0 = r5.A06(r2)
            X.Tzd r1 = new X.Tzd
            r1.<init>(r11, r9, r2, r0)
            java.lang.String r0 = r10.getSliderId()
            r0.getClass()
            r1.A0A = r0
            java.lang.Float r0 = r12.A01
            if (r0 == 0) goto L_0x0632
            float r15 = r0.floatValue()
        L_0x0632:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            r1.A03 = r0
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
        L_0x063d:
            java.lang.Boolean r0 = r10.BU7()
            if (r0 == 0) goto L_0x0738
            java.lang.Boolean r0 = r10.BU7()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0738
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            android.content.Context r0 = r5.A0F
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131972971(0x7f13536b, float:1.9582965E38)
            java.lang.String r2 = r1.getString(r0)
            X.3uh r0 = r5.A03
            X.VWC r1 = new X.VWC
            r1.<init>(r0, r8, r2)
            X.Uek r0 = r5.A0M
            r5.addModel(r1, r0)
        L_0x0668:
            r9 = 1
        L_0x0669:
            X.3uh r8 = r5.A03
            if (r8 == 0) goto L_0x06c7
            X.3mL r0 = r8.A0e
            X.3mL r10 = X.C250963mL.MEDIA
            if (r0 != r10) goto L_0x06c7
            X.1Xj r0 = r8.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.Bjr()
            if (r0 == 0) goto L_0x06c7
            boolean r0 = r8.A1C()
            if (r0 != 0) goto L_0x0735
            java.lang.Integer r11 = X.AnonymousClass05K.A15
            android.content.Context r0 = r5.A0F
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131972971(0x7f13536b, float:1.9582965E38)
            java.lang.String r0 = r1.getString(r0)
            X.VWC r2 = new X.VWC
            r2.<init>(r8, r11, r0)
        L_0x069a:
            r1 = 2131971500(0x7f134dac, float:1.9579981E38)
            r0 = -1
            r5.A00(r2, r1, r0, r9)
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            X.3mL r1 = r8.A0e
            if (r1 != r10) goto L_0x0733
            X.1Xj r0 = r8.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.util.List r2 = r0.Bjr()
        L_0x06b5:
            int r0 = r1.ordinal()
            if (r0 == r6) goto L_0x0723
            r0 = 0
        L_0x06bc:
            X.VWE r1 = new X.VWE
            r1.<init>(r8, r2, r0)
            X.Uen r0 = r5.A0p
            r5.addModel(r1, r0)
            r9 = 1
        L_0x06c7:
            X.3uh r8 = r5.A03
            if (r8 == 0) goto L_0x078c
            X.OLT r0 = r8.A04
            if (r0 == 0) goto L_0x078c
            java.util.List r0 = r0.A04
            boolean r0 = X.C13988Tno.A1a(r0)
            if (r0 != 0) goto L_0x078c
            X.OLT r10 = r8.A04
            java.lang.Integer r11 = X.AnonymousClass05K.A1I
            android.content.Context r2 = r5.A0F
            r1 = 2131972250(0x7f13509a, float:1.9581502E38)
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            X.VWC r2 = new X.VWC
            r2.<init>(r8, r11, r0)
            r1 = 2131971504(0x7f134db0, float:1.957999E38)
            r0 = -1
            r5.A00(r2, r1, r0, r6)
            java.util.List r0 = r10.A04
            java.util.List r13 = java.util.Collections.unmodifiableList(r0)
            int r1 = r13.size()
            r0 = 3
            int r12 = java.lang.Math.min(r1, r0)
            r11 = 0
        L_0x0706:
            if (r11 >= r12) goto L_0x073d
            java.lang.Object r10 = r13.get(r11)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.util.Set r0 = r5.A0a
            boolean r2 = r0.contains(r10)
            r0 = 39
            X.JwK r1 = new X.JwK
            r1.<init>((com.instagram.user.model.User) r10, (boolean) r2, (int) r0)
            X.EAO r0 = r5.A0i
            r5.addModel(r1, r0)
            int r11 = r11 + 1
            goto L_0x0706
        L_0x0723:
            X.1Xj r0 = r8.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.lang.Integer r0 = r0.Bjm()
            int r0 = X.AnonymousClass7TG.A0A(r0)
            goto L_0x06bc
        L_0x0733:
            r2 = 0
            goto L_0x06b5
        L_0x0735:
            r2 = r4
            goto L_0x069a
        L_0x0738:
            r5.addModel(r4, r8)
            goto L_0x0668
        L_0x073d:
            java.lang.String r10 = r8.A0j
            java.lang.String r0 = r5.A0D
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x078c
            X.Oy7 r11 = X.O14.A00(r3)
            java.lang.String r8 = r8.A0P()
            r8.getClass()
            java.lang.String r2 = r5.A08
            r2.getClass()
            X.0wc r0 = r11.A00
            X.1Ln r1 = X.1Ln.A0F(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x078a
            com.instagram.common.session.UserSession r0 = r11.A01
            X.Dbb.A1G(r1, r0)
            java.lang.String r0 = "jcs_view_requests"
            r1.A0l(r0)
            java.lang.String r0 = "view"
            r1.A0k(r0)
            java.lang.String r0 = "jcs_viewer_sheet"
            r1.A0p(r0)
            java.lang.String r0 = "story"
            r1.A0q(r0)
            java.lang.String r0 = "instagram"
            r1.A0o(r0)
            r1.A0s(r8)
            r1.A0v(r2)
            r1.Cgf()
        L_0x078a:
            r5.A0D = r10
        L_0x078c:
            X.3uh r1 = r5.A03
            if (r1 == 0) goto L_0x0813
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x0813
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.C0K()
            java.util.List r0 = X.JZW.A00(r0)
            if (r0 == 0) goto L_0x0813
            X.1Xj r10 = r1.A0b
            if (r10 == 0) goto L_0x0811
            X.1Xy r0 = r10.A0C
            java.util.List r0 = r0.C0K()
            java.util.List r0 = X.JZW.A00(r0)
        L_0x07ae:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0813
            X.3uh r1 = r5.A03
            if (r1 == 0) goto L_0x080f
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x07ca
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x07c6
            boolean r0 = r0.A4l()
            if (r0 != 0) goto L_0x07ca
        L_0x07c6:
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x080f
        L_0x07ca:
            java.lang.Integer r8 = X.AnonymousClass05K.A02
            android.content.Context r1 = r5.A0F
            r0 = 2131976608(0x7f1361a0, float:1.9590341E38)
            java.lang.String r1 = r1.getString(r0)
            X.3uh r0 = r5.A03
            X.VWC r2 = new X.VWC
            r2.<init>(r0, r8, r1)
        L_0x07dc:
            r1 = 2131974394(0x7f1358fa, float:1.958585E38)
            r0 = -1
            r5.A00(r2, r1, r0, r9)
            if (r10 == 0) goto L_0x080d
            X.1Xy r0 = r10.A0C
            java.util.List r0 = r0.C0K()
            java.util.List r0 = X.JZW.A00(r0)
        L_0x07ef:
            java.util.Iterator r8 = r0.iterator()
        L_0x07f3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0814
            java.lang.Object r2 = r8.next()
            X.3uh r0 = r5.A03
            if (r0 == 0) goto L_0x0807
            X.K9l r1 = r5.A0f
            X.1Xj r0 = r0.A0b
            r1.A00 = r0
        L_0x0807:
            X.K9l r0 = r5.A0f
            r5.addModel(r2, r0)
            goto L_0x07f3
        L_0x080d:
            r0 = 0
            goto L_0x07ef
        L_0x080f:
            r2 = r4
            goto L_0x07dc
        L_0x0811:
            r0 = 0
            goto L_0x07ae
        L_0x0813:
            r7 = r9
        L_0x0814:
            X.3uh r0 = r5.A03
            if (r0 == 0) goto L_0x0994
            java.util.List r10 = r5.A0W
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x083a
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0c()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x083a
            java.util.List r0 = r5.A0Y
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x083a
            X.3uh r0 = r5.A03
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0994
        L_0x083a:
            X.3uh r0 = r5.A03
            r0.getClass()
            X.1Xj r9 = r0.A0b
            r2 = 0
            if (r9 == 0) goto L_0x08bf
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C15()
            if (r0 == 0) goto L_0x08bf
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C15()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x08bf
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C15()
            java.lang.Object r0 = r0.get(r2)
            X.DTr r0 = (X.C46288DTr) r0
            java.util.List r0 = r0.Bjt()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x08bf
            r1 = 2131971512(0x7f134db8, float:1.9580005E38)
            r0 = -1
            r5.A00(r4, r1, r0, r7)
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.C15()
            java.lang.Object r13 = r0.get(r2)
            X.DTr r13 = (X.C46288DTr) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r0 = r13.Bjt()
            java.util.Iterator r14 = r0.iterator()
        L_0x088e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x08bc
            java.lang.Object r11 = r14.next()
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.String r8 = r13.getEmoji()
            r1 = 25
            X.BBV r0 = new X.BBV
            r0.<init>(r8, r1)
            X.9J5 r15 = new X.9J5
            r18 = r11
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r2
            r16 = r0
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r12.add(r15)
            goto L_0x088e
        L_0x08bc:
            r5.A04(r12, r6, r2)
        L_0x08bf:
            X.3uh r0 = r5.A03
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0931
            boolean r0 = r5.A0b
            if (r0 == 0) goto L_0x0921
            X.3uh r0 = r5.A03
            int r0 = r0.A01()
            r1 = 10
            if (r0 >= r1) goto L_0x08e1
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0c()
            int r0 = r0.size()
            if (r0 < r1) goto L_0x0921
        L_0x08e1:
            X.3uh r0 = r5.A03
            X.VOg r1 = new X.VOg
            r1.<init>(r0)
            X.UeA r0 = r5.A0N
            int r0 = r5.addModel(r1, r4, r0)
            r5.A00 = r0
            if (r0 != 0) goto L_0x08f9
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = r5.A0U
            X.3uh r0 = r5.A03
            r1.A0K(r0, r6)
        L_0x08f9:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x094e
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x0908:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x094e
            java.lang.Object r8 = r10.next()
            X.VW6 r8 = (X.VW6) r8
            X.3uh r0 = r5.A03
            X.Tzd r1 = new X.Tzd
            r1.<init>((X.VW6) r8, (X.C255773uh) r0)
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
            goto L_0x0908
        L_0x0921:
            java.util.List r0 = r5.A0Y
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x08f9
            r1 = 2131971511(0x7f134db7, float:1.9580003E38)
            r0 = -1
            r5.A00(r4, r1, r0, r7)
            goto L_0x08f9
        L_0x0931:
            if (r9 == 0) goto L_0x08f9
            boolean r0 = r9.A4X()
            if (r0 == 0) goto L_0x08f9
            X.0Tu r8 = X.0Tu.A05
            r0 = 36317268497404883(0x81065d000013d3, double:3.030525063436661E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x08f9
            r1 = 2131971509(0x7f134db5, float:1.958E38)
            r0 = -1
            r5.A00(r4, r1, r0, r7)
            goto L_0x08f9
        L_0x094e:
            java.util.List r8 = r5.A0Y
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0a3c
            java.util.List r0 = r5.A0X
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0a3c
            java.util.List r0 = r5.A0Z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0a3c
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0a3c
            X.2ms r0 = r5.A0S
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L_0x0a3c
            android.content.Context r1 = r5.A0F
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r1.getString(r0)
            X.Dez r0 = r5.A0R
            r5.addModel(r1, r0)
        L_0x0980:
            X.2ms r1 = r5.A0S
            if (r1 == 0) goto L_0x09a1
            boolean r0 = r1.CKB()
            if (r0 == 0) goto L_0x09a1
            X.2sK r0 = r5.A0T
            r5.addModel(r1, r0)
        L_0x098f:
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
        L_0x0994:
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x0c08
            r5.notifyDataSetChangedSmart()
            return
        L_0x09a1:
            X.3mM r8 = r5.A04
            r8.getClass()
            X.3uh r7 = r5.A03
            r7.getClass()
            com.instagram.model.reels.ReelViewerConfig r1 = r5.A05
            r1.getClass()
            X.3BQ r0 = r5.A06
            r0.getClass()
            android.content.Context r6 = r5.A0F
            r9 = r6
            r10 = r3
            r11 = r7
            r12 = r8
            r13 = r1
            r14 = r0
            r15 = r2
            X.N4R r0 = X.JZT.A00(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x098f
            X.0qQ.A0B(r3, r2)
            r1 = 18
            X.Phb r0 = new X.Phb
            r0.<init>(r3, r1)
            java.lang.Class<X.OyV> r8 = X.C72205OyV.class
            java.lang.Object r0 = r3.A01(r8, r0)
            X.OyV r0 = (X.C72205OyV) r0
            r6.getApplicationContext()
            X.8je r6 = X.C363378jd.A08
            com.instagram.common.session.UserSession r7 = r0.A00
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A00(r8)
            boolean r0 = r6.A04(r0, r7)
            if (r0 != 0) goto L_0x0a0f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316564123750895(0x8105b9000f11ef, double:3.030079614701594E-306)
            boolean r2 = X.182.A06(r2, r7, r0)
            X.6nu r1 = X.C317816nt.A00(r7)
            java.lang.String r0 = "IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM"
            boolean r0 = r1.A0B(r7, r0, r2)
            if (r0 == 0) goto L_0x098f
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A00(r8)
            boolean r0 = r6.A04(r0, r7)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0a0f
            goto L_0x098f
        L_0x0a0f:
            com.facebook.common.callercontext.CallerContext r0 = A11
            boolean r7 = r6.A04(r0, r3)
            boolean r6 = X.C363018iu.A00(r3)
            if (r6 == 0) goto L_0x0a39
            X.819 r1 = X.AnonymousClass819.ROWSHARE_SINGLE_STORY
        L_0x0a1d:
            X.818 r0 = X.AnonymousClass818.IG_STORY_VIEWERS_DASHBOARD
            boolean r0 = X.C367998ru.A03(r0, r1, r3)
            if (r0 == 0) goto L_0x098f
            if (r7 == 0) goto L_0x0a2a
            r2 = 1
            if (r6 != 0) goto L_0x0a2b
        L_0x0a2a:
            r2 = 0
        L_0x0a2b:
            X.3uh r0 = r5.A03
            X.L6a r1 = new X.L6a
            r1.<init>(r0, r7, r2)
            X.K9j r0 = r5.A0K
            r5.addModel(r1, r0)
            goto L_0x098f
        L_0x0a39:
            X.819 r1 = X.AnonymousClass819.ROWSHARE_AUTO_SETTING_STORY
            goto L_0x0a1d
        L_0x0a3c:
            if (r9 == 0) goto L_0x0b7d
            boolean r0 = r9.A5O()
            if (r0 == 0) goto L_0x0b7d
            int r1 = r9.A12()
            r0 = 19
            if (r1 == r0) goto L_0x0b7d
            X.0Tu r9 = X.0Tu.A06
            r0 = 36313029364876906(0x8102820003066a, double:3.0278442189563516E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x0b7d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0a67
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            r5.A04(r8, r2, r2)
        L_0x0a67:
            X.2ms r11 = r5.A0S
            boolean r0 = r11.CKB()
            if (r0 != 0) goto L_0x0a85
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a85
            X.3uh r0 = r5.A03
            X.WZw r1 = new X.WZw
            r1.<init>(r0, r5)
            X.UeB r0 = r5.A0P
            r5.addModel(r1, r0)
        L_0x0a85:
            java.util.List r10 = r5.A0X
            boolean r8 = X.AnonymousClass7TE.A1b(r10)
            X.3uh r0 = r5.A03
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0a98
            boolean r0 = r11.CKB()
            r12 = 1
            if (r0 == 0) goto L_0x0a99
        L_0x0a98:
            r12 = 0
        L_0x0a99:
            X.3uh r6 = r5.A03
            int r1 = r6.A01()
            java.util.List r0 = r6.A0n
            int r0 = r0.size()
            int r1 = r1 - r0
            int r0 = r6.A00
            int r1 = r1 - r0
            java.util.List r0 = r6.A0p
            int r0 = r0.size()
            int r0 = X.C13988Tno.A07(r1, r0, r2)
            if (r0 <= 0) goto L_0x0ac2
            boolean r0 = r11.CJz()
            if (r0 == 0) goto L_0x0ac2
            boolean r0 = r11.CKB()
            r9 = 1
            if (r0 == 0) goto L_0x0ac3
        L_0x0ac2:
            r9 = 0
        L_0x0ac3:
            if (r8 != 0) goto L_0x0ac9
            if (r12 != 0) goto L_0x0ac9
            if (r9 == 0) goto L_0x0980
        L_0x0ac9:
            java.lang.Integer r8 = X.AnonymousClass05K.A1F
            X.3uh r1 = r5.A03
            java.lang.String r0 = ""
            X.VWC r6 = new X.VWC
            r6.<init>(r1, r8, r0)
            r1 = 2131971479(0x7f134d97, float:1.9579938E38)
            r0 = -1
            r5.A00(r6, r1, r0, r7)
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            r5.A04(r10, r2, r2)
            boolean r0 = r11.CKB()
            if (r0 != 0) goto L_0x0af5
            X.3uh r0 = r5.A03
            X.WZx r1 = new X.WZx
            r1.<init>(r0, r5)
            X.UeB r0 = r5.A0P
            r5.addModel(r1, r0)
        L_0x0af5:
            if (r9 == 0) goto L_0x0b5a
            X.3uh r6 = r5.A03
            int r1 = r6.A01()
            java.util.List r0 = r6.A0n
            int r0 = r0.size()
            int r1 = r1 - r0
            java.util.List r0 = r6.A0p
            int r0 = r0.size()
            int r6 = X.C13988Tno.A07(r1, r0, r2)
            android.content.Context r7 = r5.A0F
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131820910(0x7f11016e, float:1.9274548E38)
            java.lang.String r6 = X.DbY.A0d(r1, r6, r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131971469(0x7f134d8d, float:1.9579918E38)
            java.lang.String r0 = r1.getString(r0)
            X.VT8 r1 = new X.VT8
            r1.<init>(r6, r0)
            X.Udl r0 = r5.A0L
            r5.addModel(r1, r0)
            X.3uh r0 = r5.A03
            r5.A02(r0)
        L_0x0b35:
            X.3uh r0 = r5.A03
            java.lang.Boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x0980
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0980
            android.content.Context r0 = r5.A0F
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971513(0x7f134db9, float:1.9580007E38)
            java.lang.String r0 = r1.getString(r0)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            X.Mg4 r0 = r5.A0Q
            r5.addModel(r1, r0)
            goto L_0x0980
        L_0x0b5a:
            if (r12 == 0) goto L_0x0b35
            android.content.Context r0 = r5.A0F
            android.content.res.Resources r6 = r0.getResources()
            r1 = 2131820909(0x7f11016d, float:1.9274546E38)
            X.3uh r0 = r5.A03
            int r0 = r0.A00
            java.lang.String r0 = X.DbY.A0d(r6, r0, r1)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            X.Mg4 r0 = r5.A0Q
            r5.addModel(r1, r0)
            X.3uh r0 = r5.A03
            r5.A02(r0)
            goto L_0x0b35
        L_0x0b7d:
            X.3uh r9 = r5.A03
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313214048274241(0x8102ad00000741, double:3.0279610134804866E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 != 0) goto L_0x0b98
            X.1Xj r0 = r9.A0b
            if (r0 == 0) goto L_0x0ba5
            java.util.List r0 = r9.A0p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0ba5
        L_0x0b98:
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            r5.A04(r8, r2, r2)
            r5.A05(r6)
            goto L_0x0980
        L_0x0ba5:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0bb8
            java.util.List r0 = r5.A0Z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0bb8
            r5.A05(r2)
            goto L_0x0980
        L_0x0bb8:
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0c()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0980
            X.2s2 r0 = r5.A0G
            r5.addModel(r4, r0)
            X.3uh r0 = r5.A03
            java.util.List r0 = r0.A0c()
            java.util.Iterator r9 = r0.iterator()
        L_0x0bd3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0bf2
            java.lang.Object r8 = r9.next()
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            com.instagram.model.reels.Reel r7 = r5.A02
            X.3uh r6 = r5.A03
            boolean r0 = r5.A06(r8)
            X.Tzd r1 = new X.Tzd
            r1.<init>(r7, r6, r8, r0)
            X.Tze r0 = r5.A0O
            r5.addModel(r1, r0)
            goto L_0x0bd3
        L_0x0bf2:
            X.2ms r0 = r5.A0S
            boolean r0 = r0.CKB()
            if (r0 != 0) goto L_0x0980
            X.3uh r0 = r5.A03
            X.WZw r1 = new X.WZw
            r1.<init>(r0, r5)
            X.UeB r0 = r5.A0P
            r5.addModel(r1, r0)
            goto L_0x0980
        L_0x0c08:
            r5.updateListView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14176TrF.A07():void");
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void onSearchTextChanged(String str) {
        if (this.A03 != null) {
            this.A09 = str;
            A07();
            this.A0U.A0K(this.A03, this.A00);
            this.A0E = false;
        }
    }

    public static VWC A01(Context context, C14176TrF trF, Integer num) {
        String string = context.getResources().getString(2131972971);
        C255773uh r1 = trF.A03;
        r1.getClass();
        return new VWC(r1, num, string);
    }

    private void A04(List list, boolean z, boolean z2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9J5 r5 = (AnonymousClass9J5) it.next();
            Reel reel = this.A02;
            C255773uh r1 = this.A03;
            User user = (User) r5.A05;
            C14631Tzd tzd = new C14631Tzd(reel, r1, user, A06(user));
            BBV bbv = (BBV) r5.A02;
            if (bbv != null && !bbv.A00.isEmpty()) {
                tzd.A00 = bbv;
            }
            XA1 xa1 = (XA1) r5.A01;
            if (xa1 != null) {
                tzd.A01 = xa1;
            }
            String str = r5.A06;
            if (str != null && !str.equals("")) {
                tzd.A09 = str;
            }
            UserSession userSession = this.A0J;
            0Tu r8 = 0Tu.A06;
            boolean z3 = false;
            if ((182.A06(r8, userSession, 36313029364876906L) || 182.A06(r8, userSession, 36313029364942443L)) && this.A09.isEmpty()) {
                tzd.A0H = true;
            }
            if (!user.isRestricted() || !182.A06(0Tu.A05, userSession, 36324376668549173L)) {
                tzd.A0G = false;
                tzd.A0D = false;
            } else {
                tzd.A0G = true;
                tzd.A0D = true;
            }
            Boolean bool = (Boolean) r5.A04;
            if (bool != null && bool.booleanValue()) {
                z3 = true;
            }
            tzd.A0B = z3;
            tzd.A0C = z;
            tzd.A0E = z2;
            addModel(tzd, this.A0O);
        }
    }

    public final void unregisterAdapterDataObserver(C231402rc r4) {
        C14176TrF.super.unregisterAdapterDataObserver(r4);
        if (this.A0K != null) {
            UserSession userSession = this.A0J;
            0qQ.A0B(userSession, 0);
            if (C59719JVd.A00 != null) {
                AnonymousClass1Nd.A00(userSession).A02(C59719JVd.A00, C61149Jy0.class);
                C59719JVd.A00 = null;
            }
        }
    }
}
