package com.instagram.ui.mediaactions;

import X.002;
import X.0eO;
import X.0qQ;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C20698WxU;
import X.C51965G9l;
import X.C66580MXl;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import X.C71396Ojv;
import X.C71450Okp;
import X.C73145PXg;
import X.C73271PZp;
import X.DbU;
import X.DbX;
import X.GNY;
import X.JTT;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.instagram.android.R;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ScrubberWithKeyFrames extends AppCompatSeekBar {
    public GNY A00;
    public final Path A01;
    public final List A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrubberWithKeyFrames(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* access modifiers changed from: private */
    public final void setupAdKeyFrameMarkersInternal(FrameLayout frameLayout, Activity activity, String str) {
        FrameLayout frameLayout2 = frameLayout;
        Activity activity2 = activity;
        String str2 = str;
        if (frameLayout.getWidth() <= 0 || getWidth() <= 0) {
            if (frameLayout.getWidth() == 0) {
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C71450Okp(activity2, frameLayout2, this, str2, 0));
            }
            if (getWidth() == 0) {
                getViewTreeObserver().addOnGlobalLayoutListener(new C71450Okp(activity2, frameLayout2, this, str2, 1));
                return;
            }
            return;
        }
        setupAdsKeyFramesMarkerContainers(frameLayout, activity, str);
    }

    public final void onDraw(Canvas canvas) {
        float f;
        0qQ.A0B(canvas, 0);
        List<GNY> list = this.A02;
        if (!list.isEmpty()) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            Path path = this.A01;
            path.reset();
            AnonymousClass0eM r3 = this.A05;
            float measuredHeight = (((float) getMeasuredHeight()) - C66582MXn.A00(r3)) + C66582MXn.A00(this.A03);
            for (GNY gny : list) {
                float paddingLeft = ((float) getPaddingLeft()) + (((float) measuredWidth) * gny.A00);
                View view = (View) ((Reference) gny.A01).get();
                if (view != null) {
                    f = view.getScaleX();
                } else {
                    f = 1.0f;
                }
                path.addCircle(paddingLeft, measuredHeight, (C66582MXn.A00(r3) * f) + C66582MXn.A00(this.A06), Path.Direction.CCW);
            }
            canvas.clipOutPath(path);
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca A[LOOP:1: B:36:0x00c4->B:38:0x00ca, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupAdKeyFrameMarkers(android.app.Activity r10, java.lang.String r11, java.util.List r12, java.lang.Long r13) {
        /*
            r9 = this;
            r3 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r3, r10, r11)
            if (r12 == 0) goto L_0x00e6
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00e6
            if (r13 == 0) goto L_0x00e6
            long r0 = r13.longValue()
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e6
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r12.iterator()
        L_0x0021:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r7.next()
            X.DTV r5 = (X.DTV) r5
            java.lang.Integer r5 = r5.Byu()
            if (r5 == 0) goto L_0x0021
            int r5 = r5.intValue()
            float r6 = (float) r5
            float r5 = (float) r0
            float r6 = r6 / r5
            java.lang.Float r5 = java.lang.Float.valueOf(r6)
            if (r5 == 0) goto L_0x0021
            r2.add(r5)
            goto L_0x0021
        L_0x0044:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "\n      setupAdKeyFrameMarkers:\n      clipId = "
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = "\n      videoDurationMs = "
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = "\n      videoHighlights = [\n          "
            r5.append(r0)
            java.lang.String r1 = ",\n          "
            r8 = 0
            X.DOy r0 = X.C46171DOy.A00
            java.lang.String r0 = X.DbT.A0z(r1, r12, r0)
            r5.append(r0)
            java.lang.String r0 = "\n      ]\n      Computed markerLocations = "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = "\n      "
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r5)
            X.0rw.A0t(r0)
            int r0 = r2.size()
            if (r0 < r4) goto L_0x00e6
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0091
            android.view.View r1 = r0.getChildAt(r3)
            if (r1 != 0) goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            r7 = 0
            if (r1 == 0) goto L_0x00ad
            r0 = 2131430133(0x7f0b0af5, float:1.8481958E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto L_0x00b6
            r0 = 2131430132(0x7f0b0af4, float:1.8481956E38)
            android.view.ViewStub r0 = X.DbS.A0F(r1, r0)
            if (r0 == 0) goto L_0x00ad
            android.view.View r7 = r0.inflate()
        L_0x00ad:
            boolean r0 = r7 instanceof com.instagram.common.ui.base.IgFrameLayout
            if (r0 == 0) goto L_0x00e6
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 != 0) goto L_0x00b7
            return
        L_0x00b6:
            r7 = r0
        L_0x00b7:
            java.util.List r6 = r9.A02
            r6.clear()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x00c4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r4.next()
            float r3 = X.AnonymousClass7TE.A04(r0)
            java.lang.ref.WeakReference r2 = X.C51965G9l.A0v(r8)
            r1 = 7
            X.GNY r0 = new X.GNY
            r0.<init>((java.lang.Object) r2, (float) r3, (int) r1)
            r5.add(r0)
            goto L_0x00c4
        L_0x00e0:
            r6.addAll(r5)
            r9.setupAdKeyFrameMarkersInternal(r7, r10, r11)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.mediaactions.ScrubberWithKeyFrames.setupAdKeyFrameMarkers(android.app.Activity, java.lang.String, java.util.List, java.lang.Long):void");
    }

    private final float getCenterYOffset() {
        return C66582MXn.A00(this.A03);
    }

    private final int getMarkerDiameter() {
        return DbX.A07(this.A04);
    }

    private final float getMarkerRadii() {
        return C66582MXn.A00(this.A05);
    }

    private final float getRadiusOffset() {
        return C66582MXn.A00(this.A06);
    }

    private final void setupAdsKeyFramesMarkerContainers(FrameLayout frameLayout, Activity activity, String str) {
        List list = this.A02;
        if (list.size() >= 1) {
            int A042 = C66582MXn.A04(this, getMeasuredWidth());
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                GNY gny = (GNY) next;
                String str2 = str;
                0qQ.A0B(str2, 0);
                String A0V = 002.A0V("ad_keyframe_marker_", str2, '_', i);
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout2.findViewWithTag(A0V) == null) {
                    int paddingLeft = getPaddingLeft() + ((int) (((float) A042) * gny.A00));
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                    Activity activity2 = activity;
                    FrameLayout frameLayout3 = new FrameLayout(activity2);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                    layoutParams.gravity = 16;
                    frameLayout3.setLayoutParams(layoutParams);
                    frameLayout3.setTranslationX(((float) paddingLeft) - (((float) dimensionPixelSize) / 2.0f));
                    frameLayout3.setOnClickListener(new C71396Ojv(frameLayout3, 63));
                    View view = new View(activity2);
                    AnonymousClass0eM r3 = this.A04;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DbX.A07(r3), DbX.A07(r3));
                    layoutParams2.gravity = 16;
                    view.setLayoutParams(layoutParams2);
                    DbU.A11(activity2, view, R.drawable.clips_keyframe_marker);
                    view.setVisibility(0);
                    view.setTranslationX(((float) (dimensionPixelSize - DbX.A07(r3))) / 2.0f);
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    view.setAlpha(0.0f);
                    view.setTag(A0V);
                    frameLayout3.addView(view);
                    frameLayout2.addView(frameLayout3);
                    gny.A01 = C51965G9l.A0v(view);
                    A02(view, this);
                }
                i = i2;
            }
        }
    }

    public static final void A02(View view, ScrubberWithKeyFrames scrubberWithKeyFrames) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.requestLayout();
            view.post(new C73271PZp(view, scrubberWithKeyFrames));
            return;
        }
        C66581MXm.A0E(view.animate(), 1.0f).alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(500).start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object next;
        int A052 = AnonymousClass0fD.A05(1286291334);
        List list = this.A02;
        if (AnonymousClass7TE.A1b(list) && motionEvent != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2)) {
            int A042 = C66582MXn.A04(this, getMeasuredWidth());
            float x = motionEvent.getX();
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    float f = (float) A042;
                    float A002 = AnonymousClass7TE.A00(x, ((float) getPaddingLeft()) + (((GNY) next).A00 * f));
                    do {
                        Object next2 = it.next();
                        float A003 = AnonymousClass7TE.A00(x, ((float) getPaddingLeft()) + (((GNY) next2).A00 * f));
                        if (Float.compare(A002, A003) > 0) {
                            next = next2;
                            A002 = A003;
                        }
                    } while (it.hasNext());
                }
            }
            GNY gny = (GNY) next;
            if (gny != null) {
                float A004 = AnonymousClass7TE.A00(x, ((float) getPaddingLeft()) + (((float) A042) * gny.A00));
                AnonymousClass0eM r1 = this.A04;
                if (A004 <= ((float) DbX.A07(r1)) && !0qQ.A0K(this.A00, gny)) {
                    setHapticFeedbackEnabled(true);
                    performHapticFeedback(1);
                    View view = (View) ((Reference) gny.A01).get();
                    if (view != null) {
                        C66580MXl.A1D(C66583MXo.A0E(view.animate(), 2.0f), new C73145PXg(view));
                    }
                    this.A00 = gny;
                } else if (A004 > ((float) DbX.A07(r1))) {
                    this.A00 = null;
                }
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-1134909475, A052);
        return onTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrubberWithKeyFrames(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A01 = C51965G9l.A0C();
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 16));
        this.A05 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 17));
        this.A02 = AnonymousClass7TE.A1C();
        this.A06 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 18));
        this.A03 = AnonymousClass0eN.A00(r2, new C20698WxU((Object) this, 15));
    }

    public /* synthetic */ ScrubberWithKeyFrames(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrubberWithKeyFrames(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
