package X;

import android.app.Activity;
import android.widget.TextView;

/* renamed from: X.AqI  reason: case insensitive filesystem */
public final /* synthetic */ class C41220AqI implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C330447Mu A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C41220AqI(Activity activity, TextView textView, C330447Mu r3, String str) {
        this.A02 = r3;
        this.A01 = textView;
        this.A00 = activity;
        this.A03 = str;
    }

    public final void run() {
        C330447Mu r7 = this.A02;
        TextView textView = this.A01;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(this.A00, this.A03);
        A0f.A03(textView);
        A0f.A01();
        A0f.A0B = false;
        A0f.A0A = true;
        A0f.A04(textView, AnonymousClass7TE.A05(AnonymousClass7TE.A02(textView), -0.3f), textView.getHeight() / 2, true);
        A0f.A00().A07(r7.A0Q);
    }
}
