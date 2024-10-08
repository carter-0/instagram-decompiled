package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.4O0  reason: invalid class name */
public class AnonymousClass4O0 extends C252323ov {
    public C267324bN A00;
    public String A01;
    public final ClipsViewerConfig A02;
    public final UserSession A03;
    public final C55949HqD A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377119Kp(this, 20));
    public final C62320sa A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4O0(ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r5, AnonymousClass93U r6, C55949HqD hqD, String str, C62320sa r9) {
        super(r5, r6.AmZ());
        0qQ.A0B(r6, 3);
        this.A03 = userSession;
        this.A09 = str;
        this.A08 = r9;
        this.A04 = hqD;
        this.A02 = clipsViewerConfig;
        this.A06 = r6.CFD();
        this.A05 = r6.AmZ();
    }

    public final String A03(1Xj r6) {
        C267324bN r1;
        1Xj r2;
        if (!(!182.A06(0Tu.A05, this.A03, 36329242866237312L) || (r1 = this.A00) == null || (r2 = r1.A02) == null)) {
            int A002 = this.A04.A00(r1);
            if (r2.A5D() && A002 != -1) {
                1Xj A1c = r2.A1c(A002);
                1Xj A1c2 = r2.A1c(0);
                if (!(A1c == null || A1c2 == null)) {
                    r2.A0o();
                    A1c.BR7();
                    A1c.CEL().A08();
                    String id = A1c.getId();
                    if (id == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (A1c2.getId() != null) {
                        return id;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return super.A03(r6);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.4OC] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (X.AnonymousClass3WP.A07(r10.A03) == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.0xI r11, X.C263934Nx r12) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            X.4OC r3 = new X.4OC
            r3.<init>()
            java.lang.String r1 = r11.A04
            java.lang.String r0 = "video_started_playing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            X.0eM r4 = r10.A07
            java.lang.Object r0 = r4.getValue()
            X.GIP r0 = (X.GIP) r0
            X.GBj r0 = r0.A00
            int r0 = r0.A06()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.A0G = r1
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = "media_relative_module_index"
            r11.A08(r1, r0)
        L_0x002e:
            java.lang.Object r6 = r4.getValue()
            X.GIP r6 = (X.GIP) r6
            java.lang.String r5 = r10.A01
            r4 = 0
            if (r5 == 0) goto L_0x004f
            java.util.HashMap r1 = r6.A01
            boolean r0 = r1.containsKey(r5)
            if (r0 != 0) goto L_0x004f
            X.GBj r0 = r6.A00
            int r0 = r0.A06()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r5, r0)
            r4 = 1
        L_0x004f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r3.A02 = r1
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = "is_first_playback"
            r11.A09(r0, r1)
        L_0x005c:
            java.lang.String r1 = r11.A04
            java.lang.String r0 = "video_paused"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007e
            com.instagram.clips.intf.ClipsViewerConfig r4 = r10.A02
            java.lang.Long r1 = r4.A0g
            r3.A0O = r1
            if (r1 == 0) goto L_0x0073
            java.lang.String r0 = "starting_clips_media_id"
            r11.A0B(r0, r1)
        L_0x0073:
            java.lang.String r1 = r4.A0p
            r3.A0T = r1
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "starting_clips_ranking_info_token"
            r11.A0C(r0, r1)
        L_0x007e:
            X.4bN r0 = r10.A00
            r9 = 1
            if (r0 == 0) goto L_0x00b1
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00b1
            boolean r1 = r0.A51()
            if (r1 == 0) goto L_0x0096
            com.instagram.common.session.UserSession r0 = r10.A03
            boolean r0 = X.AnonymousClass3WP.A07(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.A04 = r1
            if (r1 == 0) goto L_0x00a4
            java.lang.String r0 = "video_subtitles_available"
            r11.A09(r0, r1)
        L_0x00a4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r3.A05 = r1
            if (r1 == 0) goto L_0x00b1
            java.lang.String r0 = "video_subtitles_displayed"
            r11.A09(r0, r1)
        L_0x00b1:
            com.instagram.common.session.UserSession r5 = r10.A03
            X.0Tu r4 = X.0Tu.A05
            r0 = 36329242866237312(0x81114100003f80, double:3.038097702503202E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0170
            X.4bN r1 = r10.A00
            if (r1 == 0) goto L_0x0170
            X.1Xj r4 = r1.A02
            if (r4 == 0) goto L_0x0170
            X.HqD r0 = r10.A04
            int r8 = r0.A00(r1)
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x0170
            r0 = -1
            if (r8 == r0) goto L_0x0170
            X.1Xj r1 = r4.A1c(r8)
            X.1Xj r2 = r4.A1c(r2)
            if (r1 == 0) goto L_0x0170
            if (r2 == 0) goto L_0x0170
            int r7 = r4.A0o()
            X.1iA r0 = r1.BR7()
            int r6 = r0.A00
            X.3WR r0 = r1.CEL()
            boolean r5 = r0.A08()
            java.lang.String r4 = r1.getId()
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x017b
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x0175
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r3.A07 = r1
            if (r1 == 0) goto L_0x0110
            java.lang.String r0 = "carousel_index"
            r11.A08(r1, r0)
        L_0x0110:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r3.A09 = r1
            if (r1 == 0) goto L_0x011d
            java.lang.String r0 = "carousel_size"
            r11.A08(r1, r0)
        L_0x011d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r3.A08 = r1
            if (r1 == 0) goto L_0x012a
            java.lang.String r0 = "carousel_m_t"
            r11.A08(r1, r0)
        L_0x012a:
            r3.A0S = r4
            java.lang.String r0 = "carousel_media_id"
            r11.A0C(r0, r4)
            r3.A0R = r2
            java.lang.String r0 = "carousel_cover_media_id"
            r11.A0C(r0, r2)
            if (r5 == 0) goto L_0x014e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r3.A0B = r1
            java.lang.String r0 = "is_dash_eligible"
            r11.A08(r1, r0)
            java.lang.String r1 = "dash"
            r3.A0U = r1
            java.lang.String r0 = "playback_format"
            r11.A0C(r0, r1)
        L_0x014e:
            X.4bN r0 = r10.A00
            if (r0 == 0) goto L_0x0170
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x0170
            X.1Xy r0 = r2.A0C
            java.lang.String r1 = r0.getMezqlToken()
            java.lang.String r0 = "mezql_token"
            if (r1 == 0) goto L_0x0163
            r11.A0C(r0, r1)
        L_0x0163:
            X.1Xy r0 = r2.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            java.lang.String r0 = "ranking_info_token"
            if (r1 == 0) goto L_0x0170
            r11.A0C(r0, r1)
        L_0x0170:
            if (r12 == 0) goto L_0x0174
            r12.A07 = r3
        L_0x0174:
            return
        L_0x0175:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x017b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4O0.A0A(X.0xI, X.4Nx):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (new java.io.File(r7).exists() == false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C263844No A0C(X.C267324bN r46) {
        /*
            r45 = this;
            r4 = 0
            r0 = r46
            X.0qQ.A0B(r0, r4)
            r6 = r45
            X.4DU r2 = r6.A00
            boolean r1 = X.AnonymousClass3WX.A02(r0, r2)
            r9 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00c8
            com.instagram.common.session.UserSession r1 = r6.A03
            java.lang.String r2 = r0.ByO(r1)
            r41 = 0
            r42 = 1
        L_0x001c:
            com.instagram.common.session.UserSession r5 = r6.A03
            com.instagram.user.model.User r8 = r0.A08(r5)
            if (r8 == 0) goto L_0x00c5
            java.lang.Integer r7 = r8.A0N()
        L_0x0028:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r7 == r1) goto L_0x002d
            r9 = 0
        L_0x002d:
            r6.A00 = r0
            X.1Xj r7 = r0.A02
            if (r7 == 0) goto L_0x00c0
            X.1Xy r1 = r7.A0C
            java.lang.String r31 = r1.BIl()
            java.lang.String r1 = r7.getId()
        L_0x003d:
            r6.A01 = r1
            java.lang.String r22 = r0.getId()
            X.3QO r1 = r0.A0I
            r7 = 2
            X.0qQ.A0B(r1, r7)
            java.lang.String r7 = r6.A01
            r24 = r7
            if (r8 == 0) goto L_0x00bd
            java.lang.String r26 = r8.getId()
        L_0x0053:
            if (r8 == 0) goto L_0x00ba
            com.instagram.user.model.FollowStatus r19 = r8.B6o()
        L_0x0059:
            boolean r7 = r0.A0V
            r23 = r7
            long r14 = r0.A0D
            X.1iA r7 = r0.A0J
            r18 = r7
            X.3WR r20 = r0.A09(r5, r3)
            java.lang.String r7 = r0.A0L
            r17 = r7
            java.lang.String r13 = r0.A0Q
            java.lang.String r12 = r0.A0O
            java.lang.String r11 = r6.A09
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r9)
            com.instagram.clips.intf.ClipsViewerConfig r7 = r6.A02
            java.lang.String r10 = r7.A18
            java.lang.String r9 = r7.A14
            java.lang.String r8 = r7.A13
            java.lang.String r7 = r0.A0N
            if (r7 == 0) goto L_0x008e
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r0 = r0.exists()
            r44 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008e:
            r44 = 0
        L_0x0090:
            java.lang.String r0 = r6.A01
            java.lang.String r35 = X.C231122qu.A0H(r5, r0)
            X.4No r16 = new X.4No
            r28 = r13
            r29 = r12
            r30 = r11
            r32 = r10
            r33 = r9
            r34 = r8
            r36 = r3
            r37 = r3
            r38 = r14
            r40 = r4
            r43 = r23
            r23 = r3
            r25 = r2
            r27 = r17
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44)
            return r16
        L_0x00ba:
            r19 = r3
            goto L_0x0059
        L_0x00bd:
            r26 = r3
            goto L_0x0053
        L_0x00c0:
            r31 = r3
            r1 = r3
            goto L_0x003d
        L_0x00c5:
            r7 = r3
            goto L_0x0028
        L_0x00c8:
            boolean r1 = X.AnonymousClass3WX.A01(r0, r2)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r2 = r0.A0P
            r41 = 1
        L_0x00d2:
            r42 = 0
            goto L_0x001c
        L_0x00d6:
            boolean r1 = r0.A0W
            if (r1 == 0) goto L_0x00df
            java.lang.String r2 = r0.A0M
        L_0x00dc:
            r41 = 0
            goto L_0x00d2
        L_0x00df:
            r2 = r3
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4O0.A0C(X.4bN):X.4No");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (new java.io.File(r1).exists() == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C263974Ob A06(X.C263974Ob r17, java.lang.Object r18) {
        /*
            r16 = this;
            r3 = r18
            X.4bN r3 = (X.C267324bN) r3
            r5 = 0
            X.0qQ.A0B(r3, r5)
            r0 = 1
            r11 = r17
            X.0qQ.A0B(r11, r0)
            r7 = r16
            super.A06(r11, r3)
            com.instagram.common.session.UserSession r2 = r7.A03
            r12 = 0
            X.3WR r4 = r3.A09(r2, r12)
            java.lang.String r1 = r3.A0N
            if (r1 == 0) goto L_0x002a
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r8 = 0
            java.lang.String r0 = X.C263984Oc.A01(r4, r5, r0)
            java.lang.String r4 = "video_format"
            r11.A06(r4, r0)
            com.instagram.clips.intf.ClipsViewerConfig r6 = r7.A02
            java.lang.String r1 = r6.A13
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = "query_text"
            r11.A06(r0, r1)
        L_0x0040:
            java.lang.String r1 = r6.A14
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "rank_token"
            r11.A06(r0, r1)
        L_0x0049:
            java.lang.String r1 = r6.A18
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "search_session_id"
            r11.A06(r0, r1)
        L_0x0052:
            X.1Xj r6 = r3.A02
            if (r6 == 0) goto L_0x0082
            boolean r1 = r6.A51()
            if (r1 == 0) goto L_0x0063
            boolean r0 = X.AnonymousClass3WP.A07(r2)
            if (r0 == 0) goto L_0x0063
            r8 = 1
        L_0x0063:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "captions_available"
            r11.A03(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "captions_displayed"
            r11.A03(r0, r1)
            X.1Xy r0 = r6.A0C
            java.lang.String r1 = r0.BIl()
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "inventory_source"
            r11.A06(r0, r1)
        L_0x0082:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36329242866237312(0x81114100003f80, double:3.038097702503202E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x0101
            X.4bN r1 = r7.A00
            if (r1 == 0) goto L_0x0101
            X.1Xj r6 = r1.A02
            if (r6 == 0) goto L_0x0101
            X.HqD r0 = r7.A04
            int r10 = r0.A00(r1)
            boolean r0 = r6.A5D()
            if (r0 == 0) goto L_0x0101
            r0 = -1
            if (r10 == r0) goto L_0x0101
            X.1Xj r1 = r6.A1c(r10)
            X.1Xj r5 = r6.A1c(r5)
            if (r1 == 0) goto L_0x0101
            if (r5 == 0) goto L_0x0101
            int r9 = r6.A0o()
            X.1iA r0 = r1.BR7()
            int r7 = r0.A00
            X.3WR r0 = r1.CEL()
            boolean r8 = r0.A08()
            java.lang.String r6 = r1.getId()
            java.lang.String r1 = "Required value was null."
            if (r6 == 0) goto L_0x0161
            java.lang.String r5 = r5.getId()
            if (r5 == 0) goto L_0x015b
            long r0 = (long) r10
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_index"
            r11.A05(r0, r1)
            long r0 = (long) r9
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_size"
            r11.A05(r0, r1)
            long r0 = (long) r7
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "feed_carousel_media_type"
            r11.A05(r0, r1)
            java.lang.String r0 = "feed_carousel_media_id"
            r11.A06(r0, r6)
            java.lang.String r0 = "feed_carousel_cover_media_id"
            r11.A06(r0, r5)
            if (r8 == 0) goto L_0x0101
            java.lang.String r0 = "dash"
            r11.A06(r4, r0)
        L_0x0101:
            java.lang.String r1 = r3.A0Q
            if (r1 == 0) goto L_0x010a
            java.lang.String r0 = "ranking_info_token"
            r11.A06(r0, r1)
        L_0x010a:
            java.lang.String r1 = r3.A0O
            if (r1 == 0) goto L_0x0113
            java.lang.String r0 = "mezql_token"
            r11.A06(r0, r1)
        L_0x0113:
            java.util.Set r0 = X.AnonymousClass4O4.A0I
            java.lang.Class<X.4O4> r4 = X.AnonymousClass4O4.class
            r1 = 41
            X.9Ku r0 = new X.9Ku
            r0.<init>(r2, r1)
            java.lang.Object r10 = r2.A01(r4, r0)
            X.4O4 r10 = (X.AnonymousClass4O4) r10
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x0159
            java.lang.String r15 = r0.getId()
        L_0x012c:
            X.3WR r14 = r3.A09(r2, r12)
            r13 = r12
            r10.A03(r11, r12, r13, r14, r15)
            java.lang.String r1 = r3.A0L
            X.4Om r0 = X.C264044Oj.A00(r2)
            java.lang.String r1 = r0.AmH(r1)
            if (r1 == 0) goto L_0x0145
            java.lang.String r0 = "channel_pk"
            r11.A06(r0, r1)
        L_0x0145:
            com.instagram.user.model.User r0 = r3.A08(r2)
            if (r0 == 0) goto L_0x0158
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            X.4Oo r1 = X.C263984Oc.A00(r0)
            java.lang.String r0 = "instagram_follow_status"
            r11.A01(r1, r0)
        L_0x0158:
            return r17
        L_0x0159:
            r15 = r12
            goto L_0x012c
        L_0x015b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0161:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4O0.A06(X.4Ob, java.lang.Object):X.4Ob");
    }
}
