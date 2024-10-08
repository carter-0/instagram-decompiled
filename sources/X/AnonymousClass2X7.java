package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.2X7  reason: invalid class name */
public final class AnonymousClass2X7 {
    public static AnonymousClass2X7 A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public 2X8 A00;

    public final synchronized ColorStateList A03(Context context, int i) {
        return this.A00.A04(context, i);
    }

    public final synchronized Drawable A04(Context context, int i) {
        return this.A00.A05(context, i);
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter A002;
        synchronized (AnonymousClass2X7.class) {
            A002 = 2X8.A00(mode, i);
        }
        return A002;
    }

    public static synchronized AnonymousClass2X7 A01() {
        AnonymousClass2X7 r0;
        synchronized (AnonymousClass2X7.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2X7, java.lang.Object] */
    public static synchronized void A02() {
        synchronized (AnonymousClass2X7.class) {
            if (A01 == null) {
                ? obj = new Object();
                A01 = obj;
                obj.A00 = 2X8.A02();
                2X8 r1 = A01.A00;
                AnonymousClass2XA r0 = new AnonymousClass2XA();
                synchronized (r1) {
                    r1.A01 = r0;
                }
            }
        }
    }
}
