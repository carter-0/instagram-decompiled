package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

public final class W4S implements ComponentCallbacks2 {
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i >= 60) {
            ((C18936WDp) C18291VpF.A00.getValue()).A00();
        }
    }
}
