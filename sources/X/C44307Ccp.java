package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ccp  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44307Ccp {
    public static Map A00(AnonymousClass3IA r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BGK() != null) {
            ImageUrl BGK = r3.BGK();
            if (BGK != null) {
                str = BGK.getUrl();
            } else {
                str = null;
            }
            A1H.put("image_url", str);
        }
        if (r3.getText() != null) {
            C41845B3m.A10(r3.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
