package X;

import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Caf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44218Caf {
    public static Map A00(C275704rk r4) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str2 = null;
        if (r4.Bdn() != null) {
            MoreInfoFacepilePositionType Bdn = r4.Bdn();
            if (Bdn != null) {
                str = Bdn.A00;
            } else {
                str = null;
            }
            A1H.put("position", str);
        }
        if (r4.Bwd() != null) {
            MoreInfoFacepileSizeType Bwd = r4.Bwd();
            if (Bwd != null) {
                str2 = Bwd.A00;
            }
            A1H.put("size", str2);
        }
        return 0Yt.A0B(A1H);
    }
}
