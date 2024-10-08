package X;

import android.net.Uri;

/* renamed from: X.QcT  reason: case insensitive filesystem */
public final class C7901QcT extends AnonymousClass0cm {
    public final boolean A00 = true;
    public final String[] A01;

    public C7901QcT(String[] strArr) {
        this.A01 = strArr;
    }

    public final boolean A01(Uri uri) {
        String host;
        if (!(uri == null || (host = uri.getHost()) == null)) {
            for (String str : this.A01) {
                if (host.equals(str) || (this.A00 && host.endsWith(002.A0R(".", str)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A00() {
        return AnonymousClass7TF.A1Q(this.A01.length);
    }
}
