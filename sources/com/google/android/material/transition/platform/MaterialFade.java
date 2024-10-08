package com.google.android.material.transition.platform;

import X.AnonymousClass6Y2;
import X.C19127WMi;
import X.C19129WMk;
import X.X6D;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialFade extends MaterialVisibility {
    public static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    public static final float DEFAULT_START_SCALE = 0.8f;

    /* renamed from: DEFAULT_THEMED_EASING_ATTR */
    public static final int motionEasingLinear = 2130970696;

    /* renamed from: DEFAULT_THEMED_INCOMING_DURATION_ATTR */
    public static final int motionDurationShort2 = 2130970692;

    /* renamed from: DEFAULT_THEMED_OUTGOING_DURATION_ATTR */
    public static final int motionDurationShort1 = 2130970691;

    public static X6D createSecondaryAnimatorProvider() {
        C19129WMk wMk = new C19129WMk(true);
        wMk.A02 = false;
        wMk.A00 = 0.8f;
        return wMk;
    }

    public static C19127WMi createPrimaryAnimatorProvider() {
        C19127WMi wMi = new C19127WMi();
        wMi.A00 = 0.3f;
        return wMi;
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return AnonymousClass6Y2.A03;
    }

    public int getDurationThemeAttrResId(boolean z) {
        if (z) {
            return motionDurationShort2;
        }
        return motionDurationShort1;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return motionEasingLinear;
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

    public MaterialFade() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
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
