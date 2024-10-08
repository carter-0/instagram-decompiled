package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.List;

public final class WUV implements C3502083s {
    public final View A00;
    public final View A01;
    public final Window A02;
    public final WUR A03;
    public final C19659WdN A04;

    public final void EuL() {
        A00(true, -16777216);
    }

    public final void EvX() {
        A00(true, -1291845632);
    }

    private final void A00(boolean z, int i) {
        Window window = this.A02;
        0qQ.A0B(window, 0);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility() & -3;
        int i2 = systemUiVisibility | 16;
        if (z) {
            i2 = systemUiVisibility & -17;
        }
        window.getDecorView().setSystemUiVisibility(i2);
        View view = this.A01;
        view.setBackgroundColor(i);
        view.setVisibility(0);
        this.A00.setVisibility(8);
    }

    public final C3502283u B8t() {
        return this.A03;
    }

    public final C3493580b BzF() {
        return this.A04;
    }

    public final void CLd() {
        Window window = this.A02;
        0qQ.A0B(window, 0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
        this.A01.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public final void CLn() {
        this.A00.setVisibility(8);
    }

    public final void EvD() {
        this.A00.setVisibility(0);
    }

    public WUV(View view, View view2, Window window, List list, int i) {
        if (i > 0) {
            this.A02 = window;
            this.A01 = view;
            this.A00 = view2;
            this.A03 = new WUR(list, i);
            this.A04 = new C19659WdN(this);
            0nA.A0V(view, i);
            0nA.A0V(view2, i);
            return;
        }
        throw DbT.A0m();
    }

    public final void EvI(Context context) {
        boolean A002 = AnonymousClass3HA.A00(context);
        int i = -1;
        if (A002) {
            i = -16777216;
        }
        A00(A002, i);
    }
}
