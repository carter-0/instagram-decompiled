package X;

import android.widget.TextView;

/* renamed from: X.PYM  reason: case insensitive filesystem */
public final class C73182PYM implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ String A01;

    public C73182PYM(TextView textView, String str) {
        this.A00 = textView;
        this.A01 = str;
    }

    public final void run() {
        TextView textView = this.A00;
        textView.setText(this.A01);
        C294975nL A0Y = C66583MXo.A0Y(textView);
        A0Y.A04 = 0;
        A0Y.A0U(0.0f, 1.0f, -1.0f);
        A0Y.A0V(0.0f, 1.0f, -1.0f);
        A0Y.A0H();
    }
}
