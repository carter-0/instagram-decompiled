package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner$attach$1;

public abstract class Pxx {
    public static final Pxm A00() {
        return Pxm.A08;
    }

    public static final void A01(Context context) {
        Pxm pxm = Pxm.A08;
        pxm.A02 = new Handler();
        pxm.A05.A0B(07T.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        0qQ.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$attach$1(pxm));
    }
}
