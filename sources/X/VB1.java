package X;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class VB1 {
    public static final Integer A00(Date date, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        long time = j - instance.getTime().getTime();
        if (time < 0) {
            C13988Tno.A1U(instance2, j);
            if (!(instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1))) {
                C13988Tno.A1U(instance2, TimeUnit.DAYS.toMillis(1) + j);
                if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
                    return AnonymousClass05K.A01;
                }
                C13988Tno.A1U(instance2, j);
                if (instance.get(1) != instance2.get(1)) {
                    return AnonymousClass05K.A00;
                }
                return AnonymousClass05K.A0j;
            }
        } else {
            TimeUnit timeUnit = TimeUnit.DAYS;
            if (time < timeUnit.toMillis(7)) {
                C13988Tno.A1U(instance2, j);
                if (instance.get(5) != instance2.get(5)) {
                    C13988Tno.A1U(instance2, j - timeUnit.toMillis(1));
                    if (instance.get(5) == instance2.get(5)) {
                        return AnonymousClass05K.A0N;
                    }
                    C13988Tno.A1U(instance2, j);
                    if (instance2.get(7) != instance.get(7)) {
                        return AnonymousClass05K.A0Y;
                    }
                }
            }
            C13988Tno.A1U(instance2, j);
            if (instance.get(1) != instance2.get(1)) {
                return AnonymousClass05K.A0u;
            }
            return AnonymousClass05K.A0j;
        }
        return AnonymousClass05K.A0C;
    }
}
