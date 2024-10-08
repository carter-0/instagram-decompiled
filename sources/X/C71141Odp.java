package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Odp  reason: case insensitive filesystem */
public abstract class C71141Odp {
    public static final 0bY A00 = DbW.A0G();

    public static AnonymousClass9T8 A04(Context context, AnonymousClass5HJ r12, UserSession userSession, String str, String str2) {
        Context context2 = context;
        return A03(context, C3726691w.A00(context2, r12.A07, userSession, str, r12.A11, r12.A0X), r12, userSession, str, str2, false);
    }

    public static boolean A07(AnonymousClass5HJ r2) {
        String str = r2.A0g;
        if (str == null) {
            return false;
        }
        if (str.startsWith("bloks") || str.startsWith(AnonymousClass000.A00(1135)) || str.startsWith("bloks_screen_query")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.AA2, androidx.core.app.NotificationCompat$BigPictureStyle] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification A00(android.content.Context r9, X.AnonymousClass9T8 r10, java.util.List r11, boolean r12, boolean r13) {
        /*
            java.lang.Object r4 = X.C66582MXn.A0r(r11)
            X.5HJ r4 = (X.AnonymousClass5HJ) r4
            if (r12 == 0) goto L_0x008b
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0E
            if (r0 == 0) goto L_0x0097
            X.1NK r1 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0E
        L_0x0012:
            com.instagram.common.typedurl.ImageUrl r0 = X.C242683Vn.A00(r9, r0)
            android.graphics.Bitmap r8 = r1.A0G(r0)
        L_0x001a:
            java.lang.String r1 = r4.A0t
            if (r1 == 0) goto L_0x0086
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r1 = java.util.Arrays.asList(r0)
        L_0x0028:
            java.lang.String r0 = r4.A0r
            android.text.SpannableString r5 = X.C66580MXl.A0D(r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x0032:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.String r1 = X.AnonymousClass7TE.A18(r7)
            java.lang.String r0 = "\\|"
            java.lang.String[] r0 = r1.split(r0)
            r3 = 0
            r1 = r0[r3]
            r6 = 1
            r2 = r0[r6]
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r2.split(r0)
            r0 = r2[r3]
            int r3 = java.lang.Integer.parseInt(r0)
            r0 = r2[r6]
            int r2 = java.lang.Integer.parseInt(r0)
            if (r3 < 0) goto L_0x0032
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x0032
            if (r2 < 0) goto L_0x0032
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0032
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            r6 = 2
        L_0x007b:
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r6)
            r0 = 33
            r5.setSpan(r1, r3, r2, r0)
            goto L_0x0032
        L_0x0086:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0028
        L_0x008b:
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0D
            if (r0 == 0) goto L_0x0097
            X.1NK r1 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0D
            goto L_0x0012
        L_0x0097:
            r8 = 0
            goto L_0x001a
        L_0x0099:
            if (r8 == 0) goto L_0x00df
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r3.<init>()
            r3.A02(r10)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A02(r8)
            r3.A01 = r0
            java.lang.CharSequence r0 = X.AnonymousClass9T8.A00(r5)
            r3.A02 = r0
            r2 = 1
            r3.A03 = r2
            if (r13 == 0) goto L_0x00cf
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0C
            if (r0 == 0) goto L_0x00cf
            X.1NK r1 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0C
            android.graphics.Bitmap r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x00cf
            android.graphics.Bitmap r0 = A02(r9, r0)
            if (r0 != 0) goto L_0x00d8
            r0 = 0
        L_0x00cb:
            r3.A00 = r0
            r3.A02 = r2
        L_0x00cf:
            X.9T8 r0 = r3.A00
            if (r0 == 0) goto L_0x00dd
            android.app.Notification r0 = r0.A03()
            return r0
        L_0x00d8:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A02(r0)
            goto L_0x00cb
        L_0x00dd:
            r0 = 0
            return r0
        L_0x00df:
            android.app.Notification r0 = r10.A03()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71141Odp.A00(android.content.Context, X.9T8, java.util.List, boolean, boolean):android.app.Notification");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0154, code lost:
        if (X.2Ob.A00(r8.A11, "post") == false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.PendingIntent A01(android.content.Context r6, android.os.Bundle r7, X.AnonymousClass5HJ r8, com.instagram.common.session.UserSession r9, java.lang.String r10) {
        /*
            boolean r0 = A07(r8)
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = 1
            if (r0 == 0) goto L_0x0111
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            X.14B r0 = X.AnonymousClass14B.A00()
            if (r2 < r1) goto L_0x00ff
            android.content.Intent r2 = r0.A03(r6, r5)
        L_0x0017:
            if (r7 == 0) goto L_0x001c
            r2.putExtras(r7)
        L_0x001c:
            java.lang.String r0 = "entry_point_push"
            r2.putExtra(r0, r4)
            java.lang.String r1 = r8.A0g
            java.lang.String r0 = "landing_path"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r8.A1A
            java.lang.String r0 = "sender_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r8.A0j
            java.lang.String r0 = "recipient_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r8.A11
            java.lang.String r0 = "notification_type"
            r2.putExtra(r0, r1)
            java.lang.String r0 = r8.A11
            java.lang.String r5 = "push_category"
            r2.putExtra(r5, r0)
            java.lang.String r1 = r8.A13
            java.lang.String r0 = "trace_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r8.A12
            java.lang.String r0 = "from_notification_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r8.A11
            java.lang.String r0 = "from_notification_category"
            r2.putExtra(r0, r1)
            X.MYX.A05(r2, r8)
            java.lang.String r1 = "ig://"
            java.lang.String r0 = r8.A0g
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0bY r0 = A00
            android.net.Uri r0 = X.0cp.A01(r0, r1)
            if (r0 == 0) goto L_0x00c3
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.lang.String r1 = r8.A0g
            if (r1 == 0) goto L_0x008a
            java.lang.String r0 = "peoplefeed"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x008a
            java.lang.String r1 = r8.A0h
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_FORCED_USER_IDS"
            r3.appendQueryParameter(r0, r1)
            java.lang.String r1 = r8.A12
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_PUSH_ID"
            r3.appendQueryParameter(r0, r1)
        L_0x008a:
            if (r10 == 0) goto L_0x0095
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r0 = r0.toString()
            r3.appendQueryParameter(r10, r0)
        L_0x0095:
            java.lang.Long r0 = r8.A0L
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "occam_id"
            r3.appendQueryParameter(r0, r1)
        L_0x00a2:
            java.lang.String r0 = r8.A11
            r3.appendQueryParameter(r5, r0)
            java.lang.String r1 = r8.A0W
            java.lang.String r0 = "jl_hash"
            r3.appendQueryParameter(r0, r1)
            java.lang.String r1 = r8.A0V
            java.lang.String r0 = "di_id"
            r3.appendQueryParameter(r0, r1)
            android.net.Uri r3 = r3.build()
            r2.setData(r3)
            java.lang.String r1 = r8.A0j
            java.lang.String r0 = "via_push_notification"
            X.OP0.A01(r6, r2, r3, r1, r0)
        L_0x00c3:
            X.0Sy r5 = new X.0Sy
            r5.<init>()
            r5.A0A(r2)
            boolean r0 = A07(r8)
            r3 = 31
            if (r0 == 0) goto L_0x00fd
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x00fd
            X.0Pj r0 = X.0cQ.A00()
            r5.A00 = r0
            r0 = 1136(0x470, float:1.592E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x00e3:
            r5.A02 = r4
            r5.A03 = r4
            r5.A01 = r0
            boolean r0 = A07(r8)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = 64278(0xfb16, float:9.0073E-41)
            if (r0 == 0) goto L_0x01f4
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x01f4
            android.app.PendingIntent r0 = r5.A03(r6, r1, r2)
            return r0
        L_0x00fd:
            r0 = 0
            goto L_0x00e3
        L_0x00ff:
            java.lang.String r1 = r6.getPackageName()
            android.content.Intent r2 = X.DbS.A09()
            java.lang.String r0 = "com.instagram.notifications.push.BloksNotificationService"
            X.C66581MXm.A17(r2, r1, r0)
            r2.setFlags(r5)
            goto L_0x0017
        L_0x0111:
            java.lang.String r3 = "DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_IS_FROM_DIRECT_PUSH"
            if (r9 == 0) goto L_0x018d
            java.lang.String r1 = r8.A0g
            if (r1 == 0) goto L_0x0132
            java.lang.String r0 = "reels_together"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0132
            X.AnonymousClass14B.A00()
            java.lang.Class<com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity> r0 = com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity.class
            android.content.Intent r2 = X.C66580MXl.A0A(r6, r0)
            r2.setFlags(r5)
            r2.putExtra(r3, r4)
            goto L_0x0017
        L_0x0132:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323706653453734(0x810c3800012da6, double:3.034596579246328E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = r8.A0g
            if (r1 == 0) goto L_0x0156
            java.lang.String r0 = "media"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = r8.A11
            java.lang.String r0 = "post"
            boolean r1 = X.2Ob.A00(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            r1 = 268468224(0x10008000, float:2.5342157E-29)
            if (r0 == 0) goto L_0x0167
            X.14B r0 = X.AnonymousClass14B.A00()
            android.content.Intent r2 = r0.A02(r6, r1)
            java.lang.String r0 = "need_expose_to_notification_to_feed_qe"
            goto L_0x01cf
        L_0x0167:
            java.lang.String r2 = r8.A0g
            if (r2 == 0) goto L_0x018d
            r0 = 3035(0xbdb, float:4.253E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x0183
            r0 = 4728(0x1278, float:6.625E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x018d
        L_0x0183:
            X.14B r0 = X.AnonymousClass14B.A00()
            android.content.Intent r2 = r0.A02(r6, r1)
            goto L_0x0017
        L_0x018d:
            java.lang.String r1 = r8.A0g
            if (r1 == 0) goto L_0x01da
            java.lang.String r0 = "direct_v2"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x01a5
            r0 = 4708(0x1264, float:6.597E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x01da
        L_0x01a5:
            if (r9 == 0) goto L_0x01da
            X.0BQ r0 = X.AnonymousClass0BO.A00(r9)
            boolean r0 = r0.CKD()
            X.0Tu r2 = X.0Tu.A05
            if (r0 == 0) goto L_0x01d4
            r0 = 36325952921351567(0x810e430001358f, double:3.036017128109912E-306)
        L_0x01b8:
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x01da
            X.AnonymousClass14B.A00()
            java.lang.Class<com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity> r0 = com.instagram.direct.notifications.impl.activity.DirectPushNotificationActivity.class
            android.content.Intent r2 = X.C66580MXl.A0A(r6, r0)
            r2.setFlags(r5)
            r2.putExtra(r3, r4)
            java.lang.String r0 = "DirectThreadFragment.DIRECT_NOTIFICATION_IMPROVED_EXPERIENCE_ENABLED"
        L_0x01cf:
            r2.putExtra(r0, r4)
            goto L_0x0017
        L_0x01d4:
            r0 = 36325952921286030(0x810e430000358e, double:3.0360171280684663E-306)
            goto L_0x01b8
        L_0x01da:
            X.14B r0 = X.AnonymousClass14B.A00()
            android.content.Intent r2 = r0.A02(r6, r5)
            java.lang.String r1 = r8.A0g
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "direct_v2"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0017
            r2.putExtra(r3, r4)
            java.lang.String r0 = "DirectFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_AVOID_INITIALIZING_MAIN_ACTIVITY"
            goto L_0x01cf
        L_0x01f4:
            android.app.PendingIntent r0 = r5.A01(r6, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71141Odp.A01(android.content.Context, android.os.Bundle, X.5HJ, com.instagram.common.session.UserSession, java.lang.String):android.app.PendingIntent");
    }

    public static Bitmap A02(Context context, Bitmap bitmap) {
        try {
            float min = Math.min(context.getResources().getDimension(17104901) / ((float) bitmap.getWidth()), context.getResources().getDimension(17104902) / ((float) bitmap.getHeight()));
            if (min < 1.0f && min > 0.0f) {
                int width = (int) (((float) bitmap.getWidth()) * min);
                int height = (int) (((float) bitmap.getHeight()) * min);
                try {
                    bitmap = 0fO.A00(bitmap, width, height, true);
                } catch (RuntimeException e) {
                    0wb.A07("NotificationDelegateHelper_error_creating_bitamp", e);
                    bitmap.setPremultiplied(true);
                    try {
                        bitmap = 0fO.A00(bitmap, width, height, true);
                    } catch (RuntimeException e2) {
                        0wb.A07(" NotificationDelegateHelper_error_after_premultiplying_bitamp", e2);
                    }
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C240563Lj r0 = new C240563Lj(bitmap, false);
        r0.setBounds(0, 0, width2, height2);
        r0.draw(canvas);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(R.style.Avatar, new int[]{R.attr.strokeColor, R.attr.strokeWidth});
        int color = obtainStyledAttributes.getColor(0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize != 0) {
            C226582hK r02 = new C226582hK(dimensionPixelSize, color);
            r02.setBounds(0, 0, width2, height2);
            r02.draw(canvas);
        }
        return createBitmap;
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [X.AA2, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9T8 A03(android.content.Context r12, X.2HA r13, X.AnonymousClass5HJ r14, com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r14.A12
            java.lang.String r0 = "com.instagram.android.igns.logging.push_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r14.A11
            java.lang.String r0 = "com.instagram.android.igns.logging.push_category"
            r2.putString(r0, r1)
            java.lang.String r1 = r14.A0g
            java.lang.String r0 = "com.instagram.android.igns.logging.ig_action"
            r2.putString(r0, r1)
            java.lang.String r1 = r14.A0j
            java.lang.String r0 = "com.instagram.android.igns.logging.intended_recipient_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r14.A1A
            java.lang.String r0 = "com.instagram.android.igns.logging.sender_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r14.A16
            java.lang.String r0 = "com.instagram.android.igns.logging.revoked_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r14.A0X
            java.lang.String r0 = "com.instagram.android.igns.logging.collapse_key"
            r2.putString(r0, r1)
            java.lang.String r0 = r14.A0r
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r0 = "com.instagram.android.igns.logging.has_message"
            r2.putBoolean(r0, r1)
            com.instagram.common.notifications.push.intf.PushChannelType r0 = r14.A0B
            if (r0 != 0) goto L_0x0046
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.A0D
        L_0x0046:
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "com.instagram.android.igns.logging.channel_type"
            r2.putString(r0, r1)
            java.lang.Long r0 = r14.A0J
            if (r0 == 0) goto L_0x005c
            long r0 = r0.longValue()
            java.lang.String r3 = "com.instagram.android.igns.notification_life_time"
            r2.putLong(r3, r0)
        L_0x005c:
            java.lang.String r4 = r14.A12
            java.lang.Class<com.instagram.notifications.push.ClearNotificationReceiver> r0 = com.instagram.notifications.push.ClearNotificationReceiver.class
            android.content.Intent r3 = X.C66580MXl.A0A(r12, r0)
            r3.putExtras(r2)
            r9 = r16
            r0 = r17
            android.net.Uri r0 = X.O1O.A00(r9, r0)
            r3.setData(r0)
            java.lang.String r0 = "push_id"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "push_category"
            r3.putExtra(r0, r9)
            java.lang.String r1 = "channel"
            java.lang.String r0 = "push"
            r3.putExtra(r1, r0)
            java.lang.String r1 = r14.A13
            java.lang.String r0 = "trace_id"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r14.A0g
            java.lang.String r0 = "landing_path"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r14.A0j
            java.lang.String r0 = "recipient_id"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r14.A1A
            java.lang.String r0 = "sender_id"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r14.A11
            java.lang.String r0 = "notification_type"
            r3.putExtra(r0, r1)
            r8 = 1
            java.lang.String r0 = "entry_point_push"
            r3.putExtra(r0, r8)
            X.MYX.A05(r3, r14)
            r3.setAction(r4)
            X.0Sy r3 = X.C66582MXn.A0K(r12, r3)
            r1 = 64278(0xfb16, float:9.0073E-41)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.app.PendingIntent r1 = r3.A02(r12, r1, r0)
            r7 = 0
            android.app.PendingIntent r3 = A01(r12, r2, r14, r15, r7)
            java.lang.String r6 = r14.A1V
            if (r6 != 0) goto L_0x00ca
            java.lang.String r6 = ""
        L_0x00ca:
            java.lang.String r5 = r14.A1I
            if (r5 != 0) goto L_0x00d2
            java.lang.String r5 = X.0lz.A00(r12)
        L_0x00d2:
            java.lang.String r0 = "direct"
            boolean r10 = r0.equals(r9)
            java.lang.String r0 = r13.A00
            X.9T8 r4 = new X.9T8
            r4.<init>((android.content.Context) r12, (java.lang.String) r0)
            r4.A0C = r3
            r4.A0E(r8)
            java.lang.String r0 = X.002.A0R(r6, r5)
            r4.A0C(r0)
            java.lang.String r0 = r14.A0r
            r4.A0B(r0)
            android.app.Notification r3 = r4.A0A
            r3.deleteIntent = r1
            java.lang.String r0 = r14.A1H
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = r14.A0r
        L_0x00fa:
            r4.A0D(r0)
            r0 = 2130969230(0x7f04028e, float:1.7547136E38)
            r1 = 2131239376(0x7f0821d0, float:1.8095057E38)
            int r0 = X.2Yu.A0H(r12, r0)
            if (r0 == 0) goto L_0x010a
            r1 = r0
        L_0x010a:
            r4.A04(r1)
            r4.A0F = r2
            androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
            r1.<init>()
            java.lang.String r0 = r14.A0r
            r1.A07(r0)
            r4.A0A(r1)
            java.lang.String r1 = r14.A1D
            if (r1 == 0) goto L_0x012c
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x012c
            java.lang.CharSequence r0 = X.AnonymousClass9T8.A00(r1)
            r4.A0R = r0
        L_0x012c:
            if (r10 != 0) goto L_0x0162
            if (r15 == 0) goto L_0x0162
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322753170712963(0x810b5a00012983, double:3.0339935929216974E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r14.A0d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0277
            r0 = 36320609982030494(0x8109670001229e, double:3.032638231768976E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x0277
            java.lang.String r1 = r14.A0j
            java.lang.String r0 = r14.A0d
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[]{r1, r0}
            java.lang.String r0 = "-"
            java.lang.String r0 = X.C69696NqI.A00(r0, r1)
            r4.A0V = r0
        L_0x0162:
            java.lang.String r1 = r14.A1C
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016e
            r3.defaults = r8
        L_0x016e:
            java.lang.String r0 = r14.A1B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x017a
            java.lang.String r0 = r14.A1B
            r4.A0X = r0
        L_0x017a:
            if (r18 == 0) goto L_0x01f3
            com.instagram.common.typedurl.ImageUrl r0 = r14.A0D
            if (r0 == 0) goto L_0x0195
            X.1NK r1 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r14.A0D
            android.graphics.Bitmap r7 = r1.A0G(r0)
        L_0x018a:
            if (r7 == 0) goto L_0x0195
            boolean r0 = X.C66630MZz.A03(r14, r15)
            if (r0 != 0) goto L_0x0195
            r4.A07(r7)
        L_0x0195:
            X.2HA r0 = X.2HA.A0W
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01a3
            r4.A05 = r8
            long[] r0 = X.C7203Pyv.A04
            r3.vibrate = r0
        L_0x01a3:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01ee
            if (r15 == 0) goto L_0x01ee
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325338741027718(0x810db400013386, double:3.0356287180000044E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x01ee
            java.lang.String r1 = r12.getPackageName()
            r0 = 2131628037(0x7f0e1005, float:1.8883355E38)
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            r8.<init>(r1, r0)
            java.lang.String r3 = X.002.A0R(r6, r5)
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.String r1 = r14.A0r
            X.0qQ.A0B(r1, r2)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            r8.setTextViewText(r0, r3)
            r0 = 2131442566(0x7f0b3b86, float:1.8507175E38)
            r8.setTextViewText(r0, r1)
            if (r7 == 0) goto L_0x01ec
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            r8.setImageViewBitmap(r0, r7)
            r8.setViewVisibility(r0, r2)
        L_0x01ec:
            r4.A0I = r8
        L_0x01ee:
            boolean r0 = r14.A1M
            r4.A0j = r0
            return r4
        L_0x01f3:
            java.lang.String r1 = r14.A0g
            if (r1 == 0) goto L_0x0261
            r0 = 3035(0xbdb, float:4.253E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0261
            r9 = 0
            java.util.LinkedHashMap r11 = X.C282435Db.A00(r1)
            java.lang.String r0 = "thumbnail_uri"
            boolean r1 = r11.containsKey(r0)
            r10 = 0
            if (r1 == 0) goto L_0x025e
            android.content.res.Resources r2 = r12.getResources()
            r1 = 2131165260(0x7f07004c, float:1.7944732E38)
            int r2 = X.DbS.A03(r2, r1)
            X.1NK r1 = X.1NK.A00()
            java.lang.String r0 = X.DbS.A0r(r0, r11)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            android.graphics.Bitmap r10 = r1.A0H(r0, r7)
            if (r10 == 0) goto L_0x025e
            android.content.res.Resources r1 = r12.getResources()
            android.graphics.Bitmap r0 = X.0fO.A00(r10, r2, r2, r8)
            X.8DU r7 = new X.8DU
            r7.<init>(r1, r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            float r0 = r1.getDimension(r0)
            r7.A02(r0)
            int r2 = r7.A02
            int r1 = r7.A01
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r10)
            r7.setBounds(r9, r9, r2, r1)
            r7.draw(r0)
        L_0x025e:
            r7 = r10
            goto L_0x018a
        L_0x0261:
            com.instagram.common.typedurl.ImageUrl r0 = r14.A0C
            if (r0 == 0) goto L_0x0195
            X.1NK r1 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r14.A0C
            android.graphics.Bitmap r7 = r1.A0G(r0)
            if (r7 == 0) goto L_0x0195
            android.graphics.Bitmap r7 = A02(r12, r7)
            goto L_0x018a
        L_0x0277:
            java.lang.String r0 = r14.A0j
            java.lang.String r0 = X.C69824Nsl.A00(r13, r0, r9)
            r4.A0V = r0
            goto L_0x0162
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71141Odp.A03(android.content.Context, X.2HA, X.5HJ, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, boolean):X.9T8");
    }

    public static AnonymousClass9T8 A05(Context context, UserSession userSession, String str, String str2, List list) {
        AnonymousClass9T8 A04 = A04(context, (AnonymousClass5HJ) C66582MXn.A0r(list), userSession, str, str2);
        if (!list.isEmpty()) {
            A04.A04 = list.size();
        }
        return A04;
    }

    public static List A06(List list, int i) {
        ArrayList A0v = DbS.A0v(Math.min(list.size(), i));
        int size = list.size();
        for (int max = Math.max(0, size - i); max < size; max++) {
            AnonymousClass5HJ r1 = (AnonymousClass5HJ) list.get(max);
            if (r1 != null && !TextUtils.isEmpty(r1.A12)) {
                A0v.add(r1.A12);
            }
        }
        return Collections.unmodifiableList(A0v);
    }
}
