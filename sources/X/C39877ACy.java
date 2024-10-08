package X;

import android.graphics.Bitmap;
import java.util.HashMap;

/* renamed from: X.ACy  reason: case insensitive filesystem */
public final class C39877ACy {
    public final HashMap A00 = AnonymousClass7TE.A1E();
    public final 0sP A01;

    public static final int A00(Bitmap bitmap, C39877ACy aCy) {
        HashMap hashMap = aCy.A00;
        if (!hashMap.containsKey(bitmap)) {
            hashMap.put(bitmap, 0);
        }
        Number number = (Number) hashMap.get(bitmap);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public C39877ACy(0sP r2) {
        this.A01 = r2;
    }
}
