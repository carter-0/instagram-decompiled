package X;

import android.app.Activity;
import android.widget.TextView;

/* renamed from: X.PaM  reason: case insensitive filesystem */
public final class C73301PaM implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C330077Li A01;
    public final /* synthetic */ String A02;

    public C73301PaM(Activity activity, C330077Li r2, String str) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = str;
    }

    public final void run() {
        C330077Li r3 = this.A01;
        Activity activity = this.A00;
        String str = this.A02;
        TextView textView = r3.A07;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str);
        A0f.A03(textView);
        A0f.A01();
        A0f.A0B = false;
        A0f.A0A = true;
        A0f.A00().A07(r3.A0A);
    }
}
