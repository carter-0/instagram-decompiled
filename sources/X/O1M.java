package X;

import android.content.Intent;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class O1M {
    public static void A00(Intent intent, 0lg r48, List list) {
        String stringExtra;
        ArrayList arrayList;
        String str;
        boolean z;
        Long l;
        C62880wX r3 = C61170le.A00;
        18g A01 = C638918c.A01(r3);
        Intent intent2 = intent;
        A01.A0K(intent2, AnonymousClass05K.A01);
        A01.A0O(A01.A02, "NOTIFICATION_CLICK_DETECTED");
        0xm A00 = AnonymousClass0xl.A00(r3);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A00.A00.AR4();
        AR4.E5c("notification_clicked_timestamp", currentTimeMillis);
        AR4.apply();
        String stringExtra2 = intent2.getStringExtra("push_category");
        if (stringExtra2 != null) {
            18g.A05(A01.A02, "push_category", stringExtra2);
        }
        String stringExtra3 = intent2.getStringExtra("recipient_id");
        0lg r24 = r48;
        UserSession A012 = 0Gl.A01(r24);
        if (!(A012 == null || stringExtra3 == null)) {
            Boolean A0l = DbT.A0l(A012.A06.equals(stringExtra3));
            C64331Jv r1 = A01.A05;
            if (r1 != null && r1.A03 == null) {
                r1.A03 = A0l;
            }
        }
        if (intent2.getBooleanExtra("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_IS_FROM_DIRECT_PUSH", false) && A012 != null) {
            0Tu r8 = 0Tu.A05;
            if (182.A06(r8, A012, 36329324472778800L) && !C62860wI.A00.getAndSet(true)) {
                0nY.A00().ATE(new AnonymousClass0ta());
            }
            if (182.A06(r8, A012, 36324033071230659L)) {
                C69241Nhv nhv = new C69241Nhv(14i.A08, A012, IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE);
                nhv.updateExtras(A012);
                boolean A08 = 14i.A08();
                2Hw r10 = nhv.A09;
                if (A08) {
                    l = Long.valueOf(C64031Cc.A08);
                } else {
                    l = null;
                }
                r10.A00 = l;
                2Hm r0 = nhv.A05;
                if (r0 != null && r0.onLoggerStarted(nhv)) {
                    Iterator A0u = AnonymousClass7TF.A0u(nhv.A0A);
                    while (A0u.hasNext()) {
                        nhv.A08(C66582MXn.A0h(A0u));
                    }
                    nhv.A0N();
                }
                nhv.A0H(r10, "app_start_type", C64031Cc.A09.toString());
                nhv.A0L(r10, "is_app_start", A08);
                if (stringExtra3 != null) {
                    nhv.annotateFirstUserIsBackground(!A012.A06.equals(stringExtra3));
                }
                if (stringExtra2 != null) {
                    nhv.annotatePushCategory(stringExtra2);
                }
            }
        }
        if (intent2.getBooleanExtra("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_IS_FROM_DIRECT_PUSH", false) && A012 != null && 182.A06(0Tu.A05, A012, 36326227801486979L)) {
            2DU.A00(A012).A09("NOTIFICATION");
        }
        Uri data = intent2.getData();
        if (OP0.A00(data) != null) {
            stringExtra = OP0.A00(data);
        } else {
            stringExtra = intent2.getStringExtra("recipient_id");
        }
        if (stringExtra != null && (r24 instanceof UserSession)) {
            UserSession userSession = (UserSession) r24;
            if (!userSession.A06.equals(stringExtra) && AnonymousClass0BO.A00(userSession).BNy((String) null).contains(stringExtra)) {
                return;
            }
        }
        if (!intent2.hasExtra("NotificationAnalyticsEventHelper.NOTIFICATION_CLICKED_ALREADY_LOGGED")) {
            intent2.putExtra("NotificationAnalyticsEventHelper.NOTIFICATION_CLICKED_ALREADY_LOGGED", Boolean.TRUE);
            long j = 0;
            long longExtra = intent2.getLongExtra("notification_in_tray_timestamp", 0);
            if (longExtra > 0) {
                j = C51966G9m.A07(longExtra);
            }
            MYV myv = MYV.A01;
            String stringExtra4 = intent2.getStringExtra("from_notification_category");
            PushChannelType A002 = C69823Nsk.A00(intent2.getStringExtra("from_notification_push_channel_type"));
            if (A002 == null) {
                A002 = PushChannelType.A0D;
            }
            String stringExtra5 = intent2.getStringExtra("from_notification_id");
            Long A0d = DbZ.A0d(intent2.getStringExtra("recipient_id"));
            Long A0d2 = DbZ.A0d(intent2.getStringExtra("sender_id"));
            String stringExtra6 = intent2.getStringExtra("com.instagram.android.igns.logging.sender_id");
            String stringExtra7 = intent2.getStringExtra("landing_path");
            Integer num = AnonymousClass05K.A00;
            boolean booleanExtra = intent2.getBooleanExtra("is_e2ee", false);
            Long valueOf = Long.valueOf(intent2.getLongExtra("occamadillo_thread_id", 0));
            String stringExtra8 = intent2.getStringExtra("armadillo_thread_id");
            String stringExtra9 = intent2.getStringExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            long[] longArrayExtra = intent2.getLongArrayExtra("feature_tags");
            if (longArrayExtra != null) {
                arrayList = AnonymousClass7TE.A1C();
                C69500Nmi nmi = C69500Nmi.A04;
                if (03t.A0Q(longArrayExtra, 15)) {
                    arrayList.add(nmi);
                }
            } else {
                arrayList = null;
            }
            String stringExtra10 = intent2.getStringExtra("trace_id");
            String str2 = stringExtra4;
            MYV myv2 = myv;
            myv2.A09(new AnonymousClass6BJ(A002, num, (Long) null, valueOf, A0d, A0d2, stringExtra8, stringExtra4, stringExtra6, stringExtra7, stringExtra5, str2, stringExtra9, (String) null, intent2.getStringExtra("push_infra_notification_id"), intent2.getStringExtra("token_fb_id"), stringExtra10, arrayList, TimeUnit.MILLISECONDS.toSeconds(j), true, false, booleanExtra), list);
            AnonymousClass0xN A003 = C60510iO.A00(r24);
            0xI A004 = MYX.A00(intent2, "notification_clicked", intent2.getStringExtra("recipient_id"));
            A004.A0C("pi", intent2.getStringExtra("from_notification_id"));
            A004.A0C("push_category", intent2.getStringExtra("from_notification_category"));
            A004.A0C("push_channel_type", intent2.getStringExtra("from_notification_push_channel_type"));
            String A005 = AnonymousClass000.A00(2370);
            A004.A09("is_bg_account", Boolean.valueOf(intent2.getBooleanExtra(A005, false)));
            A003.EFq(A004);
            String stringExtra11 = intent2.getStringExtra("landing_path");
            if (stringExtra11 != null) {
                boolean booleanExtra2 = intent2.getBooleanExtra(A005, false);
                boolean booleanExtra3 = intent2.getBooleanExtra("is_instamadillo", false);
                String stringExtra12 = intent2.getStringExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                long[] longArrayExtra2 = intent2.getLongArrayExtra("feature_tags");
                if (longArrayExtra2 != null) {
                    z = 03t.A0Q(longArrayExtra2, 15);
                } else {
                    z = false;
                }
                new AnonymousClass6EB(r24).A04(Boolean.valueOf(booleanExtra3), stringExtra11, "ARMADILLO_NOTIFICATIONS_CLICKED", stringExtra12, booleanExtra2, z);
            }
            String stringExtra13 = intent2.getStringExtra("from_notification_id");
            String stringExtra14 = intent2.getStringExtra("from_notification_category");
            if (A012 != null) {
                if (stringExtra11 != null) {
                    str = DbT.A09(stringExtra11).getQueryParameter("x");
                } else {
                    str = null;
                }
                C304006Bs.A00(A012).A00(stringExtra13, str, stringExtra14, (String) null, (String) null, 14);
                if (1CI.A00(A012)) {
                    2B3.A00((2B3) A012.A01(2B3.class, C69802Az.A00), "NOTIFICATION_CLICKED", stringExtra11, (String) null);
                }
                C49513Ews ews = new C49513Ews(A012);
                if (stringExtra11 != null) {
                    String A006 = AnonymousClass000.A00(1755);
                    if (00l.A0d(stringExtra11, A006, false)) {
                        Uri A03 = 0cp.A03(stringExtra11);
                        String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        Long A0d3 = DbZ.A0d(A03.getQueryParameter(A006));
                        if (!(queryParameter == null || A0d3 == null)) {
                            ((C56037Hrk) ews.A01.getValue()).A01("notification_tap", queryParameter, A0d3.longValue());
                        }
                    }
                }
                new C310306am((AnonymousClass0iw) null, A012, (String) null).A05(stringExtra11, "upcoming_event_reminder_notification_tap");
                0Tu r82 = 0Tu.A05;
                if (182.A06(r82, r24, 36323440365415583L)) {
                    Mf8 mf8 = (Mf8) A012.A01(Mf8.class, new GNG(9, new C73464Pd6(3), A012));
                    String stringExtra15 = intent2.getStringExtra("sender_id");
                    List list2 = mf8.A02;
                    if (list2.size() == 2) {
                        018.A15(list2);
                    }
                    list2.add(new C61070Jw8((Object) Long.valueOf(AnonymousClass7TE.A0P(JTR.A0O(mf8.A03))), (Object) num, (Object) new QP8(stringExtra13, stringExtra3, stringExtra15, stringExtra14), stringExtra11, 2));
                    if (182.A06(r82, mf8.A00, 36323440365481120L)) {
                        C324716zm.A01(new C59721JVf(list2, mf8.A01, 32));
                    }
                }
            }
            if (182.A06(0Tu.A05, r24, 36318209095243768L)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(AnonymousClass000.A00(1622), stringExtra13);
                A1E.put("notification_type", stringExtra14);
                C71342cb.A00(r24).A0N.putAll(A1E);
            }
        }
    }
}
