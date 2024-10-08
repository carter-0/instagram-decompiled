package X;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* renamed from: X.32w  reason: invalid class name and case insensitive filesystem */
public final class C2362132w {
    public final Map A00;
    public final Map A01;

    public C2362132w(Map map, Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public final void A00(Bitmap bitmap, 1Xj r10, String str) {
        List<AnonymousClass3VH> list = (List) this.A01.remove(r10.A30());
        if (list != null) {
            for (AnonymousClass3VH r0 : list) {
                boolean z = false;
                if (bitmap != null) {
                    z = true;
                }
                AnonymousClass35D r3 = r0.A01;
                String A30 = r0.A00.A30();
                if (A30 != null) {
                    AnonymousClass35D.A00((C257183wz) null, r3, A30, str, (String) null, z);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
