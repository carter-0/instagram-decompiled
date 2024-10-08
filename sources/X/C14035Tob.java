package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Locale;

/* renamed from: X.Tob  reason: case insensitive filesystem */
public final class C14035Tob implements AnonymousClass1Oc {
    public final String AXJ(1OS r5) {
        DirectThreadKey C6K = ((AnonymousClass1c5) r5).C6K();
        0qQ.A0B(C6K, 0);
        String str = C6K.A00;
        if (str != null) {
            return Pxg.A0v("thread-%s", Locale.US, new Object[]{str}, 1);
        }
        return "global";
    }
}
