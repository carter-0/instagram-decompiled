package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4qG  reason: invalid class name and case insensitive filesystem */
public final class C275424qG implements C61110lV {
    public final C58840Ae A00;
    public final boolean A01;
    public final 2J9 A02;
    public final C275434qH A03 = new C275434qH(this);
    public final 0xm A04;
    public final 1Av A05;
    public final C62320sa A06;

    public C275424qG(C58840Ae r4, UserSession userSession, 2J9 r6, 0xm r7, 1Av r8, C62320sa r9) {
        0qQ.A0B(r7, 3);
        0qQ.A0B(r8, 4);
        this.A00 = r4;
        this.A04 = r7;
        this.A05 = r8;
        this.A02 = r6;
        this.A06 = r9;
        this.A01 = 182.A06(0Tu.A06, userSession, 36320837615297421L);
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(16047155, AnonymousClass0fD.A03(-794487918));
    }

    public final void onAppForegrounded() {
        Long l;
        Long l2;
        int i;
        Boolean bool;
        long j;
        boolean z;
        long j2;
        boolean z2;
        0bb r9;
        int A032 = AnonymousClass0fD.A03(355545625);
        Context context = (Context) this.A06.invoke();
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "instagram_android_badge");
        if (!A002.isSampled()) {
            i = 441235914;
        } else {
            A002.A8M(C271024hm.APP_BADGE, "badge_type");
            A002.A8M(C271034hn.USER_ENTERED_APP, "badge_event");
            long j3 = (long) this.A05.A01.getInt("num_unseen_activities", 0);
            0xa r12 = this.A04.A00;
            boolean z3 = r12.getBoolean("launcher_badge_supported", false);
            int i2 = r12.getInt("launcher_badge_count", 0);
            if (i2 >= 0) {
                l = Long.valueOf((long) i2);
            } else {
                l = null;
            }
            HashMap hashMap = new HashMap();
            if (r12.getInt("armadillo_thread_count_for_launcher_badge", -1) != -1) {
                hashMap.put(C271014hl.E2EE, Long.valueOf((long) r12.getInt("armadillo_thread_count_for_launcher_badge", -1)));
            }
            if (r12.getInt("open_thread_count_for_launcher_badge", -1) != -1) {
                hashMap.put(C271014hl.OPEN_MESSAGE, Long.valueOf((long) r12.getInt("open_thread_count_for_launcher_badge", -1)));
            }
            A002.A7p("is_device_badge_count_capable", Boolean.valueOf(z3));
            A002.A9F("badge_value_set", l);
            A002.A9H("badge_value_set_map", hashMap);
            A002.A9F("unseen_activity_count", Long.valueOf(j3));
            A002.A7p("excludes_muted", Boolean.valueOf(this.A01));
            List<AnonymousClass5DP> list = this.A02.A00().A01;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AnonymousClass5DP r10 : list) {
                if (r10 instanceof AnonymousClass5HX) {
                    r9 = new 0bb();
                    N4E n4e = ((AnonymousClass5HX) r10).A00;
                    MsysThreadId msysThreadId = (MsysThreadId) n4e.A03;
                    r9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(msysThreadId.A00));
                    r9.A06("v2_id", (String) null);
                    r9.A03(TraceFieldType.IsSecure, true);
                    r9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, msysThreadId.A01.A00);
                    r9.A01(C69764Nrn.A00(((MsysThreadSubtype) n4e.A04).A00), "thread_sub_type");
                } else {
                    C254743sy r11 = r10.A00;
                    0qQ.A0C(r11, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                    DirectThreadKey directThreadKey = (DirectThreadKey) r11;
                    r9 = new 0bb();
                    r9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directThreadKey.A00);
                    r9.A06("v2_id", directThreadKey.A01);
                    r9.A03(TraceFieldType.IsSecure, Boolean.valueOf(r10.A08));
                    r9.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C254923tH.DJANGO.A00);
                }
                r9.A03("is_muted", Boolean.valueOf(r10.A0A));
                arrayList.add(r9);
            }
            A002.A9F("unread_threads_count", Long.valueOf((long) arrayList.size()));
            A002.AAe("unread_threads", arrayList);
            C275434qH r5 = this.A03;
            boolean z4 = false;
            0qQ.A0B(context, 0);
            Object systemService = context.getSystemService("notification");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            boolean areNotificationsEnabled = notificationManager.areNotificationsEnabled();
            ContentResolver contentResolver = context.getContentResolver();
            boolean z5 = true;
            if (Settings.Global.getInt(contentResolver, "notification_badging", 1) != 1) {
                z5 = false;
            }
            if (areNotificationsEnabled) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                0qQ.A07(activeNotifications);
                ArrayList arrayList2 = new ArrayList();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    Notification notification = statusBarNotification.getNotification();
                    0qQ.A07(notification);
                    if ((notification.flags & 64) == 0) {
                        arrayList2.add(statusBarNotification);
                    }
                }
                Iterator it = arrayList2.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(statusBarNotification2.getNotification().getChannelId());
                    if (notificationChannel != null) {
                        z2 = notificationChannel.canShowBadge();
                    } else {
                        z2 = false;
                    }
                    0bb r92 = new 0bb();
                    r92.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf((long) statusBarNotification2.getId()));
                    r92.A06("tag", statusBarNotification2.getTag());
                    r92.A03("affects_badging", Boolean.valueOf(z2));
                    r92.A06("channel_id", statusBarNotification2.getNotification().getChannelId());
                    builder.add(r92);
                    if (z2) {
                        i3++;
                    }
                }
                if (i3 == 0) {
                    l2 = null;
                    A002.AAe("unread_notifs", (List) null);
                    A002.A9F("unread_notifs_count", (Long) null);
                    A002.A7p("was_badge_showing", (Boolean) null);
                    A002.A9F("current_badge_value_showing", l2);
                    A002.A7p("is_badging_enabled_on_device", Boolean.valueOf(z5));
                    A002.A7p("excludes_muted", Boolean.valueOf(r5.A00.A01));
                    A002.Cgf();
                    i = 1727399799;
                } else {
                    ImmutableList build = builder.build();
                    if (!z5 || i3 <= 0) {
                        bool = null;
                    } else {
                        if (!z3 || i2 > 0) {
                            z4 = true;
                        }
                        bool = Boolean.valueOf(z4);
                    }
                    if (0qQ.A0K(bool, true)) {
                        if (z3) {
                            j2 = (long) i2;
                        } else {
                            j2 = (long) i3;
                        }
                        l2 = Long.valueOf(j2);
                    } else {
                        l2 = null;
                    }
                    A002.AAe("unread_notifs", build);
                    j = (long) build.size();
                }
            } else {
                l2 = null;
                if (z3) {
                    z = null;
                } else {
                    z = false;
                }
                A002.AAe("unread_notifs", (List) null);
                j = 0;
            }
            A002.A9F("unread_notifs_count", Long.valueOf(j));
            A002.A7p("was_badge_showing", bool);
            A002.A9F("current_badge_value_showing", l2);
            A002.A7p("is_badging_enabled_on_device", Boolean.valueOf(z5));
            A002.A7p("excludes_muted", Boolean.valueOf(r5.A00.A01));
            A002.Cgf();
            i = 1727399799;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
