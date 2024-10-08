package X;

import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.EdC  reason: case insensitive filesystem */
public abstract class C48355EdC {
    public static C47218Dt5 parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            TextAppMentionType textAppMentionType = null;
            User user = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (C273654mx.A00(166).equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    textAppMentionType = (TextAppMentionType) TextAppMentionType.A01.get(str);
                    if (textAppMentionType == null) {
                        textAppMentionType = TextAppMentionType.UNRECOGNIZED;
                    }
                } else if (C66579MXk.A00(142).equals(A17)) {
                    user = C41845B3m.A0a(r6, false);
                }
                r6.A0z();
            }
            return new C47218Dt5(textAppMentionType, user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
