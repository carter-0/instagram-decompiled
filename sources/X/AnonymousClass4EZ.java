package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.user.model.User;

/* renamed from: X.4EZ  reason: invalid class name */
public final class AnonymousClass4EZ extends C252633pQ {
    public C258103yT A00 = null;
    public final Context A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C243033Xd A05;
    public final AnonymousClass4DV A06;
    public final User A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4EZ(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, C243033Xd r7, AnonymousClass4DV r8, boolean z, boolean z2) {
        super(context);
        0qQ.A0B(context, 2);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r7, 5);
        0qQ.A0B(userSession, 6);
        User A002 = 0eE.A00(userSession).A00();
        this.A02 = fragmentActivity;
        this.A01 = context;
        this.A08 = z;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = userSession;
        this.A07 = A002;
        this.A09 = z2;
        this.A06 = r8;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.3TY] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4EA A06(android.view.View r67, X.AnonymousClass0iw r68) {
        /*
            r66 = this;
            r9 = 0
            r8 = 1
            r14 = r68
            X.0qQ.A0B(r14, r8)
            r0 = 2131435927(0x7f0b2197, float:1.849371E38)
            r7 = r67
            android.view.View r6 = r7.requireViewById(r0)
            X.0qQ.A07(r6)
            com.instagram.common.ui.base.IgFrameLayout r6 = (com.instagram.common.ui.base.IgFrameLayout) r6
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131435926(0x7f0b2196, float:1.8493708E38)
            android.view.View r31 = r7.requireViewById(r0)
            X.0qQ.A07(r31)
            r0 = r31
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r0
            r31 = r0
            r0 = 2131440201(0x7f0b3249, float:1.8502379E38)
            android.view.View r15 = r7.requireViewById(r0)
            X.0qQ.A07(r15)
            com.instagram.feed.widget.IgProgressImageView r15 = (com.instagram.feed.widget.IgProgressImageView) r15
            r0 = 2131435432(0x7f0b1fa8, float:1.8492706E38)
            android.view.View r5 = r7.requireViewById(r0)
            X.0qQ.A07(r5)
            com.instagram.ui.mediaactions.LikeActionView r5 = (com.instagram.ui.mediaactions.LikeActionView) r5
            r0 = 2131440180(0x7f0b3234, float:1.8502336E38)
            android.view.View r4 = r7.requireViewById(r0)
            X.0qQ.A07(r4)
            com.instagram.ui.mediaactions.MediaActionsView r4 = (com.instagram.ui.mediaactions.MediaActionsView) r4
            r0 = 2131437225(0x7f0b26a9, float:1.8496343E38)
            android.view.View r34 = r7.requireViewById(r0)
            r0 = 2131440176(0x7f0b3230, float:1.8502328E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.3yh r30 = new X.3yh
            r0 = r30
            r0.<init>(r1)
            r0 = 2131440207(0x7f0b324f, float:1.850239E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            com.instagram.tagging.widget.TagsLayout r1 = (com.instagram.tagging.widget.TagsLayout) r1
            X.3VD r29 = new X.3VD
            r0 = r29
            r0.<init>(r1)
            r10 = r66
            com.instagram.common.session.UserSession r3 = r10.A04
            r0 = 2131440203(0x7f0b324b, float:1.8502383E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            com.instagram.tagging.widget.MediaTagHintsLayout r1 = (com.instagram.tagging.widget.MediaTagHintsLayout) r1
            X.3VC r28 = new X.3VC
            r0 = r28
            r0.<init>(r3, r1)
            X.3V9 r27 = new X.3V9
            r1 = 2131440192(0x7f0b3240, float:1.850236E38)
            r0 = r27
            r0.<init>(r7, r3, r1)
            r1 = 2131440190(0x7f0b323e, float:1.8502356E38)
            X.3V9 r26 = new X.3V9
            r0 = r26
            r0.<init>(r7, r3, r1)
            r1 = 2131432770(0x7f0b1542, float:1.8487307E38)
            X.3V9 r25 = new X.3V9
            r0 = r25
            r0.<init>(r7, r3, r1)
            r1 = 2131440189(0x7f0b323d, float:1.8502354E38)
            X.3V9 r24 = new X.3V9
            r0 = r24
            r0.<init>(r7, r3, r1)
            r0 = 2131428271(0x7f0b03af, float:1.8478182E38)
            android.view.View r1 = r7.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.3TS r23 = new X.3TS
            r0 = r23
            r0.<init>((android.view.ViewStub) r1)
            r0 = 2131436016(0x7f0b21f0, float:1.849389E38)
            android.view.View r1 = r7.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.3v4 r22 = new X.3v4
            r0 = r22
            r0.<init>(r1, r9)
            r0 = 2131436050(0x7f0b2212, float:1.849396E38)
            android.view.View r1 = r7.findViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.0qQ.A0B(r1, r9)
            X.3yi r21 = new X.3yi
            r0 = r21
            r0.<init>((android.view.ViewStub) r1)
            r0 = 2131435159(0x7f0b1e97, float:1.8492152E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            X.3v9 r20 = new X.3v9
            r0 = r20
            r0.<init>(r1)
            r0 = 2131435899(0x7f0b217b, float:1.8493653E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.3v7 r53 = X.C256013v5.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 0
            if (r0 == 0) goto L_0x027b
            android.content.Context r0 = r10.A01
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r0)
            androidx.fragment.app.FragmentActivity r11 = r10.A02
            if (r11 != 0) goto L_0x012a
            boolean r11 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r11 == 0) goto L_0x027b
            r11 = r0
            androidx.fragment.app.FragmentActivity r11 = (androidx.fragment.app.FragmentActivity) r11
        L_0x012a:
            X.0iw r0 = r10.A03
            java.lang.String r0 = r0.getModuleName()
            X.2kQ r0 = X.C227942kP.A01(r0, r9, r9)
            X.2nI r11 = X.C229382nI.A01(r1, r11, r0, r3)
            r0 = r7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.0qQ.A0A(r12)
            X.3yq r52 = X.C56312HwP.A00(r12, r0, r11, r3)
        L_0x0142:
            r0 = 2131432759(0x7f0b1537, float:1.8487285E38)
            android.view.View r11 = r7.findViewById(r0)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            android.content.Context r0 = r10.A01
            r12 = 36324694495998201(0x810d1e000230f9, double:3.0352212948491714E-306)
            boolean r2 = X.182.A06(r2, r3, r12)
            if (r11 == 0) goto L_0x015d
            X.3v8 r1 = new X.3v8
            r1.<init>(r0, r11, r2)
        L_0x015d:
            X.3V8 r19 = new X.3V8
            r2 = r19
            r2.<init>(r7)
            r2 = 2131440652(0x7f0b340c, float:1.8503293E38)
            android.view.View r11 = r7.requireViewById(r2)
            X.0qQ.A07(r11)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            X.0qQ.A0B(r11, r9)
            X.3TW r18 = new X.3TW
            r2 = r18
            r2.<init>(r11, r14)
            r2 = 2131429070(0x7f0b06ce, float:1.8479802E38)
            android.view.View r11 = r7.requireViewById(r2)
            X.0qQ.A07(r11)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            X.0qQ.A0B(r11, r9)
            X.3TX r17 = new X.3TX
            r2 = r17
            r2.<init>(r11)
            r2 = 2131444110(0x7f0b418e, float:1.8510307E38)
            android.view.View r11 = r7.findViewById(r2)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            X.3V4 r16 = new X.3V4
            r2 = r16
            r2.<init>(r11)
            r2 = 2131436931(0x7f0b2583, float:1.8495746E38)
            android.view.View r12 = r7.requireViewById(r2)
            X.0qQ.A07(r12)
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            r2 = 2131432797(0x7f0b155d, float:1.8487362E38)
            android.view.View r11 = r7.requireViewById(r2)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            r2 = 2131432757(0x7f0b1535, float:1.848728E38)
            android.view.View r2 = r7.requireViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            X.3yj r14 = new X.3yj
            r14.<init>(r12, r11, r2)
            X.3VE r13 = new X.3VE
            r13.<init>(r7)
            androidx.fragment.app.FragmentActivity r2 = r10.A02
            X.3Ux r12 = new X.3Ux
            r12.<init>(r2, r0, r6, r3)
            r2 = 2131435957(0x7f0b21b5, float:1.849377E38)
            android.view.View r2 = r7.requireViewById(r2)
            X.0qQ.A07(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            X.0qQ.A0B(r2, r8)
            X.3TY r8 = new X.3TY
            r8.<init>()
            r8.A00 = r2
            r2 = 2131440201(0x7f0b3249, float:1.8502379E38)
            android.view.View r10 = r7.requireViewById(r2)
            X.0qQ.A07(r10)
            X.3yo r2 = new X.3yo
            r2.<init>(r10, r3)
            r3 = 2131436343(0x7f0b2337, float:1.8494554E38)
            android.view.View r11 = r7.requireViewById(r3)
            X.0qQ.A07(r11)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            r3 = 2131436338(0x7f0b2332, float:1.8494544E38)
            android.view.View r10 = r7.requireViewById(r3)
            X.0qQ.A07(r10)
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            r3 = 2131436340(0x7f0b2334, float:1.8494548E38)
            android.view.View r3 = r7.requireViewById(r3)
            X.0qQ.A07(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            X.3yp r47 = new X.3yp
            r35 = r47
            r36 = r0
            r37 = r7
            r38 = r11
            r39 = r10
            r40 = r3
            r35.<init>(r36, r37, r38, r39, r40)
            r0 = 2131441054(0x7f0b359e, float:1.8504109E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.3oV r40 = X.2b1.A01(r0, r9, r9)
            r0 = 2131433617(0x7f0b1891, float:1.8489025E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.instagram.common.ui.base.IgView r0 = (com.instagram.common.ui.base.IgView) r0
            X.4EA r32 = new X.4EA
            r41 = r8
            r42 = r2
            r43 = r18
            r44 = r19
            r45 = r14
            r46 = r20
            r48 = r1
            r49 = r16
            r50 = r21
            r51 = r12
            r54 = r15
            r55 = r30
            r56 = r28
            r57 = r27
            r58 = r26
            r59 = r25
            r60 = r24
            r61 = r29
            r62 = r13
            r63 = r5
            r64 = r4
            r65 = r31
            r33 = r7
            r35 = r17
            r36 = r23
            r37 = r6
            r38 = r0
            r39 = r22
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            return r32
        L_0x027b:
            r52 = r1
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EZ.A06(android.view.View, X.0iw):X.4EA");
    }

    public static final void A00(UserSession userSession, AnonymousClass4DU r17, AnonymousClass4JV r18, C246613et r19, AnonymousClass4EZ r20, AnonymousClass4EA r21, AnonymousClass3W1 r22) {
        C246613et r10 = r19;
        AnonymousClass3W1 r7 = r22;
        UserSession userSession2 = userSession;
        boolean A0F = 1sx.A0F(userSession2, r10.A08.A01, r7);
        AnonymousClass4EA r8 = r21;
        AnonymousClass3VF r13 = r8.A0Q;
        AnonymousClass3V9 r6 = r13.A01;
        AnonymousClass4EZ r9 = r20;
        AnonymousClass4JV r11 = r18;
        if (r6 != null) {
            if (A0F) {
                View view = r8.itemView;
                0qQ.A06(view);
                VC3.A00(new C274084ng(view));
            } else {
                C256003v4 r1 = r8.A0A;
                if (r11.A03) {
                    r6.A0A();
                } else {
                    C246603es r15 = r10.A0A;
                    0sL r0 = r15.A0U;
                    Context context = r9.A01;
                    C262864Gh BR1 = r9.A05.BR1();
                    C262954Gq.A00((View.OnClickListener) r15.A0V.invoke(r6, true), BR1, (C262744Fv) r15.A0a.invoke(context, (Object) null, true), (C262904Gl) r0.invoke(context, r1), r6);
                }
            }
        }
        IgProgressImageView igProgressImageView = r8.A0N;
        boolean A0G = igProgressImageView.getIgImageView().A0G();
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        AnonymousClass3VE r02 = r13.A05;
        if (r02 != null) {
            r02.A00();
        }
        AnonymousClass3VC r4 = r13.A00;
        if (r4 != null) {
            C246603es r5 = r10.A0A;
            if (((Boolean) r5.A0G.invoke()).booleanValue()) {
                AnonymousClass4H2.A01((AnonymousClass50X) r5.A05.invoke(), r4, A0G);
            } else {
                AnonymousClass4H2.A00(r7, r4, false);
            }
        }
        if (A0G) {
            return;
        }
        if (r10.A0T || A0F) {
            igProgressImageView.A0A(new C283645Iq(userSession2, r17, r18, r19, r20, r21, r22), R.id.listener_id_for_media_tag_indicator);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0664, code lost:
        if (r4 != null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0690, code lost:
        if (r4 != null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0694, code lost:
        r12 = "onClick";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c7, code lost:
        if (r4 != null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007f, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36328070340164526L) == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass4DU r44, X.AnonymousClass4JV r45, X.C246613et r46, X.AnonymousClass4EA r47, int r48, boolean r49) {
        /*
            r43 = this;
            r19 = r45
            r0 = -833259501(0xffffffffce557813, float:-8.9535405E8)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r9 = 0
            r0 = r47
            X.0qQ.A0B(r0, r9)
            r20 = 1
            r1 = r46
            r2 = r20
            X.0qQ.A0B(r1, r2)
            r25 = 3
            r42 = r44
            r3 = r42
            r2 = r25
            X.0qQ.A0B(r3, r2)
            r2 = 1
            boolean r17 = com.facebook.systrace.Systrace.A0E(r2)
            if (r17 == 0) goto L_0x0033
            r3 = 1192074128(0x470d9b90, float:36251.562)
            java.lang.String r2 = "MediaViewBinder#bindView"
            X.0fS.A01(r2, r3)
        L_0x0033:
            android.view.View r2 = r0.itemView
            r16 = r2
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.ui.framework.litho.incrementalmount.NestedLithoAwareFrameLayout"
            X.0qQ.A0C(r2, r3)
            r2 = r16
            X.3TP r2 = (X.AnonymousClass3TP) r2
            r16 = r2
            r3 = r49
            r2.A00 = r3
            if (r45 != 0) goto L_0x0051
            r4 = 0
            r3 = -1
            X.4JV r19 = new X.4JV
            r2 = r19
            r2.<init>(r4, r3, r9, r9)
        L_0x0051:
            X.3W1 r2 = r1.A0E
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = r0.A0T
            java.lang.String r3 = r1.A0J
            r40 = r3
            r10.setTransitionName(r3)
            X.3es r3 = r1.A0A
            X.0sP r4 = r3.A0R
            r4.invoke(r10)
            X.3ZH r4 = r1.A08
            X.1Xj r4 = r4.A01
            r37 = r4
            r14 = r43
            com.instagram.common.session.UserSession r8 = r14.A04
            boolean r4 = X.1sx.A0E(r8, r4, r2)
            if (r4 == 0) goto L_0x0081
            X.0Tu r6 = X.0Tu.A05
            r4 = 36328070340164526(0x81103000003bae, double:3.0373561922933887E-306)
            boolean r5 = X.182.A06(r6, r8, r4)
            r4 = 1
            if (r5 != 0) goto L_0x0082
        L_0x0081:
            r4 = 0
        L_0x0082:
            r0.A05 = r4
            if (r4 == 0) goto L_0x009a
            X.0Tu r6 = X.0Tu.A05
            r4 = 37172495270347331(0x84103000010243, double:3.5713739183672665E-306)
            double r4 = X.182.A00(r6, r8, r4)
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r6
            long r6 = (long) r4
            r0.A00 = r6
        L_0x009a:
            com.instagram.common.ui.base.IgFrameLayout r7 = r0.A08
            if (r7 == 0) goto L_0x00b0
            r6 = -2
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            if (r4 == 0) goto L_0x0748
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            X.0qQ.A0C(r5, r4)
            r5.height = r6
        L_0x00b0:
            android.content.Context r4 = r14.A01
            r39 = r4
            boolean r4 = X.C255983v2.A00(r39)
            r41 = r48
            if (r4 == 0) goto L_0x00d7
            if (r7 == 0) goto L_0x00d7
            r4 = r25
            X.0qQ.A0B(r2, r4)
            X.GA7 r4 = new X.GA7
            r26 = r4
            r27 = r8
            r28 = r1
            r29 = r0
            r30 = r2
            r31 = r41
            r26.<init>(r27, r28, r29, r30, r31)
            r7.setOnTouchListener(r4)
        L_0x00d7:
            r4 = r25
            X.0qQ.A0B(r2, r4)
            X.GA7 r4 = new X.GA7
            r26 = r4
            r27 = r8
            r28 = r1
            r29 = r0
            r30 = r2
            r31 = r41
            r26.<init>(r27, r28, r29, r30, r31)
            r10.setOnTouchListener(r4)
            int r6 = r37.A0y()
            int r5 = r37.A0x()
            X.4Gd r4 = new X.4Gd
            r4.<init>(r6, r5)
            r2.A0j = r4
            X.0sP r4 = r3.A0Q
            r4.invoke(r10)
            r4 = r19
            java.lang.Float r4 = r4.A01
            if (r4 == 0) goto L_0x0744
            float r4 = r4.floatValue()
        L_0x010e:
            r10.A00 = r4
            boolean r4 = r1.A0M
            if (r4 == 0) goto L_0x0124
            r5 = 2130970254(0x7f04068e, float:1.7549213E38)
            r4 = r39
            int r5 = X.2Yu.A0H(r4, r5)
            int r4 = r4.getColor(r5)
            r10.setBackgroundColor(r4)
        L_0x0124:
            com.instagram.feed.widget.IgProgressImageView r6 = r0.A0N
            X.0sP r5 = r3.A0I
            android.content.Context r4 = r6.getContext()
            X.0qQ.A07(r4)
            java.lang.Object r13 = r5.invoke(r4)
            X.3fX r13 = (X.C246953fX) r13
            X.3Xd r4 = r14.A05
            r36 = r4
            X.3fB r29 = r36.BRN()
            java.lang.String r12 = r1.A0I
            X.2s5 r7 = r1.A06
            r4 = 46
            X.9Ld r5 = new X.9Ld
            r5.<init>(r1, r4)
            r24 = 47
            X.9Ld r4 = new X.9Ld
            r11 = r24
            r4.<init>(r1, r11)
            r11 = 0
            r26 = r7
            r27 = r42
            r28 = r13
            r31 = r6
            r32 = r12
            r33 = r5
            r34 = r4
            r35 = r9
            X.C247803gw.A02(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.0Tu r23 = X.0Tu.A05
            r4 = 36318973599619869(0x8107ea00031b1d, double:3.0316033769433135E-306)
            r7 = r23
            boolean r4 = X.182.A06(r7, r8, r4)
            if (r4 == 0) goto L_0x0195
            boolean r4 = r1.A0Q
            if (r4 == 0) goto L_0x073a
            android.view.View r12 = r0.A06
            if (r12 == 0) goto L_0x0195
            boolean r4 = X.AnonymousClass3HA.A00(r39)
            if (r4 == 0) goto L_0x0733
            r4 = 37163398529679642(0x8407ea0002011a, double:3.5656211029393854E-306)
        L_0x0187:
            double r4 = X.182.A00(r7, r8, r4)
            int r4 = X.C55020Har.A00(r4)
            r12.setBackgroundColor(r4)
            r12.setVisibility(r9)
        L_0x0195:
            r26 = r8
            r28 = r19
            r29 = r1
            r30 = r14
            r31 = r0
            r32 = r2
            A00(r26, r27, r28, r29, r30, r31, r32)
            X.3VF r7 = r0.A0Q
            X.3V9 r13 = r7.A02
            if (r13 == 0) goto L_0x01ce
            X.0sP r4 = r3.A0K
            X.9IZ r5 = r1.A03
            java.lang.Object r12 = r4.invoke(r5)
            X.4Gk r12 = (X.C262894Gk) r12
            boolean r4 = X.AnonymousClass9II.A00(r9, r12)
            if (r4 == 0) goto L_0x0714
            boolean r4 = r1.A0L
            if (r4 != 0) goto L_0x0705
            r4 = 36319884133015242(0x8108be00081eca, double:3.032179201928971E-306)
            r15 = r23
            boolean r4 = X.182.A06(r15, r8, r4)
            if (r4 == 0) goto L_0x0705
        L_0x01cb:
            r13.A0A()
        L_0x01ce:
            X.3V9 r13 = r7.A03
            if (r13 == 0) goto L_0x0200
            X.0sP r5 = r3.A0K
            X.9IZ r4 = r1.A03
            java.lang.Object r15 = r5.invoke(r4)
            X.4Gk r15 = (X.C262894Gk) r15
            boolean r4 = X.AnonymousClass9II.A00(r9, r15)
            if (r4 == 0) goto L_0x0700
            boolean r4 = r1.A0L
            if (r4 != 0) goto L_0x0700
            r4 = 36319884133015242(0x8108be00081eca, double:3.032179201928971E-306)
            r12 = r23
            boolean r4 = X.182.A06(r12, r8, r4)
            if (r4 == 0) goto L_0x0700
            X.9II r15 = (X.AnonymousClass9II) r15
            java.lang.Object r5 = r15.A01
            X.9Ia r5 = (X.C376449Ia) r5
            X.4Gh r4 = r36.BR1()
            X.C54987HaK.A00(r5, r2, r4, r13)
        L_0x0200:
            X.3VD r7 = r7.A04
            if (r7 == 0) goto L_0x0227
            X.0sa r4 = r3.A08
            java.lang.Object r5 = r4.invoke()
            X.3fk r5 = (X.C247083fk) r5
            X.0sa r4 = r3.A0F
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r30 = r4.booleanValue()
            boolean r4 = r14.A08
            X.47O r27 = r36.BR2()
            r28 = r5
            r29 = r7
            r31 = r4
            X.AnonymousClass4H3.A00(r26, r27, r28, r29, r30, r31)
        L_0x0227:
            X.0sa r4 = r3.A09
            java.lang.Object r12 = r4.invoke()
            X.9Ia r12 = (X.C376449Ia) r12
            X.3V9 r5 = r0.A0P
            androidx.fragment.app.FragmentActivity r4 = r14.A02
            r22 = r4
            X.4Gh r13 = r36.BR1()
            r4 = 4
            X.0qQ.A0B(r13, r4)
            r4 = 5
            X.0qQ.A0B(r12, r4)
            boolean r4 = r12.A04
            if (r4 != 0) goto L_0x0697
            if (r5 == 0) goto L_0x024a
            r5.A0A()
        L_0x024a:
            com.instagram.ui.mediaactions.MediaActionsView r4 = r0.A0S
            r32 = r4
            X.3TO r7 = r1.A0G
            X.0sa r4 = r3.A03
            java.lang.Object r5 = r4.invoke()
            X.9IB r5 = (X.AnonymousClass9IB) r5
            r4 = r32
            X.AnonymousClass4Je.A00(r5, r2, r6, r4, r7)
            X.3yp r13 = r0.A0I
            if (r13 == 0) goto L_0x02f4
            X.3en r12 = r1.A0B
            X.32p r15 = r36.BSx()
            X.4Gh r21 = r36.BR1()
            r4 = r25
            X.0qQ.A0B(r15, r4)
            r5 = 4
            r4 = r21
            X.0qQ.A0B(r4, r5)
            if (r12 == 0) goto L_0x02f4
            boolean r4 = r12.A04
            if (r4 == 0) goto L_0x02f4
            long r6 = r12.A01
            r13.A01 = r6
            long r4 = r12.A00
            r30 = r4
            r13.A00 = r4
            X.Inq r5 = new X.Inq
            r4 = r24
            r5.<init>(r4, r15, r12)
            r13.A07 = r5
            X.IBK r5 = new X.IBK
            r4 = r21
            r5.<init>(r12, r15, r4)
            r13.A02 = r5
            X.3em r4 = r12.A03
            X.0qQ.A0B(r4, r9)
            r13.A05 = r4
            int r5 = r4.ordinal()
            r4 = r20
            if (r5 == r4) goto L_0x0668
            r4 = 2
            java.lang.String r12 = "button"
            if (r5 == r4) goto L_0x064d
            r4 = r25
            if (r5 != r4) goto L_0x02cc
            android.view.ViewStub r4 = r13.A0C
            android.view.View r5 = X.C258323yp.A00(r4, r13)
            r13.A03 = r5
            r4 = 2131434668(0x7f0b1cac, float:1.8491156E38)
            android.view.View r5 = r5.findViewById(r4)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r5 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r5
            r13.A06 = r5
            if (r5 == 0) goto L_0x067f
            android.view.View$OnClickListener r4 = r13.A02
            if (r4 == 0) goto L_0x0694
        L_0x02c9:
            X.AnonymousClass0fU.A00(r4, r5)
        L_0x02cc:
            r2.A0L(r13, r11, r9)
            int r4 = r2.A0Y
            long r12 = (long) r4
            int r4 = r2.A0C
            long r4 = (long) r4
            long r4 = r4 - r6
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x02f4
            X.0eM r4 = X.C21977XoP.A03
            java.lang.Object r12 = r4.getValue()
            X.XoP r12 = (X.C21977XoP) r12
            int r5 = r2.A0C
            int r4 = r2.A0Y
            int r5 = r5 - r4
            long r4 = (long) r5
            long r6 = r6 - r4
            r24 = r12
            r25 = r2
            r26 = r6
            r28 = r30
            r24.A01(r25, r26, r28)
        L_0x02f4:
            boolean r4 = r1.A0R
            r21 = r4
            X.3vA r12 = r0.A0B
            r5 = 0
            X.3fN r24 = r36.BQx()
            X.0sa r4 = r3.A00
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r26 = r4.booleanValue()
            X.0sa r4 = r3.A0D
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r27 = r4.booleanValue()
            X.0sa r4 = r3.A0C
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r28 = r4.booleanValue()
            r6 = 36324694495998201(0x810d1e000230f9, double:3.0352212948491714E-306)
            r4 = r23
            boolean r29 = X.182.A06(r4, r8, r6)
            r23 = r39
            r25 = r12
            X.C247803gw.A00(r23, r24, r25, r26, r27, r28, r29)
            X.3eg r12 = r1.A0C
            java.lang.String r6 = "Required value was null."
            if (r12 == 0) goto L_0x0346
            X.3yi r7 = r0.A03
            if (r7 == 0) goto L_0x0753
            android.widget.SeekBar$OnSeekBarChangeListener r4 = r36.Br7()
            X.C247803gw.A01(r4, r12, r7)
        L_0x0346:
            X.3v9 r13 = r0.A02
            X.9J3 r12 = r1.A04
            java.lang.String r15 = r42.getModuleName()
            if (r12 == 0) goto L_0x0352
            java.lang.String r5 = r12.A03
        L_0x0352:
            r7 = r39
            r4 = r37
            int r4 = X.C256073vB.A00(r7, r8, r4, r15, r5)
            X.C256083vC.A00(r12, r13, r2, r4)
            X.3Ux r7 = r0.A0K
            if (r7 == 0) goto L_0x0374
            X.0sP r5 = r3.A0L
            X.339 r4 = r36.CGA()
            java.lang.Object r5 = r5.invoke(r4)
            X.3fb r5 = (X.C246993fb) r5
            r4 = r20
            X.0qQ.A0B(r5, r4)
            r7.A00 = r5
        L_0x0374:
            X.3W1 r5 = r0.A04
            if (r5 == 0) goto L_0x0390
            if (r5 == r2) goto L_0x0390
            com.instagram.ui.mediaactions.LikeActionView r4 = r0.A0R
            r5.A0V(r4)
            r5.A0Y(r4)
            X.3TS r4 = r0.A01
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r4 = r4.A01()
            r5.A0S(r4)
            r4 = r20
            r5.A0M(r0, r11, r4)
        L_0x0390:
            r0.A04 = r2
            r4 = r20
            r2.A0L(r0, r11, r4)
            X.0sL r5 = r3.A0S
            boolean r4 = r14.A08
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.invoke(r10, r4)
            boolean r4 = X.2eO.A00(r39)
            if (r4 == 0) goto L_0x03cd
            X.IBI r5 = new X.IBI
            r4 = r41
            r5.<init>(r1, r0, r4)
            X.AnonymousClass0fU.A00(r5, r10)
            X.0sP r5 = r3.A0P
            r4 = r32
            r5.invoke(r4)
            if (r21 == 0) goto L_0x0646
            X.1sy r5 = r2.A0o
            X.1sy r4 = X.1sy.A0U
            if (r5 == r4) goto L_0x0646
            X.IBJ r5 = new X.IBJ
            r4 = r41
            r5.<init>(r1, r0, r4)
            r4 = r32
            X.AnonymousClass0fU.A00(r5, r4)
        L_0x03cd:
            boolean r4 = r14.A09
            if (r4 == 0) goto L_0x0609
            boolean r4 = r1.A0N
            if (r4 == 0) goto L_0x0609
            X.3ew r4 = r1.A05
            if (r4 == 0) goto L_0x05c3
            X.68u r5 = X.C3034368u.A02(r11, r4)
            X.3yq r4 = r0.A0L
            if (r4 == 0) goto L_0x075c
            X.0qQ.A0A(r5)
            X.C56312HwP.A01(r5, r4)
        L_0x03e7:
            X.3TW r5 = r0.A0F
            if (r5 == 0) goto L_0x0404
            X.0sa r4 = r3.A01
            java.lang.Object r4 = r4.invoke()
            X.9J0 r4 = (X.AnonymousClass9J0) r4
            X.4G1 r27 = r36.Aow()
            r23 = r4
            r24 = r8
            r25 = r42
            r26 = r5
            r28 = r2
            X.AnonymousClass4G2.A00(r22, r23, r24, r25, r26, r27, r28)
        L_0x0404:
            X.3TX r7 = r0.A07
            if (r7 == 0) goto L_0x041b
            boolean r6 = r1.A0P
            boolean r5 = r1.A0S
            com.instagram.user.model.User r4 = r1.A0H
            X.9IE r6 = X.C246493eh.A00(r4, r6, r5)
            X.3fP r5 = r36.Ahs()
            com.instagram.user.model.User r4 = r14.A07
            X.AnonymousClass4G6.A00(r6, r5, r7, r4)
        L_0x041b:
            X.3V4 r6 = r0.A0J
            if (r6 == 0) goto L_0x0437
            X.4Jo r5 = new X.4Jo
            r4 = r41
            r5.<init>(r1, r0, r4)
            X.3da r4 = r1.A0F
            r23 = r42
            r24 = r8
            r25 = r5
            r26 = r6
            r27 = r4
            r28 = r9
            X.AnonymousClass4Jq.A01(r23, r24, r25, r26, r27, r28)
        L_0x0437:
            X.3yj r5 = r0.A0H
            if (r5 == 0) goto L_0x0456
            X.0sa r4 = r3.A02
            java.lang.Object r4 = r4.invoke()
            X.9IE r4 = (X.AnonymousClass9IE) r4
            X.3fJ r27 = r36.B5P()
            r23 = r39
            r24 = r4
            r25 = r8
            r26 = r42
            r28 = r5
            r29 = r2
            X.AnonymousClass4Jt.A00(r23, r24, r25, r26, r27, r28, r29)
        L_0x0456:
            X.3TY r12 = r0.A0D
            if (r12 == 0) goto L_0x04a4
            X.4GQ r23 = X.AnonymousClass4GQ.A00
            X.3ex r5 = r1.A07
            android.content.res.Resources r6 = r39.getResources()
            int r4 = r1.A00()
            int r35 = r6.getDimensionPixelSize(r4)
            X.33B r27 = r36.Aqg()
            X.0sa r4 = r3.A0A
            java.lang.Object r4 = r4.invoke()
            X.3fL r4 = (X.C246853fL) r4
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r7 = r22
            r6.<init>(r7)
            if (r5 == 0) goto L_0x05bf
            boolean r37 = X.GMK.A02(r8, r5)
        L_0x0483:
            X.4DV r7 = r14.A06
            boolean r38 = X.C247163fs.A00(r39)
            boolean r36 = X.C249223jK.A03(r8)
            X.4K7 r34 = X.AnonymousClass4K7.A00
            r24 = r8
            r25 = r11
            r26 = r5
            r28 = r4
            r29 = r12
            r30 = r42
            r31 = r2
            r32 = r7
            r33 = r6
            r23.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x04a4:
            X.3yo r4 = r0.A0E
            if (r4 == 0) goto L_0x04b8
            X.3ek r5 = r1.A09
            if (r5 == 0) goto L_0x05af
            java.util.List r5 = r5.A00
            X.6Pt r4 = r4.A00
            if (r4 == 0) goto L_0x04b8
            r4.setVisibility(r9)
            r4.A01(r11, r11, r5)
        L_0x04b8:
            boolean r4 = r2.A2u
            X.3oV r5 = r0.A0C
            if (r4 == 0) goto L_0x059f
            if (r5 == 0) goto L_0x04da
            android.view.View r5 = r5.getView()
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            if (r5 == 0) goto L_0x04da
            boolean r4 = r2.A2t
            r5.setChecked(r4)
            X.AN2 r4 = new X.AN2
            r4.<init>(r2)
            X.AnonymousClass0fU.A00(r4, r5)
            r4 = r16
            r4.setVisibility(r9)
        L_0x04da:
            com.instagram.common.ui.base.IgView r6 = r0.A09
            if (r6 == 0) goto L_0x04ee
            r6.setVisibility(r9)
            X.GIa r5 = com.instagram.igds.components.gradient.IGGradientView.A00
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            r0 = 25
            android.graphics.drawable.GradientDrawable r0 = r5.A01(r4, r0)
            r6.setBackground(r0)
        L_0x04ee:
            boolean r0 = r2.A37
            if (r0 == 0) goto L_0x04ff
            X.0sL r4 = r3.A0Y
            int r0 = r2.getPosition()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r10, r0)
        L_0x04ff:
            X.0sP r0 = r3.A0O
            r0.invoke(r10)
            X.3aa r0 = X.C244063aa.MEDIA
            X.C244083ac.A05(r10, r0)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0529
            java.lang.Integer r0 = java.lang.Integer.valueOf(r41)
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            r0 = r20
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.lang.String r0 = "Media Item %d"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            X.0qQ.A07(r0)
            r10.setContentDescription(r0)
        L_0x0529:
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x0555
            boolean r0 = X.2Y9.A00
            if (r0 == 0) goto L_0x0555
            X.0sK r6 = r3.A0b
            r5 = r19
            r4 = r22
            r0 = r39
            java.lang.Object r5 = r6.invoke(r5, r4, r0)
            android.util.Size r5 = (android.util.Size) r5
            if (r5 == 0) goto L_0x0555
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            int r0 = r5.getWidth()
            r4.width = r0
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            int r0 = r5.getHeight()
            r4.height = r0
        L_0x0555:
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x056b
            X.3yT r1 = r14.A00
            if (r1 != 0) goto L_0x0564
            X.3yT r1 = new X.3yT
            r1.<init>(r8)
            r14.A00 = r1
        L_0x0564:
            android.content.Context r0 = r39.getApplicationContext()
            r1.A00(r0)
        L_0x056b:
            X.0sa r0 = r3.A08
            java.lang.Object r0 = r0.invoke()
            X.3fk r0 = (X.C247083fk) r0
            X.9Ii r0 = r0.A02
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r2 = r0.invoke(r2)
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x058e
            X.4H4 r1 = X.AnonymousClass4H4.A00
            r0 = r40
            r1.A0A(r8, r0, r2)
        L_0x058e:
            if (r17 == 0) goto L_0x0596
            r0 = 544259232(0x2070bca0, float:2.0391202E-19)
            X.0fS.A00(r0)
        L_0x0596:
            r1 = 207087282(0xc57e6b2, float:1.663242E-31)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x059f:
            r4 = 8
            if (r5 == 0) goto L_0x05a6
            r5.setVisibility(r4)
        L_0x05a6:
            com.instagram.common.ui.base.IgView r0 = r0.A09
            if (r0 == 0) goto L_0x04ee
            r0.setVisibility(r4)
            goto L_0x04ee
        L_0x05af:
            X.6Pt r5 = r4.A00
            if (r5 == 0) goto L_0x04b8
            r4 = 8
            r5.setVisibility(r4)
            X.0sn r4 = X.0sn.A00
            r5.A01(r11, r11, r4)
            goto L_0x04b8
        L_0x05bf:
            r37 = 0
            goto L_0x0483
        L_0x05c3:
            X.3v7 r6 = r0.A0M
            X.3ev r5 = r1.A0D
            r4 = 8
            float[] r4 = new float[r4]
            r23 = r42
            r24 = r5
            r25 = r6
            r26 = r4
            r27 = r20
            r28 = r9
            r29 = r9
            X.C256013v5.A02(r23, r24, r25, r26, r27, r28, r29)
            r4 = r19
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x03e7
            X.0qQ.A0B(r6, r9)
            android.widget.LinearLayout r5 = r6.A04
            android.widget.LinearLayout r6 = r6.A03
            if (r5 == 0) goto L_0x03e7
            if (r6 == 0) goto L_0x03e7
            r4 = 17
            r5.setGravity(r4)
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r4 = -2
            r5.height = r4
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.0qQ.A0C(r5, r4)
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            r4 = 0
            r5.weight = r4
            goto L_0x03e7
        L_0x0609:
            com.instagram.ui.mediaactions.LikeActionView r4 = r0.A0R
            r4.A00()
            r2.A0T(r4)
            r2.A0X(r4)
            X.3TS r7 = r0.A01
            android.widget.FrameLayout r4 = r7.A00()
            r4.setMinimumWidth(r9)
            boolean r6 = r1.A0O
            r5 = 6
            X.9IQ r4 = new X.9IQ
            r4.<init>((java.lang.Integer) r11, (int) r5, (boolean) r6)
            X.C250563lf.A0f(r4, r7, r2)
            X.3v7 r4 = r0.A0M
            X.C256013v5.A03(r4)
            X.3yh r7 = r0.A0O
            if (r7 == 0) goto L_0x03e7
            X.0sa r4 = r3.A04
            java.lang.Object r6 = r4.invoke()
            X.9NR r6 = (X.AnonymousClass9NR) r6
            X.0iw r4 = r14.A03
            java.lang.String r5 = r4.getModuleName()
            r4 = r36
            X.C263204Jn.A00(r8, r4, r6, r7, r5)
            goto L_0x03e7
        L_0x0646:
            r4 = r32
            r4.setOnClickListener(r11)
            goto L_0x03cd
        L_0x064d:
            android.view.ViewStub r4 = r13.A0B
            android.view.View r5 = X.C258323yp.A00(r4, r13)
            r13.A03 = r5
            r4 = 2131434668(0x7f0b1cac, float:1.8491156E38)
            android.view.View r5 = r5.findViewById(r4)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r5 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r5
            r13.A06 = r5
            if (r5 == 0) goto L_0x067f
            android.view.View$OnClickListener r4 = r13.A02
            if (r4 == 0) goto L_0x0694
            goto L_0x02c9
        L_0x0668:
            android.view.ViewStub r4 = r13.A0D
            android.view.View r5 = X.C258323yp.A00(r4, r13)
            r13.A03 = r5
            r4 = 2131433626(0x7f0b189a, float:1.8489043E38)
            android.view.View r5 = r5.findViewById(r4)
            com.instagram.common.ui.base.IgLinearLayout r5 = (com.instagram.common.ui.base.IgLinearLayout) r5
            r13.A04 = r5
            if (r5 != 0) goto L_0x0687
            java.lang.String r12 = "gradientView"
        L_0x067f:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0687:
            r4 = 2131433627(0x7f0b189b, float:1.8489045E38)
            android.view.View r5 = r5.findViewById(r4)
            android.view.View$OnClickListener r4 = r13.A02
            if (r4 == 0) goto L_0x0694
            goto L_0x02c9
        L_0x0694:
            java.lang.String r12 = "onClick"
            goto L_0x067f
        L_0x0697:
            if (r5 == 0) goto L_0x024a
            java.lang.Object r4 = r12.A01
            X.9IE r4 = (X.AnonymousClass9IE) r4
            java.lang.Object r4 = r4.A00
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r7 = r4.invoke(r5)
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            java.lang.Object r4 = r12.A02
            X.4Fv r4 = (X.C262744Fv) r4
            X.C262954Gq.A00(r7, r13, r4, r11, r5)
            boolean r4 = r12.A03
            if (r4 == 0) goto L_0x06fc
            r7 = 2130969921(0x7f040541, float:1.7548538E38)
            r4 = r39
            int r7 = X.2Yu.A0H(r4, r7)
        L_0x06bb:
            r4 = r39
            int r7 = r4.getColor(r7)
            X.AnonymousClass3V9.A07(r5)
            X.3gr r4 = r5.A06
            if (r4 == 0) goto L_0x06cd
            android.widget.ImageView r4 = r4.A02
            r4.setColorFilter(r7)
        L_0x06cd:
            if (r22 == 0) goto L_0x024a
            X.7zw r7 = new X.7zw
            r4 = r22
            r7.<init>(r4, r8)
            X.2eb r4 = r5.A0I
            android.view.View r5 = r4.A01()
            X.0qQ.A07(r5)
            X.8pz r4 = X.C366978pz.A0o
            boolean r4 = r7.A01(r6, r5, r4)
            if (r4 == 0) goto L_0x024a
            X.1Av r12 = X.1Au.A00(r8)
            X.0s0 r7 = r12.A4P
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 93
            r5 = r5[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r20)
            r7.Epx(r12, r4, r5)
            goto L_0x024a
        L_0x06fc:
            r7 = 2131100348(0x7f0602bc, float:1.7813075E38)
            goto L_0x06bb
        L_0x0700:
            r13.A0A()
            goto L_0x0200
        L_0x0705:
            X.9II r12 = (X.AnonymousClass9II) r12
            java.lang.Object r5 = r12.A01
            X.9Ia r5 = (X.C376449Ia) r5
            X.4Gh r4 = r36.BR1()
            X.C54987HaK.A00(r5, r2, r4, r13)
            goto L_0x01ce
        L_0x0714:
            r4 = r20
            boolean r4 = X.AnonymousClass9II.A00(r4, r12)
            if (r4 == 0) goto L_0x0725
            X.4Gh r4 = r36.BR1()
            X.C262974Gs.A00(r5, r2, r4, r13)
            goto L_0x01ce
        L_0x0725:
            X.4Jc r4 = X.AnonymousClass4Jc.A00
            boolean r4 = X.0qQ.A0K(r12, r4)
            if (r4 != 0) goto L_0x01cb
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0733:
            r4 = 37163398529614105(0x8407ea00010119, double:3.5656211028979396E-306)
            goto L_0x0187
        L_0x073a:
            android.view.View r5 = r0.A06
            if (r5 == 0) goto L_0x0195
            r4 = 4
            r5.setVisibility(r4)
            goto L_0x0195
        L_0x0744:
            float r4 = r1.A01
            goto L_0x010e
        L_0x0748:
            r5 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r5, r6)
            r7.setLayoutParams(r4)
            goto L_0x00b0
        L_0x0753:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r6)
            r1 = 1955430984(0x748d8248, float:8.969193E31)
            goto L_0x0764
        L_0x075c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r6)
            r1 = 389024070(0x17300946, float:5.688037E-25)
        L_0x0764:
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4EZ.A07(X.4DU, X.4JV, X.3et, X.4EA, int, boolean):void");
    }
}
