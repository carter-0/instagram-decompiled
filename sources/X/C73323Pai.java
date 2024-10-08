package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Pai  reason: case insensitive filesystem */
public final class C73323Pai implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C70485O8k A02;

    public C73323Pai(Activity activity, View view, C70485O8k o8k) {
        this.A02 = o8k;
        this.A00 = activity;
        this.A01 = view;
    }

    public final void run() {
        C70485O8k o8k = this.A02;
        Activity activity = this.A00;
        View view = this.A01;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131958702);
        A0e.A03(view);
        A0e.A02();
        A0e.A04 = new NdO(o8k, 2);
        A0e.A00().A07(o8k.A00);
    }
}
