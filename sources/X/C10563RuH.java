package X;

import android.animation.AnimatorSet;
import android.os.Handler;

/* renamed from: X.RuH  reason: case insensitive filesystem */
public final class C10563RuH {
    public boolean A00;
    public final AnimatorSet A01;
    public final Handler A02 = AnonymousClass7TF.A0D();

    public C10563RuH() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.A01 = animatorSet;
        animatorSet.addListener(new C7345Q4x(this, 2));
    }
}
