package X;

import android.content.Context;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.55Z  reason: invalid class name */
public final class AnonymousClass55Z implements 1us {
    public int A00;
    public MediaCroppingCoordinates A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final ShareType A06 = ShareType.CLIPS;

    public final /* bridge */ /* synthetic */ Object AEc(AnonymousClass3Q2 r2) {
        0qQ.A0B(r2, 0);
        return new L3S(this, r2);
    }

    public final /* synthetic */ void DCv(AnonymousClass1XT r1, UserSession userSession, AnonymousClass3Q2 r3) {
    }

    public final 1Xj Dou(Context context, AnonymousClass1XT r8, UserSession userSession, AnonymousClass3Q2 r10) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(context, 3);
        0qQ.A0C(r8, AnonymousClass000.A00(1638));
        1Xj r5 = ((K1X) r8).A00;
        if (r5 != null) {
            0sn A002 = AnonymousClass8OY.A00(userSession).A00(r10.A3t);
            if (A002 == null) {
                A002 = 0sn.A00;
            }
            List<User> A3Y = r5.A3Y();
            1as.A04.A0G(userSession, "CLIP", A3Y, A002);
            for (User user : A3Y) {
                if (AnonymousClass8OY.A01(userSession) || A002.contains(user.getId())) {
                    1as.A04.A0A(userSession, r5, new DirectShareTarget(user));
                }
            }
            return r5;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final K1X E1q(2ZL r4, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        return new C64842Lj4(new 0bH(userSession), new C64589LeZ()).A00(r4);
    }

    public final void E3L(UserSession userSession, AnonymousClass3Q2 r6, LFD lfd) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(lfd, 2);
        lfd.A00(r6.A1C, r6, false);
        AnonymousClass1Nd.A00(userSession).A00(new C2370936h(r6));
        AnonymousClass1Nd.A00(userSession).A00(new C320766su(userSession.A06, false));
    }

    public final String getTypeName() {
        return "ClipsVideoShareTarget";
    }

    public final ShareType BtR() {
        return this.A06;
    }

    public final int C2A() {
        return this.A00;
    }

    public final boolean CQR() {
        return this.A03;
    }

    public final boolean CT0() {
        return false;
    }

    public final boolean CT1() {
        return false;
    }

    public final boolean CUN() {
        if (this.A02 != null) {
            return true;
        }
        return false;
    }

    public final void ESc(boolean z) {
        this.A03 = z;
    }

