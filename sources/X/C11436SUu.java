package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.SUu  reason: case insensitive filesystem */
public final class C11436SUu implements ComponentCallbacks2 {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C13569Tcp) it.next()).handleMemoryPressure(i);
        }
    }

    public C11436SUu(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }
}
