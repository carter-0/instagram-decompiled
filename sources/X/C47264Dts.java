package X;

import android.os.Bundle;

/* renamed from: X.Dts  reason: case insensitive filesystem */
public final class C47264Dts extends AnonymousClass0T0 implements G5E {
    public final Bundle A00;
    public final String A01;

    public C47264Dts(String str, Bundle bundle) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47264Dts) {
                C47264Dts dts = (C47264Dts) obj;
                if (!0qQ.A0K(this.A01, dts.A01) || !0qQ.A0K(this.A00, dts.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
