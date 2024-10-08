package X;

import android.content.Context;

/* renamed from: X.5QG  reason: invalid class name */
public abstract class AnonymousClass5QG {
    public static final AnonymousClass5QL A00(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        AnonymousClass5QJ A00 = AnonymousClass5QH.A00.A00(f);
        if (A00 == null) {
            A00 = new AnonymousClass5QK(f);
        }
        return new AnonymousClass5QL(A00, f2, f);
    }
}
