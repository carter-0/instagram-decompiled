package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.N3k  reason: case insensitive filesystem */
public final class C68169N3k extends AnonymousClass0T0 {
    public int A00;
    public C15055ULy A01;
    public ProductTaggingFeedComponentType A02;
    public String A03;

    public C68169N3k() {
        this((C15055ULy) null, (ProductTaggingFeedComponentType) null, (String) null, (DefaultConstructorMarker) null, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68169N3k) {
                C68169N3k n3k = (C68169N3k) obj;
                if (this.A02 != n3k.A02 || !0qQ.A0K(this.A03, n3k.A03) || this.A00 != n3k.A00 || !0qQ.A0K(this.A01, n3k.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C68169N3k(C15055ULy uLy, ProductTaggingFeedComponentType productTaggingFeedComponentType, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        ProductTaggingFeedComponentType productTaggingFeedComponentType2 = ProductTaggingFeedComponentType.UNRECOGNIZED;
        C15055ULy uLy2 = new C15055ULy((C61079JwH) null, 511);
        this.A02 = productTaggingFeedComponentType2;
        this.A03 = "";
        this.A00 = 0;
        this.A01 = uLy2;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A02);
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A08(this.A03, A0K) + this.A00) * 31);
    }
}
