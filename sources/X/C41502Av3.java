package X;

/* renamed from: X.Av3  reason: case insensitive filesystem */
public final class C41502Av3 implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C41502Av3(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.7iT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.7iT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.7iT} */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0249, code lost:
        if (r15.A04("product_category_identifier", r10) != r9) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        X.0eS.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
        if (r3.emit(r0, r5) != r6) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0182, code lost:
        return r6;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            int r0 = r8.A00
            r4 = r20
            switch(r0) {
                case 0: goto L_0x0125;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0025;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r8.A03
            X.7a5 r0 = (X.C333757a5) r0
            X.1Xl r1 = r0.A00
            if (r1 == 0) goto L_0x0022
            java.lang.Object r0 = r8.A02
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
            java.lang.Object r1 = r8.A01
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 0
            X.19E.A05(r0, r1)
        L_0x0022:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0025:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0097
            r0 = r7
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.7ul r0 = (X.C346197ul) r0
            java.lang.Object r10 = r0.A00
            X.9Ih r10 = (X.C376519Ih) r10
            java.lang.Object r9 = r8.A03
            X.0rm r9 = (X.0rm) r9
            java.lang.Object r3 = r9.A00
            X.9Ih r3 = (X.C376519Ih) r3
            if (r3 == 0) goto L_0x0095
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.02m r6 = X.02m.A0p
            r5 = 17634421(0x10d1475, float:2.5912287E-38)
            r6.markerStart(r5)
            java.lang.Object r1 = r10.A02
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r0 = r3.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.00k.A0e(r1, r0)
            int r12 = r0.size()
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r10.A04
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00a4
            long r1 = r0.longValue()
        L_0x006a:
            java.lang.Object r0 = r3.A04
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0074
            long r13 = r0.longValue()
        L_0x0074:
            long r1 = r1 - r13
            java.lang.Object r11 = r10.A01
            X.8cI r11 = (X.C359218cI) r11
            java.lang.String r3 = r11.A02
            java.lang.String r0 = "product_id"
            r6.markerAnnotate(r5, r0, r3)
            java.lang.String r3 = r11.A01
            java.lang.String r0 = "category_id"
            r6.markerAnnotate(r5, r0, r3)
            java.lang.String r0 = "new_effects_count"
            r6.markerAnnotate(r5, r0, r12)
            java.lang.String r0 = "sync_time_diff_ms"
            r6.markerAnnotate(r5, r0, r1)
            r0 = 2
            r6.markerEnd(r5, r0)
        L_0x0095:
            r9.A00 = r10
        L_0x0097:
            java.lang.Object r0 = r8.A01
            X.02o r0 = (X.02o) r0
            java.lang.Object r6 = r0.emit(r7, r4)
            X.1Hj r0 = X.1Hj.A02
            if (r6 != r0) goto L_0x0022
            return r6
        L_0x00a4:
            r1 = r13
            goto L_0x006a
        L_0x00a6:
            r3 = 37
            boolean r0 = X.C66144MDw.A02(r3, r4)
            if (r0 == 0) goto L_0x00cf
            r5 = r4
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cf
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x00bc:
            java.lang.Object r1 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00d5
            if (r0 == r9) goto L_0x0118
            if (r0 == r4) goto L_0x0154
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cf:
            X.MDw r5 = new X.MDw
            r5.<init>(r8, r4, r3)
            goto L_0x00bc
        L_0x00d5:
            X.0eS.A00(r1)
            java.lang.Object r3 = r8.A02
            X.02o r3 = (X.02o) r3
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00fb
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r0 = r7.A00
            boolean r0 = r0 instanceof X.C384759hq
            if (r0 == 0) goto L_0x00f8
            X.9ho r1 = X.C384739ho.A00
        L_0x00ec:
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
        L_0x00f1:
            r1 = 0
            r5.A01 = r1
            r5.A00 = r4
            goto L_0x017c
        L_0x00f8:
            X.9hp r1 = X.C384749hp.A00
            goto L_0x00ec
        L_0x00fb:
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x02d2
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r2 = r7.A00
            X.7ul r2 = (X.C346197ul) r2
            java.lang.Object r1 = r8.A03
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r1 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService) r1
            java.lang.Object r0 = r8.A01
            X.LAa r0 = (X.C63871LAa) r0
            r5.A01 = r3
            r5.A00 = r9
            java.lang.Object r1 = com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A01(r0, r1, r2, r5)
            if (r1 != r6) goto L_0x011f
            return r6
        L_0x0118:
            java.lang.Object r3 = r5.A01
            X.02o r3 = (X.02o) r3
            X.0eS.A00(r1)
        L_0x011f:
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
            goto L_0x00f1
        L_0x0125:
            r3 = 21
            boolean r0 = X.C66146MDy.A02(r3, r4)
            if (r0 == 0) goto L_0x014e
            r5 = r4
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x014e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x013b:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0159
            if (r0 == r12) goto L_0x02be
            if (r0 == r4) goto L_0x0154
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014e:
            X.MDy r5 = new X.MDy
            r5.<init>(r8, r4, r3)
            goto L_0x013b
        L_0x0154:
            X.0eS.A00(r1)
            goto L_0x0022
        L_0x0159:
            X.0eS.A00(r1)
            java.lang.Object r3 = r8.A02
            X.02o r3 = (X.02o) r3
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x019e
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r1 = r7.A00
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0183
            X.9hn r1 = X.C384729hn.A00
        L_0x0170:
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
        L_0x0175:
            r1 = 0
            r5.A01 = r1
            r5.A02 = r1
            r5.A00 = r4
        L_0x017c:
            java.lang.Object r0 = r3.emit(r0, r5)
            if (r0 != r6) goto L_0x0022
            return r6
        L_0x0183:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x02d7
            r0 = 22
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r2 = r1.A00
            java.lang.String r1 = "MiniGalleryCategoriesService"
            java.lang.String r0 = "fetchGalleryCategories"
            X.0wb.A06(r1, r0, r2)
            X.9hm r1 = X.C384719hm.A00
            goto L_0x0170
        L_0x019e:
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x02dc
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r7 = r7.A00
            r0 = r7
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r2 = r0.A01
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x02ce
            java.lang.Class<X.7iV> r1 = X.C338767iV.class
            java.lang.String r0 = "ar_effect_categories"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x02ce
            java.lang.Object r13 = r8.A03
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r13 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService) r13
            java.lang.Object r14 = r8.A01
            X.849 r14 = (X.AnonymousClass849) r14
            X.1XQ r7 = (X.1XQ) r7
            boolean r0 = r7.mFromDiskCache
            if (r0 == 0) goto L_0x025c
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x01c9:
            X.7iW r10 = X.C338777iW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "default_product_category_identifier"
            java.lang.Enum r9 = r2.A04(r0, r10)
            java.lang.Class<X.7iX> r1 = X.C338787iX.class
            java.lang.String r0 = "product_categories"
            com.google.common.collect.ImmutableList r0 = r2.A02(r0, r1)
            X.0qQ.A07(r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r0.iterator()
        L_0x01e4:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x025f
            java.lang.Object r15 = r16.next()
            X.3FZ r15 = (X.AnonymousClass3FZ) r15
            X.0qQ.A0A(r15)
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.String r1 = "product_category_identifier"
            java.lang.Enum r0 = r15.A04(r1, r10)
            java.lang.String r7 = "IGAREffectModelExt"
            if (r0 != 0) goto L_0x020f
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Receiving null product category id: "
        L_0x0207:
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r15, r0, r1)
        L_0x020b:
            X.0wb.A03(r7, r0)
            goto L_0x01e4
        L_0x020f:
            java.lang.Enum r0 = r15.A04(r1, r10)
            if (r0 != r10) goto L_0x0218
            java.lang.String r0 = "Receiving unrecognized product category"
            goto L_0x020b
        L_0x0218:
            r0 = 47
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r15.A05(r2)
            if (r0 == 0) goto L_0x0255
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0255
            java.lang.Enum r0 = r15.A04(r1, r10)
            X.7iW r0 = (X.C338777iW) r0
            X.0qQ.A0A(r0)
            java.lang.String r7 = r0.name()
            java.lang.String r2 = r15.A05(r2)
            X.0qQ.A0A(r2)
            java.lang.Enum r0 = r15.A04(r1, r10)
            if (r0 == 0) goto L_0x024b
            java.lang.Enum r0 = r15.A04(r1, r10)
            r1 = 1
            if (r0 == r9) goto L_0x024c
        L_0x024b:
            r1 = 0
        L_0x024c:
            X.9JA r0 = new X.9JA
            r0.<init>((X.AnonymousClass849) r14, (java.lang.String) r7, (java.lang.String) r2, (boolean) r1)
            r8.add(r0)
            goto L_0x01e4
        L_0x0255:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Receiving null category display name: "
            goto L_0x0207
        L_0x025c:
            r11 = 0
            goto L_0x01c9
        L_0x025f:
            X.7iT r2 = new X.7iT
            r2.<init>(r11, r8)
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r0 = r13.A02
            r5.A01 = r3
            r5.A02 = r2
            r5.A00 = r12
            long r15 = java.lang.System.currentTimeMillis()
            X.86O r8 = r0.A01
            java.util.List r0 = r2.A01
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x027c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02ab
            java.lang.Object r1 = r9.next()
            X.9JA r1 = (X.AnonymousClass9JA) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r1.A01
            X.849 r0 = (X.AnonymousClass849) r0
            java.lang.String r11 = r0.name()
            java.lang.String r12 = r1.A03
            java.lang.String r13 = r1.A02
            r0 = 95
            java.lang.String r14 = X.002.A0T(r11, r12, r0)
            boolean r0 = r1.A04
            X.7iY r10 = new X.7iY
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r17)
            r7.add(r10)
            goto L_0x027c
        L_0x02ab:
            X.3oI r9 = r8.A01
            r1 = 0
            X.MB7 r0 = new X.MB7
            r0.<init>(r1, r8, r7)
            java.lang.Object r0 = X.1wR.A01(r9, r0, r5)
            if (r0 == r6) goto L_0x02bb
            X.0gF r0 = X.C60340gF.A00
        L_0x02bb:
            if (r0 != r6) goto L_0x02c7
            return r6
        L_0x02be:
            java.lang.Object r2 = r5.A02
            java.lang.Object r3 = r5.A01
            X.02o r3 = (X.02o) r3
            X.0eS.A00(r1)
        L_0x02c7:
            X.3Ih r0 = new X.3Ih
            r0.<init>(r2)
            goto L_0x0175
        L_0x02ce:
            X.9hl r1 = X.C384709hl.A00
            goto L_0x0170
        L_0x02d2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02dc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41502Av3.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
