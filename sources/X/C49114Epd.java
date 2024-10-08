package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.sql.Date;
import java.text.DateFormat;

/* renamed from: X.Epd  reason: case insensitive filesystem */
public abstract class C49114Epd {
    public static final String A00(Context context) {
        0qQ.A0B(context, 0);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s: v%s (Build #%d) \nBuild time: %s", 0la.A02.A00(), C61120lW.A04(context), Integer.valueOf(C61120lW.A00()), DateFormat.getDateTimeInstance(3, 3, AnonymousClass1Q2.A02()).format(new Date(C61120lW.A01(context))));
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
