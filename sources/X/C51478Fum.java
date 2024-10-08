package X;

import android.view.View;
import android.widget.ViewSwitcher;

/* renamed from: X.Fum  reason: case insensitive filesystem */
public final class C51478Fum implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewSwitcher A01;
    public final /* synthetic */ View[] A02;

    public C51478Fum(ViewSwitcher viewSwitcher, View[] viewArr, int i) {
        this.A01 = viewSwitcher;
        this.A00 = i;
        this.A02 = viewArr;
    }

    public final void run() {
        this.A01.setDisplayedChild(0);
        for (int i = 0; i < this.A00; i++) {
            this.A02[i].setClickable(true);
        }
    }
}
