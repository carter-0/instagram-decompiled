package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

public final class FYZ implements AnonymousClass0lh {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final void onSessionWillEnd() {
        Map map = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Bitmap bitmap = (Bitmap) AnonymousClass7TE.A1J(A0u).getValue();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        map.clear();
    }
}
