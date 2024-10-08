package X;

import java.util.List;

/* renamed from: X.9jf  reason: invalid class name and case insensitive filesystem */
public final class C385869jf extends 2Cn {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C385869jf(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 1:
                0kD.A01("CanvasBirthdayHighlightsController", "Unable to create medium for reel item");
                C387519mL.A03((C387519mL) this.A02, (List) this.A04, this.A01 + 1);
                return;
            case 2:
                0qQ.A0B(exc, 0);
                0kD.A07("CanvasEndOfYearController", "Unable to create medium for reel item", exc);
                C387539mN.A03((C387539mN) this.A04, (List) this.A03, this.A01 + 1);
                return;
            default:
                C385869jf.super.onFail(exc);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ae, code lost:
        r9.A9D(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            r22 = this;
            r3 = r22
            r6 = r23
            int r0 = r3.A00
            java.io.File r6 = (java.io.File) r6
            switch(r0) {
                case 0: goto L_0x01b2;
                case 1: goto L_0x00ef;
                default: goto L_0x000b;
            }
        L_0x000b:
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Object r2 = r3.A02
            X.1Xj r2 = (X.1Xj) r2
            int r0 = X.AnonymousClass7TG.A09(r2)
            com.instagram.common.gallery.Medium r11 = X.C282665Eg.A03(r6, r0, r4)
            java.lang.Object r0 = r3.A04
            X.9mN r0 = (X.C387539mN) r0
            java.lang.Object r6 = r3.A03
            java.util.List r6 = (java.util.List) r6
            int r1 = r3.A01
            boolean r3 = r2.CeS()
            java.lang.String r8 = "Required value was null."
            if (r3 == 0) goto L_0x00b3
            android.content.Context r3 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00ac }
            int r3 = X.AnonymousClass7TG.A05(r3)     // Catch:{ IllegalArgumentException -> 0x00ac }
            float r5 = (float) r3     // Catch:{ IllegalArgumentException -> 0x00ac }
            com.instagram.common.session.UserSession r12 = r0.A08     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.9sQ r13 = X.C391149sQ.STORY_EOY_SHARE     // Catch:{ IllegalArgumentException -> 0x00ac }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r0.A0A     // Catch:{ IllegalArgumentException -> 0x00ac }
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.81W r3 = r3.A0K     // Catch:{ IllegalArgumentException -> 0x00ac }
            int r17 = r3.getWidth()     // Catch:{ IllegalArgumentException -> 0x00ac }
            int r18 = r3.getHeight()     // Catch:{ IllegalArgumentException -> 0x00ac }
            r3 = 1
            X.9Hy r10 = new X.9Hy     // Catch:{ IllegalArgumentException -> 0x00ac }
            r10.<init>((float) r5)     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.String r15 = "gallery_story_video_sticker"
            r5 = 0
            r16 = 0
            X.9sL r14 = X.C391099sL.NOT_CLIPS     // Catch:{ IllegalArgumentException -> 0x00ac }
            r19 = -1
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r9 = new X.9X8     // Catch:{ IllegalArgumentException -> 0x00ac }
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.87H r7 = r0.A0B     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.87i r4 = r0.A09     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.6b1 r4 = X.C39906AIv.A03(r4)     // Catch:{ IllegalArgumentException -> 0x00ac }
            r7.A0C(r9, r4, r3)     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.C387539mN.A00(r0)     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.String r4 = r2.getId()     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r4 == 0) goto L_0x00a7
            X.8pU r4 = r7.A03(r5, r4)     // Catch:{ IllegalArgumentException -> 0x00ac }
            X.0qQ.A07(r4)     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.String r2 = r2.getId()     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r2 == 0) goto L_0x00a2
            X.A7g r7 = new X.A7g     // Catch:{ IllegalArgumentException -> 0x00ac }
            r7.<init>(r4, r2)     // Catch:{ IllegalArgumentException -> 0x00ac }
            android.graphics.Bitmap r2 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00ac }
            r7.A00 = r2     // Catch:{ IllegalArgumentException -> 0x00ac }
            r4 = 0
            android.graphics.Bitmap r2 = r9.A00(r4)     // Catch:{ IllegalArgumentException -> 0x00ac }
            r7.A02 = r2     // Catch:{ IllegalArgumentException -> 0x00ac }
            boolean r2 = r0.A04     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r2 == 0) goto L_0x009c
            java.util.List r2 = r0.A03     // Catch:{ IllegalArgumentException -> 0x00ac }
            r2.add(r7)     // Catch:{ IllegalArgumentException -> 0x00ac }
            int r1 = r1 + 1
            goto L_0x009e
        L_0x009c:
            r0.A04 = r3     // Catch:{ IllegalArgumentException -> 0x00ac }
        L_0x009e:
            X.C387539mN.A03(r0, r6, r1)     // Catch:{ IllegalArgumentException -> 0x00ac }
            return
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)     // Catch:{ IllegalArgumentException -> 0x00ac }
            goto L_0x00ab
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)     // Catch:{ IllegalArgumentException -> 0x00ac }
        L_0x00ab:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ac }
        L_0x00ac:
            r2 = move-exception
            java.lang.String r1 = "CanvasEndOfYearController"
            java.lang.String r0 = "Error creating video sticker for EOY story."
            goto L_0x017a
        L_0x00b3:
            android.content.Context r5 = r0.A07
            com.instagram.common.session.UserSession r3 = r0.A08
            com.instagram.user.model.User r12 = r2.A2A(r3)
            if (r12 == 0) goto L_0x00ea
            java.lang.String r13 = r2.A2n()
            if (r13 == 0) goto L_0x00e5
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r0.A0A
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3
            X.81W r3 = r3.A0K
            int r14 = r3.getWidth()
            int r15 = r3.getHeight()
            X.9jy r9 = new X.9jy
            r10 = r5
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r11 = 1
            X.AZ4 r3 = new X.AZ4
            r5 = r3
            r7 = r0
            r8 = r2
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01ae
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x00ef:
            java.lang.Object r1 = r3.A03
            X.1Xj r1 = (X.1Xj) r1
            int r0 = X.AnonymousClass7TG.A09(r1)
            r5 = 0
            X.0qQ.A0B(r6, r5)
            com.instagram.common.gallery.Medium r11 = X.C282665Eg.A03(r6, r0, r5)
            java.lang.Object r0 = r3.A02
            X.9mL r0 = (X.C387519mL) r0
            java.lang.Object r2 = r3.A04
            java.util.List r2 = (java.util.List) r2
            int r8 = r3.A01
            boolean r3 = r1.CeS()
            if (r3 == 0) goto L_0x017e
            android.content.Context r7 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0175 }
            int r3 = X.AnonymousClass7TG.A05(r7)     // Catch:{ IllegalArgumentException -> 0x0175 }
            float r6 = (float) r3     // Catch:{ IllegalArgumentException -> 0x0175 }
            com.instagram.common.session.UserSession r12 = r0.A05     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.9sQ r13 = X.C391149sQ.STORY_EOY_SHARE     // Catch:{ IllegalArgumentException -> 0x0175 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r4 = r0.A07     // Catch:{ IllegalArgumentException -> 0x0175 }
            r3 = r4
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.81W r3 = r3.A0K     // Catch:{ IllegalArgumentException -> 0x0175 }
            int r17 = r3.getWidth()     // Catch:{ IllegalArgumentException -> 0x0175 }
            int r18 = r3.getHeight()     // Catch:{ IllegalArgumentException -> 0x0175 }
            r3 = 1
            X.9Hy r10 = new X.9Hy     // Catch:{ IllegalArgumentException -> 0x0175 }
            r10.<init>((float) r6)     // Catch:{ IllegalArgumentException -> 0x0175 }
            java.lang.String r15 = "gallery_story_video_sticker"
            X.AnonymousClass7TF.A1B(r12, r3, r11)     // Catch:{ IllegalArgumentException -> 0x0175 }
            r16 = 0
            X.9sL r14 = X.C391099sL.NOT_CLIPS     // Catch:{ IllegalArgumentException -> 0x0175 }
            r19 = -1
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r9 = new X.9X8     // Catch:{ IllegalArgumentException -> 0x0175 }
            r21 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.87H r6 = r0.A08     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.87i r5 = r0.A06     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.6b1 r5 = X.C39906AIv.A03(r5)     // Catch:{ IllegalArgumentException -> 0x0175 }
            r6.A0C(r9, r5, r3)     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.C387519mL.A01(r0)     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.C387519mL.A02(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.A7g r3 = X.AnonymousClass87H.A00(r6, r1)     // Catch:{ IllegalArgumentException -> 0x0175 }
            r5 = 0
            android.graphics.Bitmap r1 = r9.A00(r5)     // Catch:{ IllegalArgumentException -> 0x0175 }
            X.8Cl r1 = X.C387519mL.A00(r7, r1, r4)     // Catch:{ IllegalArgumentException -> 0x0175 }
            r3.A03 = r1     // Catch:{ IllegalArgumentException -> 0x0175 }
            android.graphics.Bitmap r1 = r9.A00(r5)     // Catch:{ IllegalArgumentException -> 0x0175 }
            r3.A02 = r1     // Catch:{ IllegalArgumentException -> 0x0175 }
            java.util.List r1 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0175 }
            r1.add(r3)     // Catch:{ IllegalArgumentException -> 0x0175 }
            int r1 = r8 + 1
            X.C387519mL.A03(r0, r2, r1)     // Catch:{ IllegalArgumentException -> 0x0175 }
            return
        L_0x0175:
            r2 = move-exception
            java.lang.String r1 = "CanvasBirthdayHighlightsController"
            java.lang.String r0 = "Error creating video sticker for birthday highlight story."
        L_0x017a:
            X.0kD.A0E(r1, r0, r2)
            return
        L_0x017e:
            android.content.Context r4 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.A05
            com.instagram.user.model.User r12 = r1.A2A(r3)
            r12.getClass()
            java.lang.String r13 = r1.A2n()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r0.A07
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r3 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r3
            X.81W r3 = r3.A0K
            int r14 = r3.getWidth()
            int r15 = r3.getHeight()
            X.9jy r9 = new X.9jy
            r10 = r4
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.AZ4 r3 = new X.AZ4
            r10 = r3
            r11 = r1
            r12 = r9
            r13 = r0
            r14 = r2
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x01ae:
            r9.A9D(r3)
            return
        L_0x01b2:
            r1 = 0
            X.0qQ.A0B(r6, r1)
            java.lang.Object r2 = r3.A03
            X.1Xj r2 = (X.1Xj) r2
            int r0 = X.AnonymousClass7TG.A09(r2)
            com.instagram.common.gallery.Medium r5 = X.C282665Eg.A03(r6, r0, r1)
            java.lang.Object r4 = r3.A04
            X.9mJ r4 = (X.C387499mJ) r4
            int r1 = r2.A0y()
            int r0 = r2.A0x()
            r5.A0B = r1
            r5.A04 = r0
            com.instagram.common.session.UserSession r1 = r4.A07
            boolean r0 = r5.CeS()
            com.instagram.common.util.gradient.BackgroundGradientColors r0 = X.C39581A0x.A00(r1, r6, r0)
            r5.A0H = r0
            int r2 = r3.A01
            java.lang.Object r1 = r3.A02
            X.57C r1 = (X.AnonymousClass57C) r1
            android.util.SparseArray r0 = r4.A02
            r0.put(r2, r5)
            X.C387499mJ.A00(r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385869jf.onSuccess(java.lang.Object):void");
    }
}
