package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.06G  reason: invalid class name */
public final class AnonymousClass06G implements View.OnAttachStateChangeListener {
    public final /* synthetic */ 06H A00;
    public final /* synthetic */ 06i A01;

    public final void onViewDetachedFromWindow(View view) {
    }

    public AnonymousClass06G(06H r1, 06i r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onViewAttachedToWindow(View view) {
        06i r1 = this.A01;
        Fragment fragment = r1.A02;
        r1.A03();
        07D.A02((ViewGroup) fragment.mView.getParent(), this.A00.A00).A07();
    }
}
