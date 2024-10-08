package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CdI  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44336CdI {
    public static Map A00(C46260DSp dSp) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSp.BcD() != null) {
            A1H.put("photo_url", dSp.BcD());
        }
        if (dSp.CEX() != null) {
            A1H.put("video_url", dSp.CEX());
        }
        return 0Yt.A0B(A1H);
    }
}
