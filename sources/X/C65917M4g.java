package X;

import android.widget.TextView;

/* renamed from: X.M4g  reason: case insensitive filesystem */
public final class C65917M4g implements Runnable {
    public final /* synthetic */ TextView A00;

    public C65917M4g(TextView textView) {
        this.A00 = textView;
    }

    public final void run() {
        TextView textView = this.A00;
        textView.getPaint().setShader(I7E.A01(AnonymousClass7TE.A0S(textView), textView.getPaint().measureText(textView.getText().toString()), AnonymousClass7TE.A03(textView)));
    }
}
