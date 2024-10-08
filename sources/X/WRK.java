package X;

public final class WRK implements AnonymousClass1FD {
    public static final WRK A00 = new WRK();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r23) {
        /*
            r22 = this;
            r0 = 0
            r2 = r23
            X.0qQ.A0B(r2, r0)
            r6 = 0
            r15 = 0
            r21 = 16383(0x3fff, float:2.2957E-41)
            X.UOW r5 = new X.UOW
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r15
            r17 = r15
            r18 = r0
            r19 = r0
            r20 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0031
            java.lang.String r1 = "JSON string for MediaPollSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0031:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0167
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x0162
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x0142;
                case -1985806860: goto L_0x0132;
                case -1369440366: goto L_0x0122;
                case -1203619573: goto L_0x010e;
                case -1165870106: goto L_0x00fe;
                case -792211212: goto L_0x00ed;
                case -760638832: goto L_0x00d3;
                case -468347206: goto L_0x00c2;
                case 3601339: goto L_0x00a9;
                case 338274834: goto L_0x009a;
                case 630818764: goto L_0x0081;
                case 1260322998: goto L_0x0072;
                case 1391657528: goto L_0x0062;
                case 1776071171: goto L_0x0053;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaPollStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x004f:
            r2.A0z()
            goto L_0x0031
        L_0x0053:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r5.A07 = r0
            goto L_0x004f
        L_0x0062:
            java.lang.String r0 = "first_option_text_size"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A00 = r0
            goto L_0x004f
        L_0x0072:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r5.A06 = r0
            goto L_0x004f
        L_0x0081:
            java.lang.String r0 = "first_option_string"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004f
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004f
            r5.A0A = r0
            goto L_0x004f
        L_0x009a:
            java.lang.String r0 = "question_max_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r2.A1D()
            r5.A03 = r0
            goto L_0x004f
        L_0x00a9:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004f
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004f
            r5.A0D = r0
            goto L_0x004f
        L_0x00c2:
            java.lang.String r0 = "question_text_size"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A01 = r0
            goto L_0x004f
        L_0x00d3:
            java.lang.String r0 = "second_option_string"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004f
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004f
            r5.A0C = r0
            goto L_0x004f
        L_0x00ed:
            java.lang.String r0 = "second_option_text_size"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A02 = r0
            goto L_0x004f
        L_0x00fe:
            java.lang.String r0 = "question"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r5.A0B = r0
            goto L_0x004f
        L_0x010e:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r5.A08 = r0
            goto L_0x004f
        L_0x0122:
            java.lang.String r0 = "question_padding_bottom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r2.A1D()
            r5.A04 = r0
            goto L_0x004f
        L_0x0132:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            int r0 = r2.A1D()
            r5.A05 = r0
            goto L_0x004f
        L_0x0142:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004f
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004f
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x004f
            r5.A09 = r0
            goto L_0x004f
        L_0x0162:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0167:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRK.invoke(X.16F):java.lang.Object");
    }
}
