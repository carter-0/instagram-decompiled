package com.instagram.neko.playables.activity;

import X.0qQ;
import X.C71161Oea;
import X.JTT;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PlayableProgressBar extends ProgressBar {
    public int A00;
    public ObjectAnimator A01;
    public final long A02;
    public final long A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(int i) {
        int i2 = i * 100;
        if (i2 > getProgress() && i2 > this.A00) {
            this.A00 = i2;
            int progress = getProgress();
            this.A01.cancel();
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{progress, i2});
            this.A01 = ofInt;
            ofInt.setDuration(this.A03);
            this.A01.setInterpolator(new DecelerateInterpolator());
            if (i == 100) {
                C71161Oea.A00(this.A01, this, 8);
            }
            this.A01.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A03 = 300;
        this.A02 = 300;
        this.A01 = new ObjectAnimator();
    }

    public /* synthetic */ PlayableProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, JTT.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        this.A03 = 300;
        this.A02 = 300;
        this.A01 = new ObjectAnimator();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        this.A03 = 300;
        this.A02 = 300;
        this.A01 = new ObjectAnimator();
    }
}
