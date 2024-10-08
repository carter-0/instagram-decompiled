package X;

/* renamed from: X.GqM  reason: case insensitive filesystem */
public final class C53551GqM extends AnonymousClass0T0 implements JPS {
    public final int A00;
    public final int A01;

    public C53551GqM(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53551GqM) || ((C53551GqM) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String BK1() {
        if (this.A00 != 0) {
            return "item_key_spam_request_subheader";
        }
        return "item_key_spam_request_entrypoint";
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
        if (!A00(i, obj) || this.A01 != ((C53551GqM) obj).A01) {
            return false;
        }
        return true;
    }

    public final String getContentType() {
        if (this.A00 != 0) {
            return "content_type_spam_request_subheader";
        }
        return "content_type_spam_request_entrypoint";
    }

    public final int hashCode() {
        return this.A01;
    }
}
