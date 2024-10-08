package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Arrays;

/* renamed from: X.46u  reason: invalid class name and case insensitive filesystem */
public final class C2607246u {
    public ExtendedImageUrl A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public C2607246u(ExtendedImageUrl extendedImageUrl, Long l, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = l;
        this.A00 = extendedImageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2607246u)) {
            return false;
        }
        C2607246u r4 = (C2607246u) obj;
        return 0qQ.A0K(A00(), r4.A00()) && 0qQ.A0K(this.A02, r4.A02) && 0qQ.A0K(this.A04, r4.A04) && 0qQ.A0K(this.A01, r4.A01) && this.A05 == r4.A05 && 0qQ.A0K(this.A00, r4.A00);
    }

    public final String A00() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("senderId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A00(), this.A02, this.A04, this.A01, Boolean.valueOf(this.A05), this.A00});
    }

    public C2607246u() {
    }
}
