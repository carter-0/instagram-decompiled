package X;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: X.39H  reason: invalid class name */
public final class AnonymousClass39H extends AnonymousClass39B {
    public final ConnectivityManager A00;
    public final AnonymousClass39I A01 = new AnonymousClass39I(this);

    public AnonymousClass39H(Context context, AnonymousClass38N r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }
}
