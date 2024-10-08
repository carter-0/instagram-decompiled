package X;

import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class W1z {
    public static final Pattern A00 = Pattern.compile("\\p{Punct}");

    public static final SpannableStringBuilder A01(UserSession userSession, AnonymousClass6M9 r4, CharSequence charSequence, int i) {
        AnonymousClass7TF.A1C(charSequence, 1, r4);
        C253003q3 r0 = new C253003q3(new SpannableStringBuilder(charSequence), userSession);
        r0.A03 = i;
        r0.A01 = i;
        r0.A0f = true;
        r0.A0d = true;
        r0.A02(r4);
        r0.A03(r4);
        SpannableStringBuilder A002 = r0.A00();
        0qQ.A07(A002);
        return A002;
    }

    public static final int A00(AnonymousClass6LR r4) {
        String str = r4.A03;
        if (str == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = r4.A04;
        if (!(str2 == null || str2.length() == 0)) {
            sb.insert(1, str2);
        }
        return 0nH.A0C(sb.toString(), -1);
    }

    public static final ArrayList A03(CharSequence charSequence, String str, List list, boolean z) {
        int length;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C46305DUi dUi = (C46305DUi) it.next();
            String C83 = dUi.C83();
            if (!(C83 == null || (length = C83.length()) == 0)) {
                int A08 = 00l.A08(charSequence.toString(), C83, i, false);
                int i2 = A08 + length;
                int A05 = DbX.A05(charSequence.toString());
                if (z) {
                    A05 -= str.length();
                }
                if (!(dUi.BKE() == null || dUi.BKH() == null || dUi.BKH() == StoryAdKeywordStyleEnum.UNRECOGNIZED || A08 == -1 || i2 > A05)) {
                    arrayList.add(dUi);
                    i = i2;
                }
            }
        }
        return arrayList;
    }

    public static final User A02(AnonymousClass6LR r1, String str) {
        Map map;
        User user;
        String A0j = AnonymousClass7TF.A0j(str);
        if (r1 == null || (map = r1.A08) == null || !(!map.isEmpty()) || (user = (User) map.get(A0j)) == null) {
            return new User("-1", A0j);
        }
        return user;
    }
}
