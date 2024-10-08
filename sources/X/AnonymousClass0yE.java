package X;

import android.content.Context;

/* renamed from: X.0yE  reason: invalid class name */
public final class AnonymousClass0yE {
    public static AnonymousClass0yE A03;
    public Context A00;
    public final 0g3 A01;
    public final 0g7 A02 = 0g7.A00();

    public static synchronized AnonymousClass0yE A00(Context context) {
        AnonymousClass0yE r0;
        synchronized (AnonymousClass0yE.class) {
            r0 = A03;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new AnonymousClass0yE(context);
                A03 = r0;
            }
        }
        return r0;
    }

    public AnonymousClass0yE(Context context) {
        0g3 A002 = C60290fq.A00(context);
        this.A01 = A002;
        this.A00 = context;
    }
}
