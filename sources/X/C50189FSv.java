package X;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: X.FSv  reason: case insensitive filesystem */
public final /* synthetic */ class C50189FSv implements C13634Te0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C49914FEn A01;
    public final /* synthetic */ C13675Tek A02;

    public /* synthetic */ C50189FSv(Activity activity, C49914FEn fEn, C13675Tek tek) {
        this.A01 = fEn;
        this.A00 = activity;
        this.A02 = tek;
    }

    public final void DfS(AnonymousClass63X r5) {
        Activity activity = this.A00;
        activity.runOnUiThread(new C51457FuR(activity, this.A02, Boolean.valueOf(Dba.A1U(((Status) r5).A00))));
    }
}
