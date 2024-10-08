package X;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.91w  reason: invalid class name and case insensitive filesystem */
public final class C3726691w {
    public static final C3726891y A00 = new C3726891y(new C3726791x());
    public static final C3726691w A01 = new Object();

    public static final void A05(NotificationManager notificationManager, Context context, boolean z) {
        NotificationManager notificationManager2 = notificationManager;
        0qQ.A0B(notificationManager, 1);
        if (z && 0oI.A0C(context)) {
            String string = context.getString(2131968662);
            0qQ.A07(string);
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("IG", string));
        }
        2Gm.A01(notificationManager2, (Uri) null, 2HA.A0P, "IG", context.getResources().getString(2131968654), 2, 0, 1, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0327  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(android.content.Context r36, X.0lg r37) {
        /*
            r8 = 0
            r2 = r36
            X.0qQ.A0B(r2, r8)
            r7 = 1
            X.91w r3 = A01
            android.net.Uri r29 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            X.0qQ.A08(r29)
            r4 = r37
            boolean r0 = A0C(r2, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 0
            A0A(r2, r4, r0)
        L_0x001a:
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r2.getSystemService(r0)
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            r3.A04(r1, r2, r4)
            X.91z r0 = X.C3726991z.A01
            if (r0 != 0) goto L_0x0039
            X.91z r0 = new X.91z
            r0.<init>(r2)
            X.C3726991z.A01 = r0
        L_0x0039:
            X.0xa r5 = r0.A00
            java.lang.String r3 = "CHANNELS_VERSION"
            int r6 = r5.getInt(r3, r7)
            r11 = 3
            r10 = 2
            r9 = 4
            if (r6 >= r10) goto L_0x008c
            java.lang.String r12 = "likes"
            java.lang.String r13 = "comments"
            java.lang.String r14 = "comment_likes"
            java.lang.String r15 = "likes_and_comments_on_photos_of_you"
            java.lang.String r16 = "view_counts"
            r6 = 1682(0x692, float:2.357E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r6)
            java.lang.String r18 = "mentions_in_bio"
            r6 = 743(0x2e7, float:1.041E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r6)
            r6 = 980(0x3d4, float:1.373E-42)
            java.lang.String r20 = X.C66579MXk.A00(r6)
            java.lang.String r21 = "friends_on_instagram"
            java.lang.String r22 = "first_posts_and_stories"
            java.lang.String r23 = "live_videos"
            r6 = 3877(0xf25, float:5.433E-42)
            java.lang.String r24 = X.AnonymousClass000.A00(r6)
            java.lang.String r25 = "product_announcements"
            r6 = 4077(0xfed, float:5.713E-42)
            java.lang.String r26 = X.AnonymousClass000.A00(r6)
            java.lang.String r27 = "igtv_video_updates"
            java.lang.String r28 = "other"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}
        L_0x0080:
            int r14 = r13.length
            r12 = 0
        L_0x0082:
            r6 = r13[r12]
            r1.deleteNotificationChannel(r6)
            int r12 = r12 + 1
            if (r12 >= r14) goto L_0x009c
            goto L_0x0082
        L_0x008c:
            if (r6 >= r11) goto L_0x0095
            java.lang.String[] r13 = new java.lang.String[r7]
            java.lang.String r6 = "ig_direct_incoming_video_chat"
        L_0x0092:
            r13[r8] = r6
            goto L_0x0080
        L_0x0095:
            if (r6 >= r9) goto L_0x009c
            java.lang.String[] r13 = new java.lang.String[r7]
            java.lang.String r6 = "ig_direct_incoming_video_call"
            goto L_0x0092
        L_0x009c:
            r12 = 36316237707546775(0x81056d00231097, double:3.029873187779736E-306)
            X.0tM r6 = X.AnonymousClass0yP.A00(r12)
            boolean r6 = X.0yU.A07(r6)
            if (r6 == 0) goto L_0x0327
            X.0nO r5 = X.0nY.A00()
            X.9ke r3 = new X.9ke
            r3.<init>(r0)
            r5.ATE(r3)
        L_0x00b7:
            boolean r0 = X.0oI.A0C(r2)
            if (r0 == 0) goto L_0x02dc
            r0 = 2131968661(0x7f134295, float:1.9574223E38)
            java.lang.String r5 = r2.getString(r0)
            X.0qQ.A07(r5)
            java.lang.String r0 = "DIRECT"
            android.app.NotificationChannelGroup r3 = new android.app.NotificationChannelGroup
            r3.<init>(r0, r5)
            r1.createNotificationChannelGroup(r3)
            r3 = 2131099821(0x7f0600ad, float:1.7812006E38)
            int r34 = r2.getColor(r3)
            X.2HA r30 = X.2HA.A09
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968645(0x7f134285, float:1.957419E38)
            java.lang.String r32 = r5.getString(r3)
            r28 = r1
            r31 = r0
            r33 = r9
            r35 = r8
            r36 = r7
            r37 = r7
            X.2Gm.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.2HA r30 = X.2HA.A08
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968644(0x7f134284, float:1.9574188E38)
            java.lang.String r32 = r5.getString(r3)
            X.2Gm.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.2HA r30 = X.2HA.A0A
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968646(0x7f134286, float:1.9574192E38)
            java.lang.String r32 = r5.getString(r3)
            r3 = 2131100628(0x7f0603d4, float:1.7813643E38)
            int r34 = r2.getColor(r3)
            X.2Gm.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0 = 2131968662(0x7f134296, float:1.9574225E38)
            java.lang.String r5 = r2.getString(r0)
            X.0qQ.A07(r5)
            java.lang.String r0 = "IG"
            android.app.NotificationChannelGroup r3 = new android.app.NotificationChannelGroup
            r3.<init>(r0, r5)
            r1.createNotificationChannelGroup(r3)
            X.0Tu r3 = X.0Tu.A05
            r5 = 36325162647302821(0x810d8b000032a5, double:3.035517355619307E-306)
            boolean r3 = X.182.A06(r3, r4, r5)
            if (r3 == 0) goto L_0x0320
            X.2HA r14 = X.2HA.A0Q
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968655(0x7f13428f, float:1.957421E38)
            java.lang.String r16 = r5.getString(r3)
            r17 = 5
            r12 = r1
            r13 = r29
            r15 = r0
            r18 = r8
            r19 = r7
            r20 = r7
            r21 = r7
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x015a:
            X.2HA r14 = X.2HA.A0I
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968648(0x7f134288, float:1.9574197E38)
            java.lang.String r16 = r5.getString(r3)
            r13 = 0
            r12 = r1
            r15 = r0
            r17 = r11
            r18 = r8
            r19 = r7
            r20 = r8
            r21 = r7
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r3 = X.2HA.A06
            X.2Gm.A02(r1, r3)
            X.2HA r14 = X.2HA.A05
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968639(0x7f13427f, float:1.9574178E38)
            java.lang.String r16 = r5.getString(r3)
            r17 = r9
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A07
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968638(0x7f13427e, float:1.9574176E38)
            java.lang.String r16 = r5.getString(r3)
            r17 = r11
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0J
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968647(0x7f134287, float:1.9574195E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0b
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968660(0x7f134294, float:1.957422E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0O
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968653(0x7f13428d, float:1.9574207E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0L
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968650(0x7f13428a, float:1.95742E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A03
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968636(0x7f13427c, float:1.9574172E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0M
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968651(0x7f13428b, float:1.9574203E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0C
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968641(0x7f134281, float:1.9574182E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0B
            android.content.res.Resources r5 = r2.getResources()
            r3 = 2131968640(0x7f134280, float:1.957418E38)
            java.lang.String r16 = r5.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            A05(r1, r2, r8)
            boolean r3 = X.AnonymousClass920.A00(r2, r4)
            A06(r1, r2, r3)
            X.2HA r3 = X.2HA.A0T
            X.2Gm.A02(r1, r3)
            X.2HA r3 = X.2HA.A0E
            X.2Gm.A02(r1, r3)
            X.2HA r3 = X.2HA.A0U
            X.2Gm.A02(r1, r3)
            X.2HA r14 = X.2HA.A0S
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968657(0x7f134291, float:1.9574215E38)
            java.lang.String r16 = r4.getString(r3)
            r17 = r9
            r20 = r7
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0R
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968656(0x7f134290, float:1.9574213E38)
            java.lang.String r16 = r4.getString(r3)
            r17 = r11
            r20 = r8
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0X
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968658(0x7f134292, float:1.9574217E38)
            java.lang.String r16 = r4.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A04
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968637(0x7f13427d, float:1.9574174E38)
            java.lang.String r16 = r4.getString(r3)
            r17 = r9
            r20 = r7
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3 = 2131968664(0x7f134298, float:1.957423E38)
            java.lang.String r4 = r2.getString(r3)
            X.0qQ.A07(r4)
            java.lang.String r5 = "IGTV"
            android.app.NotificationChannelGroup r3 = new android.app.NotificationChannelGroup
            r3.<init>(r5, r4)
            r1.createNotificationChannelGroup(r3)
            X.2HA r14 = X.2HA.A0H
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968643(0x7f134283, float:1.9574186E38)
            java.lang.String r16 = r4.getString(r3)
            r15 = r5
            r17 = r11
            r20 = r8
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0G
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968642(0x7f134282, float:1.9574184E38)
            java.lang.String r16 = r4.getString(r3)
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0W
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131968663(0x7f134297, float:1.9574227E38)
            java.lang.String r16 = r4.getString(r3)
            r3 = 2131099821(0x7f0600ad, float:1.7812006E38)
            int r18 = r2.getColor(r3)
            r15 = r0
            r17 = r9
            r19 = r8
            r20 = r7
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x02dc:
            r0 = 2131968662(0x7f134296, float:1.9574225E38)
            java.lang.String r3 = r2.getString(r0)
            X.0qQ.A07(r3)
            java.lang.String r4 = "IG"
            android.app.NotificationChannelGroup r0 = new android.app.NotificationChannelGroup
            r0.<init>(r4, r3)
            r1.createNotificationChannelGroup(r0)
            X.2HA r14 = X.2HA.A0a
            android.content.res.Resources r3 = r2.getResources()
            r0 = 2131968659(0x7f134293, float:1.9574219E38)
            java.lang.String r16 = r3.getString(r0)
            r13 = 0
            r12 = r1
            r15 = r4
            r17 = r10
            r18 = r8
            r19 = r7
            r20 = r8
            r21 = r7
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2HA r14 = X.2HA.A0N
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131968652(0x7f13428c, float:1.9574205E38)
            java.lang.String r16 = r2.getString(r0)
            r17 = r11
            X.2Gm.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0320:
            X.2HA r3 = X.2HA.A0Q
            X.2Gm.A02(r1, r3)
            goto L_0x015a
        L_0x0327:
            X.0xY r0 = r5.AR4()
            r0.E5Z(r3, r9)
            r0.apply()
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3726691w.A09(android.content.Context, X.0lg):void");
    }

    public static final void A0A(Context context, 0lg r5, Map map) {
        Integer num;
        0qQ.A0B(context, 0);
        if (!182.A06(0Tu.A05, r5, 2342162476734487975L) || (r5 instanceof UserSession)) {
            C3726991z r3 = C3726991z.A01;
            if (r3 == null) {
                r3 = new C3726991z(context);
                C3726991z.A01 = r3;
            }
            boolean A012 = AnonymousClass0oH.A01(context);
            C3726891y r1 = A00;
            if (A012) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            r1.A00(r5, num, map);
            r3.A01(A012);
        }
    }

    public static final void A0B(Context context, 0lg r3, boolean z) {
        0qQ.A0B(context, 0);
        0qQ.A0B(r3, 1);
        if (z) {
            A0A(context, r3, (Map) null);
        }
        Object systemService = context.getSystemService("notification");
        0qQ.A0C(systemService, AnonymousClass000.A00(175));
        A01.A04((NotificationManager) systemService, context, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if ((r8 instanceof com.instagram.common.session.UserSession) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0C(android.content.Context r7, X.0lg r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r1 = 1
            X.0qQ.A0B(r8, r1)
            X.91z r0 = X.C3726991z.A01
            if (r0 != 0) goto L_0x0013
            X.91z r0 = new X.91z
            r0.<init>(r7)
            X.C3726991z.A01 = r0
        L_0x0013:
            boolean r4 = X.AnonymousClass0oH.A01(r7)
            X.0xa r7 = r0.A00
            java.lang.String r0 = "NOTIFICATIONS_ARE_ENABLED"
            boolean r3 = r7.getBoolean(r0, r1)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "LAST_FULL_LOGGING_TS_FOR_"
            java.lang.String r0 = r8.getToken()
            java.lang.String r2 = X.002.A0R(r1, r0)
            r0 = 0
            long r0 = r7.getLong(r2, r0)
            long r5 = r5 - r0
            long r1 = X.C3726991z.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            r1 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            r0 = 1
            if (r4 != r3) goto L_0x0046
            if (r1 != 0) goto L_0x0046
            r0 = 0
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3726691w.A0C(android.content.Context, X.0lg):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if (r8.equals(r0) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
        r4 = r1.A01(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b2, code lost:
        if (r8.equals(r0) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b4, code lost:
        r4 = X.2HA.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f5, code lost:
        if (r2 == r4) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f7, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.2HA A00(android.content.Context r3, X.2HA r4, X.0lg r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            X.91w r1 = A01
            if (r4 == 0) goto L_0x0014
            X.2HA r0 = X.2HA.A0c
            if (r4 == r0) goto L_0x0014
            X.2HA r0 = X.2HA.A0N
            if (r4 == r0) goto L_0x0014
            X.2HA r0 = X.2HA.A0d
            if (r4 == r0) goto L_0x0014
            X.0qQ.A0A(r4)
        L_0x0013:
            return r4
        L_0x0014:
            X.2HA r4 = A02(r3, r5, r7)
            X.2HA r2 = X.2HA.A0N
            if (r2 != r4) goto L_0x0013
            if (r8 == 0) goto L_0x0025
            int r0 = r8.hashCode()
            switch(r0) {
                case -2112036847: goto L_0x0068;
                case -2087444809: goto L_0x0074;
                case -1372693202: goto L_0x0077;
                case -971609053: goto L_0x0084;
                case -147112977: goto L_0x0087;
                case 3321751: goto L_0x0096;
                case 3446944: goto L_0x00a1;
                case 835198941: goto L_0x00ac;
                case 950398559: goto L_0x00b7;
                case 1227036430: goto L_0x00c2;
                case 1271059305: goto L_0x00cd;
                case 1316977209: goto L_0x00d8;
                case 1981798234: goto L_0x00e7;
                default: goto L_0x0025;
            }
        L_0x0025:
            if (r6 == 0) goto L_0x002e
            int r0 = r6.hashCode()
            switch(r0) {
                case -1331586071: goto L_0x002f;
                case -1190461686: goto L_0x003a;
                case -971609053: goto L_0x0047;
                case -942901024: goto L_0x0052;
                case 1227036430: goto L_0x005d;
                default: goto L_0x002e;
            }
        L_0x002e:
            return r2
        L_0x002f:
            java.lang.String r0 = "direct"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            X.2HA r2 = X.2HA.A08
            return r2
        L_0x003a:
            java.lang.String r0 = "iglive"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            X.2HA r2 = r1.A01(r3, r5)
            return r2
        L_0x0047:
            java.lang.String r0 = "video_call_incoming"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            X.2HA r2 = X.2HA.A0A
            return r2
        L_0x0052:
            java.lang.String r0 = "ROLL_CALL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            X.2HA r2 = X.2HA.A04
            return r2
        L_0x005d:
            java.lang.String r0 = "ig_shopping_drops"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002e
            X.2HA r2 = X.2HA.A0W
            return r2
        L_0x0068:
            java.lang.String r0 = "rollcall_story"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A04
            goto L_0x00f5
        L_0x0074:
            java.lang.String r0 = "live_broadcast_revoke"
            goto L_0x0079
        L_0x0077:
            java.lang.String r0 = "live_broadcast"
        L_0x0079:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = r1.A01(r3, r5)
            goto L_0x00f5
        L_0x0084:
            java.lang.String r0 = "video_call_incoming"
            goto L_0x00ae
        L_0x0087:
            r0 = 4180(0x1054, float:5.857E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A0O
            goto L_0x00f5
        L_0x0096:
            java.lang.String r0 = "like"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A0I
            goto L_0x00f5
        L_0x00a1:
            java.lang.String r0 = "post"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A0B
            goto L_0x00f5
        L_0x00ac:
            java.lang.String r0 = "video_call_ended"
        L_0x00ae:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A0A
            goto L_0x00f5
        L_0x00b7:
            java.lang.String r0 = "comment"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A05
            goto L_0x00f5
        L_0x00c2:
            java.lang.String r0 = "ig_shopping_drops"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A0W
            goto L_0x00f5
        L_0x00cd:
            java.lang.String r0 = "contactjoined"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A0C
            goto L_0x00f5
        L_0x00d8:
            r0 = 743(0x2e7, float:1.041E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A03
            goto L_0x00f5
        L_0x00e7:
            r0 = 4716(0x126c, float:6.609E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0025
            X.2HA r4 = X.2HA.A08
        L_0x00f5:
            if (r2 == r4) goto L_0x0025
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3726691w.A00(android.content.Context, X.2HA, X.0lg, java.lang.String, java.lang.String, java.lang.String):X.2HA");
    }

    private final 2HA A01(Context context, 0lg r7) {
        if (context == null) {
            try {
                return 2HA.A0K;
            } catch (Exception unused) {
                return 2HA.A0K;
            }
        } else if (r7 == null) {
            return 2HA.A0K;
        } else {
            boolean A002 = AnonymousClass920.A00(context, r7);
            2HA r3 = 2HA.A0D;
            0qQ.A0B(r3, 1);
            boolean z = true;
            if (2Gm.A00(context, r3, false) != true) {
                z = false;
            }
            if (A002 != z) {
                Object systemService = context.getSystemService("notification");
                0qQ.A0C(systemService, AnonymousClass000.A00(175));
                A06((NotificationManager) systemService, context, A002);
            }
            if (!A002) {
                return 2HA.A0K;
            }
            return r3;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01e0, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e4, code lost:
        return X.2HA.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f9, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01fd, code lost:
        return X.2HA.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0204, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0208, code lost:
        return X.2HA.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0221, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0225, code lost:
        return X.2HA.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0233, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0237, code lost:
        return X.2HA.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0255, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0259, code lost:
        return X.2HA.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02a6, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02aa, code lost:
        return X.2HA.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02ad, code lost:
        r0 = X.C66579MXk.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02d0, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02d4, code lost:
        return X.2HA.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02e7, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02ed, code lost:
        return r1.A01(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x02f4, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x02f8, code lost:
        return X.2HA.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x02ff, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0303, code lost:
        return X.2HA.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0383, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0387, code lost:
        return X.2HA.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x038e, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0392, code lost:
        return X.2HA.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x039f, code lost:
        if (r6.equals(r0) != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x03ba, code lost:
        if (r6.equals(r0) != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x03f1, code lost:
        if (r6.equals(r0) != false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x03ff, code lost:
        if (r6.equals(X.C273654mx.A00(2827)) != false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0401, code lost:
        r0 = X.0Tu.A05;
        r2 = 36323337286265949L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0417, code lost:
        if (r6.equals("threads_app_daily_digest") != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0430, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36329105427283762L) != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0448, code lost:
        if (r6.equals(r0) != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0452, code lost:
        if (r6.equals("contact_friend") != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0454, code lost:
        r0 = X.0Tu.A05;
        r2 = 36323337286331486L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x045f, code lost:
        if (X.182.A06(r0, r5, r2) != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0463, code lost:
        return X.2HA.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0464, code lost:
        if (r5 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0100, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0104, code lost:
        return X.2HA.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0112, code lost:
        if (r6.equals(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0116, code lost:
        return X.2HA.A0b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.2HA A02(android.content.Context r4, X.0lg r5, java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0036
            X.91w r1 = A01
            if (r4 == 0) goto L_0x0464
            if (r5 == 0) goto L_0x002f
            boolean r0 = X.0oI.A09(r4)
            if (r0 == 0) goto L_0x0015
            int r0 = r6.hashCode()
            switch(r0) {
                case -1236774150: goto L_0x041a;
                case -713595869: goto L_0x041d;
                case -199154064: goto L_0x0433;
                case 184481018: goto L_0x0436;
                case 249312974: goto L_0x0439;
                case 557316868: goto L_0x043c;
                case 1050927582: goto L_0x0411;
                case 1447578858: goto L_0x043f;
                case 1952490697: goto L_0x0442;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r0 = "clips_daily_digest"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0409
            java.lang.String r0 = "clips_daily_digest_unconnected_regional_popular"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0409
            int r2 = r6.hashCode()
            switch(r2) {
                case -1906543217: goto L_0x03be;
                case -1152545677: goto L_0x03f5;
                case -883003243: goto L_0x03c1;
                case -244616762: goto L_0x03c4;
                case 84183587: goto L_0x03c7;
                case 558800692: goto L_0x03ce;
                case 1180014742: goto L_0x03d1;
                case 1609018801: goto L_0x03d4;
                case 1796688562: goto L_0x03d7;
                case 1868922880: goto L_0x03da;
                case 2010705035: goto L_0x03e1;
                case 2107103844: goto L_0x03e4;
                case 2137571325: goto L_0x03eb;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r2) {
                case -1553865308: goto L_0x03ae;
                case -673972323: goto L_0x044c;
                case -184602015: goto L_0x03b1;
                case 1900840744: goto L_0x03b4;
                default: goto L_0x002f;
            }
        L_0x002f:
            int r0 = r6.hashCode()
            switch(r0) {
                case -2137336791: goto L_0x003d;
                case -2102919056: goto L_0x0045;
                case -2087444809: goto L_0x004d;
                case -2047271981: goto L_0x0055;
                case -2022783564: goto L_0x0061;
                case -1885162274: goto L_0x0071;
                case -1857721452: goto L_0x0079;
                case -1856406207: goto L_0x007d;
                case -1842994800: goto L_0x0089;
                case -1731345665: goto L_0x008d;
                case -1695377065: goto L_0x0091;
                case -1677115218: goto L_0x0095;
                case -1660159711: goto L_0x0099;
                case -1574027804: goto L_0x00a8;
                case -1526685094: goto L_0x00ac;
                case -1524232326: goto L_0x00b0;
                case -1453616659: goto L_0x00b4;
                case -1386866553: goto L_0x00b8;
                case -1372693202: goto L_0x00bc;
                case -1307214883: goto L_0x00c0;
                case -1306514533: goto L_0x00c8;
                case -1275894555: goto L_0x00cc;
                case -1267790293: goto L_0x00d0;
                case -1236050907: goto L_0x00d4;
                case -1217082036: goto L_0x00d8;
                case -1198298078: goto L_0x00dc;
                case -1162687579: goto L_0x00e7;
                case -1135564092: goto L_0x00eb;
                case -1106313727: goto L_0x00ef;
                case -1096306741: goto L_0x00f3;
                case -971609053: goto L_0x00fa;
                case -913036636: goto L_0x010c;
                case -885025563: goto L_0x0117;
                case -875002185: goto L_0x011b;
                case -847438019: goto L_0x011f;
                case -818980110: goto L_0x0123;
                case -808068321: goto L_0x0127;
                case -769340174: goto L_0x012b;
                case -734481234: goto L_0x012f;
                case -697224731: goto L_0x0133;
                case -687634452: goto L_0x013b;
                case -672464592: goto L_0x013f;
                case -632526634: goto L_0x0147;
                case -625626430: goto L_0x014b;
                case -602245381: goto L_0x014f;
                case -593662069: goto L_0x0153;
                case -562217912: goto L_0x0157;
                case -547519719: goto L_0x015b;
                case -546207813: goto L_0x015f;
                case -511002940: goto L_0x0163;
                case -488751509: goto L_0x0167;
                case -445062908: goto L_0x016f;
                case -444918457: goto L_0x0173;
                case -420332607: goto L_0x017b;
                case -418198198: goto L_0x017f;
                case -371953802: goto L_0x0183;
                case -344974562: goto L_0x0187;
                case -323422923: goto L_0x0192;
                case -309357048: goto L_0x019d;
                case -304907360: goto L_0x01a8;
                case -267850458: goto L_0x01b0;
                case -238575446: goto L_0x01b4;
                case -224909781: goto L_0x01bc;
                case -160912177: goto L_0x01c0;
                case -139282336: goto L_0x01c4;
                case -92994072: goto L_0x01c8;
                case -84075461: goto L_0x01d3;
                case -48829670: goto L_0x01da;
                case 3321751: goto L_0x01e5;
                case 61791015: goto L_0x01f3;
                case 152565738: goto L_0x01fe;
                case 156608718: goto L_0x0209;
                case 295987376: goto L_0x021b;
                case 344285418: goto L_0x0229;
                case 352352772: goto L_0x0238;
                case 393866503: goto L_0x023c;
                case 435144458: goto L_0x0240;
                case 469702526: goto L_0x0244;
                case 535918816: goto L_0x024f;
                case 566036496: goto L_0x025a;
                case 626712134: goto L_0x025e;
                case 641814964: goto L_0x0262;
                case 659030007: goto L_0x0266;
                case 663545635: goto L_0x0269;
                case 713969956: goto L_0x026c;
                case 714204858: goto L_0x0274;
                case 717447420: goto L_0x027c;
                case 728186734: goto L_0x0280;
                case 781746387: goto L_0x0284;
                case 781807631: goto L_0x0287;
                case 787249496: goto L_0x028b;
                case 795385207: goto L_0x028e;
                case 826222930: goto L_0x029d;
                case 830269490: goto L_0x02a0;
                case 835198941: goto L_0x00f7;
                case 842386606: goto L_0x01f0;
                case 848058770: goto L_0x0226;
                case 946725162: goto L_0x02ab;
                case 950398559: goto L_0x02b3;
                case 957743319: goto L_0x02b6;
                case 1007573942: goto L_0x02ba;
                case 1025042645: goto L_0x02be;
                case 1076274777: goto L_0x02c6;
                case 1086965870: goto L_0x02ca;
                case 1126829305: goto L_0x02d5;
                case 1133147624: goto L_0x02d9;
                case 1136414394: goto L_0x02dd;
                case 1149018460: goto L_0x024c;
                case 1206711977: goto L_0x02e1;
                case 1209368341: goto L_0x02ee;
                case 1215941979: goto L_0x0049;
                case 1226409732: goto L_0x02f9;
                case 1233099618: goto L_0x0304;
                case 1271059305: goto L_0x0075;
                case 1276331536: goto L_0x0308;
                case 1316977209: goto L_0x0069;
                case 1342837379: goto L_0x0310;
                case 1350646482: goto L_0x0313;
                case 1494209082: goto L_0x0039;
                case 1512892351: goto L_0x0317;
                case 1536403929: goto L_0x0369;
                case 1539594266: goto L_0x0374;
                case 1545657058: goto L_0x01d7;
                case 1552386812: goto L_0x0377;
                case 1574018455: goto L_0x0137;
                case 1623040524: goto L_0x037a;
                case 1677710649: goto L_0x0105;
                case 1701036565: goto L_0x0041;
                case 1715775127: goto L_0x037d;
                case 1724420895: goto L_0x0388;
                case 1765823574: goto L_0x0085;
                case 1811698044: goto L_0x0214;
                case 1850301507: goto L_0x0393;
                case 1864168171: goto L_0x0051;
                case 1933086467: goto L_0x00a4;
                case 1985308587: goto L_0x0396;
                case 1988196344: goto L_0x0399;
                case 2008141324: goto L_0x0059;
                case 2046431615: goto L_0x03a3;
                default: goto L_0x0036;
            }
        L_0x0036:
            X.2HA r3 = X.2HA.A0N
        L_0x0038:
            return r3
        L_0x0039:
            java.lang.String r0 = "comment_subscribed"
            goto L_0x02cc
        L_0x003d:
            java.lang.String r0 = "mentioned_comment"
            goto L_0x02cc
        L_0x0041:
            java.lang.String r0 = "resurrected_user_post"
            goto L_0x02a2
        L_0x0045:
            java.lang.String r0 = "first_bestie_post"
            goto L_0x02a2
        L_0x0049:
            java.lang.String r0 = "live_views"
            goto L_0x02e3
        L_0x004d:
            java.lang.String r0 = "live_broadcast_revoke"
            goto L_0x02e3
        L_0x0051:
            java.lang.String r0 = "branded_content_tagged"
            goto L_0x02fb
        L_0x0055:
            java.lang.String r0 = "story_mentions"
            goto L_0x02fb
        L_0x0059:
            r0 = 736(0x2e0, float:1.031E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            goto L_0x039b
        L_0x0061:
            r0 = 4053(0xfd5, float:5.68E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x039b
        L_0x0069:
            r0 = 743(0x2e7, float:1.041E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x02f0
        L_0x0071:
            java.lang.String r0 = "new_business_follower"
            goto L_0x02f0
        L_0x0075:
            java.lang.String r0 = "contactjoined"
            goto L_0x0200
        L_0x0079:
            java.lang.String r0 = "twitter_contact_joined"
            goto L_0x0200
        L_0x007d:
            r0 = 2698(0xa8a, float:3.781E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x039b
        L_0x0085:
            java.lang.String r0 = "direct_v2_channel"
            goto L_0x038a
        L_0x0089:
            java.lang.String r0 = "direct_v2_business_unread_reminder"
            goto L_0x038a
        L_0x008d:
            java.lang.String r0 = "set_profile_photo"
            goto L_0x039b
        L_0x0091:
            java.lang.String r0 = "direct_share_received"
            goto L_0x038a
        L_0x0095:
            java.lang.String r0 = "promote_account"
            goto L_0x039b
        L_0x0099:
            java.lang.String r0 = "tagged_in_bio"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0L
            return r3
        L_0x00a4:
            java.lang.String r0 = "promote_contact_import"
            goto L_0x037f
        L_0x00a8:
            java.lang.String r0 = "promote_first_photo"
            goto L_0x037f
        L_0x00ac:
            java.lang.String r0 = "unseen_activity"
            goto L_0x039b
        L_0x00b0:
            java.lang.String r0 = "introduction_share"
            goto L_0x037f
        L_0x00b4:
            java.lang.String r0 = "fb_ig_followee_on_fb_recently_joined"
            goto L_0x0200
        L_0x00b8:
            java.lang.String r0 = "story_producer_expire_media"
            goto L_0x039b
        L_0x00bc:
            java.lang.String r0 = "live_broadcast"
            goto L_0x02e3
        L_0x00c0:
            r0 = 1613(0x64d, float:2.26E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x02f0
        L_0x00c8:
            java.lang.String r0 = "introduction_confirm"
            goto L_0x037f
        L_0x00cc:
            java.lang.String r0 = "feed_interest_content"
            goto L_0x039b
        L_0x00d0:
            java.lang.String r0 = "fb_contact_joined"
            goto L_0x0200
        L_0x00d4:
            java.lang.String r0 = "fb_ig_friend_request_pending_non_ig_followee"
            goto L_0x02f0
        L_0x00d8:
            java.lang.String r0 = "vkontakte_contact_joined"
            goto L_0x0200
        L_0x00dc:
            java.lang.String r0 = "text_post_app_like"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0f
            return r3
        L_0x00e7:
            java.lang.String r0 = "credit_card_expiring"
            goto L_0x039b
        L_0x00eb:
            java.lang.String r0 = "fb_ig_friend_request_pending"
            goto L_0x02f0
        L_0x00ef:
            java.lang.String r0 = "bestie_added"
            goto L_0x0200
        L_0x00f3:
            java.lang.String r0 = "fb_friend_connected"
            goto L_0x0200
        L_0x00f7:
            java.lang.String r0 = "video_call_ended"
            goto L_0x00fc
        L_0x00fa:
            java.lang.String r0 = "video_call_incoming"
        L_0x00fc:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0A
            return r3
        L_0x0105:
            r0 = 1928(0x788, float:2.702E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x010e
        L_0x010c:
            java.lang.String r0 = "story_views"
        L_0x010e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0b
            return r3
        L_0x0117:
            java.lang.String r0 = "contact_joined_email"
            goto L_0x0200
        L_0x011b:
            java.lang.String r0 = "contact_joined_phone"
            goto L_0x0200
        L_0x011f:
            java.lang.String r0 = "direct_v2_channel_direct_invites"
            goto L_0x038a
        L_0x0123:
            java.lang.String r0 = "follower_follow"
            goto L_0x039b
        L_0x0127:
            java.lang.String r0 = "follower_activity_with_location"
            goto L_0x039b
        L_0x012b:
            java.lang.String r0 = "comment_subscribed_on_like"
            goto L_0x02cc
        L_0x012f:
            java.lang.String r0 = "churn_reminders"
            goto L_0x039b
        L_0x0133:
            java.lang.String r0 = "hello_world"
            goto L_0x039b
        L_0x0137:
            r0 = 805(0x325, float:1.128E-42)
            goto L_0x02ad
        L_0x013b:
            r0 = 803(0x323, float:1.125E-42)
            goto L_0x02ad
        L_0x013f:
            r0 = 4719(0x126f, float:6.613E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x038a
        L_0x0147:
            java.lang.String r0 = "first_reel_post"
            goto L_0x02a2
        L_0x014b:
            java.lang.String r0 = "direct_v2_location"
            goto L_0x038a
        L_0x014f:
            java.lang.String r0 = "close_friend_story"
            goto L_0x039b
        L_0x0153:
            r0 = 785(0x311, float:1.1E-42)
            goto L_0x02ad
        L_0x0157:
            java.lang.String r0 = "contact_joined"
            goto L_0x0200
        L_0x015b:
            java.lang.String r0 = "direct_media_share_mention"
            goto L_0x038a
        L_0x015f:
            java.lang.String r0 = "popular_media_in_your_network"
            goto L_0x039b
        L_0x0163:
            java.lang.String r0 = "post_first_photo"
            goto L_0x02a2
        L_0x0167:
            r0 = 4055(0xfd7, float:5.682E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x02a2
        L_0x016f:
            java.lang.String r0 = "media_comment"
            goto L_0x02cc
        L_0x0173:
            r0 = 4717(0x126d, float:6.61E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x038a
        L_0x017b:
            r0 = 807(0x327, float:1.131E-42)
            goto L_0x02ad
        L_0x017f:
            java.lang.String r0 = "tag_follow_based_on_engagement"
            goto L_0x02f0
        L_0x0183:
            java.lang.String r0 = "introduction_follow"
            goto L_0x037f
        L_0x0187:
            java.lang.String r0 = "text_post_app_repost"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0n
            return r3
        L_0x0192:
            java.lang.String r0 = "follow_request_approved"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A03
            return r3
        L_0x019d:
            java.lang.String r0 = "text_post_app_private_follow_request"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0h
            return r3
        L_0x01a8:
            r0 = 231(0xe7, float:3.24E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            goto L_0x039b
        L_0x01b0:
            java.lang.String r0 = "resurrected_reel_post"
            goto L_0x02a2
        L_0x01b4:
            r0 = 1370(0x55a, float:1.92E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x039b
        L_0x01bc:
            r0 = 784(0x310, float:1.099E-42)
            goto L_0x02ad
        L_0x01c0:
            java.lang.String r0 = "first_post"
            goto L_0x02a2
        L_0x01c4:
            java.lang.String r0 = "user_tagged"
            goto L_0x02fb
        L_0x01c8:
            java.lang.String r0 = "text_post_app_accepted_user_follow_request"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0e
            return r3
        L_0x01d3:
            java.lang.String r0 = "live_with_broadcast"
            goto L_0x02e3
        L_0x01d7:
            java.lang.String r0 = "like_on_tag"
            goto L_0x01dc
        L_0x01da:
            java.lang.String r0 = "comment_on_tag"
        L_0x01dc:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0J
            return r3
        L_0x01e5:
            java.lang.String r0 = "like"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0I
            return r3
        L_0x01f0:
            java.lang.String r0 = "igtv_video_post_failure"
            goto L_0x01f5
        L_0x01f3:
            java.lang.String r0 = "igtv_video_post_success"
        L_0x01f5:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0H
            return r3
        L_0x01fe:
            java.lang.String r0 = "addressbook_contact_joined"
        L_0x0200:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0C
            return r3
        L_0x0209:
            java.lang.String r0 = "text_post_app_quote_post"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0i
            return r3
        L_0x0214:
            r0 = 1157(0x485, float:1.621E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x021d
        L_0x021b:
            java.lang.String r0 = "report_updated"
        L_0x021d:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0X
            return r3
        L_0x0226:
            java.lang.String r0 = "direct_raven_pending"
            goto L_0x022f
        L_0x0229:
            r0 = 1284(0x504, float:1.799E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x022f:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A09
            return r3
        L_0x0238:
            java.lang.String r0 = "user_followed"
            goto L_0x02f0
        L_0x023c:
            java.lang.String r0 = "branded_content_whitelisted"
            goto L_0x02fb
        L_0x0240:
            java.lang.String r0 = "live_with_broadcast_revoke"
            goto L_0x02e3
        L_0x0244:
            r0 = 1129(0x469, float:1.582E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x037f
        L_0x024c:
            java.lang.String r0 = "ig_encrypted_backups_one_time_code"
            goto L_0x0251
        L_0x024f:
            java.lang.String r0 = "roll_call"
        L_0x0251:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A04
            return r3
        L_0x025a:
            java.lang.String r0 = "direct_v2_shared_archived_post"
            goto L_0x038a
        L_0x025e:
            java.lang.String r0 = "promote_fb_connect"
            goto L_0x037f
        L_0x0262:
            java.lang.String r0 = "fb_ig_followee_on_fb_recently_followed"
            goto L_0x02f0
        L_0x0266:
            r0 = 804(0x324, float:1.127E-42)
            goto L_0x02ad
        L_0x0269:
            r0 = 806(0x326, float:1.13E-42)
            goto L_0x02ad
        L_0x026c:
            r0 = 4715(0x126b, float:6.607E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x038a
        L_0x0274:
            r0 = 4718(0x126e, float:6.611E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x038a
        L_0x027c:
            java.lang.String r0 = "direct_v2_profile"
            goto L_0x038a
        L_0x0280:
            java.lang.String r0 = "introduction_explore"
            goto L_0x037f
        L_0x0284:
            r0 = 802(0x322, float:1.124E-42)
            goto L_0x02ad
        L_0x0287:
            java.lang.String r0 = "activation_promote_fb_connect"
            goto L_0x039b
        L_0x028b:
            java.lang.String r0 = "remind_follow_requests"
            goto L_0x02f0
        L_0x028e:
            r0 = 1203(0x4b3, float:1.686E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A07
            return r3
        L_0x029d:
            r0 = 304(0x130, float:4.26E-43)
            goto L_0x02ad
        L_0x02a0:
            java.lang.String r0 = "fb_first_post"
        L_0x02a2:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0B
            return r3
        L_0x02ab:
            r0 = 801(0x321, float:1.122E-42)
        L_0x02ad:
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x038a
        L_0x02b3:
            java.lang.String r0 = "comment"
            goto L_0x02cc
        L_0x02b6:
            java.lang.String r0 = "set_fullname"
            goto L_0x039b
        L_0x02ba:
            java.lang.String r0 = "promote_story"
            goto L_0x037f
        L_0x02be:
            r0 = 273(0x111, float:3.83E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            goto L_0x039b
        L_0x02c6:
            java.lang.String r0 = "trending_story_sticker"
            goto L_0x039b
        L_0x02ca:
            java.lang.String r0 = "reply_to_comment_with_threading"
        L_0x02cc:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A05
            return r3
        L_0x02d5:
            java.lang.String r0 = "business_message_request_reminder"
            goto L_0x039b
        L_0x02d9:
            java.lang.String r0 = "direct_raven_mark_seen"
            goto L_0x038a
        L_0x02dd:
            java.lang.String r0 = "direct_v2_item_seen"
            goto L_0x038a
        L_0x02e1:
            java.lang.String r0 = "live_likes"
        L_0x02e3:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = r1.A01(r4, r5)
            return r3
        L_0x02ee:
            java.lang.String r0 = "tag_followed"
        L_0x02f0:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0M
            return r3
        L_0x02f9:
            java.lang.String r0 = "branded_content_untagged"
        L_0x02fb:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0O
            return r3
        L_0x0304:
            java.lang.String r0 = "welcome"
            goto L_0x039b
        L_0x0308:
            r0 = 743(0x2e7, float:1.041E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            goto L_0x039b
        L_0x0310:
            java.lang.String r0 = "direct_v2_sent_user_reaction"
            goto L_0x038a
        L_0x0313:
            java.lang.String r0 = "follower_activity_reminders"
            goto L_0x039b
        L_0x0317:
            java.lang.String r0 = "text_post_app_reply"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0468
            if (r5 == 0) goto L_0x0468
            X.2HA r3 = X.2HA.A0j     // Catch:{ Exception -> 0x046b }
            r2 = 0
            r0 = 1
            X.0qQ.A0B(r3, r0)     // Catch:{ Exception -> 0x046b }
            java.lang.Boolean r1 = X.2Gm.A00(r4, r3, r2)     // Catch:{ Exception -> 0x046b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x046b }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ Exception -> 0x046b }
            if (r0 != 0) goto L_0x0038
            X.0Tu r2 = X.0Tu.A05     // Catch:{ Exception -> 0x046b }
            r0 = 36328912153755307(0x8110f400003eab, double:3.03788855859791E-306)
            boolean r0 = X.182.A06(r2, r5, r0)     // Catch:{ Exception -> 0x046b }
            if (r0 == 0) goto L_0x034a
            X.9sV r0 = X.C391199sV.A05     // Catch:{ Exception -> 0x046b }
        L_0x0347:
            X.2HA r3 = r0.A00     // Catch:{ Exception -> 0x046b }
            return r3
        L_0x034a:
            r0 = 36328912153820844(0x8110f400013eac, double:3.0378885586393557E-306)
            boolean r0 = X.182.A06(r2, r5, r0)     // Catch:{ Exception -> 0x046b }
            if (r0 == 0) goto L_0x0358
            X.9sV r0 = X.C391199sV.A06     // Catch:{ Exception -> 0x046b }
            goto L_0x0347
        L_0x0358:
            r0 = 36328912153886381(0x8110f400023ead, double:3.0378885586808015E-306)
            boolean r0 = X.182.A06(r2, r5, r0)     // Catch:{ Exception -> 0x046b }
            if (r0 == 0) goto L_0x0366
            X.9sV r0 = X.C391199sV.A07     // Catch:{ Exception -> 0x046b }
            goto L_0x0347
        L_0x0366:
            X.9sV r0 = X.C391199sV.A04     // Catch:{ Exception -> 0x046b }
            goto L_0x0347
        L_0x0369:
            java.lang.String r0 = "text_post_app_user_followed"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0o
            return r3
        L_0x0374:
            java.lang.String r0 = "introduction"
            goto L_0x037f
        L_0x0377:
            java.lang.String r0 = "direct_v2_highlights_reaction"
            goto L_0x038a
        L_0x037a:
            java.lang.String r0 = "page_likes"
            goto L_0x039b
        L_0x037d:
            java.lang.String r0 = "product_announcement"
        L_0x037f:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0R
            return r3
        L_0x0388:
            java.lang.String r0 = "direct_v2_hashtag"
        L_0x038a:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A08
            return r3
        L_0x0393:
            java.lang.String r0 = "churned_find_friends"
            goto L_0x039b
        L_0x0396:
            java.lang.String r0 = "set_bio"
            goto L_0x039b
        L_0x0399:
            java.lang.String r0 = "unseen_notification_reminders"
        L_0x039b:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0461
            goto L_0x0036
        L_0x03a3:
            java.lang.String r0 = "text_post_app_mention"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.2HA r3 = X.2HA.A0g
            return r3
        L_0x03ae:
            java.lang.String r0 = "connect_lowlness"
            goto L_0x03b6
        L_0x03b1:
            java.lang.String r0 = "suggested_close_friend"
            goto L_0x03b6
        L_0x03b4:
            java.lang.String r0 = "ig_notes_reaction"
        L_0x03b6:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0454
            goto L_0x002f
        L_0x03be:
            java.lang.String r0 = "trending_location"
            goto L_0x03ed
        L_0x03c1:
            java.lang.String r0 = "unseen_direct_message_reminder"
            goto L_0x03ed
        L_0x03c4:
            java.lang.String r0 = "trending_prompts_unconnected"
            goto L_0x03ed
        L_0x03c7:
            r0 = 4161(0x1041, float:5.831E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x03ed
        L_0x03ce:
            java.lang.String r0 = "clips_recently_followed_authors"
            goto L_0x03ed
        L_0x03d1:
            java.lang.String r0 = "ig_notes_awareness"
            goto L_0x03ed
        L_0x03d4:
            java.lang.String r0 = "clips_recently_engaged_authors"
            goto L_0x03ed
        L_0x03d7:
            java.lang.String r0 = "story_sticker_question"
            goto L_0x03ed
        L_0x03da:
            r0 = 2756(0xac4, float:3.862E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x03ed
        L_0x03e1:
            java.lang.String r0 = "story_sticker_poll"
            goto L_0x03ed
        L_0x03e4:
            r0 = 297(0x129, float:4.16E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x03ed
        L_0x03eb:
            java.lang.String r0 = "instaversary"
        L_0x03ed:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0401
            goto L_0x002c
        L_0x03f5:
            r0 = 2827(0xb0b, float:3.961E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002f
        L_0x0401:
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323337286265949(0x810be200012c5d, double:3.03436298994945E-306)
            goto L_0x045b
        L_0x0409:
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323337286200412(0x810be200002c5c, double:3.0343629899080044E-306)
            goto L_0x045b
        L_0x0411:
            java.lang.String r0 = "threads_app_daily_digest"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            goto L_0x0461
        L_0x041a:
            java.lang.String r0 = "text_post_app_hello_world"
            goto L_0x0444
        L_0x041d:
            java.lang.String r0 = "text_post_app_location_digest"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329105427283762(0x81112100003f32, double:3.038010785555555E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0036
            goto L_0x0461
        L_0x0433:
            java.lang.String r0 = "text_post_app_people_you_may_follow"
            goto L_0x0444
        L_0x0436:
            java.lang.String r0 = "threads_app_churn_reminders"
            goto L_0x0444
        L_0x0439:
            java.lang.String r0 = "text_post_app_strong_starts"
            goto L_0x0444
        L_0x043c:
            java.lang.String r0 = "text_post_app_unconnected_daily_digest"
            goto L_0x0444
        L_0x043f:
            java.lang.String r0 = "text_post_app_resurrected_user_post"
            goto L_0x0444
        L_0x0442:
            java.lang.String r0 = "text_post_app_private_follow_request_reminder"
        L_0x0444:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0461
            goto L_0x0015
        L_0x044c:
            java.lang.String r0 = "contact_friend"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002f
        L_0x0454:
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323337286331486(0x810be200022c5e, double:3.034362989990896E-306)
        L_0x045b:
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x002f
        L_0x0461:
            X.2HA r3 = X.2HA.A0S
            return r3
        L_0x0464:
            if (r5 != 0) goto L_0x0015
            goto L_0x002f
        L_0x0468:
            X.2HA r3 = X.2HA.A0j     // Catch:{ Exception -> 0x046b }
            return r3
        L_0x046b:
            X.2HA r3 = X.2HA.A0j
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3726691w.A02(android.content.Context, X.0lg, java.lang.String):X.2HA");
    }

    public static final 2HA A03(Context context, UserSession userSession, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1660159711:
                    if (str.equals("tagged_in_bio")) {
                        return 2HA.A0L;
                    }
                    break;
                case -1618365534:
                    if (str.equals("video_call")) {
                        return 2HA.A0A;
                    }
                    break;
                case -1534353675:
                    if (str.equals("view_count")) {
                        return 2HA.A0b;
                    }
                    break;
                case -1461524499:
                    if (str.equals("notification_reminders")) {
                        return 2HA.A0S;
                    }
                    break;
                case -1372693202:
                    if (str.equals("live_broadcast")) {
                        return A01.A01(context, userSession);
                    }
                    break;
                case -1307214883:
                    if (str.equals(AnonymousClass000.A00(1613))) {
                        return 2HA.A0M;
                    }
                    break;
                case -1112862244:
                    if (str.equals("comment_likes")) {
                        return 2HA.A07;
                    }
                    break;
                case -602415628:
                    if (str.equals("comments")) {
                        return 2HA.A05;
                    }
                    break;
                case -562217912:
                    if (str.equals("contact_joined")) {
                        return 2HA.A0C;
                    }
                    break;
                case -160912177:
                    if (str.equals("first_post")) {
                        return 2HA.A0B;
                    }
                    break;
                case -139282336:
                    if (str.equals("user_tagged")) {
                        return 2HA.A0O;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        return 2HA.A0I;
                    }
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        return 2HA.A0N;
                    }
                    break;
                case 295987376:
                    if (str.equals("report_updated")) {
                        return 2HA.A0X;
                    }
                    break;
                case 536242609:
                    if (str.equals(AnonymousClass000.A00(1672))) {
                        return 2HA.A09;
                    }
                    break;
                case 565271564:
                    if (str.equals("announcements")) {
                        return 2HA.A0R;
                    }
                    break;
                case 639774245:
                    if (str.equals(AnonymousClass000.A00(3141))) {
                        return 2HA.A03;
                    }
                    break;
                case 718888547:
                    if (str.equals("like_and_comment_on_photo_user_tagged")) {
                        return 2HA.A0J;
                    }
                    break;
                case 1134925464:
                    if (str.equals("felix_upload_result")) {
                        return 2HA.A0H;
                    }
                    break;
                case 1752343173:
                    if (str.equals(AnonymousClass000.A00(1281))) {
                        return 2HA.A08;
                    }
                    break;
            }
        }
        return 2HA.A0c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if ((r6 instanceof com.instagram.common.session.UserSession) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0163, code lost:
        if (r3.isSampled() != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018a, code lost:
        if (r1 != false) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.app.NotificationManager r19, android.content.Context r20, X.0lg r21) {
        /*
            r18 = this;
            java.lang.String r1 = "Unable to get notification channels"
            java.util.List r13 = r19.getNotificationChannels()     // Catch:{ Exception -> 0x01e0 }
            if (r13 == 0) goto L_0x01e5
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x01e5
            java.lang.String r1 = "NotificationChannelsHelper"
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            X.91y r2 = new X.91y
            r2.<init>(r0)
            X.91z r7 = X.C3726991z.A01
            r0 = r20
            if (r7 != 0) goto L_0x0027
            X.91z r7 = new X.91z
            r7.<init>(r0)
            X.C3726991z.A01 = r7
        L_0x0027:
            boolean r9 = X.AnonymousClass0oH.A01(r0)
            X.0xa r8 = r7.A00
            java.lang.String r1 = "NOTIFICATIONS_ARE_ENABLED"
            r0 = 1
            boolean r10 = r8.getBoolean(r1, r0)
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "LAST_FULL_LOGGING_TS_FOR_"
            r6 = r21
            java.lang.String r0 = r6.getToken()
            java.lang.String r3 = X.002.A0R(r5, r0)
            r0 = 0
            long r0 = r8.getLong(r3, r0)
            long r11 = r11 - r0
            long r3 = X.C3726991z.A02
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0057
            boolean r0 = r6 instanceof com.instagram.common.session.UserSession
            r17 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0057:
            r17 = 0
        L_0x0059:
            if (r9 != r10) goto L_0x005d
            if (r17 == 0) goto L_0x0068
        L_0x005d:
            if (r9 == 0) goto L_0x01a9
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0061:
            r0 = 0
            r2.A00(r6, r1, r0)
            r7.A01(r9)
        L_0x0068:
            java.util.Iterator r16 = r13.iterator()
        L_0x006c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r4 = r16.next()
            android.app.NotificationChannel r4 = (android.app.NotificationChannel) r4
            X.0qQ.A0A(r4)
            java.lang.String r14 = r4.getId()
            if (r14 != 0) goto L_0x0083
            java.lang.String r14 = ""
        L_0x0083:
            r3 = 0
            java.lang.String r0 = "_IS_ENABLED"
            java.lang.String r0 = X.002.A0R(r14, r0)
            boolean r9 = r8.getBoolean(r0, r3)
            r1 = 0
            int r0 = r4.getImportance()
            if (r0 == 0) goto L_0x0096
            r1 = 1
        L_0x0096:
            if (r17 != 0) goto L_0x0190
            if (r9 != r1) goto L_0x0190
            java.lang.String r0 = "_IMPORTANCE"
            java.lang.String r1 = X.002.A0R(r14, r0)
            r0 = 3
            int r1 = r8.getInt(r1, r0)
            java.lang.String r0 = "_SHOULD_SHOW_LIGHT"
            java.lang.String r0 = X.002.A0R(r14, r0)
            boolean r13 = r8.getBoolean(r0, r3)
            java.lang.String r0 = "_SHOULD_VIBRATE"
            java.lang.String r0 = X.002.A0R(r14, r0)
            boolean r9 = r8.getBoolean(r0, r3)
            java.lang.String r0 = "_LOCKSCREEN_VISIBILITY"
            java.lang.String r0 = X.002.A0R(r14, r0)
            r10 = 1
            int r12 = r8.getInt(r0, r10)
            java.lang.String r0 = "_SOUND"
            java.lang.String r3 = X.002.A0R(r14, r0)
            r0 = 0
            java.lang.String r11 = r8.getString(r3, r0)
            X.91y r0 = A00
            X.0iw r0 = r0.A00
            X.0wc r15 = X.AnonymousClass0kN.A01(r0, r6)
            java.lang.String r3 = "notification_channel_settings_changed"
            X.0kJ r0 = r15.A00
            X.0Aj r3 = r15.A00(r0, r3)
            java.lang.String r0 = "channel_id"
            r3.AAJ(r0, r14)
            int r0 = r4.getImportance()
            if (r1 == r0) goto L_0x018d
            int r14 = r4.getImportance()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "old_importance"
            r3.A8k(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.String r0 = "new_importance"
            r3.A8k(r0, r1)
            r1 = 1
        L_0x0101:
            boolean r0 = r4.shouldShowLights()
            if (r13 == r0) goto L_0x0115
            boolean r0 = r4.shouldShowLights()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "should_show_light"
            r3.A7p(r0, r1)
            r1 = 1
        L_0x0115:
            boolean r0 = r4.shouldVibrate()
            if (r9 == r0) goto L_0x0129
            boolean r0 = r4.shouldVibrate()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "should_vibrate"
            r3.A7p(r0, r1)
            r1 = 1
        L_0x0129:
            int r0 = r4.getLockscreenVisibility()
            if (r12 == r0) goto L_0x0146
            int r9 = r4.getLockscreenVisibility()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "old_lockscreen_visibility"
            r3.A8k(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "new_lockscreen_visibility"
            r3.A8k(r0, r1)
            r1 = 1
        L_0x0146:
            android.net.Uri r0 = r4.getSound()
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 != 0) goto L_0x018a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "sound_changed"
            r3.A7p(r0, r1)
        L_0x015f:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0168
        L_0x0165:
            r3.Cgf()
        L_0x0168:
            r0 = 36316237707546775(0x81056d00231097, double:3.029873187779736E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r0 = X.0yU.A07(r0)
            if (r0 == 0) goto L_0x0185
            X.0nO r1 = X.0nY.A00()
            X.9kx r0 = new X.9kx
            r0.<init>(r4, r7)
            r1.ATE(r0)
            goto L_0x006c
        L_0x0185:
            X.C3726991z.A00(r4, r7)
            goto L_0x006c
        L_0x018a:
            if (r1 == 0) goto L_0x0168
            goto L_0x015f
        L_0x018d:
            r1 = 0
            goto L_0x0101
        L_0x0190:
            X.0iw r0 = r2.A00
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r6)
            if (r1 == 0) goto L_0x01a6
            java.lang.String r1 = "notification_channel_enabled"
        L_0x019a:
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            java.lang.String r0 = "channel_id"
            r3.AAJ(r0, r14)
            goto L_0x0165
        L_0x01a6:
            java.lang.String r1 = "notification_channel_disabled"
            goto L_0x019a
        L_0x01a9:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0061
        L_0x01ad:
            if (r17 == 0) goto L_0x01cc
            long r2 = java.lang.System.currentTimeMillis()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316237707546775(0x81056d00231097, double:3.029873187779736E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x01cd
            X.0nO r1 = X.0nY.A00()
            X.9lD r0 = new X.9lD
            r0.<init>(r7, r6, r2)
            r1.ATE(r0)
        L_0x01cc:
            return
        L_0x01cd:
            X.0xY r1 = r8.AR4()
            java.lang.String r0 = r6.getToken()
            java.lang.String r0 = X.002.A0R(r5, r0)
            r1.E5c(r0, r2)
            r1.apply()
            return
        L_0x01e0:
            java.lang.String r0 = "NotificationChannelsHelper"
            X.0wb.A03(r0, r1)
        L_0x01e5:
            java.lang.String r0 = "NotificationChannelsHelper"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3726691w.A04(android.app.NotificationManager, android.content.Context, X.0lg):void");
    }

    public static final void A06(NotificationManager notificationManager, Context context, boolean z) {
        2HA r0;
        2HA r4;
        if (z) {
            r0 = 2HA.A0K;
        } else {
            r0 = 2HA.A0D;
        }
        NotificationManager notificationManager2 = notificationManager;
        2Gm.A02(notificationManager, r0);
        if (z) {
            r4 = 2HA.A0D;
        } else {
            r4 = 2HA.A0K;
        }
        String string = context.getResources().getString(2131968649);
        int i = 3;
        if (z) {
            i = 4;
        }
        2Gm.A01(notificationManager2, (Uri) null, r4, "IG", string, i, 0, 1, false, true);
    }

    public static final void A07(Context context) {
        Intent intent = new Intent(AnonymousClass000.A00(2605));
        intent.putExtra(AnonymousClass000.A00(1090), context.getPackageName());
        AnonymousClass0b5.A03(context, intent);
    }

    public static final void A08(Context context, 2HA r4) {
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra(AnonymousClass000.A00(1090), context.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", r4);
        AnonymousClass0b5.A03(context, intent);
    }
}
