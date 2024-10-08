package X;

import android.animation.Animator;
import java.lang.ref.Reference;

/* renamed from: X.50f  reason: invalid class name and case insensitive filesystem */
public final class C2801250f extends AnonymousClass4HM {
    public final /* synthetic */ C256123vG A00;

    public C2801250f(C256123vG r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C256123vG r4 = this.A00;
        for (Reference reference : r4.A04) {
            if (!(r4.A03 == AnonymousClass05K.A00 || reference == null || reference.get() == null)) {
                ((AnonymousClass3P0) reference.get()).DEA();
            }
        }
        r4.A03 = AnonymousClass05K.A00;
    }

    public final void onAnimationStart(Animator animator) {
        C256123vG r4 = this.A00;
        r4.A03 = AnonymousClass05K.A0C;
        for (Reference reference : r4.A04) {
            if (!(r4.A03 == AnonymousClass05K.A00 || reference == null || reference.get() == null)) {
                ((AnonymousClass3P0) reference.get()).DEB();
            }
        }
    }
}
