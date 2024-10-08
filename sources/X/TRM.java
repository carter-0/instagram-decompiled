package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

public final class TRM extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(SUS.A02);
        return simpleDateFormat;
    }
}
