package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class UKO extends AnonymousClass0T0 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKO) {
                UKO uko = (UKO) obj;
                if (!0qQ.A0K(this.A00, uko.A00) || !0qQ.A0K(this.A03, uko.A03) || !0qQ.A0K(this.A04, uko.A04) || !0qQ.A0K(this.A01, uko.A01) || !0qQ.A0K(this.A02, uko.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TG.A0C(this.A00) * 31)) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31 * 31) + C54732HQn.A00();
    }

    public UKO(ImageUrl imageUrl, String str, String str2, List list, List list2) {
        this.A00 = imageUrl;
        this.A03 = list;
        this.A04 = list2;
        this.A01 = str;
        this.A02 = str2;
    }
}
