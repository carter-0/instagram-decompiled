package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Y7  reason: invalid class name */
public final class AnonymousClass5Y7 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ AnonymousClass5Y6 A01;

    public AnonymousClass5Y7(Configuration configuration, AnonymousClass5Y6 r2) {
        this.A00 = configuration;
        this.A01 = r2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.A00;
        configuration2.updateFrom(configuration);
        Iterator it = this.A01.A00.entrySet().iterator();
        while (it.hasNext()) {
            ((Reference) ((Map.Entry) it.next()).getValue()).get();
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    public final void onLowMemory() {
        this.A01.A00.clear();
    }

    public final void onTrimMemory(int i) {
        this.A01.A00.clear();
    }
}
