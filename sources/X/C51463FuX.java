package X;

import android.app.Activity;
import android.text.Spanned;
import android.view.View;

/* renamed from: X.FuX  reason: case insensitive filesystem */
public final class C51463FuX implements Runnable {
    public final /* synthetic */ Spanned A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ E6S A02;

    public C51463FuX(Spanned spanned, View view, E6S e6s) {
        this.A02 = e6s;
        this.A00 = spanned;
        this.A01 = view;
    }

    public final void run() {
        AnonymousClass5Gt r1 = new AnonymousClass5Gt((Activity) this.A02.A00, new C315476jx((CharSequence) this.A00));
        r1.A03(this.A01);
        r1.A02();
        r1.A0B = true;
        r1.A00 = 3000;
        r1.A0A = false;
        C47898ELs.A00(r1, this, 8).A06();
    }
}
