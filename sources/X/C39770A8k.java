package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.List;

/* renamed from: X.A8k  reason: case insensitive filesystem */
public final class C39770A8k {
    public AnimatorSet A00 = new AnimatorSet();
    public List A01 = AnonymousClass7TE.A1C();

    public final void A00(View view, AnonymousClass6u8 r8, int i) {
        long j;
        List list = this.A01;
        if (r8.A00 == 0 && i == 0) {
            j = 0;
        } else {
            j = 50;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(250);
        ofFloat.setStartDelay(j);
        ofFloat.addListener(new C64195LTd(0, this, view));
        list.add(ofFloat);
    }
}
