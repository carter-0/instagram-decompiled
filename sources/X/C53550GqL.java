package X;

/* renamed from: X.GqL  reason: case insensitive filesystem */
public final class C53550GqL extends AnonymousClass0T0 implements JPS {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53550GqL) {
                C53550GqL gqL = (C53550GqL) obj;
                if (!(this.A01 == gqL.A01 && this.A00 == gqL.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String BK1() {
        return "item_key_follow_requests_empty";
    }

    public final String getContentType() {
        return "content_type_follow_requests_empty";
    }

    public C53550GqL(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
