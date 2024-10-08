package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.K8a  reason: case insensitive filesystem */
public final class C61446K8a extends UZ3 {
    public static final String __redex_internal_original_name = "BrandedContentAddBrandPartnersFragment";
    public BrandedContentGatingInfoIntf A00;
    public MTP A01;
    public C231002qi A02;
    public String A03 = "feed";
    public List A04 = AnonymousClass7TE.A1C();
    public List A05 = AnonymousClass7TE.A1C();
    public List A06 = AnonymousClass7TE.A1C();
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass2qU A0B;

    public final X8a A0B() {
        return new C65612Lwn(this, 0);
    }

    public final VWN A0C() {
        return new VWN(requireContext(), (FragmentActivity) null, this, A06(), new C65619Lwu(this, 0), new KXN(this, 0), (Integer) null, (String) null, false, false, false);
    }

    public final String A0D() {
        return "branded_content_add_partner_page";
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ea, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x008c, code lost:
        A05().setVisibility(0);
        A05().setText(X.C49946FGa.A02(requireActivity(), A06(), __redex_internal_original_name, r5));
        X.DbT.A1H(A05());
        X.DbS.A1T(A0A());
        X.AnonymousClass7TE.A1Z(new X.MHC(r11, (X.AnonymousClass4D7) null, 28), X.DbV.A0J(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r1 = 0
            X.0qQ.A0B(r12, r1)
            r6 = r11
            super.onViewCreated(r12, r13)
            java.lang.String r0 = r11.A03
            java.lang.String r4 = "live"
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x001b
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = r11.A07()
            r0 = 8
            r2.setVisibility(r0)
        L_0x001b:
            r0 = 2131427505(0x7f0b00b1, float:1.8476628E38)
            android.view.View r5 = X.JTS.A0C(r12, r0)
            r0 = 2131427559(0x7f0b00e7, float:1.8476738E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r5, r0)
            android.content.Context r2 = r5.getContext()
            r0 = 2131952328(0x7f1302c8, float:1.9541096E38)
            java.lang.CharSequence r0 = r2.getText(r0)
            r3.setText(r0)
            r0 = 2131427512(0x7f0b00b8, float:1.8476642E38)
            android.view.View r2 = r5.requireViewById(r0)
            r0 = 65
            X.LYC.A00(r2, r0, r11)
            r0 = 66
            X.LYC r2 = new X.LYC
            r2.<init>((java.lang.Object) r11, (int) r0)
            r0 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r5, r0)
            X.AnonymousClass0fU.A00(r2, r0)
            X.1YN r5 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r8 = r11.A06()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0C
            X.AnonymousClass2bO.A00()
            r3 = 0
            X.LvT r2 = new X.LvT
            r2.<init>(r11, r1)
            X.LvV r0 = X.LvV.A00
            X.2bW r9 = X.2bV.A02(r2, r0)
            r7 = r11
            X.2qi r2 = r5.A01(r6, r7, r8, r9, r10)
            r11.A02 = r2
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0F
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.0qQ.A07(r0)
            r2.AVg(r0)
            java.lang.String r2 = r11.A03
            int r0 = r2.hashCode()
            switch(r0) {
                case 3230752: goto L_0x00cf;
                case 3322092: goto L_0x00d9;
                case 3496474: goto L_0x00e1;
                case 109770997: goto L_0x00c5;
                default: goto L_0x0089;
            }
        L_0x0089:
            r5 = 2131954133(0x7f1309d5, float:1.9544757E38)
        L_0x008c:
            android.widget.TextView r0 = r11.A05()
            r0.setVisibility(r1)
            android.widget.TextView r4 = r11.A05()
            androidx.fragment.app.FragmentActivity r2 = r11.requireActivity()
            com.instagram.common.session.UserSession r1 = r11.A06()
            java.lang.String r0 = "BrandedContentAddBrandPartnersFragment"
            android.text.SpannableStringBuilder r0 = X.C49946FGa.A02(r2, r1, r0, r5)
            r4.setText(r0)
            android.widget.TextView r0 = r11.A05()
            X.DbT.A1H(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r11.A0A()
            X.DbS.A1T(r0)
            X.0xx r2 = X.DbV.A0J(r11)
            r1 = 28
            X.MHC r0 = new X.MHC
            r0.<init>(r11, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return
        L_0x00c5:
            java.lang.String r0 = "story"
            boolean r0 = r2.equals(r0)
            r5 = 2131954137(0x7f1309d9, float:1.9544765E38)
            goto L_0x00ea
        L_0x00cf:
            java.lang.String r0 = "igtv"
            boolean r0 = r2.equals(r0)
            r5 = 2131954134(0x7f1309d6, float:1.9544759E38)
            goto L_0x00ea
        L_0x00d9:
            boolean r0 = r2.equals(r4)
            r5 = 2131954135(0x7f1309d7, float:1.954476E38)
            goto L_0x00ea
        L_0x00e1:
            java.lang.String r0 = "reel"
            boolean r0 = r2.equals(r0)
            r5 = 2131954136(0x7f1309d8, float:1.9544763E38)
        L_0x00ea:
            if (r0 != 0) goto L_0x008c
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61446K8a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (r0 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ce, code lost:
        r3.A0q(X.DbV.A0z(r6, r7.getUsername(), r1));
        r3.A0Q(X.LV0.A00(r7, r6, 2), X.C358278ae.DEFAULT, 2131952275);
        r3.A0D(X.LV0.A00(r7, r6, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r0 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016c, code lost:
        r3.A0q(X.DbV.A0z(r6, r7.getUsername(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a0, code lost:
        if (r0 == false) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C61446K8a r6, com.instagram.user.model.User r7) {
        /*
            java.util.List r0 = r6.A04
            boolean r1 = r0.contains(r7)
            r3 = 0
            java.util.List r0 = r6.A04
            if (r1 != 0) goto L_0x01a3
            int r0 = r0.size()
            r5 = 2
            r4 = 4
            r2 = 0
            if (r0 >= r5) goto L_0x0036
            boolean r0 = r7.A1v()
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r6.A04
            r0.add(r7)
            r0 = 1
            r6.A03(r7, r0)
            com.instagram.common.session.UserSession r0 = r6.A06()
            X.17i r0 = X.17h.A00(r0)
            r0.A01(r7, r3, r3)
        L_0x002e:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0035
            A01(r6)
        L_0x0035:
            return
        L_0x0036:
            X.8ab r3 = X.DbW.A0U(r6)
            r0 = 2131954098(0x7f1309b2, float:1.9544686E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A05 = r0
            java.lang.String r1 = r6.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L_0x0050;
                case 3322092: goto L_0x005a;
                case 3496474: goto L_0x0064;
                case 109770997: goto L_0x006e;
                default: goto L_0x004c;
            }
        L_0x004c:
            r1 = 2131954093(0x7f1309ad, float:1.9544675E38)
            goto L_0x0087
        L_0x0050:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954094(0x7f1309ae, float:1.9544678E38)
            goto L_0x0077
        L_0x005a:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            r1 = 2131954095(0x7f1309af, float:1.954468E38)
            goto L_0x0077
        L_0x0064:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954096(0x7f1309b0, float:1.9544682E38)
            goto L_0x0077
        L_0x006e:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954097(0x7f1309b1, float:1.9544684E38)
        L_0x0077:
            if (r0 != 0) goto L_0x0087
            goto L_0x004c
        L_0x007a:
            X.8ab r3 = X.DbW.A0U(r6)
            r0 = 2131954168(0x7f1309f8, float:1.9544828E38)
            r3.A09(r0)
            r1 = 2131954167(0x7f1309f7, float:1.9544826E38)
        L_0x0087:
            r3.A08(r1)
        L_0x008a:
            r1 = 2131968772(0x7f134304, float:1.9574448E38)
            X.8ae r0 = X.C358278ae.DEFAULT
            r3.A0P(r2, r0, r1)
            goto L_0x00ec
        L_0x0093:
            X.4Cl r0 = r7.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = r0.AcG()
            if (r0 != 0) goto L_0x011a
            r3 = -1
        L_0x009c:
            r4 = 3
            if (r3 == r4) goto L_0x007a
            com.instagram.common.session.UserSession r0 = r6.A06()
            java.lang.String r2 = r7.getId()
            X.0wc r1 = X.DbX.A0O(r6, r0)
            java.lang.String r0 = "ig_branded_content_permission_required_dialog_shown"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r0 = X.DbV.A0q(r2)
            X.C64186LSt.A00(r1, r6, r0)
            X.8ab r3 = X.DbW.A0U(r6)
            r0 = 2131954104(0x7f1309b8, float:1.9544698E38)
            r3.A09(r0)
            java.lang.String r1 = r6.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L_0x00f0;
                case 3322092: goto L_0x00fa;
                case 3496474: goto L_0x0104;
                case 109770997: goto L_0x010e;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            r1 = 2131954099(0x7f1309b3, float:1.9544688E38)
        L_0x00ce:
            java.lang.String r0 = r7.getUsername()
            java.lang.String r0 = X.DbV.A0z(r6, r0, r1)
            r3.A0q(r0)
            r2 = 2131952275(0x7f130293, float:1.9540988E38)
            X.LV0 r1 = X.LV0.A00(r7, r6, r5)
            X.8ae r0 = X.C358278ae.DEFAULT
            r3.A0Q(r1, r0, r2)
            X.LV0 r0 = X.LV0.A00(r7, r6, r4)
            r3.A0D(r0)
        L_0x00ec:
            X.DbT.A1V(r3)
            return
        L_0x00f0:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954100(0x7f1309b4, float:1.954469E38)
            goto L_0x0117
        L_0x00fa:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            r1 = 2131954101(0x7f1309b5, float:1.9544692E38)
            goto L_0x0117
        L_0x0104:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954102(0x7f1309b6, float:1.9544694E38)
            goto L_0x0117
        L_0x010e:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954103(0x7f1309b7, float:1.9544696E38)
        L_0x0117:
            if (r0 != 0) goto L_0x00ce
            goto L_0x00cb
        L_0x011a:
            int r3 = r0.ordinal()
            r1 = 1
            r0 = 5
            if (r3 == r0) goto L_0x0139
            if (r3 != r4) goto L_0x009c
            java.util.List r0 = r6.A04
            r0.add(r7)
            r6.A03(r7, r1)
            com.instagram.common.session.UserSession r1 = r6.A06()
            java.lang.String r0 = r7.getId()
            X.C64186LSt.A01(r6, r1, r0)
            goto L_0x002e
        L_0x0139:
            java.util.List r0 = r6.A04
            r0.add(r7)
            r6.A03(r7, r1)
            com.instagram.common.session.UserSession r1 = r6.A06()
            java.lang.String r0 = r7.getId()
            X.C64186LSt.A01(r6, r1, r0)
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0156
            r0 = 13
            X.LV3 r2 = X.LV3.A00(r6, r0)
        L_0x0156:
            X.8ab r3 = X.DbW.A0U(r6)
            r0 = 2131954092(0x7f1309ac, float:1.9544673E38)
            r3.A09(r0)
            java.lang.String r1 = r6.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L_0x0179;
                case 3322092: goto L_0x0183;
                case 3496474: goto L_0x018d;
                case 109770997: goto L_0x0197;
                default: goto L_0x0169;
            }
        L_0x0169:
            r1 = 2131954087(0x7f1309a7, float:1.9544663E38)
        L_0x016c:
            java.lang.String r0 = r7.getUsername()
            java.lang.String r0 = X.DbV.A0z(r6, r0, r1)
            r3.A0q(r0)
            goto L_0x008a
        L_0x0179:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954088(0x7f1309a8, float:1.9544665E38)
            goto L_0x01a0
        L_0x0183:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            r1 = 2131954089(0x7f1309a9, float:1.9544667E38)
            goto L_0x01a0
        L_0x018d:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954090(0x7f1309aa, float:1.954467E38)
            goto L_0x01a0
        L_0x0197:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954091(0x7f1309ab, float:1.9544671E38)
        L_0x01a0:
            if (r0 != 0) goto L_0x016c
            goto L_0x0169
        L_0x01a3:
            r0.remove(r7)
            com.instagram.common.session.UserSession r1 = r6.A06()
            java.lang.String r0 = "BrandedContentAddBrandPartnersFragment"
            X.C64186LSt.A05(r6, r1, r0)
            r6.A03(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61446K8a.A02(X.K8a, com.instagram.user.model.User):void");
    }

    private final void A03(User user, boolean z) {
        String str;
        if (z) {
            str = "added";
        } else {
            str = "removed";
        }
        JVF.A04(this, A06(), AnonymousClass05K.A0D, A06().A06, DbY.A0q("has_brand_approval", String.valueOf(user.A1v()), AnonymousClass7TE.A1L("brand_id", user.getId()), AnonymousClass7TE.A1L("action_type", str)));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2qU] */
    public C61446K8a() {
        AnonymousClass2bO.A00();
        this.A0B = new Object();
    }

    public static final C66966Mfz A00(C61446K8a k8a, User user) {
        C66966Mfz mfz;
        C273014lo r0;
        int i;
        if (AnonymousClass430.A02(k8a.A06())) {
            return new C66966Mfz();
        }
        if (k8a.A04.contains(user)) {
            if (user.A03.AcG() == BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED || user.A1v()) {
                mfz = new C66966Mfz();
                i = 2131952452;
            } else {
                mfz = new C66966Mfz();
                i = 2131969279;
            }
            JTT.A1R(mfz, i);
            r0 = C273014lo.SECONDARY;
        } else {
            mfz = new C66966Mfz();
            JTT.A1R(mfz, 2131952258);
            r0 = C273014lo.PRIMARY;
        }
        mfz.A03 = r0;
        return mfz;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.JbE, X.KPB] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r6.A03.AcG() == com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C61446K8a r18) {
        /*
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r3 = r18
            java.util.List r0 = r3.A04
            java.util.Iterator r7 = r0.iterator()
        L_0x000c:
            boolean r0 = r7.hasNext()
            r12 = 0
            if (r0 == 0) goto L_0x004b
            com.instagram.user.model.User r6 = X.DbT.A0k(r7)
            boolean r0 = r6.A1v()
            if (r0 != 0) goto L_0x0028
            X.4Cl r0 = r6.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.AcG()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            r5 = 1
            if (r1 != r0) goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            java.util.List r0 = r3.A04
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0042
            r0 = 2
            if (r1 > r0) goto L_0x0042
            com.instagram.common.session.UserSession r4 = r3.A06()
            java.lang.String r2 = r3.A03
            boolean r1 = r3.A09
            boolean r0 = r3.A08
            boolean r12 = X.C347037wA.A06(r4, r2, r1, r0)
        L_0x0042:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r6, r12, r5)
            r8.add(r0)
            goto L_0x000c
        L_0x004b:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x00bd
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3138974: goto L_0x005d;
                case 3230752: goto L_0x008b;
                case 3322092: goto L_0x008e;
                case 3496474: goto L_0x0091;
                case 109770997: goto L_0x0094;
                default: goto L_0x005c;
            }
        L_0x005c:
            return
        L_0x005d:
            java.lang.String r0 = "feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            com.instagram.common.session.UserSession r2 = r3.A06()
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r13 = r3.A00
            if (r13 != 0) goto L_0x007a
            r14 = 0
            com.instagram.api.schemas.BrandedContentGatingInfo r13 = new com.instagram.api.schemas.BrandedContentGatingInfo
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x007a:
            java.lang.String r1 = "branded_content_tagged_business_partner"
            X.KPB r0 = new X.KPB
            r0.<init>(r1)
            r0.A01 = r8
            r0.A00 = r13
            r0.A02 = r12
            X.C59888JbD.A01(r2, r0)
            return
        L_0x008b:
            java.lang.String r0 = "igtv"
            goto L_0x0096
        L_0x008e:
            java.lang.String r0 = "live"
            goto L_0x0096
        L_0x0091:
            java.lang.String r0 = "reel"
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = "story"
        L_0x0096:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005c
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A06()
            X.6Yo r1 = X.C49892FBu.A00(r1, r0)
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r5 = r3.A00
            boolean r10 = r3.A09
            java.lang.String r6 = r3.A03
            r7 = 0
            r9 = 1
            r11 = r9
            r13 = r12
            X.K8W r0 = X.LSU.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A0B(r7, r0)
            r1.A04()
            return
        L_0x00bd:
            X.DbT.A1I(r3)
            X.MTP r0 = r3.A01
            if (r0 == 0) goto L_0x005c
            r0.A7s(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61446K8a.A01(X.K8a):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1661305808);
        super.onCreate(bundle);
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, A06(), 0), "instagram_bc_add_partner_entry");
        A0e.A7p("is_editing", false);
        A0e.AAJ("media_id", (String) null);
        A0e.AAJ("media_type", "feed");
        A0e.AAJ("prior_module", __redex_internal_original_name);
        A0e.Cgf();
        UserSession A062 = A06();
        this.A0A = 182.A06(DbS.A0J(A062, 0), A062, 36316126037151728L);
        AnonymousClass0fD.A09(2133081499, A022);
    }
}
