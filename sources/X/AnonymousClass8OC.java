package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8OC  reason: invalid class name */
public final class AnonymousClass8OC implements AnonymousClass8OD {
    public final Map A00;

    public final C21006X9e ClP(Bitmap bitmap, UserSession userSession, AnonymousClass8OM r5, C17872VhP vhP) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(vhP, 2);
        AnonymousClass8OD r0 = (AnonymousClass8OD) this.A00.get(r5.A00.A00);
        if (r0 != null) {
            return r0.ClP(bitmap, userSession, r5, vhP);
        }
        return null;
    }

    public AnonymousClass8OC() {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.put("LegacyBrushClass", new Object());
        hashMap.put("PointBrush", new AnonymousClass8OF());
    }
}
