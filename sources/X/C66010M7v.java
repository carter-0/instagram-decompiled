package X;

import android.widget.TextView;

/* renamed from: X.M7v  reason: case insensitive filesystem */
public final class C66010M7v implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ CharSequence A01;

    public C66010M7v(TextView textView, CharSequence charSequence) {
        this.A00 = textView;
        this.A01 = charSequence;
    }

    public final void run() {
        this.A00.setText(this.A01);
    }
}
