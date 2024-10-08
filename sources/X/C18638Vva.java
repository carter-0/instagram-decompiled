package X;

import com.shopify.checkout.AndroidWebView$JSMessage$Companion;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.Vva  reason: case insensitive filesystem */
public final class C18638Vva {
    public static final AndroidWebView$JSMessage$Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18638Vva) {
                C18638Vva vva = (C18638Vva) obj;
                if (!0qQ.A0K(this.A01, vva.A01) || !0qQ.A0K(this.A00, vva.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("JSMessage(name=", this.A01, ", body=", this.A00, ')');
    }

    public /* synthetic */ C18638Vva(String str, String str2, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20518Wsy.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
