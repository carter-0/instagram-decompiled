package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.Vector;

public final class W4U implements ComponentCallbacks {
    public final /* synthetic */ C14723U4m A00;

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public W4U(C14723U4m u4m) {
        this.A00 = u4m;
    }

    public final void onLowMemory() {
        C14723U4m u4m = this.A00;
        int size = u4m.A0M.A0O.size();
        for (int i = 0; i < size; i++) {
            u4m.A0M.A0O.get(i);
        }
        Vector vector = C18636VvY.A02;
        C18796W2e.A01(new UH7());
    }
}
