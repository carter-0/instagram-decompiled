package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

public final class N46 extends AnonymousClass0T0 {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03 = 1;

    public N46(ImageUrl imageUrl, String str, long j) {
        0qQ.A0B(str, 3);
        this.A00 = j;
        this.A01 = imageUrl;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A03) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N46) {
                    N46 n46 = (N46) obj;
                    if (n46.A03 == 0 && this.A00 == n46.A00 && 0qQ.A0K(this.A01, n46.A01)) {
                        obj2 = this.A02;
                        obj3 = n46.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N46) {
                    N46 n462 = (N46) obj;
                    if (n462.A03 == 1 && this.A00 == n462.A00 && 0qQ.A0K(this.A02, n462.A02)) {
                        obj2 = this.A01;
                        obj3 = n462.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this != obj) {
                    if (!(obj instanceof N46)) {
                        return false;
                    }
                    N46 n463 = (N46) obj;
                    if (n463.A03 != 2 || !2PP.A00(Long.valueOf(this.A00), Long.valueOf(n463.A00)) || !2PP.A00(this.A01, n463.A01) || !2PP.A00(this.A02, n463.A02)) {
                        return false;
                    }
                }
                return true;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A03) {
            case 0:
                i = AnonymousClass7TF.A07(this.A01, C51975G9x.A03(this.A00));
                i2 = this.A02.hashCode();
                break;
            case 1:
                i = AnonymousClass7TF.A08(this.A02, C51975G9x.A03(this.A00));
                i2 = this.A01.hashCode();
                break;
            default:
                return Arrays.hashCode(new Object[]{this.A01, Long.valueOf(this.A00), this.A02});
        }
        return i + i2;
    }

    public N46(C272074k3 r2, String str, long j) {
        AnonymousClass7TF.A1C(str, 2, r2);
        this.A00 = j;
        this.A02 = str;
        this.A01 = r2;
    }

    public N46(C266444Yx r2, String str, long j) {
        0qQ.A0B(str, 2);
        this.A00 = j;
        this.A02 = str;
        this.A01 = r2;
    }
}
