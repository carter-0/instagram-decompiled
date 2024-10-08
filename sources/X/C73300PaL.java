package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.PaL  reason: case insensitive filesystem */
public final class C73300PaL implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C330077Li A01;
    public final /* synthetic */ String A02;

    public C73300PaL(Activity activity, C330077Li r2, String str) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = str;
    }

    public final void run() {
        C330077Li r5 = this.A01;
        View view = r5.A03;
        int A012 = AnonymousClass1GB.A01(AnonymousClass7TE.A02(view) * -0.3f);
        int height = view.getHeight() / 2;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(this.A00, this.A02);
        A0f.A03(view);
        A0f.A01();
        A0f.A0B = false;
        A0f.A0A = true;
        A0f.A04(view, A012, height, true);
        A0f.A00().A07(r5.A0A);
    }
}
