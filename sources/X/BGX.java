package X;

import java.util.List;

public final class BGX extends AnonymousClass0T0 implements DRU {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGX) {
                BGX bgx = (BGX) obj;
                if (!0qQ.A0K(this.A00, bgx.A00) || !0qQ.A0K(this.A01, bgx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BGX(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
