package X;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.TCk  reason: case insensitive filesystem */
public final class C12896TCk implements Runnable {
    public final /* synthetic */ C7925Qcw A00;

    public C12896TCk(C7925Qcw qcw) {
        this.A00 = qcw;
    }

    public final void run() {
        C7925Qcw qcw = this.A00;
        ImageView imageView = qcw.A0D;
        0qQ.A0A(imageView);
        LinearLayout linearLayout = qcw.A0I;
        0qQ.A0A(linearLayout);
        imageView.setMaxHeight(linearLayout.getHeight() / 2);
    }
}
