package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

public final class AYG implements C348927zH {
    public final boolean CeG(Medium medium) {
        File A0t = AnonymousClass7TE.A0t(medium.A0X);
        if (!A0t.exists() || !A0t.canRead()) {
            return false;
        }
        return true;
    }
}
