package X;

import android.content.Context;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class I4G {
    public static final I4G A00 = new Object();

    public final String A01(Context context, long j) {
        String string;
        DateFormat A01;
        int i;
        0qQ.A0B(context, 0);
        int intValue = A00(j, System.currentTimeMillis()).intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                A01 = C51972G9s.A0P(context).A01();
                i = 2131955407;
            } else if (intValue != 2) {
                A01 = C51972G9s.A0P(context).A03();
                i = 2131955404;
            } else {
                A01 = C51972G9s.A0P(context).A02();
                i = 2131955406;
            }
            string = DbW.A0h(context, A01.format(new Date(j)), i);
        } else {
            string = context.getString(2131955405);
        }
        0qQ.A07(string);
        return string;
    }

    public static final Integer A00(long j, long j2) {
        if (j2 - j < StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
            return AnonymousClass05K.A00;
        }
        Locale locale = Locale.ENGLISH;
        Calendar instance = Calendar.getInstance(locale);
        instance.setTimeInMillis(j2);
        Calendar instance2 = Calendar.getInstance(locale);
        instance2.setTimeInMillis(j);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return AnonymousClass05K.A01;
        }
        if (instance.get(1) == instance2.get(1)) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A0N;
    }
}
