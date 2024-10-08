package X;

import android.view.View;

public final class LXL implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C60428JlL A02;

    public LXL(C60428JlL jlL, int i, int i2) {
        this.A02 = jlL;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1445207475);
        0sL r2 = this.A02.A03;
        if (r2 != null) {
            r2.invoke(Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        }
        AnonymousClass0fD.A0C(8527234, A05);
    }
}
