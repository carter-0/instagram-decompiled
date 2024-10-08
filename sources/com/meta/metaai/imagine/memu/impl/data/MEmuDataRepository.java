package com.meta.metaai.imagine.memu.impl.data;

import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;

public final class MEmuDataRepository {
    public final MEmuNetworkService A00;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.graphics.Bitmap r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 44
            boolean r0 = X.ME5.A03(r3, r10)
            if (r0 == 0) goto L_0x0023
            r7 = r10
            X.ME5 r7 = (X.ME5) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0030
            if (r0 != r5) goto L_0x002b
            goto L_0x0048
        L_0x0023:
            r0 = 42
            X.ME5 r7 = new X.ME5
            r7.<init>(r8, r10, r3, r0)
            goto L_0x0016
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0030:
            X.0eS.A00(r1)
            if (r9 != 0) goto L_0x0036
            return r4
        L_0x0036:
            r2 = 30000(0x7530, double:1.4822E-319)
            r1 = 42
            X.MGC r0 = new X.MGC     // Catch:{ all -> 0x004e }
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r8, (X.AnonymousClass4D7) r4, (int) r1)     // Catch:{ all -> 0x004e }
            r7.A00 = r5     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = X.I3P.A00(r7, r0, r2)     // Catch:{ all -> 0x004e }
            if (r1 != r6) goto L_0x004b
            return r6
        L_0x0048:
            X.0eS.A00(r1)     // Catch:{ all -> 0x004e }
        L_0x004b:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x0054:
            java.lang.Throwable r0 = X.0eR.A00(r1)
            if (r0 != 0) goto L_0x005b
            return r1
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository.A00(android.graphics.Bitmap, X.4D7):java.lang.Object");
    }

    public MEmuDataRepository(MEmuNetworkService mEmuNetworkService) {
        this.A00 = mEmuNetworkService;
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fe, code lost:
        if (r3 != null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0200, code lost:
        r8 = r3.getOptionalTreeField(0, "xfb_add_memu_user_photos(data:$input)", X.BSh.class, -362489214);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020b, code lost:
        if (r8 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020d, code lost:
        r8 = r8.getOptionalTreeField(3, "photo_verification", X.BSe.class, 1083701403);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0219, code lost:
        if (r8 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021b, code lost:
        r0 = r8.getRequiredCompactedTreeListField(0, "results", X.BSd.class, 686479716);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0226, code lost:
        if (r0 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0228, code lost:
        r10 = X.AnonymousClass7TE.A1C();
        r13 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0234, code lost:
        if (r13.hasNext() == false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0236, code lost:
        r12 = X.C41845B3m.A0V(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0240, code lost:
        if (r12.hasFieldValue("is_similar") == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0242, code lost:
        r9 = X.C41846B3n.A0d(r12, "is_similar", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0246, code lost:
        r8 = (X.C62627Kiy) r12.getOptionalEnumField(1, "orientation", X.C62627Kiy.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0256, code lost:
        if (r12.hasFieldValue("similarity_score") == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0258, code lost:
        r2 = new java.lang.Double(r12.getCoercedDoubleField(2, "similarity_score"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0261, code lost:
        r10.add(new X.C63969LFw(r8, (X.C62631Kj2) r12.getOptionalEnumField(3, "verification_status", X.C62631Kj2.A08), r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0274, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0276, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0281, code lost:
        r5 = X.AnonymousClass62Q.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0285, code lost:
        if (r5 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0287, code lost:
        r3 = r3.getOptionalTreeField(0, "xfb_add_memu_user_photos(data:$input)", X.BSh.class, -362489214);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0292, code lost:
        if (r3 == null) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x029f, code lost:
        if (r3.getOptionalTreeField(1, "error", X.BSc.class, -530741976) != null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a1, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a2, code lost:
        r2 = X.C41845B3m.A0d(new X.C64123LOu(r7, r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b8, code lost:
        r5 = X.AnonymousClass62Q.A00(X.0sn.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02be, code lost:
        if (r3 == null) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r7 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r3 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        r8 = r3.getOptionalTreeField(0, "xfb_create_memu_user(data:$input)", X.BT7.class, -488828611);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (r8 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r8 = r8.getOptionalTreeField(3, "photo_verification", X.BT4.class, -558786691);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if (r8 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        r0 = r8.getRequiredCompactedTreeListField(0, "results", X.BT3.class, 1985442806);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (r0 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r10 = X.AnonymousClass7TE.A1C();
        r13 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        if (r13.hasNext() == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f2, code lost:
        r12 = X.C41845B3m.A0V(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        if (r12.hasFieldValue("is_similar") == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fe, code lost:
        r9 = X.C41846B3n.A0d(r12, "is_similar", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0102, code lost:
        r8 = (X.C62627Kiy) r12.getOptionalEnumField(1, "orientation", X.C62627Kiy.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        if (r12.hasFieldValue("similarity_score") == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r2 = new java.lang.Double(r12.getCoercedDoubleField(2, "similarity_score"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        r10.add(new X.C63969LFw(r8, (X.C62631Kj2) r12.getOptionalEnumField(3, "verification_status", X.C62631Kj2.A08), r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0132, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r6 = X.AnonymousClass62Q.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        if (r6 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        r3 = r3.getOptionalTreeField(0, "xfb_create_memu_user(data:$input)", X.BT7.class, -488828611);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014e, code lost:
        if (r3 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015b, code lost:
        if (r3.getOptionalTreeField(2, "error", X.BT2.class, -961286077) != null) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015e, code lost:
        r2 = X.C41845B3m.A0d(new X.C64123LOu(r7, r6, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0174, code lost:
        r6 = X.AnonymousClass62Q.A00(X.0sn.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017a, code lost:
        if (r3 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        if (r1 == r2) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f9, code lost:
        if (r7 != null) goto L_0x0200;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r16, java.lang.String r17, java.util.List r18, X.AnonymousClass4D7 r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r3 = 43
            r4 = r19
            boolean r0 = X.ME5.A03(r3, r4)
            if (r0 == 0) goto L_0x02d6
            r10 = r4
            X.ME5 r10 = (X.ME5) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x02d6
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r10.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r10.A00
            r5 = 2
            r4 = 0
            r6 = 1
            r14 = 0
            if (r0 == 0) goto L_0x017d
            if (r0 == r6) goto L_0x0191
            if (r0 != r5) goto L_0x02df
            X.0eS.A00(r1)
        L_0x002b:
            r2 = r1
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0134
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r3 = r2.A00
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x00b8
            java.lang.Class<X.BT7> r2 = X.BT7.class
            java.lang.String r1 = "xfb_create_memu_user(data:$input)"
            r0 = -488828611(0xffffffffe2dd113d, float:-2.0389863E21)
            X.3lr r7 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r7 == 0) goto L_0x00b8
            java.lang.Class<X.BT6> r2 = X.BT6.class
            java.lang.String r1 = "profile"
            r0 = -1996631283(0xffffffff88fdd30d, float:-1.5276501E-33)
            X.3lr r7 = r7.getOptionalTreeField(r6, r1, r2, r0)
            if (r7 == 0) goto L_0x00b8
            java.lang.Class<X.BT5> r2 = X.BT5.class
            java.lang.String r1 = "images"
            r0 = -932474659(0xffffffffc86b90dd, float:-241219.45)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x00b8
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x0069:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r7 = r8.next()
            r2 = r7
            X.3lr r2 = (X.C250663lr) r2
            X.Kiy r1 = X.C62627Kiy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "orientation"
            java.lang.Enum r1 = r2.getOptionalEnumField(r5, r0, r1)
            X.Kiy r0 = X.C62627Kiy.CAMERA_ROLL
            if (r1 != r0) goto L_0x0069
            r9.add(r7)
            goto L_0x0069
        L_0x0086:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r9.iterator()
        L_0x008e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b1
            X.3lr r1 = X.C41845B3m.A0V(r7)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getOptionalStringField(r4, r0)
            java.lang.String r0 = "uri"
            java.lang.String r1 = r1.getOptionalStringField(r6, r0)
            if (r2 == 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            X.Cwv r0 = new X.Cwv
            r0.<init>(r2, r1)
            r8.add(r0)
            goto L_0x008e
        L_0x00b1:
            X.62P r7 = X.AnonymousClass62Q.A00(r8)
            if (r7 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            X.62M r7 = X.AnonymousClass62M.A01
            if (r3 == 0) goto L_0x0174
        L_0x00bc:
            java.lang.Class<X.BT7> r2 = X.BT7.class
            java.lang.String r1 = "xfb_create_memu_user(data:$input)"
            r0 = -488828611(0xffffffffe2dd113d, float:-2.0389863E21)
            X.3lr r8 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r8 == 0) goto L_0x0174
            java.lang.Class<X.BT4> r2 = X.BT4.class
            r11 = 3
            java.lang.String r1 = "photo_verification"
            r0 = -558786691(0xffffffffdeb1977d, float:-6.3984172E18)
            X.3lr r8 = r8.getOptionalTreeField(r11, r1, r2, r0)
            if (r8 == 0) goto L_0x0174
            java.lang.Class<X.BT3> r2 = X.BT3.class
            java.lang.String r1 = "results"
            r0 = 1985442806(0x765773f6, float:1.09247636E33)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x0174
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x00ec:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x013d
            X.3lr r12 = X.C41845B3m.A0V(r13)
            java.lang.String r1 = "is_similar"
            boolean r0 = r12.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0132
            java.lang.Boolean r9 = X.C41846B3n.A0d(r12, r1, r4)
        L_0x0102:
            X.Kiy r1 = X.C62627Kiy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "orientation"
            java.lang.Enum r8 = r12.getOptionalEnumField(r6, r0, r1)
            X.Kiy r8 = (X.C62627Kiy) r8
            java.lang.String r1 = "similarity_score"
            boolean r0 = r12.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0130
            double r0 = r12.getCoercedDoubleField(r5, r1)
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
        L_0x011d:
            X.Kj2 r1 = X.C62631Kj2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "verification_status"
            java.lang.Enum r1 = r12.getOptionalEnumField(r11, r0, r1)
            X.Kj2 r1 = (X.C62631Kj2) r1
            X.LFw r0 = new X.LFw
            r0.<init>(r8, r1, r9, r2)
            r10.add(r0)
            goto L_0x00ec
        L_0x0130:
            r2 = r14
            goto L_0x011d
        L_0x0132:
            r9 = r14
            goto L_0x0102
        L_0x0134:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0167
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x013d:
            X.62P r6 = X.AnonymousClass62Q.A00(r10)
            if (r6 == 0) goto L_0x0174
        L_0x0143:
            java.lang.Class<X.BT7> r2 = X.BT7.class
            java.lang.String r1 = "xfb_create_memu_user(data:$input)"
            r0 = -488828611(0xffffffffe2dd113d, float:-2.0389863E21)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x015d
            java.lang.Class<X.BT2> r2 = X.BT2.class
            java.lang.String r1 = "error"
            r0 = -961286077(0xffffffffc6b3f043, float:-23032.13)
            X.3lr r0 = r3.getOptionalTreeField(r5, r1, r2, r0)
            if (r0 != 0) goto L_0x015e
        L_0x015d:
            r4 = 1
        L_0x015e:
            X.LOu r0 = new X.LOu
            r0.<init>(r7, r6, r4)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x0167:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0190
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02e4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0174:
            X.0sn r0 = X.0sn.A00
            X.62P r6 = X.AnonymousClass62Q.A00(r0)
            if (r3 == 0) goto L_0x015d
            goto L_0x0143
        L_0x017d:
            X.0eS.A00(r1)
            if (r21 == 0) goto L_0x02c1
            com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService r1 = r15.A00
            X.62P r0 = X.AnonymousClass62Q.A00(r18)
            r10.A00 = r6
            java.lang.Object r1 = r1.A03(r10, r0)
            if (r1 != r2) goto L_0x0194
        L_0x0190:
            return r2
        L_0x0191:
            X.0eS.A00(r1)
        L_0x0194:
            r2 = r1
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0278
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r3 = r2.A00
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x01fc
            java.lang.Class<X.BSh> r2 = X.BSh.class
            java.lang.String r1 = "xfb_add_memu_user_photos(data:$input)"
            r0 = -362489214(0xffffffffea64da82, float:-6.916674E25)
            X.3lr r7 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r7 == 0) goto L_0x01fc
            java.lang.Class<X.BSg> r2 = X.BSg.class
            java.lang.String r1 = "profile"
            r0 = 1663012396(0x631f8e2c, float:2.943277E21)
            X.3lr r7 = r7.getOptionalTreeField(r5, r1, r2, r0)
            if (r7 == 0) goto L_0x01fc
            java.lang.Class<X.BSf> r2 = X.BSf.class
            java.lang.String r1 = "images"
            r0 = 744117061(0x2c5a5345, float:3.1025887E-12)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x01fc
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x01d2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01f5
            X.3lr r1 = X.C41845B3m.A0V(r7)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getOptionalStringField(r5, r0)
            java.lang.String r0 = "uri"
            java.lang.String r1 = r1.getOptionalStringField(r4, r0)
            if (r2 == 0) goto L_0x01d2
            if (r1 == 0) goto L_0x01d2
            X.Cwv r0 = new X.Cwv
            r0.<init>(r2, r1)
            r8.add(r0)
            goto L_0x01d2
        L_0x01f5:
            X.62P r7 = X.AnonymousClass62Q.A00(r8)
            if (r7 == 0) goto L_0x01fc
            goto L_0x0200
        L_0x01fc:
            X.62M r7 = X.AnonymousClass62M.A01
            if (r3 == 0) goto L_0x02b8
        L_0x0200:
            java.lang.Class<X.BSh> r2 = X.BSh.class
            java.lang.String r1 = "xfb_add_memu_user_photos(data:$input)"
            r0 = -362489214(0xffffffffea64da82, float:-6.916674E25)
            X.3lr r8 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r8 == 0) goto L_0x02b8
            java.lang.Class<X.BSe> r2 = X.BSe.class
            r11 = 3
            java.lang.String r1 = "photo_verification"
            r0 = 1083701403(0x4097f89b, float:4.7490973)
            X.3lr r8 = r8.getOptionalTreeField(r11, r1, r2, r0)
            if (r8 == 0) goto L_0x02b8
            java.lang.Class<X.BSd> r2 = X.BSd.class
            java.lang.String r1 = "results"
            r0 = 686479716(0x28ead964, float:2.6073497E-14)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x02b8
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x0230:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0281
            X.3lr r12 = X.C41845B3m.A0V(r13)
            java.lang.String r1 = "is_similar"
            boolean r0 = r12.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0276
            java.lang.Boolean r9 = X.C41846B3n.A0d(r12, r1, r4)
        L_0x0246:
            X.Kiy r1 = X.C62627Kiy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "orientation"
            java.lang.Enum r8 = r12.getOptionalEnumField(r6, r0, r1)
            X.Kiy r8 = (X.C62627Kiy) r8
            java.lang.String r1 = "similarity_score"
            boolean r0 = r12.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0274
            double r0 = r12.getCoercedDoubleField(r5, r1)
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
        L_0x0261:
            X.Kj2 r1 = X.C62631Kj2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "verification_status"
            java.lang.Enum r1 = r12.getOptionalEnumField(r11, r0, r1)
            X.Kj2 r1 = (X.C62631Kj2) r1
            X.LFw r0 = new X.LFw
            r0.<init>(r8, r1, r9, r2)
            r10.add(r0)
            goto L_0x0230
        L_0x0274:
            r2 = r14
            goto L_0x0261
        L_0x0276:
            r9 = r14
            goto L_0x0246
        L_0x0278:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02ab
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0281:
            X.62P r5 = X.AnonymousClass62Q.A00(r10)
            if (r5 == 0) goto L_0x02b8
        L_0x0287:
            java.lang.Class<X.BSh> r2 = X.BSh.class
            java.lang.String r1 = "xfb_add_memu_user_photos(data:$input)"
            r0 = -362489214(0xffffffffea64da82, float:-6.916674E25)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x02a1
            java.lang.Class<X.BSc> r2 = X.BSc.class
            java.lang.String r1 = "error"
            r0 = -530741976(0xffffffffe05d8528, float:-6.3848834E19)
            X.3lr r0 = r3.getOptionalTreeField(r6, r1, r2, r0)
            if (r0 != 0) goto L_0x02a2
        L_0x02a1:
            r4 = 1
        L_0x02a2:
            X.LOu r0 = new X.LOu
            r0.<init>(r7, r5, r4)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x02ab:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0190
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02e4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02b8:
            X.0sn r0 = X.0sn.A00
            X.62P r5 = X.AnonymousClass62Q.A00(r0)
            if (r3 == 0) goto L_0x02a1
            goto L_0x0287
        L_0x02c1:
            com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService r7 = r15.A00
            X.62P r11 = X.AnonymousClass62Q.A00(r18)
            r10.A00 = r5
            r8 = r16
            r9 = r17
            r12 = r20
            java.lang.Object r1 = r7.A02(r8, r9, r10, r11, r12)
            if (r1 != r2) goto L_0x002b
            return r2
        L_0x02d6:
            r0 = 42
            X.ME5 r10 = new X.ME5
            r10.<init>(r15, r4, r3, r0)
            goto L_0x0018
        L_0x02df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e4:
            X.D9Y r0 = X.D9Y.A00
            X.5sO r2 = X.C41845B3m.A0c(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository.A01(java.lang.String, java.lang.String, java.util.List, X.4D7, boolean, boolean):java.lang.Object");
    }
}
