package X;

import java.util.List;

/* renamed from: X.JyA  reason: case insensitive filesystem */
public final class C61158JyA extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61158JyA) {
                C61158JyA jyA = (C61158JyA) obj;
                if (!0qQ.A0K(this.A01, jyA.A01) || !0qQ.A0K(this.A00, jyA.A00) || !0qQ.A0K(this.A02, jyA.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01.hashCode());
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A01)) + AnonymousClass7TG.A0C(this.A02);
    }

    public C61158JyA(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
