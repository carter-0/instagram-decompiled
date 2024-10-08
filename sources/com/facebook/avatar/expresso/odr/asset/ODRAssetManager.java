package com.facebook.avatar.expresso.odr.asset;

import X.0qQ;
import X.C262094Cc;

public final class ODRAssetManager {
    public static final String A01;
    public final C262094Cc A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r7, com.facebook.avatar.expresso.odr.asset.ODRAssetManager r8, java.lang.String r9, X.AnonymousClass4D7 r10, org.json.JSONObject r11, org.json.JSONObject r12) {
        /*
            r4 = 4
            boolean r0 = X.ME0.A02(r4, r10)
            if (r0 == 0) goto L_0x0080
            r2 = r10
            X.ME0 r2 = (X.ME0) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0080
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r4 = r2.A05
            X.1Hj r3 = X.1Hj.A02
            int r5 = r2.A00
            r1 = 2
            r0 = 1
            if (r5 == 0) goto L_0x002f
            if (r5 == r0) goto L_0x003e
            if (r5 != r1) goto L_0x0086
            X.0eS.A00(r4)
        L_0x0026:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
        L_0x002a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x002f:
            X.0eS.A00(r4)
            X.ME0.A00(r8, r11, r12, r7, r2)
            r2.A00 = r0
            java.lang.Object r4 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r7, r9, r2)
            if (r4 != r3) goto L_0x004b
            return r3
        L_0x003e:
            java.lang.Object r7 = r2.A04
            java.lang.Object r12 = r2.A03
            java.lang.Object r11 = r2.A02
            java.lang.Object r8 = r2.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r8 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r8
            X.0eS.A00(r4)
        L_0x004b:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "scene"
            java.lang.Object r6 = r4.get(r0)
            if (r6 == 0) goto L_0x007e
            org.json.JSONObject r5 = X.DbS.A11()
            java.lang.String r0 = "lights"
            r5.put(r0, r11)
            java.lang.String r0 = "camera"
            r5.put(r0, r12)
            X.4Cc r0 = r8.A00
            r8 = 0
            r9 = 35
            X.MHP r4 = new X.MHP
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            r2.A01 = r8
            r2.A02 = r8
            r2.A03 = r8
            r2.A04 = r8
            r2.A00 = r1
            java.lang.Object r4 = X.1Eo.A00(r2, r0, r4)
            if (r4 != r3) goto L_0x0026
            return r3
        L_0x007e:
            r0 = 0
            goto L_0x002a
        L_0x0080:
            X.ME0 r2 = new X.ME0
            r2.<init>(r8, r10, r4)
            goto L_0x0015
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, com.facebook.avatar.expresso.odr.asset.ODRAssetManager, java.lang.String, X.4D7, org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    static {
        String name = ODRAssetManager.class.getName();
        0qQ.A07(name);
        A01 = name;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r1 == r6) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 10
            boolean r0 = X.C66146MDy.A02(r3, r11)
            if (r0 == 0) goto L_0x0063
            r7 = r11
            X.MDy r7 = (X.C66146MDy) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0063
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r5 = 2
            r0 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r0) goto L_0x002e
            if (r2 != r5) goto L_0x0069
            java.lang.Object r10 = r7.A02
            java.lang.String r10 = (java.lang.String) r10
            X.0eS.A00(r1)
        L_0x002b:
            if (r1 == 0) goto L_0x006e
            return r1
        L_0x002e:
            java.lang.Object r10 = r7.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r7.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r4 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r4
            X.0eS.A00(r1)
            goto L_0x0047
        L_0x003a:
            X.0eS.A00(r1)
            X.C66146MDy.A00(r8, r10, r7, r0)
            java.lang.Object r1 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r9, r10, r7)
            if (r1 == r6) goto L_0x0062
            r4 = r8
        L_0x0047:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "scene"
            java.lang.Object r3 = r1.get(r0)
            if (r3 == 0) goto L_0x006e
            X.4Cc r2 = r4.A00
            r1 = 0
            X.MGy r0 = new X.MGy
            r0.<init>(r3, r10, r1, r5)
            X.C66146MDy.A00(r4, r10, r7, r5)
            java.lang.Object r1 = X.1Eo.A00(r7, r2, r0)
            if (r1 != r6) goto L_0x002b
        L_0x0062:
            return r6
        L_0x0063:
            X.MDy r7 = new X.MDy
            r7.<init>(r8, r11, r3)
            goto L_0x0016
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x006e:
            java.lang.String r2 = A01
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Scene path not found for %s"
            X.0KC.A0O(r2, r0, r1)
            java.lang.String r0 = "Scene path not found for "
            java.lang.String r0 = X.002.A0R(r0, r10)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.io.File} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.JUK, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r11 = r0.A03;
        r2 = r0.A05;
        r1 = r0.A04;
        X.JUK.A00(r15, r3, r14, r4, r9);
        r9.A05 = r5;
        r9.A06 = r12;
        r9.A07 = r0;
        r9.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        if (A00(r14, r15, r11, r9, r2, r1) != r8) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r23, java.util.List r24, java.util.Map r25, X.AnonymousClass4D7 r26, X.0sI r27) {
        /*
            r22 = this;
            r3 = r25
            r14 = r23
            r4 = r27
            r10 = 1
            r5 = r26
            boolean r0 = X.JUK.A02(r10, r5)
            r11 = r22
            if (r0 == 0) goto L_0x013e
            r9 = r5
            X.JUK r9 = (X.JUK) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x013e
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x001f:
            java.lang.Object r2 = r9.A09
            X.1Hj r8 = X.1Hj.A02
            int r1 = r9.A00
            java.lang.String r13 = "Required value was null."
            r0 = 4
            r7 = 3
            r6 = 2
            if (r1 == 0) goto L_0x0134
            if (r1 == r10) goto L_0x007d
            if (r1 == r6) goto L_0x00ae
            if (r1 == r7) goto L_0x00eb
            if (r1 != r0) goto L_0x0148
            java.lang.Object r5 = r9.A05
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.A04
            X.0sI r4 = (X.0sI) r4
            java.lang.Object r14 = r9.A03
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r14 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r14
            java.lang.Object r3 = r9.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r15 = r9.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r15 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r15
            X.0eS.A00(r2)
        L_0x004b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r12 = r5.next()
            java.lang.Object r0 = r3.get(r12)
            X.LG2 r0 = (X.LG2) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r11 = r0.A03
            org.json.JSONObject r2 = r0.A05
            org.json.JSONObject r1 = r0.A04
            X.JUK.A00(r15, r3, r14, r4, r9)
            r9.A05 = r5
            r9.A06 = r12
            r9.A07 = r0
            r9.A00 = r10
            r17 = r9
            r18 = r2
            r19 = r1
            r16 = r11
            java.lang.Object r1 = A00(r14, r15, r16, r17, r18, r19)
            if (r1 != r8) goto L_0x009a
            return r8
        L_0x007d:
            java.lang.Object r0 = r9.A07
            X.LG2 r0 = (X.LG2) r0
            java.lang.Object r12 = r9.A06
            java.lang.Object r5 = r9.A05
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.A04
            X.0sI r4 = (X.0sI) r4
            java.lang.Object r14 = r9.A03
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r14 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r14
            java.lang.Object r3 = r9.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r15 = r9.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r15 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r15
            X.0eS.A00(r2)
        L_0x009a:
            java.lang.String r1 = r0.A03
            X.JUK.A00(r15, r3, r14, r4, r9)
            r9.A05 = r5
            r9.A06 = r12
            r9.A07 = r0
            r9.A00 = r6
            java.lang.Object r2 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r14, r1, r9)
            if (r2 != r8) goto L_0x00cb
            return r8
        L_0x00ae:
            java.lang.Object r0 = r9.A07
            X.LG2 r0 = (X.LG2) r0
            java.lang.Object r12 = r9.A06
            java.lang.Object r5 = r9.A05
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.A04
            X.0sI r4 = (X.0sI) r4
            java.lang.Object r14 = r9.A03
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r14 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r14
            java.lang.Object r3 = r9.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r15 = r9.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r15 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r15
            X.0eS.A00(r2)
        L_0x00cb:
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "anim"
            java.lang.Object r11 = r2.get(r1)
            java.io.File r11 = (java.io.File) r11
            if (r11 == 0) goto L_0x0152
            X.JUK.A00(r15, r3, r14, r4, r9)
            r9.A05 = r5
            r9.A06 = r12
            r9.A07 = r0
            r9.A08 = r11
            r9.A00 = r7
            java.lang.Object r1 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(r14, r11, r9)
            if (r1 != r8) goto L_0x010a
            return r8
        L_0x00eb:
            java.lang.Object r11 = r9.A08
            java.lang.Object r0 = r9.A07
            X.LG2 r0 = (X.LG2) r0
            java.lang.Object r12 = r9.A06
            java.lang.Object r5 = r9.A05
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.A04
            X.0sI r4 = (X.0sI) r4
            java.lang.Object r14 = r9.A03
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r14 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r14
            java.lang.Object r3 = r9.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r15 = r9.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r15 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r15
            X.0eS.A00(r2)
        L_0x010a:
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A03
            java.lang.Object r20 = r3.get(r12)
            if (r20 == 0) goto L_0x014d
            X.JUK.A00(r15, r3, r14, r4, r9)
            r9.A05 = r5
            r0 = 0
            r9.A06 = r0
            r9.A07 = r0
            r9.A08 = r0
            r0 = 4
            r9.A00 = r0
            r16 = r4
            r17 = r2
            r18 = r11
            r19 = r1
            r21 = r9
            java.lang.Object r0 = r16.invoke(r17, r18, r19, r20, r21)
            if (r0 != r8) goto L_0x004b
            return r8
        L_0x0134:
            X.0eS.A00(r2)
            java.util.Iterator r5 = r24.iterator()
            r15 = r11
            goto L_0x004b
        L_0x013e:
            X.JUK r9 = new X.JUK
            r9.<init>(r11, r5, r10)
            goto L_0x001f
        L_0x0145:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0148:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0152:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.util.List, java.util.Map, X.4D7, X.0sI):java.lang.Object");
    }

    public ODRAssetManager(C262094Cc r1) {
        this.A00 = r1;
    }
}
