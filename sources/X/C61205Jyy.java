package X;

/* renamed from: X.Jyy  reason: case insensitive filesystem */
public final class C61205Jyy extends AnonymousClass0T0 implements MQX {
    public final int A00;
    public final String A01;

    public C61205Jyy(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C61205Jyy)) {
            return false;
        }
        C61205Jyy jyy = (C61205Jyy) obj;
        if (jyy.A00 != i || !0qQ.A0K(this.A01, jyy.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61205Jyy() {
        this("deleteBroadcastChannelReply_request_error", 1);
        this.A00 = 1;
    }
}
