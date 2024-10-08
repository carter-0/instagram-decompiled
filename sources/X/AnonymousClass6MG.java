package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Deprecated;

@Deprecated(message = "Sync all changes with the Kotlin implementation of @StoryAdTextUtilKt")
/* renamed from: X.6MG  reason: invalid class name */
public abstract class AnonymousClass6MG {
    public static final Pattern A00 = Pattern.compile("\\p{Punct}");

    public static int A00(AnonymousClass6LR r4) {
        String str = r4.A03;
        if (str == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(r4.A04)) {
            sb.insert(1, r4.A04);
        }
        return 0nH.A0C(sb.toString(), -1);
    }

    public static SpannableStringBuilder A01(UserSession userSession, AnonymousClass6M9 r3, CharSequence charSequence, int i) {
        C253003q3 r1 = new C253003q3(new SpannableStringBuilder(charSequence), userSession);
        r1.A03 = i;
        r1.A01 = i;
        r1.A0f = true;
        r1.A0d = true;
        r1.A02(r3);
        r1.A03(r3);
        return r1.A00();
    }

    public static User A02(AnonymousClass6LR r1, String str) {
        Map map;
        User user;
        String lowerCase = str.toLowerCase(Locale.US);
        if (r1 == null || (map = r1.A08) == null || map.isEmpty() || (user = (User) map.get(lowerCase)) == null) {
            return new User("-1", lowerCase);
        }
        return user;
    }

    public static ArrayList A03(CharSequence charSequence, String str, List list, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C46305DUi dUi = (C46305DUi) it.next();
            String C83 = dUi.C83();
            if (C83 != null && !TextUtils.isEmpty(C83)) {
                int indexOf = charSequence.toString().indexOf(C83, i2);
                int length = indexOf + C83.length();
                String charSequence2 = charSequence.toString();
                if (charSequence2 != null) {
                    i = charSequence2.length();
                } else {
                    i = 0;
                }
                if (z) {
                    i -= str.length();
                }
                if (!(dUi.BKE() == null || dUi.BKH() == null || dUi.BKH() == StoryAdKeywordStyleEnum.UNRECOGNIZED || indexOf == -1 || length > i)) {
                    arrayList.add(dUi);
                    i2 = length;
                }
            }
        }
        return arrayList;
    }
}
