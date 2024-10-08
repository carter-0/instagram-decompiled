package X;

import android.content.Context;

/* renamed from: X.4F6  reason: invalid class name */
public final class AnonymousClass4F6 implements AnonymousClass4F3 {
    public final float A00;

    public AnonymousClass4F6(float f) {
        this.A00 = f;
    }

    public static AnonymousClass4F6 A00(Context context, int i) {
        return new AnonymousClass4F6(context.getResources().getDisplayMetrics().density * ((float) i));
    }

    public final float EIV(AnonymousClass56X r3, AnonymousClass4FJ r4) {
        return this.A00 + r4.AuS(r3);
    }
}
