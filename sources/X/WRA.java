package X;

public final class WRA implements AnonymousClass1FD {
    public static final WRA A00 = new WRA();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r23) {
        /*
            r22 = this;
            r15 = 0
            r2 = r23
            X.0qQ.A0B(r2, r15)
            r6 = 0
            r14 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            X.UOV r5 = new X.UOV
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r16 = r15
            r17 = r15
            r18 = r15
            r20 = r15
            r21 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0030
            java.lang.String r1 = "JSON string for MediaIgtvShareSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x015f
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x015a
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x013a;
                case -2007375800: goto L_0x012a;
                case -1985806860: goto L_0x011a;
                case -1914105377: goto L_0x0105;
                case -1824429564: goto L_0x00f5;
                case -1203619573: goto L_0x00e1;
                case 3601339: goto L_0x00c7;
                case 6126141: goto L_0x00b4;
                case 758560904: goto L_0x00a1;
                case 895256511: goto L_0x008e;
                case 1260322998: goto L_0x007f;
                case 1607556773: goto L_0x0070;
                case 1776071171: goto L_0x0061;
                case 1993322383: goto L_0x0052;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaIgtvShareStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x004e:
            r2.A0z()
            goto L_0x0030
        L_0x0052:
            java.lang.String r0 = "media_duration"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r2.A1D()
            r5.A03 = r0
            goto L_0x004e
        L_0x0061:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r5.A06 = r0
            goto L_0x004e
        L_0x0070:
            java.lang.String r0 = "container_height"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r2.A1D()
            r5.A01 = r0
            goto L_0x004e
        L_0x007f:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r5.A05 = r0
            goto L_0x004e
        L_0x008e:
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2.A0d()
            r5.A0D = r0
            goto L_0x004e
        L_0x00a1:
            r0 = 259(0x103, float:3.63E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r2.A1D()
            r5.A02 = r0
            goto L_0x004e
        L_0x00b4:
            r0 = 340(0x154, float:4.76E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r5.A09 = r0
            goto L_0x004e
        L_0x00c7:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004e
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004e
            r5.A0B = r0
            goto L_0x004e
        L_0x00e1:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r5.A07 = r0
            goto L_0x004e
        L_0x00f5:
            java.lang.String r0 = "original_media_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r5.A0A = r0
            goto L_0x004e
        L_0x0105:
            r0 = 46
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A00 = r0
            goto L_0x004e
        L_0x011a:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r2.A1D()
            r5.A04 = r0
            goto L_0x004e
        L_0x012a:
            java.lang.String r0 = "has_collaborators"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2.A0d()
            r5.A0C = r0
            goto L_0x004e
        L_0x013a:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004e
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004e
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x004e
            r5.A08 = r0
            goto L_0x004e
        L_0x015a:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x015f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRA.invoke(X.16F):java.lang.Object");
    }
}
