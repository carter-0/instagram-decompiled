package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.TvH  reason: case insensitive filesystem */
public final class C14388TvH implements View.OnClickListener, View.OnTouchListener {
    public AnonymousClass9B2 A00;
    public SearchEditText A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final AccessibilityManager A05;
    public final BaseFragmentActivity A06;
    public final AnonymousClass0iw A07;
    public final 0wc A08;
    public final UserSession A09;
    public final C14360Tup A0A;
    public final 2bv A0B;
    public final C230882qT A0C;
    public final String A0D;
    public final AnonymousClass0eM A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final String A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006d, code lost:
        if (X.182.A06(r3, r8, 36327447570495940L) == false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14388TvH(android.content.Context r5, com.instagram.base.activity.BaseFragmentActivity r6, X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, X.C14360Tup r9, X.2bv r10, X.C230882qT r11) {
        /*
            r4 = this;
            r2 = 2
            X.AnonymousClass7TF.A1C(r6, r2, r8)
            r4.<init>()
            r4.A04 = r5
            r4.A06 = r6
            r4.A09 = r8
            r4.A07 = r7
            r4.A0C = r11
            r4.A0B = r10
            r4.A0A = r9
            java.lang.String r0 = X.C3262475z.A00(r8)
            r4.A0D = r0
            boolean r0 = X.C13988Tno.A1Y(r8)
            r4.A0F = r0
            boolean r0 = X.C13988Tno.A1Y(r8)
            r4.A0L = r0
            boolean r0 = X.C13988Tno.A1Y(r8)
            r4.A0H = r0
            boolean r0 = X.C13988Tno.A1Y(r8)
            r4.A02 = r0
            boolean r1 = X.C13988Tno.A1Y(r8)
            r0 = 0
            if (r1 == 0) goto L_0x003b
            r0 = -1
        L_0x003b:
            r4.A03 = r0
            boolean r0 = X.C13988Tno.A1Y(r8)
            r4.A0J = r0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328306563431642(0x81106700013cda, double:3.0375055808387076E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            r4.A0G = r0
            r0 = 36330565716165303(0x811275000042b7, double:3.0389342781243527E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            r0 = r0 ^ 1
            r4.A0I = r0
            boolean r0 = X.AnonymousClass9B8.A0A(r8)
            if (r0 == 0) goto L_0x006f
            r0 = 36327447570495940(0x810f9f000939c4, double:3.036962350247283E-306)
            boolean r1 = X.182.A06(r3, r8, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r4.A0K = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r1 = r5.getSystemService(r0)
            boolean r0 = r1 instanceof android.view.accessibility.AccessibilityManager
            if (r0 == 0) goto L_0x0098
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
        L_0x007e:
            r4.A05 = r1
            X.0wc r0 = X.AnonymousClass0kN.A01(r7, r8)
            r4.A08 = r0
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            r4.A0M = r0
            X.Ivk r0 = new X.Ivk
            r0.<init>(r4, r2)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0E = r0
            return
        L_0x0098:
            r1 = 0
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14388TvH.<init>(android.content.Context, com.instagram.base.activity.BaseFragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.Tup, X.2bv, X.2qT):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r4.A0G != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r26, android.view.MotionEvent r27) {
        /*
            r25 = this;
            r10 = 0
            r5 = r26
            r7 = r27
            boolean r3 = X.AnonymousClass7TF.A1U(r10, r5, r7)
            int r0 = r7.getAction()
            if (r0 != r3) goto L_0x00c5
            boolean r0 = r5 instanceof com.instagram.ui.widget.searchedittext.SearchEditText
            r2 = 0
            r4 = r25
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x00c6
            com.instagram.common.session.UserSession r11 = r4.A09
            X.0Tu r6 = X.0Tu.A05
            r0 = 36328319448268000(0x81106a00003ce0, double:3.0375137292611034E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 != 0) goto L_0x00c6
            r1 = r5
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            float r0 = r7.getX()
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x00c6
            X.0wc r8 = r4.A08
            X.1QJ r1 = X.AnonymousClass1QI.A00
            X.1QM r0 = r1.A02
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = ""
        L_0x0042:
            java.lang.String r7 = ""
            X.C14428Tvx.A01(r8, r0, r7, r7, r7)
            X.9B2 r0 = r4.A00
            if (r0 == 0) goto L_0x004f
            com.instagram.model.direct.DirectShareTarget r2 = r0.A00()
        L_0x004f:
            X.1QM r0 = r1.A02
            java.lang.String r6 = r0.A00
            if (r6 != 0) goto L_0x0056
            r6 = r7
        L_0x0056:
            r0 = 2332(0x91c, float:3.268E-42)
            java.lang.String r5 = X.C273654mx.A00(r0)
            long r0 = X.JTR.A0L()
            X.VhG r9 = X.VGG.A00(r11)
            r14 = 0
            r9.A00 = r5
            r9.A02 = r14
            r9.A01 = r14
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r12 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r12.<init>(r11)
            com.instagram.base.activity.BaseFragmentActivity r13 = r4.A06
            X.0iw r15 = r4.A07
            boolean r9 = r4.A0J
            if (r9 == 0) goto L_0x007e
            boolean r9 = r4.A0G
            r21 = 1
            if (r9 == 0) goto L_0x0080
        L_0x007e:
            r21 = 0
        L_0x0080:
            X.WVO r9 = new X.WVO
            r9.<init>(r4, r6, r0)
            r1 = 22
            X.PQr r0 = new X.PQr
            r0.<init>(r4, r1)
            r20 = r14
            r23 = r10
            r24 = r10
            r22 = r10
            r18 = r0
            r19 = r5
            r17 = r2
            r16 = r9
            boolean r0 = r12.A0B(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x00c5
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r12 = android.util.Log.getStackTraceString(r0)
            X.0qQ.A07(r12)
            java.lang.String r13 = X.C51968G9o.A16(r4)
            X.0qQ.A07(r13)
            java.lang.String r0 = r4.A0D
            r9 = r2
            r10 = r6
            r11 = r5
            r14 = r0
            r15 = r7
            r16 = r7
            X.C69836Nsy.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00c5:
            return r3
        L_0x00c6:
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x00ee
            r1 = r5
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            float r0 = r7.getX()
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x00ee
            X.9B2 r0 = r4.A00
            if (r0 == 0) goto L_0x00df
            com.instagram.model.direct.DirectShareTarget r2 = r0.A00()
        L_0x00df:
            android.content.Context r5 = r4.A04
            com.instagram.common.session.UserSession r8 = r4.A09
            com.instagram.base.activity.BaseFragmentActivity r6 = r4.A06
            X.Nin r9 = X.C69287Nin.IG_SEARCH
            X.0iw r7 = r4.A07
            r10 = r2
            X.C49951FGg.A02(r5, r6, r7, r8, r9, r10)
            return r3
        L_0x00ee:
            r4.A00()
            r5.setOnTouchListener(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14388TvH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Twa, java.lang.Object] */
    private final void A00() {
        if (1pR.A00 != null) {
            BaseFragmentActivity baseFragmentActivity = this.A06;
            UserSession userSession = this.A09;
            C309516Yo r1 = new C309516Yo(baseFragmentActivity, userSession);
            C14398TvR.A00();
            r1.A0D(new Object().A03(userSession));
            r1.A0A = "composite_search_back_stack";
            r1.A04();
        }
    }

    public final SearchEditText A01(SearchEditText searchEditText) {
        Drawable[] compoundDrawablesRelative;
        Drawable drawable;
        this.A01 = searchEditText;
        if (this.A0F) {
            if (searchEditText != null) {
                AnonymousClass30Y A0a = DbU.A0a((C230372pW) this.A0E.getValue(), AnonymousClass30Y.A00(0, 0, this.A0M));
                2el CFM = this.A06.CFM();
                if (CFM != null) {
                    CFM.A05(searchEditText, A0a);
                }
                UserSession userSession = this.A09;
                searchEditText.setHint(C14426Tvv.A00(userSession));
                1Av A002 = 1Au.A00(userSession);
                0qQ.A0B("has_initiated_chat_with_agent", 0);
                if (!A002.A01.getBoolean("has_initiated_chat_with_agent", false)) {
                    C14360Tup tup = this.A0A;
                    tup.A01 = searchEditText;
                    if (this.A0H) {
                        tup.A00 = 2500;
                    }
                    this.A0C.A00(searchEditText, QPTooltipAnchor.EXPLORE_SEARCH_BAR_META_AI_BUTTON, this.A0B);
                }
            }
        } else if (searchEditText != null) {
            searchEditText.setHint(2131972797);
        }
        SearchEditText searchEditText2 = this.A01;
        if (!(searchEditText2 == null || (compoundDrawablesRelative = searchEditText2.getCompoundDrawablesRelative()) == null || (drawable = compoundDrawablesRelative[0]) == null)) {
            drawable.mutate().setAlpha(255);
        }
        SearchEditText searchEditText3 = this.A01;
        if (searchEditText3 != null) {
            searchEditText3.clearFocus();
        }
        SearchEditText searchEditText4 = this.A01;
        if (searchEditText4 != null) {
            searchEditText4.setCursorVisible(false);
        }
        SearchEditText searchEditText5 = this.A01;
        if (searchEditText5 != null) {
            AccessibilityManager accessibilityManager = this.A05;
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                searchEditText5.setOnTouchListener(this);
            } else {
                AnonymousClass0fU.A00(this, searchEditText5);
            }
        }
        return this.A01;
    }

    public final void onClick(View view) {
        int A032 = DbX.A03(view, -1645471266);
        A00();
        view.setOnClickListener((View.OnClickListener) null);
        AnonymousClass0fD.A0C(2111085878, A032);
    }
}
