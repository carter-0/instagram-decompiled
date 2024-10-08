package com.instagram.ar.core.discovery.minigallery.services;

import X.02o;
import X.AnonymousClass849;

public final class MiniGalleryService$getSearchResults$$inlined$map$1$2 implements 02o {
    public final /* synthetic */ MiniGalleryService A00;
    public final /* synthetic */ AnonymousClass849 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 02o A04;

    public MiniGalleryService$getSearchResults$$inlined$map$1$2(MiniGalleryService miniGalleryService, AnonymousClass849 r2, String str, String str2, 02o r5) {
        this.A04 = r5;
        this.A00 = miniGalleryService;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = str2;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            r3 = 22
            boolean r0 = X.C66146MDy.A02(r3, r15)
            if (r0 == 0) goto L_0x00bf
            r6 = r15
            X.MDy r6 = (X.C66146MDy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r7 = X.1Hj.A02
            r12 = r7
            int r0 = r6.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x009b
            if (r0 != r5) goto L_0x00c6
            X.0eS.A00(r1)
        L_0x0028:
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x002b:
            X.0eS.A00(r1)
            X.02o r4 = r13.A04
            X.3Ii r14 = (X.C239803Ii) r14
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0056
            X.5sO r14 = (X.C297815sO) r14
            java.lang.Object r0 = r14.A00
            boolean r0 = r0 instanceof X.C384779hs
            if (r0 == 0) goto L_0x0053
            X.9ho r0 = X.C384739ho.A00
        L_0x0040:
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0045:
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A00 = r5
            java.lang.Object r0 = r4.emit(r1, r6)
            if (r0 != r7) goto L_0x0028
            return r12
        L_0x0053:
            X.9hp r0 = X.C384749hp.A00
            goto L_0x0040
        L_0x0056:
            boolean r0 = r14 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00cb
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r3 = r13.A00
            java.lang.String r0 = r13.A03
            r3.A00 = r0
            X.849 r1 = r13.A01
            r0 = r14
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r11 = r0.A00
            X.7ul r11 = (X.C346197ul) r11
            java.lang.String r0 = r13.A02
            r10 = 0
            if (r0 != 0) goto L_0x006f
            r10 = 1
        L_0x006f:
            r6.A01 = r4
            r6.A02 = r14
            r6.A00 = r2
            X.8cJ r2 = X.C359218cI.A03
            X.84A r1 = r1.A00
            java.lang.String r0 = "search"
            X.8cI r1 = r2.A01(r1, r0)
            com.instagram.ar.core.effectcollection.EffectCollectionService r9 = r3.A02
            java.lang.Object r0 = r11.A00
            java.util.List r0 = (java.util.List) r0
            r8 = 0
            X.9Ih r3 = new X.9Ih
            r3.<init>(r1, r0)
            boolean r2 = r11.A02
            java.lang.String r1 = r11.A01
            X.7ul r0 = new X.7ul
            r0.<init>(r3, r1, r2)
            java.lang.Object r0 = r9.A0B(r0, r6, r10, r8)
            if (r0 != r7) goto L_0x00a6
            return r12
        L_0x009b:
            java.lang.Object r14 = r6.A02
            X.3Ii r14 = (X.C239803Ii) r14
            java.lang.Object r4 = r6.A01
            X.02o r4 = (X.02o) r4
            X.0eS.A00(r1)
        L_0x00a6:
            X.3Ih r14 = (X.C239793Ih) r14
            java.lang.Object r0 = r14.A00
            X.7ul r0 = (X.C346197ul) r0
            java.lang.Object r3 = r0.A00
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r0.A02
            java.lang.String r1 = r0.A01
            X.L5q r0 = new X.L5q
            r0.<init>(r1, r3, r2)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
            goto L_0x0045
        L_0x00bf:
            X.MDy r6 = new X.MDy
            r6.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
