package X;

import android.app.Activity;
import android.util.TypedValue;

/* renamed from: X.Aox  reason: case insensitive filesystem */
public final /* synthetic */ class C41137Aox implements Runnable {
    public final /* synthetic */ C347017w8 A00;
    public final /* synthetic */ AnonymousClass8BA A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C41137Aox(C347017w8 r1, AnonymousClass8BA r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8BA r6 = this.A01;
        boolean z = this.A02;
        C347017w8 r2 = this.A00;
        Activity activity = r6.A0n;
        int i = 2131953523;
        if (z) {
            i = 2131953493;
        }
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, activity.getString(i));
        int applyDimension = (int) TypedValue.applyDimension(1, 20.0f, r6.A0o.getResources().getDisplayMetrics());
        A0f.A05(new AnonymousClass9UE(r6.A1s, 0, (r2.getIntrinsicHeight() / 2) - applyDimension, true));
        A0f.A01();
        A0f.A00().A07(r6.A0v);
    }
}
