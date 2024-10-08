package X;

import android.graphics.Bitmap;

public final class IQK implements C59493JLr {
    public final Bitmap A00;
    public final C59832Ja7 A01;
    public final String A02;

    public IQK(Bitmap bitmap, C59832Ja7 ja7, String str) {
        0qQ.A0B(bitmap, 2);
        this.A02 = str;
        this.A00 = bitmap;
        this.A01 = ja7;
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
        if (!0qQ.A0K(cls2, cls) || !(obj instanceof IQK)) {
            return false;
        }
        return 0qQ.A0K(this.A02, ((IQK) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }
}
