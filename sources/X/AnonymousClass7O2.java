package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Set;

/* renamed from: X.7O2  reason: invalid class name */
public final class AnonymousClass7O2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final LinearLayoutManager A00;
    public final Set A01;
    public final /* synthetic */ C330737Nz A02;

    public AnonymousClass7O2(LinearLayoutManager linearLayoutManager, C330737Nz r2, Set set) {
        this.A02 = r2;
        this.A00 = linearLayoutManager;
        this.A01 = set;
    }

    public final void onGlobalLayout() {
        C330737Nz r2 = this.A02;
        if (r2.A00 != null && C330737Nz.A00(this.A00, r2, this.A01)) {
            r2.A01();
        }
    }
}
