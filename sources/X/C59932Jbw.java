package X;

import java.util.List;

/* renamed from: X.Jbw  reason: case insensitive filesystem */
public final class C59932Jbw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ JW7 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ List A03;

    public C59932Jbw(JW7 jw7, Integer num, List list, int i) {
        this.A01 = jw7;
        this.A00 = i;
        this.A03 = list;
        this.A02 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0214, code lost:
        if (((X.JWE) r0).A01.A0J == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022d, code lost:
        if (r13.size() >= r10) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r15.contains(r12) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r9 = r19
            X.JW7 r7 = r9.A01
            X.JW8 r11 = r7.A14
            X.JWM r8 = r11.A0F
            r6 = 0
            r8.A09 = r6
            r8.A07()
            X.8XW r2 = r11.A0O
            java.util.Map r0 = r2.A04
            int r5 = r9.A00
            java.lang.Object r3 = X.C51968G9o.A10(r0, r5)
            com.instagram.ui.widget.mediapicker.Folder r3 = (com.instagram.ui.widget.mediapicker.Folder) r3
            if (r3 == 0) goto L_0x001f
            r11.A0J(r3)
        L_0x001f:
            java.util.List r4 = r9.A03
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            X.82q r13 = r11.A0K
            java.util.Iterator r12 = X.JTP.A0w(r13)
        L_0x002b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r10 = r12.next()
            com.instagram.creation.base.MediaSession r10 = (com.instagram.creation.base.MediaSession) r10
            com.instagram.common.session.UserSession r0 = r11.A0E
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            java.lang.String r0 = r10.BbR()
            X.3Q2 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.A30
            r15.add(r0)
            goto L_0x002b
        L_0x004d:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r18 = r4.iterator()
        L_0x0055:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r12 = r18.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = r13.COf()
            if (r0 == 0) goto L_0x006f
            boolean r0 = r15.contains(r12)
            r17 = 0
            if (r0 == 0) goto L_0x0071
        L_0x006f:
            r17 = 1
        L_0x0071:
            java.util.List r0 = r8.A0U
            boolean r0 = X.C59935Jbz.A01(r12, r0)
            if (r0 != 0) goto L_0x0089
            java.util.List r0 = r8.A0S
            boolean r0 = X.C59935Jbz.A01(r12, r0)
            if (r0 != 0) goto L_0x0089
            java.util.List r0 = r8.A0T
            boolean r0 = X.C59935Jbz.A01(r12, r0)
            if (r0 == 0) goto L_0x008f
        L_0x0089:
            if (r17 == 0) goto L_0x008f
        L_0x008b:
            r10.add(r12)
            goto L_0x0055
        L_0x008f:
            X.8gQ r14 = r11.A0P
            monitor-enter(r14)
            X.0qQ.A0B(r12, r6)     // Catch:{ all -> 0x0204 }
            java.util.Map r0 = r14.A01     // Catch:{ all -> 0x0204 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0204 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0204 }
        L_0x009f:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x0204 }
            r0 = 0
            if (r1 == 0) goto L_0x00ca
            java.lang.Object r4 = r16.next()     // Catch:{ all -> 0x0204 }
            r1 = r4
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0204 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0204 }
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1     // Catch:{ all -> 0x0204 }
            int r1 = r1.A05     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0204 }
            boolean r1 = X.0qQ.A0K(r1, r12)     // Catch:{ all -> 0x0204 }
            if (r1 == 0) goto L_0x009f
        L_0x00bf:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x00cc
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x0204 }
            com.instagram.common.gallery.RemoteMedia r0 = (com.instagram.common.gallery.RemoteMedia) r0     // Catch:{ all -> 0x0204 }
            goto L_0x00cc
        L_0x00ca:
            r4 = r0
            goto L_0x00bf
        L_0x00cc:
            monitor-exit(r14)
            if (r0 == 0) goto L_0x0055
            if (r17 == 0) goto L_0x0055
            java.lang.String r12 = r0.A06
            goto L_0x008b
        L_0x00d4:
            r4 = 1
            if (r3 == 0) goto L_0x02ea
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x02ea
            boolean r0 = r2.A0D(r5)
            r11.A0I(r3, r0)
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            java.util.List r2 = r8.A0T
            java.util.HashMap r14 = X.C59935Jbz.A00(r2)
            java.util.List r0 = r8.A0S
            java.util.HashMap r13 = X.C59935Jbz.A00(r0)
            java.util.List r0 = r8.A0U
            java.util.HashMap r12 = X.C59935Jbz.A00(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r10.iterator()
        L_0x0102:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r17.next()
            boolean r16 = r14.containsKey(r0)
            if (r16 == 0) goto L_0x011c
            java.lang.Object r0 = r14.get(r0)
        L_0x0116:
            if (r0 == 0) goto L_0x0102
            r1.add(r0)
            goto L_0x0102
        L_0x011c:
            boolean r16 = r13.containsKey(r0)
            if (r16 == 0) goto L_0x0127
            java.lang.Object r0 = r13.get(r0)
            goto L_0x0116
        L_0x0127:
            boolean r16 = r12.containsKey(r0)
            if (r16 == 0) goto L_0x0102
            java.lang.Object r0 = r12.get(r0)
            goto L_0x0116
        L_0x0132:
            java.util.Iterator r12 = r1.iterator()
        L_0x0136:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r12.next()
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            java.lang.String r0 = r1.A0A
            r15.put(r0, r1)
            goto L_0x0136
        L_0x0148:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r10.iterator()
        L_0x0150:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r12 = r17.next()
            java.lang.Object r1 = r15.get(r12)
            if (r1 != 0) goto L_0x01ff
            X.8gT r0 = r11.A0J
            X.0Ud r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            X.0qQ.A0B(r12, r6)
            X.0qQ.A0B(r0, r4)
            java.util.Collection r10 = r0.values()
            r0 = 10
            int r0 = X.0Yv.A1E(r10, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x0183:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r10.next()
            X.8gX r0 = (X.C361628gX) r0
            java.util.Set r0 = r0.A02
            r1.add(r0)
            goto L_0x0183
        L_0x0195:
            java.util.ArrayList r0 = X.0Yv.A1F(r1)
            java.util.Set r0 = X.00k.A0k(r0)
            java.util.List r0 = X.AJ5.A04(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x01a5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r0 = r10.next()
            r1 = r0
            com.instagram.common.gallery.RemoteMedia r1 = (com.instagram.common.gallery.RemoteMedia) r1
            java.lang.String r1 = r1.A06
            boolean r1 = X.0qQ.A0K(r1, r12)
            if (r1 == 0) goto L_0x01a5
        L_0x01ba:
            com.instagram.common.gallery.RemoteMedia r0 = (com.instagram.common.gallery.RemoteMedia) r0
            if (r0 != 0) goto L_0x01fa
            X.8gQ r14 = r11.A0P
            monitor-enter(r14)
            goto L_0x01c4
        L_0x01c2:
            r0 = 0
            goto L_0x01ba
        L_0x01c4:
            java.util.Map r0 = r14.A01     // Catch:{ all -> 0x0204 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0204 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0204 }
        L_0x01ce:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x0204 }
            r0 = 0
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r10 = r16.next()     // Catch:{ all -> 0x0204 }
            r1 = r10
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0204 }
            java.lang.Object r1 = r1.getKey()     // Catch:{ all -> 0x0204 }
            com.instagram.common.gallery.RemoteMedia r1 = (com.instagram.common.gallery.RemoteMedia) r1     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = r1.A06     // Catch:{ all -> 0x0204 }
            boolean r1 = X.0qQ.A0K(r1, r12)     // Catch:{ all -> 0x0204 }
            if (r1 == 0) goto L_0x01ce
        L_0x01ea:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x01f7
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0204 }
            com.instagram.common.gallery.RemoteMedia r0 = (com.instagram.common.gallery.RemoteMedia) r0     // Catch:{ all -> 0x0204 }
            goto L_0x01f7
        L_0x01f5:
            r10 = r0
            goto L_0x01ea
        L_0x01f7:
            monitor-exit(r14)
            if (r0 == 0) goto L_0x0150
        L_0x01fa:
            com.instagram.common.gallery.model.GalleryItem r1 = new com.instagram.common.gallery.model.GalleryItem
            r1.<init>((com.instagram.common.gallery.RemoteMedia) r0)
        L_0x01ff:
            r13.add(r1)
            goto L_0x0150
        L_0x0204:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0207:
            X.82p r0 = r7.A18
            X.82q r0 = r0.A00
            if (r0 == 0) goto L_0x0216
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            boolean r0 = r0.A0J
            r15 = 1
            if (r0 != 0) goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            r12 = 2
            r10 = 2
            if (r15 == 0) goto L_0x021c
            r10 = 1
        L_0x021c:
            int r0 = r13.size()
            if (r0 != r4) goto L_0x0224
            r7.A0R = r4
        L_0x0224:
            boolean r0 = r8.A07
            if (r0 != 0) goto L_0x022f
            int r1 = r13.size()
            r0 = 0
            if (r1 < r10) goto L_0x0230
        L_0x022f:
            r0 = 1
        L_0x0230:
            r11.A0L(r0, r4)
            java.util.List r14 = r8.A0W
            int r0 = r14.size()
            if (r0 != r4) goto L_0x0293
            java.lang.Object r0 = X.00k.A0J(r14)
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            r8.Ejh(r0, r4, r6)
        L_0x0244:
            X.JW7.A0G(r7)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0278
            int r0 = r13.size()
            int r0 = r0 - r4
            java.lang.Object r1 = r13.get(r0)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x0261
            r8.Ejh(r1, r4, r6)
        L_0x0261:
            int r0 = r13.size()
            if (r0 < r12) goto L_0x0278
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r1 = r7.A0I
            if (r1 == 0) goto L_0x0278
            com.instagram.common.session.UserSession r0 = r7.A0z
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager.A01(r0, r1, r13)
            int r0 = r13.size()
            int r0 = r0 - r4
            r1.A0K(r0)
        L_0x0278:
            boolean r0 = r7.A1P
            if (r0 == 0) goto L_0x0288
            if (r15 == 0) goto L_0x0288
            X.1Ng r1 = r7.A0y
            X.Jbx r0 = new X.Jbx
            r0.<init>(r4, r4)
            r1.A05(r0)
        L_0x0288:
            r11.A0C()
            X.8ZX r0 = r7.A0H
            if (r0 == 0) goto L_0x02f6
            r0.DGI(r7, r3)
            goto L_0x02f6
        L_0x0293:
            java.util.Iterator r10 = r13.iterator()
        L_0x0297:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02ad
            java.lang.Object r1 = r10.next()
            if (r1 == 0) goto L_0x0297
            boolean r0 = r14.contains(r1)
            if (r0 != 0) goto L_0x0297
            r14.add(r1)
            goto L_0x0297
        L_0x02ad:
            java.lang.Object r1 = X.00k.A0J(r14)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            if (r1 != 0) goto L_0x02bd
            java.lang.Object r1 = X.00k.A0J(r2)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            if (r1 == 0) goto L_0x02c2
        L_0x02bd:
            X.MUO r0 = r8.A0Q
            r0.DQg(r1, r6)
        L_0x02c2:
            X.6SR r2 = X.AnonymousClass6SR.A01()
            int r1 = r14.size()
            r2.A06 = r1
            int r0 = r2.A05
            int r0 = java.lang.Math.max(r0, r1)
            r2.A05 = r0
            X.1Ng r10 = r8.A0N
            java.util.List r0 = X.C51966G9m.A1J(r14)
            int r2 = r0.size()
            boolean r1 = r8.A07
            X.Jbx r0 = new X.Jbx
            r0.<init>(r2, r1)
            r10.A05(r0)
            goto L_0x0244
        L_0x02ea:
            java.util.List r10 = r8.A0T
            java.lang.Object r1 = X.00k.A0J(r10)
            r0 = -1
            if (r1 != 0) goto L_0x0307
            r7.setCurrentFolderByIdAndSelectFirstItem(r0)
        L_0x02f6:
            X.JW7.A0J(r7)
            java.lang.Integer r0 = r9.A02
            if (r0 == 0) goto L_0x0306
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0306
            r7.setCurrentFolderById(r0)
        L_0x0306:
            return
        L_0x0307:
            r11.A0C()
            boolean r0 = r2.A0D(r0)
            r11.A0I(r3, r0)
            com.instagram.common.session.UserSession r3 = r7.A0z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316662907540027(0x8105d00008123b, double:3.030142085967611E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0337
            java.lang.Object r0 = X.00k.A0J(r10)
            if (r0 == 0) goto L_0x0337
            java.lang.Object r0 = X.00k.A0J(r10)
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            if (r0 != 0) goto L_0x0341
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0337:
            com.instagram.common.gallery.model.GalleryItem r0 = r8.A05()
            if (r0 == 0) goto L_0x02f6
            com.instagram.common.gallery.model.GalleryItem r0 = r8.A05()
        L_0x0341:
            r8.Ejh(r0, r4, r6)
            goto L_0x02f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59932Jbw.run():void");
    }
}
