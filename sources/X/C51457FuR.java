package X;

import android.app.Activity;

/* renamed from: X.FuR  reason: case insensitive filesystem */
public final /* synthetic */ class C51457FuR implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C13675Tek A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ C51457FuR(Activity activity, C13675Tek tek, Object obj) {
        this.A00 = activity;
        this.A01 = tek;
        this.A02 = obj;
    }

    public final void run() {
        Activity activity = this.A00;
        C13675Tek tek = this.A01;
        Object obj = this.A02;
        if (!activity.isFinishing()) {
            tek.D5D(obj);
        }
    }
}
