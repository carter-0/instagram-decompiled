package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Ju4  reason: case insensitive filesystem */
public final class C60946Ju4 extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final Set A04;
    public final Set A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60946Ju4) {
                C60946Ju4 ju4 = (C60946Ju4) obj;
                if (this.A00 != ju4.A00 || !0qQ.A0K(this.A01, ju4.A01) || !0qQ.A0K(this.A02, ju4.A02) || !0qQ.A0K(this.A03, ju4.A03) || !0qQ.A0K(this.A04, ju4.A04) || !0qQ.A0K(this.A05, ju4.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31)))));
    }

    public C60946Ju4(String str, Map map, Map map2, Set set, Set set2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = map;
        this.A03 = map2;
        this.A04 = set;
        this.A05 = set2;
    }
}
