package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;

/* renamed from: X.65P  reason: invalid class name */
public final class AnonymousClass65P implements MailboxCallback {
    public final AnonymousClass65R A00;
    public final AnonymousClass65Q A01;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        String str;
        long j;
        String str2;
        Long A002;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        0qQ.A0B(mailboxNullable, 0);
        C301345z0 r4 = (C301345z0) mailboxNullable.value;
        if (r4 != null) {
            C376639It A003 = this.A01.A00();
            r4.mResultSet.getCount();
            AnonymousClass65R r0 = this.A00;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            UserSession userSession = r0.A01;
            String str3 = userSession.A06;
            boolean A02 = C282435Db.A02(str3);
            int count = r4.mResultSet.getCount();
            for (int i = 0; i < count; i++) {
                Long nullableLong = r4.mResultSet.getNullableLong(i, 9);
                Long nullableLong2 = r4.mResultSet.getNullableLong(i, 36);
                C268194cw r9 = new C268194cw(C269474fB.A00);
                r9.A0F("is_vanish_mode", false);
                int integer = r4.mResultSet.getInteger(i, 13);
                AnonymousClass65S r8 = r0.A07;
                String string = r4.mResultSet.getString(i, 18);
                String string2 = r4.mResultSet.getString(i, 17);
                String A022 = AnonymousClass6ED.A02(false, false);
                AnonymousClass65T r2 = r8.A02;
                if (r2.A06 && string != null && r2.A03) {
                    UserFlowLogger userFlowLogger = r2.A05;
                    long j2 = r2.A04;
                    AnonymousClass9J6 r11 = AnonymousClass65T.A0M;
                    userFlowLogger.flowMarkPoint(j2, r11.A01);
                    userFlowLogger.flowAnnotateWithCrucialData(j2, "c", r11.A00);
                }
                AnonymousClass65V r10 = r8.A01;
                if (!(!r10.A01 || string2 == null || (A002 = AnonymousClass65V.A00(r10, string2)) == null)) {
                    long longValue = A002.longValue();
                    UserFlowLogger userFlowLogger2 = r10.A00;
                    AnonymousClass9J6 r13 = AnonymousClass65V.A07;
                    userFlowLogger2.flowMarkPoint(longValue, r13.A01);
                    if (!(A022 == null || A022.length() == 0)) {
                        userFlowLogger2.flowAnnotate(longValue, "feature_tags", A022);
                    }
                    userFlowLogger2.flowAnnotateWithCrucialData(longValue, "c", r13.A00);
                }
                AnonymousClass6EB r112 = r0.A04;
                if (nullableLong != null) {
                    str = nullableLong.toString();
                } else {
                    str = null;
                }
                Integer valueOf = Integer.valueOf(integer);
                String str4 = null;
                r112.A02(r9, (Boolean) null, (Boolean) null, (Boolean) null, valueOf, "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_SYNCED", str, (String) null, (String) null, (String) null, A02);
                if (A003.A00) {
                    String string3 = r4.mResultSet.getString(i, 18);
                    String string4 = r4.mResultSet.getString(i, 17);
                    String str5 = A003.A02;
                    r8.A06(string3, string4, str5, (String) null, false, false);
                    if (nullableLong != null) {
                        str4 = nullableLong.toString();
                    }
                    r112.A02(r9, (Boolean) null, (Boolean) null, (Boolean) null, valueOf, "ARMADILLO_NOTIFICATIONS_SUPPRESSED", str4, str5, (String) null, (String) null, A02);
                }
                Long nullableLong3 = r4.mResultSet.getNullableLong(i, 8);
                Long nullableLong4 = r4.mResultSet.getNullableLong(i, 20);
                String string5 = r4.mResultSet.getString(i, 15);
                int integer2 = r4.mResultSet.getInteger(i, 11);
                if (nullableLong3 == null || (nullableLong == null && !(integer2 == 18 && integer == 10))) {
                    0wb.A04("notification_threadPk_null_or_messagePk_null", "Reding result from not_presented_client_notifications, get null threadPk or messagePk, no further action.", 1);
                } else {
                    arrayList.add(nullableLong3);
                    arrayList2.add(nullableLong);
                    if (nullableLong4 != null) {
                        j = nullableLong4.longValue();
                    } else {
                        j = -1;
                    }
                    arrayList3.add(Long.valueOf(j));
                    arrayList4.add(string5);
                    arrayList5.add(valueOf);
                    r0.A06.A00(string5, String.valueOf(nullableLong), "secure_message", (String) null, "synced notification in non engine path", 1);
                    C3027365b r22 = r0.A05;
                    String obj2 = nullableLong3.toString();
                    String obj3 = PushChannelType.MSYS.toString();
                    0qQ.A0B(obj3, 5);
                    0wc r6 = r22.A00;
                    0Aj A004 = r6.A00(r6.A00, "ig_push_notification_generated");
                    if (A004.isSampled()) {
                        if (14i.A08()) {
                            str2 = AppStateModule.APP_STATE_BACKGROUND;
                        } else {
                            str2 = "foreground";
                        }
                        A004.AAJ("app_state", str2);
                        A004.AAJ(AnonymousClass000.A00(4476), C64031Cc.A09.toString());
                        A004.A7p("is_e2ee", true);
                        A004.AAJ(AnonymousClass000.A00(3825), obj3);
                        A004.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, obj2);
                        A004.A7p(C66579MXk.A00(141), false);
                        A004.AAJ(C66579MXk.A00(1057), string5);
                        A004.AAJ("recipient_id", str3);
                        A004.A7p("is_bg_account", Boolean.valueOf(A02));
                        A004.A9F("occamadillo_thread_id", nullableLong2);
                        A004.Cgf();
                    }
                }
            }
            if ((!arrayList.isEmpty()) && !A003.A00) {
                if (!arrayList2.isEmpty()) {
                    boolean A06 = 182.A06(0Tu.A05, userSession, 36319759578439275L);
                    AnonymousClass67N r82 = r0.A00;
                    AnonymousClass68L ASa = r82.mMailboxApiHandleMetaProvider.ASa(0);
                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
                    int A005 = C3030067a.A00(mailboxFutureImpl);
                    TraceInfo A012 = C3030067a.A01(mailboxFutureImpl, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForNotifications");
                    if (!ASa.EJd(new C22240Xxv(r82, mailboxFutureImpl, arrayList, arrayList2, arrayList4, arrayList5, arrayList3, A005, A06))) {
                        mailboxFutureImpl.cancel(false);
                        C3030067a.A02(A005);
                        C3030067a.A03(A012, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForNotifications");
                    }
                    PlatformLogger.platformEventLog(5);
                    mailboxFutureImpl.addResultCallback(r0.A08, r0.A03);
                }
                AnonymousClass67N r7 = r0.A00;
                AnonymousClass68L ASa2 = r7.mMailboxApiHandleMetaProvider.ASa(0);
                MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(ASa2);
                int A006 = C3030067a.A00(mailboxFutureImpl2);
                TraceInfo A013 = C3030067a.A01(mailboxFutureImpl2, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForGroupInviteNotifications");
                if (!ASa2.EJd(new C22238Xxt(r7, mailboxFutureImpl2, arrayList, arrayList4, A006))) {
                    mailboxFutureImpl2.cancel(false);
                    C3030067a.A02(A006);
                    C3030067a.A03(A013, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagesForGroupInviteNotifications");
                }
                PlatformLogger.platformEventLog(5);
                mailboxFutureImpl2.addResultCallback(r0.A08, r0.A02);
            }
        }
    }

    public AnonymousClass65P(AnonymousClass65N r4, AnonymousClass67N r5, UserSession userSession) {
        AnonymousClass65Q r1 = new AnonymousClass65Q(C61410nE.A00, 1Au.A00(userSession));
        AnonymousClass65R r0 = new AnonymousClass65R(r4, r5, userSession);
        this.A01 = r1;
        this.A00 = r0;
    }
}
