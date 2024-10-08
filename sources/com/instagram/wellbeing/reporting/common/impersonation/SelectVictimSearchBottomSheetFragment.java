package com.instagram.wellbeing.reporting.common.impersonation;

import X.0wb;
import X.28D;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DJ;
import X.C228602lw;
import X.C273434mZ;
import X.C294875nB;
import X.C336267eL;
import X.C337237fw;
import X.C337257fy;
import X.C48058EUc;
import X.C49238Erh;
import X.C66579MXk;
import X.C67058MhZ;
import X.C67562Mpw;
import X.C72982PRp;
import X.DbX;
import X.Dbc;
import X.FVB;
import X.Fl0;
import X.NHU;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;
import java.util.List;

public class SelectVictimSearchBottomSheetFragment extends AnonymousClass4DH implements C294875nB, C273434mZ {
    public User A00;
    public C72982PRp A01;
    public NHU A02;
    public String A03;
    public int A04;
    public int A05;
    public UserSession A06;
    public FVB A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public TouchInterceptorFrameLayout mTouchInterceptorFrameLayout;

    public final AnonymousClass4DJ B7u() {
        return this;
    }

    public final /* synthetic */ void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    public final /* synthetic */ void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    public final void D8N(DirectShareTarget directShareTarget) {
    }

    public final /* synthetic */ void D9P(DirectShareTarget directShareTarget) {
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
    }

    public final void DpC(RectF rectF, 28D r2, DirectShareTarget directShareTarget) {
    }

    public final void DpD(View view) {
    }

    public final void EIL() {
    }

    public final String getModuleName() {
        return "SELECT_VICTIM_SEARCH_BOTTOM_SHEET_FRAGMENT";
    }

    public final TouchInterceptorFrameLayout C8v() {
        return this.mTouchInterceptorFrameLayout;
    }

    public final void Dk6(C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        SearchController searchController = this.A07.A02;
        if (searchController != null) {
            searchController.A00();
        }
        NHU nhu = this.A02;
        C72982PRp pRp = this.A01;
        if (pRp != null && nhu != null && (directSearchResult instanceof DirectShareTarget)) {
            boolean z = this.A08;
            ((C48058EUc) pRp).A00.A01((DirectShareTarget) directSearchResult, nhu, z, false);
        }
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        0wb.A01.Ew0("SelectVictimSearchBottomSheetFragment", C66579MXk.A00(101));
    }

