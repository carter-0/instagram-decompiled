package X;

public final class WRL implements AnonymousClass1FD {
    public static final WRL A00 = new WRL();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r22) {
        /*
            r21 = this;
            r0 = 0
            r2 = r22
            X.0qQ.A0B(r2, r0)
            r5 = 0
            r18 = 16383(0x3fff, float:2.2957E-41)
            X.UOX r4 = new X.UOX
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r0
            r19 = r0
            r20 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0030
            java.lang.String r1 = "JSON string for MediaPollV2Sticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0193
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x018e
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x016e;
                case -1985806860: goto L_0x015e;
                case -1543665910: goto L_0x0137;
                case -1463231774: goto L_0x0127;
                case -1203619573: goto L_0x0113;
                case -1165870106: goto L_0x0103;
                case -897309819: goto L_0x00da;
                case -397914725: goto L_0x00c0;
                case 3601339: goto L_0x00a7;
                case 94842723: goto L_0x008e;
                case 1093411206: goto L_0x007f;
                case 1124422903: goto L_0x0070;
                case 1260322998: goto L_0x0061;
                case 1776071171: goto L_0x0052;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaPollV2StickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x004e:
            r2.A0z()
            goto L_0x0030
        L_0x0052:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A02 = r0
            goto L_0x004e
        L_0x0061:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A01 = r0
            goto L_0x004e
        L_0x0070:
            java.lang.String r0 = "viewer_vote"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A05 = r0
            goto L_0x004e
        L_0x007f:
            java.lang.String r0 = "viewer_can_vote"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2.A0d()
            r4.A0D = r0
            goto L_0x004e
        L_0x008e:
            java.lang.String r0 = "color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004e
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004e
            r4.A06 = r0
            goto L_0x004e
        L_0x00a7:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004e
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004e
            r4.A09 = r0
            goto L_0x004e
        L_0x00c0:
            java.lang.String r0 = "poll_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x004e
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x004e
            r4.A07 = r0
            goto L_0x004e
        L_0x00da:
            java.lang.String r0 = "option_tally_ratios"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00ff
        L_0x00ef:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00ff
            int r0 = r2.A1D()
            X.AnonymousClass7TF.A1M(r3, r0)
            goto L_0x00ef
        L_0x00ff:
            r4.A0A = r3
            goto L_0x004e
        L_0x0103:
            java.lang.String r0 = "question"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A08 = r0
            goto L_0x004e
        L_0x0113:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A03 = r0
            goto L_0x004e
        L_0x0127:
            java.lang.String r0 = "is_shared_result"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2.A0d()
            r4.A0C = r0
            goto L_0x004e
        L_0x0137:
            java.lang.String r0 = "tallies"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x015a
        L_0x014c:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x015a
            X.WRM r0 = X.WRM.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x014c
        L_0x015a:
            r4.A0B = r3
            goto L_0x004e
        L_0x015e:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x004e
        L_0x016e:
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
            r4.A04 = r0
            goto L_0x004e
        L_0x018e:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0193:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRL.invoke(X.16F):java.lang.Object");
    }
}
