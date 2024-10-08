package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.List;

public final class N37 extends AnonymousClass0T0 {
    public final C68156N2w A00;
    public final ImageInfo A01;
    public final User A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N37) {
                N37 n37 = (N37) obj;
                if (!0qQ.A0K(this.A06, n37.A06) || !0qQ.A0K(this.A01, n37.A01) || !0qQ.A0K(this.A03, n37.A03) || !0qQ.A0K(this.A04, n37.A04) || !0qQ.A0K(this.A00, n37.A00) || !0qQ.A0K(this.A02, n37.A02) || !0qQ.A0K(this.A07, n37.A07) || !0qQ.A0K(this.A05, n37.A05) || !0qQ.A0K(this.A08, n37.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public N37(C68156N2w n2w, ImageInfo imageInfo, User user, Integer num, Integer num2, Integer num3, String str, String str2, List list) {
        this.A06 = str;
        this.A01 = imageInfo;
        this.A03 = num;
        this.A04 = num2;
        this.A00 = n2w;
        this.A02 = user;
        this.A07 = str2;
        this.A05 = num3;
        this.A08 = list;
    }
}
