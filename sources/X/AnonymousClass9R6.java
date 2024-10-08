package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.9R6  reason: invalid class name */
public final class AnonymousClass9R6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Context A05;
    public final SurfaceTexture A06;
    public final C344207rU A07;
    public final UserSession A08;
    public final Integer A09;
    public final StringBuilder A0A = AnonymousClass7TE.A1A();
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static final synchronized void A03(AnonymousClass9R6 r3, String str) {
        synchronized (r3) {
            StringBuilder sb = r3.A0A;
            sb.append(str);
            sb.append(":");
            sb.append(SystemClock.elapsedRealtime());
            sb.append(";");
        }
    }

    public static final C379369To A00(AnonymousClass9R6 r3) {
        String obj;
        C344207rU r1 = r3.A07;
        if (r1.A08()) {
            return (C379369To) r1.A01(C379369To.A00);
        }
        synchronized (r3) {
            obj = r3.A0A.toString();
            0qQ.A07(obj);
        }
        0kD.A07("OneCameraMediaServiceWithAR get captureCoordinator when not connected", obj, (Throwable) null);
        return null;
    }

    private final void A01(int i, int i2) {
        AnonymousClass9SN r0;
        int i3 = this.A00 % 180;
        C379369To A002 = A00(this);
        if (i3 == 0) {
            if (A002 != null) {
                r0 = (AnonymousClass9SN) C343837qt.A02(A002);
                r0.A03 = i;
                r0.A01 = i2;
            } else {
                return;
            }
        } else if (A002 != null) {
            r0 = (AnonymousClass9SN) C343837qt.A02(A002);
            r0.A03 = i2;
            r0.A01 = i;
        } else {
            return;
        }
        AnonymousClass9SN.A03(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r4 > 2013) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass9R6 r7) {
        /*
            int r0 = r7.A02
            float r6 = (float) r0
            int r0 = r7.A01
            float r0 = (float) r0
            float r6 = r6 / r0
            int r2 = r7.A04
            int r1 = r7.A03
            android.content.Context r0 = r7.A05
            int r4 = X.AnonymousClass0Ke.A00(r0)
            r5 = 0
            r3 = 1
            int[] r2 = X.C367168qI.A00(r6, r2, r1)
            r0 = -1
            if (r4 == r0) goto L_0x001f
            r0 = 2013(0x7dd, float:2.821E-42)
            r1 = 2
            if (r4 <= r0) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            r0 = r2[r5]
            int r0 = r0 / r1
            r4 = r2[r3]
            int r4 = r4 / r1
            int[] r0 = new int[]{r0, r4}
            int r3 = r7.A02
            r2 = 0
            r1 = r0[r5]
            if (r3 >= r1) goto L_0x0036
            int r0 = r7.A01
            if (r0 >= r4) goto L_0x0036
            r2 = 1
        L_0x0036:
            java.lang.Integer r0 = r7.A09
            if (r0 == 0) goto L_0x0042
            if (r2 == 0) goto L_0x0042
            int r0 = r7.A01
            r7.A01(r3, r0)
            return
        L_0x0042:
            r7.A01(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9R6.A02(X.9R6):void");
    }

    public final void A04(FilterModel filterModel) {
        String obj;
        C366418ot r0;
        C344207rU r1 = this.A07;
        if (r1.A08()) {
            AnonymousClass9U1 r2 = (AnonymousClass9U1) r1.A02(AnonymousClass9U1.A00);
            if (r2 != null) {
                C379089Sl r22 = (C379089Sl) r2;
                if (r22.A01 != filterModel && (r0 = r22.A02) != null) {
                    r22.A01 = filterModel;
                    r22.A03.A00 = r0.B5x().A00(filterModel);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            obj = this.A0A.toString();
            0qQ.A07(obj);
        }
        0kD.A07("OneCameraMediaServiceWithAR get filterController when not connected", obj, (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.8oy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.ATs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.ATg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.ATg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: X.ATg} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9R6(android.content.Context r28, X.C368028rx r29, com.instagram.common.session.UserSession r30, java.lang.Integer r31, java.lang.String r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            r27 = this;
            r8 = 1
            r0 = r27
            r0.<init>()
            r9 = r28
            r0.A05 = r9
            r4 = r30
            r0.A08 = r4
            r3 = r33
            r0.A0D = r3
            r2 = r34
            r0.A0H = r2
            r1 = r35
            r0.A0G = r1
            r1 = r36
            r0.A0E = r1
            r1 = r37
            r0.A0F = r1
            r1 = r31
            r0.A09 = r1
            r1 = r39
            r0.A0B = r1
            r1 = r40
            r0.A0C = r1
            java.lang.String r5 = "OCVideo-"
            java.lang.String r7 = "Thread"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0.A0A = r1
            if (r34 == 0) goto L_0x028e
            r2 = 0
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            r1.<init>(r2)
        L_0x0040:
            r0.A06 = r1
            boolean r1 = r0.A0E
            r14 = 0
            if (r1 == 0) goto L_0x006c
            android.content.Context r13 = r0.A05
            X.7qz r18 = new X.7qz
            r18.<init>()
            X.8tC r17 = new X.8tC
            r17.<init>()
            X.7ro r16 = X.C344407ro.A01
            boolean r1 = r0.A0D
            r20 = 0
            r15 = r14
            r22 = r1
            r23 = r20
            r24 = r8
            r25 = r8
            r26 = r20
            r19 = r8
            r21 = r1
            X.7sO r14 = X.C344787sQ.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x006c:
            boolean r1 = r0.A0F
            if (r1 == 0) goto L_0x028b
            com.instagram.common.session.UserSession r6 = r0.A08
            X.0Tu r10 = X.0Tu.A05
            r1 = 36319476111383990(0x81085f000c1db6, double:3.031921167406396E-306)
            boolean r19 = X.182.A06(r10, r6, r1)
            if (r19 == 0) goto L_0x0086
            X.0wj r2 = X.0wj.A01
            java.lang.String r1 = "OneCameraMediaServiceWithAR"
            X.AnonymousClass7TG.A1H(r2, r1)
        L_0x0086:
            android.content.Context r2 = r0.A05
            boolean r1 = r0.A0C
            java.lang.String r17 = "OneCameraMediaServiceWithAR"
            r20 = 0
            r15 = r2
            r16 = r6
            r18 = r8
            r21 = r1
            X.8o6 r6 = X.C365968ny.A01(r15, r16, r17, r18, r19, r20, r21)
        L_0x0099:
            java.lang.Integer r10 = r0.A09
            if (r10 == 0) goto L_0x0288
            android.content.Context r2 = r0.A05
            com.instagram.common.session.UserSession r1 = r0.A08
            X.9da r10 = X.C365968ny.A02(r2, r1, r10)
        L_0x00a5:
            r13 = r29
            if (r33 == 0) goto L_0x023e
            X.7ro r11 = X.C344407ro.A01
            X.ATg r15 = new X.ATg
            r15.<init>(r11)
            boolean r1 = r0.A0H
            r1 = r1 ^ 1
            r15.A06 = r1
            r15.A05 = r8
            r15.A00 = r13
            X.A93 r1 = r15.A0D
            r1.A03 = r8
            boolean r1 = r0.A0G
            if (r1 == 0) goto L_0x00d1
            boolean r1 = r0.A0C
            if (r1 != 0) goto L_0x00d1
            X.9sO r12 = X.C391129sO.LAYOUT
            r2 = 0
            X.9dZ r1 = new X.9dZ
            r1.<init>(r11, r2)
            r15.A01(r12, r1)
        L_0x00d1:
            if (r14 == 0) goto L_0x00d8
            X.9sO r1 = X.C391129sO.EFFECT
            r15.A01(r1, r14)
        L_0x00d8:
            if (r10 == 0) goto L_0x00df
            X.9sO r1 = X.C391129sO.FILTER_PREPROCESS
            r15.A01(r1, r10)
        L_0x00df:
            if (r6 == 0) goto L_0x00e6
            X.9sO r1 = X.C391129sO.FILTER
            r15.A01(r1, r6)
        L_0x00e6:
            if (r38 == 0) goto L_0x0238
            int r1 = r0.hashCode()
            java.lang.String r6 = X.002.A0O(r5, r1)
        L_0x00f0:
            X.7qz r2 = new X.7qz
            r2.<init>()
            X.7rr r5 = X.C343897qz.A01()
            r1 = 0
            r5.A00(r6, r1)
            r5 = r32
            int r1 = r5.hashCode()
            switch(r1) {
                case -1941167627: goto L_0x0198;
                case -1705349612: goto L_0x01a4;
                case -1173729015: goto L_0x01b0;
                case -893858883: goto L_0x01bc;
                case 299265722: goto L_0x01cc;
                case 460837420: goto L_0x01d8;
                case 693541831: goto L_0x01e8;
                case 822756427: goto L_0x01f4;
                case 906220026: goto L_0x0200;
                case 919765506: goto L_0x020c;
                case 1029649978: goto L_0x021c;
                case 1121724483: goto L_0x0228;
                default: goto L_0x0106;
            }
        L_0x0106:
            java.lang.String r1 = "instagram_post_capture"
        L_0x0108:
            X.7qZ r5 = new X.7qZ
            r5.<init>((java.lang.String) r1)
            X.7qb r1 = X.C343737qi.A0E
            r5.A02(r1, r15)
            X.7qb r1 = X.C343677qc.A00
            r5.A02(r1, r4)
            X.7qb r7 = X.C366138oF.A00
            r1 = r33 ^ 1
            X.C343647qZ.A00(r5, r7, r1)
            X.7qb r7 = X.C343737qi.A0I
            android.os.Handler r1 = r2.BAM(r6)
            r5.A02(r7, r1)
            X.7qb r2 = X.C343737qi.A02
            java.lang.Object r1 = X.C343747qj.A06
            r5.A02(r2, r1)
            X.7qb r1 = X.C343737qi.A0A
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            r5.A02(r1, r2)
            X.7qb r1 = X.C343737qi.A08
            X.C343647qZ.A00(r5, r1, r3)
            X.7qb r1 = X.C343777qm.A00
            r5.A02(r1, r2)
            X.7qb r10 = X.C343737qi.A06
            X.0Tu r7 = X.0Tu.A05
            r1 = 36324252114366376(0x810cb700022fa8, double:3.0349415309238774E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r7, r4, r1)
            r5.A02(r10, r1)
            X.7qb r10 = X.C343737qi.A0L
            r1 = 36605727091201328(0x820cb700041530, double:3.212947439683059E-306)
            long r1 = X.182.A01(r7, r4, r1)
            int r11 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r5.A02(r10, r1)
            if (r33 == 0) goto L_0x0174
            X.7qb r3 = X.C343737qi.A07
            r1 = 36328074635131826(0x81103100003bb2, double:3.0373589084480036E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r7, r4, r1)
            r5.A02(r3, r1)
        L_0x0174:
            if (r38 == 0) goto L_0x017b
            X.7qb r1 = X.C343737qi.A0J
            r5.A02(r1, r6)
        L_0x017b:
            if (r14 == 0) goto L_0x0182
            X.7qb r1 = X.C343767ql.A00
            r5.A02(r1, r14)
        L_0x0182:
            X.7qa r2 = new X.7qa
            r2.<init>(r5)
            X.AUY r1 = new X.AUY
            r1.<init>(r8)
            X.7rU r1 = X.C343807qq.A00(r9, r2, r1)
            r0.A07 = r1
            java.lang.String r1 = "init"
            A03(r0, r1)
            return
        L_0x0198:
            java.lang.String r1 = "post_cap_direct"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_direct_postcapture"
            goto L_0x0108
        L_0x01a4:
            java.lang.String r1 = "igtv_share_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_igtv_share"
            goto L_0x0108
        L_0x01b0:
            java.lang.String r1 = "shoutout_share_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_shoutout_share"
            goto L_0x0108
        L_0x01bc:
            r1 = 3120(0xc30, float:4.372E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_feed_postcapture_preview"
            goto L_0x0108
        L_0x01cc:
            java.lang.String r1 = "photo_credit_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_photo_credit"
            goto L_0x0108
        L_0x01d8:
            r1 = 1353(0x549, float:1.896E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_feed_postcapture_filter_fragment"
            goto L_0x0108
        L_0x01e8:
            java.lang.String r1 = "post_cap_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_postcapture"
            goto L_0x0108
        L_0x01f4:
            java.lang.String r1 = "mention_reshare_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_mention_reshare"
            goto L_0x0108
        L_0x0200:
            java.lang.String r1 = "reels_reshare_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_reels_reshare"
            goto L_0x0108
        L_0x020c:
            r1 = 3121(0xc31, float:4.373E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_feed_postcapture_trim_fragment"
            goto L_0x0108
        L_0x021c:
            java.lang.String r1 = "reel_memory_share_stories"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_stories_reel_memory_share"
            goto L_0x0108
        L_0x0228:
            r1 = 3119(0xc2f, float:4.37E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "instagram_feed_postcapture_cover_fragment"
            goto L_0x0108
        L_0x0238:
            java.lang.String r6 = X.002.A0R(r5, r7)
            goto L_0x00f0
        L_0x023e:
            java.lang.Integer r1 = r0.A09
            if (r1 == 0) goto L_0x0267
            if (r10 == 0) goto L_0x0267
            X.7ro r18 = X.C344407ro.A01
            X.0qQ.A08(r18)
            com.instagram.common.session.UserSession r12 = r0.A08
            X.0Tu r11 = X.0Tu.A05
            r1 = 36320171895824466(0x81090100082052, double:3.032361184288252E-306)
            boolean r22 = X.182.A06(r11, r12, r1)
            X.ATs r15 = new X.ATs
            r17 = r14
            r19 = r10
            r20 = r6
            r21 = r8
            r16 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00e6
        L_0x0267:
            X.7ro r18 = X.C344407ro.A01
            X.0qQ.A08(r18)
            com.instagram.common.session.UserSession r11 = r0.A08
            X.0Tu r10 = X.0Tu.A05
            r1 = 36324252114366376(0x810cb700022fa8, double:3.0349415309238774E-306)
            boolean r21 = X.182.A06(r10, r11, r1)
            X.8oy r15 = new X.8oy
            r17 = r14
            r19 = r6
            r20 = r8
            r16 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x00e6
        L_0x0288:
            r10 = 0
            goto L_0x00a5
        L_0x028b:
            r6 = 0
            goto L_0x0099
        L_0x028e:
            r1 = 0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9R6.<init>(android.content.Context, X.8rx, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
