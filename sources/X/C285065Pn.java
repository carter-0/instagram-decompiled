package X;

import android.view.View;
import androidx.compose.runtime.Recomposer;

/* renamed from: X.5Pn  reason: invalid class name and case insensitive filesystem */
public final class C285065Pn implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Recomposer A01;

    public final void onViewAttachedToWindow(View view) {
    }

    public C285065Pn(View view, Recomposer recomposer) {
        this.A00 = view;
        this.A01 = recomposer;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        this.A01.A0E();
    }
}
