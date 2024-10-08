package X;

import android.widget.TextView;

/* renamed from: X.PbR  reason: case insensitive filesystem */
public final class C73368PbR implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;

    public C73368PbR(TextView textView, Integer num, String str, float f) {
        this.A01 = textView;
        this.A02 = num;
        this.A00 = f;
        this.A03 = str;
    }

    public final void run() {
        TextView textView = this.A01;
        C294975nL A0Y = C66583MXo.A0Y(textView);
        A0Y.A04 = 0;
        A0Y.A0I(0.0f);
        Integer num = this.A02;
        Integer num2 = AnonymousClass05K.A00;
        float f = this.A00;
        float f2 = f;
        if (num == num2) {
            f = -f;
        }
        A0Y.A0K(f);
        A0Y.A05 = new PQQ(textView, num, this.A03, f2);
        A0Y.A0H();
    }
}
