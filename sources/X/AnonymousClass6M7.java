package X;

import android.content.Context;

/* renamed from: X.6M7  reason: invalid class name */
public final class AnonymousClass6M7 {
    public final AnonymousClass6M6 A00(Context context) {
        0qQ.A0B(context, 0);
        AnonymousClass6M6 r0 = AnonymousClass6M6.A0N;
        if (r0 == null) {
            synchronized (this) {
                r0 = AnonymousClass6M6.A0N;
                if (r0 == null) {
                    r0 = new AnonymousClass6M6(context);
                    AnonymousClass6M6.A0N = r0;
                }
            }
        }
        return r0;
    }
}
