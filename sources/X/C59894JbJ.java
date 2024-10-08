package X;

import android.graphics.Bitmap;

/* renamed from: X.JbJ  reason: case insensitive filesystem */
public final class C59894JbJ {
    public int A00;
    public Bitmap A01;

    public final int A00() {
        boolean A1P = AnonymousClass7TF.A1P((this.A00 / 90) % 2);
        Bitmap bitmap = this.A01;
        if (A1P) {
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (bitmap != null) {
            return bitmap.getHeight();
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final int A01() {
        boolean A1P = AnonymousClass7TF.A1P((this.A00 / 90) % 2);
        Bitmap bitmap = this.A01;
        if (A1P) {
            if (bitmap != null) {
                return bitmap.getHeight();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (bitmap != null) {
            return bitmap.getWidth();
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
