package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Ao5  reason: case insensitive filesystem */
public final class C41083Ao5 implements Runnable {
    public final /* synthetic */ AnonymousClass7EM A00;
    public final /* synthetic */ String A01;

    public C41083Ao5(AnonymousClass7EM r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass7EM r3 = this.A00;
        Activity activity = r3.A01;
        String str = this.A01;
        View BJd = r3.BJd();
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str);
        A0f.A03(BJd);
        A0f.A02();
        A0f.A0B = true;
        A0f.A0A = true;
        A0f.A00().A07(r3.A02);
    }
}
