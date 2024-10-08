package X;

/* renamed from: X.Dto  reason: case insensitive filesystem */
public final class C47260Dto extends AnonymousClass0T0 implements JPS {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47260Dto) && this.A00 == ((C47260Dto) obj).A00);
    }

    public final String BK1() {
        return "item_key_spam_request_header";
    }

    public final String getContentType() {
        return "content_type_spam_request_header";
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C47260Dto(boolean z) {
        this.A00 = z;
    }
}
