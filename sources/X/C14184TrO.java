package X;

import android.view.ViewGroup;

/* renamed from: X.TrO  reason: case insensitive filesystem */
public final class C14184TrO implements Runnable {
    public final /* synthetic */ AnonymousClass7HT A00;

    public C14184TrO(AnonymousClass7HT r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass7HT r2 = this.A00;
        ViewGroup viewGroup = r2.A0G;
        if (viewGroup != null) {
            viewGroup.removeView(r2.A08);
        }
        r2.A08 = null;
        r2.A0C = null;
    }
}
