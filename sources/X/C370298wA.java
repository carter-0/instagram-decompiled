package X;

import android.graphics.Bitmap;

/* renamed from: X.8wA  reason: invalid class name and case insensitive filesystem */
public final class C370298wA extends C370308wB {
    public final Bitmap A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C370298wA) && 0qQ.A0K(this.A00, ((C370298wA) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MlInputBitmap(bitmap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C370298wA(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
