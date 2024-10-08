package X;

/* renamed from: X.2ug  reason: invalid class name and case insensitive filesystem */
public final class C232932ug extends C232942uh {
    public final /* synthetic */ AnonymousClass2uE A00;

    public C232932ug(AnonymousClass2uE r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r7v14, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v65, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.72q] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0650, code lost:
        if (X.AnonymousClass2uE.A05(r0) != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x02ae, code lost:
        if (r14.A00.getName() == null) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x01c1, code lost:
        if (r3 != null) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0450  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(android.view.MotionEvent r45) {
        /*
            r44 = this;
            r0 = r44
            X.2uE r0 = r0.A00
            android.view.View r1 = r0.A04
            if (r1 != 0) goto L_0x01ce
            X.2uI r3 = r0.A0V
            android.content.Context r4 = r0.A0P
            r12 = 0
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r4)
            r1 = 2131628144(0x7f0e1070, float:1.8883572E38)
            r10 = 0
            android.view.View r11 = r2.inflate(r1, r12, r10)
            X.2s5 r5 = r3.A08
            X.72q r2 = new X.72q
            r2.<init>()
            r2.A03 = r11
            r1 = 2131435939(0x7f0b21a3, float:1.8493734E38)
            android.view.View r1 = r11.requireViewById(r1)
            r2.A02 = r1
            r1 = 2131435432(0x7f0b1fa8, float:1.8492706E38)
            android.view.View r1 = r11.requireViewById(r1)
            r2.A00 = r1
            r1 = 2131433987(0x7f0b1a03, float:1.8489775E38)
            android.view.View r1 = r11.requireViewById(r1)
            r2.A01 = r1
            r1 = 2131440205(0x7f0b324d, float:1.8502387E38)
            android.view.View r1 = r11.requireViewById(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            r2.A0D = r1
            r1 = 2131440157(0x7f0b321d, float:1.850229E38)
            android.view.View r3 = r11.requireViewById(r1)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            X.2eb r1 = new X.2eb
            r1.<init>(r3)
            r2.A0E = r1
            r1 = 2131440206(0x7f0b324e, float:1.8502389E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.A0B = r1
            r1 = 2131440202(0x7f0b324a, float:1.850238E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.A0C = r1
            android.widget.TextView r1 = r2.A0B
            android.text.TextPaint r3 = r1.getPaint()
            r1 = 1
            r3.setFakeBoldText(r1)
            r1 = 2131432559(0x7f0b146f, float:1.8486879E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r2.A04 = r1
            r1 = 2131432493(0x7f0b142d, float:1.8486745E38)
            android.view.View r3 = r11.requireViewById(r1)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            X.2eb r1 = new X.2eb
            r1.<init>(r3)
            r2.A0F = r1
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r1 = 2131435926(0x7f0b2196, float:1.8493708E38)
            android.view.View r9 = r11.requireViewById(r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r9 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r9
            r1 = 2131440201(0x7f0b3249, float:1.8502379E38)
            android.view.View r8 = r11.requireViewById(r1)
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
            android.view.View r7 = r2.A00
            com.instagram.ui.mediaactions.LikeActionView r7 = (com.instagram.ui.mediaactions.LikeActionView) r7
            r1 = 2131440180(0x7f0b3234, float:1.8502336E38)
            android.view.View r6 = r11.requireViewById(r1)
            com.instagram.ui.mediaactions.MediaActionsView r6 = (com.instagram.ui.mediaactions.MediaActionsView) r6
            r1 = 2131428271(0x7f0b03af, float:1.8478182E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.3TS r14 = new X.3TS
            r14.<init>((android.view.ViewStub) r1)
            r1 = 2131436016(0x7f0b21f0, float:1.849389E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.3v4 r3 = new X.3v4
            r3.<init>(r1, r10)
            r1 = 2131435899(0x7f0b217b, float:1.8493653E38)
            android.view.View r1 = r11.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.3v7 r31 = X.C256013v5.A00(r1)
            r1 = 3
            X.0qQ.A0B(r9, r1)
            r1 = 4
            X.0qQ.A0B(r8, r1)
            r1 = 5
            X.0qQ.A0B(r7, r1)
            r1 = 6
            X.0qQ.A0B(r6, r1)
            X.4EA r10 = new X.4EA
            r13 = r12
            r15 = r12
            r16 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r24 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            r30 = r12
            r32 = r8
            r33 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r37 = r12
            r38 = r12
            r39 = r12
            r40 = r12
            r41 = r7
            r42 = r6
            r43 = r9
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r2.A0G = r10
            r1 = 2131436641(0x7f0b2461, float:1.8495158E38)
            android.view.View r3 = r11.requireViewById(r1)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            X.52z r1 = new X.52z
            r1.<init>(r3)
            r2.A0H = r1
            X.4EA r1 = r2.A0G
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r1.A0T
            r1.setTag(r2)
            X.4EA r1 = r2.A0G
            com.instagram.feed.widget.IgProgressImageView r1 = r1.A0N
            r1.setPostProcessor(r5)
            X.4EA r1 = r2.A0G
            com.instagram.feed.widget.IgProgressImageView r1 = r1.A0N
            r1.A05()
            X.4EA r1 = r2.A0G
            com.instagram.feed.widget.IgProgressImageView r3 = r1.A0N
            X.3gz r1 = new X.3gz
            r1.<init>()
            r3.setProgressiveImageConfig(r1)
            r1 = 2131440147(0x7f0b3213, float:1.850227E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.A06 = r1
            r1 = 2131440146(0x7f0b3212, float:1.8502267E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.A05 = r1
            r1 = 2131440149(0x7f0b3215, float:1.8502273E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.A08 = r1
            r1 = 2131440151(0x7f0b3217, float:1.8502277E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.A09 = r1
            r1 = 2131440148(0x7f0b3214, float:1.8502271E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.A07 = r1
            r11.setTag(r2)
            r0.A04 = r11
            java.lang.String r3 = "Required value was null."
            java.lang.Object r2 = r11.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.peekmedia.PeekMediaViewBinder.Holder"
            X.0qQ.A0C(r2, r1)
            X.72q r2 = (X.C3254872q) r2
            r0.A09 = r2
            android.view.View r2 = r0.A04
            if (r2 == 0) goto L_0x0674
            r1 = 4
            r2.setVisibility(r1)
            android.view.ViewGroup r3 = r0.A06
            if (r3 != 0) goto L_0x01c3
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r4, r1)
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.ViewGroup r3 = X.C232972uk.A03(r4)
            r0.A06 = r3
            if (r3 == 0) goto L_0x01ce
        L_0x01c3:
            r1 = -1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r1)
            android.view.View r1 = r0.A04
            r3.addView(r1, r2)
        L_0x01ce:
            X.2cv r2 = r0.A07
            java.lang.String r9 = "Required value was null."
            if (r2 != 0) goto L_0x01de
            android.view.View r1 = r0.A05
            if (r1 == 0) goto L_0x01de
            X.2cv r2 = X.C324286z2.A00(r1)
            r0.A07 = r2
        L_0x01de:
            r22 = 0
            r1 = r22
            r0.A05 = r1
            if (r2 == 0) goto L_0x0672
            X.1Xj r1 = r0.A07()
            com.instagram.common.session.UserSession r2 = r0.A0T
            r4 = 0
            r8 = 1
            X.0qQ.A0B(r2, r8)
            com.instagram.user.model.User r1 = r1.A2A(r2)
            if (r1 == 0) goto L_0x0672
            X.2cv r1 = r0.A07
            if (r1 == 0) goto L_0x01fe
            r1.CNi(r0)
        L_0x01fe:
            X.2cv r1 = r0.A07
            if (r1 == 0) goto L_0x0205
            r1.setFocusable(r8)
        L_0x0205:
            r0.A0F = r8
            X.2uI r5 = r0.A0V
            android.view.View r6 = r0.A04
            if (r6 == 0) goto L_0x066c
            X.1Xj r3 = r0.A07()
            X.3TO r21 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
            X.1Xj r1 = r0.A07()
            X.3W1 r10 = r0.BQr(r1)
            boolean r1 = r0.A0d
            r20 = r1
            int r1 = r0.A0N
            r39 = r1
            int r1 = r0.A0M
            r38 = r1
            boolean r1 = r0.A0c
            r19 = r1
            X.1Xj r1 = r0.A07()
            boolean r1 = X.2R8.A02(r2, r1)
            if (r1 == 0) goto L_0x0259
            boolean r1 = X.AnonymousClass2uE.A06(r0)
            if (r1 != 0) goto L_0x0259
            X.1Xj r1 = r0.A07()
            boolean r1 = X.C321566uO.A00(r2, r1)
            if (r1 != 0) goto L_0x0259
            X.6x4 r1 = r0.A0A
            if (r1 == 0) goto L_0x0632
            boolean r1 = r1.CZH()
            if (r1 != r8) goto L_0x0632
            X.1Xj r1 = r0.A07()
            boolean r1 = X.GLX.A02(r2, r1)
            if (r1 == 0) goto L_0x0632
        L_0x0259:
            r18 = 1
        L_0x025b:
            java.lang.Object r1 = r6.getTag()
            r1.getClass()
            X.72q r1 = (X.C3254872q) r1
            android.content.Context r11 = r6.getContext()
            X.1Xy r6 = r3.A0C
            com.instagram.user.model.User r15 = r6.B9t()
            java.lang.String r17 = ""
            r6 = 8
            if (r15 == 0) goto L_0x0574
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r1.A0D
            r7.setVisibility(r6)
            X.2eb r7 = r1.A0E
            r7.A03(r4)
            android.view.View r14 = r7.A01()
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            X.0Pl r13 = X.0Pl.A04(r11, r2)
            android.content.Context r12 = r5.A07
            java.lang.String r7 = r0.getModuleName()
            android.graphics.drawable.Drawable r7 = r13.A08(r12, r3, r7)
            r14.setImageDrawable(r7)
            android.widget.TextView r12 = r1.A0B
            java.lang.String r7 = r15.getUsername()
        L_0x029b:
            r12.setText(r7)
            r16 = 0
        L_0x02a0:
            com.instagram.model.venue.Venue r14 = r3.A23()
            if (r14 == 0) goto L_0x02b0
            com.instagram.model.venue.LocationDictIntf r7 = r14.A00
            java.lang.String r7 = r7.getName()
            r30 = 1
            if (r7 != 0) goto L_0x02b2
        L_0x02b0:
            r30 = 0
        L_0x02b2:
            boolean r12 = r3.A5l()
            boolean r7 = r3.A4j()
            if (r7 == 0) goto L_0x04fb
            android.widget.TextView r12 = r1.A0C
            r12.setVisibility(r4)
            r12.setSingleLine(r8)
            r13 = 2131963210(0x7f132d4a, float:1.9563167E38)
            com.instagram.user.model.User r7 = r3.A2A(r2)
            r7.getClass()
            java.lang.String r7 = r7.getUsername()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r7 = r11.getString(r13, r7)
            r12.setText(r7)
        L_0x02dd:
            boolean r12 = r3.A5P()
            X.2eb r7 = r1.A0F
            if (r12 == 0) goto L_0x04f6
            r7.A03(r4)
        L_0x02e8:
            X.4EA r7 = r1.A0G
            com.instagram.ui.widget.framelayout.MediaFrameLayout r13 = r7.A0T
            float r12 = X.A0A.A00(r3)
            r13.A00 = r12
            X.3fS r12 = r5.A00
            if (r12 != 0) goto L_0x02fd
            X.3fS r12 = new X.3fS
            r12.<init>(r2)
            r5.A00 = r12
        L_0x02fd:
            X.3fX r11 = r12.A00(r11, r3)
            com.instagram.feed.widget.IgProgressImageView r12 = r7.A0N
            X.C247843h0.A00(r0, r11, r12)
            com.instagram.ui.mediaactions.MediaActionsView r14 = r7.A0S
            X.4Jd r13 = r5.A01
            if (r13 != 0) goto L_0x0313
            X.4Jd r13 = new X.4Jd
            r13.<init>(r2)
            r5.A01 = r13
        L_0x0313:
            r11 = r17
            X.9IB r13 = r13.A00(r3, r11)
            r11 = r21
            X.AnonymousClass4Je.A00(r13, r10, r12, r14, r11)
            boolean r11 = r3.A5G()
            if (r11 == 0) goto L_0x04e9
            X.1Xy r11 = r3.A0C
            X.1sQ r11 = r11.getClipsMetadata()
            if (r11 == 0) goto L_0x04e9
            X.52z r11 = r1.A0H
            if (r11 == 0) goto L_0x04e9
            X.1Xy r13 = r3.A0C
            X.1sQ r15 = r13.getClipsMetadata()
            r15.getClass()
            com.instagram.api.schemas.MusicInfo r14 = r15.BUr()
            com.instagram.api.schemas.OriginalSoundDataIntf r13 = r15.BZB()
            java.lang.String r26 = X.AnonymousClass3ZJ.A04(r14, r13)
            com.instagram.api.schemas.MusicInfo r14 = r15.BUr()
            com.instagram.api.schemas.OriginalSoundDataIntf r13 = r15.BZB()
            java.lang.String r27 = X.AnonymousClass3ZJ.A03(r14, r13)
            boolean r36 = X.C263304Kd.A03(r15)
            boolean r13 = r26.isEmpty()
            if (r13 == 0) goto L_0x0361
            boolean r13 = r27.isEmpty()
            if (r13 != 0) goto L_0x039a
        L_0x0361:
            r28 = 2131165216(0x7f070020, float:1.7944643E38)
            boolean r30 = X.AnonymousClass3ZJ.A0A(r15)
            boolean r31 = X.AnonymousClass3ZJ.A0B(r15)
            X.1rp r25 = r15.AZY()
            com.instagram.api.schemas.OriginalSoundDataIntf r13 = r15.BZB()
            X.9Ie r24 = X.AnonymousClass3ZJ.A00(r13)
            X.4Ke r13 = new X.4Ke
            r23 = r13
            r29 = r4
            r32 = r4
            r33 = r8
            r34 = r8
            r35 = r4
            r37 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r11.getClass()
            r14 = r22
            X.C263314Kg.A04(r2, r14, r11, r13)
            X.GAM r11 = r11.A04
            if (r11 == 0) goto L_0x039a
            r11.A01()
        L_0x039a:
            X.3W1 r13 = r7.A04
            if (r13 == 0) goto L_0x03b0
            if (r13 == r10) goto L_0x03b0
            com.instagram.ui.mediaactions.LikeActionView r11 = r7.A0R
            r13.A0V(r11)
            X.3W1 r13 = r7.A04
            X.3TS r11 = r7.A01
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r11 = r11.A01()
            r13.A0S(r11)
        L_0x03b0:
            r7.A04 = r10
            X.3TS r15 = r7.A01
            boolean r14 = r3.A6W(r2)
            r13 = 2
            X.9IQ r11 = new X.9IQ
            r7 = r22
            r11.<init>(r7, r13, r4, r14)
            X.C250563lf.A0f(r11, r15, r10)
            android.content.Context r23 = r12.getContext()
            android.content.res.Resources r24 = r12.getResources()
            r25 = r0
            r26 = r2
            r27 = r3
            r28 = r7
            r29 = r4
            java.lang.StringBuilder r7 = X.C246673ez.A01(r23, r24, r25, r26, r27, r28, r29)
            r12.setContentDescription(r7)
            android.widget.ImageView r12 = r1.A06
            X.0q2 r7 = X.0q2.A00(r2)
            boolean r7 = r7.A0N(r3)
            r12.setSelected(r7)
            X.0q2 r7 = X.0q2.A00(r2)
            boolean r11 = r7.A0N(r3)
            android.content.Context r10 = r5.A07
            r7 = 2131964931(0x7f133403, float:1.9566658E38)
            if (r11 == 0) goto L_0x03fb
            r7 = 2131964944(0x7f133410, float:1.9566684E38)
        L_0x03fb:
            java.lang.String r7 = r10.getString(r7)
            r12.setContentDescription(r7)
            if (r19 == 0) goto L_0x04e2
            X.3QO r10 = r3.A1t()
            X.3QO r7 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r10 == r7) goto L_0x04e2
            boolean r7 = r3.A5M()
            if (r7 != 0) goto L_0x04e2
            boolean r7 = r3.A5Z()
            if (r7 != 0) goto L_0x04e2
            android.widget.ImageView r7 = r1.A09
            r7.setVisibility(r4)
        L_0x041d:
            android.widget.ImageView r7 = r1.A08
            if (r20 == 0) goto L_0x04d8
            r7.setVisibility(r6)
            boolean r3 = r3.A4c()
            if (r3 != 0) goto L_0x04db
            android.widget.ImageView r3 = r1.A05
            r3.setVisibility(r4)
        L_0x042f:
            android.widget.ImageView r7 = r1.A07
            if (r18 != 0) goto L_0x0435
            r16 = 8
        L_0x0435:
            r3 = r16
            r7.setVisibility(r3)
            android.view.View r3 = r1.A03
            android.view.ViewTreeObserver r11 = r3.getViewTreeObserver()
            X.IE0 r10 = new X.IE0
            r7 = r39
            r3 = r38
            r10.<init>(r1, r5, r7, r3)
            r11.addOnGlobalLayoutListener(r10)
            android.view.View r10 = r0.A04
            if (r10 == 0) goto L_0x0666
            boolean r7 = r0.A0H
            android.app.Activity r5 = r0.A0O
            android.view.ViewGroup r3 = r0.A06
            if (r3 != 0) goto L_0x0467
            android.content.Context r3 = r0.A0P
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r3, r1)
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.ViewGroup r3 = X.C232972uk.A03(r3)
            r0.A06 = r3
        L_0x0467:
            if (r7 == 0) goto L_0x04d1
            if (r3 == 0) goto L_0x065a
            X.0qQ.A0B(r5, r4)
            r1 = 3
            android.graphics.drawable.BitmapDrawable r1 = X.C232972uk.A01(r5, r3, r1)
        L_0x0473:
            r10.setBackgroundDrawable(r1)
            X.72q r4 = r0.A09
            if (r4 == 0) goto L_0x0654
            android.view.View r3 = r4.A02
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r3.setScaleX(r1)
            r3.setScaleY(r1)
            android.view.View r3 = r4.A00
            r1 = 4
            r3.setVisibility(r1)
            android.view.View r3 = r4.A01
            r3.setVisibility(r6)
            r1 = 0
            r3.setAlpha(r1)
            X.2ud r5 = r0.A0W
            X.1Xj r4 = r0.A07()
            int r3 = r0.A01
            int r1 = r0.A00
            r5.A01(r4, r3, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0.A0C = r1
            X.1Xj r4 = r0.A07()
            int r1 = r0.A00
            X.1Xj r3 = r4.A1c(r1)
            if (r3 != 0) goto L_0x04b2
            r3 = r4
        L_0x04b2:
            boolean r1 = r3.CeS()
            if (r1 == 0) goto L_0x04d0
            X.3WR r4 = r3.CEL()
            android.content.Context r3 = r0.A0P
            java.lang.String r1 = r0.getModuleName()
            X.4U8 r0 = new X.4U8
            r0.<init>(r3, r2, r4, r1)
            r0.A02 = r8
            X.4U9 r0 = r0.A00()
            X.AnonymousClass4UA.A00(r0)
        L_0x04d0:
            return r8
        L_0x04d1:
            if (r3 == 0) goto L_0x0660
            android.graphics.drawable.BitmapDrawable r1 = X.C232972uk.A00(r5, r3)
            goto L_0x0473
        L_0x04d8:
            r7.setVisibility(r4)
        L_0x04db:
            android.widget.ImageView r3 = r1.A05
            r3.setVisibility(r6)
            goto L_0x042f
        L_0x04e2:
            android.widget.ImageView r7 = r1.A09
            r7.setVisibility(r6)
            goto L_0x041d
        L_0x04e9:
            X.52z r11 = r1.A0H
            if (r11 == 0) goto L_0x039a
            android.view.ViewGroup r11 = r11.A01
            if (r11 == 0) goto L_0x039a
            r11.setVisibility(r6)
            goto L_0x039a
        L_0x04f6:
            r7.A03(r6)
            goto L_0x02e8
        L_0x04fb:
            if (r12 == 0) goto L_0x0537
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            X.JVF.A00(r0, r2, r3, r7)
            android.content.Context r13 = r5.A07
            boolean r12 = r3.A5l()
            java.util.List r7 = r3.A3Q()
            android.text.SpannableStringBuilder r13 = X.C49946FGa.A01(r13, r7, r12)
            android.widget.TextView r7 = r1.A0C
            r7.setVisibility(r4)
            r7.setSingleLine(r8)
            r7.setText(r13)
            android.view.ViewTreeObserver r12 = r7.getViewTreeObserver()
            X.IE3 r7 = new X.IE3
            r23 = r7
            r24 = r13
            r25 = r2
            r26 = r1
            r27 = r5
            r28 = r3
            r29 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.addOnPreDrawListener(r7)
            goto L_0x02dd
        L_0x0537:
            android.widget.TextView r13 = r1.A0C
            if (r30 == 0) goto L_0x056a
            r13.setVisibility(r4)
            r14.getClass()
            com.instagram.model.venue.LocationDictIntf r7 = r14.A00
            java.lang.String r7 = r7.getName()
            r13.setText(r7)
            java.lang.Integer r12 = r3.A2M()
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            if (r12 == r7) goto L_0x0567
            java.lang.Integer r12 = r3.A2M()
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            if (r12 != r7) goto L_0x02dd
            boolean r7 = r3.A4m()
            if (r7 != 0) goto L_0x0567
            int r7 = r5.A06
        L_0x0562:
            r13.setTextColor(r7)
            goto L_0x02dd
        L_0x0567:
            int r7 = r5.A02
            goto L_0x0562
        L_0x056a:
            r13.setVisibility(r6)
            android.widget.TextView r7 = r1.A0A
            X.0nA.A0O(r7)
            goto L_0x02dd
        L_0x0574:
            boolean r7 = r3.A4b()
            if (r7 == 0) goto L_0x05d3
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r1.A0D
            r7.setVisibility(r6)
            X.2eb r7 = r1.A0E
            r7.A03(r4)
            android.view.View r14 = r7.A01()
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            X.0Pl r13 = X.0Pl.A04(r11, r2)
            android.content.Context r12 = r5.A07
            java.lang.String r7 = r0.getModuleName()
            android.graphics.drawable.Drawable r7 = r13.A07(r12, r3, r7)
            r14.setImageDrawable(r7)
            java.util.List r7 = r3.A3l(r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r7)
            int r28 = r7.size()
            r7 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r7 = X.2Yu.A0H(r11, r7)
            int r29 = r11.getColor(r7)
            r23 = r11
            r24 = r2
            r25 = r22
            r26 = r22
            r27 = r12
            r30 = r4
            r31 = r8
            r32 = r8
            X.3q3 r7 = X.AnonymousClass4i2.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            android.text.SpannableStringBuilder r7 = r7.A00()
            android.widget.TextView r12 = r1.A0B
            java.lang.String r7 = r7.toString()
            goto L_0x029b
        L_0x05d3:
            X.2eb r7 = r1.A0E
            r7.A03(r6)
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r1.A0D
            r16 = 0
            r14.setVisibility(r4)
            com.instagram.user.model.User r13 = r3.A2A(r2)
            r13.getClass()
            com.instagram.common.typedurl.ImageUrl r12 = r13.Bh3()
            X.3QO r15 = r3.A1t()
            X.3QO r7 = X.AnonymousClass3QO.OPAL
            if (r15 != r7) goto L_0x061c
            X.4Cl r7 = r13.A03
            X.4bl r7 = r7.BYD()
            if (r7 == 0) goto L_0x062a
            X.4Cl r7 = r13.A03
            X.4bl r7 = r7.BYD()
            java.lang.String r7 = r7.Bh8()
            if (r7 == 0) goto L_0x062a
            X.4Cl r7 = r13.A03
            X.4bl r7 = r7.BYD()
            java.lang.String r7 = r7.Bh8()
            android.net.Uri r12 = X.0cp.A03(r7)
            X.0qQ.A0B(r12, r4)
            r7 = -1
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.C253833rU.A00(r12, r7, r7)
        L_0x061c:
            r14.setUrl(r12, r0)
            android.widget.TextView r12 = r1.A0B
            java.lang.String r7 = r13.getUsername()
            r12.setText(r7)
            goto L_0x02a0
        L_0x062a:
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r7 = r17
            r12.<init>(r7)
            goto L_0x061c
        L_0x0632:
            X.6x4 r1 = r0.A0A
            if (r1 == 0) goto L_0x064a
            boolean r1 = r1.CZI()
            if (r1 != r8) goto L_0x064a
            X.GIr r7 = X.C52200GIr.A00
            X.1Xj r1 = r0.A07()
            boolean r1 = r7.A02(r2, r1)
            if (r1 == 0) goto L_0x064a
            goto L_0x0259
        L_0x064a:
            boolean r1 = X.AnonymousClass2uE.A05(r0)
            r18 = 0
            if (r1 == 0) goto L_0x025b
            goto L_0x0259
        L_0x0654:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x065a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0660:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0666:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x066c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0672:
            r0 = 0
            return r0
        L_0x0674:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232932ug.A0A(android.view.MotionEvent):boolean");
    }
}
