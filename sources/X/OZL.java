package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService;
import java.util.List;

public final class OZL {
    public final NotificationManager A00;
    public final Context A01;
    public final 1Fs A02;
    public final 1X9 A03;
    public final AIZ A04;

    public static final void A00(Context context, Bundle bundle, UserSession userSession, RtcCreateCallArgs rtcCreateCallArgs, OZL ozl, String str, String str2, String str3, String str4, String str5) {
        PendingIntent pendingIntent;
        UserSession userSession2 = userSession;
        RtcCreateCallArgs rtcCreateCallArgs2 = rtcCreateCallArgs;
        Context context2 = context;
        if (rtcCreateCallArgs != null) {
            pendingIntent = C66582MXn.A0K(context2, C70319O1x.A00(context2, userSession2, rtcCreateCallArgs2)).A01(context2, 0, 134217728);
        } else {
            pendingIntent = null;
        }
        OZL ozl2 = ozl;
        Context context3 = ozl2.A01;
        Intent A012 = F5W.A01(context3, str2, str, (String) null, "via_push_notification", (String) null, (List) null);
        0Sy r1 = new 0Sy();
        r1.A0A(A012);
        r1.A09();
        r1.A08 = new 1Q7("IgSecurePendingIntent").A00;
        PendingIntent A013 = r1.A01(context2, 0, 134217728);
        Intent A002 = F5W.A00(context3, "all", "direct-inbox", (String) null, 67108864);
        0Sy r12 = new 0Sy();
        r12.A0A(A002);
        r12.A09();
        r12.A08 = new 1Q7("IgSecurePendingIntent").A00;
        PendingIntent A014 = r12.A01(context2, 0, 134217728);
        AIZ aiz = ozl2.A04;
        Intent A0A = C66580MXl.A0A(context3, RtcCallActionIntentHandlerService.class);
        A0A.setAction("DISMISS_MISSED");
        A0A.putExtras(bundle);
        PendingIntent A032 = C66582MXn.A0K(context3, A0A).A03(context3, Math.abs(2SP.A01.A03()), 0);
        AnonymousClass9T8 A022 = AIZ.A02(aiz, str4, str3, aiz.A02);
        A022.A05 = 1;
        A022.A09 = C39620A2k.A01;
        A022.A0E(true);
        A022.A0C = A014;
        if (A013 != null) {
            A022.A0Y.add(new ADG(A013, aiz.A00.getString(2131976574), 0));
        }
        if (pendingIntent != null) {
            A022.A0Y.add(new ADG(pendingIntent, aiz.A00.getString(2131976573), 0));
        }
        A022.A0A.deleteIntent = A032;
        A022.A01 = aiz.A00.getColor(R.color.igds_error_or_destructive);
        Notification A033 = A022.A03();
        0qQ.A07(A033);
        String str6 = str5;
        C71004OWb.A00.A00("RtcCallNotificationManager", 002.A0R("showMissedCallNotification ", str6));
        A01((C74562PxB) null, userSession2, ozl2);
        ozl2.A02.A00(str6, 1910377639, A033);
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        C71004OWb.A00.A00("RtcCallNotificationManager", 002.A0R("cancelNotification ", str));
        this.A02.A00.cancel(str, 1910377639);
    }

    public /* synthetic */ OZL(Context context) {
        AIZ aiz = new AIZ(context);
        1Fs r3 = new 1Fs(context);
        NotificationManager notificationManager = (NotificationManager) C66582MXn.A0p(context);
        1X9 A002 = AnonymousClass38W.A00();
        0qQ.A0B(notificationManager, 4);
        this.A01 = context;
        this.A04 = aiz;
        this.A02 = r3;
        this.A00 = notificationManager;
        this.A03 = A002;
    }

    public static final void A01(C74562PxB pxB, UserSession userSession, OZL ozl) {
        try {
            NotificationManager notificationManager = ozl.A00;
            0Tu r2 = 0Tu.A05;
            if (((long) notificationManager.getActiveNotifications().length) >= 182.A01(r2, userSession, 36605142976763071L)) {
                C71004OWb oWb = C71004OWb.A00;
                oWb.A00("RtcCallNotificationManager", 002.A0O("number of active notifications ", notificationManager.getActiveNotifications().length));
                if (pxB != null) {
                    pxB.CmD("active_notif_count", notificationManager.getActiveNotifications().length);
                }
                if (182.A06(r2, userSession, 36323667999993211L)) {
                    StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                    0qQ.A07(activeNotifications);
                    int length = activeNotifications.length;
                    if (length != 0) {
                        StatusBarNotification statusBarNotification = activeNotifications[0];
                        int i = length - 1;
                        if (i != 0) {
                            long postTime = statusBarNotification.getPostTime();
                            if (1 <= i) {
                                int i2 = 1;
                                while (true) {
                                    StatusBarNotification statusBarNotification2 = activeNotifications[i2];
                                    long postTime2 = statusBarNotification2.getPostTime();
                                    if (postTime > postTime2) {
                                        statusBarNotification = statusBarNotification2;
                                        postTime = postTime2;
                                    }
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else if (statusBarNotification == null) {
                            return;
                        }
                        if (pxB != null) {
                            pxB.CmG("did_cancel_last_notification", true);
                        }
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("cancel oldest notification {");
                        A1A.append(statusBarNotification.getNotification());
                        oWb.A00("RtcCallNotificationManager", C51967G9n.A0r(A1A, '}'));
                        notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                    }
                }
            }
        } catch (Exception e) {
            C71004OWb.A00.A02("RtcCallNotificationManager", "DeadSystemException while retrieving active notifications", e);
        }
    }
}
