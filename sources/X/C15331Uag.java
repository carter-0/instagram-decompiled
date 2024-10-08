package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.arads.ArAdsUIModel;

/* renamed from: X.Uag  reason: case insensitive filesystem */
public class C15331Uag extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ArAdsCommerceCameraFragment";
    public ViewGroup A00;
    public C39749A7p A01;
    public C312426eP A02;
    public EffectAttribution A03;
    public C312156dv A04;
    public C17619VbB A05;
    public C17667Vby A06;
    public VRF A07;
    public A9C A08;
    public C63797L7d A09;
    public C19256WRp A0A;
    public W2i A0B;
    public TargetViewSizeProvider A0C;
    public C3504484r A0D;
    public ArAdsUIModel A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public 28D A0J;
    public final C18417VrM A0K = new C18417VrM(this);
    public final A8U A0L = new A8U(this);
    public final AnonymousClass0eM A0M = C227642jf.A02(this);
    public final C262224Cq A0N = 19E.A02(AnonymousClass12T.A00.AOJ(559423850, 3));
    public final AnonymousClass0eM A0O = AnonymousClass0eN.A01(new MMI(this, 42));

    public String getModuleName() {
        return "ar_ads_camera";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.9mX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.AS8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: X.9mX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: X.9mX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r3 = 0
            r2 = r27
            X.0qQ.A0B(r2, r3)
            r0 = r26
            r1 = r28
            super.onViewCreated(r2, r1)
            r1 = 2131432271(0x7f0b134f, float:1.8486295E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r1)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r1 = r0
            boolean r5 = r0 instanceof X.UYH
            if (r5 == 0) goto L_0x005b
            r15 = r1
            X.UYH r15 = (X.UYH) r15
            r6 = 2131432125(0x7f0b12bd, float:1.8485999E38)
            X.3oV r6 = X.C66581MXm.A0T(r2, r6)
            android.view.View r12 = r6.getView()
            X.0eM r6 = r15.A0M
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r11 = r15.requireActivity()
            X.A8U r14 = r15.A0L
            X.Vge r13 = r15.A07
            if (r13 != 0) goto L_0x0043
            java.lang.String r0 = "productCardViewController"
        L_0x003b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0043:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r15.A0C
            if (r6 == 0) goto L_0x0058
            X.AS8 r10 = new X.AS8
            r17 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.VM3 r6 = new X.VM3
            r6.<init>(r15)
            r10.A02 = r6
            r15.A06 = r10
            goto L_0x00a7
        L_0x0058:
            java.lang.String r0 = "targetViewSizeProvider"
            goto L_0x003b
        L_0x005b:
            r6 = 2131443648(0x7f0b3fc0, float:1.850937E38)
            android.view.View r11 = X.AnonymousClass7TF.A0G(r2, r6)
            android.content.Context r10 = r0.requireContext()
            X.0eM r8 = r0.A0M
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r8)
            androidx.fragment.app.FragmentActivity r12 = r0.getActivity()
            r6 = 146(0x92, float:2.05E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            X.0qQ.A0C(r12, r6)
            r22 = 2131237309(0x7f0819bd, float:1.8090865E38)
            r13 = 0
            X.8AL r9 = new X.8AL
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r13
            r23 = r3
            r24 = r3
            r25 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView r6 = r9.A0P
            r6.setVisibility(r3)
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r8)
            X.9mX r10 = new X.9mX
            r10.<init>(r7, r6, r9)
        L_0x00a7:
            androidx.fragment.app.FragmentActivity r8 = r0.getActivity()
            r6 = 146(0x92, float:2.05E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            X.0qQ.A0C(r8, r6)
            X.0eM r13 = r0.A0M
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r13)
            r0.requireContext()
            r0.A02()
            X.L7d r6 = new X.L7d
            r6.<init>(r4, r8, r10, r7)
            r0.A09 = r6
            r4 = 2131434846(0x7f0b1d5e, float:1.8491517E38)
            android.view.ViewGroup r4 = X.DbU.A0C(r2, r4)
            X.0qQ.A0B(r4, r3)
            r0.A00 = r4
            r4 = 2131429457(0x7f0b0851, float:1.8480587E38)
            android.view.ViewGroup r16 = X.DbX.A0I(r2, r4)
            X.L7d r6 = r0.A09
            if (r6 != 0) goto L_0x00e2
            java.lang.String r0 = "nativeUiController"
            goto L_0x003b
        L_0x00e2:
            if (r5 == 0) goto L_0x0120
            X.UYH r1 = (X.UYH) r1
            X.WT1 r5 = r1.A02()
            X.WFq r10 = new X.WFq
            r10.<init>(r5)
            X.WFr r9 = new X.WFr
            r9.<init>(r1)
            X.WFs r8 = new X.WFs
            r8.<init>(r1)
            android.content.Context r18 = r1.requireContext()
            X.0eM r5 = r1.A0M
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r5)
            X.6dv r7 = r1.A04
            if (r7 == 0) goto L_0x03c8
            com.instagram.model.arads.ArAdsUIModel r5 = r1.A03()
            java.lang.String r5 = r5.A07
            if (r5 == 0) goto L_0x011d
            int r5 = r5.length()
            if (r5 == 0) goto L_0x011d
            X.VLA r11 = r1.A05
            if (r11 != 0) goto L_0x0137
            java.lang.String r0 = "arCommerceProductDeeplinkProvider"
            goto L_0x003b
        L_0x011d:
            r22 = 0
            goto L_0x0167
        L_0x0120:
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r13)
            X.6dv r5 = r0.A04
            if (r5 == 0) goto L_0x03c8
            r11 = 0
            X.A9C r1 = new X.A9C
            r12 = r11
            r8 = r5
            r9 = r6
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x017a
        L_0x0137:
            com.instagram.model.arads.ArAdsUIModel r5 = r1.A03()
            java.lang.String r5 = r5.A07
            if (r5 == 0) goto L_0x03cc
            java.lang.Integer r12 = r1.A04()
            X.5sJ r1 = r11.A00
            X.UKl r1 = r1.A00(r5)
            if (r1 == 0) goto L_0x019c
            X.QP5 r1 = r1.A00
            if (r1 == 0) goto L_0x019c
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x019c
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r1)
        L_0x0158:
            java.lang.String r5 = "effect_type"
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r12 != r1) goto L_0x0199
            java.lang.String r1 = "3D"
        L_0x0160:
            r11.put(r5, r1)
            java.lang.String r22 = r11.toString()
        L_0x0167:
            X.B1h[] r1 = new X.C41802B1h[]{r10, r9, r8}
            java.util.List r23 = X.0sr.A1P(r1)
            X.A9C r1 = new X.A9C
            r19 = r7
            r20 = r6
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
        L_0x017a:
            r0.A08 = r1
            X.6eP r1 = r1.A00
            r0.A02 = r1
            X.VM0 r8 = new X.VM0
            r8.<init>(r0)
            android.content.Context r15 = r0.requireContext()
            java.lang.String r22 = r0.getModuleName()
            X.A9C r7 = r0.A08
            if (r7 == 0) goto L_0x03c4
            X.6eP r6 = r0.A02
            if (r6 != 0) goto L_0x01a2
            java.lang.String r0 = "effectManagerFactory"
            goto L_0x003b
        L_0x0199:
            java.lang.String r1 = "AR"
            goto L_0x0160
        L_0x019c:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            goto L_0x0158
        L_0x01a2:
            X.VrM r5 = r0.A0K
            java.lang.Integer r21 = r0.A04()
            java.lang.String r9 = r0.A0G
            java.lang.String r1 = "back"
            boolean r1 = r1.equals(r9)
            r23 = r1 ^ 1
            X.A7p r14 = new X.A7p
            r18 = r5
            r19 = r8
            r20 = r7
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A01 = r14
            X.A7p r1 = r0.A01()
            X.AH4 r1 = r1.A03
            X.AUb r1 = r1.A09
            X.7tn r1 = X.C40161AUb.A00(r1)
            r1.EUU(r3)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r13)
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            java.lang.String r11 = r0.A0H
            if (r11 != 0) goto L_0x01e3
            java.lang.String r0 = "effectId"
            goto L_0x003b
        L_0x01e3:
            java.lang.String r12 = r0.A0I
            X.A7p r8 = r0.A01()
            X.WT1 r9 = r0.A02()
            X.WRp r5 = new X.WRp
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.A0A = r5
            X.VbB r1 = r0.A05
            if (r1 == 0) goto L_0x03c0
            r1.A02 = r3
            long r5 = android.os.SystemClock.uptimeMillis()
            r1.A01 = r5
            X.Vby r8 = r0.A06
            if (r8 != 0) goto L_0x0208
            java.lang.String r0 = "preCaptureUIController"
            goto L_0x003b
        L_0x0208:
            android.content.Context r5 = r0.requireContext()
            r1 = 2131437389(0x7f0b274d, float:1.8496675E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r2, r1)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r8.A04
            r7 = r6
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r7 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r7
            int r1 = r7.A05
            X.0nA.A0e(r9, r1)
            int r1 = r7.A03
            X.0nA.A0T(r9, r1)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r9, r4)
            X.AnonymousClass8LZ.A00(r1)
            r1 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r1)
            r1 = 18
            X.C18887WAz.A00(r4, r1, r8)
            r1 = 2131436540(0x7f0b23fc, float:1.8494953E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r1)
            r1 = 19
            X.C18887WAz.A00(r4, r1, r8)
            r4.setVisibility(r3)
            boolean r1 = r8.A07
            if (r1 != 0) goto L_0x0353
            r1 = 2131429417(0x7f0b0829, float:1.8480506E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r1)
            int r1 = r6.BQc()
            X.0nA.A0T(r4, r1)
            r1 = 2131429478(0x7f0b0866, float:1.848063E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r1)
            r4.setVisibility(r3)
            r1 = 22
            X.C18887WAz.A00(r4, r1, r8)
            r1 = 2131429428(0x7f0b0834, float:1.8480528E38)
            android.view.View r1 = r2.findViewById(r1)
            r7 = 0
            X.3oV r6 = X.2b1.A01(r1, r3, r3)
            android.view.View r4 = r6.getView()
            r1 = 2131441370(0x7f0b36da, float:1.850475E38)
            android.view.View r1 = r4.requireViewById(r1)
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r1
            r8.A01 = r1
            com.instagram.model.arads.ArAdsUIModel r9 = r8.A05
            java.lang.String r10 = r9.A04
            if (r10 == 0) goto L_0x02b3
            if (r1 == 0) goto L_0x028b
            r1.setFormatIcon(r7)
        L_0x028b:
            android.view.View r4 = r6.getView()
            r1 = 2131441372(0x7f0b36dc, float:1.8504754E38)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = X.DbU.A0X(r4, r1)
            r8.A00 = r7
            if (r7 == 0) goto L_0x02b3
            com.instagram.common.typedurl.SimpleImageUrl r6 = new com.instagram.common.typedurl.SimpleImageUrl
            r6.<init>(r10)
            java.lang.String r4 = "ar_ads_camera"
            X.0xG r1 = new X.0xG
            r1.<init>(r4)
            r7.setUrl(r6, r1)
            r7.setVisibility(r3)
            X.WTJ r1 = new X.WTJ
            r1.<init>(r8, r3)
            r7.A0E = r1
        L_0x02b3:
            com.instagram.ui.widget.shutterbutton.ShutterButton r10 = r8.A01
            if (r10 == 0) goto L_0x02d3
            r4 = 1
            X.Agw r1 = new X.Agw
            r1.<init>(r8, r4)
            r10.setOnSingleTapCaptureListener(r1)
            X.WfE r1 = r8.A03
            r10.setOnRecordVideoListener(r1)
            X.8GY r1 = r8.A06
            r10.A0D = r1
            r6 = 60000(0xea60, double:2.9644E-319)
            r10.A08 = r6
            X.5zt r1 = r10.A0j
            r10.setShutterButtonRecordingStyle(r1)
        L_0x02d3:
            r1 = 2131443517(0x7f0b3f3d, float:1.8509104E38)
            X.3oV r1 = X.DbU.A0Y(r2, r1)
            android.view.View r11 = r1.getView()
            com.instagram.arads.ui.UserAttributionView r11 = (com.instagram.arads.ui.UserAttributionView) r11
            java.lang.String r10 = r9.A01
            java.lang.String r7 = r9.A00
            java.lang.String r1 = "ar_ads_camera"
            X.0xG r6 = new X.0xG
            r6.<init>(r1)
            r4 = 20
            X.WAz r1 = new X.WAz
            r1.<init>(r8, r4)
            r11.setAttribution(r10, r7, r6, r1)
            r1 = 2131428111(0x7f0b030f, float:1.8477857E38)
            X.3oV r7 = X.DbU.A0Y(r2, r1)
            android.view.View r6 = r7.getView()
            com.instagram.arads.ui.FooterView r6 = (com.instagram.arads.ui.FooterView) r6
            java.lang.String r4 = r9.A03
            java.lang.String r1 = r9.A02
            r6.setFooterText(r4, r1)
            android.view.View r4 = r7.getView()
            r1 = 21
            X.C18887WAz.A00(r4, r1, r8)
            android.view.View r6 = r7.getView()
            com.instagram.arads.ui.FooterView r6 = (com.instagram.arads.ui.FooterView) r6
            r1 = 2130970335(0x7f0406df, float:1.7549377E38)
            int r7 = X.AnonymousClass7TF.A03(r5, r1)
            r1 = 2131099910(0x7f060106, float:1.7812187E38)
            int r8 = r5.getColor(r1)
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            int r9 = r5.getColor(r1)
            r1 = 2131100338(0x7f0602b2, float:1.7813055E38)
            int r10 = r5.getColor(r1)
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            X.W4O r5 = new X.W4O
            r5.<init>(r6, r7, r8, r9, r10)
            r1.addUpdateListener(r5)
            r4 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r4)
            r4 = 3000(0xbb8, double:1.482E-320)
            r1.setStartDelay(r4)
            r1.start()
        L_0x0353:
            r1 = 2131428093(0x7f0b02fd, float:1.847782E38)
            android.view.View r4 = r2.findViewById(r1)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            X.0qQ.A0A(r4)
            r1 = 2131624116(0x7f0e00b4, float:1.8875403E38)
            r4.setLayoutResource(r1)
            X.WUQ r5 = new X.WUQ
            r5.<init>(r4)
            r0.A0D = r5
            X.0eM r1 = r5.A02
            java.lang.Object r4 = r1.getValue()
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r4 = (com.instagram.ui.widget.bubblespinner.BubbleSpinner) r4
            X.8YA r1 = X.AnonymousClass8YA.LOADING
            r4.setLoadingStatus(r1)
            X.0eM r1 = r5.A01
            X.DbW.A1R(r1, r3)
            r1 = 2131428110(0x7f0b030e, float:1.8477855E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r2, r1)
            X.VbB r1 = r0.A05
            if (r1 == 0) goto L_0x03c0
            X.0qQ.A0B(r6, r3)
            com.instagram.common.session.UserSession r5 = r1.A04
            X.3Dp r4 = X.C238833Dp.A00(r5)
            X.0qQ.A07(r4)
            X.3Ds r0 = X.C238863Ds.AR_ADS_CTA
            r4.A05(r6, r0)
            X.1E8 r0 = X.1E7.A00(r5)
            java.lang.String r2 = r1.A06
            X.1Xj r3 = r0.A02(r2)
            if (r3 == 0) goto L_0x03b2
            X.WWd r2 = r1.A03
            r1 = 0
            X.3e7 r0 = new X.3e7
            r0.<init>(r1, r5, r3, r2)
            r4.A0A(r6, r0)
        L_0x03b1:
            return
        L_0x03b2:
            if (r2 == 0) goto L_0x03b1
            java.lang.String r1 = "ArAdsMetricsLoggerImpl"
            java.lang.String r0 = "Unable to get Media from cache for mediaId:"
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0wb.A03(r1, r0)
            return
        L_0x03c0:
            java.lang.String r0 = "arAdsMetricsLogger"
            goto L_0x003b
        L_0x03c4:
            java.lang.String r0 = "renderProvider"
            goto L_0x003b
        L_0x03c8:
            java.lang.String r0 = "userflowLogger"
            goto L_0x003b
        L_0x03cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15331Uag.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r1 == 0) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C15331Uag r6, java.io.File r7, java.lang.String r8) {
        /*
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "ad_impression_client_token"
            java.lang.String r2 = r1.getString(r0)
            X.28D r1 = r6.A0J
            java.lang.String r0 = "camera_entry_point"
            r5.putSerializable(r0, r1)
            java.lang.String r1 = r7.getCanonicalPath()
            java.lang.String r0 = "preset_medium_file_path"
            r5.putString(r0, r1)
            java.lang.String r1 = r6.A0H
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "effectId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002d:
            java.lang.String r0 = "effect_id"
            r5.putString(r0, r1)
            java.lang.String r0 = "media_type"
            r5.putString(r0, r8)
            com.instagram.model.arads.ArAdsUIModel r0 = r6.A03()
            r4 = 0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x0047
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            r0 = r0 ^ 1
            r1 = r0 ^ 1
            java.lang.String r0 = "use_effect_attribution"
            r5.putBoolean(r0, r1)
            java.lang.String r0 = "ads_client_token"
            r5.putString(r0, r2)
            X.0eM r0 = r6.A0M
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r0 = 1469(0x5bd, float:2.059E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.AnonymousClass6W8.A02(r1, r5, r3, r2, r0)
            android.content.Context r0 = r6.getContext()
            r1.A0C(r0)
            X.DbT.A1K(r6)
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            r0.overridePendingTransition(r4, r4)
            return
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15331Uag.A00(X.Uag, java.io.File, java.lang.String):void");
    }

    public final C39749A7p A01() {
        C39749A7p a7p = this.A01;
        if (a7p != null) {
            return a7p;
        }
        0qQ.A0F("arCommerceCameraController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final WT1 A02() {
        AnonymousClass0eM r0;
        if (this instanceof UYH) {
            r0 = ((UYH) this).A0C;
        } else {
            r0 = this.A0O;
        }
        return (WT1) r0.getValue();
    }

    public final ArAdsUIModel A03() {
        ArAdsUIModel arAdsUIModel = this.A0E;
        if (arAdsUIModel != null) {
            return arAdsUIModel;
        }
        0qQ.A0F("arAdsUIModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer A04() {
        Integer num = this.A0F;
        if (num != null) {
            return num;
        }
        0qQ.A0F("cameraMode");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void beforeOnDestroy() {
        C17619VbB vbB = this.A05;
        if (vbB == null) {
            0qQ.A0F("arAdsMetricsLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!vbB.A02) {
            vbB.A02 = true;
            vbB.A00 += SystemClock.uptimeMillis() - vbB.A01;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(vbB.A04), "ar_ads_experience_close_fb4a");
        if (A0e.isSampled()) {
            String str = vbB.A05;
            if (str == null) {
                str = "";
            }
            A0e.AAJ(AnonymousClass000.A00(496), str);
            A0e.A8D("view_time", Double.valueOf((double) vbB.A00));
            A0e.Cgf();
        }
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0M);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-60089912);
        C15331Uag.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            AnonymousClass0eM r6 = this.A0M;
            this.A04 = C312146dt.A00(DbT.A0X(r6));
            this.A0G = bundle2.getString("device_position");
            this.A0H = JTP.A0m(bundle2, "effect_id");
            this.A0I = bundle2.getString(AnonymousClass000.A00(4093));
            ArAdsUIModel arAdsUIModel = (ArAdsUIModel) C320236s2.A00(bundle2, ArAdsUIModel.class, "ads_ui_model");
            0qQ.A0B(arAdsUIModel, 0);
            this.A0E = arAdsUIModel;
            TargetViewSizeProvider targetViewSizeProvider = (TargetViewSizeProvider) C320236s2.A00(bundle2, TargetViewSizeProvider.class, "ar_ads_target_view_size_provider");
            0qQ.A0B(targetViewSizeProvider, 0);
            this.A0C = targetViewSizeProvider;
            C297725sE.A00();
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            A8U a8u = this.A0L;
            ArAdsUIModel A032 = A03();
            TargetViewSizeProvider targetViewSizeProvider2 = this.A0C;
            if (targetViewSizeProvider2 != null) {
                AnonymousClass7TF.A1H(A0l, a8u);
                this.A06 = new C17667Vby(a8u, A0l, targetViewSizeProvider2, A032);
                this.A07 = new VRF(AnonymousClass7TE.A0l(r6), getModuleName());
                Integer num = AnonymousClass05K.A00;
                0qQ.A0B(num, 0);
                this.A0F = num;
                String string = bundle2.getString("ad_impression_client_token");
                String string2 = bundle2.getString("media_id");
                this.A0J = C13991Tnr.A09(bundle2, "camera_entry_point");
                C297725sE.A00();
                this.A05 = new C17619VbB(DbW.A0S(r6, 0), string, string2);
                WT1.A00(C16612Uy8.START_CAMERA_SESSION, A02());
                AnonymousClass0fD.A09(1400214970, A022);
                return;
            }
            0qQ.A0F("targetViewSizeProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(406924511, A022);
        throw A0y;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1775857265);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.arads_commerce_camera_fragment_layout, false);
        AnonymousClass0fD.A09(-428668303, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1262443387);
        super.onDestroy();
        C19256WRp wRp = this.A0A;
        if (wRp != null) {
            wRp.A0B.A03.A09.destroy();
            A02().A02(C16612Uy8.STOP_CAMERA_SESSION, "", (String) null);
            WT1 A023 = A02();
            long j = A023.A00;
            if (j != 0) {
                boolean z = A023.A04;
                1QP r2 = A023.A01;
                if (z) {
                    r2.flowAnnotate(j, TraceFieldType.ErrorCode, 0);
                    r2.flowAnnotate(A023.A00, AnonymousClass000.A00(34), "com.instagram.arfx.effect.arads");
                    long j2 = A023.A00;
                    String str = A023.A03;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    r2.flowAnnotate(j2, TraceFieldType.Error, str);
                    long j3 = A023.A00;
                    String str3 = A023.A02;
                    String str4 = A023.A03;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    String format = String.format("errorMessage: %s", C66581MXm.A1b(str2, 1));
                    0qQ.A07(format);
                    r2.flowEndFail(j3, str3, format);
                } else {
                    r2.flowEndSuccess(j);
                }
                A023.A00 = 0;
                A023.A04 = false;
                A023.A02 = "";
                A023.A03 = null;
            }
            AnonymousClass0fD.A09(-904497987, A022);
            return;
        }
        0qQ.A0F("cameraInitializationController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1827741603);
        super.onDestroyView();
        W2i w2i = this.A0B;
        if (w2i != null) {
            w2i.A0A.A02(w2i.A0B, C359188c9.class);
        }
        AnonymousClass0fD.A09(409527319, A022);
    }

    public final void onPause() {
        String str;
        int A022 = AnonymousClass0fD.A02(-651014221);
        C15331Uag.super.onPause();
        C17619VbB vbB = this.A05;
        if (vbB == null) {
            str = "arAdsMetricsLogger";
        } else {
            if (!vbB.A02) {
                vbB.A02 = true;
                vbB.A00 += SystemClock.uptimeMillis() - vbB.A01;
            }
            C19256WRp wRp = this.A0A;
            if (wRp != null) {
                wRp.A06 = false;
                AH4 ah4 = wRp.A0B.A03;
                int i = ah4.A00;
                if (i == 0) {
                    ah4.A0E.EES(ah4.A0H);
                } else if (i == 1) {
                    ah4.A09.A05(ah4.A0C);
                }
                ah4.A09.pause();
                AnonymousClass0fD.A09(-737878259, A022);
                return;
            }
            str = "cameraInitializationController";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1931907570);
        super.onResume();
        C17619VbB vbB = this.A05;
        if (vbB == null) {
            str = "arAdsMetricsLogger";
        } else {
            vbB.A02 = false;
            vbB.A01 = SystemClock.uptimeMillis();
            C19256WRp wRp = this.A0A;
            if (wRp != null) {
                wRp.A02((C17766Vfd) null, A04());
                Activity A032 = DbT.A03(this);
                this.A0M.getValue();
                C357628Yy.A00(A032);
                AnonymousClass0fD.A09(-1784610249, A022);
                return;
            }
            str = "cameraInitializationController";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-238785255);
        C15331Uag.super.onStart();
        C19256WRp wRp = this.A0A;
        if (wRp != null) {
            wRp.A07 = true;
            AnonymousClass0fD.A09(-2114626585, A022);
            return;
        }
        0qQ.A0F("cameraInitializationController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-450077923);
        C15331Uag.super.onStop();
        C19256WRp wRp = this.A0A;
        if (wRp != null) {
            wRp.A07 = false;
            wRp.A04 = false;
            AnonymousClass0fD.A09(-1998489947, A022);
            return;
        }
        0qQ.A0F("cameraInitializationController");
        throw AnonymousClass00P.createAndThrow();
    }
}
