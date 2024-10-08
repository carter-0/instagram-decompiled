package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2gp  reason: invalid class name and case insensitive filesystem */
public final class C226442gp {
    public static final C226442gp A00 = new Object();

    public static final AnonymousClass9DH A00(C239973Ja r6, String str) {
        AnonymousClass9DN r5;
        Context context = C60960kU.A00;
        synchronized (C12072SmR.class) {
            if (C12072SmR.A02 == null) {
                C12072SmR.A02 = new C12072SmR(context.getApplicationContext());
            }
            r5 = C12072SmR.A02;
        }
        return new AnonymousClass9DH(new C381049b5(C60960kU.A00, r6, AnonymousClass2h0.A00, r5, str));
    }

    public final AnonymousClass9DH A01(C239973Ja r3, AnonymousClass2h0 r4, B14 b14) {
        AnonymousClass9DH r0 = new AnonymousClass9DH(new AnonymousClass9DE(C60960kU.A00, r3, r4));
        if (b14 != null) {
            r0.A00 = b14;
        }
        return r0;
    }

    public final File A02(C239973Ja r3, B14 b14, AtomicReference atomicReference) {
        AnonymousClass2h0 r0 = AnonymousClass2h0.A00;
        AnonymousClass9DH r1 = (AnonymousClass9DH) atomicReference.get();
        if (r1 == null) {
            r1 = A01(r3, r0, b14);
            if (!1FH.A00((Object) null, r1, atomicReference)) {
                r1 = (AnonymousClass9DH) atomicReference.get();
            }
        }
        return (File) r1.A00();
    }
}
