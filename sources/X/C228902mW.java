package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2mW  reason: invalid class name and case insensitive filesystem */
public abstract class C228902mW {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C228912mX.A00);

    public static final int A00(Context context, AnonymousClass07i r9, AnonymousClass11X r10, Integer num) {
        int andIncrement = C228922mY.A00.getAndIncrement();
        Context context2 = context;
        AnonymousClass07i r4 = r9;
        AnonymousClass11X r5 = r10;
        Integer num2 = num;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            0wb.A04("LoaderScheduler", 002.A0R("Tried to initialize loader on non-UI thread for module: ", 1Rm.A00().A00), 1);
            ((Handler) A00.getValue()).post(new TKM(context2, r4, r5, num2, andIncrement));
            return andIncrement;
        }
        r9.A02((Bundle) null, new C228932mZ(context2, r4, r5, num2, andIncrement), andIncrement);
        return andIncrement;
    }
}
