package X;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.Mqx  reason: case insensitive filesystem */
public final class C67625Mqx {
    public static final C67625Mqx A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        if (r7.A07 != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r0 = 2131963747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        r0 = 2131963560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        if (r1 != 1) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C7325Q4b A01(android.content.Context r6, X.OI4 r7) {
        /*
            r5 = this;
            r4 = 1
            X.0qQ.A0B(r7, r4)
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x00de
            java.lang.Integer r1 = r7.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00de
            java.lang.String r0 = "ig_posting_status"
            X.9T8 r3 = new X.9T8
            r3.<init>((android.content.Context) r6, (java.lang.String) r0)
            boolean r0 = X.0oI.A0C(r6)
            r1 = 2131231056(0x7f080150, float:1.8078182E38)
            if (r0 == 0) goto L_0x0021
            r1 = 2131239376(0x7f0821d0, float:1.8095057E38)
        L_0x0021:
            r0 = 2130969230(0x7f04028e, float:1.7547136E38)
            int r0 = X.2Yu.A0H(r6, r0)
            if (r0 == 0) goto L_0x002b
            r1 = r0
        L_0x002b:
            r3.A04(r1)
            boolean r0 = X.0oI.A0C(r6)
            if (r0 == 0) goto L_0x00c2
            com.instagram.pendingmedia.model.constants.ShareType r1 = r7.A04
            if (r1 == 0) goto L_0x0041
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00ae;
                case 9: goto L_0x00ba;
                case 16: goto L_0x00b2;
                default: goto L_0x0041;
            }
        L_0x0041:
            r0 = 2131963744(0x7f132f60, float:1.956425E38)
        L_0x0044:
            java.lang.String r0 = X.C51967G9n.A0p(r6, r0)
            r3.A0C(r0)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L_0x00a5
            int r2 = r0.intValue()
            r1 = 100
            r0 = 0
            r3.A07 = r1
            r3.A06 = r2
            r3.A0h = r0
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r1.append(r2)
            r0 = 37
            java.lang.String r0 = X.C51967G9n.A0r(r1, r0)
            r3.A0B(r0)
        L_0x0070:
            boolean r0 = X.0oI.A0C(r6)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "IG"
        L_0x0078:
            r3.A0V = r0
            android.app.PendingIntent r0 = A00(r6)
            r3.A0C = r0
            android.graphics.Bitmap r0 = r7.A02
            r3.A07(r0)
            r3.A02 = r4
            r0 = 2
            X.AnonymousClass9T8.A01(r3, r0, r4)
        L_0x008b:
            android.app.Notification r3 = r3.A03()
            X.0qQ.A07(r3)
            int r0 = r7.A00
            int r2 = r0 + 20023
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x011c
            X.Q4b r1 = new X.Q4b
            r1.<init>(r2, r3, r4)
            return r1
        L_0x00a2:
            java.lang.String r0 = "ThreadsChannelKey"
            goto L_0x0078
        L_0x00a5:
            r0 = 100
            r3.A07 = r0
            r3.A06 = r0
            r3.A0h = r4
            goto L_0x0070
        L_0x00ae:
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x00b6
        L_0x00b2:
            r0 = 2131963747(0x7f132f63, float:1.9564256E38)
            goto L_0x0044
        L_0x00b6:
            r0 = 2131963560(0x7f132ea8, float:1.9563877E38)
            goto L_0x0044
        L_0x00ba:
            r0 = 2131963746(0x7f132f62, float:1.9564254E38)
            goto L_0x0044
        L_0x00be:
            r0 = 2131963745(0x7f132f61, float:1.9564252E38)
            goto L_0x0044
        L_0x00c2:
            java.lang.Integer r1 = r7.A05
            if (r1 == 0) goto L_0x00d4
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r1 = r1.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00d9
            r0 = 2131975348(0x7f135cb4, float:1.9587786E38)
            if (r1 == r4) goto L_0x0044
        L_0x00d4:
            r0 = 2131975347(0x7f135cb3, float:1.9587784E38)
            goto L_0x0044
        L_0x00d9:
            r0 = 2131975349(0x7f135cb5, float:1.9587788E38)
            goto L_0x0044
        L_0x00de:
            boolean r2 = r7.A08
            java.lang.String r0 = "ig_posting_status"
            X.9T8 r3 = new X.9T8
            r3.<init>((android.content.Context) r6, (java.lang.String) r0)
            r1 = 2131951777(0x7f1300a1, float:1.9539978E38)
            java.lang.String r0 = r6.getString(r1)
            r3.A0C(r0)
            java.lang.String r0 = r6.getString(r1)
            r3.A0D(r0)
            boolean r0 = X.0oI.A0C(r6)
            r1 = 2131231056(0x7f080150, float:1.8078182E38)
            if (r0 == 0) goto L_0x0104
            r1 = 2131239376(0x7f0821d0, float:1.8095057E38)
        L_0x0104:
            r0 = 2130969230(0x7f04028e, float:1.7547136E38)
            int r0 = X.2Yu.A0H(r6, r0)
            if (r0 == 0) goto L_0x010e
            r1 = r0
        L_0x010e:
            r3.A04(r1)
            if (r2 == 0) goto L_0x008b
            r0 = 0
            r3.A07 = r0
            r3.A06 = r0
            r3.A0h = r4
            goto L_0x008b
        L_0x011c:
            r0 = 0
            X.Q4b r1 = new X.Q4b
            r1.<init>(r2, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67625Mqx.A01(android.content.Context, X.OI4):X.Q4b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        if (r12.A07 != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        r1 = 2131963743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        r1 = 2131963557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        if (r0 != 1) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0173, code lost:
        if (r12.A07 != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        r0 = 2131963558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0180, code lost:
        if (r12.A07 != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0182, code lost:
        r1 = 2131963739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        r1 = 2131963559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a1, code lost:
        if (r0 != 1) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r10, com.instagram.common.session.UserSession r11, X.OI4 r12, boolean r13) {
        /*
            r9 = this;
            r5 = 0
            X.0qQ.A0B(r10, r5)
            r6 = 1
            boolean r0 = X.0oI.A09(r10)
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r1 = r12.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0016
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A04
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 == r0) goto L_0x0028
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r1 == r0) goto L_0x0028
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 != r0) goto L_0x0071
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x0071
        L_0x0028:
            X.1iA r1 = r12.A03
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0015
            if (r11 == 0) goto L_0x0015
            X.1Am r2 = X.1Al.A01(r11)
            X.1An r1 = X.1An.A3V
            java.lang.Class<X.O1X> r0 = X.O1X.class
            X.0xa r7 = r2.A04(r1, r0)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r2)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r8 = r1.format(r0)
            java.lang.String r2 = "lastUsedDate"
            java.lang.String r0 = ""
            java.lang.String r0 = r7.getString(r2, r0)
            java.lang.String r4 = "usageCount"
            int r3 = r7.getInt(r4, r5)
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 != 0) goto L_0x01ad
            X.0xY r1 = r7.AR4()
            r1.E5g(r2, r8)
            r1.E5Z(r4, r6)
        L_0x006e:
            r1.apply()
        L_0x0071:
            java.lang.Object r4 = X.C66582MXn.A0p(r10)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            java.lang.String r0 = "ig_posting_status"
            X.9T8 r3 = new X.9T8
            r3.<init>((android.content.Context) r10, (java.lang.String) r0)
            boolean r0 = X.0oI.A0C(r10)
            r1 = 2131231056(0x7f080150, float:1.8078182E38)
            if (r0 == 0) goto L_0x008a
            r1 = 2131239376(0x7f0821d0, float:1.8095057E38)
        L_0x008a:
            r0 = 2130969230(0x7f04028e, float:1.7547136E38)
            int r0 = X.2Yu.A0H(r10, r0)
            if (r0 == 0) goto L_0x0094
            r1 = r0
        L_0x0094:
            r3.A04(r1)
            boolean r0 = X.0oI.A0C(r10)
            if (r13 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x00f6
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A04
            if (r1 == 0) goto L_0x00ac
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00e2;
                case 9: goto L_0x00ee;
                case 16: goto L_0x00e6;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r1 = 2131963740(0x7f132f5c, float:1.9564242E38)
        L_0x00af:
            java.lang.String r0 = r10.getString(r1)
            r3.A0C(r0)
            r3.A0E(r6)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.A09 = r0
        L_0x00bd:
            boolean r0 = X.0oI.A0C(r10)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "IG"
        L_0x00c5:
            r3.A0V = r0
            android.app.PendingIntent r0 = A00(r10)
            r3.A0C = r0
            android.graphics.Bitmap r0 = r12.A02
            r3.A07(r0)
            android.app.Notification r1 = r3.A03()
            X.0qQ.A07(r1)
            int r0 = r12.A00
            r4.notify(r0, r1)
            return
        L_0x00df:
            java.lang.String r0 = "ThreadsChannelKey"
            goto L_0x00c5
        L_0x00e2:
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x00ea
        L_0x00e6:
            r1 = 2131963743(0x7f132f5f, float:1.9564248E38)
            goto L_0x00af
        L_0x00ea:
            r1 = 2131963557(0x7f132ea5, float:1.956387E38)
            goto L_0x00af
        L_0x00ee:
            r1 = 2131963742(0x7f132f5e, float:1.9564246E38)
            goto L_0x00af
        L_0x00f2:
            r1 = 2131963741(0x7f132f5d, float:1.9564244E38)
            goto L_0x00af
        L_0x00f6:
            java.lang.Integer r1 = r12.A05
            if (r1 == 0) goto L_0x0107
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r0 = r1.intValue()
            if (r0 == r5) goto L_0x010b
            r1 = 2131975345(0x7f135cb1, float:1.958778E38)
            if (r0 == r6) goto L_0x00af
        L_0x0107:
            r1 = 2131975344(0x7f135cb0, float:1.9587778E38)
            goto L_0x00af
        L_0x010b:
            r1 = 2131975346(0x7f135cb2, float:1.9587782E38)
            goto L_0x00af
        L_0x010f:
            if (r0 == 0) goto L_0x0192
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A04
            if (r1 == 0) goto L_0x011e
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x018e;
                case 1: goto L_0x0186;
                case 2: goto L_0x0182;
                case 3: goto L_0x0186;
                case 4: goto L_0x017e;
                case 9: goto L_0x018a;
                case 16: goto L_0x0182;
                default: goto L_0x011e;
            }
        L_0x011e:
            r1 = 2131963736(0x7f132f58, float:1.9564234E38)
        L_0x0121:
            java.lang.String r0 = r10.getString(r1)
            r3.A0C(r0)
            boolean r0 = X.0oI.A0C(r10)
            if (r0 == 0) goto L_0x017a
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A04
            if (r1 == 0) goto L_0x013b
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r0 = r1.ordinal()
            switch(r0) {
                case 1: goto L_0x0176;
                case 2: goto L_0x013b;
                case 3: goto L_0x0176;
                case 4: goto L_0x0171;
                default: goto L_0x013b;
            }
        L_0x013b:
            r0 = 2131963735(0x7f132f57, float:1.9564232E38)
        L_0x013e:
            java.lang.String r0 = r10.getString(r0)
            r3.A0B(r0)
            r3.A0E(r5)
            android.content.Intent r2 = r12.A01
            if (r2 == 0) goto L_0x00bd
            int r1 = r12.A00
            java.lang.String r0 = "NOTIFICATION_ID"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            if (r0 == 0) goto L_0x00bd
            X.0Sy r2 = X.C66582MXn.A0K(r10, r0)
            int r1 = r12.A00
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.app.PendingIntent r2 = r2.A02(r10, r1, r0)
            r1 = 2131237913(0x7f081c19, float:1.809209E38)
            r0 = 2131972373(0x7f135115, float:1.9581752E38)
            java.lang.String r0 = r10.getString(r0)
            r3.A06(r2, r0, r1)
            goto L_0x00bd
        L_0x0171:
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0176
            goto L_0x013b
        L_0x0176:
            r0 = 2131963558(0x7f132ea6, float:1.9563873E38)
            goto L_0x013e
        L_0x017a:
            r0 = 2131975352(0x7f135cb8, float:1.9587794E38)
            goto L_0x013e
        L_0x017e:
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0186
        L_0x0182:
            r1 = 2131963739(0x7f132f5b, float:1.956424E38)
            goto L_0x0121
        L_0x0186:
            r1 = 2131963559(0x7f132ea7, float:1.9563875E38)
            goto L_0x0121
        L_0x018a:
            r1 = 2131963738(0x7f132f5a, float:1.9564238E38)
            goto L_0x0121
        L_0x018e:
            r1 = 2131963737(0x7f132f59, float:1.9564236E38)
            goto L_0x0121
        L_0x0192:
            java.lang.Integer r1 = r12.A05
            if (r1 == 0) goto L_0x01a3
            X.KwB r0 = X.C63390KwB.$redex_init_class
            int r0 = r1.intValue()
            if (r0 == r5) goto L_0x01a8
            r1 = 2131975342(0x7f135cae, float:1.9587774E38)
            if (r0 == r6) goto L_0x0121
        L_0x01a3:
            r1 = 2131975341(0x7f135cad, float:1.9587772E38)
            goto L_0x0121
        L_0x01a8:
            r1 = 2131975343(0x7f135caf, float:1.9587776E38)
            goto L_0x0121
        L_0x01ad:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36602351247626871(0x8209a5000f1277, double:3.210812542613141E-306)
            int r0 = X.DbS.A04(r2, r11, r0)
            if (r3 >= r0) goto L_0x0015
            X.0xY r1 = r7.AR4()
            int r0 = r3 + 1
            r1.E5Z(r4, r0)
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67625Mqx.A02(android.content.Context, com.instagram.common.session.UserSession, X.OI4, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Mqx, java.lang.Object] */
    static {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        NotificationManager notificationManager = (NotificationManager) C66582MXn.A0p(context);
        if (0oI.A0C(context)) {
            C3726691w.A05(notificationManager, context, true);
            return;
        }
        0qQ.A0B(notificationManager, 1);
        2Gm.A01(notificationManager, (Uri) null, 2HA.A0P, (String) null, context.getResources().getString(2131968654), 2, 0, 1, false, false);
    }

    public static final PendingIntent A00(Context context) {
        Intent A09;
        0Sy r4 = new 0Sy();
        if (0oI.A0C(C60960kU.A00)) {
            AnonymousClass14B A002 = AnonymousClass14B.A03.A00();
            Context context2 = C60960kU.A00;
            0qQ.A07(context2);
            A09 = A002.A03(context2, 67108864);
        } else {
            A09 = DbS.A09();
            C66581MXm.A17(A09, C60960kU.A00.getPackageName(), "com.instagram.barcelona.mainactivity.BarcelonaActivity");
            A09.setFlags(67108864);
        }
        r4.A0A(A09);
        return r4.A01(context, 64278, 134217728);
    }
}
