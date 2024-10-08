package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class N5Z extends AnonymousClass0T0 implements C232262tL {
    public final String A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5Z) {
                N5Z n5z = (N5Z) obj;
                if (this.A01 != n5z.A01 || !0qQ.A0K(this.A00, n5z.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public N5Z(boolean z) {
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, C51965G9l.A05(this.A01));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
