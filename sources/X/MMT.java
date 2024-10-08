package X;

public final class MMT extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMT(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MMT(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x022b, code lost:
        if (r3.A0B(r1) != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0291, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0298, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x03de;
                case 1: goto L_0x03d9;
                case 2: goto L_0x03c6;
                case 3: goto L_0x03ba;
                case 4: goto L_0x03ae;
                case 5: goto L_0x03a0;
                case 6: goto L_0x0394;
                case 7: goto L_0x0384;
                case 8: goto L_0x0376;
                case 9: goto L_0x0005;
                case 10: goto L_0x0376;
                case 11: goto L_0x0005;
                case 12: goto L_0x0365;
                case 13: goto L_0x035c;
                case 14: goto L_0x0350;
                case 15: goto L_0x0328;
                case 16: goto L_0x0306;
                case 17: goto L_0x02de;
                case 18: goto L_0x02d5;
                case 19: goto L_0x0017;
                case 20: goto L_0x02b0;
                case 21: goto L_0x02a1;
                case 22: goto L_0x0287;
                case 23: goto L_0x0213;
                case 24: goto L_0x0192;
                case 25: goto L_0x03ec;
                case 26: goto L_0x0185;
                case 27: goto L_0x0178;
                case 28: goto L_0x016e;
                case 29: goto L_0x0164;
                case 30: goto L_0x015a;
                case 31: goto L_0x014b;
                case 32: goto L_0x011e;
                case 33: goto L_0x000c;
                case 34: goto L_0x010c;
                case 35: goto L_0x00f8;
                case 36: goto L_0x00ea;
                case 37: goto L_0x00dc;
                case 38: goto L_0x00ce;
                case 39: goto L_0x00b9;
                case 40: goto L_0x00aa;
                case 41: goto L_0x009c;
                case 42: goto L_0x0076;
                case 43: goto L_0x0069;
                case 44: goto L_0x0060;
                case 45: goto L_0x03ec;
                case 46: goto L_0x0059;
                case 47: goto L_0x0052;
                case 48: goto L_0x0044;
                case 49: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r0 = r15.A01
            X.JY9 r0 = (X.JY9) r0
            java.lang.String r4 = r0.A0V
            if (r4 != 0) goto L_0x000b
            java.lang.String r4 = ""
            return r4
        L_0x0017:
            java.lang.Object r0 = r15.A01
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.String r4 = r0.A03()
            if (r4 != 0) goto L_0x000b
            java.lang.String r0 = r0.A0X
            java.lang.String r4 = X.0mf.A00(r0)
            return r4
        L_0x0028:
            java.lang.Object r4 = r15.A01
            X.K5V r4 = (X.K5V) r4
            X.0eM r0 = r4.A0E
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r2 = r4.requireContext()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0gy r0 = X.AnonymousClass07i.A00(r4)
            X.KDq r4 = new X.KDq
            r4.<init>(r1, r2, r0, r3)
            return r4
        L_0x0044:
            java.lang.Object r0 = r15.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429978(0x7f0b0a5a, float:1.8481644E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x0052:
            java.lang.Object r0 = r15.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0059:
            java.lang.Object r0 = r15.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0060:
            java.lang.Object r1 = r15.A01
            r0 = 5
            X.Jm5 r4 = new X.Jm5
            r4.<init>(r1, r0)
            return r4
        L_0x0069:
            java.lang.Object r0 = r15.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 0
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r1, r0, r0)
            return r4
        L_0x0076:
            java.lang.Object r7 = r15.A01
            X.K5V r7 = (X.K5V) r7
            X.0eM r0 = r7.A0E
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r7.A0G
            java.lang.Object r10 = r0.getValue()
            X.JhU r10 = (X.C60211JhU) r10
            X.LNs r9 = r7.A03
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.07V r6 = r0.getLifecycle()
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            X.Jjl r4 = new X.Jjl
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x009c:
            java.lang.Object r0 = r15.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429975(0x7f0b0a57, float:1.8481638E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00aa:
            java.lang.Object r0 = r15.A01
            X.K5V r0 = (X.K5V) r0
            X.0eM r0 = r0.A0E
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1wS r4 = X.1wS.A01(r0)
            return r4
        L_0x00b9:
            java.lang.Object r0 = r15.A01
            X.K5V r0 = (X.K5V) r0
            X.0eM r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.1wS r0 = (X.1wS) r0
            int r0 = r0.A09()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x00ce:
            java.lang.Object r0 = r15.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429973(0x7f0b0a55, float:1.8481634E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00dc:
            java.lang.Object r0 = r15.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429972(0x7f0b0a54, float:1.8481632E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00ea:
            java.lang.Object r0 = r15.A01
            android.view.View r1 = X.JTO.A0G(r0)
            r0 = 2131429971(0x7f0b0a53, float:1.848163E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x00f8:
            java.lang.Object r2 = r15.A01
            X.K5V r2 = (X.K5V) r2
            X.0eM r0 = r2.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r2.requireContext()
            X.L3q r4 = new X.L3q
            r4.<init>(r1, r0)
            return r4
        L_0x010c:
            java.lang.Object r3 = r15.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323805437701652(0x810c4f00012e14, double:3.0346590508024834E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x011e:
            java.lang.Object r5 = r15.A01
            X.JY9 r5 = (X.JY9) r5
            com.instagram.common.session.UserSession r3 = r5.A18
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319806823079591(0x8108ac00001ea7, double:3.032130310814363E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0149
            r0 = 36601281799852163(0x8208ac00011083, double:3.210136219534095E-306)
            long r2 = X.182.A01(r2, r3, r0)
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            r0 = 1
            X.Ljp r1 = new X.Ljp
            r1.<init>(r5, r0)
            X.0mM r0 = new X.0mM
            r0.<init>(r4, r1, r2)
        L_0x0149:
            r4 = 0
            return r4
        L_0x014b:
            java.lang.Object r0 = r15.A01
            X.K6c r0 = (X.C61406K6c) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6tY r4 = X.C353578Ie.A00(r0)
            return r4
        L_0x015a:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8id r4 = new X.8id
            r4.<init>(r0)
            return r4
        L_0x0164:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8X6 r4 = new X.8X6
            r4.<init>(r0)
            return r4
        L_0x016e:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.JVm r4 = new X.JVm
            r4.<init>(r0)
            return r4
        L_0x0178:
            java.lang.Object r2 = r15.A01
            android.view.TextureView r2 = (android.view.TextureView) r2
            r1 = 36
            r0 = 64
            android.graphics.Bitmap r4 = r2.getBitmap(r1, r0)
            return r4
        L_0x0185:
            java.lang.Object r0 = r15.A01
            X.MRx r0 = (X.C66443MRx) r0
            boolean r0 = r0.Eyy()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0192:
            java.lang.Object r2 = r15.A01
            X.JW7 r2 = (X.JW7) r2
            com.instagram.common.session.UserSession r0 = r2.A0z
            X.JbO r1 = X.JZM.A00(r0)
            java.lang.String r0 = "button"
            X.C59899JbO.A04(r1, r0)
            boolean r0 = X.JW7.A0T(r2)
            if (r0 == 0) goto L_0x0202
            X.JW8 r0 = r2.A14
            X.JWM r0 = r0.A0F
            java.util.List r0 = r0.A0W
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.common.gallery.model.GalleryItem r6 = r2.A0B
            boolean r5 = X.AnonymousClass7TF.A1W(r0, r6)
            X.82q r4 = r2.A19
            X.514 r0 = r4.ANP()
            int r1 = r0.A01
            X.514 r3 = X.AnonymousClass514.SQUARE
            int r0 = r3.A01
            if (r1 != r0) goto L_0x01c7
            X.514 r3 = X.AnonymousClass514.ORIGINAL
        L_0x01c7:
            if (r6 == 0) goto L_0x01e2
            if (r5 == 0) goto L_0x01e2
            X.514 r0 = X.AnonymousClass514.ORIGINAL
            if (r3 != r0) goto L_0x01ff
            X.0qQ.A0A(r6)
            float r0 = X.JW7.A00(r6, r2)
            X.514 r0 = X.C63123Krr.A00(r0)
            float r1 = r0.A00
        L_0x01dc:
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r0 = r4.A01
            r0.A00 = r1
        L_0x01e2:
            r1 = 1
            X.JW7.A0D(r3, r2, r1)
            boolean r0 = X.JW7.A0T(r2)
            if (r0 != 0) goto L_0x01f4
            X.JW8 r0 = r2.A14
            X.JWM r0 = r0.A0F
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x01f7
        L_0x01f4:
            X.JW7.A0J(r2)
        L_0x01f7:
            X.6SR r0 = X.AnonymousClass6SR.A01()
            r0.A0R = r1
            goto L_0x02d2
        L_0x01ff:
            float r1 = r3.A00
            goto L_0x01dc
        L_0x0202:
            X.82q r0 = r2.A19
            X.514 r0 = r0.ANP()
            int r1 = r0.A01
            X.514 r3 = X.AnonymousClass514.SQUARE
            int r0 = r3.A01
            if (r1 != r0) goto L_0x01e2
            X.514 r3 = X.AnonymousClass514.FOUR_BY_FIVE
            goto L_0x01e2
        L_0x0213:
            java.lang.Object r7 = r15.A01
            X.8ZV r7 = (X.AnonymousClass8ZV) r7
            X.JWG r3 = r7.A03
            java.lang.String r2 = "dialogHelper"
            if (r3 == 0) goto L_0x0291
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r0 = r3.A0B(r1)
            if (r0 != 0) goto L_0x022d
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            boolean r0 = r3.A0B(r1)
            if (r0 == 0) goto L_0x0230
        L_0x022d:
            r3.A08(r1)
        L_0x0230:
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.JX9 r1 = X.JWX.A00(r0)
            java.util.List r0 = r1.A03
            r0.clear()
            r0 = 0
            r1.A01 = r0
            android.content.Context r3 = r7.getContext()
            com.instagram.common.session.UserSession r4 = r7.getSession()
            X.82q r6 = X.AnonymousClass8ZV.A00(r7)
            X.1ua r8 = r7.A0B
            if (r8 != 0) goto L_0x0253
            java.lang.String r2 = "pendingMediaManager"
            goto L_0x0291
        L_0x0253:
            r12 = 0
            r14 = 1
            X.JWG r5 = r7.A03
            if (r5 == 0) goto L_0x0291
            r0 = 21
            X.MMT r10 = new X.MMT
            r10.<init>(r7, r0)
            r0 = 22
            X.MMT r11 = new X.MMT
            r11.<init>(r7, r0)
            r0 = 2287(0x8ef, float:3.205E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            r13 = r12
            X.LPT.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.JaN r0 = X.JW1.A00(r0)
            r0.A01()
            X.4MS r0 = r7.A02
            if (r0 != 0) goto L_0x0283
            java.lang.String r2 = "stopwatch"
            goto L_0x0291
        L_0x0283:
            r0.A01()
            goto L_0x02d2
        L_0x0287:
            java.lang.Object r0 = r15.A01
            X.8ZV r0 = (X.AnonymousClass8ZV) r0
            X.JW7 r0 = r0.A06
            if (r0 != 0) goto L_0x0299
            java.lang.String r2 = "galleryPickerView"
        L_0x0291:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0299:
            X.JW8 r2 = r0.A14
            r1 = 0
            r0 = 1
            r2.A0L(r1, r0)
            goto L_0x02d2
        L_0x02a1:
            java.lang.Object r0 = r15.A01
            X.8ZV r0 = (X.AnonymousClass8ZV) r0
            X.M2L r2 = new X.M2L
            r2.<init>(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.11Z.A04(r2, r0)
            goto L_0x02d2
        L_0x02b0:
            java.lang.Object r1 = r15.A01
            X.8ZV r1 = (X.AnonymousClass8ZV) r1
            com.instagram.common.session.UserSession r0 = r1.getSession()
            X.27r r0 = X.27p.A01(r0)
            r0.A0V()
            X.0eM r0 = r1.A0J
            java.lang.Object r3 = r0.getValue()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r3
            X.28D r2 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.MK4 r0 = X.MK4.A00
            r3.A0D(r1, r2, r0)
        L_0x02d2:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x02d5:
            java.lang.Object r1 = r15.A01
            r0 = 0
            X.LZr r4 = new X.LZr
            r4.<init>(r1, r0)
            return r4
        L_0x02de:
            r0 = 1
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r0)
            java.lang.Object r0 = r15.A01
            X.8vJ r0 = (X.C369778vJ) r0
            android.content.Context r1 = r0.A0J
            r0 = 24
            float r0 = X.0nA.A04(r1, r0)
            r4.setTextSize(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r1)
            X.0qm r0 = X.0qm.A0W
            android.graphics.Typeface r0 = r1.A02(r0)
            r4.setTypeface(r0)
            return r4
        L_0x0306:
            r0 = 1
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r0)
            java.lang.Object r0 = r15.A01
            X.8vJ r0 = (X.C369778vJ) r0
            android.content.Context r1 = r0.A0J
            r0 = 24
            float r0 = X.0nA.A04(r1, r0)
            r4.setTextSize(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r0)
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0O(r1)
            r4.setTypeface(r0)
            return r4
        L_0x0328:
            r0 = 1
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r0)
            java.lang.Object r0 = r15.A01
            X.8vJ r0 = (X.C369778vJ) r0
            android.content.Context r1 = r0.A0J
            r0 = 2131100065(0x7f0601a1, float:1.78125E38)
            X.AnonymousClass7TE.A1N(r1, r4, r0)
            r0 = 14
            float r0 = X.0nA.A04(r1, r0)
            r4.setTextSize(r0)
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0N(r1)
            r4.setTypeface(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r0)
            return r4
        L_0x0350:
            java.lang.Object r0 = r15.A01
            X.Ll2 r0 = (X.C64963Ll2) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.LCS r4 = new X.LCS
            r4.<init>(r0)
            return r4
        L_0x035c:
            java.lang.Object r0 = r15.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r4 = r0.A00()
            return r4
        L_0x0365:
            java.lang.Object r0 = r15.A01
            X.LRF r0 = (X.LRF) r0
            androidx.fragment.app.Fragment r0 = r0.A0A
            X.860 r1 = X.JTS.A0N(r0)
            java.lang.String r0 = "post_capture"
            X.861 r4 = r1.A00(r0)
            return r4
        L_0x0376:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.app.Application r0 = X.DbY.A05(r0)
            X.KBe r4 = new X.KBe
            r4.<init>(r0)
            return r4
        L_0x0384:
            java.lang.Object r1 = r15.A01
            X.H0C r1 = (X.H0C) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8aR r4 = new X.8aR
            r4.<init>(r1, r0)
            return r4
        L_0x0394:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131431240(0x7f0b0f48, float:1.8484204E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x03a0:
            java.lang.Object r0 = r15.A01
            X.LE0 r0 = (X.LE0) r0
            android.content.Context r1 = r0.A01
            r0 = 2131237722(0x7f081b5a, float:1.8091702E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            return r4
        L_0x03ae:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131431523(0x7f0b1063, float:1.8484778E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x03ba:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131431239(0x7f0b0f47, float:1.8484202E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            return r4
        L_0x03c6:
            java.lang.Object r0 = r15.A01
            X.LDr r0 = (X.C63932LDr) r0
            android.content.Context r1 = r0.A00
            r0 = 2131886138(0x7f12003a, float:1.9406846E38)
            X.61R r4 = X.C303756Aq.A00(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.keyframes.renderer.KeyframesDrawable"
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x03d9:
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x03de:
            java.lang.Object r0 = r15.A01
            X.Ll7 r0 = (X.C64968Ll7) r0
            com.instagram.common.session.UserSession r1 = r0.A0I
            X.0iw r0 = r0.A0H
            X.8aR r4 = new X.8aR
            r4.<init>(r0, r1)
            return r4
        L_0x03ec:
            java.lang.Object r4 = r15.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMT.invoke():java.lang.Object");
    }
}
