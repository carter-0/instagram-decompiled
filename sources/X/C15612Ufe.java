package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.ui.base.IgTextView;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.lang.ref.Reference;
import java.util.Iterator;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.Ufe  reason: case insensitive filesystem */
public final class C15612Ufe extends 1P0 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C15612Ufe(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onFail(C268654dm r10) {
        int i;
        int i2;
        boolean z;
        View view;
        CHI chi;
        String str;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(919172353);
                0qQ.A0B(r10, 0);
                Context context = ((C64963Ll2) this.A01).A04;
                C59689JTv.A03(context, LIL.A00(context, r10), "launch_failed_web_link_validation", 0);
                i2 = -2110999034;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-556006278);
                0qQ.A0B(r10, 0);
                AnonymousClass1XT r7 = (AnonymousClass1XT) r10.A00();
                if (r7 != null) {
                    z = r7.getNewsURLIsRegulated();
                } else {
                    z = false;
                }
                C64963Ll2 ll2 = (C64963Ll2) this.A01;
                if (!182.A06(0Tu.A05, ll2.A06, 36319441750859163L) || r7 == null || !z) {
                    Context context2 = ll2.A04;
                    C59689JTv.A03(context2, LIL.A00(context2, r10), "save_failed_web_link_validation", 0);
                } else {
                    String errorMessage = r7.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = LIL.A00(ll2.A04, r10);
                        0qQ.A07(errorMessage);
                    }
                    LB5 lb5 = ll2.A01;
                    if (lb5 != null) {
                        view = lb5.A01;
                    } else {
                        view = null;
                    }
                    0nA.A0N(view);
                    C310336ap r2 = new C310336ap();
                    r2.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                    r2.A0D = errorMessage;
                    r2.A0R = true;
                    r2.A0L = true;
                    DbW.A0q(ll2.A04, r2, 2131968321);
                    r2.A0A(new C65358Lry(ll2, 2));
                    DbY.A1N(r2);
                }
                i2 = 1980246677;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r10, 1179339268);
                C15612Ufe.super.onFail(r10);
                i2 = 154927505;
                break;
            case 4:
                i = AnonymousClass7TG.A0D(r10, 913197776);
                ((OO0) this.A01).A01(r10, this.A02);
                i2 = -1674611040;
                break;
            case 5:
                i = AnonymousClass7TG.A0D(r10, -1912867480);
                C18709Vye.A00.remove(this.A02);
                C17587Vaf vaf = (C17587Vaf) this.A01;
                Throwable A012 = r10.A01();
                if (A012 != null) {
                    0wb.A07("Failed to get LeadGenDeepLinkQueryModel ", A012);
                }
                if (!(!(r10 instanceof C268674do) || (chi = (CHI) ((C268674do) r10).A00) == null || (str = chi.A06) == null)) {
                    0wb.A03("LeadGenDeepLinkQueryModel error message", str);
                }
                Iterator A1G = AnonymousClass7TE.A1G(vaf.A04);
                while (A1G.hasNext()) {
                    C20955X6i x6i = (C20955X6i) ((Reference) AnonymousClass7TF.A0a(A1G)).get();
                    if (x6i != null) {
                        x6i.onFailure();
                    }
                }
                i2 = -1085575826;
                break;
            case 6:
                i = AnonymousClass0fD.A03(467272803);
                Fragment fragment = (Fragment) this.A01;
                C59689JTv.A03(fragment.getContext(), LIL.A00(fragment.requireContext(), r10), "validateUrlAndSaveOthers_fail", 0);
                i2 = 1825859781;
                break;
            default:
                C15612Ufe.super.onFail(r10);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        IgTextView igTextView;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1706366164);
                C15328Uac.A05((C15328Uac) this.A01);
                i2 = 886633431;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-74662913);
                ((C64963Ll2) this.A01).A02 = false;
                i2 = -1755625773;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1517241766);
                C64963Ll2 ll2 = (C64963Ll2) this.A01;
                ll2.A02 = false;
                LB5 lb5 = ll2.A01;
                if (!(lb5 == null || (igTextView = lb5.A08) == null)) {
                    igTextView.setTextColor(-1);
                }
                i2 = 2045791964;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1234846614);
                ((C70696OGr) this.A01).A05.hide();
                i2 = -751258017;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-710374642);
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) this.A01;
                reelMoreOptionsFragment.A0M = false;
                ReelMoreOptionsFragment.A0B(reelMoreOptionsFragment);
                i2 = -1771241750;
                break;
            default:
                C15612Ufe.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        IgTextView igTextView;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1486632131);
                C15328Uac uac = (C15328Uac) this.A01;
                C15328Uac.A06(uac);
                uac.A0D = null;
                i2 = -1442758212;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1890759998);
                ((C64963Ll2) this.A01).A02 = true;
                i2 = 1843038857;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-943336773);
                C64963Ll2 ll2 = (C64963Ll2) this.A01;
                ll2.A02 = true;
                LB5 lb5 = ll2.A01;
                if (!(lb5 == null || (igTextView = lb5.A08) == null)) {
                    DbT.A17(ll2.A04, igTextView, 2Yu.A08(ll2.A03));
                }
                i2 = 996630624;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-720839640);
                ((OO0) this.A01).A02(this.A02);
                i2 = -593813758;
                break;
            case 6:
                i = AnonymousClass0fD.A03(413469221);
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) this.A01;
                reelMoreOptionsFragment.A0M = true;
                ReelMoreOptionsFragment.A0B(reelMoreOptionsFragment);
                i2 = 769381093;
                break;
            default:
                C15612Ufe.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [X.V42, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v41, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x022e, code lost:
        if (r2 == 4) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x024b, code lost:
        if (X.00l.A0d(r2, "RESURRECTION", false) == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0280, code lost:
        if (r1 != 7) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x037e, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0381, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r40) {
        /*
            r39 = this;
            r12 = r39
            r11 = r40
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x0179;
                case 2: goto L_0x007f;
                case 3: goto L_0x02ee;
                case 4: goto L_0x0050;
                case 5: goto L_0x0285;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 885542139(0x34c84cfb, float:3.7308914E-7)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1060326563(0x3f334ca3, float:0.70038813)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r12.A01
            instagram.features.stories.fragment.ReelMoreOptionsFragment r3 = (instagram.features.stories.fragment.ReelMoreOptionsFragment) r3
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 != 0) goto L_0x002e
            r1 = 715644715(0x2aa7df2b, float:2.9820013E-13)
        L_0x0024:
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1031674198(0xffffffffc281e6aa, float:-64.950516)
        L_0x002a:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x002e:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r3.A03
            X.8CB r2 = new X.8CB
            r2.<init>(r1)
            java.lang.String r1 = r12.A02
            r2.A0C = r1
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r2.A01()
            r3.A03 = r1
            instagram.features.stories.fragment.ReelMoreOptionsFragment.A0A(r3)
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r1 = 2131954531(0x7f130b63, float:1.9545564E38)
            X.C59689JTv.A07(r2, r1)
            r1 = 695379383(0x2972a5b7, float:5.387853E-14)
            goto L_0x0024
        L_0x0050:
            r0 = 1969148526(0x755ed26e, float:2.8246043E32)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XP r11 = (X.1XP) r11
            r1 = -404371299(0xffffffffe7e5c89d, float:-2.1702452E24)
            int r4 = X.AnonymousClass7TG.A0D(r11, r1)
            java.lang.Object r3 = r12.A01
            X.OO0 r3 = (X.OO0) r3
            java.lang.String r1 = r3.A00
            java.lang.String r2 = r12.A02
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 != 0) goto L_0x0078
            r1 = -1100235362(0xffffffffbe6bbd9e, float:-0.23021552)
        L_0x0071:
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 326265743(0x13726b8f, float:3.0597725E-27)
            goto L_0x002a
        L_0x0078:
            r3.A00(r11, r2)
            r1 = 1628907585(0x61172841, float:1.7427243E20)
            goto L_0x0071
        L_0x007f:
            r0 = -1209659597(0xffffffffb7e60f33, float:-2.7425214E-5)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1785851199(0x6a71ed3f, float:7.311787E25)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r12.A01
            X.Ll2 r2 = (X.C64963Ll2) r2
            X.8MT r1 = r2.A07
            java.lang.String r15 = r12.A02
            X.LB5 r4 = r2.A01
            r6 = 0
            if (r4 == 0) goto L_0x00b2
            com.instagram.common.ui.base.IgEditText r4 = r4.A05
            if (r4 == 0) goto L_0x00b2
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x00b2
            java.lang.String r7 = r4.toString()
            r5 = 1
            if (r7 == 0) goto L_0x00b2
            boolean r4 = X.C51966G9m.A1X(r7)
            if (r4 != r5) goto L_0x00b2
            r6 = r7
        L_0x00b2:
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r12 = 0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r1.A1m
            java.lang.Class<X.7w8> r4 = X.C347017w8.class
            java.util.ArrayList r4 = r8.A0V(r4)
            java.util.Iterator r7 = r4.iterator()
        L_0x00c1:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r5 = r7.next()
            X.7w8 r5 = (X.C347017w8) r5
            java.lang.Class<X.5xX> r4 = X.C300635xX.class
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x00c1
            r8.A0S(r5)
            goto L_0x00c1
        L_0x00d9:
            com.instagram.common.session.UserSession r14 = r1.A0r
            boolean r4 = X.C346897vw.A01(r14)
            android.content.Context r13 = r1.A0f
            if (r4 == 0) goto L_0x016c
            int r17 = r8.getWidth()
            r18 = r12
            r19 = r12
            r16 = r6
            X.7w8 r5 = X.AAU.A01(r13, r14, r15, r16, r17, r18, r19)
        L_0x00f1:
            r4 = 2500(0x9c4, float:3.503E-42)
            java.lang.String r36 = X.AnonymousClass000.A00(r4)
            r10 = 1
            X.0qQ.A0B(r13, r10)
            int r4 = X.Dbb.A01(r13)
            float r7 = (float) r4
            int r4 = X.JTR.A07(r13)
            float r6 = (float) r4
            int r4 = X.C66582MXn.A01(r13)
            float r8 = (float) r4
            int r4 = r5.getIntrinsicHeight()
            float r4 = (float) r4
            r11 = 0
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            float r7 = r7 / r4
            float r6 = r6 / r4
            float r8 = r8 / r4
            r32 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r9 = new X.6b1
            r13 = r11
            r14 = r12
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r11
            r23 = r12
            r24 = r10
            r25 = r7
            r26 = r6
            r27 = r11
            r28 = r10
            r30 = r11
            r31 = r12
            r33 = r11
            r34 = r32
            r35 = r8
            r37 = r10
            r38 = r12
            r9.<init>((boolean) r10, (X.AnonymousClass8BH) r11, (boolean) r12, (java.lang.String) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (java.lang.Integer) r20, (boolean) r21, (X.AnonymousClass8DA) r22, (boolean) r23, (boolean) r24, (float) r25, (float) r26, (X.C3510487j) r27, (boolean) r28, (java.lang.Integer) r29, (java.lang.Integer) r30, (int) r31, (float) r32, (java.util.List) r33, (float) r34, (float) r35, (java.lang.Object) r36, (boolean) r37, (boolean) r38)
            X.6nz r4 = X.C317876nz.A13
            java.util.ArrayList r4 = r4.A01()
            r1.A1K(r5, r9, r4)
            X.C64963Ll2.A02(r2, r10)
            com.instagram.common.session.UserSession r1 = r2.A06
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            X.WQ0 r1 = new X.WQ0
            r1.<init>()
            r2.A00(r1)
            r1 = 714107484(0x2a906a5c, float:2.565334E-13)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 322838169(0x133e1e99, float:2.3996457E-27)
            goto L_0x002a
        L_0x016c:
            X.AnonymousClass8ME.A0A(r1)
            int r4 = r8.getWidth()
            X.7w8 r5 = X.AAU.A00(r13, r14, r15, r6, r4)
            goto L_0x00f1
        L_0x0179:
            r0 = -705503579(0xffffffffd5f2dea5, float:-3.33797581E13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -755755505(0xffffffffd2f4160f, float:-5.24171051E11)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r12.A01
            X.Ll2 r2 = (X.C64963Ll2) r2
            android.app.Activity r4 = r2.A03
            boolean r1 = r4.isFinishing()
            if (r1 != 0) goto L_0x01a8
            com.instagram.common.session.UserSession r3 = r2.A06
            java.lang.String r2 = r12.A02
            X.2EG r1 = X.2EG.A3B
            X.SUL r2 = X.Dba.A0J(r4, r3, r1, r2)
            r1 = 1552(0x610, float:2.175E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A0S = r1
            r2.A0A()
        L_0x01a8:
            r1 = 1276837347(0x4c1afde3, float:4.0630156E7)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1191234562(0x4700cc02, float:32972.008)
            goto L_0x002a
        L_0x01b3:
            r0 = 1410246262(0x540ea676, float:2.45071243E12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r11 = (com.instagram.business.promote.model.PromoteEnrollCouponInfo) r11
            r1 = 598883674(0x23b23d5a, float:1.9324782E-17)
            int r10 = X.AnonymousClass0fD.A03(r1)
            r9 = 0
            X.0qQ.A0B(r11, r9)
            X.C15612Ufe.super.onSuccess(r11)
            java.lang.Object r8 = r12.A01
            X.Uac r8 = (X.C15328Uac) r8
            X.0eM r1 = r8.A0f
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r16 = r11.A00()
            com.instagram.model.coupon.PromoteCouponType r13 = r11.A05
            java.lang.String r7 = r11.A0A
            java.lang.String r6 = r11.A06
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r5 = r11.A04
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r4 = r11.A03
            java.lang.String r3 = r11.A09
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r2 = r11.A02
            com.instagram.model.coupon.PromoteAdsCouponUseCase r1 = r11.A01
            java.lang.String r12 = r12.A02
            X.VVO r15 = new X.VVO
            r15.<init>(r8, r11, r12)
            X.Vkt r14 = new X.Vkt
            r22 = r13
            r23 = r7
            r24 = r6
            r25 = r3
            r20 = r4
            r21 = r2
            r18 = r1
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.model.coupon.PromoteCouponType r3 = r14.A0B
            if (r3 == 0) goto L_0x0230
            int r4 = r3.ordinal()
            r2 = 7
            r1 = 1
            if (r4 == r1) goto L_0x0276
            if (r4 != r9) goto L_0x0230
            java.lang.Integer r1 = r14.A01()
            int r1 = r1.intValue()
            switch(r1) {
                case 0: goto L_0x0282;
                case 1: goto L_0x0223;
                case 2: goto L_0x0230;
                case 3: goto L_0x0230;
                case 4: goto L_0x0230;
                case 5: goto L_0x0230;
                case 6: goto L_0x0223;
                case 7: goto L_0x0230;
                default: goto L_0x021d;
            }
        L_0x021d:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0223:
            com.instagram.model.coupon.PromoteAdsCouponUseCase r1 = r14.A07
            if (r1 == 0) goto L_0x0230
            int r2 = r1.ordinal()
            if (r2 == r9) goto L_0x0282
            r1 = 4
            if (r2 == r1) goto L_0x0282
        L_0x0230:
            com.instagram.model.coupon.PromoteCouponType r1 = com.instagram.model.coupon.PromoteCouponType.HERES_X
            if (r3 != r1) goto L_0x0268
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r2 = r11.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_ENROLLED
            if (r2 != r1) goto L_0x0268
            java.lang.String r3 = r11.A09
            java.lang.String r2 = r11.A0B
            if (r2 == 0) goto L_0x024d
            java.lang.String r1 = "RESURRECTION"
            boolean r2 = X.00l.A0d(r2, r1, r9)
            r1 = 2131970116(0x7f134844, float:1.9577174E38)
            if (r2 != 0) goto L_0x0250
        L_0x024d:
            r1 = 2131970115(0x7f134843, float:1.9577172E38)
        L_0x0250:
            java.lang.String r2 = r14.A0D
            java.lang.String r3 = X.C13991Tnr.A0e(r8, r2, r3, r1)
            r1 = 2131970117(0x7f134845, float:1.9577176E38)
            java.lang.String r2 = X.C13991Tnr.A0d(r8, r2, r1)
            X.V42 r1 = new X.V42
            r1.<init>()
            r1.A06 = r2
            r1.A04 = r3
            r8.A0A = r1
        L_0x0268:
            X.C15328Uac.A08(r8)
            r1 = 90654015(0x567453f, float:1.0874286E-35)
            X.AnonymousClass0fD.A0A(r1, r10)
            r1 = -1125506241(0xffffffffbcea233f, float:-0.02858126)
            goto L_0x002a
        L_0x0276:
            java.lang.Integer r1 = r14.A01()
            int r1 = r1.intValue()
            if (r1 == r9) goto L_0x0230
            if (r1 == r2) goto L_0x0230
        L_0x0282:
            r8.A0D = r14
            goto L_0x0268
        L_0x0285:
            r0 = -1269323045(0xffffffffb457aadb, float:-2.0085592E-7)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.CHI r11 = (X.CHI) r11
            r0 = -978287054(0xffffffffc5b08632, float:-5648.7744)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r11, r3)
            X.CwD r0 = new X.CwD
            r0.<init>(r11)
            X.Vk5 r4 = new X.Vk5
            r4.<init>(r0)
            java.util.concurrent.ConcurrentMap r1 = X.C18709Vye.A00
            java.lang.String r0 = r12.A02
            r1.remove(r0)
            X.Vtw r0 = X.C18544Vtw.A01
            java.util.concurrent.ConcurrentMap r1 = r0.A00
            X.CwD r0 = r4.A00
            java.lang.String r0 = r0.A09
            if (r0 == 0) goto L_0x02e4
            r1.put(r0, r4)
            java.lang.Object r0 = r12.A01
            X.Vaf r0 = (X.C17587Vaf) r0
            java.util.ArrayList r0 = r0.A04
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)
        L_0x02c1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02d9
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.X6i r0 = (X.C20955X6i) r0
            if (r0 == 0) goto L_0x02c1
            r0.DoP(r4, r3)
            goto L_0x02c1
        L_0x02d9:
            r0 = 524013230(0x1f3bceae, float:3.9769752E-20)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1967392403(0xffffffff8abbf96d, float:-1.8101269E-32)
            goto L_0x037e
        L_0x02e4:
            java.lang.String r0 = "formId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02ee:
            r0 = -1678640317(0xffffffff9bf1fb43, float:-4.003248E-22)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.NGv r11 = (X.NGv) r11
            r0 = 941110695(0x381835a7, float:3.628959E-5)
            int r4 = X.AnonymousClass7TG.A0D(r11, r0)
            java.lang.Object r0 = r12.A01
            X.OGr r0 = (X.C70696OGr) r0
            X.NKI r6 = r0.A04
            java.lang.String r8 = r12.A02
            X.8wu r0 = r11.A00
            if (r0 == 0) goto L_0x0382
            com.instagram.direct.model.DirectThreadThemeInfo r3 = X.C370718wx.A00(r0)
            X.3sy r1 = r6.A08
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x0375
            if (r1 == 0) goto L_0x0375
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            X.0eM r2 = r6.A0Q
            X.0lg r0 = X.DbT.A0X(r2)
            X.AnonymousClass0Dg.A00(r7, r0)
            r0 = 201(0xc9, float:2.82E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.putString(r0, r8)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0 = 15
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.putParcelable(r0, r1)
            r0 = 199(0xc7, float:2.79E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.putParcelable(r0, r3)
            int r1 = r6.A00
            r0 = 32
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.putInt(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.putSerializable(r0, r1)
            X.0lg r3 = X.DbT.A0X(r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r0 = 2233(0x8b9, float:3.129E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.AnonymousClass6W8.A03(r1, r7, r3, r2, r0)
            r1.A07()
            r0 = 100
            r1.A0D(r6, r0)
        L_0x0375:
            r0 = -541059872(0xffffffffdfc014e0, float:-2.7681868E19)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1273749173(0xffffffffb414214b, float:-1.3795686E-7)
        L_0x037e:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0382:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1352802779(0x50a221db, float:2.1761022E10)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15612Ufe.onSuccess(java.lang.Object):void");
    }
}
