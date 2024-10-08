package X;

import android.graphics.Matrix;

public final class TRN extends ThreadLocal {
    /* renamed from: A00 */
    public final Matrix get() {
        Object obj = super.get();
        0qQ.A0A(obj);
        Matrix matrix = (Matrix) obj;
        matrix.reset();
        return matrix;
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        return AnonymousClass7TE.A0U();
    }
}