    public final void EnN(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v150, types: [X.L1x, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cc, code lost:
        if (r10.length() == 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05f2, code lost:
        if (r0.A4c.size() <= 1) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x09c0, code lost:
        if (r8.isEmpty() != false) goto L_0x09c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0c59, code lost:
        r5 = r2.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0c61, code lost:
        if ((!r5.isEmpty()) == false) goto L_0x0c76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0c63, code lost:
        r6 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0c6b, code lost:
        if (r6.hasNext() == false) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0c6d, code lost:
        ((X.AnonymousClass55X) r6.next()).A01 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0c76, code lost:
        r5 = java.util.Collections.singletonList(X.C63184Ksr.A00(new com.instagram.feed.media.CameraToolInfo(r11, (java.lang.Float) null, (java.lang.Float) null, (java.lang.Float) null), 0));
        X.0qQ.A07(r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x06c3  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x070c  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x07b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass1QX AEQ(android.content.Context r88, X.28D r89, com.instagram.common.gallery.metadata.MediaUploadMetadata r90, com.instagram.common.session.UserSession r91, com.instagram.pendingmedia.model.constants.ShareType r92, java.lang.Object r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.util.List r101, long r102, boolean r104, boolean r105, boolean r106, boolean r107, boolean r108) {
        /*
            r87 = this;
            r7 = r93
            X.L3S r7 = (X.L3S) r7
            r16 = 0
            r5 = r88
            r0 = r16
            X.0qQ.A0B(r5, r0)
            r6 = 1
            r3 = r91
            X.0qQ.A0B(r3, r6)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            r0 = 4
            r2 = r94
            X.0qQ.A0B(r2, r0)
            r0 = 5
            r15 = r95
            X.0qQ.A0B(r15, r0)
            r0 = 6
            r1 = r96
            X.0qQ.A0B(r1, r0)
            r0 = 9
            r1 = r92
            X.0qQ.A0B(r1, r0)
            r0 = 12
            r4 = r90
            X.0qQ.A0B(r4, r0)
            X.1Av r9 = X.1Au.A00(r3)
            X.0s0 r8 = r9.A61
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 486(0x1e6, float:6.81E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r8.CDM(r9, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006c
            X.3Q2 r0 = r7.A01
            X.MW1 r0 = X.C63365Kvm.A00(r0)
            X.JxB r0 = r0.Aqi()
            if (r0 != 0) goto L_0x006c
            r1 = 817901202(0x30c02e92, float:1.3983075E-9)
            java.lang.String r0 = "Content scheduling metadata expected"
            X.0f9 r1 = X.0wj.A00(r0, r1, r6)
            java.lang.String r0 = "is_reel"
            r1.ABR(r0, r6)
            r1.report()
        L_0x006c:
            X.1Av r1 = X.1Au.A00(r3)
            r0 = r16
            r1.A1J(r0)
            X.3Q2 r0 = r7.A01
            X.MW1 r1 = X.C63365Kvm.A00(r0)
            X.JxB r1 = r1.Aqi()
            r11 = 0
            if (r1 == 0) goto L_0x0083
            r11 = 1
        L_0x0083:
            if (r107 == 0) goto L_0x06a9
            X.UzA r20 = X.C16674UzA.CLIPS_ASYNC
        L_0x0087:
            java.lang.String r23 = X.0qv.A00(r5)
            X.0qQ.A07(r23)
            r24 = r99
            r22 = r97
            r29 = r106
            r28 = r105
            r27 = r104
            r5 = r89
            r26 = r101
            r25 = r100
            r17 = r5
            r18 = r4
            r19 = r3
            r21 = r2
            r30 = r16
            X.1NY r1 = X.C64193LTa.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.28D r2 = X.28D.A5H
            if (r5 == r2) goto L_0x00b4
            X.28D r2 = X.28D.A5F
            if (r5 != r2) goto L_0x0104
        L_0x00b4:
            X.8nf r2 = X.C365768ne.A0A
            X.8ne r2 = r2.A00()
            java.lang.String r8 = r2.A06
            java.lang.String r5 = r2.A07
            java.lang.String r10 = r4.A03
            java.lang.String r2 = "app_attribution_id"
            r1.A9m(r2, r8)
            if (r10 == 0) goto L_0x00ce
            int r2 = r10.length()
            r9 = 0
            if (r2 != 0) goto L_0x00cf
        L_0x00ce:
            r9 = 1
        L_0x00cf:
            r2 = 507(0x1fb, float:7.1E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r2)
            if (r9 != 0) goto L_0x06a4
            X.0sn r2 = X.0sn.A00
            X.Kp0 r2 = X.C59737JVv.A01(r3, r10, r2)
            if (r2 == 0) goto L_0x06a4
            boolean r2 = r2.A03()
            if (r2 != r6) goto L_0x06a4
            r1.A9m(r4, r10)
        L_0x00e8:
            r2 = 257(0x101, float:3.6E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.A9m(r2, r5)
            if (r8 == 0) goto L_0x00f9
            int r2 = r8.length()
            if (r2 != 0) goto L_0x0104
        L_0x00f9:
            X.S4n r4 = X.C9851RiQ.A00(r3)
            if (r4 == 0) goto L_0x0104
            java.lang.String r2 = "missing_app_id_before_uploading"
            r4.A00(r2)
        L_0x0104:
            X.LBT r19 = X.C63368Kvp.A00(r0)
            r20 = r102
            r17 = r1
            r18 = r3
            r22 = r27
            X.C64193LTa.A0J(r17, r18, r19, r20, r22)
            X.MW1 r4 = X.C63365Kvm.A00(r0)
            r2 = r16
            X.C64193LTa.A0I(r1, r3, r4, r2)
            r8 = r87
            if (r11 != 0) goto L_0x012d
            java.lang.String r4 = r8.A02
            if (r4 == 0) goto L_0x012d
            r2 = 1395(0x573, float:1.955E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r1.A9m(r2, r4)
        L_0x012d:
            X.0Tu r9 = X.0Tu.A05
            r4 = 36310881881031008(0x81008e00000160, double:3.0264861415249823E-306)
            boolean r2 = X.182.A06(r9, r3, r4)
            if (r2 == 0) goto L_0x0160
            X.1Av r2 = X.1Au.A00(r3)
            java.lang.String r4 = "reel"
            boolean r2 = r2.A24(r4)
            if (r2 == 0) goto L_0x0160
            X.1Av r2 = X.1Au.A00(r3)
            java.util.Set r2 = r2.A0I(r4)
            java.util.List r2 = X.00k.A0X(r2)
            java.util.Set r4 = X.00k.A0k(r2)
            X.L1x r2 = new X.L1x
            r2.<init>()
            r2.A00 = r4
            X.C64193LTa.A0K(r1, r2)
        L_0x0160:
            boolean r2 = r8.A04
            r19 = r2
            X.55Z r4 = r7.A00
            X.JxB r2 = r0.A0v
            r14 = 10
            java.lang.String r5 = "null"
            if (r2 == 0) goto L_0x04ec
            X.3QO r27 = X.AnonymousClass3QO.DEFAULT
            java.lang.String r2 = r0.A2Z
            r34 = r2
            java.lang.String r2 = r0.A2V
            r35 = r2
            java.lang.String r2 = r0.A2X
            r36 = r2
            boolean r2 = r4.A05
            r68 = r2
            com.instagram.api.schemas.MediaCroppingCoordinates r2 = r4.A01
            r24 = r2
            java.lang.Boolean r2 = r0.A1y
            if (r2 == 0) goto L_0x04e8
            boolean r69 = r2.booleanValue()
        L_0x018c:
            java.lang.Boolean r2 = r0.A23
            if (r2 == 0) goto L_0x04e4
            boolean r70 = r2.booleanValue()
        L_0x0194:
            java.lang.Boolean r2 = r0.A21
            if (r2 == 0) goto L_0x04e0
            boolean r71 = r2.booleanValue()
        L_0x019c:
            java.lang.String r2 = r0.A3R
            r37 = r2
            java.lang.String r2 = r0.A3S
            r38 = r2
            java.lang.Integer r2 = r0.A2C
            r32 = r2
            java.util.List r2 = r0.A4N
            r49 = r2
            com.instagram.share.facebook.model.FBReelsAudienceType r2 = r0.A1n
            r31 = r2
            java.lang.String r2 = r0.A2w
            r39 = r2
            com.instagram.pendingmedia.model.ClipInfo r2 = r0.A1N
            r29 = r2
            java.util.Set r2 = r0.A4u
            java.util.Set r2 = X.SAR.A00(r2)
            java.util.Set r64 = X.SAR.A01(r2)
            java.util.List r2 = r0.A4Y
            r50 = r2
            java.util.List r10 = r0.A4o
            if (r10 != 0) goto L_0x01cc
            X.0sn r10 = X.0sn.A00
        L_0x01cc:
            java.util.List r2 = r0.A4J
            r52 = r2
            java.util.List r2 = r0.A4b
            com.instagram.music.common.model.MusicOverlayStickerModel r28 = X.C271404in.A05(r2)
            java.util.List r2 = r0.A4W
            r53 = r2
            java.util.ArrayList r54 = r0.A0J()
            if (r54 != 0) goto L_0x01e2
            X.0sn r54 = X.0sn.A00
        L_0x01e2:
            java.util.List r2 = r0.A4E
            r55 = r2
            java.util.List r2 = r0.A4D
            r56 = r2
            X.51W r2 = r0.A1P
            if (r2 == 0) goto L_0x04dc
            java.util.ArrayList r57 = r2.A00()
        L_0x01f2:
            r21 = 0
            X.3QS r2 = r0.A1V
            r30 = r2
            X.8J0 r2 = r0.A12
            r26 = r2
            boolean r2 = r0.A5I
            r73 = r2
            boolean r2 = r0.A5N
            r74 = r2
            java.lang.Integer r2 = r0.A26
            r33 = r2
            java.lang.String r2 = r0.A3f
            r40 = r2
            X.3QD r4 = r0.A6J
            X.3QD r2 = X.AnonymousClass3QD.CONFIGURED_CLOUD_DRAFT
            r75 = 0
            if (r4 != r2) goto L_0x0216
            r75 = 1
        L_0x0216:
            java.lang.String r2 = r0.A3U
            r41 = r2
            X.0sn r58 = X.0sn.A00
            java.lang.String r2 = r0.A3I
            r42 = r2
            java.lang.String r2 = r0.A2b
            r43 = r2
            java.util.List r2 = r0.A4b
            r59 = r2
            java.util.List r2 = r0.A4g
            r60 = r2
            java.util.List r2 = r0.A4P
            r61 = r2
            boolean r2 = r0.A4y
            r76 = r2
            boolean r2 = r0.A62
            r77 = r2
            java.lang.String r4 = r0.A3n
            if (r4 == 0) goto L_0x0494
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x0494
        L_0x0242:
            java.lang.String r2 = r0.A3P
            r45 = r2
            java.lang.String r2 = r0.A2c
            r46 = r2
            java.lang.String r2 = r0.A3i
            r47 = r2
            boolean r2 = r0.A5a
            r78 = r2
            boolean r2 = r0.A5s
            r79 = r2
            boolean r2 = r0.A5Y
            r80 = r2
            boolean r2 = r0.A4w
            r81 = r2
            X.JxB r2 = r0.A0v
            r23 = r2
            java.lang.String r2 = r0.A3G
            r48 = r2
            boolean r2 = r0.A6D
            r82 = r2
            int r2 = r0.A0L
            r66 = r2
            boolean r2 = r0.A6E
            r83 = r2
            float r65 = r0.A00()
            java.util.List r2 = r0.A4I
            r18 = r2
            boolean r2 = r0.A54
            r17 = r2
            boolean r13 = r0.A6A
            java.util.List r12 = r0.A4K
            boolean r11 = r0.A6B
            boolean r2 = r0.A5M
            if (r2 != 0) goto L_0x0491
            r7 = 36328194894347322(0x81104d00023c3a, double:3.037434960860128E-306)
            boolean r2 = X.182.A06(r9, r3, r7)
            if (r2 == 0) goto L_0x0491
            int r5 = r0.A05
        L_0x0295:
            X.LQn r2 = new X.LQn
            r20 = r2
            r22 = r21
            r25 = r21
            r44 = r4
            r51 = r10
            r62 = r18
            r63 = r12
            r67 = r5
            r72 = r16
            r84 = r17
            r85 = r13
            r86 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
        L_0x02b2:
            X.LBT r23 = X.C63368Kvp.A00(r0)
            r4 = 5
            r0 = r23
            X.0qQ.A0B(r0, r4)
            java.lang.String r4 = r2.A0L
            java.lang.String r0 = "caption"
            r1.A9m(r0, r4)
            int r0 = r2.A01
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cover_frame_time_ms"
            r1.A9m(r0, r4)
            java.lang.String r4 = r2.A0M
            if (r4 == 0) goto L_0x02e1
            int r0 = r4.length()
            if (r0 == 0) goto L_0x02e1
            r0 = 540(0x21c, float:7.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A9m(r0, r4)
        L_0x02e1:
            java.lang.String r4 = r2.A0K
            if (r4 == 0) goto L_0x02f0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x02f0
            java.lang.String r0 = "camera_session_id"
            r1.A9m(r0, r4)
        L_0x02f0:
            boolean r4 = r2.A10
            java.lang.String r0 = "1"
            if (r4 == 0) goto L_0x02fb
            java.lang.String r4 = "clips_share_preview_to_feed"
            r1.A9m(r4, r0)
        L_0x02fb:
            com.instagram.api.schemas.MediaCroppingCoordinates r4 = r2.A05
            if (r4 == 0) goto L_0x0308
            java.lang.String r5 = X.1qm.A00(r4)
            java.lang.String r4 = "cover_photo_square_crop"
            r1.AA0(r4, r5)
        L_0x0308:
            X.7wN r5 = X.C347167wN.A00
            r4 = r16
            boolean r4 = r5.A00(r3, r4)
            java.lang.String r18 = "0"
            if (r4 == 0) goto L_0x032e
            java.lang.String r4 = r3.A06
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x032e
            if (r19 != 0) goto L_0x032e
            boolean r4 = r2.A11
            r5 = r18
            if (r4 == 0) goto L_0x0325
            r5 = r0
        L_0x0325:
            r4 = 4971(0x136b, float:6.966E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r5)
        L_0x032e:
            java.lang.String r5 = r2.A0P
            if (r5 == 0) goto L_0x033d
            int r4 = r5.length()
            if (r4 == 0) goto L_0x033d
            java.lang.String r4 = "funded_content_deal_id"
            r1.A9m(r4, r5)
        L_0x033d:
            java.lang.String r5 = r2.A0X
            if (r5 == 0) goto L_0x0350
            int r4 = r5.length()
            if (r4 == 0) goto L_0x0350
            r4 = 1879(0x757, float:2.633E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r5)
        L_0x0350:
            java.lang.String r5 = r2.A0S
            if (r5 == 0) goto L_0x035f
            int r4 = r5.length()
            if (r4 == 0) goto L_0x035f
            java.lang.String r4 = "parent_template_clips_media_id"
            r1.A9m(r4, r5)
        L_0x035f:
            java.lang.String r5 = r2.A0O
            if (r5 == 0) goto L_0x036e
            int r4 = r5.length()
            if (r4 == 0) goto L_0x036e
            java.lang.String r4 = "draft_id"
            r1.A9m(r4, r5)
        L_0x036e:
            java.lang.String r5 = r2.A0W
            if (r5 == 0) goto L_0x037d
            int r4 = r5.length()
            if (r4 == 0) goto L_0x037d
            java.lang.String r4 = "ranking_info_token"
            r1.A9m(r4, r5)
        L_0x037d:
            java.lang.String r5 = r2.A0N
            if (r5 == 0) goto L_0x0386
            java.lang.String r4 = "clips_creation_entry_point"
            r1.A9m(r4, r5)
        L_0x0386:
            boolean r8 = r2.A0z
            r4 = 5224(0x1468, float:7.32E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r4)
            r4 = 5223(0x1467, float:7.319E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r4)
            if (r8 == 0) goto L_0x03b1
            java.lang.String r4 = r3.A06
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x03b1
            r1.A9m(r7, r0)
            java.lang.String r4 = r2.A0T
            r1.A9m(r5, r4)
            java.lang.String r8 = r2.A0U
            r4 = 778(0x30a, float:1.09E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r8)
        L_0x03b1:
            boolean r4 = r2.A12
            r17 = 0
            if (r4 == 0) goto L_0x03f8
            java.lang.String r4 = r3.A06
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x03f8
            if (r19 != 0) goto L_0x03f8
            r1.A9m(r7, r0)
            java.lang.String r4 = r2.A0T
            r1.A9m(r5, r4)
            java.lang.Integer r4 = r2.A0I
            if (r4 == 0) goto L_0x03da
            java.lang.String r5 = X.C63425Kwl.A00(r4)
            r4 = 4673(0x1241, float:6.548E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r5)
        L_0x03da:
            java.util.List r4 = r2.A0e
            if (r4 == 0) goto L_0x03e7
            java.lang.String r5 = X.0mh.A00(r4)
            java.lang.String r4 = "cross_app_share_fb_validation_check_bypass"
            r1.AA0(r4, r5)
        L_0x03e7:
            com.instagram.share.facebook.model.FBReelsAudienceType r4 = r2.A0C
            if (r4 == 0) goto L_0x03f8
            X.XRN r4 = r4.A00
            if (r4 == 0) goto L_0x048d
            java.lang.String r5 = r4.name()
        L_0x03f3:
            java.lang.String r4 = "share_to_fb_destination_audience_type"
            r1.A9m(r4, r5)
        L_0x03f8:
            java.util.Set r4 = r2.A0o
            java.util.Set r8 = java.util.Collections.unmodifiableSet(r4)
            X.0qQ.A07(r8)
            boolean r4 = r8.isEmpty()
            r5 = r4 ^ 1
            r4 = 4900(0x1324, float:6.866E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r4)
            if (r5 == 0) goto L_0x0454
            java.lang.String r4 = ","
            X.3El r5 = new X.3El
            r5.<init>(r4)
            java.util.Set r4 = X.SAR.A00(r8)
            java.lang.String r4 = r5.A02(r4)
        L_0x041e:
            r1.A9m(r7, r4)
        L_0x0421:
            java.util.List r7 = r2.A0k
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            X.0qQ.A07(r4)
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.Iterator r10 = r4.iterator()
        L_0x0433:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x06ad
            java.lang.Object r5 = r10.next()
            r4 = r5
            X.3ui r4 = (X.C255783ui) r4
            java.lang.String r8 = r4.A1h
            X.6oG r4 = X.C318046oG.KARAOKE_CAPTION
            java.lang.String r4 = r4.toString()
            boolean r4 = X.0qQ.A0K(r8, r4)
            if (r4 == 0) goto L_0x0433
            r4 = r19
            r4.add(r5)
            goto L_0x0433
        L_0x0454:
            X.3QO r8 = r2.A08
            X.3QO r4 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r8 != r4) goto L_0x047b
            r4 = 36316087381659572(0x81054a00040fb4, double:3.029778121083355E-306)
            boolean r4 = X.182.A06(r9, r3, r4)
            if (r4 == 0) goto L_0x047b
            X.9sz r4 = X.C391429sz.A0C
        L_0x0467:
            java.lang.String r5 = r4.toString()
            r4 = r16
            X.0qQ.A0B(r5, r4)
            java.util.Map r4 = X.C391429sz.A01
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x041e
        L_0x047b:
            X.3QO r4 = X.AnonymousClass3QO.FOLLOWERS_ONLY
            if (r8 != r4) goto L_0x0421
            r4 = 36316087382249401(0x81054a000d0fb9, double:3.029778121456365E-306)
            boolean r4 = X.182.A06(r9, r3, r4)
            if (r4 == 0) goto L_0x0421
            X.9sz r4 = X.C391429sz.A0d
            goto L_0x0467
        L_0x048d:
            r5 = r17
            goto L_0x03f3
        L_0x0491:
            r5 = 0
            goto L_0x0295
        L_0x0494:
            java.util.List r2 = r0.A4J
            if (r2 == 0) goto L_0x04d9
            int r7 = X.0Yv.A1E(r2, r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r7)
            java.util.Iterator r7 = r2.iterator()
        L_0x04a5:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x04bd
            java.lang.Object r2 = r7.next()
            X.4aA r2 = (X.C266684aA) r2
            X.9JE r2 = r2.A05
            if (r2 == 0) goto L_0x04bb
            java.lang.String r2 = r2.A04
        L_0x04b7:
            r4.add(r2)
            goto L_0x04a5
        L_0x04bb:
            r2 = 0
            goto L_0x04b7
        L_0x04bd:
            java.util.Iterator r7 = r4.iterator()
        L_0x04c1:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x04d7
            java.lang.Object r4 = r7.next()
            if (r4 == 0) goto L_0x04c1
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x04c1
        L_0x04d3:
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0242
        L_0x04d7:
            r4 = 0
            goto L_0x04d3
        L_0x04d9:
            r4 = 0
            goto L_0x0242
        L_0x04dc:
            r57 = 0
            goto L_0x01f2
        L_0x04e0:
            r71 = 0
            goto L_0x019c
        L_0x04e4:
            r70 = 0
            goto L_0x0194
        L_0x04e8:
            r69 = 0
            goto L_0x018c
        L_0x04ec:
            X.3QO r2 = r0.A1F
            r27 = r2
            java.lang.String r2 = r0.A2Z
            r34 = r2
            java.lang.String r2 = r0.A2V
            r35 = r2
            java.lang.String r2 = r0.A2X
            r36 = r2
            boolean r2 = r4.A05
            r68 = r2
            com.instagram.api.schemas.MediaCroppingCoordinates r2 = r4.A01
            r24 = r2
            java.lang.Boolean r2 = r0.A1y
            if (r2 == 0) goto L_0x06a0
            boolean r69 = r2.booleanValue()
        L_0x050c:
            java.lang.Boolean r2 = r0.A23
            if (r2 == 0) goto L_0x069c
            boolean r70 = r2.booleanValue()
        L_0x0514:
            java.lang.Boolean r2 = r0.A21
            if (r2 == 0) goto L_0x0698
            boolean r71 = r2.booleanValue()
        L_0x051c:
            java.lang.String r2 = r0.A3R
            r37 = r2
            java.lang.String r2 = r0.A3S
            r38 = r2
            java.lang.Integer r2 = r0.A2C
            r32 = r2
            java.util.List r2 = r0.A4N
            r49 = r2
            com.instagram.share.facebook.model.FBReelsAudienceType r2 = r0.A1n
            r31 = r2
            java.lang.String r2 = r0.A2w
            r39 = r2
            com.instagram.pendingmedia.model.ClipInfo r2 = r0.A1N
            r29 = r2
            java.util.Set r2 = r0.A4u
            java.util.Set r2 = X.SAR.A00(r2)
            java.util.Set r64 = X.SAR.A01(r2)
            java.util.List r2 = r0.A4Y
            r50 = r2
            java.util.List r10 = r0.A4o
            if (r10 != 0) goto L_0x054c
            X.0sn r10 = X.0sn.A00
        L_0x054c:
            java.util.List r2 = r0.A4J
            r52 = r2
            java.util.List r2 = r0.A4b
            com.instagram.music.common.model.MusicOverlayStickerModel r28 = X.C271404in.A05(r2)
            java.util.List r2 = r0.A4W
            r53 = r2
            java.util.ArrayList r54 = r0.A0J()
            if (r54 != 0) goto L_0x0562
            X.0sn r54 = X.0sn.A00
        L_0x0562:
            java.util.List r2 = r0.A4E
            r55 = r2
            java.util.List r2 = r0.A4D
            r56 = r2
            X.51W r2 = r0.A1P
            if (r2 == 0) goto L_0x0694
            java.util.ArrayList r57 = r2.A00()
        L_0x0572:
            X.Jw0 r2 = r0.A0q
            r22 = r2
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r2 = r0.A11
            r25 = r2
            X.3QS r2 = r0.A1V
            r30 = r2
            X.8J0 r2 = r0.A12
            r26 = r2
            boolean r2 = r0.A5O
            r72 = r2
            boolean r2 = r0.A5I
            r73 = r2
            boolean r2 = r0.A5N
            r74 = r2
            java.lang.Integer r2 = r0.A26
            r33 = r2
            java.lang.String r2 = r0.A3f
            r40 = r2
            X.3QD r4 = r0.A6J
            X.3QD r2 = X.AnonymousClass3QD.CONFIGURED_CLOUD_DRAFT
            r75 = 0
            if (r4 != r2) goto L_0x05a0
            r75 = 1
        L_0x05a0:
            java.lang.String r2 = r0.A3U
            r41 = r2
            java.util.List r2 = r0.A4O
            r58 = r2
            java.lang.String r2 = r0.A3I
            r42 = r2
            java.lang.String r2 = r0.A2b
            r43 = r2
            java.util.List r2 = r0.A4b
            r59 = r2
            java.util.List r2 = r0.A4g
            r60 = r2
            java.util.List r2 = r0.A4P
            r61 = r2
            boolean r2 = r0.A4y
            r76 = r2
            boolean r2 = r0.A62
            r77 = r2
            java.lang.String r4 = r0.A3n
            if (r4 == 0) goto L_0x064c
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x064c
        L_0x05ce:
            java.lang.String r2 = r0.A3P
            r45 = r2
            java.lang.String r2 = r0.A2c
            r46 = r2
            java.lang.String r2 = r0.A3i
            r47 = r2
            boolean r2 = r0.A5a
            r78 = r2
            boolean r2 = r0.A5s
            r79 = r2
            boolean r2 = r0.A5Y
            r80 = r2
            boolean r2 = r0.A4w
            if (r2 == 0) goto L_0x05f4
            java.util.List r2 = r0.A4c
            int r2 = r2.size()
            r81 = 1
            if (r2 > r6) goto L_0x05f6
        L_0x05f4:
            r81 = 0
        L_0x05f6:
            X.JxB r2 = r0.A0v
            r23 = r2
            java.lang.String r2 = r0.A3G
            r48 = r2
            boolean r2 = r0.A6D
            r82 = r2
            int r2 = r0.A0L
            r66 = r2
            boolean r2 = r0.A6E
            r83 = r2
            float r65 = r0.A00()
            java.util.List r2 = r0.A4I
            r62 = r2
            boolean r2 = r0.A54
            r18 = r2
            boolean r2 = r0.A6A
            r17 = r2
            java.util.List r13 = r0.A4K
            boolean r12 = r0.A6B
            X.JwI r11 = r0.A0l
            boolean r2 = r0.A5M
            if (r2 != 0) goto L_0x064a
            r7 = 36328194894347322(0x81104d00023c3a, double:3.037434960860128E-306)
            boolean r2 = X.182.A06(r9, r3, r7)
            if (r2 == 0) goto L_0x064a
            int r5 = r0.A05
        L_0x0631:
            X.LQn r2 = new X.LQn
            r20 = r2
            r21 = r11
            r44 = r4
            r51 = r10
            r63 = r13
            r67 = r5
            r84 = r18
            r85 = r17
            r86 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
            goto L_0x02b2
        L_0x064a:
            r5 = 0
            goto L_0x0631
        L_0x064c:
            java.util.List r7 = r0.A4J
            if (r7 == 0) goto L_0x0691
            int r4 = X.0Yv.A1E(r7, r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L_0x065d:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0675
            java.lang.Object r4 = r7.next()
            X.4aA r4 = (X.C266684aA) r4
            X.9JE r4 = r4.A05
            if (r4 == 0) goto L_0x0673
            java.lang.String r4 = r4.A04
        L_0x066f:
            r2.add(r4)
            goto L_0x065d
        L_0x0673:
            r4 = 0
            goto L_0x066f
        L_0x0675:
            java.util.Iterator r7 = r2.iterator()
        L_0x0679:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x068f
            java.lang.Object r4 = r7.next()
            if (r4 == 0) goto L_0x0679
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x0679
        L_0x068b:
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x05ce
        L_0x068f:
            r4 = 0
            goto L_0x068b
        L_0x0691:
            r4 = 0
            goto L_0x05ce
        L_0x0694:
            r57 = 0
            goto L_0x0572
        L_0x0698:
            r71 = 0
            goto L_0x051c
        L_0x069c:
            r70 = 0
            goto L_0x0514
        L_0x06a0:
            r69 = 0
            goto L_0x050c
        L_0x06a4:
            r1.A9m(r4, r8)
            goto L_0x00e8
        L_0x06a9:
            X.UzA r20 = X.C16674UzA.CLIPS
            goto L_0x0087
        L_0x06ad:
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            X.0qQ.A07(r4)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.Iterator r10 = r4.iterator()
        L_0x06bd:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x06ea
            java.lang.Object r5 = r10.next()
            r7 = r5
            X.3ui r7 = (X.C255783ui) r7
            java.lang.String r8 = r7.A1h
            java.lang.String r4 = "text_sticker"
            boolean r4 = X.0qQ.A0K(r8, r4)
            if (r4 == 0) goto L_0x06bd
            X.6Ly r7 = r7.A19
            if (r7 == 0) goto L_0x06dc
            X.6Lz r4 = r7.A0I
            if (r4 != 0) goto L_0x06bd
        L_0x06dc:
            boolean r4 = r7 instanceof X.AnonymousClass91c
            if (r4 != 0) goto L_0x06bd
            boolean r4 = r7 instanceof X.C389969qW
            if (r4 != 0) goto L_0x06bd
            r4 = r20
            r4.add(r5)
            goto L_0x06bd
        L_0x06ea:
            java.util.List r4 = r2.A0l
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            X.0qQ.A07(r13)
            java.util.List r4 = r2.A0m
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            X.0qQ.A07(r11)
            boolean r4 = X.AnonymousClass3S1.A04(r13)
            if (r4 == 0) goto L_0x0708
            boolean r4 = X.AnonymousClass3S1.A04(r11)
            if (r4 != 0) goto L_0x07d6
        L_0x0708:
            com.instagram.pendingmedia.model.ClipInfo r4 = r2.A0A
            if (r4 == 0) goto L_0x07b8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r8 = r4.A07
            int r7 = r4.A05
            int r4 = X.0Yv.A1E(r11, r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.Iterator r12 = r11.iterator()
        L_0x0722:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0734
            java.lang.Object r4 = r12.next()
            X.5JJ r4 = (X.AnonymousClass5JJ) r4
            java.lang.String r4 = r4.A0H
            r5.add(r4)
            goto L_0x0722
        L_0x0734:
            java.util.Set r12 = X.00k.A0k(r5)
            java.util.Iterator r13 = r13.iterator()
        L_0x073c:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0793
            java.lang.Object r4 = r13.next()
            X.4nO r4 = (X.C273914nO) r4
            java.lang.String r5 = r4.A00()
            boolean r5 = r12.contains(r5)
            if (r5 != 0) goto L_0x073c
            java.lang.Integer r33 = X.AnonymousClass05K.A01
            java.lang.String r36 = r4.A00()
            java.lang.Boolean r5 = r4.A02
            X.5JJ r4 = new X.5JJ
            r24 = r4
            r25 = r17
            r26 = r5
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r17
            r31 = r17
            r32 = r17
            r34 = r17
            r35 = r17
            r37 = r17
            r38 = r17
            r39 = r17
            r40 = r17
            r41 = r17
            r42 = r17
            r43 = r17
            r44 = r17
            r45 = r17
            r46 = r17
            r47 = r8
            r48 = r7
            r49 = r16
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r10.add(r4)
            goto L_0x073c
        L_0x0793:
            r10.addAll(r11)
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            X.15p r4 = X.AnonymousClass15o.A00
            X.17W r5 = r4.A0A(r7)
            r5.A0b()
            java.util.Iterator r8 = r10.iterator()
        L_0x07a8:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x07c0
            java.lang.Object r4 = r8.next()
            X.5JJ r4 = (X.AnonymousClass5JJ) r4
            X.AnonymousClass5JI.A00(r5, r4)
            goto L_0x07a8
        L_0x07b8:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07c0:
            r5.A0Y()
            r5.close()
            java.lang.String r5 = r7.toString()
            X.0qQ.A07(r5)
            r4 = 3712(0xe80, float:5.202E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.AA0(r4, r5)
        L_0x07d6:
            java.util.List r4 = r2.A0i
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            X.0qQ.A07(r7)
            boolean r4 = r19.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x07f8
            r4 = 36323002278947562(0x810b9400032aea, double:3.034151129972336E-306)
            boolean r4 = X.182.A06(r9, r3, r4)
            if (r4 == 0) goto L_0x07f8
            r4 = r19
            java.util.ArrayList r7 = X.00k.A0S(r4, r7)
        L_0x07f8:
            boolean r4 = r20.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0811
            r4 = 36323002279144173(0x810b9400062aed, double:3.034151130096674E-306)
            boolean r4 = X.182.A06(r9, r3, r4)
            if (r4 == 0) goto L_0x0811
            r4 = r20
            java.util.ArrayList r7 = X.00k.A0S(r4, r7)
        L_0x0811:
            boolean r4 = X.AnonymousClass3S1.A04(r7)
            if (r4 != 0) goto L_0x08b6
            java.io.StringWriter r13 = new java.io.StringWriter
            r13.<init>()
            X.15p r12 = X.AnonymousClass15o.A00
            X.17W r11 = r12.A0A(r13)
            r11.A0b()
            java.util.Iterator r15 = r7.iterator()
        L_0x0829:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x08a7
            java.lang.Object r14 = r15.next()
            X.3ui r14 = (X.C255783ui) r14
            X.C255783ui.A01(r11, r3, r14, r6)
            X.3WT r5 = r14.A11
            X.3WT r4 = X.AnonymousClass3WT.CLIPS_QUESTION_RESPONSE
            if (r5 != r4) goto L_0x087d
            X.A7J r4 = r14.A15
            if (r4 == 0) goto L_0x086e
            java.io.StringWriter r10 = new java.io.StringWriter
            r10.<init>()
            X.17W r8 = r12.A0A(r10)
            r8.A0c()
            java.lang.String r4 = r4.A04
            X.0qQ.A07(r4)
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.String r7 = "question_response_id"
            r8.A0Q(r7, r4)
            r8.A0Z()
            r8.close()
            java.lang.String r5 = r10.toString()
            X.0qQ.A07(r5)
            java.lang.String r4 = "answer_reply_params"
            r1.AA0(r4, r5)
        L_0x086e:
            X.3WT r7 = r14.A11
            X.3WT r5 = X.AnonymousClass3WT.MUSIC_LYRICS
            r4 = r18
            if (r7 != r5) goto L_0x0877
            r4 = r0
        L_0x0877:
            java.lang.String r5 = "contains_music_lyrics"
            r1.A9m(r5, r4)
            goto L_0x0829
        L_0x087d:
            X.3WT r4 = X.AnonymousClass3WT.TEXT_POST_STICKER
            if (r5 != r4) goto L_0x086e
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            X.17W r4 = r12.A0A(r5)
            r4.A0b()
            X.C255783ui.A01(r4, r3, r14, r6)
            r4.A0Y()
            r4.close()
            java.lang.String r5 = r5.toString()
            X.0qQ.A07(r5)
            r4 = 5329(0x14d1, float:7.468E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r5)
            goto L_0x086e
        L_0x08a7:
            r11.A0Y()
            r11.close()
            java.lang.String r5 = r13.toString()
            java.lang.String r4 = "tap_models"
            r1.A9m(r4, r5)
        L_0x08b6:
            java.util.List r5 = r2.A0g
            if (r5 == 0) goto L_0x08d3
            boolean r4 = r5.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x08d3
            java.lang.String r5 = X.VFF.A00(r5)
            java.lang.String r4 = ""
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x08d3
            java.lang.String r4 = "doodles_metadata"
            r1.AA0(r4, r5)
        L_0x08d3:
            java.util.List r7 = r2.A0c
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            if (r4 == 0) goto L_0x08ea
            X.4aB r5 = X.C266684aA.A0N
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            java.lang.String r5 = r5.A00(r4)
            java.lang.String r4 = "clips_segments_metadata"
            r1.AA0(r4, r5)
        L_0x08ea:
            com.instagram.music.common.model.MusicOverlayStickerModel r11 = r2.A09
            java.util.List r10 = r2.A0h
            r22 = 0
            if (r10 == 0) goto L_0x096b
            int r12 = r10.size()
        L_0x08f6:
            java.lang.String r7 = "original_audio_creation_params"
            if (r12 <= r6) goto L_0x09b5
            if (r10 == 0) goto L_0x09b5
            X.3QS r4 = r2.A0B
            if (r4 == 0) goto L_0x0968
            X.9IV r4 = r4.A01
            java.lang.Object r15 = r4.A00
            java.util.List r15 = (java.util.List) r15
        L_0x0906:
            java.io.StringWriter r13 = new java.io.StringWriter
            r13.<init>()
            X.15p r4 = X.AnonymousClass15o.A00
            X.17W r8 = r4.A0A(r13)
            r8.A0c()
            java.lang.String r4 = "original_audio_parts"
            r8.A0q(r4)
            r8.A0b()
            java.util.Iterator r21 = r10.iterator()
        L_0x0920:
            boolean r4 = r21.hasNext()
            if (r4 == 0) goto L_0x096d
            java.lang.Object r14 = r21.next()
            com.instagram.music.common.model.MusicOverlayStickerModel r14 = (com.instagram.music.common.model.MusicOverlayStickerModel) r14
            r8.A0c()
            java.util.List r5 = r14.A0o
            if (r5 == 0) goto L_0x093b
            java.lang.String r4 = "audio_filter_infos"
            r8.A0q(r4)
            X.C393729wu.A00(r8, r5)
        L_0x093b:
            java.lang.Boolean r4 = r14.A0E
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            boolean r4 = X.0qQ.A0K(r4, r5)
            if (r4 != 0) goto L_0x095b
            java.lang.Boolean r4 = r14.A0D
            boolean r4 = X.0qQ.A0K(r4, r5)
            if (r4 != 0) goto L_0x095b
            java.lang.String r4 = "music_params"
            r8.A0q(r4)
            X.C59670JTa.A07(r8, r14)
        L_0x0957:
            r8.A0Z()
            goto L_0x0920
        L_0x095b:
            r4 = 1756(0x6dc, float:2.46E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r8.A0q(r4)
            X.C59670JTa.A08(r8, r14)
            goto L_0x0957
        L_0x0968:
            r15 = r17
            goto L_0x0906
        L_0x096b:
            r12 = 0
            goto L_0x08f6
        L_0x096d:
            if (r15 == 0) goto L_0x0a38
            java.util.Iterator r15 = r15.iterator()
        L_0x0973:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x0a38
            java.lang.Object r14 = r15.next()
            X.9cB r14 = (X.C381699cB) r14
            r8.A0c()
            java.lang.String r4 = r14.A02
            if (r4 == 0) goto L_0x09b1
            java.lang.String r4 = r14.A03
            if (r4 == 0) goto L_0x09b1
            java.lang.String r4 = "sound_effects_params"
            r8.A0q(r4)
            r8.A0c()
            int r5 = r14.A00
            java.lang.String r4 = "duration_ms"
            r8.A0P(r4, r5)
            java.lang.String r5 = r14.A02
            java.lang.String r4 = "audio_asset_id"
            r8.A0R(r4, r5)
            java.lang.String r5 = r14.A03
            java.lang.String r4 = "audio_cluster_id"
            r8.A0R(r4, r5)
            long r4 = r14.A01
            java.lang.String r14 = "start_time_in_media_ms"
            r8.A0Q(r14, r4)
            r8.A0Z()
        L_0x09b1:
            r8.A0Z()
            goto L_0x0973
        L_0x09b5:
            if (r11 == 0) goto L_0x0a4b
            java.util.List r8 = r11.A0o
            if (r8 == 0) goto L_0x09c2
            boolean r5 = r8.isEmpty()
            r4 = 0
            if (r5 == 0) goto L_0x09c3
        L_0x09c2:
            r4 = 1
        L_0x09c3:
            r13 = r4 ^ 1
            java.lang.Boolean r4 = r11.A0E
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            boolean r4 = X.0qQ.A0K(r4, r5)
            if (r4 != 0) goto L_0x0a2d
            java.lang.Boolean r4 = r11.A0D
            boolean r4 = X.0qQ.A0K(r4, r5)
            if (r4 != 0) goto L_0x0a2d
            if (r13 == 0) goto L_0x0a2b
            X.A9I r5 = new X.A9I
            r5.<init>(r11)
            com.instagram.api.schemas.MusicProduct r4 = com.instagram.api.schemas.MusicProduct.IG_AUDIO_FILTERS
            r5.A02 = r4
            com.instagram.music.common.model.MusicOverlayStickerModel r4 = r5.A00()
        L_0x09e8:
            java.lang.String r5 = X.C59670JTa.A05(r4)
            java.lang.String r4 = "music_params"
        L_0x09ee:
            r1.AA0(r4, r5)
            if (r8 == 0) goto L_0x0a19
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L_0x0a19
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            X.15p r4 = X.AnonymousClass15o.A00
            X.17W r4 = r4.A0A(r5)
            X.0qQ.A0A(r4)
            X.C393729wu.A00(r4, r8)
            r4.close()
            java.lang.String r5 = r5.toString()
            X.0qQ.A07(r5)
            java.lang.String r4 = "audio_filter_infos"
            r1.AA0(r4, r5)
        L_0x0a19:
            java.lang.Boolean r4 = r2.A0D
            if (r4 == 0) goto L_0x0a4b
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "disable_audio_filters"
            r1.A9m(r4, r5)
            goto L_0x0a4b
        L_0x0a2b:
            r4 = r11
            goto L_0x09e8
        L_0x0a2d:
            java.lang.String r5 = X.C59670JTa.A06(r11)
            r4 = 1756(0x6dc, float:2.46E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            goto L_0x09ee
        L_0x0a38:
            r8.A0Y()
            r8.A0Z()
            r8.close()
            java.lang.String r4 = r13.toString()
            X.0qQ.A07(r4)
            r1.AA0(r7, r4)
        L_0x0a4b:
            X.3QS r8 = r2.A0B
            if (r8 == 0) goto L_0x0adf
            X.51J r4 = X.AnonymousClass51J.VOICEOVER
            X.51I r4 = r8.A00(r4)
            if (r4 == 0) goto L_0x0a60
            float r4 = r4.A00
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0a60
            r22 = 1
        L_0x0a60:
            if (r12 > r6) goto L_0x0adf
            X.51J r4 = X.AnonymousClass51J.SOUND_EFFECTS
            X.51I r4 = r8.A00(r4)
            if (r4 == 0) goto L_0x0adf
            X.9IV r4 = r8.A01
            java.lang.Object r5 = r4.A00
            java.util.List r5 = (java.util.List) r5
            java.io.StringWriter r14 = new java.io.StringWriter
            r14.<init>()
            X.15p r4 = X.AnonymousClass15o.A00
            X.17W r13 = r4.A0A(r14)
            r13.A0c()
            java.lang.String r4 = "original_audio_parts"
            r13.A0q(r4)
            r13.A0b()
            java.util.Iterator r15 = r5.iterator()
        L_0x0a8a:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x0acc
            java.lang.Object r12 = r15.next()
            X.9cB r12 = (X.C381699cB) r12
            r13.A0c()
            java.lang.String r4 = r12.A02
            if (r4 == 0) goto L_0x0ac8
            java.lang.String r4 = r12.A03
            if (r4 == 0) goto L_0x0ac8
            java.lang.String r4 = "sound_effects_params"
            r13.A0q(r4)
            r13.A0c()
            int r5 = r12.A00
            java.lang.String r4 = "duration_ms"
            r13.A0P(r4, r5)
            java.lang.String r5 = r12.A02
            java.lang.String r4 = "audio_asset_id"
            r13.A0R(r4, r5)
            java.lang.String r5 = r12.A03
            java.lang.String r4 = "audio_cluster_id"
            r13.A0R(r4, r5)
            long r4 = r12.A01
            java.lang.String r12 = "start_time_in_media_ms"
            r13.A0Q(r12, r4)
            r13.A0Z()
        L_0x0ac8:
            r13.A0Z()
            goto L_0x0a8a
        L_0x0acc:
            r13.A0Y()
            r13.A0Z()
            r13.close()
            java.lang.String r4 = r14.toString()
            X.0qQ.A07(r4)
            r1.AA0(r7, r4)
        L_0x0adf:
            java.io.StringWriter r13 = new java.io.StringWriter
            r13.<init>()
            X.15p r7 = X.AnonymousClass15o.A00
            X.17W r12 = r7.A0A(r13)
            r12.A0c()
            r5 = r18
            if (r22 == 0) goto L_0x0af2
            r5 = r0
        L_0x0af2:
            java.lang.String r4 = "has_voiceover_attribution"
            r12.A0R(r4, r5)
            r12.A0Z()
            r12.close()
            java.lang.String r5 = r13.toString()
            X.0qQ.A07(r5)
            r4 = 4433(0x1151, float:6.212E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.AA0(r4, r5)
            java.lang.String r4 = "Required value was null."
            if (r8 == 0) goto L_0x0fe4
            r4 = r23
            java.lang.String r5 = r4.A0O
            com.instagram.music.common.model.InstagramAudioApplySource r4 = r4.A0C
            java.lang.String r5 = X.C64017LJe.A00(r4, r11, r8, r5, r10)
            java.lang.String r4 = "clips_audio_metadata"
            r1.AA0(r4, r5)
            X.51J r13 = X.AnonymousClass51J.AUDIO_TRACK
            java.util.List r4 = r8.A03
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r14 = r4.iterator()
        L_0x0b2d:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0b42
            java.lang.Object r5 = r14.next()
            r4 = r5
            X.51I r4 = (X.AnonymousClass51I) r4
            X.51J r4 = r4.A04
            if (r4 != r13) goto L_0x0b2d
            r12.add(r5)
            goto L_0x0b2d
        L_0x0b42:
            boolean r4 = r12 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0c8c
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L_0x0c8c
        L_0x0b4c:
            r5 = r18
        L_0x0b4e:
            java.lang.String r4 = "is_created_with_contextual_music_recs"
            r1.A9m(r4, r5)
            boolean r4 = X.1KU.A0F(r3)
            if (r4 == 0) goto L_0x0b88
            java.io.StringWriter r13 = new java.io.StringWriter
            r13.<init>()
            X.17W r12 = r7.A0A(r13)
            r12.A0b()
            r12.A0c()
            java.lang.String r5 = "tool"
            java.lang.String r4 = "audio_enhance"
            r12.A0R(r5, r4)
            float r5 = r2.A00
            java.lang.String r4 = "audio_enhance_value"
            r12.A0O(r4, r5)
            r12.A0Z()
            r12.A0Y()
            r12.close()
            java.lang.String r5 = r13.toString()
            java.lang.String r4 = "post_capture_editing_info"
            r1.AA0(r4, r5)
        L_0x0b88:
            java.util.List r4 = r2.A0b
            java.util.ArrayList r4 = X.00k.A0U(r4)
            X.9IV r5 = r8.A01
            java.lang.Object r5 = r5.A01
            if (r5 == 0) goto L_0x0b9f
            java.lang.String r5 = "1121563218239439"
            boolean r8 = r4.contains(r5)
            if (r8 != 0) goto L_0x0b9f
            r4.add(r5)
        L_0x0b9f:
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            X.0qQ.A07(r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r4)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            X.8J0 r8 = r2.A07
            if (r8 == 0) goto L_0x0bc6
            X.9sK r5 = X.C391089sK.GREEN_SCREEN
            X.9sK r4 = r8.A02
            if (r5 != r4) goto L_0x0bc6
            r4 = 36877362297766019(0x8303c400030083, double:3.3847306381017525E-306)
            java.lang.String r4 = X.182.A04(r9, r3, r4)
            r12.add(r4)
        L_0x0bc6:
            r13.removeAll(r12)
            boolean r4 = X.AnonymousClass3S1.A04(r13)
            if (r4 != 0) goto L_0x0bd8
            java.lang.String r5 = X.0mh.A00(r13)
            java.lang.String r4 = "effect_ids"
            r1.AA0(r4, r5)
        L_0x0bd8:
            java.util.List r4 = r2.A0a
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            X.0qQ.A07(r5)
            boolean r4 = X.AnonymousClass3S1.A04(r5)
            if (r4 != 0) goto L_0x0bf4
            java.lang.String r5 = X.0mh.A00(r5)
            r4 = 2755(0xac3, float:3.86E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.AA0(r4, r5)
        L_0x0bf4:
            if (r10 == 0) goto L_0x0c24
            int r4 = r10.size()
            if (r4 <= r6) goto L_0x0c24
        L_0x0bfc:
            java.util.List r5 = r2.A0Z
        L_0x0bfe:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0cbf
            java.io.StringWriter r10 = new java.io.StringWriter
            r10.<init>()
            X.17W r6 = r7.A0A(r10)
            r6.A0b()
            java.util.Iterator r5 = r5.iterator()
        L_0x0c14:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0ca9
            java.lang.Object r4 = r5.next()
            X.55X r4 = (X.AnonymousClass55X) r4
            X.AnonymousClass55W.A00(r6, r4)
            goto L_0x0c14
        L_0x0c24:
            if (r11 == 0) goto L_0x0bfc
            java.util.List r5 = r11.A0o
            if (r5 == 0) goto L_0x0bfc
            r4 = r16
            java.lang.Object r4 = r5.get(r4)
            com.instagram.api.schemas.AudioFilterInfo r4 = (com.instagram.api.schemas.AudioFilterInfo) r4
            if (r4 == 0) goto L_0x0bfc
            com.instagram.api.schemas.AudioFilterType r4 = r4.A00
            if (r4 == 0) goto L_0x0bfc
            int r4 = r4.ordinal()
            switch(r4) {
                case 0: goto L_0x0bfc;
                case 1: goto L_0x0c45;
                case 2: goto L_0x0c54;
                case 3: goto L_0x0c48;
                case 4: goto L_0x0c57;
                case 5: goto L_0x0c51;
                case 6: goto L_0x0c4e;
                case 7: goto L_0x0c4b;
                default: goto L_0x0c3f;
            }
        L_0x0c3f:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0c45:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.CRUNCHY
            goto L_0x0c59
        L_0x0c48:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.RADIO
            goto L_0x0c59
        L_0x0c4b:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.VINYL
            goto L_0x0c59
        L_0x0c4e:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.SWIRL
            goto L_0x0c59
        L_0x0c51:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.SPED_UP
            goto L_0x0c59
        L_0x0c54:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.DREAMY
            goto L_0x0c59
        L_0x0c57:
            com.instagram.api.schemas.CameraTool r11 = com.instagram.api.schemas.CameraTool.SLOWED
        L_0x0c59:
            java.util.List r5 = r2.A0Z
            boolean r4 = r5.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0c76
            java.util.Iterator r6 = r5.iterator()
        L_0x0c67:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0bfe
            java.lang.Object r4 = r6.next()
            X.55X r4 = (X.AnonymousClass55X) r4
            r4.A01 = r11
            goto L_0x0c67
        L_0x0c76:
            com.instagram.feed.media.CameraToolInfo r10 = new com.instagram.feed.media.CameraToolInfo
            r6 = r17
            r10.<init>(r11, r6, r6, r6)
            r4 = r16
            X.55X r4 = X.C63184Ksr.A00(r10, r4)
            java.util.List r5 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r5)
            goto L_0x0bfe
        L_0x0c8c:
            java.util.Iterator r12 = r12.iterator()
        L_0x0c90:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0b4c
            java.lang.Object r4 = r12.next()
            X.51I r4 = (X.AnonymousClass51I) r4
            java.lang.String r5 = r4.A07
            java.lang.String r4 = "4567037053412019"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x0c90
            r5 = r0
            goto L_0x0b4e
        L_0x0ca9:
            r6.A0Y()
            r6.close()
            java.lang.String r5 = r10.toString()
            X.0qQ.A07(r5)
            r4 = 2943(0xb7f, float:4.124E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.AA0(r4, r5)
        L_0x0cbf:
            java.util.List r5 = r2.A0n
            if (r5 == 0) goto L_0x0d15
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0d15
            java.io.StringWriter r11 = new java.io.StringWriter
            r11.<init>()
            X.17W r10 = r7.A0A(r11)
            r10.A0b()
            java.util.Iterator r12 = r5.iterator()
        L_0x0cd9:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0d03
            java.lang.Object r6 = r12.next()
            X.9bh r6 = (X.C381399bh) r6
            r10.A0c()
            java.lang.String r5 = r6.A02
            if (r5 == 0) goto L_0x0cf1
            java.lang.String r4 = "name"
            r10.A0R(r4, r5)
        L_0x0cf1:
            int r5 = r6.A00
            java.lang.String r4 = "duration_ms"
            r10.A0P(r4, r5)
            int r5 = r6.A01
            java.lang.String r4 = "start_time_ms"
            r10.A0P(r4, r5)
            r10.A0Z()
            goto L_0x0cd9
        L_0x0d03:
            r10.A0Y()
            r10.close()
            java.lang.String r5 = r11.toString()
            X.0qQ.A07(r5)
            java.lang.String r4 = "clips_transition_effects"
            r1.AA0(r4, r5)
        L_0x0d15:
            X.9Ua r6 = X.AnonymousClass9T6.A00(r3)
            java.util.Set r5 = r6.A01
            boolean r4 = r5.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0d30
            java.util.List r4 = X.00k.A0a(r5)
            java.lang.String r10 = X.C63185Kss.A00(r4)
            java.lang.String r4 = "stacked_timeline_metadata"
            r1.AA0(r4, r10)
        L_0x0d30:
            boolean r4 = r5.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0d45
            java.util.List r4 = X.00k.A0a(r5)
            java.lang.String r10 = X.C63185Kss.A00(r4)
            java.lang.String r4 = "ig_timeline_metadata"
            r1.AA0(r4, r10)
        L_0x0d45:
            r4 = r16
            r6.A00 = r4
            r5.clear()
            boolean r5 = r2.A0r
            r4 = 1730(0x6c2, float:2.424E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r4)
            if (r5 == 0) goto L_0x0d5b
            java.lang.String r4 = "clips_draft"
            r1.A9m(r6, r4)
        L_0x0d5b:
            X.Jw0 r4 = r2.A03
            if (r4 == 0) goto L_0x0d68
            java.lang.String r5 = X.C45890D9t.A00(r4)
            java.lang.String r4 = "shopping_data"
            r1.A9m(r4, r5)
        L_0x0d68:
            X.0t1 r4 = X.0eE.A00(r3)
            com.instagram.user.model.User r4 = r4.A00()
            X.4Cl r4 = r4.A03
            com.instagram.api.schemas.FanClubInfoDict r4 = r4.B3v()
            if (r4 == 0) goto L_0x0d89
            java.lang.String r10 = r4.getFanClubId()
            if (r10 == 0) goto L_0x0d89
            X.3QO r5 = r2.A08
            X.3QO r4 = X.AnonymousClass3QO.FAN_CLUB
            if (r5 != r4) goto L_0x0d89
            java.lang.String r4 = "fan_club_id"
            r1.A9m(r4, r10)
        L_0x0d89:
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r10 = r2.A06
            if (r10 == 0) goto L_0x0da5
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            X.17W r4 = r7.A0A(r5)
            X.F5G.A00(r4, r10)
            r4.close()
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = "fan_club_configure_info"
            r1.A9m(r4, r5)
        L_0x0da5:
            if (r8 == 0) goto L_0x0dc3
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            X.17W r4 = r7.A0A(r5)
            X.AAO.A00(r4, r8)
            r4.close()
            java.lang.String r5 = r5.toString()
            r4 = 3545(0xdd9, float:4.968E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.AA0(r4, r5)
        L_0x0dc3:
            boolean r4 = r2.A0u
            r5 = r18
            if (r4 == 0) goto L_0x0dca
            r5 = r0
        L_0x0dca:
            r4 = 4915(0x1333, float:6.887E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r5)
            java.lang.String r5 = r2.A0R
            java.lang.String r4 = "camera_upsell"
            r1.A9m(r4, r5)
            boolean r4 = r2.A0q
            r5 = r18
            if (r4 == 0) goto L_0x0de1
            r5 = r0
        L_0x0de1:
            java.lang.String r4 = "is_clips_edited"
            r1.A9m(r4, r5)
            boolean r4 = r2.A0t
            r5 = r18
            if (r4 == 0) goto L_0x0ded
            r5 = r0
        L_0x0ded:
            java.lang.String r4 = "is_created_with_sound_sync"
            r1.A9m(r4, r5)
            java.lang.Integer r4 = r2.A0H
            if (r4 == 0) goto L_0x0e03
            int r4 = r4.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "acr_browser_entry_point"
            r1.A9m(r4, r5)
        L_0x0e03:
            java.lang.String r5 = r2.A0V
            java.lang.String r4 = "smart_template_effect_id"
            r1.A9m(r4, r5)
            java.util.List r4 = r2.A0j
            if (r4 == 0) goto L_0x0e23
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)
            if (r5 == 0) goto L_0x0e23
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0e23
            java.lang.String r5 = X.0mh.A00(r5)
            java.lang.String r4 = "reusable_template_assets_media_ids"
            r1.AA0(r4, r5)
        L_0x0e23:
            java.lang.String r4 = r2.A0Y
            if (r4 == 0) goto L_0x0e4e
            java.io.StringWriter r11 = new java.io.StringWriter
            r11.<init>()
            X.17W r10 = r7.A0A(r11)
            r10.A0c()
            long r4 = java.lang.Long.parseLong(r4)
            java.lang.String r8 = "comment_id"
            r10.A0Q(r8, r4)
            r10.A0Z()
            r10.close()
            java.lang.String r5 = r11.toString()
            X.0qQ.A07(r5)
            java.lang.String r4 = "visual_replies_params"
            r1.AA0(r4, r5)
        L_0x0e4e:
            boolean r4 = r2.A0s
            r5 = r18
            if (r4 == 0) goto L_0x0e55
            r5 = r0
        L_0x0e55:
            r4 = 4720(0x1270, float:6.614E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r1.A9m(r4, r5)
            java.lang.Boolean r4 = r2.A0G
            if (r4 == 0) goto L_0x0e70
            boolean r4 = r4.booleanValue()
            r5 = r18
            if (r4 == 0) goto L_0x0e6b
            r5 = r0
        L_0x0e6b:
            java.lang.String r4 = "third_party_downloads_enabled"
            r1.A9m(r4, r5)
        L_0x0e70:
            java.lang.Boolean r4 = r2.A0E
            if (r4 == 0) goto L_0x0e82
            boolean r4 = r4.booleanValue()
            r5 = r18
            if (r4 == 0) goto L_0x0e7d
            r5 = r0
        L_0x0e7d:
            java.lang.String r4 = "is_template_disabled"
            r1.A9m(r4, r5)
        L_0x0e82:
            boolean r4 = r20.isEmpty()
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x0e92
            boolean r4 = r19.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0eb8
        L_0x0e92:
            r4 = 36323002278947562(0x810b9400032aea, double:3.034151129972336E-306)
            boolean r4 = X.182.A06(r9, r3, r4)
            if (r4 != 0) goto L_0x0ea8
            r4 = 36323002279144173(0x810b9400062aed, double:3.034151130096674E-306)
            boolean r3 = X.182.A06(r9, r3, r4)
            if (r3 == 0) goto L_0x0eb8
        L_0x0ea8:
            boolean r3 = r2.A13
            r4 = r18
            if (r3 == 0) goto L_0x0eaf
            r4 = r0
        L_0x0eaf:
            r3 = 1845(0x735, float:2.585E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r4)
        L_0x0eb8:
            java.lang.Boolean r3 = r2.A0F
            if (r3 == 0) goto L_0x0ece
            boolean r3 = r3.booleanValue()
            r4 = r18
            if (r3 == 0) goto L_0x0ec5
            r4 = r0
        L_0x0ec5:
            r3 = 1926(0x786, float:2.699E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r4)
        L_0x0ece:
            java.lang.Integer r3 = r2.A0J
            if (r3 == 0) goto L_0x0edf
            int r3 = r3.intValue()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "template_opt_in_status"
            r1.A9m(r3, r4)
        L_0x0edf:
            boolean r3 = r2.A0p
            if (r3 == 0) goto L_0x0eec
            r3 = 5373(0x14fd, float:7.529E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r0)
        L_0x0eec:
            boolean r3 = r2.A0w
            r4 = r18
            if (r3 == 0) goto L_0x0ef3
            r4 = r0
        L_0x0ef3:
            r3 = 82
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r4)
            boolean r3 = r2.A0y
            r4 = r18
            if (r3 == 0) goto L_0x0f03
            r4 = r0
        L_0x0f03:
            r3 = 777(0x309, float:1.089E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r4)
            boolean r3 = r2.A0v
            if (r3 == 0) goto L_0x0f12
            r18 = r0
        L_0x0f12:
            java.lang.String r4 = "is_gifting_enabled"
            r3 = r18
            r1.A9m(r4, r3)
            X.JxB r5 = r2.A04
            if (r5 == 0) goto L_0x0f41
            r3 = 3923(0xf53, float:5.497E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r6, r3)
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            X.17W r3 = r7.A0A(r4)
            X.C63980LGx.A00(r3, r5)
            r3.close()
            java.lang.String r4 = r4.toString()
            X.0qQ.A07(r4)
            java.lang.String r3 = "content_scheduling_metadata"
            r1.A9m(r3, r4)
        L_0x0f41:
            boolean r3 = r2.A0x
            if (r3 == 0) goto L_0x0f4f
            java.lang.String r3 = "allow_multi_configures"
            r1.A9m(r3, r0)
            java.lang.String r3 = "multi_sharing"
            r1.A9m(r3, r0)
        L_0x0f4f:
            X.3QO r3 = r2.A08
            if (r3 == 0) goto L_0x0f5a
            java.lang.String r4 = r3.A00
            java.lang.String r3 = "audience"
            r1.A9m(r3, r4)
        L_0x0f5a:
            java.lang.String r4 = r2.A0Q
            r3 = 3704(0xe78, float:5.19E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r4)
            java.util.List r4 = r2.A0d
            if (r4 == 0) goto L_0x0fbc
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0fbc
            java.io.StringWriter r10 = new java.io.StringWriter
            r10.<init>()
            X.17W r9 = r7.A0A(r10)
            r9.A0b()
            java.util.Iterator r8 = r4.iterator()
        L_0x0f7f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0f9c
            java.lang.Object r3 = r8.next()
            X.BEE r3 = (X.BEE) r3
            r6 = 0
            com.instagram.api.schemas.ClipsSpinSwappableElementType r5 = com.instagram.api.schemas.ClipsSpinSwappableElementType.TEXT
            if (r3 == 0) goto L_0x0f91
            r6 = r3
        L_0x0f91:
            X.BED r4 = new X.BED
            r3 = r17
            r4.<init>(r5, r6, r3)
            X.C45523Cxx.A00(r9, r4)
            goto L_0x0f7f
        L_0x0f9c:
            r9.A0Y()
            r9.close()
            java.lang.String r4 = r10.toString()
            if (r4 == 0) goto L_0x0fbc
            int r3 = r4.length()
            if (r3 == 0) goto L_0x0fbc
            java.lang.String r3 = "is_spinnable"
            r1.A9m(r3, r0)
            r3 = 4599(0x11f7, float:6.445E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.A9m(r3, r4)
        L_0x0fbc:
            X.JwI r4 = r2.A02
            if (r4 == 0) goto L_0x0fd8
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            X.17W r2 = r7.A0A(r3)
            X.C45664D0o.A00(r4, r2)
            r2.close()
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = "trial_params"
            r1.AA0(r2, r3)
        L_0x0fd8:
            X.1QX r3 = r1.A0N()
            X.1QS r2 = r3.A02
            java.lang.String r1 = "is_clips_video"
            r2.A01(r1, r0)
            return r3
        L_0x0fe4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55Z.AEQ(android.content.Context, X.28D, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.constants.ShareType, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean, boolean, boolean, boolean):X.1QX");
    }
}
