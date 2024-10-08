package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.VXn  reason: case insensitive filesystem */
public final class C17486VXn {
    public final Activity A00;
    public final C307896Rx A01;
    public final C277014uI A02;
    public final Context A03;

    public C17486VXn(Context context, C307896Rx r3, C277014uI r4) {
        Activity activity;
        this.A03 = context;
        this.A02 = r4;
        this.A01 = r3;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.A00 = activity;
    }
}
