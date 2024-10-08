package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: X.5Y9  reason: invalid class name */
public final class AnonymousClass5Y9 implements ComponentCallbacks2 {
    public final /* synthetic */ AnonymousClass5Y8 A00;

    public AnonymousClass5Y9(AnonymousClass5Y8 r1) {
        this.A00 = r1;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.A00.A00();
    }

    public final void onLowMemory() {
        this.A00.A00();
    }

    public final void onTrimMemory(int i) {
        this.A00.A00();
    }
}
