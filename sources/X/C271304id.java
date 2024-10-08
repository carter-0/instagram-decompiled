package X;

import com.facebook.systrace.Systrace;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;

/* renamed from: X.4id  reason: invalid class name and case insensitive filesystem */
public final class C271304id implements Runnable {
    public final /* synthetic */ ActionBarTitleViewSwitcher A00;
    public final /* synthetic */ C229072mn A01;

    public C271304id(ActionBarTitleViewSwitcher actionBarTitleViewSwitcher, C229072mn r2) {
        this.A00 = actionBarTitleViewSwitcher;
        this.A01 = r2;
    }

    public final void run() {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A00;
        C229072mn r5 = this.A01;
        if (Systrace.A0E(1)) {
            0fS.A01("ActionBarTitleViewSwitcher:showSecondaryTitle:withDelay", 1564193922);
        }
        try {
            actionBarTitleViewSwitcher.A04(false, true, r5.A02);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-368071498);
            }
        }
    }
}
