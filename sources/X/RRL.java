package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.browser.helium.webview.HeliumLoader;
import com.facebook.quicklog.QuickPerformanceLogger;

public final class RRL {
    public final Object A01(Context context, Resources resources, C58840Ae r12, SDS sds, C10790RyC ryC, QuickPerformanceLogger quickPerformanceLogger, C262224Cq r16) {
        return HeliumLoader.getInstance().load(context, resources, sds, quickPerformanceLogger, (C13871Tis) null, ryC, r12, r16);
    }

    public final C62507Kgx A00() {
        return HeliumLoader.getInstance().getInitState();
    }

    public final void A02(Context context) {
        HeliumLoader.getInstance().warmUpChildProcess(context);
    }
}
