package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6Ms  reason: invalid class name and case insensitive filesystem */
public final class C306586Ms {
    public static final C306586Ms A00 = new Object();

    public static final ViewGroup A00(ViewGroup viewGroup, C247833gz r9, UserSession userSession, C226642hc r11) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = viewGroup;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(userSession, 3);
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        if (!182.A06(0Tu.A05, userSession, 36323320106396744L)) {
            View inflate = from.inflate(R.layout.layout_netego_reel_item, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            View A01 = 2Su.A01(from, new ViewGroup.LayoutParams(-1, -1), viewGroup3, R.layout.layout_netego_reel_item, false, true);
            0qQ.A0C(A01, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A01;
        }
        C67602Mqa mqa = new C67602Mqa(viewGroup2, userSession);
        mqa.A03 = r11;
        mqa.A01 = r9;
        mqa.A0a.setLayerType(1, (Paint) null);
        viewGroup2.setTag(mqa);
        return viewGroup2;
    }

    public static final void A02(AnonymousClass0iw r12, UserSession userSession, C255773uh r14, C309426Yf r15, C67602Mqa mqa, C317286n1 r17, boolean z) {
        Context context;
        SimpleImageUrl A08;
        C71662eb r0;
        IgProgressImageView igProgressImageView;
        IgProgressImageView igProgressImageView2;
        C255773uh r9 = r14;
        1Xj r8 = r14.A0b;
        if (r8 != null) {
            C67602Mqa mqa2 = mqa;
            mqa2.A06 = r14;
            if (mqa2.A00 == null) {
                View inflate = mqa2.A0C.inflate();
                mqa2.A00 = inflate;
                if (inflate != null) {
                    mqa2.A09 = (MediaFrameLayout) inflate.requireViewById(R.id.reel_viewer_media_container);
                    ViewStub viewStub = null;
                    if (!C263454Mb.A00(mqa2.A0E, "reel_netego_viewer")) {
                        View view = mqa2.A00;
                        if (view != null) {
                            viewStub = (ViewStub) view.findViewById(R.id.reel_viewer_texture_viewstub);
                        }
                        r0 = new C71662eb(viewStub);
                    } else {
                        r0 = null;
                    }
                    mqa2.A04 = r0;
                    MediaFrameLayout mediaFrameLayout = mqa2.A09;
                    if (mediaFrameLayout != null) {
                        IgProgressImageView igProgressImageView3 = (IgProgressImageView) mediaFrameLayout.requireViewById(R.id.reel_viewer_image_view);
                        mqa2.A05 = igProgressImageView3;
                        if (igProgressImageView3 != null) {
                            igProgressImageView3.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                        IgProgressImageView igProgressImageView4 = mqa2.A05;
                        if (igProgressImageView4 != null) {
                            MediaFrameLayout mediaFrameLayout2 = mqa2.A09;
                            if (mediaFrameLayout2 != null) {
                                Context context2 = mediaFrameLayout2.getContext();
                                igProgressImageView4.setPlaceHolderColor(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_stories_loading_background)));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        IgProgressImageView igProgressImageView5 = mqa2.A05;
                        if (igProgressImageView5 != null) {
                            View view2 = mqa2.A00;
                            if (view2 != null) {
                                Drawable drawable = view2.getContext().getDrawable(R.drawable.video_determinate_progress);
                                if (drawable != null) {
                                    igProgressImageView5.setProgressBarDrawable(drawable);
                                } else {
                                    throw new IllegalArgumentException("drawable video_determinate_progress should not be null");
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        C226642hc r1 = mqa2.A03;
                        if (!(r1 == null || (igProgressImageView2 = mqa2.A05) == null)) {
                            igProgressImageView2.setPostProcessor(r1);
                        }
                        C247833gz r13 = mqa2.A01;
                        if (!(r13 == null || (igProgressImageView = mqa2.A05) == null)) {
                            igProgressImageView.setProgressiveImageConfig(r13);
                        }
                        MediaFrameLayout mediaFrameLayout3 = mqa2.A09;
                        if (mediaFrameLayout3 != null) {
                            mediaFrameLayout3.A00 = -1.0f;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            View view3 = mqa2.A00;
            if (view3 != null) {
                view3.setVisibility(0);
                C309426Yf r10 = r15;
                r15.A03(mqa2);
                mqa2.A08 = r15;
                IgProgressImageView igProgressImageView6 = mqa2.A05;
                if (igProgressImageView6 != null) {
                    if (z) {
                        igProgressImageView6.setEnableProgressBar(false);
                    }
                    mqa2.A01();
                    r15.A0l = false;
                    IgProgressImageView igProgressImageView7 = mqa2.A05;
                    if (igProgressImageView7 != null) {
                        igProgressImageView7.setMiniPreviewPayload(r14.A0S());
                    }
                    IgProgressImageView igProgressImageView8 = mqa2.A05;
                    if (igProgressImageView8 != null) {
                        igProgressImageView8.setExpiration(r14.A02());
                    }
                    IgProgressImageView igProgressImageView9 = mqa2.A05;
                    AnonymousClass0iw r6 = r12;
                    UserSession userSession2 = userSession;
                    C317286n1 r122 = r17;
                    if (igProgressImageView9 != null) {
                        igProgressImageView9.A0A(new WXJ(r6, userSession2, r8, r9, r10, mqa2, r122), R.id.listener_id_for_reel_image_load);
                    }
                    AnonymousClass6YF.A03(r6, userSession, r8);
                    if (r8.A4o()) {
                        AnonymousClass6VB.A00(userSession).A0C(r14, false);
                        Uri uri = r8.A05;
                        if (uri != null) {
                            A08 = C253833rU.A00(uri, -1, -1);
                            IgProgressImageView igProgressImageView10 = mqa2.A05;
                            if (igProgressImageView10 != null) {
                                igProgressImageView10.setUrl(A08, r6);
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        IgProgressImageView igProgressImageView11 = mqa2.A05;
                        if (!(igProgressImageView11 == null || (context = igProgressImageView11.getContext()) == null || r14.A08(context) == null || r14.A06() == null)) {
                            AnonymousClass6VB.A00(userSession).A0C(r14, false);
                            A08 = r14.A08(context);
                            if (A08 != null) {
                                IgProgressImageView igProgressImageView12 = mqa2.A05;
                                if (igProgressImageView12 != null) {
                                    ImageUrl A082 = r14.A08(context);
                                    if (A082 != null) {
                                        ImageUrl A06 = r14.A06();
                                        if (A06 != null) {
                                            igProgressImageView12.setUrlWithFallback(A082, A06, r6);
                                        } else {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        r122.DzQ(r14);
                        return;
                    }
                    if (z) {
                        if (mqa2.A0A == null) {
                            View inflate2 = mqa2.A0D.inflate();
                            0qQ.A0C(inflate2, "null cannot be cast to non-null type com.instagram.ui.widget.framelayout.MediaFrameLayout");
                            MediaFrameLayout mediaFrameLayout4 = (MediaFrameLayout) inflate2;
                            mqa2.A0A = mediaFrameLayout4;
                            if (mediaFrameLayout4 != null) {
                                mediaFrameLayout4.A00 = -1.0f;
                                IgImageView requireViewById = mediaFrameLayout4.requireViewById(R.id.netego_background_image);
                                mqa2.A02 = requireViewById;
                                if (requireViewById != null) {
                                    requireViewById.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        MediaFrameLayout mediaFrameLayout5 = mqa2.A0A;
                        if (mediaFrameLayout5 != null) {
                            mediaFrameLayout5.setVisibility(0);
                        }
                        IgImageView igImageView = mqa2.A02;
                        if (igImageView != null) {
                            igImageView.A0I = AZT.A00;
                            igImageView.setUrl(A08, r6);
                        }
                        View view4 = mqa2.A00;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                    }
                    r122.DzQ(r14);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalArgumentException("media view is null when it needs to be shown");
        }
        throw new IllegalStateException("Media should be not null when binding media");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r0v259, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v21, types: [X.Otg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v136, types: [X.Otg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v261, types: [X.Otg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v100, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r1v138 */
    /* JADX WARNING: type inference failed for: r1v139 */
    /* JADX WARNING: type inference failed for: r1v140 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0230: MOVE  (r5v125 X.3mL) = (r25v0 X.3mL)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07a4  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x07c5  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:816:0x07b7 A[SYNTHETIC] */
    public static final void A01(X.AnonymousClass0iw r43, X.C229392nJ r44, com.instagram.common.session.UserSession r45, X.C255773uh r46, X.C250973mM r47, X.C309426Yf r48, X.C67602Mqa r49, X.C317286n1 r50, int r51, int r52) {
        /*
            r3 = r49
            X.6Yf r0 = r3.A08
            r9 = r48
            if (r0 == 0) goto L_0x000d
            if (r0 == r9) goto L_0x000d
            r0.A04(r3)
        L_0x000d:
            r42 = r47
            r0 = r42
            r3.A07 = r0
            com.instagram.reels.viewer.common.ReelViewGroup r4 = r3.A0G
            android.content.Context r17 = r4.getContext()
            X.0qQ.A07(r17)
            r1 = r17
            boolean r0 = X.C316216lI.A0E(r1, r0)
            if (r0 == 0) goto L_0x003a
            int r0 = X.AnonymousClass0nB.A01(r17)
            float r1 = (float) r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r2 = (int) r1
            r1 = r17
            r0 = r42
            int r1 = X.C316216lI.A04(r1, r0)
            r0 = r17
            X.C316216lI.A06(r0, r3, r2, r1)
        L_0x003a:
            com.instagram.common.ui.base.IgView r1 = r3.A0F
            r23 = 4
            r0 = r23
            r1.setVisibility(r0)
            X.6Mu r0 = r3.A0I
            r40 = r0
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x0050
            r0 = 8
            r1.setVisibility(r0)
        L_0x0050:
            X.6Mv r14 = r3.A0P
            X.3oV r0 = r14.A06
            r39 = r0
            r1 = 8
            r0.setVisibility(r1)
            X.6Mx r0 = r3.A0T
            r38 = r0
            X.3oV r0 = r0.A04
            r37 = r0
            r0.setVisibility(r1)
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x006d
            r0.setVisibility(r1)
        L_0x006d:
            X.6Mz r0 = r3.A0N
            r36 = r0
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x0078
            r0.setVisibility(r1)
        L_0x0078:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r3.A0A
            if (r0 == 0) goto L_0x007f
            r0.setVisibility(r1)
        L_0x007f:
            X.6N0 r8 = r3.A0V
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x0088
            r0.setVisibility(r1)
        L_0x0088:
            X.6N3 r6 = r3.A0O
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0091
            r0.setVisibility(r1)
        L_0x0091:
            X.6N4 r0 = r3.A0S
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x009a
            r0.setVisibility(r1)
        L_0x009a:
            X.6N7 r13 = r3.A0J
            android.view.View r0 = r13.A00
            if (r0 == 0) goto L_0x00a3
            r0.setVisibility(r1)
        L_0x00a3:
            X.6N8 r12 = r3.A0Y
            android.view.View r0 = r12.A00
            if (r0 == 0) goto L_0x00ac
            r0.setVisibility(r1)
        L_0x00ac:
            X.6NA r0 = r3.A0K
            r35 = r0
            X.3oV r0 = r0.A05
            r34 = r0
            r0.setVisibility(r1)
            X.6N9 r0 = r3.A0H
            r33 = r0
            android.view.View r0 = r0.A00
            r32 = r0
            r0.setVisibility(r1)
            X.6N2 r0 = r3.A0X
            r31 = r0
            android.view.ViewStub r0 = r0.A05
            r30 = r0
            r0.setVisibility(r1)
            X.6NE r11 = r3.A0R
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L_0x00d6
            r0.setVisibility(r1)
        L_0x00d6:
            X.6NG r10 = r3.A0M
            android.view.View r0 = r10.A00
            if (r0 == 0) goto L_0x00df
            r0.setVisibility(r1)
        L_0x00df:
            r2 = 0
            r41 = r50
            r0 = r41
            r4.A92(r0)
            r1 = 0
            r4.A00 = r1
            r3.A08 = r9
            r9.A03(r3)
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r3.A0a
            r29 = r0
            r4 = r51
            r0.setSegments(r4)
            r4 = r52
            r0.A06(r4, r2)
            r0.setVisibility(r2)
            X.6Mt r0 = r3.A0Q
            r28 = r0
            r16 = 1
            r2 = r0
            r0 = r16
            X.0qQ.A0B(r2, r0)
            android.view.View r0 = r2.A05
            r27 = r0
            r22 = 8
            r2 = r0
            r0 = r22
            r2.setVisibility(r0)
            r0 = r28
            X.6lB r0 = r0.A06
            r26 = r0
            X.AnonymousClass6YT.A01(r26)
            r0 = r28
            X.6lL r7 = r0.A07
            r2 = 0
            X.0qQ.A0B(r7, r2)
            android.view.View r4 = r7.A04
            if (r4 == 0) goto L_0x016b
            r0 = r22
            r4.setVisibility(r0)
            android.widget.ImageView r0 = r7.A05
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x1376
            r0.setImageDrawable(r1)
            android.widget.TextView r0 = r7.A07
            if (r0 == 0) goto L_0x1370
            java.lang.String r15 = ""
            r4 = r0
            r4.setText(r15)
            android.widget.ImageView r0 = r7.A06
            if (r0 == 0) goto L_0x136a
            r0.setImageDrawable(r1)
            android.widget.TextView r0 = r7.A08
            if (r0 == 0) goto L_0x1364
            r4 = r0
            r4.setText(r15)
            android.view.View r0 = r7.A02
            r4 = r0
            if (r0 == 0) goto L_0x135e
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r0)
            android.view.View r0 = r7.A03
            if (r0 == 0) goto L_0x1358
            r4 = 0
            r0.setAlpha(r4)
            r7.A02()
            r7.A0A = r2
        L_0x016b:
            r4 = r42
            r0 = r28
            r0.A00 = r4
            r0.A01 = r9
            r0 = r46
            X.3mL r4 = r0.A0e
            r25 = r4
            int r21 = r25.ordinal()
            r24 = r44
            switch(r21) {
                case 1: goto L_0x01fb;
                case 2: goto L_0x0182;
                case 3: goto L_0x0182;
                case 4: goto L_0x0182;
                case 5: goto L_0x018a;
                case 6: goto L_0x01e1;
                case 7: goto L_0x01fb;
                case 8: goto L_0x01fb;
                case 9: goto L_0x0182;
                case 10: goto L_0x018a;
                case 11: goto L_0x01fb;
                case 12: goto L_0x01fb;
                case 13: goto L_0x01fb;
                case 14: goto L_0x01fb;
                case 15: goto L_0x018a;
                case 16: goto L_0x0193;
                case 17: goto L_0x01fb;
                case 18: goto L_0x01fb;
                case 19: goto L_0x01fb;
                case 20: goto L_0x01fb;
                default: goto L_0x0182;
            }
        L_0x0182:
            java.lang.String r1 = "Unsupported netego type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x018a:
            r5 = r27
            r4 = r22
            r5.setVisibility(r4)
            goto L_0x021a
        L_0x0193:
            r4 = r24
            X.2nI r4 = (X.C229382nI) r4
            r20 = r4
            X.4gB r4 = r0.A0A
            r19 = r4
            if (r4 == 0) goto L_0x021a
            if (r20 == 0) goto L_0x021a
            X.3Hj r4 = r4.A01
            boolean r4 = r4.A09
            if (r4 == 0) goto L_0x021a
            r4 = r26
            android.view.View r4 = r4.A01
            r7 = r4
            r4 = r26
            android.view.View r4 = r4.A03
            r5 = r4
            r4 = r26
            android.view.View r4 = r4.A02
            X.XaI r18 = new X.XaI
            r15 = r7
            r7 = r5
            r5 = r4
            r4 = r18
            r4.<init>(r15, r7, r5)
            r5 = 2131441873(0x7f0b38d1, float:1.850577E38)
            r4 = r20
            android.util.SparseArray r4 = r4.A01
            r7 = r4
            r4 = r18
            r7.put(r5, r4)
            r4 = r27
            r4.setVisibility(r2)
            r5 = r18
            r4 = r19
            r4.A00 = r5
            X.Pvu r5 = r28.AjF()
            r4 = r26
            X.AnonymousClass6YT.A00(r1, r0, r5, r4)
            goto L_0x021a
        L_0x01e1:
            boolean r4 = r9.A0b
            if (r4 != 0) goto L_0x021a
            r4 = r27
            r4.setVisibility(r2)
            X.ANy r7 = new X.ANy
            r4 = r41
            r7.<init>(r0, r4)
            X.Pvu r5 = r28.AjF()
            r4 = r26
            X.AnonymousClass6YT.A00(r7, r0, r5, r4)
            goto L_0x021a
        L_0x01fb:
            r4 = r27
            r4.setVisibility(r2)
            X.6NH r5 = new X.6NH
            r4 = r41
            r5.<init>(r0, r4)
            r4 = r28
            r4.A02 = r2
            boolean r4 = r0.A1U()
            if (r4 == 0) goto L_0x0262
            X.C306826Nr.A00(r5, r0, r7)
            r5 = r16
            r4 = r28
            r4.A02 = r5
        L_0x021a:
            boolean r5 = r0.CcK()
            r4 = r45
            if (r5 != 0) goto L_0x024c
            boolean r5 = r0.A1o(r4)
            if (r5 != 0) goto L_0x024c
            boolean r5 = r0.A1P()
            if (r5 == 0) goto L_0x0238
            X.3mL r7 = X.C250963mL.NETEGO_BAKEOFF
            r5 = r25
            if (r5 == r7) goto L_0x0238
            X.3mL r7 = X.C250963mL.NETEGO_BLOKS
            if (r5 != r7) goto L_0x024c
        L_0x0238:
            android.view.View r5 = r3.A0B
        L_0x023a:
            r7 = r22
            r5.setVisibility(r7)
            r7 = r43
            switch(r21) {
                case 1: goto L_0x0280;
                case 2: goto L_0x0244;
                case 3: goto L_0x0244;
                case 4: goto L_0x0244;
                case 5: goto L_0x0622;
                case 6: goto L_0x12db;
                case 7: goto L_0x0494;
                case 8: goto L_0x074d;
                case 9: goto L_0x0244;
                case 10: goto L_0x06e7;
                case 11: goto L_0x1161;
                case 12: goto L_0x10c5;
                case 13: goto L_0x1259;
                case 14: goto L_0x0757;
                case 15: goto L_0x08df;
                case 16: goto L_0x09d3;
                case 17: goto L_0x08e9;
                case 18: goto L_0x0a51;
                case 19: goto L_0x0d46;
                case 20: goto L_0x0f10;
                default: goto L_0x0244;
            }
        L_0x0244:
            java.lang.String r1 = "Unsupported reel item type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x024c:
            android.view.View r5 = r3.A0B
            r18 = r5
            X.6NI r5 = new X.6NI
            r15 = r42
            r7 = r41
            r5.<init>(r0, r15, r7)
            r7 = r5
            r5 = r18
            X.AnonymousClass0fU.A00(r7, r5)
            r22 = 0
            goto L_0x023a
        L_0x0262:
            boolean r4 = r0.A1Q()
            if (r4 == 0) goto L_0x0276
            X.4gA r4 = r0.A07
            if (r4 == 0) goto L_0x0276
            boolean r15 = r4.A02
            r4 = r16
            if (r15 != r4) goto L_0x0276
            X.C306826Nr.A00(r5, r0, r7)
            goto L_0x021a
        L_0x0276:
            X.Pvu r7 = r28.AjF()
            r4 = r26
            X.AnonymousClass6YT.A00(r5, r0, r7, r4)
            goto L_0x021a
        L_0x0280:
            r5 = r36
            r5.A05 = r9
            r5.A04 = r0
            boolean r5 = r0.A1N()
            if (r5 == 0) goto L_0x0475
            r3.A06 = r1
            r3.A08 = r1
            com.instagram.feed.widget.IgProgressImageView r5 = r3.A05
            if (r5 == 0) goto L_0x0297
            r5.setVisibility(r2)
        L_0x0297:
            r6 = 0
            r5 = r29
            r5.setProgress(r6)
            r6 = 8
            r5.setVisibility(r6)
        L_0x02a2:
            com.instagram.feed.widget.IgProgressImageView r7 = r3.A05
            java.lang.String r5 = "Required value was null."
            if (r7 == 0) goto L_0x048e
            X.3mM r6 = r3.A07
            if (r6 == 0) goto L_0x0488
            boolean r4 = r6.A0E(r4)
            r4 = r4 ^ 1
            r7.setEnableProgressBar(r4)
            r4 = r36
            android.view.View r4 = r4.A01
            if (r4 != 0) goto L_0x0442
            r4 = r36
            android.view.ViewStub r4 = r4.A06
            android.view.View r7 = r4.inflate()
            r4 = r36
            r4.A01 = r7
            r4 = 2131427647(0x7f0b013f, float:1.8476916E38)
            android.view.View r6 = r7.findViewById(r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4 = r36
            r4.A03 = r6
            r4 = 2131427644(0x7f0b013c, float:1.847691E38)
            android.view.View r6 = r7.findViewById(r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4 = r36
            r4.A02 = r6
            r4 = 2131427643(0x7f0b013b, float:1.8476908E38)
            android.view.View r6 = r7.findViewById(r4)
            r4 = r36
            r4.A00 = r6
            com.instagram.feed.widget.IgProgressImageView r4 = r3.A05
            if (r4 == 0) goto L_0x02f4
            android.content.Context r1 = r4.getContext()
        L_0x02f4:
            r6 = 7
            r9 = 2131100478(0x7f06033e, float:1.7813339E38)
            r10 = 2131100318(0x7f06029e, float:1.7813014E38)
            r4 = 2130970229(0x7f040675, float:1.7549162E38)
            r7 = 2130970229(0x7f040675, float:1.7549162E38)
            int r11 = X.2Yu.A0H(r1, r4)
            r8 = 2130970230(0x7f040676, float:1.7549164E38)
            r4 = 2130970230(0x7f040676, float:1.7549164E38)
            int r12 = X.2Yu.A0H(r1, r8)
            r8 = 2130970231(0x7f040677, float:1.7549166E38)
            int r13 = X.2Yu.A0H(r1, r8)
            int r15 = X.2Yu.A0H(r1, r8)
            r14 = r10
            int[] r11 = new int[]{r9, r10, r11, r12, r13, r14, r15}
            int r17 = X.2Yu.A0H(r1, r7)
            r18 = 2131100343(0x7f0602b7, float:1.7813065E38)
            r19 = 2131099673(0x7f060019, float:1.7811706E38)
            r7 = 2130970232(0x7f040678, float:1.7549168E38)
            int r21 = X.2Yu.A0H(r1, r7)
            int r22 = X.2Yu.A0H(r1, r7)
            int r23 = X.2Yu.A0H(r1, r4)
            r20 = r18
            int[] r10 = new int[]{r17, r18, r19, r20, r21, r22, r23}
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            int r4 = r1.nextInt(r6)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r7 = r3.A0Z
            if (r7 == 0) goto L_0x03d1
            r1 = 2131439667(0x7f0b3033, float:1.8501296E38)
            android.view.View r9 = r7.findViewById(r1)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r9 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r9
            if (r9 == 0) goto L_0x0388
            r1 = 25
            r9.setCornerRadius(r1)
            android.content.Context r8 = r9.getContext()
            r6 = r11[r4]
            r4 = r10[r4]
            X.6NJ r1 = new X.6NJ
            r1.<init>(r8, r6, r4)
            r9.setBackground(r1)
            X.0qQ.A07(r8)
            boolean r1 = X.C316216lI.A0B(r8)
            if (r1 != 0) goto L_0x0388
            int r1 = X.C316216lI.A03(r8)
            X.0nA.A0T(r9, r1)
            r1 = r36
            android.view.View r4 = r1.A01
            if (r4 == 0) goto L_0x0388
            int r1 = X.C316216lI.A03(r8)
            X.0nA.A0T(r4, r1)
        L_0x0388:
            r1 = 2131438389(0x7f0b2b35, float:1.8498704E38)
            android.view.View r4 = r7.findViewById(r1)
            if (r4 == 0) goto L_0x03d1
            r4.setVisibility(r2)
            r1 = 2131439724(0x7f0b306c, float:1.8501411E38)
            android.view.View r9 = r4.findViewById(r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131439687(0x7f0b3047, float:1.8501336E38)
            android.view.View r8 = r4.findViewById(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = (com.instagram.common.ui.widget.imageview.IgImageView) r8
            X.3mM r6 = r3.A07
            if (r6 == 0) goto L_0x0482
            X.3uh r4 = r3.A06
            com.instagram.model.reels.Reel r1 = r6.A0H
            X.1Ns r2 = r1.A0W
            if (r2 == 0) goto L_0x03bf
            if (r4 == 0) goto L_0x03bf
            if (r9 == 0) goto L_0x03bf
            com.instagram.common.session.UserSession r1 = r3.A0E
            java.lang.String r1 = X.C297785sK.A06(r1, r4, r2)
            r9.setText(r1)
        L_0x03bf:
            com.instagram.common.session.UserSession r1 = r3.A0E
            com.instagram.common.typedurl.ImageUrl r2 = r6.A07(r1)
            X.Y0l r1 = new X.Y0l
            r1.<init>()
            if (r2 == 0) goto L_0x03d1
            if (r8 == 0) goto L_0x03d1
            r8.setUrl(r2, r1)
        L_0x03d1:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = r3.A09
            if (r10 == 0) goto L_0x0442
            android.content.Context r11 = r10.getContext()
            X.0qQ.A07(r11)
            int r1 = X.0nA.A09(r11)
            double r1 = (double) r1
            r8 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r1 = r1 * r8
            int r5 = (int) r1
            int r1 = X.0nA.A08(r11)
            double r3 = (double) r1
            double r3 = r3 * r8
            int r2 = (int) r3
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r1 = r16
            r6.<init>(r5, r2, r1)
            r10.setLayoutParams(r6)
            if (r7 == 0) goto L_0x0442
            r1 = 2131439664(0x7f0b3030, float:1.850129E38)
            android.view.View r5 = r7.findViewById(r1)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r5 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r5
            if (r5 == 0) goto L_0x0442
            r1 = 25
            r5.setCornerRadius(r1)
            android.content.res.Resources r2 = r11.getResources()
            r1 = 2131165311(0x7f07007f, float:1.7944836E38)
            int r4 = r2.getDimensionPixelOffset(r1)
            android.content.res.Resources r2 = r11.getResources()
            r1 = 2131165251(0x7f070043, float:1.7944714E38)
            int r3 = r2.getDimensionPixelOffset(r1)
            r1 = r16
            X.0nA.A0W(r5, r1)
            X.0nA.A0e(r5, r4)
            r1 = r36
            android.view.View r2 = r1.A00
            if (r2 == 0) goto L_0x0442
            int r1 = r6.height
            X.0nA.A0V(r2, r1)
            int r1 = r6.width
            X.0nA.A0f(r2, r1)
            r1 = r16
            X.0nA.A0W(r2, r1)
            int r4 = r4 - r3
            X.0nA.A0e(r2, r4)
        L_0x0442:
            r1 = r36
            android.widget.TextView r2 = r1.A03
            if (r2 == 0) goto L_0x0450
            X.4g8 r1 = r0.A0f
            if (r1 != 0) goto L_0x046a
            r1 = 0
        L_0x044d:
            r2.setText(r1)
        L_0x0450:
            r1 = r36
            android.widget.TextView r1 = r1.A02
            if (r1 == 0) goto L_0x12fd
            X.4g8 r0 = r0.A0f
            if (r0 != 0) goto L_0x045f
            r0 = 0
        L_0x045b:
            r1.setText(r0)
            return
        L_0x045f:
            X.3Hc r0 = r0.A00
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x045b
            java.lang.String r0 = ""
            goto L_0x045b
        L_0x046a:
            X.3Hc r1 = r1.A00
            java.lang.String r1 = r1.getTitle()
            if (r1 != 0) goto L_0x044d
            java.lang.String r1 = ""
            goto L_0x044d
        L_0x0475:
            r5 = r7
            r6 = r4
            r7 = r0
            r8 = r9
            r9 = r3
            r10 = r41
            r11 = r2
            A02(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x02a2
        L_0x0482:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0488:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x048e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0494:
            r5 = 0
            X.1AA r10 = X.182.A02(r4, r5)
            X.6Nt r11 = X.C306846Nt.A01
            if (r10 == 0) goto L_0x04ac
            X.0Tu r12 = X.0Tu.A04
            r5 = 36328212074085444(0x81105100003c44, double:3.037445825395694E-306)
            boolean r6 = r10.Ah0(r12, r5)
            r5 = 1
            if (r6 != 0) goto L_0x04ad
        L_0x04ac:
            r5 = 0
        L_0x04ad:
            r9.A10 = r5
            if (r10 == 0) goto L_0x04bf
            X.0Tu r12 = X.0Tu.A04
            r5 = 36328212074216518(0x81105100023c46, double:3.0374458254785856E-306)
            boolean r6 = r10.Ah0(r12, r5)
            r5 = 1
            if (r6 != 0) goto L_0x04c0
        L_0x04bf:
            r5 = 0
        L_0x04c0:
            r9.A13 = r5
            if (r10 == 0) goto L_0x04d2
            X.0Tu r12 = X.0Tu.A04
            r5 = 36328212074282055(0x81105100033c47, double:3.0374458255200315E-306)
            boolean r6 = r10.Ah0(r12, r5)
            r5 = 1
            if (r6 != 0) goto L_0x04d3
        L_0x04d2:
            r5 = 0
        L_0x04d3:
            r9.A0y = r5
            if (r10 == 0) goto L_0x04e5
            X.0Tu r12 = X.0Tu.A04
            r5 = 36328212074150981(0x81105100013c45, double:3.03744582543714E-306)
            boolean r6 = r10.Ah0(r12, r5)
            r5 = 1
            if (r6 != 0) goto L_0x04e6
        L_0x04e5:
            r5 = 0
        L_0x04e6:
            r9.A11 = r5
            r3.A06 = r0
            r8.A08 = r0
            r8.A09 = r9
            r8.A06 = r4
            r3 = r41
            r8.A0A = r3
            r8.A05 = r7
            X.4g9 r6 = r0.A09
            java.lang.String r3 = "This is only null if not a netego SU unit"
            if (r6 == 0) goto L_0x061c
            X.3IN r0 = r6.A00
            java.lang.String r14 = r0.A05
            if (r14 == 0) goto L_0x0616
            boolean r3 = r0.A0B
            boolean r0 = r0.A08
            r15 = r8
            r16 = r1
            r17 = r42
            r18 = r9
            r19 = r3
            r20 = r0
            r15.A01(r16, r17, r18, r19, r20)
            android.view.View r0 = r8.A01
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0610
            android.widget.TextView r10 = r8.A04
            if (r10 == 0) goto L_0x060a
            r0.setVisibility(r2)
            X.3IN r0 = r6.A00
            boolean r0 = r0.A0D
            android.view.View r13 = r8.A01
            if (r13 == 0) goto L_0x0604
            X.6NJ r15 = r8.A07
            if (r15 != 0) goto L_0x054c
            if (r0 == 0) goto L_0x05b0
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            r0 = 7
            int r15 = r5.nextInt(r0)
        L_0x0539:
            android.content.Context r12 = r13.getContext()
            int[] r0 = X.C306846Nt.A03
            r5 = r0[r15]
            int[] r0 = X.C306846Nt.A02
            r0 = r0[r15]
            X.6NJ r15 = new X.6NJ
            r15.<init>(r12, r5, r0)
            r8.A07 = r15
        L_0x054c:
            r13.setBackground(r15)
            r10.setText(r14)
            android.content.Context r12 = r10.getContext()
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            android.graphics.drawable.Drawable r5 = r12.getDrawable(r0)
            if (r5 != 0) goto L_0x05a1
            X.0wj r13 = X.0wj.A01
            r12 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "AD_MISSING_TITLE"
            X.0f9 r13 = r13.AEf(r0, r12)
            java.lang.String r12 = "message"
            java.lang.String r0 = "Could not get drawable R.drawable.instagram_user_follow_pano_outline_24"
            r13.ABQ(r12, r0)
            r13.report()
        L_0x0574:
            android.graphics.RectF r0 = X.0nA.A01
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r1, r1, r1)
            boolean r0 = r9.A11
            if (r0 == 0) goto L_0x0580
            X.C306896Ny.A03(r6, r9)
        L_0x0580:
            r0 = r42
            r11.A04(r0, r8, r2)
            X.6Yf r10 = r8.A09
            if (r10 == 0) goto L_0x05fe
            boolean r0 = r10.A12
            if (r0 == 0) goto L_0x05db
            X.6Nv[] r9 = r8.A04()
            r6 = 0
            int r5 = r9.length
        L_0x0593:
            if (r6 >= r5) goto L_0x05b2
            r0 = r9[r6]
            android.view.View r3 = r0.A05
            r0 = r23
            r3.setVisibility(r0)
            int r6 = r6 + 1
            goto L_0x0593
        L_0x05a1:
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r12.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r5.setColorFilter(r0)
            goto L_0x0574
        L_0x05b0:
            r15 = 0
            goto L_0x0539
        L_0x05b2:
            X.6O2 r11 = new X.6O2
            r11.<init>(r10)
            X.6Nv[] r12 = r8.A04()
            X.6Nv[] r0 = r8.A04()
            int r10 = r0.length
            r9 = 0
        L_0x05c1:
            if (r9 >= r10) goto L_0x05db
            r0 = r12[r9]
            android.view.View r3 = r0.A05
            int r0 = r9 * 100
            int r0 = r0 + 150
            long r5 = (long) r0
            X.6O3 r13 = new X.6O3
            r15 = r11
            r17 = r5
            r14 = r3
            r13.<init>(r14, r15, r16, r17)
            r13.A00()
            int r9 = r9 + 1
            goto L_0x05c1
        L_0x05db:
            X.0Tu r3 = X.0Tu.A06
            r0 = 36318681541646710(0x8107a600001976, double:3.031418678305065E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x12fd
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto L_0x05ef
            r0.setVisibility(r2)
        L_0x05ef:
            android.widget.TextView r2 = r8.A03
            if (r2 == 0) goto L_0x12fd
            X.W9r r1 = new X.W9r
            r0 = r41
            r1.<init>(r7, r4, r0)
            X.AnonymousClass0fU.A00(r1, r2)
            return
        L_0x05fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0604:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x060a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0610:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0616:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x061c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0622:
            r3.A06 = r0
            X.4g7 r4 = r0.A0h
            if (r4 == 0) goto L_0x06df
            r1 = r39
            r1.setVisibility(r2)
            boolean r1 = r39.CVM()
            if (r1 != 0) goto L_0x0636
            r39.getView()
        L_0x0636:
            boolean r1 = r9.A0w
            android.view.View r3 = r14.A00
            if (r1 == 0) goto L_0x0672
            if (r3 == 0) goto L_0x06d2
            r1 = 8
            r3.setVisibility(r1)
            android.view.View r0 = r14.A01
            if (r0 == 0) goto L_0x06cf
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r14.A03
            if (r0 == 0) goto L_0x06cc
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r2 = r14.A05
            if (r2 == 0) goto L_0x06c9
            r1 = 2131971593(0x7f134e09, float:1.958017E38)
            r0 = r17
            java.lang.String r0 = r0.getString(r1)
            r2.setText(r0)
            com.instagram.common.ui.base.IgTextView r2 = r14.A04
            if (r2 == 0) goto L_0x06d5
            r1 = 2131971592(0x7f134e08, float:1.9580168E38)
            r0 = r17
            java.lang.String r0 = r0.getString(r1)
            r2.setText(r0)
            return
        L_0x0672:
            if (r3 == 0) goto L_0x06d2
            r3.setVisibility(r2)
            android.view.View r3 = r14.A01
            if (r3 == 0) goto L_0x06cf
            r1 = 8
            r3.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r1 = r14.A03
            if (r1 == 0) goto L_0x06cc
            r1.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r2 = r14.A05
            if (r2 == 0) goto L_0x06c9
            java.lang.String r1 = r4.A03()
            r2.setText(r1)
            com.instagram.common.ui.base.IgTextView r2 = r14.A04
            if (r2 == 0) goto L_0x06d5
            java.lang.String r1 = r4.A02()
            r2.setText(r1)
            com.instagram.common.ui.base.IgTextView r2 = r14.A03
            if (r2 == 0) goto L_0x06cc
            X.3IK r1 = r4.A00
            java.lang.String r1 = r1.Air()
            r2.setText(r1)
            com.instagram.common.ui.base.IgTextView r3 = r14.A02
            if (r3 == 0) goto L_0x06c6
            r2 = 2131973916(0x7f13571c, float:1.9584881E38)
            r1 = r17
            java.lang.String r1 = r1.getString(r2)
            r3.setText(r1)
            com.instagram.common.ui.base.IgTextView r3 = r14.A03
            if (r3 == 0) goto L_0x06cc
            X.IAx r2 = new X.IAx
            r1 = r41
            r2.<init>(r0, r1)
            goto L_0x0741
        L_0x06c6:
            java.lang.String r0 = "skipSurveyTextView"
            goto L_0x06d7
        L_0x06c9:
            java.lang.String r0 = "titleTextView"
            goto L_0x06d7
        L_0x06cc:
            java.lang.String r0 = "startSurveyButton"
            goto L_0x06d7
        L_0x06cf:
            java.lang.String r0 = "thankYouCheckIcon"
            goto L_0x06d7
        L_0x06d2:
            java.lang.String r0 = "featureIconView"
            goto L_0x06d7
        L_0x06d5:
            java.lang.String r0 = "subtitleTextView"
        L_0x06d7:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x06df:
            java.lang.String r0 = "Trying to bind quality survey netego item without SimpleAction, which we use to provide the content to show in the quality survey layout"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x06e7:
            r3.A06 = r0
            X.4g7 r5 = r0.A0h
            if (r5 == 0) goto L_0x0745
            r1 = r37
            r1.setVisibility(r2)
            r1 = r38
            com.instagram.common.ui.base.IgTextView r2 = r1.A02
            if (r2 == 0) goto L_0x06ff
            java.lang.String r1 = r5.A03()
            r2.setText(r1)
        L_0x06ff:
            r1 = r38
            com.instagram.common.ui.base.IgTextView r2 = r1.A01
            if (r2 == 0) goto L_0x070c
            java.lang.String r1 = r5.A02()
            r2.setText(r1)
        L_0x070c:
            r1 = r38
            com.instagram.common.ui.base.IgTextView r3 = r1.A00
            if (r3 == 0) goto L_0x0725
            X.3IK r1 = r5.A00
            java.lang.String r1 = r1.Air()
            r3.setText(r1)
            X.IAy r2 = new X.IAy
            r1 = r41
            r2.<init>(r0, r1)
            X.AnonymousClass0fU.A00(r2, r3)
        L_0x0725:
            r1 = r38
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r1.A03
            if (r3 == 0) goto L_0x12fd
            X.0t1 r1 = X.0eE.A00(r4)
            com.instagram.user.model.User r1 = r1.A00()
            com.instagram.common.typedurl.ImageUrl r1 = r1.Bh3()
            r3.setUrl(r1, r7)
            X.IAz r2 = new X.IAz
            r1 = r41
            r2.<init>(r0, r1)
        L_0x0741:
            X.AnonymousClass0fU.A00(r2, r3)
            return
        L_0x0745:
            java.lang.String r1 = "Trying to bind story creation upsell netego item without SimpleAction, which we use to provide the content to show in the story creation upsell layout"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x074d:
            r3.A06 = r0
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0757:
            r3.A06 = r0
            r3 = r35
            r3.A04 = r9
            r3 = r34
            r3.setVisibility(r2)
            r3 = r35
            com.instagram.common.ui.base.IgTextView r3 = r3.A03
            if (r3 == 0) goto L_0x08db
            X.4g7 r6 = r0.A0h
            if (r6 == 0) goto L_0x07b5
            java.lang.String r0 = r6.A03()
            if (r0 == 0) goto L_0x07b5
            java.lang.String r0 = r6.A03()
        L_0x0776:
            r3.setText(r0)
            r0 = r35
            com.instagram.common.ui.base.IgTextView r3 = r0.A01
            if (r3 == 0) goto L_0x08d7
            if (r6 == 0) goto L_0x07b3
            java.lang.String r0 = r6.A02()
            if (r0 == 0) goto L_0x07b3
            java.lang.String r0 = r6.A02()
        L_0x078b:
            r3.setText(r0)
            if (r6 == 0) goto L_0x07b1
            X.3IK r3 = r6.A00
            java.lang.String r0 = r3.BVu()
            if (r0 == 0) goto L_0x07b1
            java.lang.String r9 = r3.BVu()
        L_0x079c:
            X.Uy9[] r8 = X.C16613Uy9.values()
            int r5 = r8.length
            r3 = 0
        L_0x07a2:
            if (r3 >= r5) goto L_0x07b7
            r4 = r8[r3]
            java.lang.String r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 != 0) goto L_0x07b9
            int r3 = r3 + 1
            goto L_0x07a2
        L_0x07b1:
            r9 = 0
            goto L_0x079c
        L_0x07b3:
            r0 = 0
            goto L_0x078b
        L_0x07b5:
            r0 = 0
            goto L_0x0776
        L_0x07b7:
            X.Uy9 r4 = X.C16613Uy9.A07
        L_0x07b9:
            X.VG6 r0 = X.VG6.$redex_init_class
            int r3 = r4.ordinal()
            java.lang.String r5 = "Required value was null."
            r0 = r16
            if (r3 == r0) goto L_0x0809
            if (r3 != r2) goto L_0x08ba
            X.Uy9 r4 = X.C16613Uy9.A07
            if (r6 == 0) goto L_0x08b4
            X.3IK r3 = r6.A00
            java.util.List r0 = r3.C8X()
            if (r0 == 0) goto L_0x08b4
            java.util.List r0 = r3.C8X()
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r6 == 0) goto L_0x08b4
        L_0x07dd:
            r0 = r35
            android.widget.RelativeLayout r3 = r0.A00
            if (r3 == 0) goto L_0x08aa
            int r0 = r4.A00
            r3.setBackgroundResource(r0)
            X.Uy9[] r11 = X.C16613Uy9.values()
            int r10 = r11.length
            r8 = 0
            r9 = 0
        L_0x07ef:
            if (r9 >= r10) goto L_0x0820
            r5 = r11[r9]
            if (r5 == r4) goto L_0x0806
            r0 = r35
            android.widget.RelativeLayout r3 = r0.A00
            if (r3 == 0) goto L_0x08aa
            int r0 = r5.A01
            android.view.View r3 = r3.requireViewById(r0)
            r0 = 8
            r3.setVisibility(r0)
        L_0x0806:
            int r9 = r9 + 1
            goto L_0x07ef
        L_0x0809:
            X.Uy9 r4 = X.C16613Uy9.A06
            if (r6 == 0) goto L_0x08d1
            X.3IK r3 = r6.A00
            java.util.List r0 = r3.AZ5()
            if (r0 == 0) goto L_0x08d1
            java.util.List r0 = r3.AZ5()
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r6 == 0) goto L_0x08d1
            goto L_0x07dd
        L_0x0820:
            r0 = r35
            android.widget.RelativeLayout r3 = r0.A00
            if (r3 == 0) goto L_0x08aa
            int r0 = r4.A01
            android.view.View r5 = r3.requireViewById(r0)
            X.0qQ.A07(r5)
            r5.setVisibility(r2)
            int r2 = r6.size()
            com.google.common.collect.ImmutableList r4 = r4.A02
            int r0 = r4.size()
            if (r2 < r0) goto L_0x0898
            int r3 = r4.size()
        L_0x0842:
            if (r8 >= r3) goto L_0x0869
            java.lang.Object r0 = r4.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            X.0qQ.A0A(r0)
            int r0 = r0.intValue()
            android.view.View r2 = r5.requireViewById(r0)
            X.0qQ.A07(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            java.lang.Object r0 = r6.get(r8)
            X.0qQ.A07(r0)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r2.setUrl(r0, r7)
            int r8 = r8 + 1
            goto L_0x0842
        L_0x0869:
            r0 = r35
            com.instagram.common.ui.base.IgTextView r4 = r0.A02
            if (r4 == 0) goto L_0x0894
            android.content.Context r3 = r4.getContext()
            r0 = 2131237841(0x7f081bd1, float:1.8091944E38)
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
            if (r2 == 0) goto L_0x088e
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r0 = X.2Yu.A0H(r3, r0)
            int r0 = r3.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x088e:
            android.graphics.RectF r0 = X.0nA.A01
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r1, r1, r1)
            return
        L_0x0894:
            java.lang.String r0 = "titleView"
            goto L_0x0f08
        L_0x0898:
            java.lang.String r2 = "Ads Consent Growth reel item should contain at least "
            int r1 = r4.size()
            java.lang.String r0 = " image URLs."
            java.lang.String r0 = X.002.A0c(r2, r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x08aa:
            java.lang.String r0 = "content"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x08b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x08ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported LayoutType."
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x08d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x08d7:
            java.lang.String r0 = "bottomTextView"
            goto L_0x0f08
        L_0x08db:
            java.lang.String r0 = "topTextView"
            goto L_0x0f08
        L_0x08df:
            r3.A06 = r0
            X.6NC r0 = r3.A0L
            X.3oV r0 = r0.A03
            r0.setVisibility(r2)
            return
        L_0x08e9:
            r3 = r31
            r3.A04 = r0
            r0 = r3
            android.view.View r5 = r3.A00
            if (r5 != 0) goto L_0x0998
            android.view.View r5 = r30.inflate()
            r0 = 2131436903(0x7f0b2567, float:1.849569E38)
            android.view.View r3 = r5.requireViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = r31
            r0.A01 = r3
            r0 = 2131436876(0x7f0b254c, float:1.8495635E38)
            android.view.View r6 = r5.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            android.content.Context r8 = r6.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r0 = r16
            r3.<init>(r8, r0, r2)
            r6.setLayoutManager(r3)
            X.UAa r0 = new X.UAa
            r0.<init>(r6)
            r6.A11(r0)
            X.2tC r7 = X.AnonymousClass2t9.A00(r8)
            X.0qQ.A07(r8)
            java.lang.String r0 = "netego_trending_prompt_view_binder"
            X.0xG r3 = new X.0xG
            r3.<init>(r0)
            X.NOc r0 = new X.NOc
            r9 = r0
            r10 = r8
            r11 = r3
            r12 = r4
            r13 = r41
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)
            r7.A01(r0)
            X.NNm r0 = new X.NNm
            r0.<init>()
            r7.A01(r0)
            X.2t9 r8 = r7.A00()
            r0 = r31
            r0.A03 = r8
            com.instagram.common.recyclerview.ViewModelListUpdate r7 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r7.<init>()
            X.Otg r4 = new X.Otg
            r4.<init>()
            X.Otg r3 = new X.Otg
            r3.<init>()
            X.Otg r0 = new X.Otg
            r0.<init>()
            X.Otg[] r0 = new X.C71955Otg[]{r4, r3, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r7.A01(r0)
            r8.A05(r7)
            r0 = r31
            X.2t9 r0 = r0.A03
            r6.setAdapter(r0)
            r0 = r31
            r0.A02 = r6
            android.content.Context r3 = r5.getContext()
            X.0qQ.A07(r3)
            boolean r0 = X.C316216lI.A0B(r3)
            if (r0 != 0) goto L_0x0994
            r0 = 64
            float r0 = X.0nA.A04(r3, r0)
            int r0 = (int) r0
            X.0nA.A0X(r5, r0)
        L_0x0994:
            r0 = r31
            r0.A00 = r5
        L_0x0998:
            r5.setVisibility(r2)
            android.widget.TextView r4 = r0.A01
            if (r4 == 0) goto L_0x09cd
            android.content.Context r3 = r4.getContext()
            r0 = 2131971577(0x7f134df9, float:1.9580137E38)
            java.lang.String r0 = r3.getString(r0)
            r4.setText(r0)
            r0 = 2131237926(0x7f081c26, float:1.8092116E38)
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
            if (r2 == 0) goto L_0x09d1
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            int r0 = X.2Yu.A0H(r3, r0)
            int r0 = r3.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x09c8:
            android.graphics.RectF r0 = X.0nA.A01
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r1, r1, r1)
        L_0x09cd:
            X.C70316O1u.A00(r31)
            return
        L_0x09d1:
            r2 = 0
            goto L_0x09c8
        L_0x09d3:
            if (r44 == 0) goto L_0x12fd
            r3.A06 = r0
            X.4gB r0 = r0.A0A
            java.lang.String r7 = "message"
            r6 = 817903741(0x30c0387d, float:1.3985894E-9)
            if (r0 != 0) goto L_0x09f1
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "BLOKS_NETEGO_STORY_NULL"
            X.0f9 r1 = r1.AEf(r0, r6)
            java.lang.String r0 = "Bloks netego story should not be null"
        L_0x09ea:
            r1.ABQ(r7, r0)
            r1.report()
            return
        L_0x09f1:
            X.3Hj r5 = r0.A01
            X.JwE r0 = r5.A01
            java.lang.Object r4 = r0.A00
            X.4hR r4 = (X.C270864hR) r4
            if (r4 != 0) goto L_0x0a06
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "BLOKS_NETEGO_ADAPTER_NULL"
            X.0f9 r1 = r1.AEf(r0, r6)
            java.lang.String r0 = "Netego bloks adapter should not be null"
            goto L_0x09ea
        L_0x0a06:
            r0 = r32
            r0.setVisibility(r2)
            r0 = r33
            android.widget.TextView r2 = r0.A02
            java.lang.String r0 = r5.A06
            if (r0 != 0) goto L_0x0a15
            java.lang.String r0 = ""
        L_0x0a15:
            r2.setText(r0)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0a2e
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r2 = r3.A0Z
            if (r2 == 0) goto L_0x0a2e
            android.content.Context r0 = r2.getContext()
            X.0qQ.A07(r0)
            int r0 = X.C316216lI.A03(r0)
            X.0nA.A0T(r2, r0)
        L_0x0a2e:
            X.3ew r2 = r4.A01()
            r0 = r33
            android.widget.FrameLayout r0 = r0.A01
            android.content.Context r3 = r0.getContext()
            X.68u r2 = X.C3034368u.A03(r1, r2, r1)
            X.6NR r1 = new X.6NR
            r0 = r24
            r1.<init>(r3, r2, r0)
            X.6NS r1 = r1.A00()
            r0 = r33
            X.4n2 r0 = r0.A03
            r1.A07(r0)
            return
        L_0x0a51:
            r3.A06 = r0
            android.view.View r5 = r11.A00
            if (r5 != 0) goto L_0x0abd
            android.view.ViewStub r3 = r11.A0A
            android.view.View r5 = r3.inflate()
            r3 = 2131430623(0x7f0b0cdf, float:1.8482952E38)
            android.view.View r3 = r5.requireViewById(r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r11.A01 = r3
            r3 = 2131439509(0x7f0b2f95, float:1.8500975E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r11.A05 = r3
            r3 = 2131439512(0x7f0b2f98, float:1.8500981E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r11.A07 = r3
            r3 = 2131439511(0x7f0b2f97, float:1.850098E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r11.A06 = r3
            r3 = 2131439506(0x7f0b2f92, float:1.850097E38)
            android.view.View r6 = r5.requireViewById(r3)
            X.0qQ.A07(r6)
            X.Ib0 r3 = new X.Ib0
            r3.<init>(r6)
            r11.A08 = r3
            r3 = 2131439508(0x7f0b2f94, float:1.8500973E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            r11.A04 = r3
            r3 = 2131439507(0x7f0b2f93, float:1.8500971E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            r11.A03 = r3
            r3 = 2131439513(0x7f0b2f99, float:1.8500983E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            r11.A02 = r3
            r11.A00 = r5
        L_0x0abd:
            int[] r3 = r11.A09
            if (r3 != 0) goto L_0x0b0a
            r6 = 0
            if (r5 == 0) goto L_0x0d1b
            android.content.Context r5 = r5.getContext()
        L_0x0ac8:
            r3 = 2130970179(0x7f040643, float:1.754906E38)
            int r5 = X.2Yu.A0H(r5, r3)
            android.view.View r3 = r11.A00
            if (r3 == 0) goto L_0x0ad7
            android.content.Context r6 = r3.getContext()
        L_0x0ad7:
            r3 = 2130970169(0x7f040639, float:1.754904E38)
            int r3 = X.2Yu.A0H(r6, r3)
            int[] r9 = new int[]{r5, r3}
            android.view.View r8 = r11.A00
            if (r8 == 0) goto L_0x0b08
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            android.content.Context r5 = r8.getContext()
            r3 = r9[r2]
            int r10 = r5.getColor(r3)
            android.content.Context r5 = r8.getContext()
            r3 = r9[r16]
            int r3 = r5.getColor(r3)
            int[] r5 = new int[]{r10, r3}
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r6, r5)
            r8.setBackground(r3)
        L_0x0b08:
            r11.A09 = r9
        L_0x0b0a:
            X.IDQ r3 = new X.IDQ
            r5 = r41
            r3.<init>(r7, r5)
            android.view.View r5 = r11.A00
            if (r5 == 0) goto L_0x0b18
            r5.setVisibility(r2)
        L_0x0b18:
            com.instagram.common.ui.base.IgTextView r8 = r11.A05
            if (r8 == 0) goto L_0x0b5c
            X.4gC r9 = r0.A0B
            java.lang.String r5 = "Share comment to story netego unit is missing comment share model."
            X.17k.A07(r9, r5)
            r6 = 0
            if (r9 == 0) goto L_0x0d18
            X.3II r5 = r9.A00
            java.lang.String r5 = r5.BVq()
            if (r5 != 0) goto L_0x0b30
            java.lang.String r5 = ""
        L_0x0b30:
            r8.setText(r5)
            android.content.Context r9 = r8.getContext()
            X.0qQ.A07(r9)
            r5 = 2131238148(0x7f081d04, float:1.8092567E38)
            android.graphics.drawable.Drawable r5 = r9.getDrawable(r5)
            if (r5 == 0) goto L_0x0b57
            android.graphics.drawable.Drawable r6 = r5.mutate()
            if (r6 == 0) goto L_0x0b57
            r5 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r5 = r9.getColor(r5)
            android.graphics.ColorFilter r5 = X.AnonymousClass37O.A00(r5)
            r6.setColorFilter(r5)
        L_0x0b57:
            android.graphics.RectF r5 = X.0nA.A01
            r8.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r1, r1, r1)
        L_0x0b5c:
            com.instagram.common.ui.base.IgTextView r8 = r11.A07
            r10 = 0
            if (r8 == 0) goto L_0x0b77
            X.4gC r6 = r0.A0B
            java.lang.String r5 = "Share comment to story netego unit is missing comment share model."
            X.17k.A07(r6, r5)
            if (r6 == 0) goto L_0x0d15
            X.3II r5 = r6.A00
            java.lang.String r5 = r5.getTitle()
            if (r5 != 0) goto L_0x0b74
            java.lang.String r5 = ""
        L_0x0b74:
            r8.setText(r5)
        L_0x0b77:
            com.instagram.common.ui.base.IgTextView r8 = r11.A06
            if (r8 == 0) goto L_0x0b91
            X.4gC r6 = r0.A0B
            java.lang.String r5 = "Share comment to story netego unit is missing comment share model."
            X.17k.A07(r6, r5)
            if (r6 == 0) goto L_0x0d12
            X.3II r5 = r6.A00
            java.lang.String r5 = r5.getSubtitle()
            if (r5 != 0) goto L_0x0b8e
            java.lang.String r5 = ""
        L_0x0b8e:
            r8.setText(r5)
        L_0x0b91:
            X.4gC r5 = r0.A0B
            java.lang.String r0 = "Share comment to story netego unit is missing comment share model."
            X.17k.A07(r5, r0)
            if (r5 == 0) goto L_0x0d3e
            X.3II r8 = r5.A00
            X.1Xj r9 = r8.BPf()
            if (r9 == 0) goto L_0x0d3e
            boolean r0 = r9.A5G()
            if (r0 == 0) goto L_0x0c6f
            X.Ib0 r10 = r11.A08
            if (r10 == 0) goto L_0x0bf4
            android.view.View r0 = r10.A00
            r0.setVisibility(r2)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r6 = r10.A05
            r6.setVideoSource(r9, r7)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r10.A04
            android.content.Context r0 = r5.getContext()
            X.0qQ.A07(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r9.A1n(r0)
            if (r0 == 0) goto L_0x0d36
            r5.setUrl(r0, r7)
            X.DU7 r0 = r8.ApN()
            if (r0 == 0) goto L_0x0bea
            com.instagram.user.model.User r0 = r0.BZ1()
            if (r0 == 0) goto L_0x0bea
            java.lang.String r5 = r0.getUsername()
            com.instagram.common.ui.base.IgTextView r0 = r10.A03
            r0.setText(r5)
            r0.setVisibility(r2)
            android.view.View r0 = r10.A01
            r0.setVisibility(r2)
            android.view.View r0 = r10.A02
            r0.setVisibility(r2)
        L_0x0bea:
            r6.setOnTouchListener(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A02
            if (r0 == 0) goto L_0x0bf4
            r0.setVisibility(r2)
        L_0x0bf4:
            com.instagram.common.ui.base.IgSimpleImageView r6 = r11.A03
            X.DU7 r0 = r8.ApN()
            if (r0 == 0) goto L_0x0c6c
            java.lang.String r23 = r0.getOriginalCommentId()
        L_0x0c00:
            X.DU7 r0 = r8.ApN()
            if (r0 == 0) goto L_0x0c69
            com.instagram.user.model.User r19 = r0.BZ1()
        L_0x0c0a:
            X.DU7 r0 = r8.ApN()
            if (r0 == 0) goto L_0x0c66
            java.lang.String r24 = r0.getOriginalCommentText()
        L_0x0c14:
            X.DU7 r0 = r8.ApN()
            if (r0 == 0) goto L_0x0c63
            java.lang.String r26 = r0.getOriginalMediaId()
        L_0x0c1e:
            r7 = -1
            java.lang.String r22 = X.0nH.A0E(r7)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r20 = java.lang.Float.valueOf(r0)
            java.lang.String r5 = "Required value was null."
            if (r19 == 0) goto L_0x0d30
            if (r23 == 0) goto L_0x0d2a
            if (r24 == 0) goto L_0x0d24
            if (r26 == 0) goto L_0x0d1e
            java.lang.String r27 = X.0nH.A0E(r7)
            r0 = 0
            java.lang.Float r21 = java.lang.Float.valueOf(r0)
            com.instagram.api.schemas.MediaVCRTappableData r5 = new com.instagram.api.schemas.MediaVCRTappableData
            r25 = r1
            r28 = r1
            r29 = r2
            r18 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r7 = new com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel
            r0 = r16
            r7.<init>(r5, r0)
            X.UkV r2 = X.C15905UkV.A00
            X.U1S r1 = new X.U1S
            r0 = r17
            r1.<init>(r0, r4, r7, r2)
            if (r6 == 0) goto L_0x12fd
            r6.setImageDrawable(r1)
            r6.setOnTouchListener(r3)
            return
        L_0x0c63:
            r26 = 0
            goto L_0x0c1e
        L_0x0c66:
            r24 = 0
            goto L_0x0c14
        L_0x0c69:
            r19 = 0
            goto L_0x0c0a
        L_0x0c6c:
            r23 = 0
            goto L_0x0c00
        L_0x0c6f:
            boolean r0 = r9.A5T()
            if (r0 != 0) goto L_0x0c81
            boolean r0 = r9.A5E()
            if (r0 != 0) goto L_0x0c81
            boolean r0 = r9.A5F()
            if (r0 == 0) goto L_0x0bf4
        L_0x0c81:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A03
            if (r0 == 0) goto L_0x0c89
            android.view.ViewGroup$LayoutParams r10 = r0.getLayoutParams()
        L_0x0c89:
            boolean r0 = r10 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x0caa
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            if (r10 == 0) goto L_0x0caa
            android.content.res.Resources r5 = r17.getResources()
            r0 = 2131165260(0x7f07004c, float:1.7944732E38)
            int r6 = r5.getDimensionPixelSize(r0)
            android.content.res.Resources r5 = r17.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r10.setMargins(r6, r2, r2, r0)
        L_0x0caa:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A04
            if (r0 == 0) goto L_0x0cb1
            r0.setVisibility(r2)
        L_0x0cb1:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A04
            if (r0 == 0) goto L_0x0cb8
            r0.setOnTouchListener(r3)
        L_0x0cb8:
            android.content.res.Resources r5 = r17.getResources()
            r0 = 2131165658(0x7f0701da, float:1.794554E38)
            int r0 = r5.getDimensionPixelSize(r0)
            float r7 = (float) r0
            int r0 = r9.A0x()
            float r10 = (float) r0
            int r0 = r9.A0y()
            float r6 = (float) r0
            float r0 = java.lang.Math.max(r10, r6)
            float r5 = r7 / r0
            float r0 = java.lang.Math.min(r10, r6)
            float r0 = r0 * r5
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            int r5 = (int) r0
            r10 = r5
            int r0 = (int) r7
            if (r6 <= 0) goto L_0x0ce2
            r5 = r0
            r0 = r10
        L_0x0ce2:
            java.lang.String r24 = "netego_share_comment_to_story_reel_viewer_item_binder"
            r18 = r1
            r19 = r4
            r20 = r1
            r21 = r9
            r22 = r9
            r23 = r1
            r25 = r0
            r26 = r5
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r16
            X.7w8 r6 = X.AHL.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r11.A04
            if (r5 == 0) goto L_0x0bf4
            r0 = 13
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            r5.setImageDrawable(r6)
            goto L_0x0bf4
        L_0x0d12:
            r5 = r10
            goto L_0x0b8e
        L_0x0d15:
            r5 = r10
            goto L_0x0b74
        L_0x0d18:
            r5 = r1
            goto L_0x0b30
        L_0x0d1b:
            r5 = r1
            goto L_0x0ac8
        L_0x0d1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0d24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0d2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0d30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0d36:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d3e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d46:
            r3.A06 = r0
            X.6NF r12 = r3.A0W
            X.4gD r11 = r0.A0D
            java.lang.String r10 = "Threads in stories unit netego unit is missing Threads in stories unit model."
            X.17k.A07(r11, r10)
            if (r11 == 0) goto L_0x0d65
            X.3IS r3 = r11.A00
            java.util.List r3 = r3.BPz()
            if (r3 == 0) goto L_0x0d65
            int r5 = r3.size()
            r27 = 1
            r3 = r16
            if (r5 == r3) goto L_0x0d67
        L_0x0d65:
            r27 = 0
        L_0x0d67:
            android.view.View r3 = r12.A01
            if (r3 != 0) goto L_0x0dc8
            android.view.ViewStub r3 = r12.A05
            android.view.View r8 = r3.inflate()
            r3 = 2131439528(0x7f0b2fa8, float:1.8501014E38)
            android.view.View r3 = r8.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r12.A02 = r3
            r9 = 2131439530(0x7f0b2faa, float:1.8501018E38)
            android.view.View r6 = r8.requireViewById(r9)
            r12.A00 = r6
            java.lang.String r3 = "null cannot be cast to non-null type android.view.View"
            X.0qQ.A0C(r6, r3)
            r3 = 2131442748(0x7f0b3c3c, float:1.8507545E38)
            android.view.View r5 = r6.requireViewById(r3)
            X.0qQ.A07(r5)
            X.Hp1 r3 = new X.Hp1
            r3.<init>(r6, r5)
            r12.A03 = r3
            r13 = 0
            int[] r14 = X.AnonymousClass6NF.A06
            if (r27 == 0) goto L_0x0e2f
            r13 = 3
            r6 = 0
        L_0x0da2:
            r3 = r14[r6]
            android.view.View r5 = r8.requireViewById(r3)
            X.0qQ.A07(r5)
            r3 = 8
            r5.setVisibility(r3)
            int r6 = r6 + 1
            if (r6 < r13) goto L_0x0da2
            android.view.View r5 = r8.requireViewById(r9)
            X.0qQ.A07(r5)
            X.Hp1 r3 = new X.Hp1
            r3.<init>(r8, r5)
            X.Hp1[] r6 = new X.C55880Hp1[]{r3}
        L_0x0dc4:
            r12.A04 = r6
            r12.A01 = r8
        L_0x0dc8:
            android.view.View r5 = r12.A00
            if (r5 == 0) goto L_0x0dd4
            r3 = 8
            if (r27 == 0) goto L_0x0dd1
            r3 = 0
        L_0x0dd1:
            r5.setVisibility(r3)
        L_0x0dd4:
            X.Hp1[] r13 = r12.A04
            if (r13 == 0) goto L_0x0f03
            X.17k.A07(r11, r10)
            if (r11 == 0) goto L_0x0e47
            X.3IS r3 = r11.A00
            java.util.List r9 = r3.BPz()
            if (r9 == 0) goto L_0x0e48
            int r15 = r13.length
            r8 = 0
        L_0x0de7:
            if (r8 >= r15) goto L_0x0e48
            r22 = r13[r8]
            java.lang.Object r3 = r9.get(r8)
            X.1Xj r3 = (X.1Xj) r3
            r18 = r7
            r19 = r4
            r20 = r3
            r21 = r41
            r23 = r1
            r24 = r1
            r25 = r8
            r26 = r2
            X.I3u.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = r13[r8]
            android.view.View r14 = r3.A00
            X.0gF r6 = X.C60340gF.A00
            java.lang.Object r3 = r9.get(r8)
            X.1Xj r3 = (X.1Xj) r3
            java.lang.String r5 = r3.A2n()
            X.30Y r3 = X.AnonymousClass30Y.A07
            X.30a r3 = new X.30a
            r3.<init>(r0, r6, r5)
            X.H8Z r5 = new X.H8Z
            r5.<init>(r7, r4, r8)
            r3.A00(r5)
            X.30Y r5 = r3.A01()
            r3 = r41
            r3.Dcv(r14, r5)
            int r8 = r8 + 1
            goto L_0x0de7
        L_0x0e2f:
            r9 = 3
            X.Hp1[] r6 = new X.C55880Hp1[r9]
        L_0x0e32:
            r3 = r14[r13]
            android.view.View r5 = r8.requireViewById(r3)
            X.0qQ.A07(r5)
            X.Hp1 r3 = new X.Hp1
            r3.<init>(r8, r5)
            r6[r13] = r3
            int r13 = r13 + 1
            if (r13 >= r9) goto L_0x0dc4
            goto L_0x0e32
        L_0x0e47:
            r9 = 0
        L_0x0e48:
            if (r27 == 0) goto L_0x0e7f
            if (r9 == 0) goto L_0x0e7f
            java.lang.Object r3 = r9.get(r2)
            X.1Xj r3 = (X.1Xj) r3
            if (r3 == 0) goto L_0x0e7f
            X.1Xy r3 = r3.A0C
            X.4oA r3 = r3.C5R()
            if (r3 == 0) goto L_0x0e7f
            X.4o8 r3 = r3.BtE()
            if (r3 == 0) goto L_0x0e7f
            X.1Xj r20 = r3.Bj4()
            if (r20 == 0) goto L_0x0e7f
            X.Hp1 r3 = r12.A03
            if (r3 == 0) goto L_0x0f06
            r18 = r7
            r19 = r4
            r21 = r41
            r22 = r3
            r23 = r1
            r24 = r1
            r25 = r2
            r26 = r16
            X.I3u.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0e7f:
            android.view.View r3 = r12.A01
            if (r3 == 0) goto L_0x0e86
            r3.setVisibility(r2)
        L_0x0e86:
            com.instagram.common.ui.base.IgTextView r5 = r12.A02
            if (r5 == 0) goto L_0x0ed5
            X.17k.A07(r11, r10)
            r6 = 0
            if (r11 == 0) goto L_0x0f01
            X.3IS r2 = r11.A00
            java.lang.String r2 = r2.BVq()
            if (r2 != 0) goto L_0x0e9a
            java.lang.String r2 = ""
        L_0x0e9a:
            r5.setText(r2)
            r3 = 2131237898(0x7f081c0a, float:1.809206E38)
            r2 = r17
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            if (r2 == 0) goto L_0x0ebe
            android.graphics.drawable.Drawable r6 = r2.mutate()
            if (r6 == 0) goto L_0x0ebe
            r3 = 2131099843(0x7f0600c3, float:1.781205E38)
            r2 = r17
            int r2 = r2.getColor(r3)
            android.graphics.ColorFilter r2 = X.AnonymousClass37O.A00(r2)
            r6.setColorFilter(r2)
        L_0x0ebe:
            android.graphics.RectF r2 = X.0nA.A01
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r1, r1, r1)
            X.IDc r1 = new X.IDc
            r16 = r1
            r18 = r7
            r19 = r4
            r20 = r0
            r21 = r41
            r16.<init>(r17, r18, r19, r20, r21)
            r5.setOnTouchListener(r1)
        L_0x0ed5:
            android.view.View r6 = r12.A01
            if (r6 == 0) goto L_0x12fd
            X.0gF r5 = X.C60340gF.A00
            X.17k.A07(r11, r10)
            if (r11 == 0) goto L_0x0eff
            java.lang.String r3 = r11.getId()
        L_0x0ee4:
            X.30Y r1 = X.AnonymousClass30Y.A07
            X.30a r2 = new X.30a
            r2.<init>(r0, r5, r3)
            X.H8a r1 = new X.H8a
            r0 = r17
            r1.<init>(r0, r7, r4)
            r2.A00(r1)
            X.30Y r1 = r2.A01()
            r0 = r41
            r0.Dcv(r6, r1)
            return
        L_0x0eff:
            r3 = 0
            goto L_0x0ee4
        L_0x0f01:
            r2 = r1
            goto L_0x0e9a
        L_0x0f03:
            java.lang.String r0 = "cardViewHolders"
            goto L_0x0f08
        L_0x0f06:
            java.lang.String r0 = "ThreadsInStoriesItemQuotedPostCardHolder"
        L_0x0f08:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0f10:
            r8 = 2
            android.view.View r5 = r10.A00
            if (r5 != 0) goto L_0x0f80
            android.view.ViewStub r3 = r10.A0A
            android.view.View r5 = r3.inflate()
            r3 = 2131433850(0x7f0b197a, float:1.8489497E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r10.A04 = r3
            r3 = 2131435388(0x7f0b1f7c, float:1.8492617E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            r10.A07 = r3
            r3 = 2131435404(0x7f0b1f8c, float:1.849265E38)
            android.view.View r3 = r5.requireViewById(r3)
            android.widget.VideoView r3 = (android.widget.VideoView) r3
            r10.A01 = r3
            r3 = 2131436351(0x7f0b233f, float:1.849457E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            r10.A08 = r3
            r3 = 2131436356(0x7f0b2344, float:1.849458E38)
            android.view.View r3 = r5.requireViewById(r3)
            android.widget.VideoView r3 = (android.widget.VideoView) r3
            r10.A02 = r3
            r3 = 2131440020(0x7f0b3194, float:1.8502012E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            r10.A09 = r3
            r3 = 2131440037(0x7f0b31a5, float:1.8502046E38)
            android.view.View r3 = r5.requireViewById(r3)
            android.widget.VideoView r3 = (android.widget.VideoView) r3
            r10.A03 = r3
            r3 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r10.A06 = r3
            r3 = 2131442063(0x7f0b398f, float:1.8506155E38)
            android.view.View r3 = r5.requireViewById(r3)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r10.A05 = r3
            r10.A00 = r5
        L_0x0f80:
            X.4gE r9 = r0.A0C
            if (r9 == 0) goto L_0x10bd
            if (r5 == 0) goto L_0x0f89
            r5.setVisibility(r2)
        L_0x0f89:
            com.instagram.common.ui.base.IgTextView r5 = r10.A04
            if (r5 == 0) goto L_0x0f92
            java.lang.String r3 = r9.A03
            r5.setText(r3)
        L_0x0f92:
            com.instagram.common.ui.base.IgTextView r5 = r10.A06
            if (r5 == 0) goto L_0x0f9b
            java.lang.String r3 = r9.A05
            r5.setText(r3)
        L_0x0f9b:
            com.instagram.common.ui.base.IgTextView r5 = r10.A05
            if (r5 == 0) goto L_0x0fa4
            java.lang.String r3 = r9.A02
            r5.setText(r3)
        L_0x0fa4:
            X.IDX r12 = new X.IDX
            r3 = r41
            r12.<init>(r7, r0, r3)
            java.util.List r11 = r9.A08
            com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType r0 = com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType.VIDEO
            java.lang.String r5 = r0.toString()
            r6 = 0
            r3 = 0
            if (r11 == 0) goto L_0x10ba
            java.lang.Object r0 = X.00k.A0O(r11, r2)
            X.Cuy r0 = (X.C45356Cuy) r0
            if (r0 == 0) goto L_0x10ba
            java.lang.String r0 = r0.A00
        L_0x0fc1:
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0fed
            if (r11 == 0) goto L_0x10b7
            r0 = r16
            java.lang.Object r0 = X.00k.A0O(r11, r0)
            X.Cuy r0 = (X.C45356Cuy) r0
            if (r0 == 0) goto L_0x10b7
            java.lang.String r0 = r0.A00
        L_0x0fd5:
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0fed
            if (r11 == 0) goto L_0x0fe7
            java.lang.Object r0 = X.00k.A0O(r11, r8)
            X.Cuy r0 = (X.C45356Cuy) r0
            if (r0 == 0) goto L_0x0fe7
            java.lang.String r3 = r0.A00
        L_0x0fe7:
            boolean r0 = X.0qQ.A0K(r3, r5)
            if (r0 == 0) goto L_0x0fee
        L_0x0fed:
            r6 = 1
        L_0x0fee:
            r3 = 0
            if (r6 == 0) goto L_0x1070
            X.0Tu r0 = X.0Tu.A05
            r5 = 36325459000046562(0x810dd0000033e2, double:3.0357047702877656E-306)
            boolean r0 = X.182.A06(r0, r4, r5)
            if (r0 == 0) goto L_0x1070
            if (r11 == 0) goto L_0x106c
            java.lang.Object r9 = X.00k.A0O(r11, r2)
            X.Cuy r9 = (X.C45356Cuy) r9
            r0 = r16
            java.lang.Object r6 = X.00k.A0O(r11, r0)
            X.Cuy r6 = (X.C45356Cuy) r6
            java.lang.Object r5 = X.00k.A0O(r11, r8)
            X.Cuy r5 = (X.C45356Cuy) r5
        L_0x1014:
            android.widget.VideoView r4 = r10.A01
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r10.A07
            if (r9 == 0) goto L_0x1069
            java.lang.String r2 = r9.A01
            java.lang.String r0 = r9.A00
        L_0x101e:
            r13 = r4
            r14 = r7
            r15 = r3
            r16 = r2
            r17 = r0
            X.C63411KwX.A00(r12, r13, r14, r15, r16, r17)
            android.widget.VideoView r4 = r10.A02
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r10.A08
            if (r6 == 0) goto L_0x1066
            java.lang.String r2 = r6.A01
            java.lang.String r0 = r6.A00
        L_0x1032:
            r13 = r4
            r15 = r3
            r16 = r2
            r17 = r0
            X.C63411KwX.A00(r12, r13, r14, r15, r16, r17)
            android.widget.VideoView r3 = r10.A03
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r10.A09
            if (r5 == 0) goto L_0x1064
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r5.A00
        L_0x1045:
            r4 = r12
            r5 = r3
            r6 = r7
            r7 = r2
            r8 = r1
            r9 = r0
            X.C63411KwX.A00(r4, r5, r6, r7, r8, r9)
        L_0x104e:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A07
            if (r0 == 0) goto L_0x1055
            r0.setOnTouchListener(r12)
        L_0x1055:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A08
            if (r0 == 0) goto L_0x105c
            r0.setOnTouchListener(r12)
        L_0x105c:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A09
            if (r0 == 0) goto L_0x12fd
            r0.setOnTouchListener(r12)
            return
        L_0x1064:
            r0 = r1
            goto L_0x1045
        L_0x1066:
            r2 = r1
            r0 = r1
            goto L_0x1032
        L_0x1069:
            r2 = r1
            r0 = r1
            goto L_0x101e
        L_0x106c:
            r9 = r1
            r6 = r1
            r5 = r1
            goto L_0x1014
        L_0x1070:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r10.A07
            if (r4 == 0) goto L_0x1086
            java.util.List r0 = r9.A09
            if (r0 == 0) goto L_0x10b5
            java.lang.Object r2 = X.00k.A0O(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x107e:
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r2)
            r4.setUrl(r0, r7)
        L_0x1086:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r10.A08
            if (r4 == 0) goto L_0x109e
            java.util.List r2 = r9.A09
            if (r2 == 0) goto L_0x1096
            r0 = r16
            java.lang.Object r1 = X.00k.A0O(r2, r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x1096:
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r4.setUrl(r0, r7)
        L_0x109e:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r10.A09
            if (r1 == 0) goto L_0x104e
            java.util.List r0 = r9.A09
            if (r0 == 0) goto L_0x10ac
            java.lang.Object r3 = X.00k.A0O(r0, r8)
            java.lang.String r3 = (java.lang.String) r3
        L_0x10ac:
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r3)
            r1.setUrl(r0, r7)
            goto L_0x104e
        L_0x10b5:
            r2 = r1
            goto L_0x107e
        L_0x10b7:
            r0 = r1
            goto L_0x0fd5
        L_0x10ba:
            r0 = r1
            goto L_0x0fc1
        L_0x10bd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x10c5:
            r3.A06 = r0
            android.view.View r0 = r13.A00
            if (r0 != 0) goto L_0x1159
            android.view.ViewStub r0 = r13.A0D
            android.view.View r1 = r0.inflate()
            r13.A00 = r1
            if (r1 == 0) goto L_0x1159
            r0 = 2131436849(0x7f0b2531, float:1.849558E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r13.A0A = r0
            r0 = 2131436850(0x7f0b2532, float:1.8495582E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r13.A0B = r0
            r0 = 2131436847(0x7f0b252f, float:1.8495576E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r13.A07 = r0
            r0 = 2131436848(0x7f0b2530, float:1.8495578E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r13.A08 = r0
            r0 = 2131436855(0x7f0b2537, float:1.8495592E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r13.A03 = r0
            r0 = 2131436854(0x7f0b2536, float:1.849559E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r13.A02 = r0
            r0 = 2131436853(0x7f0b2535, float:1.8495588E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r13.A01 = r0
            r0 = 2131436852(0x7f0b2534, float:1.8495586E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r0
            r13.A0C = r0
            r0 = 2131436851(0x7f0b2533, float:1.8495584E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r13.A06 = r0
            r0 = 2131436846(0x7f0b252e, float:1.8495574E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r13.A09 = r0
            r0 = 2131436858(0x7f0b253a, float:1.8495598E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r13.A05 = r0
            r0 = 2131436857(0x7f0b2539, float:1.8495596E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r13.A04 = r0
        L_0x1159:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1161:
            r1 = 3
            X.0qQ.A0B(r6, r1)
            r3.A06 = r0
            r6.A01 = r4
            r6.A08 = r0
            android.view.View r0 = r6.A00
            if (r0 != 0) goto L_0x11fd
            android.view.ViewStub r0 = r6.A09
            android.view.View r4 = r0.inflate()
            r6.A00 = r4
            if (r4 == 0) goto L_0x11fd
            r0 = 2131436872(0x7f0b2548, float:1.8495627E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r6.A07 = r0
            r0 = 2131436875(0x7f0b254b, float:1.8495633E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r6.A05 = r0
            r0 = 2131436874(0x7f0b254a, float:1.849563E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r6.A04 = r0
            r0 = 2131436870(0x7f0b2546, float:1.8495623E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r6.A02 = r0
            r0 = 2131436871(0x7f0b2547, float:1.8495625E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r6.A03 = r0
            r3 = 0
            java.lang.Integer[] r1 = r6.A01
        L_0x11b3:
            X.6N5[] r5 = r6.A00
            r0 = r1[r3]
            int r0 = r0.intValue()
            android.view.View r8 = r4.requireViewById(r0)
            X.0qQ.A07(r8)
            r0 = 2131436868(0x7f0b2544, float:1.8495619E38)
            android.view.View r9 = r8.requireViewById(r0)
            X.0qQ.A07(r9)
            com.instagram.common.ui.base.IgTextView r9 = (com.instagram.common.ui.base.IgTextView) r9
            r0 = 2131436869(0x7f0b2545, float:1.849562E38)
            android.view.View r10 = r8.requireViewById(r0)
            X.0qQ.A07(r10)
            com.instagram.common.ui.base.IgTextView r10 = (com.instagram.common.ui.base.IgTextView) r10
            r0 = 2131436867(0x7f0b2543, float:1.8495617E38)
            android.view.View r11 = r8.requireViewById(r0)
            X.0qQ.A07(r11)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = (com.instagram.common.ui.widget.imageview.IgImageView) r11
            r0 = 2131436865(0x7f0b2541, float:1.8495612E38)
            android.view.View r12 = r8.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r12 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r12
            X.6N5 r7 = new X.6N5
            r7.<init>(r8, r9, r10, r11, r12)
            r5[r3] = r7
            int r3 = r3 + 1
            r0 = r23
            if (r3 >= r0) goto L_0x11fd
            goto L_0x11b3
        L_0x11fd:
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x1204
            r0.setVisibility(r2)
        L_0x1204:
            android.view.View r4 = r6.A00
            if (r4 == 0) goto L_0x122c
            X.6NJ r3 = r6.A06
            if (r3 != 0) goto L_0x1229
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int[] r1 = X.XYW.A01
            r0 = 7
            int r3 = r2.nextInt(r0)
            android.content.Context r2 = r4.getContext()
            r1 = r1[r3]
            int[] r0 = X.XYW.A00
            r0 = r0[r3]
            X.6NJ r3 = new X.6NJ
            r3.<init>(r2, r1, r0)
            r6.A06 = r3
        L_0x1229:
            r4.setBackground(r3)
        L_0x122c:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r6.A07
            if (r3 == 0) goto L_0x1251
            android.content.Context r2 = r3.getContext()
            X.0qQ.A07(r2)
            r0 = 2131238789(0x7f081f85, float:1.8093867E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x124e
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
        L_0x124e:
            r3.setImageDrawable(r1)
        L_0x1251:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x1259:
            r3.A06 = r0
            android.view.View r0 = r12.A00
            if (r0 != 0) goto L_0x127f
            android.view.ViewStub r0 = r12.A04
            android.view.View r3 = r0.inflate()
            r12.A00 = r3
            if (r3 == 0) goto L_0x127f
            r0 = 2131436846(0x7f0b252e, float:1.8495574E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r12.A03 = r0
            r0 = 2131436858(0x7f0b253a, float:1.8495598E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r12.A01 = r0
        L_0x127f:
            android.view.View r0 = r12.A00
            if (r0 == 0) goto L_0x1286
            r0.setVisibility(r2)
        L_0x1286:
            android.view.View r5 = r12.A00
            if (r5 == 0) goto L_0x12ae
            X.6NJ r4 = r12.A02
            if (r4 != 0) goto L_0x12ab
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            int[] r2 = X.XYX.A01
            r0 = 7
            int r4 = r3.nextInt(r0)
            android.content.Context r3 = r5.getContext()
            r2 = r2[r4]
            int[] r0 = X.XYX.A00
            r0 = r0[r4]
            X.6NJ r4 = new X.6NJ
            r4.<init>(r3, r2, r0)
            r12.A02 = r4
        L_0x12ab:
            r5.setBackground(r4)
        L_0x12ae:
            com.instagram.common.ui.base.IgTextView r0 = r12.A01
            if (r0 == 0) goto L_0x12b5
            r0.setText(r1)
        L_0x12b5:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r12.A03
            if (r3 == 0) goto L_0x12fd
            android.content.Context r2 = r3.getContext()
            X.0qQ.A07(r2)
            r0 = 2131238789(0x7f081f85, float:1.8093867E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x12d7
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
        L_0x12d7:
            r3.setImageDrawable(r1)
            return
        L_0x12db:
            r40.A00()
            r40.A00()
            r1 = r40
            android.view.View r1 = r1.A00
            if (r1 == 0) goto L_0x1350
            r1.setVisibility(r2)
            boolean r1 = r9.A0b
            if (r1 == 0) goto L_0x12fe
            X.C70315O1t.A00(r40)
        L_0x12f1:
            r5 = r7
            r6 = r4
            r7 = r0
            r8 = r9
            r9 = r3
            r10 = r41
            r11 = r16
            A02(r5, r6, r7, r8, r9, r10, r11)
        L_0x12fd:
            return
        L_0x12fe:
            r40.A00()
            r1 = r40
            android.widget.ImageView r2 = r1.A01
            if (r2 == 0) goto L_0x1348
            r1 = 2131231034(0x7f08013a, float:1.8078138E38)
            r2.setImageResource(r1)
            r40.A00()
            r1 = r40
            android.widget.TextView r2 = r1.A03
            if (r2 == 0) goto L_0x1340
            X.4g7 r5 = r0.A0h
            if (r5 != 0) goto L_0x1333
            r1 = 0
        L_0x131b:
            r2.setText(r1)
            r40.A00()
            r1 = r40
            android.widget.TextView r2 = r1.A02
            if (r2 == 0) goto L_0x1338
            if (r5 != 0) goto L_0x132e
            r1 = 0
        L_0x132a:
            r2.setText(r1)
            goto L_0x12f1
        L_0x132e:
            java.lang.String r1 = r5.A02()
            goto L_0x132a
        L_0x1333:
            java.lang.String r1 = r5.A03()
            goto L_0x131b
        L_0x1338:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1340:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1348:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1350:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1358:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x135e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x1364:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x136a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x1370:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x1376:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306586Ms.A01(X.0iw, X.2nJ, com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6Yf, X.Mqa, X.6n1, int, int):void");
    }
}
