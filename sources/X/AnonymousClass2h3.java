package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2h3  reason: invalid class name */
public final class AnonymousClass2h3 implements Runnable {
    public final /* synthetic */ C226482gt A00;

    public AnonymousClass2h3(C226482gt r1) {
        this.A00 = r1;
    }

    public final void run() {
        try {
            this.A00.invalidateSelf();
        } catch (NullPointerException unused) {
            this.A00.invalidateSelf();
        } catch (Exception e) {
            Locale locale = Locale.US;
            C226512gw r3 = this.A00.A00.A02;
            String format = String.format(locale, "Unable to invalidate Drawable with id: %d (%s) by %s", Arrays.copyOf(new Object[]{Integer.valueOf(r3.A02), r3.A01, r3.A00}, 3));
            0qQ.A07(format);
            throw new RuntimeException(format, e);
        }
    }
}
