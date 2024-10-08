package X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class JX1 {
    public L0A A00;
    public Map A01 = AnonymousClass7TE.A1E();
    public Map A02 = AnonymousClass7TE.A1E();
    public boolean A03;
    public boolean A04;
    public AtomicInteger A05;
    public final Context A06;
    public final AnonymousClass07i A07;
    public final 28D A08;
    public final UserSession A09;
    public final C273594mq A0A;
    public final JX2 A0B;
    public final C3499682q A0C;
    public final C273514mi A0D;
    public final C267834cI A0E;
    public final int A0F;
    public final Handler A0G = AnonymousClass7TF.A0D();
    public final C3499582p A0H;

    public JX1(Context context, AnonymousClass07i r3, 28D r4, UserSession userSession, C273594mq r6, JX2 jx2, C3499582p r8, C273514mi r9, C267834cI r10, int i) {
        DbW.A1N(r3, 3, r4);
        this.A06 = context;
        this.A09 = userSession;
        this.A07 = r3;
        this.A0H = r8;
        this.A08 = r4;
        this.A0E = r10;
        this.A0D = r9;
        this.A0A = r6;
        this.A0B = jx2;
        this.A0F = i;
        this.A0C = r8.A00();
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [java.lang.Object, X.LFT] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x007e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x002a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C279294yP r33, X.L0A r34, java.lang.Integer r35, java.util.List r36, java.util.Map r37, java.util.Map r38, float r39, boolean r40, boolean r41, boolean r42) {
        /*
            r32 = this;
            r0 = 3
            r1 = r37
            X.0qQ.A0B(r1, r0)
            r8 = r32
            r0 = r34
            r8.A00 = r0
            r0 = r40
            r8.A04 = r0
            r0 = r41
            r8.A03 = r0
            r8.A02 = r1
            r0 = r38
            r8.A01 = r0
            android.content.Context r0 = r8.A06
            r29 = r0
            com.instagram.common.session.UserSession r7 = r8.A09
            com.instagram.pendingmedia.store.PendingMediaStore r3 = X.28K.A00(r7)
            r31 = r36
            java.util.Iterator r6 = r31.iterator()
        L_0x002a:
            boolean r0 = r6.hasNext()
            r4 = 1
            if (r0 == 0) goto L_0x008d
            java.lang.Object r5 = r6.next()
            com.instagram.common.gallery.model.GalleryItem r5 = (com.instagram.common.gallery.model.GalleryItem) r5
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r2 = r5.A09
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            if (r2 != r1) goto L_0x0045
            r0 = 1
        L_0x0045:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r5.A0A
            X.3Q2 r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r0.A3Z
            if (r1 != 0) goto L_0x0069
            com.instagram.common.gallery.Medium r0 = r5.A00
            if (r0 != 0) goto L_0x0067
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x005e:
            com.instagram.common.gallery.Medium r0 = r5.A00
            if (r0 != 0) goto L_0x0067
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0067:
            java.lang.String r1 = r0.A0X
        L_0x0069:
            r0 = 0
            X.JYp r2 = X.C59796JYp.A01(r1, r0)
            X.0qQ.A07(r2)
            X.7IH r1 = new X.7IH
            r0 = r29
            r1.<init>(r0)
            boolean r0 = X.ABQ.A01(r2, r1, r4, r4)
            if (r0 != 0) goto L_0x002a
            X.8ZP r1 = X.AnonymousClass8ZO.A00(r7)
            java.lang.String r0 = "GalleryAlbumController_continueWithAlbumInvalidVideoClips"
            r1.A01(r0)
            return
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x008d:
            X.4mi r0 = r8.A0D
            r6 = 0
            if (r0 == 0) goto L_0x009d
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r1 = r0.A07
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0A(r6, r0)
        L_0x009d:
            int r1 = r31.size()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r8.A05 = r0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.82q r4 = r8.A0C
            r0 = r4
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r3 = r0.A01
            java.util.HashMap r10 = r3.A0O
            r10.clear()
            java.util.List r0 = r3.A0E
            java.util.Iterator r11 = r0.iterator()
        L_0x00be:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ef
            com.instagram.creation.base.MediaSession r9 = X.JTO.A0Z(r11)
            X.LFT r1 = new X.LFT
            r1.<init>()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r9.B5r()
            r1.A01(r0)
            X.A6E r0 = r9.BsX()
            r1.A05 = r0
            java.lang.String r0 = r9.B5g()
            r10.put(r0, r1)
            java.util.HashMap r2 = r3.A0P
            java.lang.String r1 = r9.B5g()
            java.lang.String r0 = r9.BbR()
            r2.put(r1, r0)
            goto L_0x00be
        L_0x00ef:
            X.4cI r1 = r8.A0E
            java.lang.String r0 = r3.A0C
            if (r0 == 0) goto L_0x00fd
            if (r1 == 0) goto L_0x00fd
            X.3Q2 r2 = r1.BbQ(r0)
            if (r2 != 0) goto L_0x010b
        L_0x00fd:
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r2 = new X.3Q2
            r2.<init>(r0)
            X.1iA r0 = X.1iA.A09
            r2.A0V(r0)
        L_0x010b:
            r0 = r33
            r2.A0h = r0
            java.lang.String r0 = r2.A35
            r4.EOM(r0)
            X.36W r0 = X.AnonymousClass36W.FOLLOWERS_SHARE
            r3.A0A = r0
            X.JWU r9 = new X.JWU
            r9.<init>(r0)
            com.instagram.model.creation.MediaCaptureConfig r1 = r3.A09
            if (r1 == 0) goto L_0x0137
            com.instagram.music.common.config.MusicAttributionConfig r0 = r1.A00
            if (r0 == 0) goto L_0x0127
            r9.A00 = r0
        L_0x0127:
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x012d
            r9.A01 = r0
        L_0x012d:
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x0133
            r9.A02 = r0
        L_0x0133:
            boolean r0 = r1.A04
            r9.A04 = r0
        L_0x0137:
            com.instagram.model.creation.MediaCaptureConfig r0 = new com.instagram.model.creation.MediaCaptureConfig
            r0.<init>((X.JWU) r9)
            r3.A09 = r0
            r30 = r39
            r0 = r30
            r3.A00 = r0
            X.514 r0 = r4.ANP()
            r3.A05 = r0
            java.util.Iterator r18 = r31.iterator()
        L_0x014e:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x032b
            java.lang.Object r10 = r18.next()
            com.instagram.common.gallery.model.GalleryItem r10 = (com.instagram.common.gallery.model.GalleryItem) r10
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x0280
            X.3Q2 r9 = r8.A00(r10)
            r14 = 1
            r12 = 0
            java.lang.String r13 = "Required value was null."
            if (r9 != 0) goto L_0x027a
            com.instagram.common.gallery.Medium r1 = r10.A00
            if (r1 == 0) goto L_0x0317
            java.lang.String r11 = r1.A0X
            java.util.HashMap r0 = r3.A0P
            java.lang.String r0 = X.DbS.A0r(r11, r0)
            if (r0 == 0) goto L_0x026e
            X.3Q2 r9 = X.JTQ.A0M(r7, r0)
            if (r9 == 0) goto L_0x026e
            r17 = 0
        L_0x0180:
            java.lang.String r0 = r1.A0Y
            r9.A3h = r0
            java.lang.String r0 = r1.A0X
            if (r0 == 0) goto L_0x018a
            r9.A3L = r0
        L_0x018a:
            boolean r0 = r9.A5U
            if (r0 != 0) goto L_0x0194
            boolean r0 = r9.A0x()
            if (r0 == 0) goto L_0x026a
        L_0x0194:
            java.lang.String r11 = r9.A3Z
            if (r11 == 0) goto L_0x0312
            X.JX2 r13 = r8.A0B
            if (r13 == 0) goto L_0x026a
            java.lang.Integer r1 = r13.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x026a
            float r16 = r13.A00()
        L_0x01a6:
            java.lang.String r0 = r10.A0A
            r9.A30 = r0
            com.instagram.common.gallery.Medium r0 = r10.A00
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = r0.A0X
            X.AnonymousClass8VQ.A05(r9, r0)
        L_0x01b3:
            X.C63996LHw.A01(r10, r7, r9)
            java.lang.String r13 = r2.A35
            X.28D r1 = r8.A08
            java.util.List r0 = X.AnonymousClass7TE.A1I(r10)
            int r0 = X.C63996LHw.A00(r1, r0)
            X.JZ1.A05(r4, r9, r13, r11, r0)
            r5.add(r9)
            com.instagram.common.gallery.Medium r13 = r10.A00
            if (r13 == 0) goto L_0x0201
            int r10 = r13.A0B
            int r1 = r13.A04
            r0 = r30
            android.graphics.Rect r15 = X.JW0.A00(r0, r10, r1, r14, r12)
            java.util.List r0 = r4.Co4()
            java.lang.Object r14 = X.00k.A0L(r0)
            com.instagram.creation.base.MediaSession r14 = (com.instagram.creation.base.MediaSession) r14
            if (r14 == 0) goto L_0x01ee
            int r10 = r13.A0B
            int r1 = r13.A04
            com.instagram.creation.base.CropInfo r0 = new com.instagram.creation.base.CropInfo
            r0.<init>(r15, r10, r1)
            r14.ETK(r0)
        L_0x01ee:
            java.util.List r0 = r4.Co4()
            java.lang.Object r10 = X.00k.A0L(r0)
            com.instagram.creation.base.MediaSession r10 = (com.instagram.creation.base.MediaSession) r10
            if (r10 == 0) goto L_0x0201
            long r0 = r13.A01()
            r10.EPg(r0)
        L_0x0201:
            X.JYp r11 = X.C59796JYp.A01(r11, r12)
            X.0qQ.A07(r11)
            if (r17 == 0) goto L_0x0258
            long r0 = X.C63469KxY.A00(r7)
            long r24 = X.AnonymousClass30M.A03(r0)
            r19 = r7
            r20 = r4
            r21 = r9
            r22 = r11
            r23 = r16
            X.JZ1.A02(r19, r20, r21, r22, r23, r24)
        L_0x021f:
            java.lang.String r0 = r9.A33
            if (r0 != 0) goto L_0x0253
            X.0wX r13 = r7.A03
            android.content.Context r10 = r13.A06()
            com.instagram.pendingmedia.model.ClipInfo r0 = r9.A1N
            int r1 = r0.A09
            r0 = r16
            android.graphics.Point r0 = X.AEW.A01(r10, r7, r0, r1)
            int r12 = r0.x
            int r11 = r0.y
            android.content.Context r10 = r13.A06()
            X.07i r1 = r8.A07
            X.KH5 r0 = new X.KH5
            r19 = r0
            r20 = r8
            r22 = r2
            r23 = r5
            r24 = r12
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.1ES.A00(r10, r1, r0)
            goto L_0x014e
        L_0x0253:
            A04(r8, r2, r5)
            goto L_0x014e
        L_0x0258:
            com.instagram.pendingmedia.model.ClipInfo r10 = r9.A1N
            long r0 = r11.A03
            r19 = r4
            r20 = r10
            r21 = r9
            r22 = r16
            r23 = r0
            X.JZ1.A04(r19, r20, r21, r22, r23)
            goto L_0x021f
        L_0x026a:
            r16 = r30
            goto L_0x01a6
        L_0x026e:
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r9 = X.AnonymousClass9T3.A02(r0)
            r17 = 1
            goto L_0x0180
        L_0x027a:
            java.lang.String r11 = ""
            r17 = 1
            goto L_0x018a
        L_0x0280:
            java.lang.Integer r1 = r10.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x030d
            java.util.Map r0 = r8.A01
            java.lang.String r1 = r10.A0A
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x030d
            com.instagram.common.gallery.Medium r0 = r10.A00
            java.lang.String r12 = "Required value was null."
            if (r0 == 0) goto L_0x0326
            android.net.Uri r25 = r0.A02()
            java.util.Map r0 = r8.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0308
            java.util.Map r0 = r8.A02
            java.lang.Object r0 = r0.get(r1)
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r0 = (com.instagram.creation.capture.gallery.GalleryPreviewInfo) r0
            if (r0 == 0) goto L_0x0321
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0321
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
        L_0x02b4:
            android.net.Uri r20 = android.net.Uri.fromFile(r0)
            r28 = 1
            X.JaW r23 = new X.JaW
            r24 = r29
            r26 = r20
            r27 = r7
            r23.<init>(r24, r25, r26, r27, r28)
            X.28D r1 = r8.A08
            java.util.List r0 = X.AnonymousClass7TE.A1I(r10)
            int r9 = X.C63996LHw.A00(r1, r0)
            java.lang.String r11 = r20.getPath()
            if (r11 == 0) goto L_0x031c
            java.lang.String r1 = r25.toString()
            r0 = 0
            r3.A07(r11, r1, r0)
            r3.A02 = r9
            java.util.List r0 = r4.Co4()
            java.lang.Object r0 = X.00k.A0L(r0)
            com.instagram.creation.base.MediaSession r0 = (com.instagram.creation.base.MediaSession) r0
            if (r0 == 0) goto L_0x02ee
            r0.EdE(r9)
        L_0x02ee:
            X.07i r9 = r8.A07
            X.KHB r1 = new X.KHB
            r26 = r42
            r24 = r2
            r25 = r5
            r19 = r1
            r21 = r10
            r22 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r0 = r29
            X.1ES.A00(r0, r9, r1)
            goto L_0x014e
        L_0x0308:
            java.io.File r0 = X.0mb.A04(r29)
            goto L_0x02b4
        L_0x030d:
            A01(r10, r8, r2, r6, r5)
            goto L_0x014e
        L_0x0312:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0317:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x031c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0321:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x0326:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x032b:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r31.iterator()
        L_0x0333:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0349
            com.instagram.common.gallery.Medium r0 = X.JTP.A0O(r1)
            if (r0 == 0) goto L_0x0333
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A0G
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0333
            r3.add(r0)
            goto L_0x0333
        L_0x0349:
            java.lang.String r0 = ""
            java.lang.String r4 = X.C59737JVv.A02(r7, r0, r3)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r31.iterator()
        L_0x0357:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0369
            com.instagram.common.gallery.Medium r0 = X.JTP.A0O(r1)
            if (r0 == 0) goto L_0x0357
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A0G
            r3.add(r0)
            goto L_0x0357
        L_0x0369:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = X.AnonymousClass3QN.A00(r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A13 = r1
            r1.A03 = r4
            X.28D r1 = r8.A08
            r0 = r31
            int r0 = X.C63996LHw.A00(r1, r0)
            r2.A0K = r0
            boolean r0 = r8.A04
            if (r0 != 0) goto L_0x038c
            X.6SR r1 = X.AnonymousClass6SR.A01()
            java.lang.String r0 = "edit_carousel"
            r1.A05(r7, r0)
        L_0x038c:
            X.JX9 r3 = X.JWX.A00(r7)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r31.iterator()
        L_0x0398:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03aa
            java.lang.Object r0 = r1.next()
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
            java.lang.String r0 = r0.A0A
            r2.add(r0)
            goto L_0x0398
        L_0x03aa:
            r0 = r35
            r3.A01 = r0
            java.util.List r0 = r3.A03
            r0.clear()
            r0.addAll(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JX1.A05(X.4yP, X.L0A, java.lang.Integer, java.util.List, java.util.Map, java.util.Map, float, boolean, boolean, boolean):void");
    }

    private final AnonymousClass3Q2 A00(GalleryItem galleryItem) {
        Map map = this.A01;
        String str = galleryItem.A0A;
        if (map.containsKey(str)) {
            return (AnonymousClass3Q2) this.A01.get(str);
        }
        if (galleryItem.A09 == AnonymousClass05K.A01) {
            return JTQ.A0M(this.A09, str);
        }
        return null;
    }

    public static final void A01(GalleryItem galleryItem, JX1 jx1, AnonymousClass3Q2 r14, String str, List list) {
        Location location;
        String str2;
        Map map = jx1.A02;
        String str3 = galleryItem.A0A;
        Object obj = map.get(str3);
        if (obj != null) {
            GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) obj;
            ExifImageData exifImageData = galleryPreviewInfo.A01;
            if (exifImageData != null) {
                String str4 = null;
                if (exifImageData.A01 == null || exifImageData.A02 == null) {
                    location = null;
                } else {
                    location = new Location("photo");
                    Double d = exifImageData.A01;
                    if (d != null) {
                        location.setLatitude(d.doubleValue());
                        Double d2 = exifImageData.A02;
                        if (d2 != null) {
                            location.setLongitude(d2.doubleValue());
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                AnonymousClass3Q2 A002 = jx1.A00(galleryItem);
                if (A002 == null) {
                    A002 = JTQ.A0M(jx1.A09, DbS.A0r(galleryPreviewInfo.A02, ((JWE) jx1.A0C).A01.A0P));
                    if (A002 == null) {
                        A002 = AnonymousClass9T3.A01(JTQ.A0Z());
                    }
                }
                String str5 = galleryPreviewInfo.A02;
                if (str5 == null) {
                    0kD.A07("GalleryAlbumController_importLoadedPhotoToAlbum", "info.imagePath is null", (Throwable) null);
                    A02(jx1);
                    return;
                }
                C3499682q r10 = jx1.A0C;
                CreationSession creationSession = ((JWE) r10).A01;
                if (creationSession.A03(str5) == null) {
                    int A003 = C63996LHw.A00(jx1.A08, AnonymousClass7TE.A1I(galleryItem));
                    Medium medium = galleryItem.A00;
                    if (medium != null) {
                        str4 = medium.A0W;
                    }
                    creationSession.A07(str5, str4, false);
                    creationSession.A02 = A003;
                    MediaSession mediaSession = (MediaSession) 00k.A0L(r10.Co4());
                    if (mediaSession != null) {
                        mediaSession.EdE(A003);
                    }
                }
                PhotoSession A032 = creationSession.A03(str5);
                if (A032 != null) {
                    A032.A0A = A002.A35;
                    A032.A05 = galleryPreviewInfo.A00;
                    A032.A04 = location;
                    ((C64919LkJ) A032.A0D).A00.A01 = exifImageData.A00;
                    A002.A30 = str3;
                    A002.A3O = r14.A35;
                    Medium medium2 = galleryItem.A00;
                    if (medium2 != null) {
                        AnonymousClass8VQ.A05(A002, medium2.A0X);
                        medium2 = galleryItem.A00;
                        if (medium2 != null) {
                            A002.A3L = medium2.A0X;
                            A002.A3M = medium2.A0W;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    if (str != null) {
                        A002.A3K = str;
                    }
                    if (medium2 != null) {
                        str2 = medium2.A0Y;
                    } else {
                        str2 = null;
                    }
                    A002.A3h = str2;
                    A002.A44 = exifImageData.A03;
                    C63996LHw.A01(galleryItem, jx1.A09, A002);
                    List list2 = list;
                    list2.add(A002);
                    A04(jx1, r14, list2);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A02(JX1 jx1) {
        JWG jwg;
        if (jx1.A05 != null) {
            jx1.A05 = null;
            C273514mi r0 = jx1.A0D;
            if (!(r0 == null || (jwg = ((MediaCaptureActivity) r0).A07) == null)) {
                jwg.A08(AnonymousClass05K.A00);
            }
            jx1.A0C.EOM((String) null);
            C59689JTv.A0C(C51966G9m.A0P(jx1.A09), "import_album_failed");
        }
    }

    public static final void A03(JX1 jx1, AnonymousClass3Q2 r6, List list) {
        1ud r1 = 1ua.A0G;
        UserSession userSession = jx1.A09;
        r1.A01(C51966G9m.A0P(userSession), userSession).A0H(r6, list);
        LI1.A01((Activity) 0mE.A01(jx1.A06, Activity.class), jx1.A08, userSession, jx1.A0H, jx1.A0F);
    }

    public static final void A04(JX1 jx1, AnonymousClass3Q2 r4, List list) {
        boolean z = !((JWE) jx1.A0C).A01.A0O.isEmpty();
        AtomicInteger atomicInteger = jx1.A05;
        if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
            jx1.A0G.post(new M9N(jx1, r4, list, z));
            jx1.A05 = null;
        }
    }
}
