package X;

import android.widget.TextView;

/* renamed from: X.Wjk  reason: case insensitive filesystem */
public final class C20024Wjk implements Runnable {
    public final /* synthetic */ C17706Vcb A00;

    public C20024Wjk(C17706Vcb vcb) {
        this.A00 = vcb;
    }

    public final void run() {
        C17706Vcb vcb = this.A00;
        int width = ((vcb.A02.getWidth() - vcb.A08.getWidth()) - vcb.A05.getWidth()) - vcb.A03.getWidth();
        TextView textView = vcb.A06;
        if (width < textView.getWidth()) {
            textView.setVisibility(8);
            vcb.A07.setVisibility(0);
        }
    }
}
