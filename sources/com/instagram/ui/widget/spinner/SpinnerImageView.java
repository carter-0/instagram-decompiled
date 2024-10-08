package com.instagram.ui.widget.spinner;

import X.AnonymousClass0fD;
import X.C240693Lw;
import X.C255943uy;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public class SpinnerImageView extends ColorFilterAlphaImageView {
    public ObjectAnimator A00;
    public boolean A01;
    public boolean A02 = true;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.instagram.ui.widget.spinner.SpinnerImageView.A00():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private void A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.instagram.ui.widget.spinner.SpinnerImageView.A00():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.spinner.SpinnerImageView.A00():void");
    }

    public SpinnerImageView(Context context) {
        super(context);
        A00();
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-529678929);
        super.onAttachedToWindow();
        if (isShown() && this.A02) {
            this.A00.start();
        }
        C240693Lw.A00.A00(this);
        AnonymousClass0fD.A0D(249481618, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-2004292350);
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
        C240693Lw.A00.A01(this);
        AnonymousClass0fD.A0D(-2075401652, A06);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 && this.A02) {
            this.A00.start();
            this.A01 = false;
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i != 0 || getVisibility() != 0 || !this.A02) {
                this.A00.cancel();
                z = false;
            } else if (getAnimation() != null) {
                return;
            } else {
                if (getMeasuredWidth() != 0) {
                    this.A00.start();
                    return;
                }
                z = true;
            }
            this.A01 = z;
        }
    }

    public void setLoadingStatus(C255943uy r5) {
        int i;
        int ordinal = r5.ordinal();
        int i2 = 0;
        if (ordinal == 0) {
            this.A02 = true;
            this.A00.start();
            i = R.drawable.spinner_large;
        } else if (ordinal != 1) {
            i2 = 4;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    setVisibility(8);
                    return;
                }
                return;
            }
            setVisibility(i2);
        } else {
            this.A02 = false;
            this.A00.end();
            i = R.drawable.loadmore_icon_refresh_compound;
        }
        setBackgroundResource(i);
        setVisibility(i2);
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
