package X;

/* renamed from: X.LZp  reason: case insensitive filesystem */
public final class C64315LZp implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64315LZp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, X.Jf6, android.view.ViewGroup] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x033d, code lost:
        if (r0.A04 == false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x035b, code lost:
        if (r0.A04 == false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0174, code lost:
        if (r9 != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f6, code lost:
        X.C60280Jib.A00(r4, new X.C59675JTg(r4, (X.AnonymousClass4D7) null, 11), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0202, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0203, code lost:
        X.0qQ.A0F("seriesAdapter");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r27) {
        /*
            r26 = this;
            r5 = r26
            r3 = r27
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02d1;
                case 1: goto L_0x02a4;
                case 2: goto L_0x019e;
                case 3: goto L_0x0113;
                case 4: goto L_0x0378;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.Juc r3 = (X.C60980Juc) r3
            java.lang.Object r6 = r5.A02
            X.K4Q r6 = (X.K4Q) r6
            java.lang.Object r5 = r5.A01
            android.view.View r5 = (android.view.View) r5
            X.0eM r4 = r6.A02
            java.lang.Object r0 = r4.getValue()
            X.LCT r0 = (X.LCT) r0
            X.2Fj r0 = r0.A00
            java.lang.Object r10 = r0.A02()
            X.Juc r10 = (X.C60980Juc) r10
            if (r10 == 0) goto L_0x020a
            r9 = 2131437504(0x7f0b27c0, float:1.8496909E38)
            android.view.ViewGroup r0 = X.DbS.A0E(r5, r9)
            r0.removeAllViews()
            java.util.List r0 = r10.A0C
            java.util.Iterator r17 = r0.iterator()
            r8 = 0
            r11 = 0
        L_0x0037:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x020a
            java.lang.Object r12 = r17.next()
            int r16 = r11 + 1
            if (r11 >= 0) goto L_0x004d
            X.0sr.A1T()
        L_0x0048:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004d:
            X.58p r12 = (X.C2815858p) r12
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L_0x010f
            X.Jf6 r7 = new X.Jf6
            r7.<init>(r1)
            r0 = 2131626132(0x7f0e0894, float:1.8879492E38)
            android.view.View r1 = android.view.View.inflate(r1, r0, r7)
            r0 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.widget.ImageView r0 = X.DbS.A0G(r1, r0)
            r7.A01 = r0
            r0 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.igds.components.button.IgdsButton r0 = (com.instagram.igds.components.button.IgdsButton) r0
            r7.A02 = r0
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r0 = r1.findViewById(r0)
            r7.A00 = r0
            java.util.HashMap r0 = r10.A0B
            java.lang.String r1 = r12.A02
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00f8
            java.util.HashMap r0 = r10.A0A
            java.lang.Object r14 = r0.get(r1)
            java.lang.String r14 = (java.lang.String) r14
            com.instagram.api.schemas.LiveUserPaySupportTier r0 = r12.A01
            java.lang.Integer r0 = X.LKL.A00(r0, r8)
            if (r0 == 0) goto L_0x00a3
            int r1 = r0.intValue()
            android.widget.ImageView r0 = r7.A01
            r0.setImageResource(r1)
        L_0x00a3:
            android.widget.ImageView r13 = r7.A01
            r15 = 32
            r0 = 2131965409(0x7f1335e1, float:1.9567627E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r1 = X.002.A0T(r2, r1, r15)
            r13.setContentDescription(r1)
            if (r14 == 0) goto L_0x00c8
            android.widget.ImageView r13 = r7.A01
            java.lang.String r1 = X.K4Q.A00(r2, r14)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.002.A0T(r1, r0, r15)
            r13.setContentDescription(r0)
        L_0x00c8:
            long r0 = r12.A00
            java.lang.String r23 = java.lang.String.valueOf(r0)
            java.lang.String r13 = r10.A05
            com.instagram.igds.components.button.IgdsButton r0 = r7.A02
            r0.setText((java.lang.String) r2)
            if (r14 == 0) goto L_0x00e0
            com.instagram.igds.components.button.IgdsButton r1 = r7.A02
            java.lang.String r0 = X.K4Q.A00(r2, r14)
            r1.setContentDescription(r0)
        L_0x00e0:
            com.instagram.igds.components.button.IgdsButton r1 = r7.A02
            X.LXj r0 = new X.LXj
            r22 = r2
            r24 = r13
            r25 = r8
            r19 = r12
            r20 = r6
            r21 = r7
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00f8:
            android.view.View r2 = r7.A00
            java.util.List r0 = r10.A0C
            int r1 = X.C51966G9m.A06(r0)
            r0 = 0
            if (r11 != r1) goto L_0x0105
            r0 = 8
        L_0x0105:
            r2.setVisibility(r0)
            android.view.ViewGroup r0 = X.DbS.A0E(r5, r9)
            r0.addView(r7)
        L_0x010f:
            r11 = r16
            goto L_0x0037
        L_0x0113:
            java.util.List r3 = (java.util.List) r3
            r8 = 0
            X.0qQ.A0B(r3, r8)
            java.lang.Object r4 = r5.A01
            X.Jib r4 = (X.C60280Jib) r4
            X.K1d r0 = r4.A07
            java.lang.String r0 = r0.A03
            java.lang.String r6 = X.LQM.A02(r0)
            X.0qQ.A07(r6)
            boolean r9 = r3 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0139
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0139
        L_0x0132:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0177
            return
        L_0x0139:
            java.util.Iterator r7 = r3.iterator()
        L_0x013d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r7.next()
            X.Lfy r1 = (X.C64672Lfy) r1
            java.lang.String r0 = r1.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.Integer r0 = r1.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r0 != r2) goto L_0x013d
            java.lang.Object r0 = r5.A02
            X.K6o r0 = (X.C61417K6o) r0
            X.JlN r1 = r0.A01
            if (r1 == 0) goto L_0x0203
            java.util.List r0 = r1.A07
            r0.clear()
            r1.notifyDataSetChanged()
            java.lang.Integer r0 = r1.A01
            if (r0 == r2) goto L_0x03dd
            r1.A01 = r2
            r1.A00(r8)
            r1.notifyDataSetChanged()
            return
        L_0x0174:
            if (r9 == 0) goto L_0x0177
            goto L_0x0132
        L_0x0177:
            java.util.Iterator r2 = r3.iterator()
        L_0x017b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03dd
            java.lang.Object r1 = r2.next()
            X.Lfy r1 = (X.C64672Lfy) r1
            java.lang.String r0 = r1.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x017b
            java.lang.Integer r1 = r1.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x01f6
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x01f6
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x017b
            goto L_0x01f6
        L_0x019e:
            java.util.List r1 = X.JTQ.A0i(r3)
            java.lang.Object r4 = r5.A02
            X.K6o r4 = (X.C61417K6o) r4
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01b1
            return
        L_0x01b1:
            java.util.Iterator r3 = r1.iterator()
        L_0x01b5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03dd
            java.lang.Object r0 = r3.next()
            X.1qJ r0 = (X.1qJ) r0
            X.JlN r1 = r4.A01
            if (r1 == 0) goto L_0x0203
            X.1Xj r0 = r0.A00
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x0373
            java.util.List r1 = r1.A07
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01da
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01da
            goto L_0x01b5
        L_0x01da:
            java.util.Iterator r1 = r1.iterator()
        L_0x01de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r1.next()
            X.LrL r0 = (X.C65322LrL) r0
            java.lang.String r0 = r0.A07
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01de
            java.lang.Object r4 = r5.A01
            X.Jib r4 = (X.C60280Jib) r4
        L_0x01f6:
            r2 = 0
            r0 = 11
            X.JTg r1 = new X.JTg
            r1.<init>(r4, r2, r0)
            r0 = 1
            X.C60280Jib.A00(r4, r1, r0)
            return
        L_0x0203:
            java.lang.String r0 = "seriesAdapter"
            X.0qQ.A0F(r0)
            goto L_0x0048
        L_0x020a:
            boolean r0 = r3.A0D
            r2 = 0
            r1 = 8
            if (r0 == 0) goto L_0x0214
            r1 = 0
            r2 = 8
        L_0x0214:
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            X.C51967G9n.A0x(r5, r0, r1)
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            X.C51967G9n.A0x(r5, r0, r2)
            r0 = 2131437504(0x7f0b27c0, float:1.8496909E38)
            X.C51967G9n.A0x(r5, r0, r2)
            r3 = 2131433893(0x7f0b19a5, float:1.8489585E38)
            X.C51967G9n.A0x(r5, r3, r2)
            java.lang.Object r0 = r4.getValue()
            X.LCT r0 = (X.LCT) r0
            X.2Fj r0 = r0.A00
            java.lang.Object r4 = r0.A02()
            X.Juc r4 = (X.C60980Juc) r4
            if (r4 == 0) goto L_0x03dd
            r0 = 2131438519(0x7f0b2bb7, float:1.8498967E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.JTO.A0Y(r5, r0)
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r4.A00
            if (r0 == 0) goto L_0x024e
            r1.setUrl(r0, r6)
        L_0x024e:
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r5, r0)
            java.lang.String r0 = r4.A09
            r1.setText(r0)
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r5, r0)
            java.lang.String r0 = r4.A02
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r0)
            java.lang.String r0 = r4.A01
            X.DbV.A1D(r1, r0)
            android.content.Context r0 = r2.getContext()
            X.DbY.A12(r2, r0)
            r2.setText(r1)
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            if (r7 == 0) goto L_0x03dd
            X.0eM r0 = r6.A03
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            android.view.View r3 = X.AnonymousClass7TE.A0b(r5, r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r2 = r4.A06
            java.lang.String r10 = r4.A07
            X.2EG r9 = X.2EG.A2L
            java.lang.String r1 = r4.A08
            X.C51974G9v.A1P(r8, r3, r2, r10)
            r0 = 6
            X.0qQ.A0B(r1, r0)
            int r11 = X.DbV.A02(r7)
            X.ESs r6 = new X.ESs
            r6.<init>((android.app.Activity) r7, (com.instagram.common.session.UserSession) r8, (X.2EG) r9, (java.lang.String) r10, (int) r11)
            X.AnonymousClass7AV.A07(r6, r3, r1, r2)
            return
        L_0x02a4:
            java.lang.Object r4 = r5.A01
            X.8BA r4 = (X.AnonymousClass8BA) r4
            java.lang.Object r0 = r5.A02
            X.82b r0 = (X.C3498482b) r0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r0.A03
            r2 = 1
            if (r0 == 0) goto L_0x02bb
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A1s
            r0.setHapticFeedbackEnabled(r2)
            r0.performHapticFeedback(r2)
        L_0x02bb:
            X.8Cb r0 = r4.A1G
            r1 = 8
            X.3oV r0 = r0.A01
            r0.setVisibility(r1)
            boolean r1 = r3.booleanValue()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A1s
            if (r1 == 0) goto L_0x02cd
            r2 = 0
        L_0x02cd:
            X.AnonymousClass91L.A06(r0, r2)
            return
        L_0x02d1:
            r6 = 0
            X.0qQ.A0B(r3, r6)
            java.lang.Object r4 = r5.A02
            X.JW7 r4 = (X.JW7) r4
            java.lang.Object r7 = r5.A01
            android.app.Activity r7 = (android.app.Activity) r7
            X.8H1 r0 = r4.A10
            com.instagram.common.gallery.Medium r1 = r0.A00
            java.lang.String r2 = "GalleryPickerView"
            r10 = 0
            if (r1 != 0) goto L_0x02ec
            java.lang.String r0 = "No video medium found for Feed Destination Switch"
        L_0x02e8:
            X.0kD.A0A(r2, r0, r10)
            return
        L_0x02ec:
            X.Kha r0 = X.C62544Kha.FEED_POST
            if (r3 != r0) goto L_0x0346
            boolean r0 = r1.CeS()
            if (r0 != 0) goto L_0x03dd
            int r0 = r1.A03
            long r7 = (long) r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 60
            long r2 = r0.toMillis(r2)
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x030c
            int r2 = r1.A03
            r0 = 900500(0xdbd94, float:1.261869E-39)
            if (r2 <= r0) goto L_0x03dd
        L_0x030c:
            android.content.Context r5 = r4.getContext()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r7 = X.0mE.A01(r5, r0)
            android.app.Activity r7 = (android.app.Activity) r7
            X.JYp r3 = X.C59796JYp.A00(r1, r6)
            X.7IH r2 = new X.7IH
            r2.<init>(r5)
            r0 = 1
            boolean r0 = X.ABQ.A01(r3, r2, r0, r6)
            if (r0 == 0) goto L_0x03dd
            com.instagram.common.session.UserSession r9 = r4.A0z
            java.util.List r14 = X.AnonymousClass7TE.A1I(r1)
            com.instagram.creation.base.CreationSession r0 = X.JWE.A00(r4)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r11 = r0.A0B
            X.28D r8 = X.28D.A15
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L_0x033f
            boolean r0 = r0.A04
            r15 = 1
            if (r0 != 0) goto L_0x0340
        L_0x033f:
            r15 = 0
        L_0x0340:
            r12 = r10
            r13 = r10
            X.C250563lf.A0L(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0346:
            X.Kha r0 = X.C62544Kha.CLIPS
            if (r3 != r0) goto L_0x0367
            com.instagram.creation.base.CreationSession r0 = X.JWE.A00(r4)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r11 = r0.A0B
            com.instagram.common.session.UserSession r9 = r4.A0z
            X.28D r8 = r4.A0q
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L_0x035d
            boolean r0 = r0.A04
            r15 = 1
            if (r0 != 0) goto L_0x035e
        L_0x035d:
            r15 = 0
        L_0x035e:
            r0 = 3
            X.C51973G9u.A0r(r0, r9, r7, r8)
            java.util.List r14 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x0340
        L_0x0367:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Selected to switch to an unsupported destination type: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            goto L_0x02e8
        L_0x0373:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0378:
            X.Jtp r3 = (X.C60931Jtp) r3
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x03dd
            java.util.ArrayList r0 = r3.A01
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x03dd
            java.lang.Object r7 = r5.A02
            X.K7d r7 = (X.C61428K7d) r7
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x03dd
            java.lang.Integer r0 = r7.A05
            if (r0 == 0) goto L_0x03e3
            int r6 = r0.intValue()
            java.lang.Object r4 = r5.A01
            android.view.View r4 = (android.view.View) r4
            r0 = 2131442312(0x7f0b3a88, float:1.850666E38)
            android.view.View r3 = r4.findViewById(r0)
            X.61u r3 = (X.C3021461u) r3
            r0 = 0
            r3.setVisibility(r0)
            r0 = 2131953607(0x7f1307c7, float:1.954369E38)
            java.lang.String r2 = r7.getString(r0)
            r1 = 3
            X.LXI r0 = new X.LXI
            r0.<init>(r6, r1, r7)
            r3.setPrimaryAction(r2, r0)
            X.0eM r0 = r7.A0E
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x03de
            X.Kgw r1 = r7.A04
            X.Kgw r0 = X.C62506Kgw.POST_LIVE
            if (r1 != r0) goto L_0x03dd
        L_0x03c5:
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x03dd
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x03dd
            r1 = 1
            X.37F r0 = (X.AnonymousClass37F) r0
            X.Pzn r0 = r0.A0D
            if (r0 == 0) goto L_0x03dd
            r0.A0I(r1)
        L_0x03dd:
            return
        L_0x03de:
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x03dd
            goto L_0x03c5
        L_0x03e3:
            java.lang.String r0 = "Missing supporters count for thank you story sticker"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64315LZp.onChanged(java.lang.Object):void");
    }
}
