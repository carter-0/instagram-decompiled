package X;

import androidx.core.widget.NestedScrollView;

/* renamed from: X.M6q  reason: case insensitive filesystem */
public final class C65979M6q implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NestedScrollView A01;

    public C65979M6q(NestedScrollView nestedScrollView, int i) {
        this.A01 = nestedScrollView;
        this.A00 = i;
    }

    public final void run() {
        this.A01.scrollTo(0, this.A00);
    }
}
