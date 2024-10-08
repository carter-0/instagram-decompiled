package com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository;

import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass12T;
import X.AnonymousClass12V;
import X.C66300MMj;
import android.content.Context;
import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

public final class ClipsACRBrowserPagingSource extends PagingSource {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass12V A02 = AnonymousClass12T.A00;
    public final UserSession A03;
    public final AnonymousClass0eM A04 = C66300MMj.A01(this, 0eO.A02, 2);

    public ClipsACRBrowserPagingSource(UserSession userSession, Context context) {
        this.A03 = userSession;
        this.A01 = context;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.api.schemas.ACRType r17, X.C61092Jx3 r18, com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r19, X.AnonymousClass4D7 r20) {
        /*
            r4 = r19
            r1 = r18
            r9 = r17
            r5 = 26
            r7 = r20
            boolean r0 = X.MED.A04(r5, r7)
            if (r0 == 0) goto L_0x00c2
            r6 = r7
            X.MED r6 = (X.MED) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00c2
            int r3 = r3 - r2
            r6.A00 = r3
        L_0x001e:
            java.lang.Object r2 = r6.A04
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L_0x009c
            if (r0 != r5) goto L_0x00c9
            java.lang.Object r9 = r6.A03
            com.instagram.api.schemas.ACRType r9 = (com.instagram.api.schemas.ACRType) r9
            java.lang.Object r1 = r6.A02
            X.Jx3 r1 = (X.C61092Jx3) r1
            java.lang.Object r4 = r6.A01
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r4 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r4
            X.0eS.A00(r2)
        L_0x0039:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00ce
            X.BDn r0 = r1.A00
            if (r0 == 0) goto L_0x00ce
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x00ce
            r6 = 0
            java.lang.Object r0 = X.00k.A0O(r0, r6)
            X.Gox r0 = (X.C53465Gox) r0
            if (r0 == 0) goto L_0x00ce
            java.util.ArrayList r20 = X.I5p.A03(r0)
            com.instagram.api.schemas.TrackData r5 = r0.A01
            int r15 = r0.A00
            java.lang.Integer r0 = X.I5p.A01(r20)
            int r3 = X.C51967G9n.A04(r0, r6)
            X.0qQ.A0B(r5, r6)
            com.instagram.music.common.model.MusicAssetModel r0 = com.instagram.music.common.model.MusicAssetModel.A01(r5, r6)
            com.instagram.music.common.model.AudioOverlayTrack r13 = new com.instagram.music.common.model.AudioOverlayTrack
            r13.<init>(r0, r15, r3)
            java.lang.String r14 = r5.getProgressiveDownloadUrl()
            if (r14 == 0) goto L_0x0079
            android.content.Context r11 = r4.A01
            com.instagram.common.session.UserSession r12 = r4.A03
            r16 = r3
            X.I5p.A04(r11, r12, r13, r14, r15, r16)
        L_0x0079:
            java.lang.String r14 = r1.A04
            if (r14 != 0) goto L_0x0081
            java.lang.String r14 = X.AnonymousClass7TG.A0j()
        L_0x0081:
            java.lang.String r15 = r1.A05
            java.lang.String r4 = r1.A07
            java.lang.String r3 = r1.A08
            com.instagram.api.schemas.SmartReelType r10 = r1.A02
            com.instagram.model.reels.ReelType r12 = r1.A03
            java.lang.String r0 = r1.A06
            X.Jub r7 = new X.Jub
            r11 = r8
            r18 = r0
            r19 = r2
            r16 = r4
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r7
        L_0x009c:
            X.0eS.A00(r2)
            java.lang.String r3 = r1.A07
            if (r3 == 0) goto L_0x00ce
            X.BDn r0 = r1.A00
            if (r0 == 0) goto L_0x00ce
            java.util.List r2 = r0.A00
            if (r2 == 0) goto L_0x00ce
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.I75 r0 = (X.I75) r0
            r6.A01 = r4
            r6.A02 = r1
            r6.A03 = r9
            r6.A00 = r5
            java.lang.Object r2 = r0.A07(r2, r3, r6)
            if (r2 != r7) goto L_0x0039
            return r7
        L_0x00c2:
            X.MED r6 = new X.MED
            r6.<init>(r4, r7, r5)
            goto L_0x001e
        L_0x00c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ce:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A00(com.instagram.api.schemas.ACRType, X.Jx3, com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r16, X.JVX r17, java.lang.String r18, java.lang.String r19, java.util.List r20, X.AnonymousClass4D7 r21) {
        /*
            r15 = r18
            r3 = r20
            r4 = r19
            r11 = 0
            r5 = 4
            r6 = r21
            boolean r0 = X.ME1.A02(r5, r6)
            r10 = r16
            if (r0 == 0) goto L_0x00b4
            r8 = r6
            X.ME1 r8 = (X.ME1) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0020:
            java.lang.Object r0 = r8.A06
            X.1Hj r7 = X.1Hj.A02
            int r1 = r8.A00
            r6 = 1
            if (r1 == 0) goto L_0x0066
            if (r1 != r6) goto L_0x00c0
            java.lang.Object r5 = r8.A05
            X.0rm r5 = (X.0rm) r5
            java.lang.Object r4 = r8.A04
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r8.A03
            com.facebook.videolite.transcoder.base.composition.MediaComposition r9 = (com.facebook.videolite.transcoder.base.composition.MediaComposition) r9
            java.lang.Object r3 = r8.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r15 = r8.A01
            java.lang.String r15 = (java.lang.String) r15
            X.0eS.A00(r0)
        L_0x0042:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x004c
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00bb
            r5.A00 = r11
        L_0x004c:
            com.instagram.api.schemas.ACRType r10 = com.instagram.api.schemas.ACRType.CAMERA_ROLL
            java.lang.Object r14 = r5.A00
            com.instagram.music.common.model.AudioOverlayTrack r14 = (com.instagram.music.common.model.AudioOverlayTrack) r14
            X.Jub r8 = new X.Jub
            r12 = r11
            r13 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r4
            r20 = r3
            r21 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
        L_0x0066:
            X.0eS.A00(r0)
            X.0rm r5 = X.C51965G9l.A11()
            r0 = r17
            if (r17 == 0) goto L_0x00b2
            com.instagram.api.schemas.TrackData r0 = r0.A06
            com.instagram.api.schemas.TrackDataImpl r1 = r0.FCv()
            java.lang.Integer r0 = r1.A06
            int r9 = X.AnonymousClass7TG.A0A(r0)
            r2 = 0
            com.instagram.music.common.model.MusicAssetModel r1 = com.instagram.music.common.model.MusicAssetModel.A01(r1, r2)
            com.instagram.music.common.model.AudioOverlayTrack r0 = new com.instagram.music.common.model.AudioOverlayTrack
            r0.<init>(r1, r2, r9)
            r5.A00 = r0
            android.content.Context r0 = r10.A01
            com.instagram.common.session.UserSession r2 = r10.A03
            X.Ins r1 = new X.Ins
            r1.<init>(r6, r0, r2)
            java.lang.Class<X.HqU> r0 = X.C55963HqU.class
            java.lang.Object r1 = r2.A01(r0, r1)
            X.HqU r1 = (X.C55963HqU) r1
            java.lang.Object r0 = r5.A00
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            r8.A01 = r15
            r8.A02 = r3
            r9 = r11
            r8.A03 = r11
            r8.A04 = r4
            r8.A05 = r5
            r8.A00 = r6
            java.lang.Object r0 = r1.A00(r0, r8)
            if (r0 != r7) goto L_0x0042
            return r7
        L_0x00b2:
            r9 = r11
            goto L_0x004c
        L_0x00b4:
            X.ME1 r8 = new X.ME1
            r8.<init>(r10, r6, r5)
            goto L_0x0020
        L_0x00bb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A01(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource, X.JVX, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.0rk} */
    /* JADX WARNING: type inference failed for: r20v1, types: [X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7 A[SYNTHETIC] */
    public static final java.lang.Object A02(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r16, java.util.List r17, java.util.List r18, java.util.List r19, X.AnonymousClass4D7 r20) {
        /*
            r15 = r16
            r4 = r17
            r5 = r19
            r11 = 1
            r3 = r20
            boolean r0 = r3 instanceof X.MDU
            if (r0 == 0) goto L_0x00f0
            r10 = r3
            X.MDU r10 = (X.MDU) r10
            int r0 = r10.A0A
            if (r0 != r11) goto L_0x00f0
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f0
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x001f:
            java.lang.Object r0 = r10.A09
            X.1Hj r9 = X.1Hj.A02
            int r1 = r10.A00
            if (r1 == 0) goto L_0x00dc
            if (r1 != r11) goto L_0x0107
            int r1 = r10.A01
            java.lang.Object r2 = r10.A08
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r8 = r10.A07
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r10.A06
            X.0rk r7 = (X.0rk) r7
            java.lang.Object r6 = r10.A05
            X.0rk r6 = (X.0rk) r6
            java.lang.Object r5 = r10.A04
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r10.A03
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r15 = r10.A02
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r15 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r15
            X.0eS.A00(r0)
        L_0x004a:
            r2.add(r0)
            int r0 = r7.A00
            int r0 = r0 + 1
            r7.A00 = r0
        L_0x0053:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r13 = r8.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L_0x0069
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            X.9bx r13 = (X.C381559bx) r13
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            java.util.List r0 = r13.A05
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x007b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r2 = r14.next()
            r0 = r2
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x007b
            r12.add(r2)
            goto L_0x007b
        L_0x0094:
            if (r5 == 0) goto L_0x00d7
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00d7
            int r0 = r5.size()
            int r1 = r1 % r0
            java.lang.Object r2 = X.00k.A0O(r5, r1)
            X.JVX r2 = (X.JVX) r2
        L_0x00a7:
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r1 = r13.A02
            java.lang.String r0 = r13.A04
            r10.A02 = r15
            r10.A03 = r4
            r10.A04 = r5
            r10.A05 = r6
            r10.A06 = r7
            r10.A07 = r8
            r10.A08 = r4
            r10.A01 = r3
            r10.A00 = r11
            r20 = r10
            r17 = r1
            r18 = r0
            r19 = r12
            r16 = r2
            java.lang.Object r0 = A01(r15, r16, r17, r18, r19, r20)
            if (r0 == r9) goto L_0x0106
            r1 = r3
            r2 = r4
            goto L_0x004a
        L_0x00d7:
            r2 = 0
            goto L_0x00a7
        L_0x00d9:
            r1 = r3
            goto L_0x0053
        L_0x00dc:
            X.0eS.A00(r0)
            X.0rk r6 = new X.0rk
            r6.<init>()
            X.0rk r7 = new X.0rk
            r7.<init>()
            java.util.Iterator r8 = r18.iterator()
            r1 = 0
            goto L_0x0053
        L_0x00f0:
            X.MDU r10 = new X.MDU
            r10.<init>(r15, r3, r11)
            goto L_0x001f
        L_0x00f7:
            com.instagram.common.session.UserSession r0 = r15.A03
            X.LF8 r2 = X.C63143KsB.A00(r0)
            int r1 = r6.A00
            int r0 = r7.A00
            r2.A00(r1, r0)
            X.0gF r9 = X.C60340gF.A00
        L_0x0106:
            return r9
        L_0x0107:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A02(com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource, java.util.List, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }
}
