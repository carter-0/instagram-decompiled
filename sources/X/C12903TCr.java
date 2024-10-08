package X;

import com.facebook.smartcapture.view.HelpButton;

/* renamed from: X.TCr  reason: case insensitive filesystem */
public final class C12903TCr implements Runnable {
    public final /* synthetic */ HelpButton A00;

    public C12903TCr(HelpButton helpButton) {
        this.A00 = helpButton;
    }

    public final void run() {
        HelpButton helpButton = this.A00;
        if (!helpButton.A00) {
            helpButton.setExpanded(true);
        }
    }
}
