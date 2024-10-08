package X;

import com.shopify.checkout.models.OrderDetails$PaymentMethod$Companion;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.Vve  reason: case insensitive filesystem */
public final class C18639Vve {
    public static final C255463uA[] A02;
    public static final OrderDetails$PaymentMethod$Companion Companion = new Object();
    public final String A00;
    public final Map A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.shopify.checkout.models.OrderDetails$PaymentMethod$Companion, java.lang.Object] */
    static {
        C255453u9 r1 = C255453u9.A01;
        A02 = new C255463uA[]{null, new C258613zM(r1, r1)};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18639Vve) {
                C18639Vve vve = (C18639Vve) obj;
                if (!0qQ.A0K(this.A00, vve.A00) || !0qQ.A0K(this.A01, vve.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C18639Vve(String str, Map map, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20536WtH.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = str;
        this.A01 = map;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentMethod(type=");
        sb.append(this.A00);
        sb.append(", details=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}
