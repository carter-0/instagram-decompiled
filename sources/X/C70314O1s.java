package X;

import android.text.Html;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.O1s  reason: case insensitive filesystem */
public abstract class C70314O1s {
    public static final CharSequence A00(List list, int i) {
        CharSequence charSequence = "";
        CharSequence charSequence2 = charSequence;
        if (list == null) {
            return charSequence;
        }
        CharSequence charSequence3 = charSequence;
        if (i < list.size()) {
            User A0g = DbS.A0g(list, i);
            String str = charSequence;
            if (A0g != null) {
                str = A0g.getUsername();
            }
            String[] strArr = {Html.escapeHtml(new String[]{str}[0])};
            0qQ.A0B(strArr, 0);
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("<b>%s</b>", strArr[0]);
            if (formatStrLocaleSafe == null) {
                formatStrLocaleSafe = charSequence2;
            }
            CharSequence fromHtml = Html.fromHtml(formatStrLocaleSafe);
            0qQ.A0A(fromHtml);
            charSequence3 = fromHtml;
        }
        return charSequence3;
    }
}
