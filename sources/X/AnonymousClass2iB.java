package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.2iB  reason: invalid class name */
public final class AnonymousClass2iB implements C226662he {
    public final Uri A00;
    public final Uri A01;
    public final Map A02;

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
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.SingleImageSourceImpl");
        AnonymousClass2iB r4 = (AnonymousClass2iB) obj;
        return 0qQ.A0K(this.A00, r4.A00) && 0qQ.A0K(this.A02, r4.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SingleImageSourceImpl(uri=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(2015));
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A00.hashCode() * 31;
        Map map = this.A02;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public AnonymousClass2iB(Uri uri, Map map) {
        this.A01 = uri;
        this.A02 = map;
        this.A00 = uri;
    }
}
