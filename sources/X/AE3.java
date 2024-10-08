package X;

import android.net.Uri;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Arrays;

public final class AE3 {
    public String A00;
    public String A01;
    public boolean A02;

    public AE3(String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AE3 ae3 = (AE3) obj;
            if (this.A02 != ae3.A02 || !0qQ.A0K(A01(), ae3.A01()) || !0qQ.A0K(this.A00, ae3.A00)) {
                return false;
            }
        }
        return true;
    }

    public final SimpleImageUrl A00() {
        String str = this.A00;
        if (str == null || str.length() == 0) {
            return null;
        }
        Uri A03 = 0cp.A03(str);
        0qQ.A07(A03);
        return C253833rU.A00(A03, -1, -1);
    }

    public final String A01() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        0qQ.A0F("shortName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A01(), this.A00, Boolean.valueOf(this.A02)});
    }

    public AE3() {
    }
}
