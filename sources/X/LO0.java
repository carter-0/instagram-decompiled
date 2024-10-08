package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class LO0 {
    public static final Map A03 = new WeakHashMap();
    public boolean A00 = false;
    public final List A01 = AnonymousClass7TE.A1C();
    public final WeakReference A02;

    public final void A00(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((Reference) it.next()).get();
                it.remove();
            }
        }
    }

    public LO0(Context context) {
        this.A02 = C51965G9l.A0v(context);
    }
}
