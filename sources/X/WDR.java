package X;

import androidx.appcompat.widget.ActionMenuView;

public final class WDR implements C20936X5e {
    public boolean A00;
    public final /* synthetic */ U5m A01;

    public WDR(U5m u5m) {
        this.A01 = u5m;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        WDU wdu;
        if (!this.A00) {
            this.A00 = true;
            U5m u5m = this.A01;
            ActionMenuView actionMenuView = ((WDZ) u5m.A06).A09.A0E;
            if (!(actionMenuView == null || (wdu = actionMenuView.A04) == null)) {
                wdu.A01();
            }
            u5m.A04.onPanelClosed(108, wDk);
            this.A00 = false;
        }
    }

    public final boolean DVR(C18932WDk wDk) {
        this.A01.A04.onMenuOpened(108, wDk);
        return true;
    }
}
