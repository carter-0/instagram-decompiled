package X;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import java.util.List;

public final class LAI {
    public int A00;
    public int A01;
    public final C59987Jcw A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final List A04 = AnonymousClass7TE.A1C();
    public final List A05 = AnonymousClass7TE.A1C();
    public final List A06 = AnonymousClass7TE.A1C();

    public LAI(C59987Jcw jcw, int i) {
        this.A02 = jcw;
        for (Drawable A0X : jcw.A0B) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            C59987Jcw jcw2 = this.A02;
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, C51968G9o.A1Z(Integer.valueOf(jcw2.A02), jcw2.A03));
            ofObject.setDuration(200);
            C64205LTv.A01(ofObject, this, 3);
            ofObject.setCurrentPlayTime(0);
            this.A04.add(ofObject);
            int i2 = AnonymousClass7TE.A0X(A0X).left;
            C59987Jcw jcw3 = this.A02;
            int i3 = i2 + jcw3.A04;
            this.A01 = i3;
            int i4 = i2 + jcw3.A07;
            this.A00 = i4;
            ValueAnimator A052 = JTQ.A05(i3, i4);
            A052.setDuration(200);
            C64205LTv.A01(A052, this, 4);
            A052.setInterpolator(new OvershootInterpolator(2.0f));
            A052.setCurrentPlayTime(0);
            this.A03.add(A052);
            this.A05.add(true);
            this.A06.add(true);
        }
        List list = this.A03;
        ((Animator) list.get(DbT.A02(list, i) - 1)).start();
    }
}
