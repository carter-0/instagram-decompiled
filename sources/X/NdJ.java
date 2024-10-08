package X;

public final class NdJ extends C321016tR {
    public final OME A00;
    public final String A01;
    public final boolean A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NdJ(android.content.Context r18, com.instagram.common.session.UserSession r19, X.C317966o8 r20, boolean r21) {
        /*
            r17 = this;
            r7 = r19
            boolean r2 = X.DbW.A1Y(r7)
            r5 = r20
            com.instagram.common.typedurl.ImageUrl r0 = r5.A0H
            java.lang.String r10 = X.JTP.A0o(r0)
            java.lang.String r11 = r5.A0S
            X.0qQ.A07(r11)
            r6 = r18
            int r0 = X.JTR.A08(r6)
            float r13 = (float) r0
            float r1 = r5.A01
            float r0 = r5.A00
            float r4 = r1 / r0
            float r0 = X.0nA.A00(r6, r1)
            int r3 = (int) r0
            float r0 = r5.A00
            float r0 = X.0nA.A00(r6, r0)
            int r1 = (int) r0
            r16 = 0
            r12 = 0
            r0 = -1
            X.6tX r8 = X.C321066tW.A00(r4, r3, r1, r0)
            r0 = 2130971273(0x7f040a89, float:1.755128E38)
            int r14 = X.AnonymousClass7TF.A03(r6, r0)
            r0 = 2130971272(0x7f040a88, float:1.7551278E38)
            int r15 = X.AnonymousClass7TF.A03(r6, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r5 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r21
            r5.A02 = r3
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            r5.A01 = r1
            X.OME r0 = X.C73918Ply.A00(r7)
            r5.A00 = r0
            if (r21 == 0) goto L_0x005e
            r0.A01(r1, r2)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NdJ.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6o8, boolean):void");
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        AnonymousClass7TG.A1N(str, x8u);
        0qQ.A0B(str2, 2);
        super.DOa(x8u, str, str2);
        if (this.A02) {
            OME ome = this.A00;
            ome.A00.markerEnd(944511429, JTR.A0F(this.A01), 2);
        }
    }

    public final void onError(String str) {
        super.onError(str);
        if (this.A02) {
            OME ome = this.A00;
            int A0F = JTR.A0F(this.A01);
            02m r2 = ome.A00;
            r2.markerAnnotate(944511429, A0F, "error", "Failed to load animated sticker");
            r2.markerEnd(944511429, A0F, 3);
        }
    }
}
