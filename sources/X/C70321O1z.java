package X;

import java.util.Locale;

/* renamed from: X.O1z  reason: case insensitive filesystem */
public abstract class C70321O1z {
    public static final Integer A00(String str) {
        if (str != null) {
            try {
                Locale locale = Locale.ROOT;
                0qQ.A08(locale);
                String upperCase = str.toUpperCase(locale);
                0qQ.A07(upperCase);
                if (upperCase.equals("GALLERY")) {
                    return AnonymousClass05K.A00;
                }
                if (upperCase.equals("LIKED")) {
                    return AnonymousClass05K.A01;
                }
                if (upperCase.equals("SAVED")) {
                    return AnonymousClass05K.A0C;
                }
                if (upperCase.equals("SUGGESTED")) {
                    return AnonymousClass05K.A0N;
                }
                if (upperCase.equals("IGTV")) {
                    return AnonymousClass05K.A0Y;
                }
                if (upperCase.equals("FACEBOOK_WATCH")) {
                    return AnonymousClass05K.A0j;
                }
                if (upperCase.equals("REELS")) {
                    return AnonymousClass05K.A0u;
                }
                if (upperCase.equals("SUGGESTED_CLIPS_SUBPAGE")) {
                    return AnonymousClass05K.A15;
                }
                if (upperCase.equals("SUGGESTED_CLIPS_CAROUSEL")) {
                    return AnonymousClass05K.A1F;
                }
                throw AnonymousClass7TE.A0w(upperCase);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
