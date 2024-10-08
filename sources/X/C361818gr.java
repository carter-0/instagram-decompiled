package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.8gr  reason: invalid class name and case insensitive filesystem */
public final class C361818gr {
    public long A00;
    public String A01 = "";
    public final String A02;
    public final String A03;
    public final Calendar A04 = C361828gs.A00();

    public final String A00(Date date) {
        SimpleDateFormat simpleDateFormat = C362978ip.A00;
        long j = this.A00;
        long time = date.getTime();
        if (time < j || time > j + 86400000) {
            Calendar calendar = this.A04;
            calendar.setTimeInMillis(date.getTime());
            Date time2 = calendar.getTime();
            0qQ.A07(time2);
            C362978ip.A01(calendar, time2);
            this.A00 = calendar.getTimeInMillis();
            this.A01 = C362978ip.A00(this.A02, this.A03, calendar, date);
        }
        return this.A01;
    }

    public C361818gr(Context context) {
        String string = context.getString(2131975436);
        0qQ.A07(string);
        this.A02 = string;
        String string2 = context.getString(2131976949);
        0qQ.A07(string2);
        this.A03 = string2;
    }
}
