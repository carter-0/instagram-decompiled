package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.File;
import java.util.HashMap;

public final class ESS extends C47518E6c implements AnonymousClass36P, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BusinessOptionsFragment";
    public C231002qi A00;
    public C230882qT A01;
    public FRY A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final 1wn A05;

    public final void CJ6(Intent intent) {
        0qQ.A0B(intent, 0);
        Activity rootActivity = getRootActivity();
        0qQ.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgMainActivityLegacy");
        ((AnonymousClass2ZQ) rootActivity).BPn().CJ6(intent);
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final void Ewk(File file, int i) {
        0qQ.A0B(file, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FFa.A02(activity, file, i);
        }
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        0kR.A05(this, intent, i);
    }

    public final void configureActionBar(2da r20) {
        2da r2 = r20;
        0qQ.A0B(r2, 0);
        int i = 2131954395;
        if (2Ek.A01(DbX.A0l(AnonymousClass0t1.A01, this.A03))) {
            i = 2131957124;
        }
        r2.Eom(i);
        r2.Eu4(true);
        r2.ErJ(new AnonymousClass57Z((Resources.Theme) null, Dbb.A0A(requireContext(), this), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    public final String getModuleName() {
        return "settings_business_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C231002qi r0 = this.A00;
        if (r0 != null) {
            r0.Dh3();
        }
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 49), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public ESS() {
        C13998To0 to0 = new C13998To0(this, 43);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13998To0(new C13998To0(this, 40), 41));
        this.A04 = DbS.A0I(new C13998To0(A002, 42), to0, new C58691Iw0(45, (Object) null, A002), DbS.A0z(C60170Jgp.class));
        this.A05 = FXZ.A00(this, 62);
    }

    /* JADX WARNING: type inference failed for: r18v1, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r0v183, types: [X.Fmc, java.lang.Object, X.ESV] */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x06a6, code lost:
        if (r6.A2K() == false) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        if (X.AnonymousClass2BF.A00().A03().A03(r3.A02, X.AnonymousClass05K.A01, true) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0232, code lost:
        if (X.182.A06(r7, r2, 36316194755579993L) == false) goto L_0x0234;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.ESS r27) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r12 = r27
            X.FRY r3 = r12.A02
            if (r3 == 0) goto L_0x05a8
            X.0eM r0 = r12.A04
            java.lang.Object r0 = r0.getValue()
            X.Jgp r0 = (X.C60170Jgp) r0
            X.05G r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            java.util.List r5 = (java.util.List) r5
            com.instagram.monetization.repository.MonetizationRepository r8 = r3.A03
            com.instagram.api.schemas.UserMonetizationProductType r7 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            boolean r21 = r8.A07(r7)
            r24 = 0
            r17 = 1
            if (r21 == 0) goto L_0x003e
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            X.4kW r6 = r0.A03()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            com.instagram.common.session.UserSession r1 = r3.A02
            r0 = r17
            boolean r0 = r6.A03(r1, r2, r0)
            r22 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r22 = 0
        L_0x0040:
            boolean r23 = r8.A06(r7)
            if (r23 == 0) goto L_0x005c
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            X.4kW r6 = r0.A03()
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            com.instagram.common.session.UserSession r1 = r3.A02
            r0 = r17
            boolean r0 = r6.A03(r1, r2, r0)
            if (r0 == 0) goto L_0x005c
            r24 = 1
        L_0x005c:
            if (r22 != 0) goto L_0x0060
            if (r24 == 0) goto L_0x006c
        L_0x0060:
            android.content.Context r2 = X.DbS.A08(r3)
            r1 = 2131956604(0x7f13137c, float:1.9549768E38)
            r0 = 67
            X.C47518E6c.A01(r2, r3, r4, r0, r1)
        L_0x006c:
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            com.instagram.common.session.UserSession r2 = r3.A02
            X.2BJ r1 = r0.A00(r2)
            r14 = 0
            X.MJH r0 = new X.MJH
            r18 = r0
            r19 = r1
            r20 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.2BJ.A00(r1, r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x00a9
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320730241114915(0x81098300012323, double:3.032714284098208E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            r6 = 2131963657(0x7f132f09, float:1.9564074E38)
            if (r0 == 0) goto L_0x00a0
            r6 = 2131963645(0x7f132efd, float:1.956405E38)
        L_0x00a0:
            android.content.Context r1 = X.DbS.A08(r3)
            r0 = 69
            X.C47518E6c.A01(r1, r3, r4, r0, r6)
        L_0x00a9:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.REELS_OVERLAY_ADS
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x00bd
            android.content.Context r6 = X.DbS.A08(r3)
            r1 = 2131963599(0x7f132ecf, float:1.9563956E38)
            r0 = 68
            X.C47518E6c.A01(r6, r3, r4, r0, r1)
        L_0x00bd:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x00d1
            android.content.Context r6 = X.DbS.A08(r3)
            r1 = 2131976320(0x7f136080, float:1.9589757E38)
            r0 = 8
            X.C47518E6c.A02(r6, r3, r4, r0, r1)
        L_0x00d1:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x00e5
            android.content.Context r6 = X.DbS.A08(r3)
            r1 = 2131976252(0x7f13603c, float:1.958962E38)
            r0 = 9
            X.C47518E6c.A02(r6, r3, r4, r0, r1)
        L_0x00e5:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x00f8
            android.content.Context r6 = X.DbS.A08(r3)
            r1 = 2131964326(0x7f1331a6, float:1.956543E38)
            r0 = 2
            X.C47518E6c.A02(r6, r3, r4, r0, r1)
        L_0x00f8:
            com.instagram.user.model.User r6 = r3.A07
            boolean r0 = r6.A1M()
            if (r0 == 0) goto L_0x011b
            boolean r10 = X.C324536zU.A00(r2)
            android.content.Context r9 = X.DbS.A08(r3)
            r7 = 2131953829(0x7f1308a5, float:1.954414E38)
            r1 = 10
            X.FOq r0 = new X.FOq
            r0.<init>((X.FRY) r3, (int) r1, (boolean) r10)
            X.Fmc r0 = X.C50989Fmc.A00(r9, r0, r7)
            r0.A09 = r10
            r4.add(r0)
        L_0x011b:
            if (r5 == 0) goto L_0x0134
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0134
            android.content.Context r9 = X.DbS.A08(r3)
            r7 = 2131969110(0x7f134456, float:1.9575134E38)
            r1 = 55
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3)
            X.C50989Fmc.A02(r9, r0, r4, r7)
        L_0x0134:
            X.0eE r5 = X.AnonymousClass0t1.A01
            X.4Cl r0 = X.DbS.A0h(r2, r5)
            java.lang.Boolean r0 = r0.Cc1()
            if (r0 == 0) goto L_0x015f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x015f
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.Cc0()
            if (r0 == 0) goto L_0x06da
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x06da
            android.content.Context r7 = X.DbS.A08(r3)
            r1 = 2131973750(0x7f135676, float:1.9584545E38)
            r0 = 5
        L_0x015c:
            X.C47518E6c.A02(r7, r3, r4, r0, r1)
        L_0x015f:
            boolean r0 = X.C324536zU.A00(r2)
            if (r0 != 0) goto L_0x017a
            boolean r0 = X.C324536zU.A01(r2)
            if (r0 == 0) goto L_0x017a
            android.content.Context r9 = X.DbS.A08(r3)
            java.lang.String r7 = "Shared access"
            r1 = 4
            X.FP9 r0 = new X.FP9
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.C50989Fmc.A01(r9, r0, r7, r4)
        L_0x017a:
            X.2jx r0 = r3.A01
            r27 = r0
            android.content.Context r9 = r27.requireContext()
            com.instagram.base.activity.BaseFragmentActivity r0 = r3.A00
            r18 = r0
            if (r0 == 0) goto L_0x0778
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131954125(0x7f1309cd, float:1.954474E38)
            java.lang.String r7 = r1.getString(r0)
            r20 = 61
            X.FP2 r1 = new X.FP2
            r0 = r20
            r1.<init>((java.lang.Object) r3, (int) r0)
            X.C50989Fmc.A01(r9, r1, r7, r4)
            com.instagram.user.model.User r0 = r5.A01(r2)
            X.16V r1 = r0.A0J()
            X.16V r19 = X.16V.A06
            r0 = r19
            if (r1 == r0) goto L_0x01b9
            com.instagram.user.model.User r0 = r5.A01(r2)
            X.16V r1 = r0.A0J()
            X.16V r0 = X.16V.A05
            if (r1 != r0) goto L_0x01c5
        L_0x01b9:
            android.content.Context r7 = r27.requireContext()
            r1 = 2131969188(0x7f1344a4, float:1.9575292E38)
            r0 = 64
            X.C47518E6c.A01(r7, r3, r4, r0, r1)
        L_0x01c5:
            boolean r0 = X.DcS.A00(r2, r14)
            if (r0 == 0) goto L_0x01fb
            X.FYl r0 = X.C69864NtS.A00(r2)
            java.lang.Boolean r1 = r0.A01
            if (r1 == 0) goto L_0x01fb
            r9 = 2131952093(0x7f1301dd, float:1.954062E38)
            r7 = 65
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r3, (int) r7)
            X.OTn r7 = new X.OTn
            r7.<init>((android.view.View.OnClickListener) r0, (int) r9)
            android.content.Context r9 = r27.requireContext()
            boolean r1 = r1.booleanValue()
            r0 = 2131952094(0x7f1301de, float:1.9540621E38)
            if (r1 == 0) goto L_0x01f2
            r0 = 2131952095(0x7f1301df, float:1.9540623E38)
        L_0x01f2:
            java.lang.String r0 = r9.getString(r0)
            r7.A03 = r0
            r4.add(r7)
        L_0x01fb:
            android.content.Context r1 = r27.requireContext()
            r0 = 2131965068(0x7f13348c, float:1.9566935E38)
            r9 = 62
            X.C47518E6c.A01(r1, r3, r4, r9, r0)
            X.McN r0 = X.C66778McO.A00(r2)
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0216
            X.McN r0 = X.C66778McO.A00(r2)
            r0.A05()
        L_0x0216:
            boolean r0 = X.AnonymousClass7OG.A00(r2)
            if (r0 != 0) goto L_0x06cc
            X.0Tu r7 = X.0Tu.A06
            r0 = 36315215503101029(0x81047f00010c65, double:3.029226741572159E-306)
            boolean r0 = X.DbY.A1Z(r7, r2, r0)
            if (r0 != 0) goto L_0x06cc
            r0 = 36316194755579993(0x81056300001059, double:3.029846024782989E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 != 0) goto L_0x06cc
        L_0x0234:
            boolean r0 = X.DcI.A00(r2)
            if (r0 == 0) goto L_0x025b
            r13 = 2131972632(0x7f135218, float:1.9582277E38)
            android.content.Context r11 = r27.requireContext()
            r0 = 10
            X.FP9 r10 = new X.FP9
            r10.<init>((java.lang.Object) r3, (int) r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r7 = com.instagram.quickpromotion.intf.QPTooltipAnchor.SAVED_REPLIES_ITEM
            X.Eux r1 = new X.Eux
            r1.<init>(r3)
            X.ESV r0 = new X.ESV
            r0.<init>((android.content.Context) r11, (android.view.View.OnClickListener) r10, (int) r13)
            r0.A00 = r7
            r0.A01 = r1
            r4.add(r0)
        L_0x025b:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x028f
            r7 = 2131962677(0x7f132b35, float:1.9562086E38)
            r1 = 57
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r3)
            X.OTn r1 = new X.OTn
            r1.<init>((android.view.View.OnClickListener) r0, (int) r7)
            X.OyN r0 = X.OyN.A00(r2)
            int r0 = r0.A02()
            if (r0 == 0) goto L_0x028c
            android.content.Context r7 = r27.requireContext()
            X.OyN r0 = X.OyN.A00(r2)
            int r0 = r0.A02()
            java.lang.String r0 = r7.getString(r0)
            r1.A03 = r0
        L_0x028c:
            r4.add(r1)
        L_0x028f:
            boolean r0 = X.FRY.A00(r3)
            if (r0 == 0) goto L_0x02c7
            X.FYk r10 = X.C48834Ekw.A00(r12, r2)
            r1 = 2131976828(0x7f13627c, float:1.9590788E38)
            X.FPH r0 = new X.FPH
            r0.<init>((int) r9, (java.lang.Object) r12, (java.lang.Object) r3, (java.lang.Object) r10)
            X.OTn r9 = new X.OTn
            r9.<init>((android.view.View.OnClickListener) r0, (int) r1)
            java.lang.Boolean r0 = r10.A03
            if (r0 == 0) goto L_0x02c4
            android.content.Context r7 = r27.requireContext()
            java.lang.Boolean r1 = r10.A03
            r0 = r17
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r0)
            r0 = 2131960753(0x7f1323b1, float:1.9558184E38)
            if (r1 == 0) goto L_0x02be
            r0 = 2131960754(0x7f1323b2, float:1.9558186E38)
        L_0x02be:
            java.lang.String r0 = r7.getString(r0)
            r9.A03 = r0
        L_0x02c4:
            r4.add(r9)
        L_0x02c7:
            X.16V r0 = r6.A0J()
            X.16V r13 = X.16V.A05
            if (r0 != r13) goto L_0x067f
            com.facebook.common.callercontext.CallerContext r22 = X.FRY.A08
            java.lang.String r23 = "ig_android_ig_business_asset_ig_business_settings"
            java.lang.String r24 = "ig_settings_business"
            java.lang.String r25 = "settings_business"
            java.lang.String r26 = "loading"
            X.9JK r0 = new X.9JK
            r21 = r0
            r21.<init>((com.facebook.common.callercontext.CallerContext) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26)
            int r10 = r4.size()
            X.9F7 r9 = X.DbV.A0O(r2)
            X.9F1 r7 = X.AnonymousClass9F1.A00
            X.FTm r1 = new X.FTm
            r1.<init>(r12, r3, r4, r10)
            r9.AUs(r0, r7, r1)
        L_0x02f2:
            boolean r0 = r6.A21()
            if (r0 == 0) goto L_0x031f
            X.0Tu r7 = X.0Tu.A05
            r0 = 36311418751943183(0x81010b0000020f, double:3.0268256608516474E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x031f
            android.content.Context r9 = r27.requireContext()
            X.0Tu r7 = X.0Tu.A06
            r0 = 36313862588336397(0x8103440000090d, double:3.028371152827255E-306)
            boolean r1 = X.182.A06(r7, r2, r0)
            r0 = 2131954381(0x7f130acd, float:1.954526E38)
            if (r1 == 0) goto L_0x031c
            r0 = 2131954385(0x7f130ad1, float:1.9545268E38)
        L_0x031c:
            X.C47518E6c.A02(r9, r3, r4, r14, r0)
        L_0x031f:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319437455891866(0x81085600001d9a, double:3.031896721517524E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x0337
            android.content.Context r9 = r27.requireContext()
            r1 = 2131965825(0x7f133781, float:1.956847E38)
            r0 = 3
            X.C47518E6c.A02(r9, r3, r4, r0, r1)
        L_0x0337:
            com.instagram.user.model.User r0 = r5.A01(r2)
            X.16V r0 = r0.A0J()
            if (r0 == r13) goto L_0x034d
            com.instagram.user.model.User r0 = r5.A01(r2)
            X.16V r1 = r0.A0J()
            r0 = r19
            if (r1 != r0) goto L_0x0368
        L_0x034d:
            boolean r10 = X.C324536zU.A00(r2)
            android.content.Context r11 = r27.requireContext()
            r9 = 2131954394(0x7f130ada, float:1.9545286E38)
            r1 = 11
            X.FOq r0 = new X.FOq
            r0.<init>((X.FRY) r3, (int) r1, (boolean) r10)
            X.Fmc r0 = X.C50989Fmc.A00(r11, r0, r9)
            r0.A09 = r10
            r4.add(r0)
        L_0x0368:
            android.content.Context r9 = r27.requireContext()
            r1 = 2131966708(0x7f133af4, float:1.9570262E38)
            r0 = 63
            X.C47518E6c.A01(r9, r3, r4, r0, r1)
            X.4Cl r0 = X.DbS.A0h(r2, r5)
            java.lang.Boolean r0 = r0.CYo()
            if (r0 == 0) goto L_0x0390
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0390
            android.content.Context r9 = r27.requireContext()
            r1 = 2131955064(0x7f130d78, float:1.9546645E38)
            r0 = 66
            X.C47518E6c.A01(r9, r3, r4, r0, r1)
        L_0x0390:
            r0 = 36312900515726882(0x81026400010622, double:3.0277627342350425E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x03c8
            r0 = 35
            X.G2c r1 = new X.G2c
            r1.<init>(r2, r0)
            java.lang.Class<X.F20> r0 = X.F20.class
            java.lang.Object r11 = r2.A01(r0, r1)
            X.F20 r11 = (X.F20) r11
            r0 = 2956(0xb8c, float:4.142E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = "impression"
            java.lang.String r0 = "entrypoint"
            r11.A00(r9, r1, r0)
            android.content.Context r10 = r27.requireContext()
            r9 = 2131964367(0x7f1331cf, float:1.9565514E38)
            r1 = 56
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r3)
            X.C50989Fmc.A02(r10, r0, r4, r9)
        L_0x03c8:
            X.16V r1 = X.AnonymousClass0eD.A01(r2)
            r0 = r19
            if (r1 == r0) goto L_0x03d6
            X.16V r0 = X.AnonymousClass0eD.A01(r2)
            if (r0 != r13) goto L_0x03e2
        L_0x03d6:
            android.content.Context r9 = r27.requireContext()
            r1 = 2131957171(0x7f1315b3, float:1.9550918E38)
            r0 = 70
            X.C47518E6c.A01(r9, r3, r4, r0, r1)
        L_0x03e2:
            X.4Cl r0 = r6.A03
            java.util.List r1 = r0.B0k()
            if (r1 == 0) goto L_0x0429
            java.lang.String r0 = "SHOPPING_SETTINGS_ROW"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0429
            X.4Cl r0 = r6.A03
            X.4g2 r9 = r0.ApU()
            if (r9 == 0) goto L_0x066e
            java.lang.Boolean r1 = r9.CQ8()
            r0 = r17
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x066e
            java.lang.String r9 = r9.Bt5()
            if (r9 != 0) goto L_0x040e
            java.lang.String r9 = ""
        L_0x040e:
            r1 = 58
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r3)
            X.FAc r10 = new X.FAc
            r10.<init>((java.lang.CharSequence) r9, (android.view.View.OnClickListener) r0)
        L_0x041a:
            int r1 = X.2Yu.A07(r18)
            r0 = r18
            int r0 = r0.getColor(r1)
            r10.A03 = r0
            r4.add(r10)
        L_0x0429:
            X.FEp r11 = r3.A04
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r9 = r11.A07
            com.instagram.user.model.User r16 = r5.A01(r9)
            X.16V r0 = r16.A0J()
            if (r0 == 0) goto L_0x04a0
            r16.A2L()
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            boolean r5 = X.C324536zU.A00(r9)
            X.16V r0 = r16.A0J()
            int r1 = r0.ordinal()
            r0 = r17
            if (r1 == r0) goto L_0x0605
            r0 = 2
            if (r1 == r0) goto L_0x05e6
            r0 = 3
            if (r1 != r0) goto L_0x04a0
            r14 = 2131963008(0x7f132c80, float:1.9562757E38)
            r0 = 5
            X.FNl r1 = new X.FNl
            r1.<init>(r0, r11, r13, r5)
            X.FAc r0 = new X.FAc
            r0.<init>((android.view.View.OnClickListener) r1, (int) r14)
            r10.add(r0)
            r14 = 2131974881(0x7f135ae1, float:1.9586839E38)
            r0 = 9
            X.FOq r1 = new X.FOq
            r1.<init>((int) r0, (java.lang.Object) r11, (boolean) r5)
        L_0x0471:
            X.FAc r0 = new X.FAc
            r0.<init>((android.view.View.OnClickListener) r1, (int) r14)
            r10.add(r0)
        L_0x0479:
            boolean r0 = r16.A2L()
            if (r0 == 0) goto L_0x05c2
            r14 = 2131974845(0x7f135abd, float:1.9586766E38)
            r1 = 6
            X.FNl r0 = new X.FNl
            r0.<init>(r1, r11, r10, r5)
            X.FAc r10 = new X.FAc
            r10.<init>((android.view.View.OnClickListener) r0, (int) r14)
            androidx.fragment.app.FragmentActivity r1 = r11.A01
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            if (r5 == 0) goto L_0x0497
            r0 = 2130970278(0x7f0406a6, float:1.7549262E38)
        L_0x0497:
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r10.A03 = r0
            r4.add(r10)
        L_0x04a0:
            boolean r10 = X.C324536zU.A00(r9)
            r9 = 2131952318(0x7f1302be, float:1.9541075E38)
            X.6qr r5 = X.C319586qr.PROFESSIONAL_SIGNUP_FLOW
            r1 = 7
            X.FNl r0 = new X.FNl
            r0.<init>(r1, r11, r5, r10)
            X.FAc r5 = new X.FAc
            r5.<init>((android.view.View.OnClickListener) r0, (int) r9)
            X.4DH r9 = r11.A02
            r0 = 2131952102(0x7f1301e6, float:1.9540637E38)
            java.lang.String r1 = r9.getString(r0)
            r0 = 2131952104(0x7f1301e8, float:1.9540641E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.A08 = r0
            androidx.fragment.app.FragmentActivity r1 = r11.A01
            int r0 = X.2Yu.A07(r1)
            int r0 = r1.getColor(r0)
            r5.A03 = r0
            r4.add(r5)
            X.FyF r10 = X.C51653FyF.A00
            java.lang.Class<X.Epx> r9 = X.C49134Epx.class
            r2.A01(r9, r10)
            r1 = 50
            X.FPG r5 = new X.FPG
            r0 = r18
            r5.<init>((int) r1, (java.lang.Object) r0, (java.lang.Object) r2)
            r1 = 2131972243(0x7f135093, float:1.9581488E38)
            X.C50989Fmc.A02(r0, r5, r4, r1)
            r2.A01(r9, r10)
            r0 = 36320532673077827(0x81095500082243, double:3.032589341276011E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x051d
            boolean r9 = X.C324536zU.A00(r2)
            r1 = 4
            X.FNl r5 = new X.FNl
            r0 = r27
            r5.<init>(r1, r0, r2, r9)
            android.content.Context r1 = r27.requireContext()
            r0 = 2131966454(0x7f1339f6, float:1.9569747E38)
            X.Fmc r0 = X.C50989Fmc.A00(r1, r5, r0)
            r0.A09 = r9
            r4.add(r0)
        L_0x051d:
            r5 = 2131952989(0x7f13055d, float:1.9542436E38)
            r0 = 60
            X.FP2 r1 = new X.FP2
            r1.<init>((java.lang.Object) r3, (int) r0)
            X.OTn r0 = new X.OTn
            r0.<init>((android.view.View.OnClickListener) r1, (int) r5)
            r4.add(r0)
            boolean r0 = r6.A20()
            if (r0 != 0) goto L_0x053b
            boolean r0 = r6.A1x()
            if (r0 == 0) goto L_0x0573
        L_0x053b:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.DETECTED_OUTCOMES
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x0573
            r0 = 33
            X.To0 r1 = new X.To0
            r1.<init>(r2, r0)
            java.lang.Class<X.F2J> r0 = X.F2J.class
            java.lang.Object r8 = r2.A01(r0, r1)
            X.F2J r8 = (X.F2J) r8
            X.4Cl r0 = r6.A03
            java.lang.String r5 = r0.BDj()
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "impression"
            r8.A00(r0, r5, r1)
            r5 = 2131953414(0x7f130706, float:1.9543298E38)
            X.FPH r1 = new X.FPH
            r0 = r20
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r3, (java.lang.Object) r8)
            X.OTn r0 = new X.OTn
            r0.<init>((android.view.View.OnClickListener) r1, (int) r5)
            r4.add(r0)
        L_0x0573:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            X.16V r1 = r0.A0J()
            r0 = r19
            if (r1 != r0) goto L_0x05ac
            r0 = 36318784620861900(0x8107be000019cc, double:3.0314838660158175E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x05ac
        L_0x058a:
            r5 = 2131961474(0x7f132682, float:1.9559646E38)
            X.FP9 r1 = new X.FP9
            r0 = r17
            r1.<init>((java.lang.Object) r3, (int) r0)
            X.FAc r2 = new X.FAc
            r2.<init>((android.view.View.OnClickListener) r1, (int) r5)
            int r1 = X.2Yu.A0D(r18)
            r0 = r18
            int r0 = r0.getColor(r1)
            r2.A03 = r0
            r4.add(r2)
        L_0x05a8:
            r12.setItems(r4)
            return
        L_0x05ac:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            X.16V r0 = r0.A0J()
            if (r0 != r13) goto L_0x05a8
            r0 = 36318784620861900(0x8107be000019cc, double:3.0314838660158175E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x05a8
            goto L_0x058a
        L_0x05c2:
            java.util.Iterator r14 = r10.iterator()
        L_0x05c6:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x04a0
            java.lang.Object r10 = r14.next()
            X.FAc r10 = (X.C49862FAc) r10
            androidx.fragment.app.FragmentActivity r1 = r11.A01
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            if (r5 == 0) goto L_0x05dc
            r0 = 2130970278(0x7f0406a6, float:1.7549262E38)
        L_0x05dc:
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r10.A03 = r0
            r4.add(r10)
            goto L_0x05c6
        L_0x05e6:
            r14 = 2131974881(0x7f135ae1, float:1.9586839E38)
            r0 = 9
            X.FOq r1 = new X.FOq
            r1.<init>((int) r0, (java.lang.Object) r11, (boolean) r5)
            X.FAc r0 = new X.FAc
            r0.<init>((android.view.View.OnClickListener) r1, (int) r14)
            r10.add(r0)
            r14 = 2131974873(0x7f135ad9, float:1.9586822E38)
            r15 = 5
            X.FNl r1 = new X.FNl
            r0 = r19
            r1.<init>(r15, r11, r0, r5)
            goto L_0x0471
        L_0x0605:
            X.0qQ.A0B(r9, r14)
            r0 = 36311758054359813(0x81015a00000305, double:3.0270402370661854E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x063f
            r0 = 36311762349327110(0x81015b00000306, double:3.0270429532207985E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x063f
            r0 = 36311758054359813(0x81015a00000305, double:3.0270402370661854E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0479
            r0 = 36311762349327110(0x81015b00000306, double:3.0270429532207985E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0479
            r0 = 36315503265844481(0x8104c200000d01, double:3.0294087238898457E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0479
        L_0x063f:
            X.6qr r1 = X.C319586qr.INTEREST_ACCOUNT_CONVERSION
            r0 = 7
            X.FNl r14 = new X.FNl
            r14.<init>(r0, r11, r1, r5)
            r0 = 2131974883(0x7f135ae3, float:1.9586843E38)
            X.ESW r1 = new X.ESW
            r1.<init>((android.view.View.OnClickListener) r14, (int) r0)
            r10.add(r1)
            X.4DH r15 = r11.A02
            r0 = 2131952102(0x7f1301e6, float:1.9540637E38)
            java.lang.String r14 = r15.getString(r0)
            r0 = 2131952104(0x7f1301e8, float:1.9540641E38)
            java.lang.String r0 = r15.getString(r0)
            java.lang.String[] r0 = new java.lang.String[]{r14, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.A08 = r0
            goto L_0x0479
        L_0x066e:
            r9 = 2131964222(0x7f13313e, float:1.956522E38)
            r1 = 59
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r3)
            X.FAc r10 = new X.FAc
            r10.<init>((android.view.View.OnClickListener) r0, (int) r9)
            goto L_0x041a
        L_0x067f:
            com.facebook.common.callercontext.CallerContext r0 = X.C50143FRa.A00
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.BaE()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x06c5
            boolean r0 = r6.A2K()
            if (r0 == 0) goto L_0x06c5
        L_0x0693:
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.BaE()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x06a8
            boolean r0 = r6.A2K()
            r9 = 2131956537(0x7f131339, float:1.9549633E38)
            if (r0 != 0) goto L_0x06ab
        L_0x06a8:
            r9 = 2131955123(0x7f130db3, float:1.9546765E38)
        L_0x06ab:
            android.content.Context r7 = r27.requireContext()
            r1 = 54
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r12, (java.lang.Object) r3)
            X.Fmc r1 = X.C50989Fmc.A00(r7, r0, r9)
            boolean r0 = X.C324536zU.A00(r2)
            r1.A09 = r0
            r4.add(r1)
            goto L_0x02f2
        L_0x06c5:
            boolean r0 = r6.A1N()
            if (r0 == 0) goto L_0x02f2
            goto L_0x0693
        L_0x06cc:
            r7 = 2131972295(0x7f1350c7, float:1.9581594E38)
            android.content.Context r1 = r27.requireContext()
            r0 = 11
            X.C47518E6c.A02(r1, r3, r4, r0, r7)
            goto L_0x0234
        L_0x06da:
            boolean r0 = r6.A1b()
            if (r0 == 0) goto L_0x06ea
            android.content.Context r7 = X.DbS.A08(r3)
            r1 = 2131973750(0x7f135676, float:1.9584545E38)
            r0 = 6
            goto L_0x015c
        L_0x06ea:
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.AkF()
            if (r0 == 0) goto L_0x06f8
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0706
        L_0x06f8:
            java.util.List r1 = X.C47518E6c.A00(r2, r5)
            if (r1 == 0) goto L_0x0710
            java.lang.String r0 = "POLICY_MIGRATION_SHOPPING_SETTINGS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0710
        L_0x0706:
            android.content.Context r7 = X.DbS.A08(r3)
            r1 = 2131973750(0x7f135676, float:1.9584545E38)
            r0 = 7
            goto L_0x015c
        L_0x0710:
            java.util.List r1 = X.C47518E6c.A00(r2, r5)
            if (r1 == 0) goto L_0x071f
            java.lang.String r0 = "SHOP_INVENTORY_SHOPPING_SETTINGS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x071f
            goto L_0x0706
        L_0x071f:
            java.util.List r1 = X.C47518E6c.A00(r2, r5)
            if (r1 == 0) goto L_0x072e
            java.lang.String r0 = "DOMAIN_CHANGE_SHOPPING_SETTINGS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x072e
            goto L_0x0706
        L_0x072e:
            boolean r0 = X.C254413sR.A00(r2)
            if (r0 != 0) goto L_0x0706
            java.util.List r1 = X.C47518E6c.A00(r2, r5)
            if (r1 == 0) goto L_0x0743
            java.lang.String r0 = "CHECKOUT_SETUP_SHOPPING_SETTINGS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0743
            goto L_0x0706
        L_0x0743:
            java.util.List r1 = X.C47518E6c.A00(r2, r5)
            if (r1 == 0) goto L_0x0752
            java.lang.String r0 = "CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0752
            goto L_0x0706
        L_0x0752:
            java.util.List r1 = X.C47518E6c.A00(r2, r5)
            if (r1 == 0) goto L_0x0761
            java.lang.String r0 = "CHECKOUT_UPSELL_SHOPPING_SETTINGS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0761
            goto L_0x0706
        L_0x0761:
            X.2jx r7 = r3.A01
            com.instagram.base.activity.BaseFragmentActivity r1 = r3.A00
            if (r1 == 0) goto L_0x077d
            boolean r0 = X.C367088qA.A04(r2)
            if (r0 == 0) goto L_0x015f
            X.3kF r0 = X.C249713kF.A00
            X.FYi r0 = r0.A0E(r2)
            r0.A00(r7, r1)
            goto L_0x015f
        L_0x0778:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x077d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESS.A06(X.ESS):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-915856484);
        super.onCreate(bundle);
        1YN A002 = AnonymousClass2bO.A00();
        AnonymousClass0eM r2 = this.A03;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(QPTooltipAnchor.SAVED_REPLIES_ITEM, new Object());
        this.A01 = A002.A04(A0l, A1E);
        1YN A003 = AnonymousClass2bO.A00();
        UserSession A0l2 = AnonymousClass7TE.A0l(r2);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0m;
        AnonymousClass2bO.A00();
        this.A00 = A003.A01(this, this, A0l2, 2bV.A06(new IWV(this, 3), this.A01), quickPromotionSlot);
        String str = FRY.A09;
        FRY fry = new FRY(this, AnonymousClass7TE.A0l(r2), this, this);
        this.A02 = fry;
        if (fry.A01()) {
            DbX.A0R(r2).A01(this.A05, C71889OsX.class);
        }
        registerLifecycleListener(this.A01);
        AnonymousClass0fD.A09(-60227208, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(601381266);
        super.onDestroy();
        DbX.A0R(this.A03).A02(this.A05, C71889OsX.class);
        unregisterLifecycleListener(this.A01);
        AnonymousClass0fD.A09(1835511153, A022);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.ESS, X.2jx, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2099526735);
        super.onResume();
        A06(this);
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        UserSession A0l = AnonymousClass7TE.A0l(this.A03);
        C50932FlL flL = new C50932FlL(this, 0);
        0qQ.A0B(A0l, 2);
        1ES.A00(requireContext, A002, C49060Eoe.A00(A0l, new C49396Euy(flL)));
        AnonymousClass0fD.A09(1071916398, A022);
    }
}
