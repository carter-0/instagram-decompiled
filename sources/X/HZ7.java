package X;

import java.util.Calendar;
import java.util.Date;

public abstract class HZ7 {
    public static String A00(int i) {
        String A00;
        long j = ((long) i) * 1000;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(new Date());
        instance2.setTime(new Date(j));
        if (instance.get(1) == instance2.get(1)) {
            A00 = "MMM d";
        } else {
            A00 = AnonymousClass000.A00(61);
        }
        return C14240TsN.A04(A00, j);
    }
}
