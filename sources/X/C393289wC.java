package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioFilterType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wC  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393289wC {
    public static Map A00(AudioFilterInfoIntf audioFilterInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (audioFilterInfoIntf.B5w() != null) {
            AudioFilterType B5w = audioFilterInfoIntf.B5w();
            0qQ.A0B(B5w, 0);
            A1H.put("filter_type", B5w.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
