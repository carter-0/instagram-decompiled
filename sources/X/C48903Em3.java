package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.Em3  reason: case insensitive filesystem */
public abstract class C48903Em3 {
    public static final void A00(UserSession userSession) {
        Locale A02 = AnonymousClass1Q2.A02();
        "bio_translation_button_tapped".getClass();
        0xI A01 = 0xI.A01("bio_translation_button_tapped", (String) null);
        A01.A0C("locale", A02.getDisplayName());
        DbU.A1R(A01, userSession);
    }
}
