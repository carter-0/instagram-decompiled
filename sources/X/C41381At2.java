package X;

import android.graphics.drawable.Drawable;
import java.util.function.Predicate;

/* renamed from: X.At2  reason: case insensitive filesystem */
public final class C41381At2 implements Predicate {
    public static final C41381At2 A00 = new C41381At2();

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C306386Ly r3;
        Drawable drawable = (Drawable) obj;
        0qQ.A0B(drawable, 0);
        Integer num = null;
        if ((drawable instanceof C306386Ly) && (r3 = (C306386Ly) drawable) != null) {
            num = r3.A0M;
        }
        return AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
    }
}
