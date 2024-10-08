package X;

import java.util.HashMap;

/* renamed from: X.6Q2  reason: invalid class name */
public abstract class AnonymousClass6Q2 {
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0259, code lost:
        if (r8 != false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0286, code lost:
        r2 = A01(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r0 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        r2.put("option_value", java.lang.String.valueOf(r6 + r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(com.instagram.common.session.UserSession r10, X.C255773uh r11, X.C250973mM r12, X.AnonymousClass3BQ r13, X.C309426Yf r14) {
        /*
            r5 = 4
            com.instagram.model.reels.Reel r4 = r12.A0H
            java.lang.String r0 = r11.A0j
            X.0qQ.A07(r0)
            int r0 = r12.A04(r10, r0)
            java.util.Map r0 = r4.A0P(r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0020:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            X.3mK r2 = (X.C250953mK) r2
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r2 == 0) goto L_0x0041
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0053;
                case 3: goto L_0x00bd;
                case 4: goto L_0x0274;
                case 5: goto L_0x0261;
                case 6: goto L_0x0201;
                case 7: goto L_0x01d9;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01ed;
                case 10: goto L_0x009f;
                case 11: goto L_0x0041;
                case 12: goto L_0x0041;
                case 13: goto L_0x0041;
                case 14: goto L_0x01b1;
                case 15: goto L_0x019d;
                case 16: goto L_0x0183;
                case 17: goto L_0x0156;
                case 18: goto L_0x0142;
                case 19: goto L_0x0125;
                case 20: goto L_0x0103;
                case 21: goto L_0x00e6;
                default: goto L_0x0041;
            }
        L_0x0041:
            X.0qQ.A0A(r2)
            X.0qQ.A0A(r1)
            int r0 = r1.intValue()
            java.util.HashMap r2 = A01(r2, r0)
        L_0x004f:
            r3.add(r2)
            goto L_0x0020
        L_0x0053:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0 = 23
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "optimization_type"
            r2.put(r0, r1)
            java.util.List r0 = X.C250973mM.A00(r10, r12)
            int r6 = r0.size()
            int r1 = r4.A00
            boolean r0 = r4.A17(r10)
            if (r0 == 0) goto L_0x007a
            if (r1 < 0) goto L_0x007a
            int r0 = r1 + 1
            if (r0 >= r6) goto L_0x007a
            r6 = r0
        L_0x007a:
            r0 = 230000(0x38270, float:3.22299E-40)
            goto L_0x00d8
        L_0x007e:
            X.3mK r2 = X.C250953mK.HEADLINE_TYPE
            X.6LR r1 = r11.A0H()
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0097
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0097
            boolean r0 = r1.A09
            r1 = 220001(0x35b61, float:3.08287E-40)
            if (r0 != 0) goto L_0x009a
        L_0x0097:
            r1 = 220002(0x35b62, float:3.08288E-40)
        L_0x009a:
            java.util.HashMap r2 = A01(r2, r1)
            goto L_0x004f
        L_0x009f:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0 = 98
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "optimization_type"
            r2.put(r0, r1)
            java.util.List r0 = r4.A17
            if (r0 == 0) goto L_0x00bb
            int r6 = r0.size()
        L_0x00b7:
            r0 = 980000(0xef420, float:1.373272E-39)
            goto L_0x00d8
        L_0x00bb:
            r6 = 1
            goto L_0x00b7
        L_0x00bd:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0 = 44
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "optimization_type"
            r2.put(r0, r1)
            java.util.List r0 = r4.A17
            if (r0 == 0) goto L_0x00e4
            int r6 = r0.size()
        L_0x00d5:
            r0 = 440000(0x6b6c0, float:6.16571E-40)
        L_0x00d8:
            int r6 = r6 + r0
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "option_value"
            r2.put(r0, r1)
            goto L_0x004f
        L_0x00e4:
            r6 = 1
            goto L_0x00d5
        L_0x00e6:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            java.util.List r7 = r4.A0w
            X.3mK r2 = X.C250953mK.IG_STORY_LEADGEN_CARD
            r1 = 1
            if (r7 == 0) goto L_0x00fe
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r0 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.LEADGEN
            boolean r0 = r7.contains(r0)
            if (r0 != r1) goto L_0x00fe
            goto L_0x0286
        L_0x00fe:
            r6 = 1710001(0x1a17b1, float:2.396222E-39)
            goto L_0x0286
        L_0x0103:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.TEXT_ALIGNMENT
            X.1Xj r0 = r11.A0b
            if (r0 == 0) goto L_0x0120
            X.1Xy r0 = r0.A0C
            X.560 r0 = r0.C5H()
            if (r0 == 0) goto L_0x0120
            com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum r0 = r0.C4r()
            if (r0 == 0) goto L_0x0120
            goto L_0x0286
        L_0x0120:
            r6 = 1680001(0x19a281, float:2.354183E-39)
            goto L_0x0286
        L_0x0125:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            java.util.List r7 = r4.A0w
            X.3mK r2 = X.C250953mK.IG_GENERIC_PROFILE_CARD
            r1 = 1
            if (r7 == 0) goto L_0x013d
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r0 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.GENERIC_CARD
            boolean r0 = r7.contains(r0)
            if (r0 != r1) goto L_0x013d
            goto L_0x0286
        L_0x013d:
            r6 = 1390001(0x1535b1, float:1.947806E-39)
            goto L_0x0286
        L_0x0142:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.IG_STORY_COLLECTION_CARD
            boolean r0 = r11.A1A()
            if (r0 != 0) goto L_0x0286
            r6 = 1340001(0x147261, float:1.877741E-39)
            goto L_0x0286
        L_0x0156:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.6LR r1 = r11.A0G()
            r0 = 0
            if (r1 == 0) goto L_0x0166
            java.lang.String r0 = r1.A06
        L_0x0166:
            r1 = 0
            if (r0 == 0) goto L_0x017a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x017a
            X.6LR r0 = r11.A0G()
            if (r0 == 0) goto L_0x017a
            X.4fn r0 = r0.A01
            if (r0 == 0) goto L_0x017a
            r1 = 1
        L_0x017a:
            X.3mK r2 = X.C250953mK.IG_KEYWORD_EXTRACTION_AND_HIGHLIGHT
            if (r1 != 0) goto L_0x0286
            r6 = 1310001(0x13fd31, float:1.835702E-39)
            goto L_0x0286
        L_0x0183:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.TEXT_FONT_COLOR_TYPE
            X.6LR r0 = r11.A0G()
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0198
            goto L_0x0286
        L_0x0198:
            r6 = 1250001(0x1312d1, float:1.751624E-39)
            goto L_0x0286
        L_0x019d:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.IG_CV_TRANSFORMATION_TYPE
            boolean r0 = r11.A1m()
            if (r0 != 0) goto L_0x0286
            r6 = 1220001(0x129da1, float:1.709586E-39)
            goto L_0x0286
        L_0x01b1:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            boolean r0 = X.C297785sK.A0f(r11)
            if (r0 != 0) goto L_0x01c1
            r6 = 1130001(0x113e11, float:1.583469E-39)
        L_0x01c1:
            X.3mK r2 = X.C250953mK.SMART_CAPTION_TYPE
            goto L_0x0286
        L_0x01c5:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.IG_GLADOS_VIDEO
            boolean r0 = X.C297785sK.A0c(r11)
            if (r0 != 0) goto L_0x0286
            r6 = 800001(0xc3501, float:1.12104E-39)
            goto L_0x0286
        L_0x01d9:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.END_SCENE_TYPE
            boolean r0 = X.C297785sK.A0k(r11, r12, r13, r14)
            if (r0 != 0) goto L_0x0286
            r6 = 780001(0xbe6e1, float:1.093014E-39)
            goto L_0x0286
        L_0x01ed:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.CAPTION_LENGTH_OPTIMIZATION_TYPE
            boolean r0 = X.C297785sK.A0j(r11, r12)
            if (r0 != 0) goto L_0x0286
            r6 = 840001(0xcd141, float:1.177092E-39)
            goto L_0x0286
        L_0x0201:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            r7 = 1
            java.util.List r1 = r4.A0w
            X.3mK r2 = X.C250953mK.CAPTION_CARD_TYPE
            if (r1 == 0) goto L_0x0218
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r0 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.CAPTION
            boolean r0 = r1.contains(r0)
            if (r0 != r7) goto L_0x0218
            goto L_0x0286
        L_0x0218:
            X.6LR r0 = r11.A0G()
            if (r0 == 0) goto L_0x025b
            X.6LR r0 = r11.A0G()
            if (r0 == 0) goto L_0x025f
            java.lang.String r6 = r0.A06
        L_0x0226:
            float r1 = r11.A00()
            r0 = 1058180956(0x3f128f5c, float:0.5725)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r8 = 0
            if (r0 > 0) goto L_0x0233
            r8 = 1
        L_0x0233:
            if (r6 == 0) goto L_0x025b
            int r7 = r6.length()
            if (r7 == 0) goto L_0x025b
            java.util.regex.Pattern r0 = X.0mp.A00
            r0 = 400(0x190, float:5.6E-43)
            if (r7 > r0) goto L_0x0256
            r0 = 100
            r1 = 0
            if (r7 < r0) goto L_0x025b
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r6, r0, r1)
            int r0 = r0.size()
            if (r0 <= r5) goto L_0x025b
        L_0x0256:
            r6 = 660005(0xa1225, float:9.24864E-40)
            if (r8 == 0) goto L_0x0286
        L_0x025b:
            r6 = 660001(0xa1221, float:9.24858E-40)
            goto L_0x0286
        L_0x025f:
            r6 = 0
            goto L_0x0226
        L_0x0261:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.SHOWREEL_NATIVE_TYPE
            boolean r0 = X.C297785sK.A0d(r11)
            if (r0 != 0) goto L_0x0286
            r6 = 650001(0x9eb11, float:9.10845E-40)
            goto L_0x0286
        L_0x0274:
            X.0qQ.A0A(r1)
            int r6 = r1.intValue()
            X.3mK r2 = X.C250953mK.IG_STORY_IMAGE_CROP
            boolean r0 = X.C297785sK.A0Y(r11)
            if (r0 != 0) goto L_0x0286
            r6 = 520001(0x7ef41, float:7.28677E-40)
        L_0x0286:
            java.util.HashMap r2 = A01(r2, r6)
            goto L_0x004f
        L_0x028c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Q2.A00(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6Yf):java.util.ArrayList");
    }

    public static final HashMap A01(C250953mK r3, int i) {
        0qQ.A0B(r3, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("optimization_type", String.valueOf(r3.A00));
        hashMap.put("option_value", String.valueOf(i));
        return hashMap;
    }
}
