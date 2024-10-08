package com.google.android.material.transition.platform;

import X.C19129WMk;
import X.DbW;
import X.X6D;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialSharedAxis extends MaterialVisibility {
    public static final int DEFAULT_THEMED_DURATION_ATTR = 2130970687;
    public static final int DEFAULT_THEMED_EASING_ATTR = 2130970697;

    /* renamed from: X  reason: collision with root package name */
    public static final int f9X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public final int axis;
    public final boolean forward;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.WMj, java.lang.Object, X.X6D] */
    public static X6D createPrimaryAnimatorProvider(int i, boolean z) {
        int i2;
        if (i == 0) {
            i2 = 8388611;
            if (z) {
                i2 = 8388613;
            }
        } else if (i == 1) {
            i2 = 48;
            if (z) {
                i2 = 80;
            }
        } else if (i == 2) {
            return new C19129WMk(z);
        } else {
            throw DbW.A0a("Invalid axis: ", i);
        }
        ? obj = new Object();
        obj.A00 = i2;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.X6D] */
    public static X6D createSecondaryAnimatorProvider() {
        return new Object();
    }

    public int getAxis() {
        return this.axis;
    }

    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    public /* bridge */ /* synthetic */ X6D getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public /* bridge */ /* synthetic */ X6D getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public boolean isForward() {
        return this.forward;
    }

    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(X6D x6d) {
        return this.additionalAnimatorProviders.remove(x6d);
    }

    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(X6D x6d) {
        this.secondaryAnimatorProvider = x6d;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.X6D] */
    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), new Object());
        this.axis = i;
        this.forward = z;
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
