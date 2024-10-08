package X;

import android.widget.TextView;

/* renamed from: X.WjV  reason: case insensitive filesystem */
public final class C20010WjV implements Runnable {
    public final /* synthetic */ WBO A00;

    public C20010WjV(WBO wbo) {
        this.A00 = wbo;
    }

    public final void run() {
        WBO wbo = this.A00;
        TextView textView = wbo.A0A;
        if (textView != null) {
            int A05 = JTO.A05((float) textView.getLineHeight(), C13989Tnp.A03(wbo.A0N));
            TextView textView2 = wbo.A0A;
            if (textView2 != null) {
                wbo.A01 = textView2.getLineCount() * A05;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
