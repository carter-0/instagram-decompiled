package X;

import android.view.View;

public final class ID6 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C258253yi A00;

    public ID6(C258253yi r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        AnonymousClass0eM r2 = this.A00.A03;
        03v.A0H(AnonymousClass7TE.A0c(r2), G9w.A0l(view, DbS.A02(AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(r2)), 16), view.getHeight()));
    }
}
