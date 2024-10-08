package X;

import android.graphics.Bitmap;

/* renamed from: X.8qF  reason: invalid class name and case insensitive filesystem */
public final class C367138qF extends C353538Ia {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C367138qF) && 0qQ.A0K(this.A00, ((C367138qF) obj).A00));
    }

    public final int hashCode() {
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public C367138qF(Bitmap bitmap) {
        super("stacked_timeline_unfinished_draft");
        this.A00 = bitmap;
    }

    public C367138qF() {
        this((Bitmap) null);
    }
}
