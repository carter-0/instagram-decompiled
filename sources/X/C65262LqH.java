package X;

/* renamed from: X.LqH  reason: case insensitive filesystem */
public final class C65262LqH implements C66484MTn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65262LqH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void EIt() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[LOOP:1: B:24:0x0071->B:26:0x0077, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EMf(X.C53401GnY r14, X.C381779cJ r15, java.util.List r16, int r17, long r18, boolean r20, boolean r21) {
        /*
            r13 = this;
            int r0 = r13.A00
            r6 = r16
            r7 = r20
            if (r0 == 0) goto L_0x012c
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r1.next()
            X.Jtk r0 = (X.C60926Jtk) r0
            com.instagram.common.gallery.Medium r0 = r0.A00
            r4.add(r0)
            goto L_0x0010
        L_0x0022:
            java.lang.Object r2 = r13.A02
            X.9i5 r2 = (X.C384909i5) r2
            if (r20 == 0) goto L_0x00e3
            java.lang.Object r3 = r13.A01
            X.K6K r3 = (X.K6K) r3
            X.K6G r0 = X.K6K.A00(r3)
            r1 = 1
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.A02()
            if (r0 != r1) goto L_0x004f
        L_0x0039:
            r2.A08 = r1
            X.K6G r0 = X.K6K.A00(r3)
            if (r0 == 0) goto L_0x005a
            X.LPF r0 = r0.A02
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "mediaPickerPhotosController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004f:
            r1 = 0
            goto L_0x0039
        L_0x0051:
            X.LOJ r0 = r0.A09
            X.LR6 r0 = r0.A01
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.A01
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r2.A05 = r0
            r2.A07 = r4
            X.0eM r0 = r2.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OYk r6 = X.C63234Ktf.A00(r0)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x0071:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r1)
            float r0 = r0.A00()
            X.JTP.A1V(r7, r0)
            goto L_0x0071
        L_0x0083:
            r9 = 0
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0099
            r5 = 1
            if (r0 == r5) goto L_0x00cc
            r0 = 29
            X.Plq r3 = new X.Plq
            r3.<init>(r0, r6, r7)
        L_0x0094:
            X.C71012OYk.A01(r6, r3)
            r6.A02 = r5
        L_0x0099:
            X.80Q r0 = r2.A00
            if (r0 == 0) goto L_0x00ae
            X.80R r0 = r0.A00
            X.8Vl r0 = r0.A18
            if (r0 == 0) goto L_0x00ae
            X.8Vm r1 = r0.A00()
            if (r1 == 0) goto L_0x00ae
            X.28D r0 = X.28D.A2T
            r1.A08(r0)
        L_0x00ae:
            X.80Q r5 = r2.A00
            if (r5 == 0) goto L_0x00e2
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x00ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00db
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r1)
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = X.JTR.A0f(r0)
            r7.add(r0)
            goto L_0x00ba
        L_0x00cc:
            java.lang.Object r0 = r7.get(r9)
            float r1 = X.AnonymousClass7TE.A04(r0)
            r0 = 2
            X.Inn r3 = new X.Inn
            r3.<init>(r6, r1, r0)
            goto L_0x0094
        L_0x00db:
            r6 = 0
            r8 = r17
            r10 = r9
            r5.A04(r6, r7, r8, r9, r10)
        L_0x00e2:
            return
        L_0x00e3:
            X.80Q r7 = r2.A00
            if (r7 == 0) goto L_0x0118
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x00ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r1.next()
            X.Jtk r0 = (X.C60926Jtk) r0
            com.instagram.common.gallery.Medium r0 = r0.A00
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = X.JTR.A0f(r0)
            r9.add(r0)
            goto L_0x00ef
        L_0x0105:
            X.80R r0 = r7.A00
            X.8Vl r0 = r0.A18
            X.8Vm r1 = r0.A00()
            r0 = 3
            r1.A02 = r0
            r10 = 0
            r11 = 1
            r8 = r14
            r12 = r21
            r7.A04(r8, r9, r10, r11, r12)
        L_0x0118:
            java.lang.Boolean r0 = r2.A04
            r1 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x012a
            int r0 = r6.size()
            if (r0 <= r1) goto L_0x012a
        L_0x0127:
            r2.A09 = r1
            return
        L_0x012a:
            r1 = 0
            goto L_0x0127
        L_0x012c:
            java.lang.Object r1 = r13.A01
            X.7IG r1 = (X.AnonymousClass7IG) r1
            java.lang.Object r0 = r13.A02
            X.NV6 r0 = (X.NV6) r0
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r0.A01
            r2 = 0
            r8 = 0
            r4 = r2
            r5 = r2
            r1.A05(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65262LqH.EMf(X.GnY, X.9cJ, java.util.List, int, long, boolean, boolean):void");
    }
}
