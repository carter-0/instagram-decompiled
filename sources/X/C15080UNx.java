package X;

import com.instagram.model.shopping.ProductArEffectMetadata;

/* renamed from: X.UNx  reason: case insensitive filesystem */
public final class C15080UNx extends AnonymousClass0T0 implements C232262tL {
    public final VPS A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final ProductArEffectMetadata A04;

    public C15080UNx(ProductArEffectMetadata productArEffectMetadata, VPS vps, String str, String str2, String str3) {
        0qQ.A0B(str3, 3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = productArEffectMetadata;
        this.A00 = vps;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15080UNx) {
                C15080UNx uNx = (C15080UNx) obj;
                if (!0qQ.A0K(this.A01, uNx.A01) || !0qQ.A0K(this.A03, uNx.A03) || !0qQ.A0K(this.A02, uNx.A02) || !0qQ.A0K(this.A04, uNx.A04) || !0qQ.A0K(this.A00, uNx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R("arpill:", this.A03);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A01)))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
