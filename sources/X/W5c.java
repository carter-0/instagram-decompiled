package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public final class W5c implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, C20936X5e, DialogInterface.OnKeyListener {
    public C14729U5o A00;
    public WDT A01;
    public C18932WDk A02;

    public final void D4F(C18932WDk wDk, boolean z) {
        C14729U5o u5o;
        if ((z || wDk == this.A02) && (u5o = this.A00) != null) {
            u5o.dismiss();
        }
    }

    public final boolean DVR(C18932WDk wDk) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.WDm, android.view.MenuItem] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        C18932WDk wDk = this.A02;
        WDT wdt = this.A01;
        U4B u4b = wdt.A04;
        if (u4b == null) {
            u4b = new U4B(wdt);
            wdt.A04 = u4b;
        }
        wDk.A0I((C18934WDm) u4b.getItem(i), (X9H) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.D4F(this.A02, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0C(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }
}
