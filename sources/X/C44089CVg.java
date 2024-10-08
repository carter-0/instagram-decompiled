package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CVg  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44089CVg {
    public static Map A00(DU6 du6) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du6.getContentUrl() != null) {
            A1H.put("content_url", du6.getContentUrl());
        }
        String str = null;
        if (du6.Awq() != null) {
            ImageUrl Awq = du6.Awq();
            if (Awq != null) {
                str = Awq.getUrl();
            }
            A1H.put("developer_app_logo_url", str);
        }
        if (du6.getMediaCount() != null) {
            A1H.put("media_count", du6.getMediaCount());
        }
        User Bge = du6.Bge();
        if (Bge != null) {
            A1H.put("profile", Bge.A08());
        }
        return 0Yt.A0B(A1H);
    }
}
