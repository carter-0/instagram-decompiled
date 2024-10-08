package X;

import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.Ura  reason: case insensitive filesystem */
public final class C16273Ura extends C18001Vjd {
    public final ImageInfo A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16273Ura(com.instagram.model.mediasize.ImageInfo r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 1
            r3 = r8
            X.0qQ.A0B(r8, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            float r5 = X.1iI.A00(r7)
            X.Vux r1 = new X.Vux
            r1.<init>((com.instagram.model.mediasize.ImageInfo) r7)
            java.lang.String r4 = "catalog_photo"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r8
            r6.A00 = r7
            r6.A02 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16273Ura.<init>(com.instagram.model.mediasize.ImageInfo, java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16273Ura) {
                C16273Ura ura = (C16273Ura) obj;
                if (!0qQ.A0K(this.A01, ura.A01) || !0qQ.A0K(this.A00, ura.A00) || !0qQ.A0K(this.A02, ura.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }
}
