package X;

import com.instagram.api.schemas.SocialContextType;
import java.util.List;

public final class GHN extends AnonymousClass0T0 {
    public final int A00;
    public final SocialContextType A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public GHN(SocialContextType socialContextType, String str, List list, int i, boolean z) {
        0qQ.A0B(list, 2);
        this.A01 = socialContextType;
        this.A03 = list;
        this.A04 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GHN) {
                GHN ghn = (GHN) obj;
                if (!(this.A01 == ghn.A01 && 0qQ.A0K(this.A03, ghn.A03) && this.A04 == ghn.A04 && 0qQ.A0K(this.A02, ghn.A02) && this.A00 == ghn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A01))) + AnonymousClass7TG.A0E(this.A02)) * 31) + this.A00) * 31;
    }
}
