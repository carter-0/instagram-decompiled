package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.user.model.User;
import java.util.List;

public final class NWW extends C69593Nob {
    public final ViewModelListUpdate A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NWW) {
                NWW nww = (NWW) obj;
                if (!0qQ.A0K(this.A03, nww.A03) || !0qQ.A0K(this.A01, nww.A01) || !0qQ.A0K(this.A00, nww.A00) || !0qQ.A0K(this.A02, nww.A02) || !0qQ.A0K(this.A04, nww.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A00, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public NWW(ViewModelListUpdate viewModelListUpdate, User user, String str, String str2, List list) {
        AnonymousClass7TG.A1P(str, viewModelListUpdate);
        this.A03 = str;
        this.A01 = user;
        this.A00 = viewModelListUpdate;
        this.A02 = str2;
        this.A04 = list;
    }
}
