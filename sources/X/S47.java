package X;

import android.net.Uri;

public final class S47 {
    public final Uri A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                S47 s47 = (S47) obj;
                if (!0qQ.A0K(this.A00, s47.A00) || this.A01 != s47.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public S47(boolean z, Uri uri) {
        this.A00 = uri;
        this.A01 = z;
    }
}
