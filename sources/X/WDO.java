package X;

import android.view.Window;

public final class WDO implements C20936X5e {
    public final /* synthetic */ 2X4 A00;

    public WDO(2X4 r1) {
        this.A00 = r1;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        this.A00.A0Z(wDk);
    }

    public final boolean DVR(C18932WDk wDk) {
        Window.Callback callback = this.A00.A0A.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, wDk);
        return true;
    }
}
