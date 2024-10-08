package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4GG  reason: invalid class name */
public final class AnonymousClass4GG {
    public static final C279064y1 A00(Context context, View view, UserSession userSession, ReboundViewPager reboundViewPager, AnonymousClass4G9 r44) {
        C256043v8 r0;
        View view2 = view;
        0qQ.A0B(view2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        View requireViewById = view2.requireViewById(R.id.zoomable_view_container);
        0qQ.A07(requireViewById);
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) requireViewById;
        View requireViewById2 = view2.requireViewById(R.id.carousel_video_media_group);
        0qQ.A07(requireViewById2);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById2;
        View requireViewById3 = view2.requireViewById(R.id.carousel_video_image);
        0qQ.A07(requireViewById3);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById3;
        View requireViewById4 = view2.requireViewById(R.id.odml_test_imageview_overlay);
        0qQ.A07(requireViewById4);
        View requireViewById5 = view2.requireViewById(R.id.carousel_video_media_actions);
        0qQ.A07(requireViewById5);
        MediaActionsView mediaActionsView = (MediaActionsView) requireViewById5;
        0Tu r3 = 0Tu.A05;
        C256003v4 r2 = new C256003v4((ViewStub) view2.findViewById(R.id.media_subtitle_view_stub), 182.A06(r3, userSession2, 36324694495998201L));
        AnonymousClass3V8 r22 = new AnonymousClass3V8(view2);
        C256033v7 A00 = C256013v5.A00((ViewStub) view2.findViewById(R.id.media_cover_view_stub));
        AnonymousClass3V4 r23 = new AnonymousClass3V4((ViewStub) view2.findViewById(R.id.zero_rating_video_play_button_stub));
        AnonymousClass3V9 r24 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_tag_indicator_stub);
        AnonymousClass3V9 r25 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_secondary_tag_indicator_stub);
        AnonymousClass3V9 r15 = new AnonymousClass3V9(view2, userSession2, R.id.feed_media_top_start_tag_indicator_stub);
        AnonymousClass4GY r14 = new AnonymousClass4GY(view2);
        AnonymousClass3VE r13 = new AnonymousClass3VE(view2);
        ViewStub viewStub = (ViewStub) view2.findViewById(R.id.feed_fullscreen_hint_stub);
        boolean A06 = 182.A06(r3, userSession2, 36324694495998201L);
        if (viewStub == null) {
            r0 = null;
        } else {
            r0 = new C256043v8(context, viewStub, A06);
        }
        View requireViewById6 = view2.requireViewById(R.id.open_carousel_prompt_redesign_view_stub);
        0qQ.A07(requireViewById6);
        C262794Ga r5 = new C262794Ga((ViewStub) requireViewById6);
        AnonymousClass4GZ r4 = new AnonymousClass4GZ(view2);
        AnonymousClass3V9 r32 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_open_carousel_add_button);
        AnonymousClass3V9 r26 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_per_media_like_button);
        View requireViewById7 = view2.requireViewById(R.id.larger_cta_top_buffer);
        0qQ.A07(requireViewById7);
        return new C279064y1(requireViewById4, r2, reboundViewPager, 2b1.A01(view2.requireViewById(R.id.carousel_peak_scrim_overlay), false, false), simpleZoomableViewContainer, r5, r4, r44, r14, r22, new C256053v9(requireViewById7), r0, r23, A00, igProgressImageView, r24, r25, r15, r32, r26, r13, mediaActionsView, mediaFrameLayout);
    }

    public static final void A01(Context context, UserSession userSession, C279104y5 r19, AnonymousClass4GD r20, C279064y1 r21, AnonymousClass4DU r22, AnonymousClass3W1 r23) {
        C279064y1 r15 = r21;
        IgProgressImageView igProgressImageView = r15.A0E;
        boolean A0G = igProgressImageView.getIgImageView().A0G();
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        AnonymousClass3VF r9 = r15.A0H;
        AnonymousClass3V9 r8 = r9.A01;
        if (r8 != null) {
            AnonymousClass3W1 r5 = r23;
            C280034zt r7 = new C280034zt(r5);
            AnonymousClass4GD r14 = r20;
            C262864Gh BR1 = r14.BR1();
            C279104y5 r13 = r19;
            AnonymousClass9IS r6 = r13.A03;
            C262954Gq.A00((View.OnClickListener) ((0sP) r6.A0B).invoke(r8), BR1, r13.A0A, r7, r8);
            UserSession userSession2 = userSession;
            C262964Gr.A00(r13.A04, r5, r14.BR1(), r9.A02, !182.A06(0Tu.A05, userSession2, 36319884133015242L));
            AnonymousClass3V9 r1 = r15.A0F;
            C262864Gh BR12 = r14.BR1();
            Context context2 = context;
            C263024Gx.A00((AnonymousClass9J0) ((0sP) r6.A0C).invoke(context2), userSession2, r14.BYI(), r5, BR12, r1);
            AnonymousClass3V9 r2 = r15.A0G;
            AnonymousClass4H1.A00(context2, (C376449Ia) ((0sP) r6.A0D).invoke(context2), r14.BR1(), r2);
            if (!A0G) {
                igProgressImageView.A0A(new C280044zu(context2, userSession2, r13, r14, r15, r22, r5), R.id.listener_id_for_media_tag_indicator);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r32, android.view.View r33, X.AnonymousClass3TS r34, com.instagram.common.session.UserSession r35, X.C282555Dn r36, X.C279104y5 r37, X.AnonymousClass4GD r38, X.AnonymousClass4DU r39, X.AnonymousClass3W1 r40, boolean r41, boolean r42) {
        /*
            r31 = this;
            r18 = r33
            r12 = 0
            r0 = 2
            r7 = r40
            X.0qQ.A0B(r7, r0)
            r14 = 4
            r29 = r39
            r0 = r29
            X.0qQ.A0B(r0, r14)
            r1 = 5
            r19 = r32
            r0 = r19
            X.0qQ.A0B(r0, r1)
            r0 = 6
            r9 = r35
            X.0qQ.A0B(r9, r0)
            r1 = 9
            r30 = r38
            r0 = r30
            X.0qQ.A0B(r0, r1)
            java.lang.Object r6 = r18.getTag()
            java.lang.String r13 = "Required value was null."
            if (r6 == 0) goto L_0x0427
            X.4y1 r6 = (X.C279064y1) r6
            r1 = 0
            r8 = r37
            if (r37 != 0) goto L_0x0048
            com.instagram.feed.widget.IgProgressImageView r2 = r6.A0E
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.getIgImageView()
            r0.setImageBitmap(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.getIgImageView()
            r0.setBackground(r1)
            return
        L_0x0048:
            X.3W1 r2 = r6.A01
            if (r2 == 0) goto L_0x0052
            if (r2 == r7) goto L_0x0052
            r0 = 1
            r2.A0M(r6, r1, r0)
        L_0x0052:
            com.instagram.feed.widget.IgProgressImageView r5 = r6.A0E
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.getIgImageView()
            java.lang.String r0 = r8.A0H
            r28 = r0
            r2.setTransitionName(r0)
            r6.A01 = r7
            r11 = 1
            r7.A0L(r6, r1, r11)
            boolean r0 = r8.A0W
            r16 = r34
            if (r0 == 0) goto L_0x0398
            r6.A00 = r1
        L_0x006d:
            X.3v9 r3 = r6.A0B
            X.9J3 r2 = r8.A05
            java.lang.String r4 = r29.getModuleName()
            X.1Xj r10 = r8.A06
            if (r2 == 0) goto L_0x007b
            java.lang.String r1 = r2.A03
        L_0x007b:
            r0 = r19
            int r0 = X.C256073vB.A00(r0, r9, r10, r4, r1)
            X.C256083vC.A00(r2, r3, r7, r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r4 = r6.A0J
            X.4y6 r0 = new X.4y6
            r0.<init>(r9, r8, r6)
            r4.setOnTouchListener(r0)
            boolean r0 = X.2eO.A00(r19)
            if (r0 == 0) goto L_0x009c
            X.W9X r0 = new X.W9X
            r0.<init>(r8, r6)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x009c:
            r4.A03 = r11
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            r3 = -1
            r0.width = r3
            r5.setAdjustViewBounds(r12)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.width = r3
            r2 = -2
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r1 = r6.A05
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x038e
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
        L_0x00bd:
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x0360
            java.lang.Integer r0 = r8.A0F
            if (r0 == 0) goto L_0x00de
            int r3 = r0.intValue()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r3
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r3, r0)
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r0 = 17
            r3.gravity = r0
        L_0x00de:
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r4, r0)
            android.content.res.Resources r3 = r19.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r3.getDimensionPixelSize(r0)
            float r0 = (float) r0
        L_0x00f3:
            r4.A04 = r11
            r4.A01 = r0
        L_0x00f7:
            X.4G9 r3 = r6.A08
            if (r3 == 0) goto L_0x010c
            boolean r0 = X.C262574Fa.A00(r9, r10)
            if (r0 == 0) goto L_0x010c
            X.0eM r0 = r3.A02
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setBackground(r0)
        L_0x010c:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            r0.height = r2
            boolean r0 = r8.A0R
            r17 = r0
            if (r0 != 0) goto L_0x0125
            com.instagram.user.model.User r0 = r8.A0D
            if (r0 == 0) goto L_0x0125
            java.lang.String r2 = r0.getId()
            java.lang.String r0 = "0"
            X.0qQ.A0K(r2, r0)
        L_0x0125:
            float r0 = r8.A00
            r1.A00 = r0
            r4.A00 = r0
            X.9IS r3 = r8.A03
            java.lang.Object r0 = r3.A07
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r4)
            java.lang.Object r0 = r3.A0G
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            r2 = 2131435565(0x7f0b202d, float:1.8492976E38)
            X.4yC r0 = new X.4yC
            r0.<init>(r8, r6, r7)
            r5.A0A(r0, r2)
            X.4yD r1 = new X.4yD
            r1.<init>(r7)
            android.util.SparseArray r0 = r5.A0D
            r0.put(r2, r1)
            r7.A0U = r12
            X.3fX r1 = r8.A07
            r0 = r29
            X.C247843h0.A00(r0, r1, r5)
            int r1 = r8.A01
            int r0 = r7.A02
            if (r1 == r0) goto L_0x034d
            r5.setVisibility(r12)
        L_0x0162:
            X.3v4 r2 = r6.A03
            X.C263164Jj.A00(r2)
            boolean r1 = r8.A0N
            if (r1 != 0) goto L_0x0176
            X.2eb r0 = r2.A03
            android.view.View r0 = r0.A01()
            if (r0 == 0) goto L_0x0176
            X.2eQ.A04(r0, r14)
        L_0x0176:
            boolean r0 = r8.A0Y
            if (r0 == 0) goto L_0x0346
            if (r1 == 0) goto L_0x0187
            X.2eb r0 = r2.A03
            android.view.View r0 = r0.A01()
            if (r0 == 0) goto L_0x0187
            X.2eQ.A04(r0, r14)
        L_0x0187:
            r2.A02 = r11
            X.3fN r0 = r30.BQx()
            r2.A01 = r0
            android.content.res.Resources r15 = r19.getResources()
            X.4Fv r1 = r8.A0A
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            if (r1 == 0) goto L_0x019d
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
        L_0x019d:
            int r0 = r15.getDimensionPixelSize(r0)
            r2.A00 = r0
        L_0x01a3:
            X.C263164Jj.A00(r2)
            if (r34 == 0) goto L_0x01af
            X.9IQ r1 = r8.A02
            r0 = r16
            X.C250563lf.A0f(r1, r0, r7)
        L_0x01af:
            boolean r0 = r7.A36
            if (r0 == 0) goto L_0x01bb
            com.instagram.ui.mediaactions.MediaActionsView r0 = r6.A0I
            r0.setVisibility(r14)
            r0.setShouldShowCountdownTimer(r12)
        L_0x01bb:
            X.0Tu r2 = X.0Tu.A05
            r15 = 36318973599619869(0x8107ea00031b1d, double:3.0316033769433135E-306)
            r0 = r15
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x01e9
            boolean r0 = r8.A0Q
            android.view.View r15 = r6.A02
            if (r0 == 0) goto L_0x01e6
            boolean r0 = X.AnonymousClass3HA.A00(r19)
            if (r0 == 0) goto L_0x033f
            r0 = 37163398529679642(0x8407ea0002011a, double:3.5656211029393854E-306)
        L_0x01da:
            double r0 = X.182.A00(r2, r9, r0)
            int r0 = X.C55020Har.A00(r0)
            r15.setBackgroundColor(r0)
            r14 = 0
        L_0x01e6:
            r15.setVisibility(r14)
        L_0x01e9:
            java.lang.Object r1 = r3.A06
            X.0sL r1 = (X.0sL) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r41)
            r1.invoke(r4, r0)
            if (r42 == 0) goto L_0x0239
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x0338
            X.4g6 r10 = r10.A07
            r0 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x030a
            r0 = r19
            boolean r0 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x030a
            if (r10 == 0) goto L_0x030a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r19)
            r1 = r19
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            r2 = 0
            r0 = r29
            X.2nI r1 = X.C229382nI.A01(r2, r1, r0, r9)
            r0 = r18
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.0qQ.A0A(r4)
            X.3yq r1 = X.C56312HwP.A00(r4, r0, r1, r9)
            X.4hR r0 = r10.A01
            X.3ew r0 = r0.A01()
            X.68u r0 = X.C3034368u.A02(r2, r0)
            X.0qQ.A0A(r0)
            X.C56312HwP.A01(r0, r1)
        L_0x0239:
            X.3V4 r2 = r6.A0C
            X.4zs r1 = new X.4zs
            r1.<init>(r8, r6)
            X.3da r0 = r8.A08
            r20 = r29
            r21 = r9
            r22 = r1
            r23 = r2
            r24 = r0
            r25 = r12
            X.AnonymousClass4Jq.A01(r20, r21, r22, r23, r24, r25)
            java.lang.Object r0 = r3.A08
            X.0sP r0 = (X.0sP) r0
            com.instagram.ui.mediaactions.MediaActionsView r1 = r6.A0I
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x026f
            boolean r0 = r8.A0V
            if (r0 == 0) goto L_0x0304
            X.W9W r0 = new X.W9W
            r0.<init>(r8, r6)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x026f:
            boolean r4 = r8.A0P
            if (r4 == 0) goto L_0x02ec
            r20 = r36
            if (r36 == 0) goto L_0x041b
            X.3VF r1 = r6.A0H
            X.3V9 r0 = r1.A01
            if (r0 == 0) goto L_0x0415
            r0.A0A()
            X.3VE r0 = r1.A05
            if (r0 == 0) goto L_0x040f
            X.2eb r1 = r0.A00
            android.view.View r0 = r1.A01()
            r0.setVisibility(r12)
            android.view.View r18 = r1.A01()
            X.0qQ.A07(r18)
            boolean r14 = r8.A0U
            java.lang.String r11 = r8.A0G
            java.util.Map r10 = r8.A0L
            java.util.Map r2 = r8.A0M
            java.util.Map r1 = r8.A0K
            X.LOQ r13 = X.LOQ.A00
            java.lang.String r0 = r8.A0I
            boolean r27 = r13.A01(r9, r0, r12)
            X.3QO r0 = r8.A09
            r26 = r14
            r19 = r9
            r21 = r0
            r22 = r11
            r23 = r10
            r24 = r2
            r25 = r1
            X.C64190LSx.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x02b9:
            java.lang.String r10 = r8.A0G
            r24 = r10
            int r0 = r10.length()
            if (r0 > 0) goto L_0x02c5
            r10 = r28
        L_0x02c5:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r0 = r8.A0L
            if (r0 == 0) goto L_0x039e
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x02d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x039e
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x02d6
        L_0x02ec:
            X.3VF r0 = r6.A0H
            X.3VE r0 = r0.A05
            if (r0 == 0) goto L_0x0421
            r0.A00()
            r10 = r19
            r11 = r9
            r12 = r8
            r13 = r30
            r14 = r6
            r15 = r29
            r16 = r7
            A01(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02b9
        L_0x0304:
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x026f
        L_0x030a:
            X.3v7 r2 = r6.A0D
            java.lang.Object r10 = r3.A0A
            X.0sL r10 = (X.0sL) r10
            android.content.Context r1 = r4.getContext()
            X.0qQ.A07(r1)
            X.3ed r0 = r30.BQd()
            java.lang.Object r1 = r10.invoke(r1, r0)
            X.3ev r1 = (X.C246633ev) r1
            r0 = 8
            float[] r0 = new float[r0]
            r20 = r29
            r21 = r1
            r22 = r2
            r23 = r0
            r24 = r11
            r25 = r12
            r26 = r12
            X.C256013v5.A02(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0239
        L_0x0338:
            X.3v7 r0 = r6.A0D
            X.C256013v5.A03(r0)
            goto L_0x0239
        L_0x033f:
            r0 = 37163398529614105(0x8407ea00010119, double:3.5656211028979396E-306)
            goto L_0x01da
        L_0x0346:
            r0 = 0
            r2.A01 = r0
            r2.A02 = r12
            goto L_0x01a3
        L_0x034d:
            com.instagram.ui.mediaactions.MediaActionsView r2 = r6.A0I
            X.3TO r1 = r8.A0B
            java.lang.Object r0 = r3.A02
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            X.9IB r0 = (X.AnonymousClass9IB) r0
            X.AnonymousClass4Je.A00(r0, r7, r5, r2, r1)
            goto L_0x0162
        L_0x0360:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x037a
            java.lang.Integer r15 = r8.A0F
            if (r15 == 0) goto L_0x036e
            int r3 = r15.intValue()
        L_0x036e:
            r0.width = r3
            boolean r3 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r3 == 0) goto L_0x037a
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r3 = 16
            r0.gravity = r3
        L_0x037a:
            java.lang.Float r0 = r8.A0E
            if (r0 == 0) goto L_0x0384
            float r0 = r0.floatValue()
            goto L_0x00f3
        L_0x0384:
            r4.A04 = r12
            r0 = 0
            r4.A01 = r0
            r0 = 0
            r4.A02 = r0
            goto L_0x00f7
        L_0x038e:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r2)
            r1.setLayoutParams(r0)
            goto L_0x00bd
        L_0x0398:
            r0 = r16
            r6.A00 = r0
            goto L_0x006d
        L_0x039e:
            java.util.Map r0 = r8.A0K
            if (r0 == 0) goto L_0x03c0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x03aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03c0
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x03aa
        L_0x03c0:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03cd
            X.4H4 r0 = X.AnonymousClass4H4.A00
            r0.A0A(r9, r10, r2)
        L_0x03cd:
            X.4GZ r10 = r6.A07
            com.instagram.user.model.User r2 = r8.A0D
            com.instagram.user.model.User r1 = r8.A0C
            java.lang.String r0 = r8.A0J
            X.4H6 r19 = r30.BYF()
            r18 = r9
            r20 = r10
            r21 = r29
            r22 = r2
            r23 = r1
            r25 = r0
            r26 = r17
            r27 = r4
            X.AnonymousClass4H7.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.4Ga r1 = r6.A06
            X.4Gu r13 = r30.BYI()
            boolean r0 = r8.A0T
            r10 = r29
            r11 = r9
            r12 = r1
            r14 = r7
            r15 = r5
            r16 = r28
            r17 = r24
            r18 = r0
            X.AnonymousClass4H8.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.4GY r2 = r6.A09
            java.lang.Object r1 = r3.A0E
            X.0sa r1 = (X.C62320sa) r1
            boolean r0 = r8.A0X
            X.AnonymousClass4H9.A00(r2, r1, r0)
            return
        L_0x040f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x0415:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x041b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x0421:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x0427:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GG.A02(android.content.Context, android.view.View, X.3TS, com.instagram.common.session.UserSession, X.5Dn, X.4y5, X.4GD, X.4DU, X.3W1, boolean, boolean):void");
    }
}
