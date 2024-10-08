package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.Locale;

/* renamed from: X.Ku3  reason: case insensitive filesystem */
public abstract class C63258Ku3 {
    public static final String A00(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        String str = directShareTarget.A0I;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0 || !Character.isLetter(str.charAt(0))) {
            return "…";
        }
        String A0q = C51967G9n.A0q(str, 0, 1);
        Locale locale = Locale.getDefault();
        0qQ.A07(locale);
        String upperCase = A0q.toUpperCase(locale);
        0qQ.A07(upperCase);
        return upperCase;
    }
}
