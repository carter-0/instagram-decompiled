package com.instagram.business.fragment;

import X.0qQ;
import X.2Lv;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22030Xtl;
import X.C319586qr;
import X.C49710F2v;
import X.C49883FBi;
import X.C51925G7t;
import X.DbX;
import X.Dba;
import X.E9F;
import X.EEJ;
import X.FG1;
import X.FRU;
import X.G8D;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;
import java.util.Map;

public class FBPageListWithPreviewFragment extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51925G7t {
    public BusinessFlowAnalyticsLogger A00;
    public G8D A01;
    public PageSelectionOverrideData A02;
    public C49710F2v A03;
    public AnonymousClass0wW A04;
    public boolean A05;
    public boolean A06;
    public 2da A07;
    public E9F A08;
    public BusinessInfo A09;
    public String A0A;
    public boolean A0B;
    public final Handler A0C = AnonymousClass7TF.A0D();
    public BusinessNavBar mBusinessNavBar;
    public EEJ mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public IgdsStepperHeader mStepperHeader;

    public final String getModuleName() {
        return "fb_page_list_with_preview";
    }

    public final void APF() {
        if (this.A05) {
            this.A07.ARJ(false);
            this.A07.setIsLoading(true);
        }
    }

    public final void ARL() {
        if (this.A05) {
            this.A07.ARJ(true);
            this.A07.setIsLoading(false);
        }
    }

    public final void DZI() {
        this.A03.A00("continue");
    }

