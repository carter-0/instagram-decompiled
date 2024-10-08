package X;

import android.app.Activity;

public final /* synthetic */ class AYD implements 1wn {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 2Er A01;
    public final /* synthetic */ C329067Hl A02;

    public /* synthetic */ AYD(Activity activity, 2Er r2, C329067Hl r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void onEvent(Object obj) {
        C329067Hl r4 = this.A02;
        Activity activity = this.A00;
        activity.runOnUiThread(new C3268978o(activity, this.A01, r4, ((AY4) obj).A00));
    }
}
