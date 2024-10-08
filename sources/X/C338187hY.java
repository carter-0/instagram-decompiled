package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7hY  reason: invalid class name and case insensitive filesystem */
public final class C338187hY implements View.OnAttachStateChangeListener {
    public final /* synthetic */ 2We A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C338187hY(2We r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        2We.A07((RecyclerView) view, this.A00);
        view.removeOnAttachStateChangeListener(this);
    }
}