    public final void Di0() {
        if (!this.A06 && !this.A05 && this.A01 != null) {
            this.A03.A00("skip");
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.CkV(new C22030Xtl("page_selection", this.A03.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
            G8D g8d = this.A01;
            if (g8d != null) {
                ((BusinessConversionActivity) g8d).A0p((Bundle) null, true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r3) {
        /*
            r2 = this;
            r2.A07 = r3
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x002c
            r0 = 2131964223(0x7f13313f, float:1.9565222E38)
        L_0x0009:
            r3.Eom(r0)
        L_0x000c:
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0019
            X.3JR r1 = X.DbV.A0K()
            r0 = 44
            X.FPB.A02(r1, r3, r2, r0)
        L_0x0019:
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x002b
            X.Jbl r1 = new X.Jbl
            r1.<init>()
            r0 = 45
            X.FPB r0 = X.FPB.A00(r2, r0)
            X.C59904JbT.A01(r0, r3, r1)
        L_0x002b:
            return
        L_0x002c:
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x000c
            r0 = 2131973126(0x7f135406, float:1.958328E38)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.configureActionBar(X.2da):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        C49710F2v f2v = this.A03;
        boolean z = this.A0B;
        boolean z2 = f2v.A09;
        if (!z2 && !f2v.A08 && (businessFlowAnalyticsLogger = f2v.A01) != null) {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("page_selection", f2v.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (z2 || f2v.A08) {
            G8D g8d = f2v.A02;
            g8d.getClass();
            g8d.AGV();
            return true;
        }
        G8D g8d2 = f2v.A02;
        if (g8d2 == null) {
            return false;
        }
        if (z) {
            Dba.A1R(g8d2);
        }
        return true;
    }

    public final void onAttach(Context context) {
        FBPageListWithPreviewFragment.super.onAttach(context);
        this.A01 = FG1.A01(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (r2 != X.C319586qr.SHOPPING_IN_APP_SIGNUP_FLOW) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b3, code lost:
        if (r2 != X.C319586qr.SERVICE_ONBOARDING_FLOW) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (r2 != com.instagram.business.controller.datamodel.ConversionStep.RENEW) goto L_0x00c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1122105077(0x42e1f6f5, float:112.98234)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r7 = r12
            com.instagram.business.fragment.FBPageListWithPreviewFragment.super.onCreate(r13)
            android.os.Bundle r5 = r12.requireArguments()
            X.0wW r0 = X.DbX.A0T(r12)
            r12.A04 = r0
            java.lang.String r0 = "entry_point"
            java.lang.String r0 = X.DbU.A0l(r5, r0)
            r12.A0A = r0
            java.lang.String r0 = "EXTRA_FB_OVERRIDE_DATA"
            android.os.Parcelable r0 = r5.getParcelable(r0)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
            r12.A02 = r0
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x0043
            X.0wW r2 = r12.A04
            X.6qr r1 = r0.B6a()
            X.G8D r0 = r12.A01
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C319596qs.A00(r1, r12, r2, r0)
            r12.A00 = r0
        L_0x0043:
            X.0wW r4 = r12.A04
            X.G8D r2 = r12.A01
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r12.A00
            X.F2v r1 = new X.F2v
            r1.<init>(r12, r0, r2, r4)
            r12.A03 = r1
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r12.A02
            if (r0 == 0) goto L_0x0056
            r1.A03 = r0
        L_0x0056:
            java.lang.String r0 = r12.A0A
            r1.A06 = r0
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x0198
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A09
            r0.getValue()
        L_0x0065:
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x018e
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r4 = r0.A02
        L_0x006f:
            r12.A09 = r4
            X.F2v r0 = r12.A03
            X.G8D r2 = r0.A02
            if (r2 == 0) goto L_0x0096
            X.FRU r0 = X.Dba.A0C(r2)
            com.instagram.model.business.BusinessInfo r0 = r0.A03
            if (r0 == 0) goto L_0x0096
            X.FEa r1 = new X.FEa
            r1.<init>(r4)
            java.lang.String r0 = r0.A0J
            r1.A0J = r0
            r0 = 1
            r1.A0O = r0
            com.instagram.model.business.BusinessInfo r4 = new com.instagram.model.business.BusinessInfo
            r4.<init>(r1)
            X.FRU r0 = X.Dba.A0C(r2)
            r0.A02 = r4
        L_0x0096:
            r12.A09 = r4
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x00a5
            X.6qr r2 = r0.B6a()
            X.6qr r1 = X.C319586qr.SHOPPING_IN_APP_SIGNUP_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            r12.A06 = r0
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x00b5
            X.6qr r2 = r0.B6a()
            X.6qr r1 = X.C319586qr.SERVICE_ONBOARDING_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r12.A05 = r0
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x00c5
            com.instagram.business.controller.datamodel.ConversionStep r2 = r0.E2J()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            r0 = 0
            if (r2 == r1) goto L_0x00c6
        L_0x00c5:
            r0 = 1
        L_0x00c6:
            r12.A0B = r0
            X.F2v r1 = r12.A03
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = r0.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dc
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            java.lang.String r11 = r0.A04
            if (r11 != 0) goto L_0x00f4
        L_0x00dc:
            android.content.Context r1 = r12.requireContext()
            X.F2v r0 = r12.A03
            boolean r2 = r0.A0A
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131956541(0x7f13133d, float:1.954964E38)
            if (r2 == 0) goto L_0x00f0
            r0 = 2131965061(0x7f133485, float:1.9566921E38)
        L_0x00f0:
            java.lang.String r11 = X.AnonymousClass7TF.A0d(r1, r0)
        L_0x00f4:
            X.F2v r1 = r12.A03
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0108
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r1.A03
            java.lang.String r10 = r0.A03
            if (r10 != 0) goto L_0x011a
        L_0x0108:
            X.G8D r0 = r12.A01
            if (r0 == 0) goto L_0x0137
            X.6qr r1 = r0.B6a()
            X.6qr r0 = X.C319586qr.CREATOR_CONVERSION_FLOW
        L_0x0112:
            if (r1 != r0) goto L_0x014b
            java.lang.String r2 = ""
        L_0x0116:
            java.lang.String r10 = r2.toString()
        L_0x011a:
            android.content.Context r6 = r12.requireContext()
            X.0wW r9 = r12.A04
            boolean r0 = r9 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0135
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
        L_0x0126:
            X.E9F r5 = new X.E9F
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A08 = r5
            r0 = 1181942443(0x467302ab, float:15552.667)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0135:
            r9 = 0
            goto L_0x0126
        L_0x0137:
            X.0wW r1 = r12.A04
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x014b
            com.instagram.user.model.User r0 = X.AnonymousClass0eD.A00(r1)
            r0.getClass()
            X.16V r1 = r0.A0J()
            X.16V r0 = X.16V.A06
            goto L_0x0112
        L_0x014b:
            android.content.Context r6 = r12.requireContext()
            X.0wW r5 = r12.A04
            java.lang.String r2 = X.0Gl.A02(r5)
            X.F2v r0 = r12.A03
            boolean r1 = r0.A0A
            r0 = 3
            X.0qQ.A0B(r5, r0)
            if (r1 == 0) goto L_0x0182
            if (r2 == 0) goto L_0x0182
            r1 = 2131956536(0x7f131338, float:1.954963E38)
            r0 = 2131964588(0x7f1332ac, float:1.9565962E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r6, r0)
            java.lang.String r0 = X.DbY.A0c(r6, r4, r1)
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r0)
            int r1 = X.DbV.A02(r6)
            X.ESg r0 = new X.ESg
            r0.<init>((android.content.Context) r6, (X.0lg) r5, (int) r1)
            X.AnonymousClass7AV.A05(r2, r0, r4)
        L_0x017f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0116
        L_0x0182:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131956542(0x7f13133e, float:1.9549643E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r1, r0)
            goto L_0x017f
        L_0x018e:
            java.lang.String r0 = "business_info"
            android.os.Parcelable r4 = r5.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r4 = (com.instagram.model.business.BusinessInfo) r4
            goto L_0x006f
        L_0x0198:
            java.lang.String r0 = "target_page_id"
            r5.getString(r0)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r8.A01 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r0.E2I() != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 1000815852(0x3ba73cec, float:0.005103698)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131625436(0x7f0e05dc, float:1.887808E38)
            r6 = 0
            android.view.View r3 = r9.inflate(r0, r10, r6)
            r0 = 2131436820(0x7f0b2514, float:1.8495521E38)
            android.view.View r5 = r3.requireViewById(r0)
            com.instagram.business.ui.BusinessNavBar r5 = (com.instagram.business.ui.BusinessNavBar) r5
            r8.mBusinessNavBar = r5
            X.G8D r0 = r8.A01
            if (r0 == 0) goto L_0x0027
            com.instagram.business.controller.datamodel.ConversionStep r0 = r0.E2I()
            r4 = 2131960992(0x7f1324a0, float:1.9558668E38)
            if (r0 == 0) goto L_0x002a
        L_0x0027:
            r4 = 2131968361(0x7f134169, float:1.9573614E38)
        L_0x002a:
            r1 = 2131960994(0x7f1324a2, float:1.9558672E38)
            X.EEJ r0 = new X.EEJ
            r0.<init>((com.instagram.business.ui.BusinessNavBar) r5, (X.C51925G7t) r8, (int) r4, (int) r1)
            r8.mBusinessNavBarHelper = r0
            com.instagram.business.ui.BusinessNavBar r4 = r8.mBusinessNavBar
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x0043
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x0043
            X.G8D r1 = r8.A01
            r0 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r4.A02(r0)
            X.F2v r4 = r8.A03
            com.instagram.business.ui.BusinessNavBar r7 = r8.mBusinessNavBar
            androidx.fragment.app.Fragment r1 = r4.A00
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r5 = r1.getString(r0)
            X.0lg r4 = r4.A05
            r0 = 2131961906(0x7f132832, float:1.9560522E38)
            java.lang.String r1 = X.DbV.A0z(r1, r5, r0)
            java.lang.String r0 = "https://help.instagram.com/402748553849926"
            r7.setFooterTerms(r4, r5, r1, r0)
            android.view.View r1 = r7.A00
            r0 = 8
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r7.A02
            r0.setVisibility(r6)
            com.instagram.common.ui.text.TitleTextView r0 = r7.A03
            r0.setPadding(r6, r6, r6, r6)
            r7.A00()
            X.F2v r1 = r8.A03
            X.EEJ r0 = r8.mBusinessNavBarHelper
            r1.A04 = r0
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r8.A02
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r0.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0091
            com.instagram.business.ui.BusinessNavBar r1 = r8.mBusinessNavBar
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r8.A02
            java.lang.String r0 = r0.A06
            r1.setPrimaryButtonText((java.lang.CharSequence) r0)
        L_0x0091:
            X.EEJ r0 = r8.mBusinessNavBarHelper
            r8.registerLifecycleListener(r0)
            r0 = 604869572(0x240d93c4, float:3.0699664E-17)
            X.AnonymousClass0fD.A09(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1257104011);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0fD.A09(285532217, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        HashMap A1E;
        IgdsStepperHeader igdsStepperHeader;
        int A002;
        int A003;
        super.onViewCreated(view, bundle);
        RecyclerView A0K = DbX.A0K(view);
        this.mRecyclerView = A0K;
        this.mBusinessNavBar.A01(A0K);
        if (this.A05) {
            this.mBusinessNavBar.setVisibility(8);
        }
        G8D g8d = this.A01;
        if (g8d != null) {
            C319586qr r1 = ((BusinessConversionActivity) g8d).A02;
            String str = "_flowType";
            if (r1 != null) {
                if (r1 == C319586qr.SHOPPING_IN_APP_SIGNUP_FLOW || r1 == C319586qr.SERVICE_ONBOARDING_FLOW) {
                    IgdsStepperHeader igdsStepperHeader2 = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
                    this.mStepperHeader = igdsStepperHeader2;
                    igdsStepperHeader2.setVisibility(0);
                    PageSelectionOverrideData pageSelectionOverrideData = this.A02;
                    if (pageSelectionOverrideData != null) {
                        igdsStepperHeader = this.mStepperHeader;
                        A002 = pageSelectionOverrideData.A01;
                        A003 = pageSelectionOverrideData.A00;
                    } else {
                        G8D g8d2 = this.A01;
                        if (g8d2 != null) {
                            igdsStepperHeader = this.mStepperHeader;
                            C49883FBi fBi = ((BusinessConversionActivity) g8d2).A01;
                            if (fBi != null) {
                                A002 = C49883FBi.A00(fBi, fBi.A00.A00 + 1) - 1;
                                C49883FBi fBi2 = ((BusinessConversionActivity) this.A01).A01;
                                if (fBi2 != null) {
                                    A003 = C49883FBi.A00(fBi2, fBi2.A00.A01.size());
                                }
                            }
                            str = "conversionLogic";
                        }
                    }
                    igdsStepperHeader.A02(A002, A003);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        this.mLoadingSpinner = (SpinnerImageView) view.requireViewById(R.id.loading_indicator);
        C49710F2v f2v = this.A03;
        G8D g8d3 = f2v.A02;
        if (g8d3 != null && (businessFlowAnalyticsLogger = f2v.A01) != null) {
            if (f2v.A07) {
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) g8d3;
                A1E = AnonymousClass7TE.A1E();
                AnonymousClass0eM r5 = businessConversionActivity.A09;
                r5.getValue();
                UserSession A0l = AnonymousClass7TE.A0l(businessConversionActivity.A0H);
                CallerContext callerContext = FRU.A0B;
                0qQ.A0B(A0l, 0);
                A1E.put("is_fb_linked_when_enter_flow", String.valueOf(2Lv.A00(A0l).A00(FRU.A0B, "ig_professional_conversion_flow")));
                r5.getValue();
                A1E.put("is_fb_page_admin_when_enter_flow", "UNKNOWN");
            } else {
                A1E = AnonymousClass7TE.A1E();
            }
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("page_selection", f2v.A06, (String) null, (String) null, (String) null, A1E, (Map) null, (Map) null));
        }
    }
}
