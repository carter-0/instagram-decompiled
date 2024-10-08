package X;

import android.view.View;

/* renamed from: X.3BH  reason: invalid class name */
public final class AnonymousClass3BH implements 1MD {
    public final /* synthetic */ C2365134a A00;

    public AnonymousClass3BH(C2365134a r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        View view = this.A00.A00;
        boolean z = true;
        if (view == null || !view.isShown()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
