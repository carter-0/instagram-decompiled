package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.regex.Pattern;

public final class XOV extends C368338sS {
    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        String str = (String) obj;
        String str2 = (String) C21351XYe.A01.get(str);
        if (str2 == null) {
            str2 = ".*";
        } else {
            String str3 = (String) C21351XYe.A00.get(str);
            if (str3 != null && str3.startsWith("CC")) {
                str2 = StringFormatUtil.formatStrLocaleSafe("%s%s", new Object[]{str3.replace("CC", str), str2});
            }
        }
        return Pattern.compile(str2);
    }
}
