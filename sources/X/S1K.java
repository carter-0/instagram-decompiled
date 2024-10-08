package X;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public final class S1K {
    public final long A00;
    public final Integer A01;

    public final String toString() {
        String str;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 1);
        Locale locale = Locale.US;
        String format = dateTimeInstance.format(new Date(this.A00));
        Integer num = this.A01;
        if (num != null) {
            str = C9620Rdy.A00(num);
        } else {
            str = "Purchased";
        }
        return Pxe.A12(locale, "Checkout Timestamp [%s], Checkout Outcome [%s]", Pxf.A1X(format, str, 2));
    }

    public S1K(long j, Integer num) {
        this.A00 = j;
        this.A01 = num;
    }
}
