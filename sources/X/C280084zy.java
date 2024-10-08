package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.4zy  reason: invalid class name and case insensitive filesystem */
public final class C280084zy {
    public long A00;
    public long A01;
    public long A02;
    public Date A03 = A00().getTime();
    public Date A04 = A00().getTime();

    public C280084zy(String str, long j, long j2) {
        0qQ.A0B(str, 1);
        this.A01 = j;
        this.A03 = A00().getTime();
        this.A00 = j2;
        this.A03 = A00().getTime();
    }

    public final long A01() {
        if (0qQ.A0K(this.A03, A00().getTime())) {
            return this.A01;
        }
        return 0;
    }

    public static final Calendar A00() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance;
    }
}
