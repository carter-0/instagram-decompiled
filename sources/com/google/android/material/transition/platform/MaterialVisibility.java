package com.google.android.material.transition.platform;

import X.AnonymousClass6Y2;
import X.C16813V6u;
import X.W3G;
import X.X6D;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class MaterialVisibility extends Visibility {
    public final List additionalAnimatorProviders = new ArrayList();
    public final X6D primaryAnimatorProvider;
    public X6D secondaryAnimatorProvider;

    public int getDurationThemeAttrResId(boolean z) {
        return 0;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return 0;
    }

    public abstract X6D getSecondaryAnimatorProvider();

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    public abstract boolean removeAdditionalAnimatorProvider(X6D x6d);

    public abstract void setSecondaryAnimatorProvider(X6D x6d);

    public static void addAnimatorIfNeeded(List list, X6D x6d, ViewGroup viewGroup, View view, boolean z) {
        Animator ALu;
        if (x6d != null) {
            if (z) {
                ALu = x6d.ALV(view, viewGroup);
            } else {
                ALu = x6d.ALu(view, viewGroup);
            }
            if (ALu != null) {
                list.add(ALu);
            }
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        for (X6D addAnimatorIfNeeded : this.additionalAnimatorProviders) {
            addAnimatorIfNeeded(arrayList, addAnimatorIfNeeded, viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        C16813V6u.A00(animatorSet, arrayList);
        return animatorSet;
    }

    public void addAdditionalAnimatorProvider(X6D x6d) {
        this.additionalAnimatorProviders.add(x6d);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return AnonymousClass6Y2.A02;
    }

    public X6D getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public MaterialVisibility(X6D x6d, X6D x6d2) {
        this.primaryAnimatorProvider = x6d;
        this.secondaryAnimatorProvider = x6d2;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        W3G.A07(context, this, getDurationThemeAttrResId(z));
        W3G.A06(getDefaultEasingInterpolator(z), context, this, getEasingThemeAttrResId(z));
    }
}
