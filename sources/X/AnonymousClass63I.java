package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.63I  reason: invalid class name */
public abstract class AnonymousClass63I extends AnonymousClass63J {
    public AnonymousClass647 A01(Context context, Looper looper, AnonymousClass63z r10, AnonymousClass641 r11, AnonymousClass643 r12, Object obj) {
        if (this instanceof AnonymousClass63H) {
            return new AnonymousClass645(context, looper, r10, r11, r12, 258);
        }
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public AnonymousClass647 A00(Context context, Looper looper, AnonymousClass63y r4, AnonymousClass640 r5, AnonymousClass643 r6, Object obj) {
        return A01(context, looper, r4, r5, r6, obj);
    }
}
