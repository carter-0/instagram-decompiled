package X;

import android.view.View;
import android.view.ViewTreeObserver;

public final class WCF implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass7JI A01;

    public WCF(View view, AnonymousClass7JI r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final boolean onPreDraw() {
        C13988Tno.A12(this.A00, this);
        AnonymousClass7JI r0 = this.A01;
        r0.A0F();
        AnonymousClass7JI.A04(r0);
        return true;
    }
}
