package X;

public final class WRD implements AnonymousClass1FD {
    public static final WRD A00 = new WRD();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r14) {
        /*
            r13 = this;
            r10 = 0
            X.0qQ.A0B(r14, r10)
            r6 = 0
            java.lang.String r7 = X.AnonymousClass7TG.A0j()
            X.Uxr r5 = X.C16597Uxr.UNKNOWN
            X.0sn r9 = X.0sn.A00
            X.Uxc r4 = X.C16582Uxc.DYNAMIC_REVEAL
            X.UOY r3 = new X.UOY
            r8 = r6
            r11 = r10
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0027
            java.lang.String r1 = "JSON string for MediaKaraokeCaptionSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            X.16L r1 = r14.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0181
            java.lang.String r1 = X.AnonymousClass7TE.A17(r14)
            if (r1 == 0) goto L_0x017c
            int r0 = r1.hashCode()
            switch(r0) {
                case -2115337775: goto L_0x016c;
                case -2030994180: goto L_0x014c;
                case -1992012396: goto L_0x013c;
                case -1985806860: goto L_0x012c;
                case -1833386028: goto L_0x0108;
                case -1475936846: goto L_0x00f8;
                case -1226035186: goto L_0x00e8;
                case -1203619573: goto L_0x00d4;
                case -1195408547: goto L_0x00c4;
                case -868186726: goto L_0x009e;
                case 3601339: goto L_0x0085;
                case 94842723: goto L_0x0076;
                case 1260322998: goto L_0x0067;
                case 1776071171: goto L_0x0058;
                case 2036780306: goto L_0x0049;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaKaraokeCaptionStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0045:
            r14.A0z()
            goto L_0x0027
        L_0x0049:
            java.lang.String r0 = "background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = X.C13989Tnp.A0o(r14)
            r3.A0A = r0
            goto L_0x0045
        L_0x0058:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.ULH r0 = X.C13988Tno.A0N(r14)
            r3.A05 = r0
            goto L_0x0045
        L_0x0067:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.ULw r0 = X.C13988Tno.A0H(r14)
            r3.A04 = r0
            goto L_0x0045
        L_0x0076:
            java.lang.String r0 = "color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r14.A1D()
            r3.A00 = r0
            goto L_0x0045
        L_0x0085:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = r14.A1P()
            if (r0 == 0) goto L_0x0045
            r3.A0D = r0
            goto L_0x0045
        L_0x009e:
            java.lang.String r0 = "tokens"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00c1
        L_0x00b3:
            X.16L r1 = r14.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00c1
            X.WR2 r0 = X.WR2.A00
            X.C13988Tno.A1I(r14, r0, r2)
            goto L_0x00b3
        L_0x00c1:
            r3.A0E = r2
            goto L_0x0045
        L_0x00c4:
            java.lang.String r0 = "sticker_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = X.C13989Tnp.A0o(r14)
            r3.A0B = r0
            goto L_0x0045
        L_0x00d4:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r14, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r3.A06 = r0
            goto L_0x0045
        L_0x00e8:
            java.lang.String r0 = "emphasis_state"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r14.A1D()
            r3.A02 = r0
            goto L_0x0045
        L_0x00f8:
            java.lang.String r0 = "is_clips_v2_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r14)
            r3.A09 = r0
            goto L_0x0045
        L_0x0108:
            java.lang.String r0 = "karaoke_sticker_display_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r1 = r14.A1P()
            if (r1 == 0) goto L_0x0045
            java.util.Map r0 = X.C16582Uxc.A01
            java.lang.Object r0 = r0.get(r1)
            X.Uxc r0 = (X.C16582Uxc) r0
            if (r0 == 0) goto L_0x0045
            r3.A07 = r0
            goto L_0x0045
        L_0x012c:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r14.A1D()
            r3.A03 = r0
            goto L_0x0045
        L_0x013c:
            java.lang.String r0 = "duration"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r14.A1D()
            r3.A01 = r0
            goto L_0x0045
        L_0x014c:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = r14.A1P()
            if (r0 == 0) goto L_0x0045
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0045
            r3.A08 = r0
            goto L_0x0045
        L_0x016c:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = X.C13989Tnp.A0o(r14)
            r3.A0C = r0
            goto L_0x0045
        L_0x017c:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0181:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRD.invoke(X.16F):java.lang.Object");
    }
}
