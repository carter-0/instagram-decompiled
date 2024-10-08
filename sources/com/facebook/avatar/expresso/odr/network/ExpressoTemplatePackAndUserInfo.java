package com.facebook.avatar.expresso.odr.network;

import X.0qQ;

public final class ExpressoTemplatePackAndUserInfo {
    static {
        0qQ.A07(ExpressoTemplatePackAndUserInfo.class.getName());
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r27, java.lang.String r28, java.util.List r29, X.AnonymousClass4D7 r30) {
        /*
            r26 = this;
            r3 = 22
            r6 = r30
            boolean r0 = X.C66144MDw.A02(r3, r6)
            r5 = r26
            if (r0 == 0) goto L_0x00c1
            r4 = r6
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c1
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x006c
            if (r1 != r0) goto L_0x02f9
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0043
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r0 = r2.A00
            r0.toString()
            java.lang.String r0 = r0.toString()
            X.JrK r1 = new X.JrK
            r1.<init>(r0)
        L_0x003e:
            X.5sO r3 = X.C41845B3m.A0c(r1)
            return r3
        L_0x0043:
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x02f4
            X.3lr r1 = X.C41846B3n.A0R(r2)
            if (r1 == 0) goto L_0x0060
            java.lang.Class<X.UQZ> r5 = X.UQZ.class
            r4 = 0
            r2 = 292(0x124, float:4.09E-43)
            java.lang.String r3 = X.Pxd.A00(r2)
            r2 = -1339240641(0xffffffffb02ccf3f, float:-6.286775E-10)
            X.3lr r7 = r1.getOptionalTreeField(r4, r3, r5, r2)
            if (r7 == 0) goto L_0x0060
            goto L_0x00c8
        L_0x0060:
            r0 = 62
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.JrL r1 = new X.JrL
            r1.<init>(r0)
            goto L_0x003e
        L_0x006c:
            X.0eS.A00(r2)
            X.1vn r2 = X.1vm.A01(r27)
            r13 = 0
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            java.lang.String r1 = "template_pack_name"
            r6 = r28
            boolean r7 = X.C41848B3p.A1Z(r9, r1, r6)
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r29)
            java.lang.String r1 = "media_template_ids"
            r9.A05(r1, r6)
            boolean r1 = X.AnonymousClass7TF.A1V(r6)
            X.17k.A0E(r7)
            X.1vR r7 = X.C41845B3m.A06(r1)
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.QWg> r11 = X.C7769QWg.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "ExpressoTemplatePackAndUserInfoQuery"
            r12 = 0
            r1 = 292(0x124, float:4.09E-43)
            java.lang.String r16 = X.Pxd.A00(r1)
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A01 = r5
            r4.A00 = r0
            java.lang.Object r2 = r2.A04(r6, r4)
            if (r2 != r3) goto L_0x0028
            return r3
        L_0x00c1:
            X.MDw r4 = new X.MDw
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x00c8:
            java.lang.String r2 = "config"
            java.lang.String r2 = r7.A09(r2)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x01a4
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            r6.<init>(r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x00d5:
            r2 = 4176(0x1050, float:5.852E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r16 = r7.getOptionalStringField(r4, r2)     // Catch:{ JSONException -> 0x02e8 }
            r2 = 39
            java.lang.String r8 = X.Pxd.A00(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r17 = r7.getOptionalStringField(r0, r8)     // Catch:{ JSONException -> 0x02e8 }
            r2 = 4479(0x117f, float:6.276E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r18 = r7.A0A(r2)     // Catch:{ JSONException -> 0x02e8 }
            r2 = 4
            r3 = 3444(0xd74, float:4.826E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ JSONException -> 0x02e8 }
            boolean r25 = r7.getCoercedBooleanField(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4 = 5
            java.lang.String r3 = "lod"
            int r22 = r7.getCoercedIntField(r4, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4 = 6
            java.lang.String r3 = "texture_size"
            int r23 = r7.getCoercedIntField(r4, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4 = 7
            r3 = 2656(0xa60, float:3.722E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r19 = r7.getOptionalStringField(r4, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4 = 8
            r3 = 4548(0x11c4, float:6.373E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ JSONException -> 0x02e8 }
            int r24 = r7.getCoercedIntField(r4, r3)     // Catch:{ JSONException -> 0x02e8 }
            X.5kA r5 = X.C293115kA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ JSONException -> 0x02e8 }
            r4 = 9
            java.lang.String r3 = "avatar_style"
            java.lang.Enum r3 = r7.getOptionalEnumField(r4, r3, r5)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r20 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x02e8 }
            X.JrQ r15 = new X.JrQ     // Catch:{ JSONException -> 0x02e8 }
            r21 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x02e8 }
            java.util.LinkedHashMap r14 = X.AnonymousClass7TE.A1H()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Class<X.QWf> r5 = X.C7768QWf.class
            r3 = 934(0x3a6, float:1.309E-42)
            java.lang.String r3 = X.Pxd.A00(r3)     // Catch:{ JSONException -> 0x02e8 }
            r4 = -133516981(0xfffffffff80ab14b, float:-1.1252076E34)
            X.3lr r11 = r1.getOptionalTreeField(r0, r3, r5, r4)     // Catch:{ JSONException -> 0x02e8 }
            if (r11 == 0) goto L_0x01a7
            java.lang.Class<X.QWe> r10 = X.C7767QWe.class
            r9 = 5
            r6 = 897(0x381, float:1.257E-42)
            java.lang.String r6 = X.Pxd.A00(r6)     // Catch:{ JSONException -> 0x02e8 }
            r7 = -1829502800(0xffffffff92f400b0, float:-1.5398734E-27)
            com.google.common.collect.ImmutableList r6 = r11.getRequiredCompactedTreeListField(r9, r6, r10, r7)     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x01a7
            java.util.Iterator r9 = r6.iterator()     // Catch:{ JSONException -> 0x02e8 }
        L_0x0163:
            boolean r6 = r9.hasNext()     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x01a7
            X.3lr r7 = X.C41845B3m.A0V(r9)     // Catch:{ JSONException -> 0x02e8 }
            r6 = 801(0x321, float:1.122E-42)
            java.lang.String r6 = X.Pxd.A00(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r17 = r7.A07(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "instruction_key_id"
            java.lang.String r18 = r7.getOptionalStringField(r0, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "stable_id"
            java.lang.String r19 = r7.A09(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "media_template_name"
            java.lang.String r20 = r7.A0A(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "media_template_id"
            java.lang.String r21 = r7.A0B(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "accessibility_label"
            java.lang.String r22 = r7.A0C(r6)     // Catch:{ JSONException -> 0x02e8 }
            X.JrP r6 = new X.JrP     // Catch:{ JSONException -> 0x02e8 }
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r7 = r6.A02     // Catch:{ JSONException -> 0x02e8 }
            if (r7 == 0) goto L_0x0163
            r14.put(r7, r6)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0163
        L_0x01a4:
            r6 = 0
            goto L_0x00d5
        L_0x01a7:
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()     // Catch:{ JSONException -> 0x02e8 }
            X.3lr r10 = r1.getOptionalTreeField(r0, r3, r5, r4)     // Catch:{ JSONException -> 0x02e8 }
            if (r10 == 0) goto L_0x0237
            java.lang.Class<X.QWd> r9 = X.C7766QWd.class
            java.lang.String r7 = "scene_data"
            r6 = 1319569435(0x4ea7081b, float:1.40116314E9)
            com.google.common.collect.ImmutableList r6 = r10.getRequiredCompactedTreeListField(r2, r7, r9, r6)     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x0237
            java.util.Iterator r16 = r6.iterator()     // Catch:{ JSONException -> 0x02e8 }
        L_0x01c2:
            boolean r6 = r16.hasNext()     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x0237
            X.3lr r12 = X.C41845B3m.A0V(r16)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "media_template_id"
            java.lang.String r11 = r12.A07(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r7 = "Required value was null."
            if (r11 == 0) goto L_0x022d
            java.lang.String r18 = r12.A07(r6)     // Catch:{ JSONException -> 0x02e8 }
            if (r18 == 0) goto L_0x0228
            java.lang.String r6 = "camera"
            java.lang.String r6 = r12.getOptionalStringField(r0, r6)     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x0223
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            r10.<init>(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "lights"
            java.lang.String r6 = r12.A09(r6)     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x021e
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            r9.<init>(r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r6 = "pose"
            java.lang.String r19 = r12.A0A(r6)     // Catch:{ JSONException -> 0x02e8 }
            if (r19 == 0) goto L_0x0232
            java.lang.String r6 = "fps"
            int r22 = r12.getCoercedIntField(r2, r6)     // Catch:{ JSONException -> 0x02e8 }
            r7 = 5
            r6 = 706(0x2c2, float:9.9E-43)
            java.lang.String r6 = X.C273654mx.A00(r6)     // Catch:{ JSONException -> 0x02e8 }
            int r23 = r12.getCoercedIntField(r7, r6)     // Catch:{ JSONException -> 0x02e8 }
            X.LG2 r6 = new X.LG2     // Catch:{ JSONException -> 0x02e8 }
            r20 = r10
            r21 = r9
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x02e8 }
            r13.put(r11, r6)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x01c2
        L_0x021e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0236
        L_0x0223:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0236
        L_0x0228:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0236
        L_0x022d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0236
        L_0x0232:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0236:
            throw r0     // Catch:{ JSONException -> 0x02e8 }
        L_0x0237:
            X.3lr r1 = r1.getOptionalTreeField(r0, r3, r5, r4)     // Catch:{ JSONException -> 0x02e8 }
            if (r1 == 0) goto L_0x0248
            java.lang.String r8 = r1.A07(r8)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r3 = "media_template_ids"
            com.google.common.collect.ImmutableList r10 = r1.getRequiredCompactedStringListField(r0, r3)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x024a
        L_0x0248:
            r8 = 0
            r10 = 0
        L_0x024a:
            if (r1 == 0) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r5 = 0
            goto L_0x025a
        L_0x024f:
            java.lang.Class<X.QWc> r5 = X.C7765QWc.class
            java.lang.String r4 = "output_spec"
            r3 = -746330514(0xffffffffd383e66e, float:-1.13301337E12)
            X.3lr r5 = r1.A04(r5, r4, r3)     // Catch:{ JSONException -> 0x02e8 }
        L_0x025a:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x02e8 }
            if (r5 == 0) goto L_0x027f
            java.lang.Class<X.QWb> r7 = X.C7764QWb.class
            java.lang.String r6 = "format"
            r4 = 1293584469(0x4d1a8855, float:1.6203912E8)
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r2, r6, r7, r4)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x0286
            java.util.Iterator r4 = r2.iterator()     // Catch:{ JSONException -> 0x02e8 }
        L_0x0271:
            boolean r2 = r4.hasNext()     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x0286
            java.lang.Object r2 = r4.next()     // Catch:{ JSONException -> 0x02e8 }
            X.DbU.A1X(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0271
        L_0x027f:
            r18 = 0
            r17 = r18
            r0 = r18
            goto L_0x029c
        L_0x0286:
            java.lang.String r2 = "id"
            java.lang.String r17 = r5.A07(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "name"
            java.lang.String r18 = r5.getOptionalStringField(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = "width"
            int r0 = r5.A00(r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x029c:
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x02e3
            int r20 = r0.intValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r5 == 0) goto L_0x02de
            r2 = 3
            java.lang.String r0 = "height"
            int r21 = r5.getCoercedIntField(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x02de
            java.util.List r19 = X.00k.A0a(r3)     // Catch:{ JSONException -> 0x02e8 }
            X.JrN r7 = new X.JrN     // Catch:{ JSONException -> 0x02e8 }
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x02e8 }
            if (r1 == 0) goto L_0x02c1
            goto L_0x02c3
        L_0x02c1:
            r9 = 0
            goto L_0x02cd
        L_0x02c3:
            r0 = 745(0x2e9, float:1.044E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r9 = r1.getOptionalStringField(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02cd:
            X.JrO r6 = new X.JrO     // Catch:{ JSONException -> 0x02e8 }
            r11 = r13
            r12 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x02e8 }
            X.JrM r0 = new X.JrM     // Catch:{ JSONException -> 0x02e8 }
            r0.<init>(r6, r15)     // Catch:{ JSONException -> 0x02e8 }
            X.3Ih r3 = X.C41845B3m.A0d(r0)     // Catch:{ JSONException -> 0x02e8 }
            return r3
        L_0x02de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)     // Catch:{ JSONException -> 0x02e8 }
            throw r0     // Catch:{ JSONException -> 0x02e8 }
        L_0x02e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)     // Catch:{ JSONException -> 0x02e8 }
            throw r0     // Catch:{ JSONException -> 0x02e8 }
        L_0x02e8:
            java.lang.String r1 = "Error parsing config"
            X.JrJ r0 = new X.JrJ
            r0.<init>(r1)
            X.5sO r0 = X.C41845B3m.A0c(r0)
            return r0
        L_0x02f4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo.A00(com.instagram.common.session.UserSession, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }
}
