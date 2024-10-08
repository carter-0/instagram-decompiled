package com.google.android.material.transition.platform;

import X.AnonymousClass6Y2;
import X.C13992Tns;
import X.C14703U2h;
import X.C17478VXf;
import X.C18667VwP;
import X.C297885sW;
import X.C297895sX;
import X.C297925sa;
import X.C324126yg;
import X.DbW;
import X.VR6;
import X.W3G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.TypedValue;
import android.view.View;
import com.instagram.android.R;

public final class MaterialContainerTransform extends Transition {
    public static final C17478VXf DEFAULT_ENTER_THRESHOLDS = new C17478VXf(new VR6(0.0f, 0.25f), new VR6(0.0f, 1.0f), new VR6(0.0f, 1.0f), new VR6(0.0f, 0.75f));
    public static final C17478VXf DEFAULT_ENTER_THRESHOLDS_ARC = new C17478VXf(new VR6(0.1f, 0.4f), new VR6(0.1f, 1.0f), new VR6(0.1f, 1.0f), new VR6(0.1f, 0.9f));
    public static final C17478VXf DEFAULT_RETURN_THRESHOLDS = new C17478VXf(new VR6(0.6f, 0.9f), new VR6(0.0f, 1.0f), new VR6(0.0f, 0.9f), new VR6(0.3f, 0.9f));
    public static final C17478VXf DEFAULT_RETURN_THRESHOLDS_ARC = new C17478VXf(new VR6(0.6f, 0.9f), new VR6(0.0f, 0.9f), new VR6(0.0f, 0.9f), new VR6(0.2f, 0.9f));
    public static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    public static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    public static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    public static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    public boolean appliedThemeValues;
    public int containerColor;
    public boolean drawDebugEnabled;
    public int drawingViewId;
    public boolean elevationShadowEnabled = true;
    public int endContainerColor;
    public float endElevation = -1.0f;
    public C297895sX endShapeAppearanceModel;
    public View endView;
    public int endViewId;
    public int fadeMode;
    public VR6 fadeProgressThresholds;
    public int fitMode;
    public boolean holdAtEndEnabled;
    public boolean pathMotionCustom;
    public VR6 scaleMaskProgressThresholds;
    public VR6 scaleProgressThresholds;
    public int scrimColor;
    public VR6 shapeMaskProgressThresholds;
    public int startContainerColor;
    public float startElevation = -1.0f;
    public C297895sX startShapeAppearanceModel;
    public View startView;
    public int startViewId;
    public int transitionDirection;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void captureValues(android.transition.TransitionValues r6, android.view.View r7, int r8, X.C297895sX r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x007c
            android.view.View r2 = r6.view
            android.graphics.RectF r0 = X.W3G.A00
            android.view.View r7 = r2.findViewById(r8)
            if (r7 != 0) goto L_0x001c
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r1 = r0.getResourceName(r8)
        L_0x0015:
            int r0 = r2.getId()
            if (r0 != r8) goto L_0x006f
            r7 = r2
        L_0x001c:
            r6.view = r7
        L_0x001e:
            android.view.View r5 = r6.view
            boolean r0 = r5.isLaidOut()
            if (r0 != 0) goto L_0x0032
            int r0 = r5.getWidth()
            if (r0 != 0) goto L_0x0032
            int r0 = r5.getHeight()
            if (r0 == 0) goto L_0x0069
        L_0x0032:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x006a
            android.graphics.RectF r0 = X.W3G.A00
            int r0 = r5.getLeft()
            float r4 = (float) r0
            int r0 = r5.getTop()
            float r2 = (float) r0
            int r0 = r5.getRight()
            float r1 = (float) r0
            int r0 = r5.getBottom()
            float r0 = (float) r0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r4, r2, r1, r0)
        L_0x0053:
            java.util.Map r1 = r6.values
            java.lang.String r0 = "materialContainerTransition:bounds"
            r1.put(r0, r3)
            java.util.Map r2 = r6.values
            X.5sX r0 = getShapeAppearance(r5, r9)
            X.5sX r1 = X.W3G.A05(r3, r0)
            java.lang.String r0 = "materialContainerTransition:shapeAppearance"
            r2.put(r0, r1)
        L_0x0069:
            return
        L_0x006a:
            android.graphics.RectF r3 = X.W3G.A03(r5)
            goto L_0x0053
        L_0x006f:
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x009a
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x009a
            goto L_0x0015
        L_0x007c:
            if (r7 != 0) goto L_0x001c
            android.view.View r0 = r6.view
            r2 = 2131436570(0x7f0b241a, float:1.8495014E38)
            java.lang.Object r0 = r0.getTag(r2)
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x001e
            android.view.View r0 = r6.view
            java.lang.Object r7 = r0.getTag(r2)
            android.view.View r7 = (android.view.View) r7
            android.view.View r1 = r6.view
            r0 = 0
            r1.setTag(r2, r0)
            goto L_0x001c
        L_0x009a:
            java.lang.String r0 = " is not a valid ancestor"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.captureValues(android.transition.TransitionValues, android.view.View, int, X.5sX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r1 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r24 = X.C17162VKo.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (r1 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r24 = X.C17162VKo.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
        if (r0 >= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator createAnimator(android.view.ViewGroup r37, android.transition.TransitionValues r38, android.transition.TransitionValues r39) {
        /*
            r36 = this;
            r11 = 0
            r4 = r38
            if (r38 == 0) goto L_0x0181
            r3 = r39
            if (r39 == 0) goto L_0x0181
            java.util.Map r0 = r4.values
            java.lang.String r2 = "materialContainerTransition:bounds"
            java.lang.Object r8 = r0.get(r2)
            android.graphics.RectF r8 = (android.graphics.RectF) r8
            java.util.Map r0 = r4.values
            java.lang.String r1 = "materialContainerTransition:shapeAppearance"
            java.lang.Object r7 = r0.get(r1)
            X.5sX r7 = (X.C297895sX) r7
            if (r8 == 0) goto L_0x0175
            if (r7 == 0) goto L_0x0175
            java.util.Map r0 = r3.values
            java.lang.Object r6 = r0.get(r2)
            android.graphics.RectF r6 = (android.graphics.RectF) r6
            java.util.Map r0 = r3.values
            java.lang.Object r5 = r0.get(r1)
            X.5sX r5 = (X.C297895sX) r5
            if (r6 == 0) goto L_0x017a
            if (r5 == 0) goto L_0x017a
            android.view.View r10 = r4.view
            android.view.View r4 = r3.view
            android.view.ViewParent r0 = r4.getParent()
            r12 = r10
            if (r0 == 0) goto L_0x0041
            r12 = r4
        L_0x0041:
            r9 = r36
            int r1 = r9.drawingViewId
            int r0 = r12.getId()
            if (r1 != r0) goto L_0x00be
            android.view.ViewParent r3 = r12.getParent()
            android.view.View r3 = (android.view.View) r3
            r11 = r12
        L_0x0052:
            android.graphics.RectF r2 = X.W3G.A03(r3)
            float r0 = r2.left
            float r1 = -r0
            float r0 = r2.top
            float r0 = -r0
            android.graphics.RectF r2 = calculateDrawableBounds(r3, r11, r1, r0)
            r8.offset(r1, r0)
            r6.offset(r1, r0)
            boolean r1 = r9.isEntering(r8, r6)
            boolean r0 = r9.appliedThemeValues
            if (r0 != 0) goto L_0x0075
            android.content.Context r0 = r12.getContext()
            r9.maybeApplyThemeValues(r0, r1)
        L_0x0075:
            android.transition.PathMotion r19 = r9.getPathMotion()
            float r0 = r9.startElevation
            float r27 = getElevationOrDefault(r0, r10)
            float r0 = r9.endElevation
            float r28 = getElevationOrDefault(r0, r4)
            int r0 = r9.containerColor
            r20 = r0
            int r15 = r9.startContainerColor
            int r14 = r9.endContainerColor
            int r13 = r9.scrimColor
            boolean r12 = r9.elevationShadowEnabled
            int r11 = r9.fadeMode
            if (r11 == 0) goto L_0x00b4
            r0 = 1
            if (r11 == r0) goto L_0x00b9
            r0 = 2
            if (r11 == r0) goto L_0x00b1
            r0 = 3
            if (r11 != r0) goto L_0x0167
            X.X1E r24 = X.C17162VKo.A03
        L_0x00a0:
            int r11 = r9.fitMode
            if (r11 == 0) goto L_0x00de
            r0 = 1
            if (r11 == r0) goto L_0x00fe
            r0 = 2
            if (r11 == r0) goto L_0x0164
            java.lang.String r0 = "Invalid fit mode: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r11)
            throw r0
        L_0x00b1:
            X.X1E r24 = X.C17162VKo.A00
            goto L_0x00a0
        L_0x00b4:
            if (r1 == 0) goto L_0x00bb
        L_0x00b6:
            X.X1E r24 = X.C17162VKo.A01
            goto L_0x00a0
        L_0x00b9:
            if (r1 == 0) goto L_0x00b6
        L_0x00bb:
            X.X1E r24 = X.C17162VKo.A02
            goto L_0x00a0
        L_0x00be:
            int r2 = r9.drawingViewId
            r3 = r12
            android.graphics.RectF r0 = X.W3G.A00
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r1 = r0.getResourceName(r2)
        L_0x00cb:
            int r0 = r3.getId()
            if (r0 == r2) goto L_0x0052
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x016e
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x016e
            goto L_0x00cb
        L_0x00de:
            float r18 = r8.width()
            float r17 = r8.height()
            float r16 = r6.width()
            float r0 = r6.height()
            float r11 = r0 * r18
            float r11 = r11 / r16
            float r16 = r16 * r17
            float r16 = r16 / r18
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x00fc
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
        L_0x00fc:
            if (r0 < 0) goto L_0x0164
        L_0x00fe:
            X.X7e r25 = X.VKY.A01
        L_0x0100:
            X.VXf r26 = r9.buildThresholdsGroup(r1)
            boolean r11 = r9.drawDebugEnabled
            X.U19 r0 = new X.U19
            r29 = r20
            r30 = r15
            r31 = r14
            r32 = r13
            r33 = r1
            r34 = r12
            r35 = r11
            r20 = r10
            r21 = r4
            r22 = r7
            r23 = r5
            r16 = r0
            r17 = r8
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            float r1 = r2.left
            int r7 = java.lang.Math.round(r1)
            float r1 = r2.top
            int r6 = java.lang.Math.round(r1)
            float r1 = r2.right
            int r5 = java.lang.Math.round(r1)
            float r1 = r2.bottom
            int r1 = java.lang.Math.round(r1)
            r0.setBounds(r7, r6, r5, r1)
            r5 = 2
            float[] r1 = new float[r5]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            X.W4K r1 = new X.W4K
            r1.<init>(r5, r9, r0)
            r2.addUpdateListener(r1)
            X.W7x r1 = new X.W7x
            r11 = r1
            r12 = r3
            r13 = r10
            r14 = r4
            r15 = r0
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r9.addListener(r1)
            return r2
        L_0x0164:
            X.X7e r25 = X.VKY.A00
            goto L_0x0100
        L_0x0167:
            java.lang.String r0 = "Invalid fade mode: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r11)
            throw r0
        L_0x016e:
            java.lang.String r0 = " is not a valid ancestor"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0175:
            java.lang.String r1 = TAG
            java.lang.String r0 = "Skipping due to null start bounds. Ensure start view is laid out and measured."
            goto L_0x017e
        L_0x017a:
            java.lang.String r1 = TAG
            java.lang.String r0 = "Skipping due to null end bounds. Ensure end view is laid out and measured."
        L_0x017e:
            android.util.Log.w(r1, r0)
        L_0x0181:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
    }

    public static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF A03 = W3G.A03(view2);
        A03.offset(f, f2);
        return A03;
    }

    public static float getElevationOrDefault(float f, View view) {
        if (f == -1.0f) {
            return view.getElevation();
        }
        return f;
    }

    public static C297895sX getShapeAppearance(View view, C297895sX r6) {
        C324126yg r0;
        if (r6 != null) {
            return r6;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof C297895sX) {
            return (C297895sX) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        if (transitionShapeAppearanceResId != -1) {
            r0 = C297895sX.A02(context, new C297925sa(0.0f), transitionShapeAppearanceResId, 0);
        } else if (view instanceof C297885sW) {
            return ((C297885sW) view).getShapeAppearanceModel();
        } else {
            r0 = new C324126yg();
        }
        return new C297895sX(r0);
    }

    private C17478VXf getThresholdsOrDefault(boolean z, C17478VXf vXf, C17478VXf vXf2) {
        if (!z) {
            vXf = vXf2;
        }
        VR6 vr6 = this.fadeProgressThresholds;
        VR6 vr62 = vXf.A00;
        RectF rectF = W3G.A00;
        if (vr6 == null) {
            vr6 = vr62;
        }
        VR6 vr63 = this.scaleProgressThresholds;
        VR6 vr64 = vXf.A01;
        if (vr63 == null) {
            vr63 = vr64;
        }
        VR6 vr65 = this.scaleMaskProgressThresholds;
        VR6 vr66 = vXf.A02;
        if (vr65 == null) {
            vr65 = vr66;
        }
        VR6 vr67 = this.shapeMaskProgressThresholds;
        VR6 vr68 = vXf.A03;
        if (vr67 == null) {
            vr67 = vr68;
        }
        return new C17478VXf(vr6, vr63, vr65, vr67);
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            RectF rectF3 = W3G.A00;
            if (rectF2.width() * rectF2.height() > rectF.width() * rectF.height()) {
                return true;
            }
            return false;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw DbW.A0a("Invalid transition direction: ", i);
        }
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public C297895sX getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public View getEndView() {
        return this.endView;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public VR6 getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public VR6 getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public VR6 getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public VR6 getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public C297895sX getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public View getStartView() {
        return this.startView;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public void setContainerColor(int i) {
        this.containerColor = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    public void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public void setEndShapeAppearanceModel(C297895sX r1) {
        this.endShapeAppearanceModel = r1;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public void setEndViewId(int i) {
        this.endViewId = i;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public void setFadeProgressThresholds(VR6 vr6) {
        this.fadeProgressThresholds = vr6;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    public void setScaleMaskProgressThresholds(VR6 vr6) {
        this.scaleMaskProgressThresholds = vr6;
    }

    public void setScaleProgressThresholds(VR6 vr6) {
        this.scaleProgressThresholds = vr6;
    }

    public void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public void setShapeMaskProgressThresholds(VR6 vr6) {
        this.shapeMaskProgressThresholds = vr6;
    }

    public void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public void setStartShapeAppearanceModel(C297895sX r1) {
        this.startShapeAppearanceModel = r1;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public void setStartViewId(int i) {
        this.startViewId = i;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public MaterialContainerTransform(Context context, boolean z) {
        C13992Tns.A0q(this);
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }

    private C17478VXf buildThresholdsGroup(boolean z) {
        C17478VXf vXf;
        C17478VXf vXf2;
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof C14703U2h)) {
            vXf = DEFAULT_ENTER_THRESHOLDS_ARC;
            vXf2 = DEFAULT_RETURN_THRESHOLDS_ARC;
        } else {
            vXf = DEFAULT_ENTER_THRESHOLDS;
            vXf2 = DEFAULT_RETURN_THRESHOLDS;
        }
        return getThresholdsOrDefault(z, vXf, vXf2);
    }

    public static C297895sX captureShapeAppearance(View view, RectF rectF, C297895sX r2) {
        return W3G.A05(rectF, getShapeAppearance(view, r2));
    }

    public static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        PathMotion patternPathMotion;
        W3G.A06(AnonymousClass6Y2.A02, context, this, R.attr.motionEasingStandard);
        int i = R.attr.motionDurationMedium2;
        if (z) {
            i = R.attr.motionDurationLong1;
        }
        W3G.A07(context, this, i);
        if (!this.pathMotionCustom) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.motionPath, typedValue, true)) {
                int i2 = typedValue.type;
                if (i2 == 16) {
                    int i3 = typedValue.data;
                    if (i3 == 0) {
                        return;
                    }
                    if (i3 == 1) {
                        patternPathMotion = new PathMotion();
                    } else {
                        throw DbW.A0a("Invalid motion path type: ", i3);
                    }
                } else if (i2 == 3) {
                    patternPathMotion = new PatternPathMotion(C18667VwP.A00(String.valueOf(typedValue.string)));
                } else {
                    throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                }
                setPathMotion(patternPathMotion);
            }
        }
    }

    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    public MaterialContainerTransform() {
        C13992Tns.A0q(this);
    }
}
