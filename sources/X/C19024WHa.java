package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.WHa  reason: case insensitive filesystem */
public final class C19024WHa implements C64721Te {
    public final C64721Te[] A00;

    public C19024WHa(C64721Te... r1) {
        this.A00 = r1;
    }

    public final Drawable ALw(Resources resources, 1U1 r6, C240483Lb r7) {
        AnonymousClass7TG.A1N(resources, r7);
        0qQ.A0B(r6, 2);
        C64721Te[] r2 = this.A00;
        int i = 0;
        do {
            Drawable ALw = r2[i].ALw(resources, r6, r7);
            if (ALw != null) {
                return ALw;
            }
            i++;
        } while (i < 2);
        return null;
    }
}
