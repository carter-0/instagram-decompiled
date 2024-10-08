package X;

import com.instagram.api.schemas.ProfileTheme;
import com.instagram.api.schemas.ProfileThemeType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CcP  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44281CcP {
    public static Map A00(ProfileTheme profileTheme) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (profileTheme.AbJ() != null) {
            A1H.put("alternative_background_url", profileTheme.AbJ());
        }
        if (profileTheme.AbK() != null) {
            A1H.put("alternative_thumbnail_url", profileTheme.AbK());
        }
        if (profileTheme.Aev() != null) {
            A1H.put("background_url", profileTheme.Aev());
        }
        if (profileTheme.B9h() != null) {
            A1H.put(AnonymousClass000.A00(619), profileTheme.B9h());
        }
        if (profileTheme.C5u() != null) {
            A1H.put("theme_id", profileTheme.C5u());
        }
        if (profileTheme.C5x() != null) {
            ProfileThemeType C5x = profileTheme.C5x();
            0qQ.A0B(C5x, 0);
            A1H.put("theme_type", C5x.A00);
        }
        if (profileTheme.C75() != null) {
            A1H.put("thumbnail_url", profileTheme.C75());
        }
        return 0Yt.A0B(A1H);
    }
}
