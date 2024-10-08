package X;

public abstract class VFE {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r1 = (r1 + (r0 = X.Pxd.A00(785)).length()) + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r1 = (r1 + "Iptc4xmpExt:DigitalSourceType".length()) + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r1.endsWith("compositeSynthetic") != false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r10, X.AnonymousClass3Q2 r11) {
        /*
            r5 = 0
            r2 = 1
            com.instagram.api.schemas.MediaGenAIDetectionMethod r6 = r11.A0w
            X.1iA r1 = r11.A1G
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x02c4
            com.instagram.api.schemas.MediaGenAIDetectionMethod r8 = com.instagram.api.schemas.MediaGenAIDetectionMethod.IPTC_METADATA
            if (r6 == r8) goto L_0x02c4
            com.instagram.api.schemas.MediaGenAIDetectionMethod r7 = com.instagram.api.schemas.MediaGenAIDetectionMethod.IPTC_METADATA_EDITED
            if (r6 == r7) goto L_0x02c4
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = com.instagram.api.schemas.MediaGenAIDetectionMethod.C2PA_METADATA
            if (r6 == r4) goto L_0x02c4
            com.instagram.api.schemas.MediaGenAIDetectionMethod r3 = com.instagram.api.schemas.MediaGenAIDetectionMethod.C2PA_METADATA_EDITED
            if (r6 == r3) goto L_0x02c4
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = com.instagram.api.schemas.MediaGenAIDetectionMethod.SELF_DISCLOSURE_FLOW
            if (r6 != r0) goto L_0x0024
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r11.A1w = r0
        L_0x0024:
            java.util.HashMap r1 = r11.A44
            if (r1 == 0) goto L_0x00b0
            java.lang.String r0 = "xmp_data"
            java.lang.Object r9 = r1.get(r0)
            java.lang.String r9 = (java.lang.String) r9
        L_0x0030:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325570669196343(0x810dea00003437, double:3.0357753903077426E-306)
            boolean r0 = X.182.A06(r6, r10, r0)
            if (r0 == 0) goto L_0x0071
            if (r9 == 0) goto L_0x0071
            r0 = 785(0x311, float:1.1E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            int r1 = X.00l.A08(r9, r0, r5, r5)
            if (r1 < 0) goto L_0x005a
            int r0 = r0.length()
            int r1 = r1 + r0
            int r1 = r1 + 2
            r0 = 34
            int r0 = X.00l.A04(r9, r0, r1)
            if (r0 >= 0) goto L_0x0081
        L_0x005a:
            java.lang.String r0 = "Iptc4xmpExt:DigitalSourceType"
            int r1 = X.00l.A08(r9, r0, r5, r5)
            if (r1 < 0) goto L_0x0071
            int r0 = r0.length()
            int r1 = r1 + r0
            int r1 = r1 + 2
            r0 = 34
            int r0 = X.00l.A04(r9, r0, r1)
            if (r0 >= 0) goto L_0x0081
        L_0x0071:
            java.lang.String r7 = r11.A3L
            r0 = 36325570669261880(0x810dea00013438, double:3.0357753903491885E-306)
            boolean r0 = X.182.A06(r6, r10, r0)
            if (r0 == 0) goto L_0x02c4
            if (r7 == 0) goto L_0x02c4
            goto L_0x00b3
        L_0x0081:
            java.lang.String r1 = X.C51967G9n.A0q(r9, r1, r0)
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0B(r0, r2)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0097
            r11.A0w = r8
            goto L_0x0071
        L_0x0097:
            java.lang.String r0 = "compositeWithTrainedAlgorithmicMedia"
            X.0qQ.A0B(r0, r2)
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "compositeSynthetic"
            X.0qQ.A0B(r0, r2)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0071
        L_0x00ad:
            r11.A0w = r7
            goto L_0x0071
        L_0x00b0:
            r9 = 0
            goto L_0x0030
        L_0x00b3:
            java.lang.String r6 = com.truepic.lenssdkverify.LibC2PA.filenameGetC2PAJson(r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x00be
        L_0x00b8:
            r0 = move-exception
            X.0eQ r6 = new X.0eQ
            r6.<init>(r0)
        L_0x00be:
            boolean r1 = r6 instanceof X.0eQ
            r0 = 0
            if (r1 == 0) goto L_0x00c4
            r6 = r0
        L_0x00c4:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x02c4
            boolean r0 = X.00l.A0W(r6)
            if (r0 != 0) goto L_0x02c4
            r7 = 0
            X.3mC r1 = X.C250863mB.A03     // Catch:{ all -> 0x010e }
            kotlinx.serialization.json.JsonElementSerializer r0 = kotlinx.serialization.json.JsonElementSerializer.A00     // Catch:{ all -> 0x010e }
            java.lang.Object r0 = r1.A00(r6, r0)     // Catch:{ all -> 0x010e }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x010e }
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r0)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "manifest_store"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x010e }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x02c4
            kotlinx.serialization.json.JsonArray r0 = X.C271114hv.A02(r0)     // Catch:{ all -> 0x010e }
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ all -> 0x010e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x010e }
        L_0x00f3:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x010e }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x010e }
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)     // Catch:{ all -> 0x010e }
            r6.add(r0)     // Catch:{ all -> 0x010e }
            goto L_0x00f3
        L_0x0107:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0116
            goto L_0x0115
        L_0x010e:
            r0 = move-exception
            X.0eQ r6 = new X.0eQ
            r6.<init>(r0)
            goto L_0x0116
        L_0x0115:
            r6 = r7
        L_0x0116:
            boolean r0 = r6 instanceof X.0eQ
            if (r0 != 0) goto L_0x011b
            r7 = r6
        L_0x011b:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x02c4
            java.util.Iterator r7 = r7.iterator()
        L_0x0123:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r1 = r7.next()
            r6 = r1
            kotlinx.serialization.json.JsonObject r6 = (kotlinx.serialization.json.JsonObject) r6
            java.lang.String r0 = "ai"
            java.lang.Object r0 = r6.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0123
            kotlinx.serialization.json.JsonObject r6 = X.C271114hv.A03(r0)
            java.lang.String r0 = "contains_ai"
            java.lang.Object r0 = r6.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x015a
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            boolean r0 = X.C271114hv.A08(r0)
            if (r0 != r2) goto L_0x015a
        L_0x0152:
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            if (r1 == 0) goto L_0x02c4
            r11.A0w = r3
            r3 = 0
            goto L_0x0175
        L_0x015a:
            r0 = 313(0x139, float:4.39E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Object r0 = r6.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0123
            kotlinx.serialization.json.JsonPrimitive r0 = X.C271114hv.A06(r0)
            boolean r0 = X.C271114hv.A08(r0)
            if (r0 != r2) goto L_0x0123
            goto L_0x0152
        L_0x0173:
            r1 = 0
            goto L_0x0152
        L_0x0175:
            java.lang.String r0 = "assertions"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x019d }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x02c4
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "c2pa.actions"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x019d }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "actions"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x019d }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x0198
            return
        L_0x0198:
            kotlinx.serialization.json.JsonArray r1 = X.C271114hv.A02(r0)     // Catch:{ all -> 0x019d }
            goto L_0x01a3
        L_0x019d:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x01a3:
            boolean r0 = r1 instanceof X.0eQ
            if (r0 != 0) goto L_0x01a8
            r3 = r1
        L_0x01a8:
            kotlinx.serialization.json.JsonArray r3 = (kotlinx.serialization.json.JsonArray) r3
            if (r3 == 0) goto L_0x02c4
            r6 = 0
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r3)     // Catch:{ all -> 0x0226 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0226 }
        L_0x01b5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)     // Catch:{ all -> 0x0226 }
            r8.add(r0)     // Catch:{ all -> 0x0226 }
            goto L_0x01b5
        L_0x01c9:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0226 }
            r7.<init>()     // Catch:{ all -> 0x0226 }
            java.util.Iterator r9 = r8.iterator()     // Catch:{ all -> 0x0226 }
        L_0x01d2:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x021f
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1     // Catch:{ all -> 0x0226 }
            java.lang.String r0 = "data"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x01ee
            X.0sn r8 = X.0sn.A00     // Catch:{ all -> 0x0226 }
        L_0x01ea:
            X.018.A16(r8, r7)     // Catch:{ all -> 0x0226 }
            goto L_0x01d2
        L_0x01ee:
            kotlinx.serialization.json.JsonObject r1 = X.C271114hv.A03(r0)     // Catch:{ all -> 0x0226 }
            java.lang.String r0 = "actions"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x0226 }
            if (r0 != 0) goto L_0x01ff
            X.0sn r8 = X.0sn.A00     // Catch:{ all -> 0x0226 }
            goto L_0x01ea
        L_0x01ff:
            kotlinx.serialization.json.JsonArray r0 = X.C271114hv.A02(r0)     // Catch:{ all -> 0x0226 }
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r0)     // Catch:{ all -> 0x0226 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0226 }
        L_0x020b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x0226 }
            kotlinx.serialization.json.JsonObject r0 = X.C271114hv.A03(r0)     // Catch:{ all -> 0x0226 }
            r8.add(r0)     // Catch:{ all -> 0x0226 }
            goto L_0x020b
        L_0x021f:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x022e
            goto L_0x022d
        L_0x0226:
            r0 = move-exception
            X.0eQ r7 = new X.0eQ
            r7.<init>(r0)
            goto L_0x022e
        L_0x022d:
            r7 = r6
        L_0x022e:
            boolean r0 = r7 instanceof X.0eQ
            if (r0 != 0) goto L_0x0233
            r6 = r7
        L_0x0233:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x02b9
            boolean r0 = r6 instanceof java.util.Collection     // Catch:{ all -> 0x02a2 }
            r8 = 1
            if (r0 == 0) goto L_0x0243
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0243
            goto L_0x0268
        L_0x0243:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x0247:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0268
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x02a2 }
            kotlinx.serialization.json.JsonObject r6 = (kotlinx.serialization.json.JsonObject) r6     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "action"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x02a2 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x02a2 }
            r1 = 0
            if (r0 == 0) goto L_0x026e
            kotlinx.serialization.json.JsonPrimitive r1 = X.C271114hv.A06(r0)     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonNull     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x026a
            r1 = 0
            goto L_0x026e
        L_0x0268:
            r8 = 0
            goto L_0x029d
        L_0x026a:
            java.lang.String r1 = r1.A00()     // Catch:{ all -> 0x02a2 }
        L_0x026e:
            java.lang.String r0 = "c2pa.created"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = "digitalSourceType"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x02a2 }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0247
            kotlinx.serialization.json.JsonPrimitive r1 = X.C271114hv.A06(r0)     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonNull     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x0247
            java.lang.String r1 = r1.A00()     // Catch:{ all -> 0x02a2 }
            if (r1 == 0) goto L_0x0247
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x02a2 }
            X.0qQ.A0B(r0, r2)     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x02a2 }
            if (r0 != r2) goto L_0x0247
        L_0x029d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x02a2 }
            goto L_0x02a8
        L_0x02a2:
            r0 = move-exception
            X.0eQ r2 = new X.0eQ
            r2.<init>(r0)
        L_0x02a8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r2 instanceof X.0eQ
            if (r0 == 0) goto L_0x02b1
            r2 = r1
        L_0x02b1:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 == 0) goto L_0x02b9
            r11.A0w = r4
        L_0x02b9:
            java.lang.String r1 = r3.toString()
            X.Cst r0 = new X.Cst
            r0.<init>(r1)
            r11.A1S = r0
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VFE.A00(com.instagram.common.session.UserSession, X.3Q2):void");
    }
}
