package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.List;

public final class K5Y extends AnonymousClass4DH implements AnonymousClass4DR, CallerContextable {
    public static final CallerContext A0E = CallerContext.A00(K5Y.class);
    public static final String __redex_internal_original_name = "FeedAdvancedSettingsFragment";
    public C62136Kan A00;
    public C61828KNr A01;
    public ELU A02;
    public C363548ju A03;
    public PR9 A04;
    public FGF A05;
    public boolean A06;
    public boolean A07;
    public C61822KNl A08;
    public final String A09 = "advanced_post_settings";
    public final List A0A = AnonymousClass7TE.A1C();
    public final List A0B = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final PublishScreenCategoryType A0D = PublishScreenCategoryType.MORE;

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.ListAdapter, X.Kan] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbsListView absListView = (AbsListView) AnonymousClass7TF.A0F(view, R.id.list_view);
        ? r0 = this.A00;
        if (r0 == 0) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        absListView.setAdapter(r0);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A01(K5Y k5y, boolean z) {
        PR9 pr9 = k5y.A04;
        if (pr9 != null) {
            pr9.A0D = z;
            C363548ju r3 = k5y.A03;
            if (r3 == null) {
                r3 = LJr.A00(AnonymousClass7TE.A0l(k5y.A0C));
                k5y.A03 = r3;
            }
            0qQ.A0A(r3);
            AnonymousClass0eM r2 = k5y.A0C;
            r3.A01(AnonymousClass7TE.A0l(r2), "feed_composer", z);
            C62136Kan kan = k5y.A00;
            if (kan == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            kan.notifyDataSetChanged();
            DbX.A0R(r2).A05(new C64661Lfn(z));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A02(Object obj) {
        this.A0B.add(obj);
        this.A0A.add(obj);
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean onBackPressed() {
        C61822KNl kNl = this.A08;
        if (kNl == null) {
            JTO.A1M();
            throw AnonymousClass00P.createAndThrow();
        }
        ((C65172Lob) kNl.A0N.getValue()).CkC();
        return false;
    }

    private final SpannableStringBuilder A00() {
        Context requireContext = requireContext();
        return C59912Jbb.A01(JTR.A0T(requireContext.getResources(), requireContext.getString(2131973565), 2131973536), getActivity(), AnonymousClass7TE.A0l(this.A0C), AnonymousClass7TE.A16(requireContext, 2131973565), this.A09, "https://help.instagram.com/1188715848969926/");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ff, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r4), 36324101790445348L) == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0209, code lost:
        if (X.C363558jv.A00(X.AnonymousClass7TE.A0l(r4)) == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0307, code lost:
        if (r12 != false) goto L_0x01f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = 47713935(0x2d80e8f, float:3.1746704E-37)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = r21
            r0 = r22
            X.K5Y.super.onCreate(r0)
            android.os.Bundle r5 = r3.requireArguments()
            X.0eM r4 = r3.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            X.KNl r0 = new X.KNl
            r0.<init>(r5, r3, r3, r1)
            r3.A08 = r0
            r0.A05()
            X.KNl r0 = r3.A08
            java.lang.String r14 = "dependencyProvider"
            if (r0 == 0) goto L_0x0184
            X.KNr r0 = X.LP2.A00(r0)
            r3.A01 = r0
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "IS_FACEBOOK_SHARING_DISABLED"
            boolean r0 = r1.getBoolean(r0)
            r3.A07 = r0
            X.1Z9 r5 = X.C48920EmK.A00()
            X.0lg r1 = X.DbT.A0X(r4)
            r7 = 0
            X.M1D r0 = new X.M1D
            r0.<init>(r3, r7)
            X.ELU r0 = r5.A01(r3, r1, r0)
            r3.A02 = r0
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5w8 r0 = X.JTT.A0R(r4)
            boolean r0 = r0.A0B()
            r3.A06 = r0
            android.content.Context r6 = r3.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            X.KNl r0 = r3.A08
            if (r0 == 0) goto L_0x0184
            X.Kp2 r1 = r0.A03()
            X.Kan r0 = new X.Kan
            r0.<init>(r6, r3, r5, r1)
            r3.A00 = r0
            java.lang.String r0 = "advanced_post_settings"
            r3.setModuleNameV2(r0)
            X.KNr r5 = r3.A01
            java.lang.String r14 = "feedPublishScreenViewModel"
            if (r5 == 0) goto L_0x0184
            java.lang.Integer r6 = X.AnonymousClass05K.A0G
            X.KNw r0 = new X.KNw
            r0.<init>(r6)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r1 = r3.A0D
            boolean r0 = r5.A0H(r1, r0)
            if (r0 == 0) goto L_0x00a2
            r0 = 2131956665(0x7f1313b9, float:1.9549892E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            X.KNy r0 = new X.KNy
            r0.<init>(r5)
            r3.A02(r0)
            X.KNw r0 = new X.KNw
            r0.<init>(r6)
            r3.A02(r0)
        L_0x00a2:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.2ib r0 = X.AnonymousClass3YZ.A00(r0)
            boolean r0 = r0.A00()
            r5 = 2131957376(0x7f131680, float:1.9551334E38)
            if (r0 == 0) goto L_0x00b6
            r5 = 2131957381(0x7f131685, float:1.9551344E38)
        L_0x00b6:
            X.DfA r0 = new X.DfA
            r0.<init>((int) r5)
            r3.A02(r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.KNw r0 = new X.KNw
            r0.<init>(r5)
            r3.A02(r0)
            r0 = 2131956415(0x7f1312bf, float:1.9549385E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            X.KNy r0 = new X.KNy
            r0.<init>(r5)
            r3.A02(r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0R
            X.KNw r0 = new X.KNw
            r0.<init>(r5)
            r3.A02(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.7wr r0 = X.C347457wq.A00(r0)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0101
            X.0lg r8 = X.DbT.A0X(r4)
            X.0Tu r0 = X.0Tu.A05
            r5 = 36324101790445348(0x810c9400012f24, double:3.0348464654709134E-306)
            boolean r0 = X.182.A06(r0, r8, r5)
            r13 = 1
            if (r0 != 0) goto L_0x0102
        L_0x0101:
            r13 = 0
        L_0x0102:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.LTP.A09(r0)
            if (r0 == 0) goto L_0x018c
            X.KNr r6 = r3.A01
            if (r6 == 0) goto L_0x0184
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            X.KNw r0 = new X.KNw
            r0.<init>(r5)
            boolean r0 = r6.A0H(r1, r0)
            if (r0 == 0) goto L_0x018c
            X.0lg r0 = X.DbT.A0X(r4)
            boolean r0 = X.C46508DgB.A00(r0)
            if (r0 == 0) goto L_0x0129
            if (r13 == 0) goto L_0x0131
        L_0x0129:
            java.util.List r4 = r3.A0B
            r0 = 2131969719(0x7f1346b7, float:1.9576369E38)
            X.JTQ.A0t(r0, r4)
        L_0x0131:
            java.util.List r6 = r3.A0B
            X.KNw r4 = new X.KNw
            r4.<init>(r5)
        L_0x0138:
            r6.add(r4)
        L_0x013b:
            X.KNr r4 = r3.A01
            if (r4 == 0) goto L_0x0184
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.KNw r0 = new X.KNw
            r0.<init>(r5)
            boolean r0 = r4.A0H(r1, r0)
            if (r0 == 0) goto L_0x0163
            r0 = 2131952044(0x7f1301ac, float:1.954052E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.KNy r0 = new X.KNy
            r0.<init>(r4)
            r3.A02(r0)
            X.KNw r0 = new X.KNw
            r0.<init>(r5)
            r3.A02(r0)
        L_0x0163:
            X.KNr r5 = r3.A01
            if (r5 == 0) goto L_0x0184
            java.lang.Integer r4 = X.AnonymousClass05K.A04
            X.KNw r0 = new X.KNw
            r0.<init>(r4)
            boolean r0 = r5.A0H(r1, r0)
            if (r0 == 0) goto L_0x017e
            java.util.List r1 = r3.A0B
            X.KNw r0 = new X.KNw
            r0.<init>(r4)
            r1.add(r0)
        L_0x017e:
            X.Kan r1 = r3.A00
            if (r1 != 0) goto L_0x030b
            java.lang.String r14 = "adapter"
        L_0x0184:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x018c:
            X.0lg r0 = X.DbT.A0X(r4)
            boolean r0 = X.C46508DgB.A00(r0)
            r12 = r0 ^ 1
            if (r12 != 0) goto L_0x019a
            if (r13 == 0) goto L_0x0255
        L_0x019a:
            java.util.List r6 = r3.A0B
            r0 = 2131969719(0x7f1346b7, float:1.9576369E38)
            X.JTQ.A0t(r0, r6)
            if (r13 == 0) goto L_0x0307
            r9 = 2131973531(0x7f13559b, float:1.95841E38)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.7wr r0 = X.C347457wq.A00(r0)
            com.instagram.common.session.UserSession r0 = r0.A02
            X.7xL r0 = X.C347757xK.A00(r0)
            X.0xa r5 = r0.A00
            java.lang.String r0 = "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING"
            boolean r8 = r5.getBoolean(r0, r7)
            r0 = 6
            X.LZJ r5 = new X.LZJ
            r5.<init>((java.lang.Object) r3, (int) r0)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r5, (int) r9, (boolean) r8)
            r6.add(r0)
            com.instagram.common.session.UserSession r19 = X.DbW.A0S(r4, r7)
            X.818 r17 = X.AnonymousClass818.IG_FEED_COMPOSER_ADVANCED_SETTINGS_SHARE_TO_THREADS_TOGGLE_ENABLE
            X.JZY r15 = X.JZY.VIEW
            X.JZZ r16 = X.JZZ.FEED
            r18 = 0
            r20 = 1
            X.LT4.A00(r15, r16, r17, r18, r19, r20)
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0307
            if (r12 == 0) goto L_0x0255
            android.text.SpannableStringBuilder r0 = r3.A00()
            X.FGF r5 = new X.FGF
            r5.<init>((android.text.SpannableStringBuilder) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r5.A01 = r0
            r6.add(r5)
        L_0x01f3:
            r11 = 2131962276(0x7f1329a4, float:1.9561273E38)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.AnonymousClass8PU.A07(r0)
            if (r0 == 0) goto L_0x020b
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.C363558jv.A00(r0)
            r10 = 1
            if (r0 != 0) goto L_0x020c
        L_0x020b:
            r10 = 0
        L_0x020c:
            r0 = 7
            X.LZJ r9 = new X.LZJ
            r9.<init>((java.lang.Object) r3, (int) r0)
            r5 = 4
            X.LsA r0 = new X.LsA
            r0.<init>(r3, r5)
            X.PR9 r8 = new X.PR9
            r8.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r9, (X.C358618bC) r0, (int) r11, (boolean) r10)
            r3.A04 = r8
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x022d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.AnonymousClass8PU.A06(r0)
            if (r0 == 0) goto L_0x0231
        L_0x022d:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0247
        L_0x0231:
            r8.A0D = r7
            r0 = 1
            r8.A0F = r0
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0247
            X.Lpv r5 = new X.Lpv
            r5.<init>(r3)
            r0 = 30
            X.LYG r0 = X.LYG.A01(r3, r5, r0)
            r8.A06 = r0
        L_0x0247:
            r6.add(r8)
            X.27r r6 = X.C51971G9r.A0g(r4)
            X.80P r5 = X.AnonymousClass80P.SHARE_TO_FACEBOOK_ON
            X.4yP r0 = X.C279294yP.FEED
            r6.A15(r0, r5)
        L_0x0255:
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x02ae
            if (r12 == 0) goto L_0x02ae
        L_0x025b:
            X.Lpv r7 = new X.Lpv
            r7.<init>(r3)
            X.5w8 r6 = X.JTT.A0R(r4)
            android.content.Context r5 = r3.requireContext()
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            java.lang.String r0 = "advanced_setting_description"
            android.text.SpannableStringBuilder r0 = r6.A03(r5, r4, r7, r0)
        L_0x0272:
            X.FGF r5 = new X.FGF
            r5.<init>((android.text.SpannableStringBuilder) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r5.A01 = r0
            r3.A05 = r5
            android.content.Context r4 = r3.requireContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r4.getSystemService(r0)
            r0 = 327(0x147, float:4.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x02a7
            r0 = 1
            boolean r0 = X.2eO.A02(r4, r0)
            if (r0 == 0) goto L_0x02a7
            r4 = 40
            X.LYB r0 = new X.LYB
            r0.<init>((java.lang.Object) r3, (int) r4)
            r5.A04 = r0
        L_0x02a7:
            java.util.List r0 = r3.A0B
            r0.add(r5)
            goto L_0x013b
        L_0x02ae:
            if (r13 == 0) goto L_0x02f1
            java.util.List r6 = r3.A0B
            if (r12 == 0) goto L_0x02ec
            android.content.Context r9 = r3.requireContext()
            android.content.res.Resources r8 = r9.getResources()
            r7 = 2131973530(0x7f13559a, float:1.9584098E38)
            r5 = 2131973565(0x7f1355bd, float:1.958417E38)
            java.lang.String r0 = r9.getString(r5)
            android.text.Spanned r15 = X.JTR.A0T(r8, r0, r7)
            androidx.fragment.app.FragmentActivity r16 = r3.getActivity()
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r9, r5)
            java.lang.String r0 = r3.A09
            java.lang.String r20 = "https://help.instagram.com/169948159813228/"
            r19 = r0
            android.text.SpannableStringBuilder r0 = X.C59912Jbb.A01(r15, r16, r17, r18, r19, r20)
        L_0x02e0:
            X.FGF r4 = new X.FGF
            r4.<init>((android.text.SpannableStringBuilder) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r4.A01 = r0
            goto L_0x0138
        L_0x02ec:
            android.text.SpannableStringBuilder r0 = r3.A00()
            goto L_0x02e0
        L_0x02f1:
            if (r12 == 0) goto L_0x013b
            if (r0 == 0) goto L_0x025b
            X.5w8 r5 = X.JTT.A0R(r4)
            android.content.Context r4 = r3.requireContext()
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            android.text.SpannableStringBuilder r0 = r5.A02(r4, r0)
            goto L_0x0272
        L_0x0307:
            if (r12 == 0) goto L_0x0255
            goto L_0x01f3
        L_0x030b:
            java.util.List r0 = r3.A0B
            r1.setItems(r0)
            r0 = -1137920245(0xffffffffbc2cb70b, float:-0.010541688)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5Y.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1307125431);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_advanced_settings, viewGroup, false);
        AnonymousClass0fD.A09(-2099080794, A022);
        return inflate;
    }
}
