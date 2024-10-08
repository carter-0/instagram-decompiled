package X;

import java.util.List;

/* renamed from: X.Jzf  reason: case insensitive filesystem */
public final class C61247Jzf extends AnonymousClass0T0 implements MR3 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61247Jzf) {
                C61247Jzf jzf = (C61247Jzf) obj;
                if (!0qQ.A0K(this.A00, jzf.A00) || !0qQ.A0K(this.A01, jzf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61247Jzf(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
