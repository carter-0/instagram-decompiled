package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.VRo  reason: case insensitive filesystem */
public final class C17335VRo {
    public final String A00;
    public final Date A01;

    public C17335VRo(Date date) {
        this.A01 = date;
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        this.A00 = String.valueOf(DbU.A03(instance));
    }
}
