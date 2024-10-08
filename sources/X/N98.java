package X;

import java.util.List;

public final class N98 extends AnonymousClass0T0 implements C74269Prx {
    public final String A00;
    public final List A01;

    public N98(List list, String str) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N98) {
                N98 n98 = (N98) obj;
                if (!0qQ.A0K(this.A01, n98.A01) || !0qQ.A0K(this.A00, n98.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallJoiningStateModel(callTargetAvatarUrls=");
        A1A.append(this.A01);
        A1A.append(", callTarget=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
