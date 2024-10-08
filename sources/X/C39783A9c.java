package X;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* renamed from: X.A9c  reason: case insensitive filesystem */
public final class C39783A9c {
    public final Feature A00;
    public final AnonymousClass63Q A01;

    public /* synthetic */ C39783A9c(Feature feature, AnonymousClass63Q r2) {
        this.A01 = r2;
        this.A00 = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C39783A9c)) {
            return false;
        }
        C39783A9c a9c = (C39783A9c) obj;
        return SA1.A01(this.A01, a9c.A01) && SA1.A01(this.A00, a9c.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(this.A01, "key");
        s4o.A00(this.A00, "feature");
        return s4o.toString();
    }
}
