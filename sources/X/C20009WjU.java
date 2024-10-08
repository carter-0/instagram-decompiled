package X;

import android.widget.TextView;

/* renamed from: X.WjU  reason: case insensitive filesystem */
public final class C20009WjU implements Runnable {
    public final /* synthetic */ WBL A00;

    public C20009WjU(WBL wbl) {
        this.A00 = wbl;
    }

    public final void run() {
        WBL wbl = this.A00;
        TextView textView = wbl.A0A;
        textView.getClass();
        wbl.A02 = wbl.A0A.getLineCount() * JTO.A04((float) textView.getLineHeight(), C13989Tnp.A03(wbl.A0K));
    }
}
