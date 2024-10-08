package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Map;

/* renamed from: X.4GB  reason: invalid class name */
public final class AnonymousClass4GB {
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object, X.4nf] */
    public static final C262804Gb A00(View view, UserSession userSession, ReboundViewPager reboundViewPager, AnonymousClass4G9 r50) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        View requireViewById = view2.requireViewById(R.id.zoomable_view_container);
        0qQ.A07(requireViewById);
        View requireViewById2 = view2.requireViewById(R.id.carousel_image_media_group);
        0qQ.A07(requireViewById2);
        View requireViewById3 = view2.requireViewById(R.id.carousel_image);
        0qQ.A07(requireViewById3);
        View requireViewById4 = view2.requireViewById(R.id.odml_test_imageview_overlay);
        0qQ.A07(requireViewById4);
        View requireViewById5 = view2.requireViewById(R.id.row_feed_photo_tags);
        0qQ.A07(requireViewById5);
        AnonymousClass3VD r0 = new AnonymousClass3VD((TagsLayout) requireViewById5);
        View requireViewById6 = view2.requireViewById(R.id.row_feed_photo_media_tag_hints);
        0qQ.A07(requireViewById6);
        AnonymousClass3VC r02 = new AnonymousClass3VC(userSession2, (MediaTagHintsLayout) requireViewById6);
        AnonymousClass3V9 r03 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_tag_indicator_stub);
        AnonymousClass3V9 r04 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_secondary_tag_indicator_stub);
        AnonymousClass3V9 r05 = new AnonymousClass3V9(view2, userSession2, R.id.feed_media_top_start_tag_indicator_stub);
        AnonymousClass3V8 r06 = new AnonymousClass3V8(view2);
        C256033v7 A00 = C256013v5.A00((ViewStub) view2.findViewById(R.id.media_cover_view_stub));
        AnonymousClass3VE r07 = new AnonymousClass3VE(view2);
        AnonymousClass4GY r08 = new AnonymousClass4GY(view2);
        C274044nc r15 = new C274044nc(view2);
        C274054nd r14 = new C274054nd(view2);
        AnonymousClass4GZ r8 = new AnonymousClass4GZ(view2);
        C274064ne r7 = new C274064ne(view2);
        View requireViewById7 = view2.requireViewById(R.id.open_carousel_prompt_redesign_view_stub);
        0qQ.A07(requireViewById7);
        C262794Ga r6 = new C262794Ga((ViewStub) requireViewById7);
        AnonymousClass3V9 r5 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_open_carousel_add_button);
        AnonymousClass3V9 r4 = new AnonymousClass3V9(view2, userSession2, R.id.row_feed_media_per_media_like_button);
        View requireViewById8 = view2.requireViewById(R.id.larger_cta_top_buffer);
        0qQ.A07(requireViewById8);
        C256053v9 r3 = new C256053v9(requireViewById8);
        ? obj = new Object();
        obj.A02 = 2b1.A01(view2.requireViewById(R.id.feed_carousel_showcase_card_stub), false, false);
        obj.A01 = AnonymousClass1Nd.A00(userSession2);
        return new C262804Gb(requireViewById4, reboundViewPager, 2b1.A01(view2.requireViewById(R.id.carousel_peak_scrim_overlay), false, false), (SimpleZoomableViewContainer) requireViewById, r14, r7, r15, obj, r6, r8, r50, new C274084ng(view2), r08, r06, r3, A00, (IgProgressImageView) requireViewById3, r02, r03, r04, r05, r5, r4, r0, r07, (MediaFrameLayout) requireViewById2);
    }

    public static final void A01(Context context, UserSession userSession, C282555Dn r27, C274114nj r28, C274154nn r29, C262804Gb r30, AnonymousClass4DU r31, AnonymousClass3W1 r32) {
        C17428VVh vVh;
        C262804Gb r8 = r30;
        IgProgressImageView igProgressImageView = r8.A0F;
        boolean A0G = igProgressImageView.getIgImageView().A0G();
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        C274154nn r9 = r29;
        boolean z = false;
        Context context2 = context;
        C282555Dn r17 = r27;
        AnonymousClass3W1 r7 = r32;
        C274114nj r25 = r28;
        if (!r9.A0V || r9.A0W || r27 == null) {
            AnonymousClass3VF r4 = r8.A0I;
            AnonymousClass3VE r0 = r4.A05;
            if (r0 != null) {
                r0.A00();
                if (1sx.A0F(userSession, r9.A0A, r7)) {
                    VC3.A00(r8.A0A);
                } else {
                    C274084ng r1 = r8.A0A;
                    if (r1.A01.CVM() && (vVh = r1.A00) != null) {
                        vVh.A01.setVisibility(8);
                        vVh.A00.setVisibility(8);
                    }
                    AnonymousClass3V9 r13 = r4.A01;
                    if (r13 != null) {
                        AnonymousClass9IS r14 = r9.A04;
                        C262904Gl r3 = (C262904Gl) ((C62320sa) r14.A02).invoke();
                        C262864Gh BR1 = r25.BR1();
                        0sL r12 = (0sL) r14.A0C;
                        AnonymousClass3V9 r02 = r4.A01;
                        if (r02 != null) {
                            C262954Gq.A00((View.OnClickListener) r12.invoke(r02, r7), BR1, (C262744Fv) ((0sL) r14.A0D).invoke(context2, r7), r3, r13);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C262964Gr.A00(r9.A05, r7, r25.BR1(), r4.A02, !182.A06(0Tu.A05, userSession, 36319884133015242L));
                AnonymousClass3V9 r2 = r8.A0G;
                C262864Gh BR12 = r25.BR1();
                C262994Gu BYI = r25.BYI();
                AnonymousClass9IS r15 = r9.A04;
                C263024Gx.A00((AnonymousClass9J0) ((0sP) r15.A0E).invoke(context2), userSession, BYI, r7, BR12, r2);
                AnonymousClass3V9 r33 = r8.A0H;
                AnonymousClass4H1.A00(context2, (C376449Ia) ((0sP) r15.A0F).invoke(context2), r25.BR1(), r33);
                if (((Boolean) ((C62320sa) r15.A0G).invoke()).booleanValue()) {
                    AnonymousClass50X r16 = (AnonymousClass50X) ((0sP) r15.A0B).invoke(r7);
                    AnonymousClass3VC r03 = r4.A00;
                    if (r03 != null) {
                        AnonymousClass4H2.A01(r16, r03, A0G);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    AnonymousClass3VC r04 = r4.A00;
                    if (r04 != null) {
                        AnonymousClass4H2.A00(r7, r04, false);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            AnonymousClass3VF r18 = r8.A0I;
            AnonymousClass3V9 r05 = r18.A01;
            if (r05 != null) {
                r05.A0A();
                AnonymousClass3VE r06 = r18.A05;
                if (r06 != null) {
                    C71662eb r19 = r06.A00;
                    r19.A01().setVisibility(0);
                    View A01 = r19.A01();
                    0qQ.A07(A01);
                    boolean z2 = r9.A0c;
                    String str = r9.A0J;
                    Map map = r9.A0P;
                    Map map2 = r9.A0Q;
                    Map map3 = r9.A0O;
                    LOQ loq = LOQ.A00;
                    String str2 = r9.A0L;
                    1Xj r07 = r9.A0A;
                    if (r07 != null && r07.A5G()) {
                        z = true;
                    }
                    boolean A012 = loq.A01(userSession, str2, z);
                    boolean z3 = z2;
                    C64190LSx.A01(A01, userSession, r17, r9.A0D, str, map, map2, map3, z3, A012);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (!A0G && r9.A0R) {
            IgProgressImageView igProgressImageView2 = igProgressImageView;
            igProgressImageView2.A0A(new C299405v6(context2, userSession, r17, r25, r9, r8, r31, r7), R.id.listener_id_for_media_tag_indicator);
        }
    }

    /* JADX WARNING: type inference failed for: r12v18, types: [X.TcD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v292, types: [X.TlI, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a4, code lost:
        r25 = X.00k.A0a(r1);
        r0 = r26.Aeh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05ac, code lost:
        if (r0 == null) goto L_0x0756;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05ae, code lost:
        r1 = r0.AhG();
        r0 = r26.Aeh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05b6, code lost:
        if (r0 == null) goto L_0x0750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05b8, code lost:
        r12 = new X.C15050ULg(r1, r0.AhG(), 3);
        r0 = r26.Af0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05c6, code lost:
        if (r0 == null) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05c8, code lost:
        r14 = r0.CAf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05cc, code lost:
        r13 = X.C16550Uwx.values();
        r10 = r13.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05d3, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05d6, code lost:
        if (r9 >= r10) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05d8, code lost:
        r8 = r13[r9];
        r1 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05dc, code lost:
        if (r14 == null) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05e2, code lost:
        if (r1 != r14.intValue()) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05e5, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05e8, code lost:
        r8 = X.C17155VKh.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05ea, code lost:
        r10 = new X.N4R(r8);
        r0 = r26.Abh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05f3, code lost:
        if (r0 == null) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05f5, code lost:
        r0 = r0.ByA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05f9, code lost:
        if (r0 == null) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05fb, code lost:
        r15 = java.lang.Long.valueOf((long) r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0604, code lost:
        r8 = X.AnonymousClass05K.A00(3);
        r1 = r8.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x060b, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x060e, code lost:
        if (r0 >= r1) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0610, code lost:
        r9 = r8[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0616, code lost:
        switch(r9.intValue()) {
            case 1: goto L_0x061c;
            case 2: goto L_0x061f;
            default: goto L_0x0619;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0619, code lost:
        r23 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x061c, code lost:
        r23 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x061f, code lost:
        r23 = 4000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0621, code lost:
        if (r15 == null) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0624, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x062c, code lost:
        if (r23 != r15.longValue()) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x062e, code lost:
        r0 = r26.Abh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0632, code lost:
        if (r0 == null) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0634, code lost:
        r8 = r0.Byh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0638, code lost:
        r11 = new X.C61074JwC(r10, new X.N4R(r9, r8, 39), r12, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0647, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x064a, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x064d, code lost:
        r10 = r4.A04;
        X.0qQ.A0B(r10, 0);
        r28 = r10.A00;
        r9 = r28.getView().findViewById(com.instagram.android.R.id.screenshots_card_gradient_overlay);
        r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
        r12 = (X.C15050ULg) r11.A01;
        r9.setBackground(new android.graphics.drawable.GradientDrawable(r8, new int[]{X.C18225Vnp.A00(r12.A01, 0), X.C18225Vnp.A00(r12.A00, 0)}));
        r9 = r28.getView().findViewById(com.instagram.android.R.id.screenshots_card_image_container);
        X.0qQ.A07(r9);
        r9 = (android.view.ViewGroup) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0693, code lost:
        if (r9.getChildCount() != 0) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0695, code lost:
        r25 = ((java.util.List) r11.A03).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06a1, code lost:
        if (r25.hasNext() == false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06a3, code lost:
        r8 = (X.C61030JvU) r25.next();
        r24 = r10.A03.getContext();
        X.0qQ.A07(r24);
        r1 = new com.instagram.common.ui.base.IgSimpleImageView(r24);
        r13 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        r12 = r10.A01;
        r0 = r10.A02;
        r13.setMargins(r12, r0, r12, r0);
        r1.setLayoutParams(r13);
        r1.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        r23 = X.SUv.A01(r24);
        r13 = X.QHN.A00(new X.QHN(r23.A01, r23.A02, r23, android.graphics.drawable.Drawable.class), r8.A06);
        r0 = com.bumptech.glide.load.resource.bitmap.RoundedCorners.A01;
        r0 = (java.lang.Number) r8.A04;
        r14 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06fa, code lost:
        if (r0 == null) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06fc, code lost:
        r12 = r0.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0702, code lost:
        if (r12 > 0.0f) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0704, code lost:
        r12 = 16.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0706, code lost:
        r12 = new java.lang.Object();
        r0 = new X.TA2();
        X.C9217RTu.A00(r12);
        r0.A00 = r12;
        ((X.QHN) r13.A0D(new com.bumptech.glide.load.resource.bitmap.RoundedCorners((int) X.0nA.A00(r24, r12)), true)).A0L(r0).A0N(r1);
        r9.addView(r1);
        r13 = X.C18225Vnp.A00(r8.A05, 0);
        r0 = (java.lang.Number) r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x073f, code lost:
        if (r0 == null) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0741, code lost:
        r14 = r0.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0745, code lost:
        r1.setImageDrawable(new X.C14655U0b(r13, -1.0f * r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r0 = new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0756, code lost:
        r0 = new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x077d, code lost:
        r14 = (X.N4R) r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0781, code lost:
        if (r14 == null) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0783, code lost:
        r1 = r10.A03.getContext();
        X.0qQ.A07(r1);
        r13 = (int) X.0nA.A04(r1, 0);
        r12 = new com.instagram.common.ui.base.IgSimpleImageView(r1);
        r0 = (java.lang.Number) X.C17155VKh.A01.get(r14.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07a0, code lost:
        if (r0 == null) goto L_0x07a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07a2, code lost:
        r12.setImageResource(r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07a9, code lost:
        r8 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        r8.setMargins((int) X.0nA.A04(r1, 12), r13, (int) X.0nA.A04(r1, 36), r13);
        r12.setLayoutParams(r8);
        r9.addView(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07c7, code lost:
        r9.clearAnimation();
        r12 = new android.os.Handler(android.os.Looper.getMainLooper());
        r8 = new X.C45987DHq(new X.C58195Inz(29, r11, r9, r10));
        r0 = (X.N4R) r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x07e3, code lost:
        if (r0 == null) goto L_0x08a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07e5, code lost:
        r0 = (java.lang.Number) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07e9, code lost:
        if (r0 == null) goto L_0x08a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07eb, code lost:
        r0 = (long) r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07f0, code lost:
        r12.postDelayed(r8, r0);
        r28.getView().findViewById(com.instagram.android.R.id.screenshots_card_scroll_view).setOnTouchListener(new X.C18894WBm(r5, r4, r38));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08a5, code lost:
        r0 = 1000;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0a33  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r44, android.view.View r45, X.C275664qi r46, com.instagram.common.session.UserSession r47, X.C282555Dn r48, X.C274114nj r49, X.C274154nn r50, X.AnonymousClass4DU r51, X.AnonymousClass4DU r52, X.AnonymousClass3W1 r53) {
        /*
            r43 = this;
            r22 = r45
            r20 = r44
            r6 = 0
            r18 = 1
            r5 = r50
            r0 = r18
            X.0qQ.A0B(r5, r0)
            r1 = 2
            r38 = r53
            r0 = r38
            X.0qQ.A0B(r0, r1)
            r1 = 3
            r40 = r51
            r0 = r40
            X.0qQ.A0B(r0, r1)
            r1 = 5
            r0 = r20
            X.0qQ.A0B(r0, r1)
            r1 = 6
            r42 = r47
            r0 = r42
            X.0qQ.A0B(r0, r1)
            r1 = 7
            r39 = r52
            r0 = r39
            X.0qQ.A0B(r0, r1)
            r19 = 8
            r41 = r49
            r1 = r19
            r0 = r41
            X.0qQ.A0B(r0, r1)
            java.lang.Object r4 = r22.getTag()
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x0a39
            X.4Gb r4 = (X.C262804Gb) r4
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x0189
            java.lang.Integer r0 = r5.A0I
            if (r0 == 0) goto L_0x006c
            int r2 = r0.intValue()
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r1 = r4.A02
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r2
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 17
            r1.gravity = r0
        L_0x006c:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r4.A0J
            android.content.res.Resources r1 = r20.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
        L_0x007a:
            r0 = r18
            r2.A04 = r0
            r2.A01 = r1
        L_0x0080:
            X.4G9 r7 = r4.A09
            if (r7 == 0) goto L_0x009b
            X.1Xj r1 = r5.A0B
            r0 = r42
            boolean r0 = X.C262574Fa.A00(r0, r1)
            if (r0 == 0) goto L_0x009b
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r1 = r4.A02
            X.0eM r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setBackground(r0)
        L_0x009b:
            X.4no r7 = new X.4no
            r1 = r38
            r0 = r42
            r7.<init>(r0, r5, r4, r1)
            r2.setOnTouchListener(r7)
            boolean r0 = r5.A0S
            r21 = r0
            if (r0 == 0) goto L_0x00b7
            X.W9i r1 = new X.W9i
            r0 = r38
            r1.<init>(r5, r4, r0)
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x00b7:
            com.instagram.feed.widget.IgProgressImageView r0 = r4.A0F
            r37 = r0
            com.instagram.common.ui.widget.imageview.IgImageView r24 = r37.getIgImageView()
            java.lang.String r0 = r5.A0K
            r36 = r0
            r1 = r24
            r1.setTransitionName(r0)
            android.view.ViewGroup$LayoutParams r1 = r37.getLayoutParams()
            r27 = -1
            r0 = r27
            r1.width = r0
            X.9IS r0 = r5.A04
            r35 = r0
            java.lang.Object r0 = r0.A04
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            r1 = 2131435565(0x7f0b202d, float:1.8492976E38)
            X.4nu r7 = new X.4nu
            r0 = r38
            r7.<init>(r5, r4, r0)
            r0 = r37
            r0.A0A(r7, r1)
            X.3gz r7 = new X.3gz
            r7.<init>()
            r0.setProgressiveImageConfig(r7)
            X.4nv r7 = new X.4nv
            r0 = r38
            r7.<init>(r0)
            r0 = r37
            android.util.SparseArray r0 = r0.A0D
            r0.put(r1, r7)
            r0 = r38
            r0.A0U = r6
            X.3fX r8 = r5.A0C
            r17 = 0
            r7 = r40
            r1 = r37
            r0 = r18
            X.C247843h0.A01(r7, r8, r1, r6, r0)
            float r0 = r5.A00
            r2.A00 = r0
            X.4nc r9 = r4.A05
            X.3oV r0 = r9.A03
            r23 = r0
            r1 = r19
            r0.setVisibility(r1)
            X.3v9 r11 = r4.A0D
            X.9J3 r10 = r5.A06
            java.lang.String r12 = r40.getModuleName()
            X.1Xj r0 = r5.A0A
            r16 = r0
            if (r10 == 0) goto L_0x0186
            java.lang.String r8 = r10.A03
        L_0x0132:
            r7 = r0
            r1 = r20
            r0 = r42
            int r1 = X.C256073vB.A00(r1, r0, r7, r12, r8)
            r0 = r38
            X.C256083vC.A00(r10, r11, r0, r1)
            X.4nd r8 = r4.A03
            X.3oV r0 = r8.A07
            r28 = r0
            r1 = r19
            r0.setVisibility(r1)
            X.4nf r7 = r4.A06
            X.0qQ.A0B(r7, r6)
            X.3oV r0 = r7.A02
            r0.setVisibility(r1)
            android.view.ViewGroup r11 = r7.A00
            if (r11 == 0) goto L_0x01c1
            int r15 = r11.getChildCount()
            r10 = 0
        L_0x015e:
            if (r10 >= r15) goto L_0x01bd
            android.view.View r12 = r11.getChildAt(r10)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r12, r0)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r14 = r12.getChildCount()
            r1 = 0
        L_0x0170:
            if (r1 >= r14) goto L_0x0183
            android.view.View r13 = r12.getChildAt(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView"
            X.0qQ.A0C(r13, r0)
            r0 = r19
            r13.setVisibility(r0)
            int r1 = r1 + 1
            goto L_0x0170
        L_0x0183:
            int r10 = r10 + 1
            goto L_0x015e
        L_0x0186:
            r8 = r17
            goto L_0x0132
        L_0x0189:
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r0 = r4.A02
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x01a5
            java.lang.Integer r0 = r5.A0I
            if (r0 == 0) goto L_0x01b1
            int r0 = r0.intValue()
        L_0x0199:
            r1.width = r0
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x01a5
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 16
            r1.gravity = r0
        L_0x01a5:
            java.lang.Float r0 = r5.A0H
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = r4.A0J
            if (r0 == 0) goto L_0x01b3
            float r1 = r0.floatValue()
            goto L_0x007a
        L_0x01b1:
            r0 = -1
            goto L_0x0199
        L_0x01b3:
            r2.A04 = r6
            r0 = 0
            r2.A01 = r0
            r0 = 0
            r2.A02 = r0
            goto L_0x0080
        L_0x01bd:
            r0 = r17
            r7.A00 = r0
        L_0x01c1:
            boolean r0 = r5.A0a
            if (r0 == 0) goto L_0x01d0
            r0 = r35
            java.lang.Object r0 = r0.A07
            X.0sP r0 = (X.0sP) r0
            r1 = r20
            r0.invoke(r1)
        L_0x01d0:
            boolean r0 = r5.A0U
            if (r0 == 0) goto L_0x0239
            X.4qh r11 = r5.A08
            if (r11 == 0) goto L_0x0239
            com.instagram.common.typedurl.ImageUrl r10 = r5.A09
            if (r10 == 0) goto L_0x0a33
            android.widget.TextView r0 = r9.A01
            if (r0 != 0) goto L_0x01ef
            android.view.View r1 = r23.getView()
            r0 = 2131440941(0x7f0b352d, float:1.850388E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.A01 = r0
        L_0x01ef:
            android.widget.TextView r0 = r9.A00
            if (r0 != 0) goto L_0x0202
            android.view.View r1 = r23.getView()
            r0 = 2131440940(0x7f0b352c, float:1.8503878E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.A00 = r0
        L_0x0202:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A02
            if (r0 != 0) goto L_0x0215
            android.view.View r1 = r23.getView()
            r0 = 2131440942(0x7f0b352e, float:1.8503882E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r9.A02 = r0
        L_0x0215:
            android.widget.TextView r1 = r9.A01
            if (r1 == 0) goto L_0x0220
            java.lang.String r0 = r11.BZr()
            r1.setText(r0)
        L_0x0220:
            android.widget.TextView r1 = r9.A00
            if (r1 == 0) goto L_0x022b
            java.lang.String r0 = r11.BZp()
            r1.setText(r0)
        L_0x022b:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r9.A02
            if (r1 == 0) goto L_0x0234
            r0 = r40
            r1.setUrl(r10, r0)
        L_0x0234:
            r0 = r23
            r0.setVisibility(r6)
        L_0x0239:
            if (r46 == 0) goto L_0x0289
            int r1 = r5.A02
            int r0 = r5.A01
            int r0 = r0 - r18
            if (r1 != r0) goto L_0x0289
            X.XAe r0 = r46.BSn()
            if (r0 == 0) goto L_0x0289
            java.util.List r0 = r0.BcE()
            if (r0 == 0) goto L_0x0289
            java.util.Iterator r13 = r0.iterator()
        L_0x0253:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0289
            java.lang.Object r0 = r13.next()
            X.XAo r0 = (X.C21035XAo) r0
            java.lang.String r12 = r0.getUrl()
            if (r12 == 0) goto L_0x0253
            android.content.Context r0 = r37.getContext()
            X.Sk4 r11 = X.SUv.A01(r0)
            java.lang.Class<android.graphics.drawable.Drawable> r10 = android.graphics.drawable.Drawable.class
            X.SUv r9 = r11.A02
            android.content.Context r1 = r11.A01
            X.QHN r0 = new X.QHN
            r0.<init>(r1, r9, r11, r10)
            X.QHN r9 = X.QHN.A00(r0, r12)
            X.Sk4 r0 = r9.A0A
            X.QHQ r1 = new X.QHQ
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = X.C10061Rly.A01
            X.QHN.A02(r9, r9, r1, r0)
            goto L_0x0253
        L_0x0289:
            X.4qi r0 = r5.A07
            r23 = r0
            if (r0 == 0) goto L_0x0772
            int r1 = r5.A02
            int r0 = r5.A01
            int r0 = r0 - r18
            if (r1 != r0) goto L_0x0772
            X.XAp r0 = r23.BSm()
            if (r0 == 0) goto L_0x052c
            r15 = 2
            r1 = 0
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x02a9 }
            if (r0 == 0) goto L_0x02a9
            java.lang.String r1 = r0.getTextColor()     // Catch:{ Exception -> 0x02a9 }
        L_0x02a9:
            int r0 = X.C17160VKm.A00
            r0 = r27
            int r9 = X.C18225Vnp.A00(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r8.A06
            if (r11 != 0) goto L_0x02c4
            android.view.View r1 = r28.getView()
            r0 = 2131434688(0x7f0b1cc0, float:1.8491197E38)
            android.view.View r11 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = (com.instagram.common.ui.widget.imageview.IgImageView) r11
            r8.A06 = r11
        L_0x02c4:
            if (r11 == 0) goto L_0x0350
            r1 = 0
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x02d7 }
            if (r0 == 0) goto L_0x02d7
            X.XAX r0 = r0.C6r()     // Catch:{ Exception -> 0x02d7 }
            if (r0 == 0) goto L_0x02d7
            java.lang.String r1 = r0.Ah8()     // Catch:{ Exception -> 0x02d7 }
        L_0x02d7:
            int r0 = X.C17160VKm.A00
            int r10 = X.C18225Vnp.A00(r1, r0)
            r0 = 0
            X.XAp r1 = r23.BSm()     // Catch:{ Exception -> 0x02ee }
            if (r1 == 0) goto L_0x030d
            X.XAX r1 = r1.C6r()     // Catch:{ Exception -> 0x02ee }
            if (r1 == 0) goto L_0x030d
            java.lang.Float r0 = r1.Ah9()     // Catch:{ Exception -> 0x02ee }
        L_0x02ee:
            if (r0 == 0) goto L_0x030d
            float r1 = r0.floatValue()
        L_0x02f4:
            X.U0b r0 = new X.U0b
            r0.<init>(r10, r1)
            r11.setBackground(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r11.setScaleType(r0)
            android.view.View r0 = r8.A08
            android.content.Context r0 = r0.getContext()
            X.Sk4 r13 = X.SUv.A01(r0)
            r1 = 0
            goto L_0x0310
        L_0x030d:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02f4
        L_0x0310:
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x0320 }
            if (r0 == 0) goto L_0x0320
            X.XAX r0 = r0.C6r()     // Catch:{ Exception -> 0x0320 }
            if (r0 == 0) goto L_0x0320
            java.lang.String r1 = r0.C75()     // Catch:{ Exception -> 0x0320 }
        L_0x0320:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r1, r0)
            android.net.Uri r14 = X.0cp.A03(r1)
            java.lang.Class<android.graphics.drawable.Drawable> r12 = android.graphics.drawable.Drawable.class
            X.SUv r10 = r13.A02
            android.content.Context r0 = r13.A01
            X.QHN r1 = new X.QHN
            r1.<init>(r0, r10, r13, r12)
            X.QHN r1 = X.QHN.A00(r1, r14)
            android.graphics.drawable.Drawable r0 = r24.getDrawable()
            X.TA3 r10 = r1.A06(r0)
            X.S3l r1 = X.C10977S3l.A01
            X.QHD r0 = new X.QHD
            r0.<init>()
            X.TA3 r0 = r10.A0B(r0, r1)
            X.QHN r0 = (X.QHN) r0
            r0.A0N(r11)
        L_0x0350:
            com.instagram.common.ui.base.IgSimpleImageView r12 = r8.A01
            if (r12 != 0) goto L_0x0363
            android.view.View r1 = r28.getView()
            r0 = 2131434685(0x7f0b1cbd, float:1.849119E38)
            android.view.View r12 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r12 = (com.instagram.common.ui.base.IgSimpleImageView) r12
            r8.A01 = r12
        L_0x0363:
            if (r12 == 0) goto L_0x03ba
            android.graphics.drawable.GradientDrawable$Orientation r11 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0 = 0
            X.XAp r1 = r23.BSm()     // Catch:{ Exception -> 0x0378 }
            if (r1 == 0) goto L_0x0378
            X.XAd r1 = r1.Aeh()     // Catch:{ Exception -> 0x0378 }
            if (r1 == 0) goto L_0x0378
            java.lang.String r0 = r1.C8N()     // Catch:{ Exception -> 0x0378 }
        L_0x0378:
            r10 = 2131100201(0x7f060229, float:1.7812777E38)
            int r1 = X.C18225Vnp.A00(r0, r10)
            r0 = 0
            X.XAp r13 = r23.BSm()     // Catch:{ Exception -> 0x0390 }
            if (r13 == 0) goto L_0x0390
            X.XAd r13 = r13.Aeh()     // Catch:{ Exception -> 0x0390 }
            if (r13 == 0) goto L_0x0390
            java.lang.String r0 = r13.AhG()     // Catch:{ Exception -> 0x0390 }
        L_0x0390:
            int r0 = X.C18225Vnp.A00(r0, r10)
            int[] r1 = new int[]{r1, r0}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r11, r1)
            r12.setBackground(r0)
            r0 = 0
            X.XAp r1 = r23.BSm()     // Catch:{ Exception -> 0x03b1 }
            if (r1 == 0) goto L_0x03e0
            X.XAd r1 = r1.Aeh()     // Catch:{ Exception -> 0x03b1 }
            if (r1 == 0) goto L_0x03e0
            java.lang.Float r0 = r1.AbH()     // Catch:{ Exception -> 0x03b1 }
        L_0x03b1:
            if (r0 == 0) goto L_0x03e0
            float r0 = r0.floatValue()
        L_0x03b7:
            r12.setAlpha(r0)
        L_0x03ba:
            com.instagram.common.ui.base.IgSimpleImageView r13 = r8.A00
            if (r13 != 0) goto L_0x03cd
            android.view.View r1 = r28.getView()
            r0 = 2131434682(0x7f0b1cba, float:1.8491185E38)
            android.view.View r13 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r13 = (com.instagram.common.ui.base.IgSimpleImageView) r13
            r8.A00 = r13
        L_0x03cd:
            if (r13 == 0) goto L_0x0434
            X.XWo r0 = X.XYL.A00
            java.lang.String r1 = r0.toString()
            android.view.View[] r0 = new android.view.View[]{r24}
            X.Vc0 r12 = new X.Vc0
            r12.<init>(r13, r1, r0)
            r0 = 0
            goto L_0x03e4
        L_0x03e0:
            r0 = 1063675494(0x3f666666, float:0.9)
            goto L_0x03b7
        L_0x03e4:
            X.XAp r1 = r23.BSm()     // Catch:{ Exception -> 0x03f4 }
            if (r1 == 0) goto L_0x0454
            X.XAd r1 = r1.Aeh()     // Catch:{ Exception -> 0x03f4 }
            if (r1 == 0) goto L_0x0454
            java.lang.Integer r0 = r1.AgU()     // Catch:{ Exception -> 0x03f4 }
        L_0x03f4:
            if (r0 == 0) goto L_0x0454
            int r0 = r0.intValue()
        L_0x03fa:
            r12.A00 = r0
            r0 = 5
            r12.A02 = r0
            android.view.View r0 = r8.A08
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            int r0 = X.AnonymousClass0nB.A01(r10)
            int r14 = -r0
            int r14 = r14 / r15
            int r0 = X.AnonymousClass0nB.A00(r10)
            int r11 = -r0
            int r11 = r11 / r15
            int r0 = X.AnonymousClass0nB.A01(r10)
            int r1 = r0 * 2
            int r0 = X.AnonymousClass0nB.A00(r10)
            int r0 = r0 * 2
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r14, r11, r1, r0)
            r12.A05 = r10
            X.U1A r0 = new X.U1A
            r0.<init>(r12)
            r1 = r18
            r0.setVisible(r1, r6)
            r13.setBackground(r0)
        L_0x0434:
            com.instagram.common.ui.base.IgTextView r11 = r8.A04
            if (r11 != 0) goto L_0x0447
            android.view.View r1 = r28.getView()
            r0 = 2131434689(0x7f0b1cc1, float:1.84912E38)
            android.view.View r11 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgTextView r11 = (com.instagram.common.ui.base.IgTextView) r11
            r8.A04 = r11
        L_0x0447:
            if (r11 == 0) goto L_0x0472
            android.view.View r0 = r8.A08
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            r1 = 0
            goto L_0x0457
        L_0x0454:
            r0 = 20
            goto L_0x03fa
        L_0x0457:
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x0461 }
            if (r0 == 0) goto L_0x0461
            X.XAl r1 = r0.C7f()     // Catch:{ Exception -> 0x0461 }
        L_0x0461:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.api.schemas.NativeInfoCardText"
            X.0qQ.A0C(r1, r0)
            X.Uvs r0 = X.C16496Uvs.HEADER
            android.text.SpannableStringBuilder r0 = X.C18225Vnp.A01(r10, r1, r0)
            r11.setText(r0)
            r11.setTextColor(r9)
        L_0x0472:
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            if (r0 != 0) goto L_0x0485
            android.view.View r1 = r28.getView()
            r0 = 2131434684(0x7f0b1cbc, float:1.8491189E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r8.A02 = r0
        L_0x0485:
            r1 = 0
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x0490 }
            if (r0 == 0) goto L_0x049f
            java.lang.String r1 = r0.getDescription()     // Catch:{ Exception -> 0x0490 }
        L_0x0490:
            if (r1 == 0) goto L_0x049f
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            if (r0 == 0) goto L_0x049f
            r0.setText(r1)
            r0.setTextColor(r9)
            r0.setVisibility(r6)
        L_0x049f:
            r10 = 0
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x04aa }
            if (r0 == 0) goto L_0x04aa
            java.lang.String r10 = r0.BsT()     // Catch:{ Exception -> 0x04aa }
        L_0x04aa:
            com.instagram.common.ui.base.IgView r0 = r8.A05
            if (r0 != 0) goto L_0x04bd
            android.view.View r1 = r28.getView()
            r0 = 2131434687(0x7f0b1cbf, float:1.8491195E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgView r0 = (com.instagram.common.ui.base.IgView) r0
            r8.A05 = r0
        L_0x04bd:
            if (r0 == 0) goto L_0x04ce
            if (r10 == 0) goto L_0x04ce
            boolean r1 = X.00l.A0W(r10)
            if (r1 != 0) goto L_0x04ce
            int r1 = X.C18225Vnp.A00(r10, r9)
            r0.setBackgroundColor(r1)
        L_0x04ce:
            com.instagram.common.ui.base.IgTextView r0 = r8.A03
            if (r0 != 0) goto L_0x04e1
            android.view.View r1 = r28.getView()
            r0 = 2131434686(0x7f0b1cbe, float:1.8491193E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r8.A03 = r0
        L_0x04e1:
            r12 = 0
            X.XAp r0 = r23.BSm()     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x0808
            java.util.List r12 = r0.BSk()     // Catch:{ Exception -> 0x04ec }
        L_0x04ec:
            if (r12 == 0) goto L_0x0808
            com.instagram.common.ui.base.IgTextView r11 = r8.A03
            if (r11 == 0) goto L_0x0808
            android.view.View r0 = r8.A08
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            X.Uvs r8 = X.C16496Uvs.METADATA
            java.lang.String r0 = ""
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0508:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0521
            java.lang.Object r0 = r12.next()
            X.XAl r0 = (X.C21032XAl) r0
            android.text.SpannableStringBuilder r0 = X.C18225Vnp.A01(r10, r0, r8)
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            goto L_0x0508
        L_0x0521:
            r11.setText(r1)
            r11.setVisibility(r6)
            r11.setTextColor(r9)
            goto L_0x0808
        L_0x052c:
            X.XAe r26 = r23.BSn()
            if (r26 == 0) goto L_0x080d
            java.util.List r0 = r26.BcE()
            if (r0 == 0) goto L_0x080d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x080d
            X.XAd r0 = r26.Aeh()
            if (r0 == 0) goto L_0x080d
            java.util.List r8 = r26.BcE()     // Catch:{ NullPointerException -> 0x0768 }
            if (r8 == 0) goto L_0x075c
            r0 = 10
            int r0 = X.0Yv.A1E(r8, r0)     // Catch:{ NullPointerException -> 0x0768 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x0768 }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x0768 }
            java.util.Iterator r9 = r8.iterator()     // Catch:{ NullPointerException -> 0x0768 }
        L_0x0559:
            boolean r0 = r9.hasNext()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x05a4
            java.lang.Object r0 = r9.next()     // Catch:{ NullPointerException -> 0x0768 }
            X.XAo r0 = (X.C21035XAo) r0     // Catch:{ NullPointerException -> 0x0768 }
            java.lang.String r31 = r0.getUrl()     // Catch:{ NullPointerException -> 0x0768 }
            if (r31 == 0) goto L_0x059d
            java.lang.Integer r8 = r0.CGY()     // Catch:{ NullPointerException -> 0x0768 }
            if (r8 == 0) goto L_0x0596
            int r33 = r8.intValue()     // Catch:{ NullPointerException -> 0x0768 }
            java.lang.Integer r8 = r0.BCu()     // Catch:{ NullPointerException -> 0x0768 }
            if (r8 == 0) goto L_0x0762
            int r34 = r8.intValue()     // Catch:{ NullPointerException -> 0x0768 }
            java.lang.Float r29 = r0.ArU()     // Catch:{ NullPointerException -> 0x0768 }
            java.lang.String r32 = r0.Ah8()     // Catch:{ NullPointerException -> 0x0768 }
            java.lang.Float r30 = r0.AhA()     // Catch:{ NullPointerException -> 0x0768 }
            X.JvU r0 = new X.JvU     // Catch:{ NullPointerException -> 0x0768 }
            r28 = r0
            r28.<init>((java.lang.Float) r29, (java.lang.Float) r30, (java.lang.String) r31, (java.lang.String) r32, (int) r33, (int) r34)     // Catch:{ NullPointerException -> 0x0768 }
            r1.add(r0)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x0559
        L_0x0596:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0768 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x0767
        L_0x059d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0768 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x0767
        L_0x05a4:
            java.util.List r25 = X.00k.A0a(r1)     // Catch:{ NullPointerException -> 0x0768 }
            X.XAd r0 = r26.Aeh()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x0756
            java.lang.String r1 = r0.AhG()     // Catch:{ NullPointerException -> 0x0768 }
            X.XAd r0 = r26.Aeh()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x0750
            java.lang.String r0 = r0.AhG()     // Catch:{ NullPointerException -> 0x0768 }
            r11 = 3
            X.ULg r12 = new X.ULg     // Catch:{ NullPointerException -> 0x0768 }
            r12.<init>(r1, r0, r11)     // Catch:{ NullPointerException -> 0x0768 }
            X.XAP r0 = r26.Af0()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x05d3
            java.lang.Integer r14 = r0.CAf()     // Catch:{ NullPointerException -> 0x0768 }
        L_0x05cc:
            X.Uwx[] r13 = X.C16550Uwx.values()     // Catch:{ NullPointerException -> 0x0768 }
            int r10 = r13.length     // Catch:{ NullPointerException -> 0x0768 }
            r9 = 0
            goto L_0x05d6
        L_0x05d3:
            r14 = r17
            goto L_0x05cc
        L_0x05d6:
            if (r9 >= r10) goto L_0x05e8
            r8 = r13[r9]     // Catch:{ NullPointerException -> 0x0768 }
            int r1 = r8.A00     // Catch:{ NullPointerException -> 0x0768 }
            if (r14 == 0) goto L_0x05e5
            int r0 = r14.intValue()     // Catch:{ NullPointerException -> 0x0768 }
            if (r1 != r0) goto L_0x05e5
            goto L_0x05ea
        L_0x05e5:
            int r9 = r9 + 1
            goto L_0x05d6
        L_0x05e8:
            X.Uwx r8 = X.C17155VKh.A00     // Catch:{ NullPointerException -> 0x0768 }
        L_0x05ea:
            X.N4R r10 = new X.N4R     // Catch:{ NullPointerException -> 0x0768 }
            r10.<init>((X.C16550Uwx) r8)     // Catch:{ NullPointerException -> 0x0768 }
            X.XAQ r0 = r26.Abh()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x060b
            java.lang.Integer r0 = r0.ByA()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x060b
            int r0 = r0.intValue()     // Catch:{ NullPointerException -> 0x0768 }
            long r0 = (long) r0     // Catch:{ NullPointerException -> 0x0768 }
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException -> 0x0768 }
        L_0x0604:
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r11)     // Catch:{ NullPointerException -> 0x0768 }
            int r1 = r8.length     // Catch:{ NullPointerException -> 0x0768 }
            r0 = 0
            goto L_0x060e
        L_0x060b:
            r15 = r17
            goto L_0x0604
        L_0x060e:
            if (r0 >= r1) goto L_0x0624
            r9 = r8[r0]     // Catch:{ NullPointerException -> 0x0768 }
            int r11 = r9.intValue()     // Catch:{ NullPointerException -> 0x0768 }
            switch(r11) {
                case 1: goto L_0x061c;
                case 2: goto L_0x061f;
                default: goto L_0x0619;
            }     // Catch:{ NullPointerException -> 0x0768 }
        L_0x0619:
            r23 = 2000(0x7d0, double:9.88E-321)
            goto L_0x0621
        L_0x061c:
            r23 = 3000(0xbb8, double:1.482E-320)
            goto L_0x0621
        L_0x061f:
            r23 = 4000(0xfa0, double:1.9763E-320)
        L_0x0621:
            if (r15 == 0) goto L_0x064a
            goto L_0x0626
        L_0x0624:
            r9 = 0
            goto L_0x062e
        L_0x0626:
            long r13 = r15.longValue()     // Catch:{ NullPointerException -> 0x0768 }
            int r11 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x064a
        L_0x062e:
            X.XAQ r0 = r26.Abh()     // Catch:{ NullPointerException -> 0x0768 }
            if (r0 == 0) goto L_0x0647
            java.lang.Integer r8 = r0.Byh()     // Catch:{ NullPointerException -> 0x0768 }
        L_0x0638:
            r0 = 39
            X.N4R r1 = new X.N4R     // Catch:{ NullPointerException -> 0x0768 }
            r1.<init>((java.lang.Integer) r9, (java.lang.Integer) r8, (int) r0)     // Catch:{ NullPointerException -> 0x0768 }
            X.JwC r11 = new X.JwC     // Catch:{ NullPointerException -> 0x0768 }
            r0 = r25
            r11.<init>((X.N4R) r10, (X.N4R) r1, (X.C15050ULg) r12, (java.util.List) r0)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x064d
        L_0x0647:
            r8 = r17
            goto L_0x0638
        L_0x064a:
            int r0 = r0 + 1
            goto L_0x060e
        L_0x064d:
            X.4ne r10 = r4.A04
            X.0qQ.A0B(r10, r6)
            X.3oV r0 = r10.A00
            r28 = r0
            android.view.View r1 = r28.getView()
            r0 = 2131440732(0x7f0b345c, float:1.8503456E38)
            android.view.View r9 = r1.findViewById(r0)
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            java.lang.Object r12 = r11.A01
            X.ULg r12 = (X.C15050ULg) r12
            java.lang.String r0 = r12.A01
            int r1 = X.C18225Vnp.A00(r0, r6)
            java.lang.String r0 = r12.A00
            int r0 = X.C18225Vnp.A00(r0, r6)
            int[] r1 = new int[]{r1, r0}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r8, r1)
            r9.setBackground(r0)
            android.view.View r1 = r28.getView()
            r0 = 2131440733(0x7f0b345d, float:1.8503458E38)
            android.view.View r9 = r1.findViewById(r0)
            X.0qQ.A07(r9)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r0 = r9.getChildCount()
            if (r0 != 0) goto L_0x07c7
            java.lang.Object r0 = r11.A03
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r25 = r0.iterator()
        L_0x069d:
            boolean r0 = r25.hasNext()
            if (r0 == 0) goto L_0x077d
            java.lang.Object r8 = r25.next()
            X.JvU r8 = (X.C61030JvU) r8
            android.view.View r0 = r10.A03
            android.content.Context r24 = r0.getContext()
            X.0qQ.A07(r24)
            com.instagram.common.ui.base.IgSimpleImageView r1 = new com.instagram.common.ui.base.IgSimpleImageView
            r0 = r24
            r1.<init>(r0)
            r12 = -2
            X.U51 r13 = new X.U51
            r0 = r27
            r13.<init>(r12, r0)
            int r12 = r10.A01
            int r0 = r10.A02
            r13.setMargins(r12, r0, r12, r0)
            r1.setLayoutParams(r13)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r0)
            X.Sk4 r23 = X.SUv.A01(r24)
            java.lang.String r0 = r8.A06
            r26 = r0
            java.lang.Class<android.graphics.drawable.Drawable> r12 = android.graphics.drawable.Drawable.class
            r0 = r23
            X.SUv r0 = r0.A02
            r14 = r0
            r0 = r23
            android.content.Context r0 = r0.A01
            X.QHN r13 = new X.QHN
            r15 = r14
            r14 = r12
            r12 = r0
            r0 = r23
            r13.<init>(r12, r15, r0, r14)
            r12 = r26
            X.QHN r13 = X.QHN.A00(r13, r12)
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.RoundedCorners.A01
            java.lang.Object r0 = r8.A04
            java.lang.Number r0 = (java.lang.Number) r0
            r14 = 0
            if (r0 == 0) goto L_0x0704
            float r12 = r0.floatValue()
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0706
        L_0x0704:
            r12 = 1098907648(0x41800000, float:16.0)
        L_0x0706:
            r0 = r24
            float r0 = X.0nA.A00(r0, r12)
            int r0 = (int) r0
            com.bumptech.glide.load.resource.bitmap.RoundedCorners r12 = new com.bumptech.glide.load.resource.bitmap.RoundedCorners
            r12.<init>(r0)
            r0 = r18
            X.TA3 r13 = r13.A0D(r12, r0)
            X.QHN r13 = (X.QHN) r13
            X.SkH r12 = new X.SkH
            r12.<init>()
            X.QGv r0 = new X.QGv
            r0.<init>()
            X.C9217RTu.A00(r12)
            r0.A00 = r12
            X.QHN r0 = r13.A0L(r0)
            r0.A0N(r1)
            r9.addView(r1)
            java.lang.String r0 = r8.A05
            int r13 = X.C18225Vnp.A00(r0, r6)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Object r0 = r8.A03
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0745
            float r14 = r0.floatValue()
        L_0x0745:
            float r12 = r12 * r14
            X.U0b r0 = new X.U0b
            r0.<init>(r13, r12)
            r1.setImageDrawable(r0)
            goto L_0x069d
        L_0x0750:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0768 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x0767
        L_0x0756:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0768 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x0767
        L_0x075c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0768 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0768 }
            goto L_0x0767
        L_0x0762:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0768 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0768 }
        L_0x0767:
            throw r0     // Catch:{ NullPointerException -> 0x0768 }
        L_0x0768:
            r8 = move-exception
            java.lang.String r1 = "IGScreenshotsCardUtil"
            java.lang.String r0 = "Failed to parse screenshots native model"
            X.0KC.A0G(r1, r0, r8)
            goto L_0x080d
        L_0x0772:
            X.4ne r0 = r4.A04
            X.3oV r1 = r0.A00
            r0 = r19
            r1.setVisibility(r0)
            goto L_0x080d
        L_0x077d:
            java.lang.Object r14 = r11.A02
            X.N4R r14 = (X.N4R) r14
            if (r14 == 0) goto L_0x07c7
            android.view.View r0 = r10.A03
            android.content.Context r1 = r0.getContext()
            X.0qQ.A07(r1)
            float r0 = X.0nA.A04(r1, r6)
            int r13 = (int) r0
            com.instagram.common.ui.base.IgSimpleImageView r12 = new com.instagram.common.ui.base.IgSimpleImageView
            r12.<init>(r1)
            java.util.HashMap r8 = X.C17155VKh.A01
            java.lang.Object r0 = r14.A02
            java.lang.Object r0 = r8.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x07a9
            int r0 = r0.intValue()
            r12.setImageResource(r0)
        L_0x07a9:
            r0 = -2
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r0, r0)
            r0 = 12
            float r0 = X.0nA.A04(r1, r0)
            int r0 = (int) r0
            r14 = r0
            r0 = 36
            float r0 = X.0nA.A04(r1, r0)
            int r1 = (int) r0
            r8.setMargins(r14, r13, r1, r13)
            r12.setLayoutParams(r8)
            r9.addView(r12)
        L_0x07c7:
            r9.clearAnimation()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r12 = new android.os.Handler
            r12.<init>(r0)
            r1 = 29
            X.Inz r0 = new X.Inz
            r0.<init>(r1, r11, r9, r10)
            X.DHq r8 = new X.DHq
            r8.<init>(r0)
            java.lang.Object r0 = r11.A00
            X.N4R r0 = (X.N4R) r0
            if (r0 == 0) goto L_0x08a5
            java.lang.Object r0 = r0.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x08a5
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x07f0:
            r12.postDelayed(r8, r0)
            android.view.View r1 = r28.getView()
            r0 = 2131440734(0x7f0b345e, float:1.850346E38)
            android.view.View r8 = r1.findViewById(r0)
            X.WBm r1 = new X.WBm
            r0 = r38
            r1.<init>(r5, r4, r0)
            r8.setOnTouchListener(r1)
        L_0x0808:
            r0 = r28
            r0.setVisibility(r6)
        L_0x080d:
            java.util.List r11 = r5.A0N
            if (r11 == 0) goto L_0x08a9
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x08a9
            int r0 = r5.A02
            if (r0 != 0) goto L_0x08a9
            X.3oV r0 = r7.A02
            r0.setVisibility(r6)
            X.1Xj r10 = r5.A0B
            r0 = r18
            X.0qQ.A0B(r10, r0)
            android.view.ViewGroup r9 = r7.A00
            if (r9 != 0) goto L_0x083c
            X.3oV r0 = r7.A02
            android.view.View r1 = r0.getView()
            r0 = 2131441352(0x7f0b36c8, float:1.8504713E38)
            android.view.View r9 = r1.findViewById(r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r7.A00 = r9
        L_0x083c:
            if (r9 == 0) goto L_0x08a9
            r8 = 0
        L_0x083f:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x08a9
            int r0 = r9.getChildCount()
            int r0 = r0 * 2
            if (r8 >= r0) goto L_0x08a9
            int r0 = r8 / 2
            android.view.View r1 = r9.getChildAt(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Object r0 = r11.get(r8)
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.common.typedurl.ImageUrl r12 = r0.A1Q()
            int r0 = r8 % 2
            android.view.View r1 = r1.getChildAt(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView"
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            if (r12 == 0) goto L_0x0878
            r0 = r39
            r1.setUrl(r12, r0)
        L_0x0878:
            r1.setVisibility(r6)
            X.3Kp r12 = new X.3Kp
            r0 = r38
            r12.<init>(r1, r10, r0, r8)
            if (r16 == 0) goto L_0x08a2
            r0 = r16
            X.1Xy r0 = r0.A0C
            X.DUW r0 = r0.B5U()
            if (r0 == 0) goto L_0x089a
            java.util.List r0 = r0.BGH()
            if (r0 == 0) goto L_0x089a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x08a2
        L_0x089a:
            X.ANn r0 = new X.ANn
            r0.<init>(r7, r12)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x08a2:
            int r8 = r8 + 1
            goto L_0x083f
        L_0x08a5:
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x07f0
        L_0x08a9:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36318973599619869(0x8107ea00031b1d, double:3.0316033769433135E-306)
            r7 = r42
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x08e0
            boolean r0 = r5.A0X
            android.view.View r9 = r4.A00
            if (r0 == 0) goto L_0x0a24
            boolean r0 = X.AnonymousClass3HA.A00(r20)
            if (r0 == 0) goto L_0x0a15
            r0 = 37163398529679642(0x8407ea0002011a, double:3.5656211029393854E-306)
            double r0 = X.182.A00(r8, r7, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x08d1:
            double r0 = r0.doubleValue()
            int r0 = X.C55020Har.A00(r0)
            r9.setBackgroundColor(r0)
            r0 = 0
        L_0x08dd:
            r9.setVisibility(r0)
        L_0x08e0:
            r0 = r35
            java.lang.Object r7 = r0.A08
            X.0sL r7 = (X.0sL) r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            r0 = r37
            r7.invoke(r0, r1)
            r25 = r48
            r23 = r20
            r24 = r42
            r26 = r41
            r27 = r5
            r28 = r4
            r29 = r40
            r30 = r38
            A01(r23, r24, r25, r26, r27, r28, r29, r30)
            X.3VF r0 = r4.A0I
            X.3VD r7 = r0.A04
            if (r7 == 0) goto L_0x0a2d
            X.3fk r1 = r5.A0E
            boolean r0 = r5.A0e
            X.47O r10 = r41.BR2()
            r9 = r42
            r11 = r1
            r12 = r7
            r13 = r0
            r14 = r21
            X.AnonymousClass4H3.A00(r9, r10, r11, r12, r13, r14)
            X.4H4 r9 = X.AnonymousClass4H4.A00
            X.3fi r0 = r1.A05
            java.lang.String r7 = r0.A04
            X.9Ii r0 = r1.A02
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            r0 = r38
            java.lang.Object r1 = r1.invoke(r0)
            java.util.List r1 = (java.util.List) r1
            r0 = r42
            r9.A0A(r0, r7, r1)
            r0 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            r7 = r42
            boolean r1 = X.182.A06(r8, r7, r0)
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x0a0c
            if (r1 == 0) goto L_0x09ec
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r20)
            r0 = r20
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            r8 = r17
            r6 = r0
            r1 = r39
            r0 = r42
            X.2nI r6 = X.C229382nI.A01(r8, r6, r1, r0)
            r0 = r22
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.0qQ.A0A(r7)
            r1 = r0
            r0 = r42
            X.3yq r6 = X.C56312HwP.A00(r7, r1, r6, r0)
            if (r16 == 0) goto L_0x0a27
            r0 = r16
            X.4g6 r0 = r0.A07
            if (r0 == 0) goto L_0x0a27
            X.4hR r0 = r0.A01
            X.3ew r1 = r0.A01()
            X.68u r0 = X.C3034368u.A02(r8, r1)
            X.0qQ.A0A(r0)
            X.C56312HwP.A01(r0, r6)
        L_0x097d:
            X.4GZ r9 = r4.A08
            boolean r8 = r5.A0Y
            boolean r7 = r5.A0V
            com.instagram.user.model.User r6 = r5.A0G
            com.instagram.user.model.User r1 = r5.A0F
            java.lang.String r3 = r5.A0J
            java.lang.String r0 = r5.A0M
            X.4H6 r20 = r41.BYF()
            r19 = r42
            r21 = r9
            r22 = r39
            r23 = r6
            r24 = r1
            r25 = r3
            r26 = r0
            r27 = r8
            r28 = r7
            X.AnonymousClass4H7.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.4Ga r1 = r4.A07
            X.4Gu r9 = r41.BYI()
            boolean r0 = r5.A0b
            r6 = r39
            r7 = r42
            r8 = r1
            r10 = r38
            r11 = r37
            r12 = r36
            r13 = r3
            r14 = r0
            X.AnonymousClass4H8.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.4GY r3 = r4.A0B
            r0 = r35
            java.lang.Object r1 = r0.A03
            X.0sa r1 = (X.C62320sa) r1
            boolean r0 = r5.A0d
            X.AnonymousClass4H9.A00(r3, r1, r0)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x09eb
            int r0 = r5.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = r18
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "Media Item %d"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            r2.setContentDescription(r0)
        L_0x09eb:
            return
        L_0x09ec:
            X.3v7 r3 = r4.A0E
            r0 = r35
            java.lang.Object r0 = r0.A0A
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r1 = r0.invoke()
            X.3ev r1 = (X.C246633ev) r1
            r0 = r19
            float[] r0 = new float[r0]
            r7 = r40
            r8 = r1
            r9 = r3
            r10 = r0
            r11 = r18
            r12 = r6
            r13 = r6
            X.C256013v5.A02(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x097d
        L_0x0a0c:
            if (r1 != 0) goto L_0x097d
            X.3v7 r0 = r4.A0E
            X.C256013v5.A03(r0)
            goto L_0x097d
        L_0x0a15:
            r0 = 37163398529614105(0x8407ea00010119, double:3.5656211028979396E-306)
            double r0 = X.182.A00(r8, r7, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x08d1
        L_0x0a24:
            r0 = 4
            goto L_0x08dd
        L_0x0a27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0a2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0a33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0a39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GB.A02(android.content.Context, android.view.View, X.4qi, com.instagram.common.session.UserSession, X.5Dn, X.4nj, X.4nn, X.4DU, X.4DU, X.3W1):void");
    }
}
