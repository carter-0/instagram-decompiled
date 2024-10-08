package com.google.android.material.transition.platform;

import X.C19126WMh;
import X.C19129WMk;
import X.X6D;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialFadeThrough extends MaterialVisibility {
    public static final float DEFAULT_START_SCALE = 0.92f;
    public static final int DEFAULT_THEMED_DURATION_ATTR = 2130970687;
    public static final int DEFAULT_THEMED_EASING_ATTR = 2130970697;

    public static X6D createSecondaryAnimatorProvider() {
        C19129WMk wMk = new C19129WMk(true);
        wMk.A02 = false;
        wMk.A00 = 0.92f;
        return wMk;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.X6D] */
    public MaterialFadeThrough() {
        super(new Object(), createSecondaryAnimatorProvider());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WMh, java.lang.Object] */
    public static C19126WMh createPrimaryAnimatorProvider() {
        return new Object();
    }

    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    public /* bridge */ /* synthetic */ X6D getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(X6D x6d) {
        return this.additionalAnimatorProviders.remove(x6d);
    }

    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(X6D x6d) {
        this.secondaryAnimatorProvider = x6d;
    }

    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(X6D x6d) {
        super.addAdditionalAnimatorProvider(x6d);
    }
}
