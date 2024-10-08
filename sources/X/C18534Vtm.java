package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Vtm  reason: case insensitive filesystem */
public final class C18534Vtm {
    public static final /* synthetic */ C18534Vtm A00 = new Object();

    public final String A00(Context context, int i, int i2, int i3) {
        0qQ.A0B(context, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = (long) i2;
        long j2 = (long) i3;
        String string = context.getString(i, new Object[]{Long.valueOf(timeUnit.toMinutes(j)), Long.valueOf(timeUnit.toSeconds(j) % 60), Long.valueOf(timeUnit.toMinutes(j2)), Long.valueOf(timeUnit.toSeconds(j2) % 60)});
        0qQ.A07(string);
        return string;
    }
}
