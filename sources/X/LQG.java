package X;

import android.text.Editable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class LQG {
    public static final 11S A00 = new 11S(" ");

    public static final List A00(Editable editable) {
        L8A[] l8aArr;
        int length;
        if (editable == null || (l8aArr = (L8A[]) editable.getSpans(0, editable.length(), L8A.class)) == null || (length = l8aArr.length) == 0) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        do {
            L8A l8a = l8aArr[i];
            A1C.add(new C61072JwA(l8a.A01, Math.max(0, editable.getSpanStart(l8a))));
            i++;
        } while (i < length);
        return A1C;
    }

    public static final boolean A01(UserSession userSession, 2Er r6, String str) {
        String A11 = 002.A11(".*(@", "‍", "(", "everyone", ")).*");
        0qQ.A07(A11);
        Matcher matcher = Pattern.compile(A11, 2).matcher(str);
        0qQ.A07(matcher);
        if (!matcher.matches() || !AnonymousClass78O.A00(userSession, r6)) {
            return false;
        }
        return true;
    }
}
