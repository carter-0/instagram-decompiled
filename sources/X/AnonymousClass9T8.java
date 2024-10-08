package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: X.9T8  reason: invalid class name */
public class AnonymousClass9T8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public Notification A0A;
    public Notification A0B;
    public PendingIntent A0C;
    public PendingIntent A0D;
    public Context A0E;
    public Bundle A0F;
    public RemoteViews A0G;
    public RemoteViews A0H;
    public RemoteViews A0I;
    public C370428wR A0J;
    public AA2 A0K;
    public SJT A0L;
    public IconCompat A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public Object A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public ArrayList A0Y;
    public ArrayList A0Z;
    @Deprecated
    public ArrayList A0a;
    public ArrayList A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x027a, code lost:
        if (r1.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle") == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02c0, code lost:
        if (r2.equals(android.app.Notification.DecoratedCustomViewStyle.class.getName()) != false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02c2, code lost:
        r1 = new X.AA2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02ce, code lost:
        if (r1.equals("androidx.core.app.NotificationCompat$BigPictureStyle") == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02ee, code lost:
        if (r1.equals("androidx.core.app.NotificationCompat$InboxStyle") == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02ff, code lost:
        if (r1.equals("androidx.core.app.NotificationCompat$BigTextStyle") == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0310, code lost:
        if (r1.equals("androidx.core.app.NotificationCompat$MessagingStyle") == false) goto L_0x0219;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03ff A[LOOP:3: B:122:0x03ff->B:128:0x0410, LOOP_START, PHI: r3 
      PHI: (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:121:0x03fd, B:128:0x0410] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x042d A[LOOP:4: B:134:0x0427->B:136:0x042d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x031b A[SYNTHETIC, Splitter:B:81:0x031b] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0340  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9T8(android.app.Notification r26, android.content.Context r27) {
        /*
            r25 = this;
            r5 = r26
            java.lang.String r0 = r5.getChannelId()
            r6 = r25
            r1 = r27
            r6.<init>((android.content.Context) r1, (java.lang.String) r0)
            android.os.Bundle r4 = r5.extras
            if (r4 != 0) goto L_0x020a
            r1 = 0
        L_0x0012:
            android.os.Bundle r2 = r5.extras
            r0 = 663(0x297, float:9.29E-43)
            java.lang.String r12 = X.C66579MXk.A00(r0)
            java.lang.CharSequence r0 = r2.getCharSequence(r12)
            r6.A0C(r0)
            android.os.Bundle r0 = r5.extras
            java.lang.String r11 = "android.text"
            java.lang.CharSequence r0 = r0.getCharSequence(r11)
            r6.A0B(r0)
            android.os.Bundle r0 = r5.extras
            java.lang.String r10 = "android.infoText"
            java.lang.CharSequence r0 = r0.getCharSequence(r10)
            java.lang.CharSequence r0 = A00(r0)
            r6.A0N = r0
            android.os.Bundle r0 = r5.extras
            java.lang.String r9 = "android.subText"
            java.lang.CharSequence r0 = r0.getCharSequence(r9)
            java.lang.CharSequence r0 = A00(r0)
            r6.A0R = r0
            java.lang.CharSequence r0 = r5.getSettingsText()
            java.lang.CharSequence r0 = A00(r0)
            r6.A0Q = r0
            r6.A0A(r1)
            java.lang.String r0 = r5.getGroup()
            r6.A0V = r0
            int r0 = r5.flags
            r0 = r0 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r6.A0f = r0
            X.SJT r0 = X.AE8.A01(r5)
            r6.A0L = r0
            long r2 = r5.when
            android.app.Notification r0 = r6.A0A
            r0.when = r2
            android.os.Bundle r0 = r5.extras
            java.lang.String r8 = "android.showWhen"
            boolean r0 = r0.getBoolean(r8)
            r6.A0i = r0
            android.os.Bundle r2 = r5.extras
            java.lang.String r0 = "android.showChronometer"
            boolean r0 = r2.getBoolean(r0)
            r6.A0k = r0
            int r0 = r5.flags
            r0 = r0 & 16
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r6.A0E(r0)
            int r0 = r5.flags
            r0 = r0 & 8
            boolean r2 = X.AnonymousClass7TF.A1P(r0)
            r0 = 8
            A01(r6, r0, r2)
            int r0 = r5.flags
            r0 = r0 & 2
            boolean r2 = X.AnonymousClass7TF.A1P(r0)
            r0 = 2
            A01(r6, r0, r2)
            int r0 = r5.flags
            r0 = r0 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r6.A0g = r0
            android.graphics.Bitmap r0 = r5.largeIcon
            r6.A07(r0)
            int r0 = r5.getBadgeIconType()
            r6.A00 = r0
            java.lang.String r0 = r5.category
            r6.A0T = r0
            X.8wR r0 = X.AE8.A00(r5)
            r6.A0J = r0
            int r0 = r5.number
            r6.A04 = r0
            java.lang.CharSequence r0 = r5.tickerText
            r6.A0D(r0)
            android.app.PendingIntent r0 = r5.contentIntent
            r6.A0C = r0
            android.app.PendingIntent r2 = r5.deleteIntent
            android.app.Notification r0 = r6.A0A
            r0.deleteIntent = r2
            android.app.PendingIntent r3 = r5.fullScreenIntent
            int r0 = r5.flags
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r2 = X.AnonymousClass7TF.A1P(r0)
            r6.A0D = r3
            r0 = 128(0x80, float:1.794E-43)
            A01(r6, r0, r2)
            android.net.Uri r2 = r5.sound
            int r0 = r5.audioStreamType
            r6.A09(r2, r0)
            long[] r0 = r5.vibrate
            android.app.Notification r3 = r6.A0A
            r3.vibrate = r0
            int r7 = r5.ledARGB
            int r2 = r5.ledOnMS
            int r0 = r5.ledOffMS
            r6.A05(r7, r2, r0)
            int r0 = r5.defaults
            r3.defaults = r0
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0110
            int r0 = r3.flags
            r0 = r0 | 1
            r3.flags = r0
        L_0x0110:
            int r0 = r5.priority
            r6.A05 = r0
            int r0 = r5.color
            r6.A01 = r0
            int r0 = r5.visibility
            r6.A08 = r0
            android.app.Notification r0 = r5.publicVersion
            r6.A0B = r0
            java.lang.String r0 = r5.getSortKey()
            r6.A0X = r0
            long r2 = r5.getTimeoutAfter()
            r6.A09 = r2
            java.lang.String r0 = r5.getShortcutId()
            r6.A0W = r0
            java.lang.String r13 = "android.progressMax"
            int r14 = r4.getInt(r13)
            java.lang.String r3 = "android.progress"
            int r7 = r4.getInt(r3)
            java.lang.String r2 = "android.progressIndeterminate"
            boolean r0 = r4.getBoolean(r2)
            r6.A07 = r14
            r6.A06 = r7
            r6.A0h = r0
            boolean r0 = X.AE8.A02(r5)
            r6.A0c = r0
            int r14 = r5.icon
            int r7 = r5.iconLevel
            android.app.Notification r0 = r6.A0A
            r0.icon = r14
            r0.iconLevel = r7
            android.os.Bundle r0 = r5.extras
            if (r0 == 0) goto L_0x01d7
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r0)
            r7.remove(r12)
            r7.remove(r11)
            r7.remove(r10)
            r7.remove(r9)
            java.lang.String r0 = "android.intent.extra.CHANNEL_ID"
            r7.remove(r0)
            java.lang.String r0 = "android.intent.extra.CHANNEL_GROUP_ID"
            r7.remove(r0)
            r7.remove(r8)
            r7.remove(r3)
            r7.remove(r13)
            r7.remove(r2)
            java.lang.String r0 = "android.chronometerCountDown"
            r7.remove(r0)
            java.lang.String r0 = "android.colorized"
            r7.remove(r0)
            java.lang.String r0 = "android.people.list"
            r7.remove(r0)
            java.lang.String r0 = "android.people"
            r7.remove(r0)
            java.lang.String r0 = "android.support.sortKey"
            r7.remove(r0)
            java.lang.String r0 = "android.support.groupKey"
            r7.remove(r0)
            java.lang.String r0 = "android.support.isGroupSummary"
            r7.remove(r0)
            java.lang.String r0 = "android.support.localOnly"
            r7.remove(r0)
            java.lang.String r0 = "android.support.actionExtras"
            r7.remove(r0)
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r7.getBundle(r3)
            if (r0 == 0) goto L_0x01c7
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r0)
            java.lang.String r0 = "invisible_actions"
            r2.remove(r0)
            r7.putBundle(r3, r2)
        L_0x01c7:
            if (r1 == 0) goto L_0x01cc
            r1.A01(r7)
        L_0x01cc:
            android.os.Bundle r0 = r6.A0F
            if (r0 != 0) goto L_0x0206
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r7)
            r6.A0F = r0
        L_0x01d7:
            android.graphics.drawable.Icon r0 = r5.getSmallIcon()
            r6.A0S = r0
            android.graphics.drawable.Icon r0 = r5.getLargeIcon()
            if (r0 == 0) goto L_0x01e9
            androidx.core.graphics.drawable.IconCompat r0 = X.C66773McJ.A01(r0)
            r6.A0M = r0
        L_0x01e9:
            android.app.Notification$Action[] r8 = r5.actions
            r3 = 0
            if (r8 == 0) goto L_0x0323
            int r7 = r8.length
            if (r7 == 0) goto L_0x0323
            r2 = 0
        L_0x01f2:
            r0 = r8[r2]
            X.AH2 r0 = X.AH2.A00(r0)
            X.ADG r1 = r0.A01()
            java.util.ArrayList r0 = r6.A0Y
            r0.add(r1)
            int r2 = r2 + 1
            if (r2 >= r7) goto L_0x0323
            goto L_0x01f2
        L_0x0206:
            r0.putAll(r7)
            goto L_0x01d7
        L_0x020a:
            java.lang.String r0 = "androidx.core.app.extra.COMPAT_TEMPLATE"
            java.lang.String r1 = r4.getString(r0)
            if (r1 == 0) goto L_0x0219
            int r0 = r1.hashCode()
            switch(r0) {
                case -716705180: goto L_0x0274;
                case -171946061: goto L_0x02c8;
                case 714386739: goto L_0x02d9;
                case 912942987: goto L_0x02e8;
                case 919595044: goto L_0x02f9;
                case 2090799565: goto L_0x030a;
                default: goto L_0x0219;
            }
        L_0x0219:
            java.lang.String r0 = "android.selfDisplayName"
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x0314
            java.lang.String r0 = "android.messagingStyleUser"
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x0314
            r0 = 661(0x295, float:9.26E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x026e
            r0 = 662(0x296, float:9.28E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x026e
            r0 = 659(0x293, float:9.23E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0258
            androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
            r1.<init>()
        L_0x0252:
            r0 = 0
            if (r1 != 0) goto L_0x031b
            r1 = r0
            goto L_0x0012
        L_0x0258:
            java.lang.String r0 = "android.textLines"
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x02f2
            java.lang.String r0 = "android.callType"
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x027d
            androidx.core.app.NotificationCompat$CallStyle r1 = new androidx.core.app.NotificationCompat$CallStyle
            r1.<init>()
            goto L_0x0252
        L_0x026e:
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            goto L_0x0252
        L_0x0274:
            java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02c2
            goto L_0x0219
        L_0x027d:
            java.lang.String r0 = "android.template"
            java.lang.String r2 = r4.getString(r0)
            r1 = 0
            if (r2 == 0) goto L_0x0252
            java.lang.Class<android.app.Notification$BigPictureStyle> r0 = android.app.Notification.BigPictureStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02d2
            java.lang.Class<android.app.Notification$BigTextStyle> r0 = android.app.Notification.BigTextStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0303
            java.lang.Class<android.app.Notification$InboxStyle> r0 = android.app.Notification.InboxStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02f2
            java.lang.Class<android.app.Notification$MessagingStyle> r0 = android.app.Notification.MessagingStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0314
            java.lang.Class<android.app.Notification$DecoratedCustomViewStyle> r0 = android.app.Notification.DecoratedCustomViewStyle.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0252
        L_0x02c2:
            androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r1 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
            r1.<init>()
            goto L_0x0252
        L_0x02c8:
            java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02d2
            goto L_0x0219
        L_0x02d2:
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            goto L_0x0252
        L_0x02d9:
            java.lang.String r0 = "androidx.core.app.NotificationCompat$CallStyle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0219
            androidx.core.app.NotificationCompat$CallStyle r1 = new androidx.core.app.NotificationCompat$CallStyle
            r1.<init>()
            goto L_0x0252
        L_0x02e8:
            java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02f2
            goto L_0x0219
        L_0x02f2:
            androidx.core.app.NotificationCompat$InboxStyle r1 = new androidx.core.app.NotificationCompat$InboxStyle
            r1.<init>()
            goto L_0x0252
        L_0x02f9:
            java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0303
            goto L_0x0219
        L_0x0303:
            androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
            r1.<init>()
            goto L_0x0252
        L_0x030a:
            java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0314
            goto L_0x0219
        L_0x0314:
            androidx.core.app.NotificationCompat$MessagingStyle r1 = new androidx.core.app.NotificationCompat$MessagingStyle
            r1.<init>()
            goto L_0x0252
        L_0x031b:
            r1.A05(r4)     // Catch:{ ClassCastException -> 0x0320 }
            goto L_0x0012
        L_0x0320:
            r1 = r0
            goto L_0x0012
        L_0x0323:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            android.os.Bundle r1 = r5.extras
            java.lang.String r0 = "android.car.EXTENSIONS"
            android.os.Bundle r1 = r1.getBundle(r0)
            if (r1 == 0) goto L_0x03d6
            java.lang.String r0 = "invisible_actions"
            android.os.Bundle r2 = r1.getBundle(r0)
            if (r2 == 0) goto L_0x03d6
            r1 = 0
        L_0x033a:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x03d6
            java.lang.String r0 = java.lang.Integer.toString(r1)
            android.os.Bundle r8 = r2.getBundle(r0)
            java.lang.String r9 = "extras"
            android.os.Bundle r7 = r8.getBundle(r9)
            if (r7 == 0) goto L_0x03d3
            java.lang.String r0 = "android.support.allowGeneratedReplies"
            boolean r21 = r7.getBoolean(r0, r3)
        L_0x0356:
            java.lang.String r0 = "icon"
            int r7 = r8.getInt(r0)
            java.lang.String r0 = "title"
            java.lang.CharSequence r17 = r8.getCharSequence(r0)
            java.lang.String r0 = "actionIntent"
            android.os.Parcelable r14 = r8.getParcelable(r0)
            android.app.PendingIntent r14 = (android.app.PendingIntent) r14
            android.os.Bundle r15 = r8.getBundle(r9)
            java.lang.String r11 = "remoteInputs"
            android.os.Parcelable[] r10 = r8.getParcelableArray(r11)
            boolean r0 = r10 instanceof android.os.Bundle[]
            if (r0 != 0) goto L_0x03d0
            if (r10 == 0) goto L_0x03d0
            int r9 = r10.length
            java.lang.Class<android.os.Bundle[]> r0 = android.os.Bundle[].class
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r9, r0)
            android.os.Bundle[] r10 = (android.os.Bundle[]) r10
            r8.putParcelableArray(r11, r10)
        L_0x0386:
            X.A7Y[] r18 = X.C392339ue.A00(r10)
            java.lang.String r10 = "dataOnlyRemoteInputs"
            android.os.Parcelable[] r9 = r8.getParcelableArray(r10)
            boolean r0 = r9 instanceof android.os.Bundle[]
            if (r0 != 0) goto L_0x03cd
            if (r9 == 0) goto L_0x03cd
            int r11 = r9.length
            java.lang.Class<android.os.Bundle[]> r0 = android.os.Bundle[].class
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11, r0)
            android.os.Bundle[] r9 = (android.os.Bundle[]) r9
            r8.putParcelableArray(r10, r9)
        L_0x03a2:
            X.A7Y[] r19 = X.C392339ue.A00(r9)
            java.lang.String r0 = "semanticAction"
            int r20 = r8.getInt(r0)
            java.lang.String r0 = "showsUserInterface"
            boolean r22 = r8.getBoolean(r0)
            r0 = 0
            if (r7 == 0) goto L_0x03bb
            java.lang.String r8 = ""
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A01(r0, r8, r7)
        L_0x03bb:
            X.ADG r13 = new X.ADG
            r23 = r3
            r24 = r3
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r12.add(r13)
            int r1 = r1 + 1
            goto L_0x033a
        L_0x03cd:
            android.os.Bundle[] r9 = (android.os.Bundle[]) r9
            goto L_0x03a2
        L_0x03d0:
            android.os.Bundle[] r10 = (android.os.Bundle[]) r10
            goto L_0x0386
        L_0x03d3:
            r21 = 0
            goto L_0x0356
        L_0x03d6:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x03f2
            java.util.Iterator r2 = r12.iterator()
        L_0x03e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03f2
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L_0x03e0
            java.util.ArrayList r0 = r6.A0Z
            r0.add(r1)
            goto L_0x03e0
        L_0x03f2:
            android.os.Bundle r1 = r5.extras
            java.lang.String r0 = "android.people"
            java.lang.String[] r7 = r1.getStringArray(r0)
            if (r7 == 0) goto L_0x0413
            int r2 = r7.length
            if (r2 == 0) goto L_0x0413
        L_0x03ff:
            r1 = r7[r3]
            if (r1 == 0) goto L_0x040e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x040e
            java.util.ArrayList r0 = r6.A0a
            r0.add(r1)
        L_0x040e:
            int r3 = r3 + 1
            if (r3 >= r2) goto L_0x0413
            goto L_0x03ff
        L_0x0413:
            android.os.Bundle r1 = r5.extras
            java.lang.String r0 = "android.people.list"
            java.util.ArrayList r1 = r1.getParcelableArrayList(r0)
            if (r1 == 0) goto L_0x043d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x043d
            java.util.Iterator r2 = r1.iterator()
        L_0x0427:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x043d
            java.lang.Object r0 = r2.next()
            android.app.Person r0 = (android.app.Person) r0
            X.AH5 r1 = X.AAA.A01(r0)
            java.util.ArrayList r0 = r6.A0b
            r0.add(r1)
            goto L_0x0427
        L_0x043d:
            java.lang.String r2 = "android.chronometerCountDown"
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x0456
            boolean r1 = r4.getBoolean(r2)
            android.os.Bundle r0 = r6.A0F
            if (r0 != 0) goto L_0x0453
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r6.A0F = r0
        L_0x0453:
            r0.putBoolean(r2, r1)
        L_0x0456:
            java.lang.String r1 = "android.colorized"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0467
            boolean r0 = r4.getBoolean(r1)
            r6.A0d = r0
            r0 = 1
            r6.A0e = r0
        L_0x0467:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9T8.<init>(android.app.Notification, android.content.Context):void");
    }

    public static CharSequence A00(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 5120) {
            return charSequence;
        }
        return charSequence.subSequence(0, 5120);
    }

    public static void A01(AnonymousClass9T8 r2, int i, boolean z) {
        Notification notification = r2.A0A;
        int i2 = notification.flags;
        int i3 = i | i2;
        if (!z) {
            i3 = (i ^ -1) & i2;
        }
        notification.flags = i3;
    }

    public final Notification A03() {
        Bundle bundle;
        C370398wN r0 = new C370398wN(this);
        AnonymousClass9T8 r3 = r0.A06;
        AA2 aa2 = r3.A0K;
        if (aa2 != null) {
            aa2.A06(r0);
        }
        Notification build = r0.A04.build();
        RemoteViews remoteViews = r3.A0H;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (!(aa2 == null || (bundle = build.extras) == null)) {
            aa2.A04(bundle);
        }
        return build;
    }

    public final void A04(int i) {
        this.A0A.icon = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r6 == 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r4, int r5, int r6) {
        /*
            r3 = this;
            android.app.Notification r2 = r3.A0A
            r2.ledARGB = r4
            r2.ledOnMS = r5
            r2.ledOffMS = r6
            if (r5 == 0) goto L_0x000d
            r1 = 1
            if (r6 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            int r0 = r2.flags
            r0 = r0 & -2
            r1 = r1 | r0
            r2.flags = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9T8.A05(int, int, int):void");
    }

    public final void A06(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this.A0Y.add(new ADG(pendingIntent, charSequence, i));
    }

    public final void A07(Bitmap bitmap) {
        IconCompat A022;
        if (bitmap == null) {
            A022 = null;
        } else {
            A022 = IconCompat.A02(bitmap);
        }
        this.A0M = A022;
    }

    public final void A08(Uri uri) {
        Notification notification = this.A0A;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void A09(Uri uri, int i) {
        Notification notification = this.A0A;
        notification.sound = uri;
        notification.audioStreamType = i;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
    }

    public final void A0A(AA2 aa2) {
        if (this.A0K != aa2) {
            this.A0K = aa2;
            if (aa2 != null) {
                aa2.A02(this);
            }
        }
    }

    public final void A0D(CharSequence charSequence) {
        this.A0A.tickerText = A00(charSequence);
    }

    public final void A0E(boolean z) {
        A01(this, 16, z);
    }

    public final void A0B(CharSequence charSequence) {
        this.A0O = A00(charSequence);
    }

    public final void A0C(CharSequence charSequence) {
        this.A0P = A00(charSequence);
    }

    public AnonymousClass9T8(Context context, String str) {
        this.A0Y = AnonymousClass7TE.A1C();
        this.A0b = AnonymousClass7TE.A1C();
        this.A0Z = AnonymousClass7TE.A1C();
        this.A0i = true;
        this.A0g = false;
        this.A01 = 0;
        this.A08 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A02 = 0;
        Notification notification = new Notification();
        this.A0A = notification;
        this.A0E = context;
        this.A0U = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A05 = 0;
        this.A0a = AnonymousClass7TE.A1C();
        this.A0c = true;
    }
}
