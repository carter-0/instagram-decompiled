package com.google.android.material.transition.platform;

import X.C19127WMi;
import X.C19129WMk;
import X.X6D;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialElevationScale extends MaterialVisibility {
    public static final float DEFAULT_SCALE = 0.85f;
    public final boolean growing;

    public static C19129WMk createPrimaryAnimatorProvider(boolean z) {
        C19129WMk wMk = new C19129WMk(z);
        wMk.A01 = 0.85f;
        wMk.A00 = 0.85f;
        return wMk;
    }

    public static X6D createSecondaryAnimatorProvider() {
        return new C19127WMi();
    }

    public /* bridge */ /* synthetic */ X6D getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(X6D x6d) {
        return this.additionalAnimatorProviders.remove(x6d);
    }

    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(X6D x6d) {
        this.secondaryAnimatorProvider = x6d;
    }

    public MaterialElevationScale(boolean z) {
        super(createPrimaryAnimatorProvider(z), new C19127WMi());
        this.growing = z;
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
