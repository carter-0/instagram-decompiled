package X;

import android.net.Uri;

/* renamed from: X.XIj  reason: case insensitive filesystem */
public final class C21189XIj extends SJ5 {
    public final String A00;

    public final String toString() {
        String str = this.A00;
        if (str != null) {
            return 002.A0g(str, ", ", super.toString());
        }
        return super.toString();
    }

    public C21189XIj(String str, Uri uri) {
        super(uri);
        this.A00 = str;
    }
}
