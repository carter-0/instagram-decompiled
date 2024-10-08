package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Map;

public final class E50 extends AnonymousClass4DH implements AnonymousClass4DR, C252293os, C51925G7t {
    public static final String __redex_internal_original_name = "SwitchToBusinessAccountFragment";
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public G8D A05;
    public EEJ A06;
    public C46772Dkz A07;
    public AnonymousClass0wW A08;
    public UserSession A09;
    public ReboundViewPager A0A;
    public IgdsBottomButtonLayout A0B;
    public RefreshSpinner A0C;
    public SpinnerImageView A0D;
    public boolean A0E;
    public CirclePageIndicator A0F;
    public User A0G;
    public String A0H;
    public final Handler A0I = AnonymousClass7TF.A0D();

    public final void APF() {
    }

    public final void ARL() {
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final String getModuleName() {
        return "switch_to_business_account";
    }

    public static void A00(E50 e50) {
        C46772Dkz dkz = e50.A07;
        dkz.A05.Ci7(new C22030Xtl("intro", dkz.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        ((BusinessConversionActivity) e50.A05).Clz((Bundle) null);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.E50 r12) {
        /*
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r12.A0A
            r0.getClass()
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = r12.A0F
            r0.getClass()
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r12.A0A
            r0.A0P(r12)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r12.A0A
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = r12.A0F
            r1.A0P(r0)
            com.instagram.user.model.User r0 = r12.A0G
            r7 = 0
            if (r0 == 0) goto L_0x01a6
            com.instagram.common.typedurl.ImageUrl r8 = r0.Bh3()
        L_0x001f:
            X.G8D r0 = r12.A05
            X.FRU r0 = X.Dba.A0C(r0)
            boolean r9 = r0.A06
            X.G8D r0 = r12.A05
            boolean r10 = X.FG1.A04(r0)
            if (r10 != 0) goto L_0x0035
            X.0wW r0 = r12.A08
            if (r0 == 0) goto L_0x0035
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
        L_0x0035:
            java.lang.String r1 = r12.A0H
            java.lang.String r0 = "edit_profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0144
            X.0wW r3 = r12.A08
            if (r3 == 0) goto L_0x0144
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315185438264376(0x81047800000c38, double:3.029207728448398E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0144
            X.0wW r0 = r12.A08
            android.content.Context r11 = r12.requireContext()
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r8 = r12.A0A
            r6 = 0
            X.0qQ.A0B(r0, r6)
            boolean r5 = X.DbW.A1Y(r8)
            r0 = 2131976962(0x7f136302, float:1.959106E38)
            java.lang.String r3 = r11.getString(r0)
            r0 = 2131976961(0x7f136301, float:1.9591057E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 2131238528(0x7f081e80, float:1.8093337E38)
            r0 = 2131237559(0x7f081ab7, float:1.8091372E38)
            X.FAM r10 = new X.FAM
            r10.<init>(r3, r2, r1, r0)
            X.FAM r9 = X.FAM.A00(r11)
            r0 = 2131971305(0x7f134ce9, float:1.9579586E38)
            java.lang.String r4 = r11.getString(r0)
            r0 = 2131971304(0x7f134ce8, float:1.9579584E38)
            java.lang.String r3 = r11.getString(r0)
            r2 = 2131237856(0x7f081be0, float:1.8091974E38)
            r1 = 2131237528(0x7f081a98, float:1.809131E38)
            X.FAM r0 = new X.FAM
            r0.<init>(r4, r3, r2, r1)
            X.FAM[] r0 = new X.FAM[]{r10, r9, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r0 = X.F5D.A00(r7, r0, r6)
            X.Djf r2 = new X.Djf
            r2.<init>(r8, r0, r5, r6)
        L_0x00a9:
            int r0 = r2.getCount()
            r12.A01 = r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r12.A0A
            r0.setAdapter((android.widget.Adapter) r2)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r12.A0A
            int r0 = r12.A00
            r1.A0K(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r1 = r12.A0F
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = r12.A0F
            int r1 = r12.A00
            int r0 = r12.A01
            r2.A01(r1, r0)
            X.0wW r2 = r12.A08
            X.0Tu r3 = X.0Tu.A05
            r0 = 36326240684226196(0x810e8600023694, double:3.0361991105105557E-306)
            boolean r0 = X.DbY.A1Y(r3, r2, r0)
            if (r0 == 0) goto L_0x0134
            X.0wW r2 = r12.A08
            r0 = 36601805787042145(0x82092600131161, double:3.210467591142967E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r3, r2, r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0141
            r0 = 2
            if (r1 == r0) goto L_0x013e
            X.3ff r0 = X.C247033ff.DEFAULT
        L_0x00f0:
            java.lang.Integer r4 = r0.A00
            X.0wW r2 = r12.A08
            r0 = 36601805787107682(0x82092600141162, double:3.210467591184413E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r3, r2, r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x013b
            r0 = 2
            if (r1 == r0) goto L_0x0138
            r0 = 3
            if (r1 == r0) goto L_0x0135
            X.3fh r0 = X.C247053fh.DEFAULT
        L_0x010c:
            java.lang.Integer r3 = r0.A00
            if (r4 == 0) goto L_0x0121
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = r12.A0F
            android.content.Context r1 = r12.requireContext()
            int r0 = r4.intValue()
            int r0 = r1.getColor(r0)
            r2.setActiveColor(r0)
        L_0x0121:
            if (r3 == 0) goto L_0x0134
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = r12.A0F
            android.content.Context r1 = r12.requireContext()
            int r0 = r3.intValue()
            int r0 = r1.getColor(r0)
            r2.setInactiveColor(r0)
        L_0x0134:
            return
        L_0x0135:
            X.3fh r0 = X.C247053fh.VARIANT3
            goto L_0x010c
        L_0x0138:
            X.3fh r0 = X.C247053fh.VARIANT2
            goto L_0x010c
        L_0x013b:
            X.3fh r0 = X.C247053fh.VARIANT1
            goto L_0x010c
        L_0x013e:
            X.3ff r0 = X.C247033ff.VARIANT2
            goto L_0x00f0
        L_0x0141:
            X.3ff r0 = X.C247033ff.VARIANT1
            goto L_0x00f0
        L_0x0144:
            X.0wW r0 = r12.A08
            android.content.Context r6 = r12.requireContext()
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = r12.A0A
            if (r10 == 0) goto L_0x014f
            r8 = r7
        L_0x014f:
            r4 = 0
            X.0qQ.A0B(r0, r4)
            boolean r3 = X.DbW.A1Y(r5)
            if (r9 != 0) goto L_0x01a4
            if (r10 != 0) goto L_0x0199
            r0 = 2131963063(0x7f132cb7, float:1.9562869E38)
            java.lang.String r1 = r6.getString(r0)
            r0 = 2131963062(0x7f132cb6, float:1.9562867E38)
        L_0x0165:
            java.lang.String r0 = r6.getString(r0)
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r2 = new com.instagram.ui.slidecardpageadapter.SlideCardViewModel
            r2.<init>()
            r2.A00 = r4
            r2.A01 = r4
            r2.A06 = r7
            r2.A05 = r8
            r2.A0B = r1
            r2.A0A = r0
            r2.A08 = r7
            r2.A09 = r7
            r2.A07 = r7
            r2.A02 = r7
            r2.A03 = r7
            r2.A04 = r7
        L_0x0186:
            X.16V r0 = X.16V.A08
            r1 = r10 ^ 1
            java.util.List r0 = X.F5D.A01(r6, r0, r1)
            java.util.ArrayList r0 = X.F5D.A00(r2, r0, r1)
            X.Djf r2 = new X.Djf
            r2.<init>(r5, r0, r3, r1)
            goto L_0x00a9
        L_0x0199:
            r0 = 2131976830(0x7f13627e, float:1.9590792E38)
            java.lang.String r1 = r6.getString(r0)
            r0 = 2131976829(0x7f13627d, float:1.959079E38)
            goto L_0x0165
        L_0x01a4:
            r2 = 0
            goto L_0x0186
        L_0x01a6:
            r8 = r7
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E50.A01(X.E50):void");
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void DZI() {
        int i;
        if (this.A0A == null || (i = this.A00) == this.A01 - 1) {
            this.A07.A00("continue", -1);
            A00(this);
            return;
        }
        this.A07.A00("continue", i + 1);
        this.A0A.A0L(this.A00 + 1, 0.1f);
    }

    public final void Di0() {
        this.A05.AGV();
    }

    public final void Dpz(int i, int i2) {
        int i3 = this.A01;
        if (i == i3 - 1 && i2 == i3) {
            this.A0I.post(new C51183Fpt(this));
        } else {
            this.A07.A00("swipe", i2);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r2 != X.C319586qr.CONVERSION_FLOW) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r10 = this;
            X.Dkz r1 = r10.A07
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A05
            java.lang.String r2 = "intro"
            r4 = 0
            java.lang.String r3 = r1.A08
            X.Xtl r1 = new X.Xtl
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.ChP(r1)
            X.G8D r0 = r10.A05
            if (r0 == 0) goto L_0x0023
            X.6qr r2 = r0.B6a()
            X.6qr r1 = X.C319586qr.CONVERSION_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r2 = 1
            if (r0 == 0) goto L_0x003d
            com.instagram.common.session.UserSession r0 = r10.A09
            if (r0 == 0) goto L_0x003d
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            X.16V r1 = r0.A0J()
            X.16V r0 = X.16V.A07
            if (r1 == r0) goto L_0x003d
            X.G8D r0 = r10.A05
            r0.AGV()
            return r2
        L_0x003d:
            X.G8D r0 = r10.A05
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.EJN(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E50.onBackPressed():boolean");
    }

    public final void DVx(int i, int i2) {
        if (isResumed()) {
            this.A00 = i;
            EEJ eej = this.A06;
            eej.getClass();
            boolean z = true;
            if (!this.A0E || this.A00 != this.A01 - 1) {
                z = false;
            }
            eej.A02(z);
        }
    }

    public final void onAttach(Context context) {
        G8D g8d;
        E50.super.onAttach(context);
        G8D requireActivity = requireActivity();
        if (requireActivity instanceof G8D) {
            g8d = requireActivity;
        } else {
            g8d = null;
        }
        g8d.getClass();
        this.A05 = g8d;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.E50, X.07g, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0078, code lost:
        if (r5.A09 == null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -1399349909(0xffffffffac979d6b, float:-4.309155E-12)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.E50.super.onCreate(r6)
            X.0wW r0 = X.DbX.A0T(r5)
            r5.A08 = r0
            java.lang.String r4 = X.DbX.A0o(r5)
            java.lang.String r0 = "entry_point should not be null"
            X.17k.A07(r4, r0)
            r5.A0H = r4
            X.0wW r3 = r5.A08
            X.G8D r1 = r5.A05
            X.EFN r0 = new X.EFN
            r0.<init>(r1, r3, r4)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r5)
            java.lang.Class<X.Dkz> r0 = X.C46772Dkz.class
            X.2YL r0 = r1.A00(r0)
            X.Dkz r0 = (X.C46772Dkz) r0
            r5.A07 = r0
            X.2jd r3 = new X.2jd
            r3.<init>()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.EE7 r0 = new X.EE7
            r0.<init>(r1)
            r3.A0E(r0)
            r5.registerLifecycleListenerSet(r3)
            X.0wW r1 = r5.A08
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0057
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r5.A09 = r1
            com.instagram.user.model.User r0 = X.DbT.A0j(r1)
            r5.A0G = r0
        L_0x0057:
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 1310(0x51e, float:1.836E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r0)
            r5.A00 = r0
            java.lang.String r1 = r5.A0H
            r0 = 1143(0x477, float:1.602E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007a
            com.instagram.common.session.UserSession r1 = r5.A09
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r5.A0E = r0
            r0 = -1753577522(0xffffffff977a87ce, float:-8.0950766E-25)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E50.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.G7t, X.E50, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = -204460011(0xfffffffff3d03015, float:-3.2988677E31)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131629595(0x7f0e161b, float:1.8886515E38)
            r2 = 0
            android.view.View r1 = r8.inflate(r0, r9, r2)
            r7.A02 = r1
            r1.getClass()
            r0 = 2131436820(0x7f0b2514, float:1.8495521E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r6 = X.DbT.A0c(r1, r0)
            r7.A0B = r6
            r3 = 2131956703(0x7f1313df, float:1.954997E38)
            boolean r1 = r7.A0E
            r0 = -1
            if (r1 == 0) goto L_0x0028
            r0 = 2131968526(0x7f13420e, float:1.957395E38)
        L_0x0028:
            X.EEJ r5 = new X.EEJ
            r5.<init>((X.C51925G7t) r7, (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r6, (int) r3, (int) r0)
            r7.A06 = r5
            boolean r0 = r7.A0E
            r3 = 1
            if (r0 == 0) goto L_0x0116
            int r1 = r7.A00
            int r0 = r7.A01
            int r0 = r0 - r3
            if (r1 != r0) goto L_0x0116
        L_0x003b:
            r5.A02(r3)
            X.EEJ r0 = r7.A06
            r7.registerLifecycleListener(r0)
            android.view.View r1 = r7.A02
            r0 = 2131441455(0x7f0b372f, float:1.8504922E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r1, r0)
            r7.A03 = r0
            android.view.View r1 = r7.A02
            r0 = 2131431036(0x7f0b0e7c, float:1.848379E38)
            android.view.View r1 = r1.requireViewById(r0)
            r7.requireContext()
            r0 = 5
            X.FP5.A01(r1, r0, r7)
            android.view.View r1 = r7.A02
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.spinner.RefreshSpinner r0 = (com.instagram.ui.widget.spinner.RefreshSpinner) r0
            r7.A0C = r0
            android.view.View r1 = r7.A02
            r0 = 2131437431(0x7f0b2777, float:1.849676E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r0 = (com.instagram.ui.widget.pageindicator.CirclePageIndicator) r0
            r7.A0F = r0
            android.view.View r1 = r7.A02
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r7.A0D = r0
            android.view.View r1 = r7.A02
            r0 = 2131440137(0x7f0b3209, float:1.8502249E38)
            int r5 = X.Dbb.A03(r1, r0)
            android.view.View r1 = r7.A02
            r0 = 2131442374(0x7f0b3ac6, float:1.8506786E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r7.A0A = r0
            android.view.View r1 = r7.A02
            r0 = 2131437022(0x7f0b25de, float:1.849593E38)
            android.widget.TextView r3 = X.DbU.A0G(r1, r0)
            r7.A04 = r3
            X.Dkz r1 = r7.A07
            X.0lg r0 = r1.A07
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0112
            java.lang.String r1 = r1.A08
            java.lang.String r0 = "activity_feed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "feed_persistent_icon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0112
        L_0x00c0:
            r3.setVisibility(r2)
            android.widget.TextView r1 = r7.A04
            r0 = 2131968519(0x7f134207, float:1.9573935E38)
            r1.setText(r0)
            android.widget.TextView r1 = r7.A04
            r0 = 6
            X.FP5.A01(r1, r0, r7)
        L_0x00d1:
            X.G8D r0 = r7.A05
            X.FRU r0 = X.Dba.A0C(r0)
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x00ef
            android.view.ViewGroup r0 = r7.A03
            r0.getClass()
            r0.setVisibility(r2)
            A01(r7)
        L_0x00e6:
            android.view.View r1 = r7.A02
            r0 = 1755916923(0x68a92a7b, float:6.3909085E24)
            X.AnonymousClass0fD.A09(r0, r4)
            return r1
        L_0x00ef:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r7.A0D
            r0.getClass()
            r0.setVisibility(r2)
            X.EEJ r0 = r7.A06
            r0.getClass()
            r0.A01()
            android.content.Context r3 = r7.requireContext()
            X.0gy r2 = X.AnonymousClass07i.A00(r7)
            X.0wW r1 = r7.A08
            X.FTq r0 = new X.FTq
            r0.<init>(r7)
            X.C49893FBw.A02(r3, r2, r0, r1)
            goto L_0x00e6
        L_0x0112:
            r3.setVisibility(r5)
            goto L_0x00d1
        L_0x0116:
            r3 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E50.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1048415081);
        super.onDestroyView();
        unregisterLifecycleListener(this.A06);
        this.A02 = null;
        this.A0B = null;
        this.A06 = null;
        this.A0F = null;
        this.A0A = null;
        this.A0C = null;
        this.A04 = null;
        this.A03 = null;
        this.A0D = null;
        AnonymousClass0fD.A09(359349168, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2033050891);
        super.onResume();
        if (!(this.A0A == null || FG1.A04(this.A05) || this.A08 == null)) {
            CallerContext callerContext = FRZ.A00;
        }
        AnonymousClass0fD.A09(-228071721, A022);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.E50, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C46772Dkz dkz = this.A07;
        dkz.A05.Cka(new C22030Xtl("intro", dkz.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        AnonymousClass2Fj r1 = this.A07.A04;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.String>");
        C50139FQw.A00(this, r1, 0);
        AnonymousClass2Fj r12 = this.A07.A01;
        0qQ.A0C(r12, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
        C50139FQw.A00(this, r12, 1);
        AnonymousClass2Fj r13 = this.A07.A00;
        0qQ.A0C(r13, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        C50139FQw.A00(this, r13, 2);
        TextView textView = this.A04;
        if (textView != null) {
            AnonymousClass2Fj r14 = this.A07.A02;
            0qQ.A0C(r14, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.user.model.User>");
            C50139FQw.A00(this, r14, 3);
            AnonymousClass2Fj r15 = this.A07.A03;
            0qQ.A0C(r15, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
            r15.A06(this, new WEC(0, textView, this));
        }
    }
}
