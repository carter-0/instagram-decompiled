package X;

import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EdB  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48354EdB {
    public static Map A00(C51955G8y g8y) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (g8y.BRg() != null) {
            TextAppMentionType BRg = g8y.BRg();
            if (BRg != null) {
                str = BRg.A00;
            }
            A1H.put(C273654mx.A00(166), str);
        }
        User BRj = g8y.BRj();
        if (BRj != null) {
            A1H.put(C66579MXk.A00(142), BRj.A08());
        }
        return 0Yt.A0B(A1H);
    }
}
