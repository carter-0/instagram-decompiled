package X;

import android.os.Bundle;

public final class Su0 implements C13451Tae {
    public final Bundle A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Su0) {
                Su0 su0 = (Su0) obj;
                if (!0qQ.A0K(this.A01, su0.A01) || !0qQ.A0K(this.A00, su0.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)) * 31;
    }

    public Su0(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FragmentTransitionInfo(identifier=");
        A1A.append(this.A01);
        A1A.append(", bundle=");
        A1A.append(this.A00);
        A1A.append(", requestKey=");
        A1A.append((String) null);
        A1A.append(", resultListener=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
