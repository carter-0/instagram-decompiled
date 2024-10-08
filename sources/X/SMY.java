package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class SMY {
    public static AtomicReference A00 = new AtomicReference();

    public static Calendar A00() {
        A00.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar A01(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.setTimeInMillis(calendar.getTimeInMillis());
        Calendar A0u = Pxj.A0u();
        A0u.set(instance.get(1), instance.get(2), instance.get(5));
        return A0u;
    }
}
