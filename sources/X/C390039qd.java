package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;

/* renamed from: X.9qd  reason: invalid class name and case insensitive filesystem */
public final class C390039qd extends AnonymousClass4HM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C339807kC A02;

    public C390039qd(Drawable drawable, C339807kC r2, float f) {
        this.A02 = r2;
        this.A01 = drawable;
        this.A00 = f;
    }

    public final void onAnimationStart(Animator animator) {
        C339837kF.A01(this.A01, this.A02, this.A00);
    }
}
