package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.WpA  reason: case insensitive filesystem */
public final class C20315WpA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ C242413Ty A03;

    public C20315WpA(Typeface typeface, TextView textView, C242413Ty r3, int i) {
        this.A03 = r3;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    public final void run() {
        this.A02.setTypeface(this.A01, this.A00);
    }
}
