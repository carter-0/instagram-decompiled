package X;

public final class WRV implements AnonymousClass1FD {
    public static final WRV A00 = new WRV();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.Uwo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Ux1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.UxM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.9sR} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r36) {
        /*
            r35 = this;
            r0 = 0
            r2 = r36
            X.0qQ.A0B(r2, r0)
            r6 = 0
            r20 = 0
            r32 = 134217727(0x7ffffff, float:3.8518597E-34)
            X.UOg r5 = new X.UOg
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r21 = r20
            r22 = r20
            r23 = r20
            r24 = r20
            r25 = r20
            r26 = r20
            r27 = r0
            r28 = r0
            r29 = r0
            r30 = r0
            r31 = r0
            r33 = r0
            r34 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x004c
            java.lang.String r1 = "JSON string for MediaTextSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x004c:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x02a5
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x02a0
            int r0 = r1.hashCode()
            r3 = 0
            switch(r0) {
                case -2115337775: goto L_0x0290;
                case -2111778553: goto L_0x0280;
                case -2060609828: goto L_0x025e;
                case -2030994180: goto L_0x023e;
                case -1985806860: goto L_0x022e;
                case -1798207542: goto L_0x021d;
                case -1798207541: goto L_0x020c;
                case -1783100079: goto L_0x01ea;
                case -1756466470: goto L_0x01d9;
                case -1530233576: goto L_0x01c9;
                case -1468661111: goto L_0x01a7;
                case -1238804110: goto L_0x0193;
                case -1206429896: goto L_0x0182;
                case -1203619573: goto L_0x016e;
                case -1037596717: goto L_0x015d;
                case -815970172: goto L_0x0136;
                case -747230934: goto L_0x0125;
                case -699157868: goto L_0x0115;
                case 3556653: goto L_0x0105;
                case 3601339: goto L_0x00eb;
                case 1173911478: goto L_0x00ca;
                case 1207469959: goto L_0x00bb;
                case 1260322998: goto L_0x00ac;
                case 1384488471: goto L_0x009c;
                case 1676921617: goto L_0x008d;
                case 1741994094: goto L_0x007e;
                case 1776071171: goto L_0x006f;
                default: goto L_0x0062;
            }
        L_0x0062:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaTextStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x006b:
            r2.A0z()
            goto L_0x004c
        L_0x006f:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r5.A0E = r0
            goto L_0x006b
        L_0x007e:
            java.lang.String r0 = "truncation_max_lines"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r0 = r2.A1D()
            r5.A0B = r0
            goto L_0x006b
        L_0x008d:
            java.lang.String r0 = "is_story_text_drawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r2.A0d()
            r5.A0Q = r0
            goto L_0x006b
        L_0x009c:
            java.lang.String r0 = "line_spacing_mult"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A02 = r0
            goto L_0x006b
        L_0x00ac:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r5.A0D = r0
            goto L_0x006b
        L_0x00bb:
            java.lang.String r0 = "truncation_suffix"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r5.A0M = r0
            goto L_0x006b
        L_0x00ca:
            java.lang.String r0 = "animation_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x00e8
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x00e8
            java.util.Map r0 = X.C391159sR.A01
            java.lang.Object r3 = r0.get(r1)
            X.9sR r3 = (X.C391159sR) r3
        L_0x00e8:
            r5.A0H = r3
            goto L_0x006b
        L_0x00eb:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x006b
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x006b
            r5.A0N = r0
            goto L_0x006b
        L_0x0105:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r5.A0L = r0
            goto L_0x006b
        L_0x0115:
            java.lang.String r0 = "safe_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r0 = r2.A1D()
            r5.A07 = r0
            goto L_0x006b
        L_0x0125:
            java.lang.String r0 = "letter_spacing"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A00 = r0
            goto L_0x006b
        L_0x0136:
            java.lang.String r0 = "span_metadata"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0159
        L_0x014b:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0159
            X.WRd r0 = X.C19244WRd.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x014b
        L_0x0159:
            r5.A0O = r3
            goto L_0x006b
        L_0x015d:
            java.lang.String r0 = "text_size"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A06 = r0
            goto L_0x006b
        L_0x016e:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r5.A0F = r0
            goto L_0x006b
        L_0x0182:
            java.lang.String r0 = "playback_duration"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A05 = r0
            goto L_0x006b
        L_0x0193:
            java.lang.String r0 = "shadow_layer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.WRc r0 = X.C19243WRc.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.GbN r0 = (X.C52710GbN) r0
            r5.A0C = r0
            goto L_0x006b
        L_0x01a7:
            java.lang.String r0 = "effect_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x01c5
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x01c5
            java.util.Map r0 = X.C16569UxM.A01
            java.lang.Object r3 = r0.get(r1)
            X.UxM r3 = (X.C16569UxM) r3
        L_0x01c5:
            r5.A0I = r3
            goto L_0x006b
        L_0x01c9:
            java.lang.String r0 = "is_animated"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r2.A0d()
            r5.A0P = r0
            goto L_0x006b
        L_0x01d9:
            java.lang.String r0 = "line_spacing_add"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A01 = r0
            goto L_0x006b
        L_0x01ea:
            java.lang.String r0 = "text_alignment"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0208
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x0208
            java.util.Map r0 = X.C16554Ux1.A01
            java.lang.Object r3 = r0.get(r1)
            X.Ux1 r3 = (X.C16554Ux1) r3
        L_0x0208:
            r5.A0G = r3
            goto L_0x006b
        L_0x020c:
            java.lang.String r0 = "padding_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A04 = r0
            goto L_0x006b
        L_0x021d:
            java.lang.String r0 = "padding_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A03 = r0
            goto L_0x006b
        L_0x022e:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r0 = r2.A1D()
            r5.A08 = r0
            goto L_0x006b
        L_0x023e:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x006b
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x006b
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x006b
            r5.A0K = r0
            goto L_0x006b
        L_0x025e:
            java.lang.String r0 = "drawable_source"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x027c
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x027c
            java.util.Map r0 = X.C16543Uwo.A01
            java.lang.Object r3 = r0.get(r1)
            X.Uwo r3 = (X.C16543Uwo) r3
        L_0x027c:
            r5.A0J = r3
            goto L_0x006b
        L_0x0280:
            java.lang.String r0 = "text_effect_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r0 = r2.A1D()
            r5.A0A = r0
            goto L_0x006b
        L_0x0290:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r0 = r2.A1D()
            r5.A09 = r0
            goto L_0x006b
        L_0x02a0:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x02a5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRV.invoke(X.16F):java.lang.Object");
    }
}
