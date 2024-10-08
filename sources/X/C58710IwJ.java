package X;

/* renamed from: X.IwJ  reason: case insensitive filesystem */
public final class C58710IwJ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58710IwJ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C58710IwJ(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58710IwJ(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01da, code lost:
        r0 = (int) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x002a;
                case 2: goto L_0x004f;
                case 3: goto L_0x0063;
                case 4: goto L_0x006d;
                case 5: goto L_0x0083;
                case 6: goto L_0x008f;
                case 7: goto L_0x00b0;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00eb;
                case 10: goto L_0x0105;
                case 11: goto L_0x012b;
                case 12: goto L_0x0151;
                case 13: goto L_0x016b;
                case 14: goto L_0x0174;
                case 15: goto L_0x017e;
                case 16: goto L_0x0190;
                case 17: goto L_0x019a;
                case 18: goto L_0x01b6;
                case 19: goto L_0x01dc;
                case 20: goto L_0x01e6;
                case 21: goto L_0x01f2;
                case 22: goto L_0x020f;
                case 23: goto L_0x021f;
                case 24: goto L_0x0229;
                case 25: goto L_0x0005;
                case 26: goto L_0x0233;
                case 27: goto L_0x0005;
                case 28: goto L_0x023d;
                case 29: goto L_0x0005;
                case 30: goto L_0x0247;
                case 31: goto L_0x0005;
                case 32: goto L_0x0251;
                case 33: goto L_0x0005;
                case 34: goto L_0x025b;
                case 35: goto L_0x027f;
                case 36: goto L_0x02a3;
                case 37: goto L_0x02b3;
                case 38: goto L_0x000e;
                case 39: goto L_0x02cf;
                case 40: goto L_0x02d6;
                case 41: goto L_0x02dd;
                case 42: goto L_0x02e7;
                case 43: goto L_0x02fa;
                case 44: goto L_0x0310;
                case 45: goto L_0x0373;
                case 46: goto L_0x037a;
                case 47: goto L_0x0373;
                case 48: goto L_0x037a;
                case 49: goto L_0x0385;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.0lg r0 = (X.0lg) r0
            X.1QP r2 = X.AnonymousClass1QO.A00(r0)
            return r2
        L_0x000e:
            java.lang.Object r2 = r10.A01
            return r2
        L_0x0011:
            java.lang.Object r0 = r10.A01
            X.Gcr r0 = (X.C52800Gcr) r0
            android.content.Context r0 = r0.A07
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r1 = 1061158912(0x3f400000, float:0.75)
            r0 = 0
            X.6KL r2 = X.AnonymousClass6KK.A00(r1, r2, r0)
            return r2
        L_0x002a:
            r4 = 2
            float[] r0 = new float[r4]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r3 = r10.A01
            X.Gcr r3 = (X.C52800Gcr) r3
            X.C51969G9p.A10(r2)
            r0 = 700(0x2bc, double:3.46E-321)
            r2.setDuration(r0)
            r0 = -1
            r2.setRepeatCount(r0)
            r0 = 1
            r2.setRepeatMode(r0)
            r2.addListener(r3)
            X.I84.A01(r2, r3, r4)
            return r2
        L_0x004f:
            X.2cs r2 = X.AnonymousClass7TF.A0J()
            r3 = 1
            r2.A06 = r3
            java.lang.Object r0 = r10.A01
            X.IIp r0 = (X.C56945IIp) r0
            r2.A0A(r0)
            r0 = 0
            r2.A08(r0, r3)
            return r2
        L_0x0063:
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            X.Gcr r2 = new X.Gcr
            r2.<init>(r0)
            return r2
        L_0x006d:
            java.lang.Object r0 = r10.A01
            com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView r0 = (com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView) r0
            X.Gcg r1 = r0.getLoadingDrawable()
            X.Gcr r0 = r0.getForeGroundDrawable()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r1, r0}
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
            return r2
        L_0x0083:
            java.lang.Object r0 = r10.A01
            com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView r0 = (com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView) r0
            android.graphics.Bitmap r0 = r0.A00
            X.Gcg r2 = new X.Gcg
            r2.<init>(r0)
            return r2
        L_0x008f:
            float[] r0 = X.C51965G9l.A1b()
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r3 = r10.A01
            X.Gcp r3 = (X.C52798Gcp) r3
            X.C51969G9p.A10(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            android.animation.Animator$AnimatorListener r0 = r3.A05
            r2.addListener(r0)
            r0 = 3
            X.I84.A01(r2, r3, r0)
            return r2
        L_0x00b0:
            float[] r0 = X.C51965G9l.A1b()
            r0 = {1053609165, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r3 = r10.A01
            X.Gcp r3 = (X.C52798Gcp) r3
            X.C51969G9p.A10(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            android.animation.Animator$AnimatorListener r0 = r3.A05
            r2.addListener(r0)
            r0 = 4
            X.I84.A01(r2, r3, r0)
            return r2
        L_0x00d1:
            float[] r0 = X.C51965G9l.A1b()
            r0 = {0, 1053609165} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r3 = r10.A01
            X.C51969G9p.A10(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r0 = 5
            X.I84.A01(r2, r3, r0)
            return r2
        L_0x00eb:
            float[] r0 = X.C51965G9l.A1b()
            r0 = {1065353216, 1053609165} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r3 = r10.A01
            X.C51969G9p.A10(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r0 = 6
            X.I84.A01(r2, r3, r0)
            return r2
        L_0x0105:
            r3 = 1
            android.graphics.Paint r2 = X.AnonymousClass7TE.A0V(r3)
            java.lang.Object r1 = r10.A01
            X.Gcp r1 = (X.C52798Gcp) r1
            int r0 = r1.A03
            r2.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r0)
            r2.setAntiAlias(r3)
            r0 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r0)
            float r0 = r1.A04
            r2.setStrokeWidth(r0)
            return r2
        L_0x012b:
            X.2cs r2 = X.AnonymousClass7TF.A0J()
            r2.A03()
            r5 = 1
            r2.A06 = r5
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0 = 4625759767262920704(0x4032000000000000, double:18.0)
            X.2co r0 = X.C71392co.A04(r3, r0)
            r2.A09(r0)
            java.lang.Object r3 = r10.A01
            r1 = 2
            X.K0E r0 = new X.K0E
            r0.<init>(r3, r1)
            r2.A0A(r0)
            r0 = 0
            r2.A08(r0, r5)
            return r2
        L_0x0151:
            float[] r0 = X.C51965G9l.A1b()
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r3 = r10.A01
            X.C51969G9p.A10(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r0 = 7
            X.I84.A01(r2, r3, r0)
            return r2
        L_0x016b:
            java.lang.Object r0 = r10.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r2 = r0.A00()
            return r2
        L_0x0174:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HDY r2 = new X.HDY
            r2.<init>(r0)
            return r2
        L_0x017e:
            java.lang.Object r0 = r10.A01
            X.HkO r0 = (X.C55603HkO) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328555671535017(0x8110a100013da9, double:3.03766311780636E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x0190:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HDb r2 = new X.HDb
            r2.<init>(r0)
            return r2
        L_0x019a:
            java.lang.Object r0 = r10.A01
            X.HDb r0 = (X.C54429HDb) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36610030648301534(0x8210a1000217de, double:3.2156690265222626E-306)
            long r5 = X.182.A01(r2, r3, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01da
            r0 = 10
            goto L_0x01d5
        L_0x01b6:
            java.lang.Object r4 = r10.A01
            X.HDb r4 = (X.C54429HDb) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36610030648170461(0x8210a1000017dd, double:3.2156690264393715E-306)
            long r5 = X.182.A01(r2, r3, r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01da
            X.0eM r0 = r4.A02
            int r0 = X.DbX.A07(r0)
        L_0x01d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x01da:
            int r0 = (int) r5
            goto L_0x01d5
        L_0x01dc:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hze r2 = new X.Hze
            r2.<init>(r0)
            return r2
        L_0x01e6:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131428032(0x7f0b02c0, float:1.8477697E38)
            X.2eb r2 = X.DbY.A0S(r1, r0)
            return r2
        L_0x01f2:
            java.lang.Object r0 = r10.A01
            X.GKf r0 = (X.C52238GKf) r0
            java.util.Set r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01fc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020c
            java.lang.Object r0 = r1.next()
            X.4h7 r0 = (X.C270674h7) r0
            r0.D3s()
            goto L_0x01fc
        L_0x020c:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x020f:
            java.lang.Object r3 = r10.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317972872697559(0x810701000a16d7, double:3.030970513208041E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x021f:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Lj0 r2 = new X.Lj0
            r2.<init>(r0)
            return r2
        L_0x0229:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hhx r2 = new X.Hhx
            r2.<init>(r0)
            return r2
        L_0x0233:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hng r2 = new X.Hng
            r2.<init>(r0)
            return r2
        L_0x023d:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HkP r2 = new X.HkP
            r2.<init>(r0)
            return r2
        L_0x0247:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HkQ r2 = new X.HkQ
            r2.<init>(r0)
            return r2
        L_0x0251:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HsP r2 = new X.HsP
            r2.<init>(r0)
            return r2
        L_0x025b:
            java.lang.Object r0 = r10.A01
            X.H8K r0 = (X.H8K) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.8Eg r0 = X.AnonymousClass8Eg.RETINA_FACE_FACIAL_LANDMARKS
            X.8CI r0 = X.C352658Eh.A00(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.8CO r1 = new X.8CO
            r1.<init>(r2, r0)
            X.83h r0 = com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader.Companion
            com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader r0 = r0.A00(r2)
            r0.fetchAllModules()
            X.Hlr r2 = new X.Hlr
            r2.<init>(r1)
            return r2
        L_0x027f:
            java.lang.Object r0 = r10.A01
            X.H8K r0 = (X.H8K) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.8Eg r0 = X.AnonymousClass8Eg.RETINA_FACE
            X.8CI r0 = X.C352658Eh.A00(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.8CO r1 = new X.8CO
            r1.<init>(r2, r0)
            X.83h r0 = com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader.Companion
            com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader r0 = r0.A00(r2)
            r0.fetchAllModules()
            X.Hls r2 = new X.Hls
            r2.<init>(r1)
            return r2
        L_0x02a3:
            java.lang.Object r0 = r10.A01
            X.K8H r0 = (X.K8H) r0
            X.0eM r0 = r0.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBa r2 = new X.KBa
            r2.<init>(r0)
            return r2
        L_0x02b3:
            java.lang.Object r0 = r10.A01
            X.K8H r0 = (X.K8H) r0
            X.0eM r0 = r0.A0F
            X.2YL r4 = X.DbS.A0H(r0)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 18
            X.MG7 r0 = new X.MG7
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x02cf:
            java.lang.Object r0 = r10.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x02d6:
            java.lang.Object r0 = r10.A01
            X.07f r2 = X.DbY.A0I(r0)
            return r2
        L_0x02dd:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7a8 r2 = new X.7a8
            r2.<init>(r0)
            return r2
        L_0x02e7:
            java.lang.Object r2 = r10.A01
            X.HrN r2 = (X.C56015HrN) r2
            android.view.ViewStub r0 = r2.A0A
            r0.inflate()
            android.view.View r1 = r2.A07
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.Hnh r2 = new X.Hnh
            r2.<init>(r1, r0)
            return r2
        L_0x02fa:
            java.lang.Object r0 = r10.A01
            X.Ngk r0 = (X.C69186Ngk) r0
            X.0eM r0 = r0.A04
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315443136367840(0x8104b400010ce0, double:3.029370697766696E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x0310:
            java.lang.Object r2 = r10.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r0 = r2.requireContext()
            int r0 = X.2Yu.A07(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970224(0x7f040670, float:1.7549152E38)
            int r0 = X.2Yu.A0H(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 2131100318(0x7f06029e, float:1.7813014E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970227(0x7f040673, float:1.7549158E38)
            int r0 = X.2Yu.A0H(r1, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 2131099673(0x7f060019, float:1.7811706E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            int r0 = X.2Yu.A0H(r1, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r0 = X.2Yu.A0H(r1, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r3, r4, r5, r6, r7, r8, r9}
            java.util.List r2 = X.0sr.A1P(r0)
            return r2
        L_0x0373:
            java.lang.Object r0 = r10.A01
            X.07f r2 = X.C51971G9r.A0U(r0)
            return r2
        L_0x037a:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YM r2 = r0.getDefaultViewModelProviderFactory()
            return r2
        L_0x0385:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hi7 r2 = new X.Hi7
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58710IwJ.invoke():java.lang.Object");
    }
}
