package X;

import com.instagram.api.schemas.TextPostAppUserFediverseInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CgK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44524CgK {
    public static Map A00(TextPostAppUserFediverseInfo textPostAppUserFediverseInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (textPostAppUserFediverseInfo.C5L() != null) {
            A1H.put("text_post_app_fediverse_followers_count", textPostAppUserFediverseInfo.C5L());
        }
        if (textPostAppUserFediverseInfo.C5M() != null) {
            A1H.put("text_post_app_fediverse_followers_instance_count", textPostAppUserFediverseInfo.C5M());
        }
        return 0Yt.A0B(A1H);
    }
}
