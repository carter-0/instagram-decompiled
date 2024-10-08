package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Maq  reason: case insensitive filesystem */
public abstract class C66683Maq {
    public static final ThreadLocal A00 = new C67190Mjm();
    public static final ThreadLocal A01 = new C67194Mjq();

    public static final long A00(long j) {
        Object obj = A00.get();
        if (obj != null) {
            Calendar calendar = (Calendar) obj;
            Object obj2 = A01.get();
            if (obj2 != null) {
                Calendar calendar2 = (Calendar) obj2;
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar.setTimeInMillis(TimeUnit.MICROSECONDS.toMillis(j));
                int i = calendar2.get(1) - calendar.get(1);
                int i2 = calendar2.get(6);
                int i3 = calendar.get(6);
                if (i2 < i3 && i == 1) {
                    i2 += calendar.getActualMaximum(6);
                } else if (i >= 1) {
                    return 365;
                }
                return (long) (i2 - i3);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A02(Context context, long j) {
        int i;
        int i2;
        Object A012;
        String string;
        String string2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        long hours2 = hours - timeUnit2.toHours(j);
        long minutes = timeUnit.toMinutes(System.currentTimeMillis()) - timeUnit2.toMinutes(j);
        if (minutes < 1) {
            i = 2131958537;
        } else {
            if (minutes < 60) {
                i2 = 2131958536;
                A012 = Long.valueOf(minutes);
            } else if (hours2 < 24) {
                string2 = context.getString(2131958534, new Object[]{Long.valueOf(hours2)});
                0qQ.A07(string2);
                return string2;
            } else {
                long A002 = A00(j);
                if (A002 >= 14) {
                    string = context.getString(2131958523);
                    0qQ.A0A(string);
                    return string;
                } else if (A002 >= 7) {
                    i = 2131958535;
                } else if (A002 > 1) {
                    i2 = 2131958524;
                    A012 = A01(j);
                } else {
                    i = 2131958538;
                }
            }
            string = context.getString(i2, new Object[]{A012});
            0qQ.A0A(string);
            return string;
        }
        string2 = context.getString(i);
        0qQ.A07(string2);
        return string2;
    }

    public static final String A01(long j) {
        String format = new SimpleDateFormat("EEEE", AnonymousClass1Q2.A02()).format(new Date(AnonymousClass7TE.A0P(j)));
        0qQ.A07(format);
        return format;
    }
}
