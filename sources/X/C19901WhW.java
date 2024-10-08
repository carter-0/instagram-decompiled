package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.WhW  reason: case insensitive filesystem */
public final class C19901WhW implements Runnable {
    public final /* synthetic */ Toolbar A00;

    public C19901WhW(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public final void run() {
        WDU wdu;
        ActionMenuView actionMenuView = this.A00.A0E;
        if (actionMenuView != null && (wdu = actionMenuView.A04) != null) {
            wdu.A04();
        }
    }
}
