package X;

import android.view.animation.Animation;
import java.util.HashSet;

/* renamed from: X.Okt  reason: case insensitive filesystem */
public final class C71454Okt implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass768 A00;
    public final /* synthetic */ String A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C71454Okt(AnonymousClass768 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onAnimationEnd(Animation animation) {
        AnonymousClass768 r1 = this.A00;
        r1.A00 = false;
        1Av CCu = r1.A01.CCu();
        if (CCu != null) {
            0xa r3 = CCu.A01;
            String A002 = C273654mx.A00(1527);
            HashSet A12 = C66580MXl.A12(r3.C1t(A002));
            A12.add(this.A01);
            JTU.A1E(r3, A002, A12);
        }
    }
}
