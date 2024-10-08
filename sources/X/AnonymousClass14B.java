package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.14B  reason: invalid class name */
public abstract class AnonymousClass14B {
    public static AnonymousClass14B A00;
    public static AnonymousClass0eM A01;
    public static boolean A02;
    public static final AnonymousClass14C A03 = new Object();

    public abstract Intent A02(Context context, int i);

    public abstract Intent A03(Context context, int i);

    public abstract Intent A04(Context context, Uri uri);

    public static final synchronized AnonymousClass14B A00() {
        AnonymousClass14B A002;
        synchronized (AnonymousClass14B.class) {
            A002 = A03.A00();
        }
        return A002;
    }

    public final Intent A01(Context context) {
        return A03(context, 335544320);
    }
}
