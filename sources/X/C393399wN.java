package X;

import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wN  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393399wN {
    public static Map A00(C370368wJ r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.B9J() != null) {
            MediaGiftCountVisibilityState B9J = r3.B9J();
            0qQ.A0B(B9J, 0);
            A1H.put(AnonymousClass000.A00(3195), B9J.A00);
        }
        if (r3.BQ5() != null) {
            MediaGiftingState BQ5 = r3.BQ5();
            0qQ.A0B(BQ5, 0);
            A1H.put("media_gifting_state", BQ5.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