    public final AnonymousClass0wW getSession() {
        return this.A06;
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A09) {
            FVB fvb = this.A07;
            if (fvb.A01 == null) {
                Context context = fvb.A06;
                C336267eL A072 = C67562Mpw.A07(context, fvb.A09, new C228602lw(context, fvb.A07), "raven", "direct_user_search_nullstate", (String) null, 0, 0, true, false);
                fvb.A01 = A072;
                Fl0 fl0 = fvb.A00;
                if (fl0 != null) {
                    A072.EcJ(fl0);
                }
            }
            SearchController searchController = fvb.A02;
            if (searchController != null) {
                searchController.A02(false, 0.0f);
            }
            this.A09 = false;
        }
        Dbc.A0P(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1813194331);
        SelectVictimSearchBottomSheetFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A06 = DbX.A0U(this);
        String string = bundle2.getString("ReportingConstants.ARG_CONTENT_ID");
        this.A08 = bundle2.getBoolean(C66579MXk.A00(54), true);
        this.A05 = bundle2.getInt(C66579MXk.A00(51), 0);
        this.A0A = bundle2.getBoolean("DirectSearchUserFragment.DIRECT_SHOW_SUGGESTION_TITLE", true);
        this.A04 = bundle2.getInt("DirectSearchUserFragment.DIRECT_SEARCH_SECTION_LIMIT", 5);
        String str = this.A03;
        if (!(!this.A08 || string == null || str == null)) {
            C49238Erh.A00(this.A06, bundle2.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD")).A00(this, this.A00, str, string);
        }
        AnonymousClass0fD.A09(986016452, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.instagram.wellbeing.reporting.common.impersonation.SelectVictimSearchBottomSheetFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.5nB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.0iw} */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r29, android.view.ViewGroup r30, android.os.Bundle r31) {
        /*
            r28 = this;
            r0 = 1566696466(0x5d61e412, float:1.01732217E18)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r0 = r28
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = new com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout
            r1.<init>(r2)
            r0.mTouchInterceptorFrameLayout = r1
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r9 = r0.A06
            X.0gy r8 = X.AnonymousClass07i.A00(r0)
            int r4 = r0.A05
            boolean r2 = r0.A0A
            int r1 = r0.A04
            r3 = 0
            X.FVB r6 = new X.FVB
            r11 = r0
            r10 = r0
            r12 = r4
            r13 = r1
            r14 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A07 = r6
            com.instagram.user.model.User r1 = r0.A00
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = r1.getId()
            r6.A03 = r1
        L_0x003b:
            X.FVB r4 = r0.A07
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r10 = r0.mTouchInterceptorFrameLayout
            X.2tC r6 = X.AnonymousClass2t9.A00(r9)
            X.5nB r8 = r4.A0A
            com.instagram.common.session.UserSession r13 = r4.A09
            X.0Tu r7 = X.0Tu.A05
            r1 = 36314811776961332(0x810421000d0b34, double:3.02897142353574E-306)
            boolean r16 = X.182.A06(r7, r13, r1)
            java.lang.String r15 = "direct_user_search"
            X.EGN r1 = new X.EGN
            r11 = r1
            r12 = r0
            r14 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r6.A01(r1)
            android.content.Context r8 = r4.A06
            X.EG8 r1 = new X.EG8
            r1.<init>(r8, r4)
            r6.A01(r1)
            X.EFm r1 = new X.EFm
            r1.<init>()
            r6.A01(r1)
            X.EFn r1 = new X.EFn
            r1.<init>()
            r6.A01(r1)
            X.Uhf r1 = new X.Uhf
            r1.<init>()
            X.2t9 r11 = X.DbU.A0U(r6, r1)
            X.5fe r7 = r4.A08
            int r6 = r4.A04
            boolean r1 = r4.A0B
            X.Fl0 r2 = new X.Fl0
            r16 = r7
            r17 = r11
            r18 = r13
            r19 = r6
            r20 = r1
            r14 = r2
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r4.A00 = r2
            java.lang.String r1 = r4.A03
            if (r1 == 0) goto L_0x00a5
            r2.A01 = r1
        L_0x00a5:
            androidx.recyclerview.widget.LinearLayoutManager r12 = new androidx.recyclerview.widget.LinearLayoutManager
            r12.<init>(r9)
            int r1 = r4.A05
            r14 = 0
            r19 = 0
            com.instagram.ui.widget.search.SearchController r8 = new com.instagram.ui.widget.search.SearchController
            r15 = r14
            r16 = r14
            r21 = r3
            r22 = r3
            r23 = r3
            r24 = r3
            r25 = r3
            r26 = r3
            r27 = r3
            r18 = r1
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
            r4.A02 = r8
            r8.A08 = r3
            r0.registerLifecycleListener(r8)
            r1 = 1
            r0.A09 = r1
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r0.mTouchInterceptorFrameLayout
            r0 = 734127425(0x2bc1e541, float:1.3777106E-12)
            X.AnonymousClass0fD.A09(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.reporting.common.impersonation.SelectVictimSearchBottomSheetFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        C337257fy r0;
        int A022 = AnonymousClass0fD.A02(2045939503);
        super.onDestroyView();
        this.mTouchInterceptorFrameLayout = null;
        FVB fvb = this.A07;
        if (!(fvb == null || (r0 = fvb.A01) == null)) {
            r0.EcJ((C337237fw) null);
            r0.DDU();
        }
        AnonymousClass0fD.A09(1429305090, A022);
    }
}
