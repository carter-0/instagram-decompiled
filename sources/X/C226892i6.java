package X;

import android.graphics.Bitmap;

/* renamed from: X.2i6  reason: invalid class name and case insensitive filesystem */
public final class C226892i6 implements C226662he {
    public final Bitmap A00;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapImageSource(bitmap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls2, cls)) {
            return false;
        }
        Bitmap bitmap = this.A00;
        0qQ.A0C(obj, AnonymousClass000.A00(3648));
        return 0qQ.A0K(bitmap, ((C226892i6) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C226892i6(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
