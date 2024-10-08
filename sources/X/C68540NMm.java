package X;

import android.app.Activity;
import android.app.Application;

/* renamed from: X.NMm  reason: case insensitive filesystem */
public final class C68540NMm extends C228042kh {
    public final Activity A00;

    public C68540NMm(Activity activity) {
        0qQ.A0B(activity, 1);
        this.A00 = activity;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00.getApplication();
        0qQ.A07(application);
        return new C67708MtN(application);
    }
}
