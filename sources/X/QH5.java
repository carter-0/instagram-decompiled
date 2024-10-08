package X;

import android.graphics.Bitmap;

public final class QH5 extends C10169Rnk {
    public final C11919Sis A00(Bitmap.Config config, int i) {
        Object obj = (C13533Tc5) this.A00.poll();
        if (obj == null) {
            obj = new C11919Sis(this);
        }
        C11919Sis sis = (C11919Sis) obj;
        sis.A00 = i;
        sis.A01 = config;
        return sis;
    }
}
