package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Aqk  reason: case insensitive filesystem */
public final class C41248Aqk implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ C365738nb A04;
    public final /* synthetic */ String A05;

    public C41248Aqk(Context context, View view, ViewGroup viewGroup, AnonymousClass0iw r4, C365738nb r5, String str) {
        this.A05 = str;
        this.A00 = context;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = r5;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass5Gt r4 = new AnonymousClass5Gt(this.A00, this.A02, new C315476jx((CharSequence) this.A05));
        r4.A03(this.A01);
        r4.A02();
        C365738nb r3 = this.A04;
        r4.A04 = new C389339pH(4, this.A03, r3);
        r4.A00().A07(r3.A07);
    }
}
