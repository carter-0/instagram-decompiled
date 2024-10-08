package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import java.util.HashSet;

/* renamed from: X.Ls4  reason: case insensitive filesystem */
public final class C65363Ls4 implements C66536MVq {
    public int A00;
    public final HashSet A01 = AnonymousClass7TE.A1F();
    public final Drawable A02;

    public final void Dfh() {
    }

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A01.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A01.remove(r2);
    }

    public final void A00(int i) {
        ValueAnimator A05 = JTQ.A05(this.A00, i);
        A05.setDuration(3000);
        C64205LTv.A01(A05, this, 10);
        A05.start();
    }

    public final 1iA BR7() {
        return 1iA.A05;
    }

    public final int BhS() {
        return this.A00;
    }

    public final Integer BzN() {
        if (this.A00 >= 100) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public final Drawable C6t() {
        return this.A02;
    }

    public final String C6v() {
        return null;
    }

    public C65363Ls4(Drawable drawable, int i) {
        this.A02 = drawable;
        this.A00 = i;
    }

    public final LSB BzP() {
        return new LSB(2131956970, 2131956970);
    }
}
