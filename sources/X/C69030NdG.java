package X;

import android.location.Location;
import java.util.Set;

/* renamed from: X.NdG  reason: case insensitive filesystem */
public final class C69030NdG extends O93 {
    public final int A00;
    public final Location A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public C69030NdG(Location location, String str, String str2, Set set, int i) {
        super(new 2HY(3, 19));
        this.A04 = set;
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = location;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69030NdG) {
                C69030NdG ndG = (C69030NdG) obj;
                if (!0qQ.A0K(this.A04, ndG.A04) || this.A00 != ndG.A00 || !0qQ.A0K(this.A03, ndG.A03) || !0qQ.A0K(this.A02, ndG.A02) || !0qQ.A0K(this.A01, ndG.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A03, (AnonymousClass7TE.A0K(this.A04) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
