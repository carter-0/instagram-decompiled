package X;

import android.net.Uri;

public final class UKJ extends AnonymousClass0T0 {
    public final Uri A00;
    public final Float A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKJ) {
                UKJ ukj = (UKJ) obj;
                if (!0qQ.A0K(this.A00, ukj.A00) || !0qQ.A0K(this.A01, ukj.A01) || !0qQ.A0K(this.A02, ukj.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public UKJ(Uri uri, Float f, String str) {
        this.A00 = uri;
        this.A01 = f;
        this.A02 = str;
    }
}
