package X;

import com.instagram.api.schemas.TestimonialDict;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KqN  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63032KqN {
    public static Map A00(TestimonialDict testimonialDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        User Adx = testimonialDict.Adx();
        if (Adx != null) {
            A1H.put("author", Adx.A08());
        }
        if (testimonialDict.AsC() != null) {
            A1H.put("created_at", testimonialDict.AsC());
        }
        if (testimonialDict.BQH() != null) {
            A1H.put(AnonymousClass000.A00(697), testimonialDict.BQH());
        }
        if (testimonialDict.getText() != null) {
            A1H.put("text", testimonialDict.getText());
        }
        return 0Yt.A0B(A1H);
    }
}
