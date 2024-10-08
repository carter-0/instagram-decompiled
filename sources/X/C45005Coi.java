package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Coi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45005Coi {
    public static Map A00(DUJ duj) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duj.BGL() != null) {
            A1H.put("image_url", duj.BGL());
        }
        User C4Y = duj.C4Y();
        if (C4Y != null) {
            A1H.put("template_author", C4Y.A08());
        }
        if (duj.C4Z() != null) {
            A1H.put("template_id", duj.C4Z());
        }
        return 0Yt.A0B(A1H);
    }
}
