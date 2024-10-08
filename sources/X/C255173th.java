package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3th  reason: invalid class name and case insensitive filesystem */
public abstract class C255173th {
    public static final long A00(long j, long j2) {
        return TimeUnit.MILLISECONDS.toDays(new Date(j).getTime() - new Date(j2).getTime());
    }
}
