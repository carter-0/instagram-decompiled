package X;

import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.List;

public final class N9L extends AnonymousClass0T0 implements C74269Prx {
    public final IgCallModel A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9L) {
                N9L n9l = (N9L) obj;
                if (!0qQ.A0K(this.A01, n9l.A01) || !0qQ.A0K(this.A02, n9l.A02) || !0qQ.A0K(this.A00, n9l.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public N9L(IgCallModel igCallModel, String str, List list) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = igCallModel;
    }

    public N9L() {
        this((IgCallModel) null, "unknown", (List) null);
    }
}
