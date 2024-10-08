package X;

import android.os.Looper;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9xD  reason: invalid class name and case insensitive filesystem */
public abstract class C393899xD {
    public static final void A00(AnonymousClass1MK r2, ImageUrl imageUrl, String str) {
        0qQ.A0B(imageUrl, 0);
        if (!0qQ.A0K(Looper.getMainLooper(), Looper.myLooper())) {
            1OO A0J = 1NK.A00().A0J(imageUrl, str);
            A0J.A02(r2);
            A0J.A0F = true;
            A0J.A0G = true;
            A0J.A00().E5t();
            return;
        }
        throw AnonymousClass7TE.A0z("Can't fetch the image on UI thread.");
    }
}
