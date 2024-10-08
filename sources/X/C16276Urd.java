package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductArEffectMetadata;

/* renamed from: X.Urd  reason: case insensitive filesystem */
public final class C16276Urd extends C18001Vjd {
    public final ImageInfo A00;
    public final ProductArEffectMetadata A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Boolean A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16276Urd(com.instagram.model.mediasize.ImageInfo r7, com.instagram.model.shopping.ProductArEffectMetadata r8, java.lang.Boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r6 = this;
            r0 = 1
            r3 = r10
            X.0qQ.A0B(r10, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r7 == 0) goto L_0x0027
            X.Vux r1 = new X.Vux
            r1.<init>((com.instagram.model.mediasize.ImageInfo) r7)
        L_0x000e:
            java.lang.String r4 = "ar_camera_nux"
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r10
            r6.A06 = r11
            r6.A05 = r12
            r6.A01 = r8
            r6.A00 = r7
            r6.A03 = r13
            r6.A04 = r14
            r6.A07 = r9
            return
        L_0x0027:
            r1 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16276Urd.<init>(com.instagram.model.mediasize.ImageInfo, com.instagram.model.shopping.ProductArEffectMetadata, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16276Urd) {
                C16276Urd urd = (C16276Urd) obj;
                if (!0qQ.A0K(this.A02, urd.A02) || !0qQ.A0K(this.A06, urd.A06) || !0qQ.A0K(this.A05, urd.A05) || !0qQ.A0K(this.A01, urd.A01) || !0qQ.A0K(this.A00, urd.A00) || !0qQ.A0K(this.A03, urd.A03) || !0qQ.A0K(this.A04, urd.A04) || !0qQ.A0K(this.A07, urd.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A01, (((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }
}
