package X;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import java.util.Map;

/* renamed from: X.FvO  reason: case insensitive filesystem */
public final class C51516FvO implements Runnable {
    public final /* synthetic */ Spanned A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C234222xL A02;
    public final /* synthetic */ 2aC A03;

    public C51516FvO(Spanned spanned, View view, C234222xL r3, 2aC r4) {
        this.A00 = spanned;
        this.A03 = r4;
        this.A01 = view;
        this.A02 = r3;
    }

    public final void run() {
        C315476jx r4 = new C315476jx((CharSequence) this.A00);
        2aC r3 = this.A03;
        Map map = 2aC.A0V;
        Context context = r3.A0B;
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        AnonymousClass5Gt r1 = new AnonymousClass5Gt((Activity) context, r4);
        r1.A03(this.A01);
        r1.A02();
        r1.A0B = false;
        r1.A0A = true;
        r1.A04 = this.A02;
        r1.A00().A07(r3.A0J);
    }
}
