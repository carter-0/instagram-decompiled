package X;

import android.app.Activity;
import android.widget.TextView;

/* renamed from: X.AqH  reason: case insensitive filesystem */
public final /* synthetic */ class C41219AqH implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C330447Mu A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C41219AqH(Activity activity, TextView textView, C330447Mu r3, String str) {
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = str;
        this.A01 = textView;
    }

    public final void run() {
        C330447Mu r3 = this.A02;
        Activity activity = this.A00;
        String str = this.A03;
        TextView textView = this.A01;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str);
        A0f.A03(textView);
        A0f.A01();
        A0f.A0B = false;
        A0f.A0A = true;
        A0f.A00().A07(r3.A0Q);
    }
}
