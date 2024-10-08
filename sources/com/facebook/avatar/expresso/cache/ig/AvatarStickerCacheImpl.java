package com.facebook.avatar.expresso.cache.ig;

import X.136;
import X.AnonymousClass7TG;
import X.C262094Cc;
import android.content.Context;
import java.io.File;

public final class AvatarStickerCacheImpl {
    public final Context A00;
    public final C262094Cc A01;
    public final 136 A02 = new 136();
    public volatile File A03;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDl, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9, int r10) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = X.C66133MDl.A01(r4, r9)
            if (r0 == 0) goto L_0x0067
            r3 = r9
            X.MDl r3 = (X.C66133MDl) r3
            int r2 = r3.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r3.A01 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A05
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A01
            if (r0 == 0) goto L_0x0053
            if (r0 != r4) goto L_0x006d
            int r10 = r3.A00
            java.lang.Object r8 = r3.A04
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r3.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r3.A02
            java.lang.String r6 = (java.lang.String) r6
            X.0eS.A00(r2)
        L_0x0030:
            java.io.File r2 = (java.io.File) r2
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r1.append(r10)
            r0 = 47
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r8, r1)
            java.io.File r0 = X.JTO.A0s(r2, r0)
            return r0
        L_0x0053:
            X.0eS.A00(r2)
            r3.A02 = r6
            r3.A03 = r7
            r3.A04 = r8
            r3.A00 = r10
            r3.A01 = r4
            java.lang.Object r2 = r5.A05(r3)
            if (r2 != r1) goto L_0x0030
            return r1
        L_0x0067:
            X.MDl r3 = new X.MDl
            r3.<init>(r5, r9, r4)
            goto L_0x0015
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A03(java.lang.String, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r8, java.io.File r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 19
            boolean r0 = X.MEC.A03(r3, r10)
            if (r0 == 0) goto L_0x0022
            r7 = r10
            X.MEC r7 = (X.MEC) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r5) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            X.MEC r7 = X.MEC.A00(r8, r10, r3)
            goto L_0x0016
        L_0x0027:
            X.0eS.A00(r1)     // Catch:{ IOException -> 0x004e }
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0030:
            X.0eS.A00(r1)
            java.io.File r4 = r9.getParentFile()     // Catch:{ IOException -> 0x004e }
            X.4Cc r3 = r8.A01     // Catch:{ IOException -> 0x004e }
            r2 = 0
            r1 = 6
            X.JTi r0 = new X.JTi     // Catch:{ IOException -> 0x004e }
            r0.<init>(r9, r4, r2, r1)     // Catch:{ IOException -> 0x004e }
            r7.A00 = r5     // Catch:{ IOException -> 0x004e }
            java.lang.Object r0 = X.1Eo.A00(r7, r3, r0)     // Catch:{ IOException -> 0x004e }
            if (r0 != r6) goto L_0x0049
            return r6
        L_0x0049:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L_0x004e:
            r2 = move-exception
            java.lang.String r1 = "AvatarStickerAssetCache"
            java.lang.String r0 = "Failed to create cache file"
            X.0KC.A0F(r1, r0, r2)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.io.File, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 17
            boolean r0 = X.C66144MDw.A02(r3, r9)
            if (r0 == 0) goto L_0x004d
            r6 = r9
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r4) goto L_0x0053
            java.lang.Object r8 = r6.A01
            java.lang.String r8 = (java.lang.String) r8
            X.0eS.A00(r1)
        L_0x0028:
            java.io.File r1 = (java.io.File) r1
            java.lang.String r0 = "model/"
            java.lang.String r0 = X.002.A0R(r0, r8)
            java.io.File r0 = X.JTO.A0s(r1, r0)
            return r0
        L_0x0035:
            X.0eS.A00(r1)
            X.4Cc r3 = r7.A01
            r2 = 0
            r1 = 22
            X.JUv r0 = new X.JUv
            r0.<init>(r7, r2, r1)
            r6.A01 = r8
            r6.A00 = r4
            java.lang.Object r1 = X.1Eo.A00(r6, r3, r0)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x004d:
            X.MDw r6 = new X.MDw
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 18
            boolean r0 = X.C66144MDw.A02(r3, r9)
            if (r0 == 0) goto L_0x0061
            r6 = r9
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r4) goto L_0x0067
            java.lang.Object r8 = r6.A01
            java.lang.String r8 = (java.lang.String) r8
            X.0eS.A00(r1)
        L_0x0028:
            java.io.File r1 = (java.io.File) r1
            java.io.File r3 = X.JTO.A0s(r1, r8)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "scene.json"
            java.io.File r1 = X.JTO.A0s(r3, r0)
            java.lang.String r0 = "scene"
            r2.put(r0, r1)
            java.lang.String r0 = "anim.behavior"
            java.io.File r1 = X.JTO.A0s(r3, r0)
            java.lang.String r0 = "anim"
            r2.put(r0, r1)
            return r2
        L_0x0049:
            X.0eS.A00(r1)
            X.4Cc r3 = r7.A01
            r2 = 0
            r1 = 23
            X.JUv r0 = new X.JUv
            r0.<init>(r7, r2, r1)
            r6.A01 = r8
            r6.A00 = r4
            java.lang.Object r1 = X.1Eo.A00(r6, r3, r0)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0061:
            X.MDw r6 = new X.MDw
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14, int r15) {
        /*
            r10 = this;
            r3 = 18
            boolean r0 = X.MEC.A03(r3, r14)
            r4 = r10
            if (r0 == 0) goto L_0x003e
            r8 = r14
            X.MEC r8 = (X.MEC) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003e
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r8.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r8.A00
            r0 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 != r0) goto L_0x0043
            X.0eS.A00(r3)
        L_0x0025:
            java.io.File r3 = (java.io.File) r3
            java.lang.String r0 = "sticker.webp"
            java.io.File r0 = X.JTO.A0s(r3, r0)
            return r0
        L_0x002e:
            X.0eS.A00(r3)
            r8.A00 = r0
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            java.lang.Object r3 = r4.A03(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x003e:
            X.MEC r8 = X.MEC.A00(r10, r14, r3)
            goto L_0x0017
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A04(java.lang.String, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r10) {
        /*
            r9 = this;
            r3 = 8
            boolean r0 = X.C66146MDy.A02(r3, r10)
            if (r0 == 0) goto L_0x002a
            r8 = r10
            X.MDy r8 = (X.C66146MDy) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r8.A03
            X.1Hj r7 = X.1Hj.A02
            int r2 = r8.A00
            r6 = 2
            r1 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r1) goto L_0x0035
            if (r2 != r6) goto L_0x0030
            java.lang.Object r4 = r8.A01
            X.136 r4 = (X.136) r4
            goto L_0x006b
        L_0x002a:
            X.MDy r8 = new X.MDy
            r8.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0035:
            java.lang.Object r4 = r8.A02
            X.136 r4 = (X.136) r4
            java.lang.Object r3 = r8.A01
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r3 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r3
            X.0eS.A00(r0)
            goto L_0x0054
        L_0x0041:
            X.0eS.A00(r0)
            java.io.File r0 = r9.A03
            if (r0 != 0) goto L_0x007c
            X.136 r4 = r9.A02
            X.C66146MDy.A00(r9, r4, r8, r1)
            java.lang.Object r0 = X.136.A00(r8, r4)
            if (r0 == r7) goto L_0x0078
            r3 = r9
        L_0x0054:
            java.io.File r0 = r3.A03     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0079
            X.4Cc r2 = r3.A01     // Catch:{ all -> 0x0073 }
            r1 = 21
            X.JUv r0 = new X.JUv     // Catch:{ all -> 0x0073 }
            r0.<init>(r3, r5, r1)     // Catch:{ all -> 0x0073 }
            X.C66146MDy.A00(r4, r5, r8, r6)     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = X.1Eo.A00(r8, r2, r0)     // Catch:{ all -> 0x0073 }
            if (r0 != r7) goto L_0x006e
            return r7
        L_0x006b:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0071 }
        L_0x006e:
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0071 }
            goto L_0x0079
        L_0x0071:
            r0 = move-exception
            goto L_0x0074
        L_0x0073:
            r0 = move-exception
        L_0x0074:
            r4.A05(r5)
            throw r0
        L_0x0078:
            return r7
        L_0x0079:
            r4.A05(r5)
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A05(X.4D7):java.lang.Object");
    }

    public AvatarStickerCacheImpl(Context context, C262094Cc r3) {
        AnonymousClass7TG.A1O(context, r3);
        this.A00 = context;
        this.A01 = r3;
    }
}
