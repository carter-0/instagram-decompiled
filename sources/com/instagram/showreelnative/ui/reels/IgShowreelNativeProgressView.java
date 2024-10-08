package com.instagram.showreelnative.ui.reels;

import X.0Tu;
import X.0fS;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass59L;
import X.AnonymousClass623;
import X.AnonymousClass624;
import X.AnonymousClass65k;
import X.AnonymousClass6L7;
import X.AnonymousClass6LO;
import X.AnonymousClass7TE;
import X.AnonymousClass9J6;
import X.C255773uh;
import X.C267934cU;
import X.C273654mx;
import X.C305876Jx;
import X.C51965G9l;
import X.C51968G9o;
import X.C51974G9v;
import X.C52503GVg;
import X.C54028GyD;
import X.C59669JSo;
import X.C67671vk;
import X.DbS;
import X.ID1;
import X.JQA;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import java.util.List;
import kotlin.Deprecated;

public final class IgShowreelNativeProgressView extends FrameLayout implements C267934cU {
    public static final int A06 = IgShowreelNativeProgressView.class.hashCode();
    public int A00;
    public ProgressBar A01;
    public ColorFilterAlphaImageView A02;
    public C305876Jx A03;
    public C54028GyD A04;
    public boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelNativeProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00();
    }

    public final void reset() {
        String str;
        this.A03 = null;
        ProgressBar progressBar = this.A01;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setProgress(0);
            C54028GyD gyD = this.A04;
            if (gyD == null) {
                str = "mediaView";
            } else {
                gyD.reset();
                A01(this, 0);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Use the overload with ShowreelInteractivityListener instead")
    public final void setInteractivityListener(C59669JSo jSo) {
        0qQ.A0B(jSo, 0);
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.A04 = jSo;
        }
    }

    public final void setShowreelAnimation(UserSession userSession, List list, C255773uh r9, AnonymousClass6L7 r10, AnonymousClass6LO r11) {
        UserSession userSession2 = userSession;
        List list2 = list;
        AnonymousClass6L7 r4 = r10;
        C51974G9v.A1K(userSession, list, r10);
        reset();
        C255773uh r3 = r9;
        AnonymousClass6LO r5 = r11;
        this.A03 = new C305876Jx(userSession2, list2, r3, r4, r5);
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.setShowreelAnimation(userSession2, list2, r3, r4, r5);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.GyD, X.59L] */
    private final void A00() {
        Throwable th;
        boolean A0E;
        if (Systrace.A0E(1)) {
            0fS.A01("IgShowreelNativeProgressView::init", -871075436);
        }
        try {
            removeAllViews();
            Context A0S = AnonymousClass7TE.A0S(this);
            AnonymousClass9J6 r13 = new AnonymousClass9J6("sn_integration_reels", "IG_STORIES", 0);
            C67671vk r5 = C67671vk.A01;
            UserSession userSession = r5.A00;
            if (userSession != null) {
                int A042 = DbS.A04(0Tu.A05, userSession, 36592253780623741L);
                r5.A00 = userSession;
                ? r10 = new AnonymousClass59L(A0S, (AttributeSet) null, r13, new AnonymousClass624(r5, A042, false), (AnonymousClass623) null, A0S.getMainExecutor(), 0);
                this.A04 = r10;
                r10.A02(new C52503GVg(this), A06);
                IgProgressImageViewProgressBar igProgressImageViewProgressBar = new IgProgressImageViewProgressBar(A0S, (AttributeSet) null, 16842872);
                this.A01 = igProgressImageViewProgressBar;
                igProgressImageViewProgressBar.setIndeterminate(true);
                ProgressBar progressBar = this.A01;
                String str = "progressBar";
                if (progressBar != null) {
                    progressBar.setProgressDrawable(A0S.getDrawable(R.drawable.feed_image_determinate_progress));
                    ProgressBar progressBar2 = this.A01;
                    if (progressBar2 != null) {
                        progressBar2.setIndeterminateDrawable(A0S.getDrawable(R.drawable.video_indeterminate_progress));
                        ColorFilterAlphaImageView colorFilterAlphaImageView = new ColorFilterAlphaImageView(A0S);
                        this.A02 = colorFilterAlphaImageView;
                        colorFilterAlphaImageView.setImageResource(R.drawable.refresh_big);
                        ColorFilterAlphaImageView colorFilterAlphaImageView2 = this.A02;
                        if (colorFilterAlphaImageView2 != null) {
                            colorFilterAlphaImageView2.setNormalColor(C51968G9o.A04(A0S));
                            ColorFilterAlphaImageView colorFilterAlphaImageView3 = this.A02;
                            if (colorFilterAlphaImageView3 != null) {
                                colorFilterAlphaImageView3.setOnClickListener(ID1.A00(this, 7));
                                C54028GyD gyD = this.A04;
                                if (gyD == null) {
                                    str = "mediaView";
                                } else {
                                    addView(gyD, new FrameLayout.LayoutParams(-1, -1, 17));
                                    ProgressBar progressBar3 = this.A01;
                                    if (progressBar3 != null) {
                                        addView(progressBar3, new FrameLayout.LayoutParams(-1, -2, 17));
                                        ColorFilterAlphaImageView colorFilterAlphaImageView4 = this.A02;
                                        if (colorFilterAlphaImageView4 != null) {
                                            int dimension = (int) colorFilterAlphaImageView4.getResources().getDimension(R.dimen.ad_not_delivering_thumbnail_height);
                                            ColorFilterAlphaImageView colorFilterAlphaImageView5 = this.A02;
                                            if (colorFilterAlphaImageView5 != null) {
                                                addView(colorFilterAlphaImageView5, new FrameLayout.LayoutParams(dimension, dimension, 17));
                                                if (!A0E) {
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F("errorRetryImageView");
                        th = AnonymousClass00P.createAndThrow();
                    }
                }
                0qQ.A0F(str);
                th = AnonymousClass00P.createAndThrow();
            } else {
                th = new RuntimeException(C273654mx.A00(1401));
            }
            throw th;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(788004836);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r4.A05 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r4, int r5) {
        /*
            int r0 = r4.A00
            if (r0 == r5) goto L_0x0033
            r4.A00 = r5
            android.widget.ProgressBar r2 = r4.A01
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = "progressBar"
        L_0x000c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            r0 = 1
            r3 = 0
            if (r5 != r0) goto L_0x001d
            boolean r1 = r4.A05
            r0 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001d:
            r0 = 8
        L_0x001f:
            r2.setVisibility(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r2 = r4.A02
            if (r2 != 0) goto L_0x0029
            java.lang.String r0 = "errorRetryImageView"
            goto L_0x000c
        L_0x0029:
            int r1 = r4.A00
            r0 = 3
            if (r1 == r0) goto L_0x0030
            r3 = 8
        L_0x0030:
            r2.setVisibility(r3)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView.A01(com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView, int):void");
    }

    public final void A02(int i) {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        }
        SparseArray sparseArray = gyD.A0F;
        synchronized (sparseArray) {
            sparseArray.remove(i);
        }
    }

    public final void A03(AnonymousClass65k r2, int i) {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.A02(r2, i);
        }
    }

    public final boolean CWX() {
        C54028GyD gyD = this.A04;
        if (gyD != null) {
            return gyD.CWX();
        }
        C51965G9l.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dyz() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.Dyz();
        }
    }

    public final void Dz8() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.Dz8();
        }
    }

    public final void DzB() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.DzB();
        }
    }

    public final void E2p() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.E2p();
        }
    }

    public final void EIx() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.EIx();
        }
    }

    public final long getDurationSeconds() {
        C54028GyD gyD = this.A04;
        if (gyD != null) {
            return gyD.getDurationSeconds();
        }
        C51965G9l.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final ImageView getImageView() {
        C54028GyD gyD = this.A04;
        if (gyD != null) {
            return gyD.A0J;
        }
        C51965G9l.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final ImmutableMap getRenderingComponentInfos() {
        C54028GyD gyD = this.A04;
        if (gyD != null) {
            return gyD.getRenderingComponentInfos();
        }
        C51965G9l.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void pause() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.pause();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r4 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setEnableProgressBar(boolean r4) {
        /*
            r3 = this;
            r3.A05 = r4
            android.widget.ProgressBar r2 = r3.A01
            if (r2 != 0) goto L_0x0010
            java.lang.String r0 = "progressBar"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0010:
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x0018
            r0 = 0
            if (r4 != 0) goto L_0x001a
        L_0x0018:
            r0 = 8
        L_0x001a:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView.setEnableProgressBar(boolean):void");
    }

    public final void setPlaceHolderColor(int i) {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.setPlaceHolderColor(i);
        }
    }

    public final void stop() {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.stop();
        }
    }

    public final boolean isPlaying() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        getImageView().setScaleType(scaleType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelNativeProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00();
    }

    public final void setInteractivityListener(JQA jqa) {
        C54028GyD gyD = this.A04;
        if (gyD == null) {
            C51965G9l.A14();
            throw AnonymousClass00P.createAndThrow();
        } else {
            gyD.setInteractivityListener(jqa);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelNativeProgressView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }
}
