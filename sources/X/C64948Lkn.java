package X;

import com.instagram.creation.base.ui.filterview.FilterViewContainer;

/* renamed from: X.Lkn  reason: case insensitive filesystem */
public final class C64948Lkn implements C66501MUf {
    public final FilterViewContainer A00;
    public final Integer A01;
    public final /* synthetic */ C59962JcV A02;

    public final void Drb(L02 l02) {
    }

    public final void Drc(C60060Jeb jeb) {
        0qQ.A0B(jeb, 0);
        C66534MVo A012 = C66568MWw.A01(jeb.A05);
        if (A012 != null && A012.CNG(jeb, C59962JcV.A01(this.A02).A04())) {
            Drd(jeb, false);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cb, code lost:
        r2 = X.JW1.A00(r1.A09);
        r1 = X.AnonymousClass7TE.A0e(r2.A0D, "ig_camera_ui_tool_click");
        X.JTO.A1O(r4, r1);
        X.JTP.A1H(r1);
        X.JTO.A1S(r1, X.C360918fM.A00(r2.A0E).A00());
        X.DbW.A15(r1, r2.A0C);
        X.JTP.A1F(r1);
        r1.Cgf();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Drd(X.C60060Jeb r11, boolean r12) {
        /*
            r10 = this;
            r8 = 0
            X.0qQ.A0B(r11, r8)
            X.Jez r7 = r11.A05
            X.MVo r4 = X.C66568MWw.A01(r7)
            if (r4 == 0) goto L_0x005e
            java.lang.Integer r6 = r10.A01
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r6 != r5) goto L_0x0025
            X.JcV r0 = r10.A02
            X.JcW r2 = X.C59962JcV.A01(r0)
            X.MWw r1 = r7.A01
            X.0qQ.A07(r1)
            X.MWw r0 = r2.A01
            if (r0 != 0) goto L_0x0023
            r2.A01 = r1
        L_0x0023:
            r2.A02 = r1
        L_0x0025:
            X.JcV r3 = r10.A02
            com.instagram.creation.base.ui.filterview.FilterViewContainer r0 = r10.A00
            boolean r4 = X.C59962JcV.A09(r11, r4, r0, r3, r12)
            if (r12 == 0) goto L_0x005e
            X.MWw r2 = r7.A01
            X.0qQ.A07(r2)
            java.lang.String r1 = "creationCameraSession"
            if (r6 != r5) goto L_0x00b8
            if (r4 == 0) goto L_0x005f
            X.82q r0 = r3.A0G
            if (r0 == 0) goto L_0x01f9
            boolean r1 = r0.COf()
            X.0eM r0 = r3.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.27r r6 = X.27p.A01(r0)
            if (r1 == 0) goto L_0x00ec
            X.28t r4 = X.28t.A05
            X.4yP r0 = r6.A0J()
            if (r0 == 0) goto L_0x005e
            X.JVj r5 = X.C59725JVj.POST_CAPTURE
            java.lang.String r7 = "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_TAP"
            r9 = r8
            X.27r.A03(r4, r5, r6, r7, r8, r9)
        L_0x005e:
            return
        L_0x005f:
            java.lang.String r7 = r2.getName()
            X.0qQ.A07(r7)
            X.0eM r6 = r3.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.LBx r1 = X.C63124Krs.A00(r0)
            r0 = 1
            r1.A00(r7, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.27r r5 = X.27p.A01(r0)
            int r4 = r2.BEU()
            java.util.List r0 = r3.A0V
            int r2 = X.C63126Kru.A00(r0, r4)
            X.4yP r0 = r5.A0J()
            if (r0 == 0) goto L_0x0093
            X.28t r1 = X.28t.A05
            X.JVj r0 = X.C59725JVj.POST_CAPTURE
            r5.A1A(r1, r0, r4, r2)
        L_0x0093:
            X.36X r0 = X.AnonymousClass36O.A0B
            if (r0 == 0) goto L_0x005e
            X.AnonymousClass36O.A0D = r7
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "filter_name"
            r8.put(r0, r7)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            X.36X r2 = X.AnonymousClass36O.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r1 = r0.A06
            r0 = 10
            X.00y.A0n(r0, r1)
            java.lang.String r6 = X.AnonymousClass36O.A0C
            java.lang.String r4 = "profile_picture_filter_clicked"
            goto L_0x0136
        L_0x00b8:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x005e
            if (r4 == 0) goto L_0x005e
            X.MVo r0 = r2.ArI()
            boolean r0 = r0 instanceof X.C64936Lkb
            if (r0 == 0) goto L_0x00fa
            X.82q r0 = r3.A0G
            if (r0 == 0) goto L_0x01f9
            boolean r1 = r0.COf()
            X.0eM r0 = r3.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.27r r6 = X.27p.A01(r0)
            X.4yP r0 = r6.A0J()
            if (r1 == 0) goto L_0x00e5
            if (r0 == 0) goto L_0x005e
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "FEED_LUX_CAROUSEL_TAP"
            goto L_0x00f6
        L_0x00e5:
            if (r0 == 0) goto L_0x005e
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "FEED_LUX_TAP"
            goto L_0x00f6
        L_0x00ec:
            X.4yP r0 = r6.A0J()
            if (r0 == 0) goto L_0x005e
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "FEED_COLOR_FILTER_STRENGTH_TAP"
        L_0x00f6:
            X.27r.A08(r1, r6, r0, r8)
            return
        L_0x00fa:
            X.36X r0 = X.AnonymousClass36O.A0B
            if (r0 == 0) goto L_0x005e
            java.lang.String r7 = r2.getName()
            X.0qQ.A07(r7)
            X.JcW r1 = X.C59962JcV.A01(r3)
            int r0 = r7.hashCode()
            switch(r0) {
                case -2146480813: goto L_0x01c1;
                case -1944197537: goto L_0x01b6;
                case -1711144999: goto L_0x01ab;
                case -1653340047: goto L_0x01a0;
                case -576502989: goto L_0x0195;
                case -576085517: goto L_0x018a;
                case -502302942: goto L_0x017f;
                case -19268257: goto L_0x0174;
                case 2181788: goto L_0x0169;
                case 65290051: goto L_0x015e;
                case 1309953370: goto L_0x0153;
                case 1762973682: goto L_0x0148;
                case 1956520879: goto L_0x013c;
                default: goto L_0x0110;
            }
        L_0x0110:
            X.AnonymousClass36O.A0E = r7
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            r0 = 4119(0x1017, float:5.772E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.put(r0, r7)
            X.0eM r0 = r3.A0i
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.36X r2 = X.AnonymousClass36O.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r0.A06
            r0 = 10
            X.00y.A0n(r0, r1)
            java.lang.String r6 = X.AnonymousClass36O.A0C
            java.lang.String r4 = "profile_picture_tool_clicked"
        L_0x0136:
            java.lang.String r5 = "photo_editing"
            X.C46653DiY.A00(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x013c:
            java.lang.String r0 = "Adjust"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.ADJUST_POSITION
            goto L_0x01cb
        L_0x0148:
            java.lang.String r0 = "Saturation"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.SATURATION
            goto L_0x01cb
        L_0x0153:
            java.lang.String r0 = "Vignette"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.VIGNETTE
            goto L_0x01cb
        L_0x015e:
            java.lang.String r0 = "Color"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.COLOR_ADJUST
            goto L_0x01cb
        L_0x0169:
            java.lang.String r0 = "Fade"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.FADE
            goto L_0x01cb
        L_0x0174:
            java.lang.String r0 = "Tilt Shift"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.TILT_SHIFT
            goto L_0x01cb
        L_0x017f:
            java.lang.String r0 = "Contrast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.CONTRAST
            goto L_0x01cb
        L_0x018a:
            java.lang.String r0 = "Sharpen"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.SHARPEN
            goto L_0x01cb
        L_0x0195:
            java.lang.String r0 = "Shadows"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.SHADOWS
            goto L_0x01cb
        L_0x01a0:
            java.lang.String r0 = "Brightness"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.BRIGHTNESS
            goto L_0x01cb
        L_0x01ab:
            java.lang.String r0 = "Warmth"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.TEMPERATURE
            goto L_0x01cb
        L_0x01b6:
            java.lang.String r0 = "Highlights"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.HIGHLIGHTS
            goto L_0x01cb
        L_0x01c1:
            java.lang.String r0 = "Structure"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0110
            X.80P r4 = X.AnonymousClass80P.STRUCTURE
        L_0x01cb:
            com.instagram.common.session.UserSession r0 = r1.A09
            X.JaN r2 = X.JW1.A00(r0)
            X.0wc r1 = r2.A0D
            java.lang.String r0 = "ig_camera_ui_tool_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.JTO.A1O(r4, r1)
            X.JTP.A1H(r1)
            com.instagram.common.session.UserSession r0 = r2.A0E
            X.8fN r0 = X.C360918fM.A00(r0)
            java.lang.String r0 = r0.A00()
            X.JTO.A1S(r1, r0)
            X.0iw r0 = r2.A0C
            X.DbW.A15(r1, r0)
            X.JTP.A1F(r1)
            r1.Cgf()
            goto L_0x0110
        L_0x01f9:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64948Lkn.Drd(X.Jeb, boolean):void");
    }

    public C64948Lkn(FilterViewContainer filterViewContainer, C59962JcV jcV, Integer num) {
        this.A02 = jcV;
        this.A00 = filterViewContainer;
        this.A01 = num;
    }
}
