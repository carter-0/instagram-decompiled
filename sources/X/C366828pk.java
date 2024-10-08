package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.8pk  reason: invalid class name and case insensitive filesystem */
public final class C366828pk extends Drawable.ConstantState {
    public AnimatorSet A00;
    public 0yf A01;
    public AnonymousClass3NY A02;
    public ArrayList A03;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
