package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4ha  reason: invalid class name and case insensitive filesystem */
public final class C270904ha implements Runnable {
    public final /* synthetic */ 2If A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AtomicInteger A02;
    public final /* synthetic */ AtomicReference A03;

    public C270904ha(2If r1, String str, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        this.A00 = r1;
        this.A02 = atomicInteger;
        this.A03 = atomicReference;
        this.A01 = str;
    }

    public final void run() {
        0bb r12;
        2If r2 = this.A00;
        2Ih[] r0 = 2If.A04;
        UserSession userSession = r2.A01;
        if (userSession != null) {
            this.A02.set(1Au.A00(userSession).A01.getInt("num_unseen_activities", 0));
        }
        int i = this.A02.get();
        AnonymousClass3H4 r11 = (AnonymousClass3H4) this.A03.get();
        if (r11 == null) {
            r11 = new AnonymousClass3H4(new AnonymousClass3H3(0, -1, -1), (List) null, (Map) null);
        }
        AnonymousClass3H3 r5 = r11.A00;
        int i2 = r5.A02;
        int i3 = i2;
        11Z.A05("This operation can't be run on UI thread.");
        if (userSession == null) {
            i3 = 0;
        } else if (!r2.A04()) {
            Context context = r2.A00;
            if (!"com.sec.android.app.launcher".equals(0lz.A01(context)) || !182.A06(0Tu.A05, userSession, 36310667133452521L) || AnonymousClass2MF.A00().A00(context) <= 0) {
                i3 = i2 + i;
            } else {
                i3 = Math.max(1, i2 + i);
            }
        }
        C62880wX r17 = C61170le.A00;
        0xY AR4 = AnonymousClass0xl.A00(r17).A00.AR4();
        AR4.E5Z("optimistic_launcher_badge_count", i3);
        AR4.apply();
        0xY AR42 = AnonymousClass0xl.A00(r17).A00.AR4();
        AR42.E5Z("optimistic_launcher_badge_count_direct", i2);
        AR42.apply();
        0xY AR43 = AnonymousClass0xl.A00(r17).A00.AR4();
        AR43.E5Z("optimistic_launcher_badge_count_unseen_activities", i);
        AR43.apply();
        Context context2 = r2.A00;
        String A012 = 0lz.A01(context2);
        2Ih[] r14 = 2If.A04;
        int i4 = 0;
        do {
            2Ih r9 = r14[i4];
            if (r9.A02(context2, A012)) {
                0xY AR44 = AnonymousClass0xl.A00(r17).A00.AR4();
                AR44.E5T("launcher_badge_supported", true);
                AR44.apply();
                if (r9.A01(context2, i3)) {
                    if (userSession != null) {
                        C275424qG r122 = (C275424qG) userSession.A01(C275424qG.class, new C73660PhZ(userSession, 35));
                        0wc r92 = r122.A00;
                        1Ln r93 = new 1Ln(r92.A00(r92.A00, "instagram_android_badge"), 284);
                        if (r93.A00.isSampled()) {
                            r93.A0M(C271024hm.APP_BADGE, "badge_type");
                            r93.A0M(C271034hn.COUNT_UPDATED, "badge_event");
                            HashMap hashMap = new HashMap();
                            int i5 = r5.A01;
                            if (i5 != -1) {
                                hashMap.put(C271014hl.E2EE, Long.valueOf((long) i5));
                            }
                            int i6 = r5.A00;
                            if (i6 != -1) {
                                hashMap.put(C271014hl.OPEN_MESSAGE, Long.valueOf((long) i6));
                            }
                            r93.A0O("is_device_badge_count_capable", true);
                            r93.A0Q("badge_value_set", Long.valueOf((long) i3));
                            r93.A00.A9H("badge_value_set_map", hashMap);
                            r93.A0Q("unseen_activity_count", Long.valueOf((long) i));
                            r93.A0O("excludes_muted", Boolean.valueOf(r122.A01));
                            List<AnonymousClass5DP> list = r11.A01;
                            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                            for (AnonymousClass5DP r13 : list) {
                                if (r13 instanceof AnonymousClass5HX) {
                                    r12 = new 0bb();
                                    N4E n4e = ((AnonymousClass5HX) r13).A00;
                                    MsysThreadId msysThreadId = (MsysThreadId) n4e.A03;
                                    r12.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(msysThreadId.A00));
                                    r12.A06("v2_id", (String) null);
                                    r12.A03(TraceFieldType.IsSecure, true);
                                    r12.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, msysThreadId.A01.A00);
                                    r12.A01(C69764Nrn.A00(((MsysThreadSubtype) n4e.A04).A00), "thread_sub_type");
                                } else {
                                    C254743sy r142 = r13.A00;
                                    0qQ.A0C(r142, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                                    DirectThreadKey directThreadKey = (DirectThreadKey) r142;
                                    r12 = new 0bb();
                                    r12.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directThreadKey.A00);
                                    r12.A06("v2_id", directThreadKey.A01);
                                    r12.A03(TraceFieldType.IsSecure, Boolean.valueOf(r13.A08));
                                    r12.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C254923tH.DJANGO.A00);
                                }
                                r12.A03("is_muted", Boolean.valueOf(r13.A0A));
                                arrayList.add(r12);
                            }
                            r93.A0Q("unread_threads_count", Long.valueOf((long) arrayList.size()));
                            r93.A0S("unread_threads", arrayList);
                            r93.A0S("unread_notifs", (List) null);
                            r93.A0Q("unread_notifs_count", (Long) null);
                            r93.A0O("was_badge_showing", (Boolean) null);
                            r93.A0Q("current_badge_value_showing", (Long) null);
                            r93.Cgf();
                        }
                        String str = this.A01;
                        if (str != null && str.equals("notification_received")) {
                            AnonymousClass65T r112 = AnonymousClass6ED.A00(userSession).A02;
                            if (r112.A06 && r112.A03) {
                                UserFlowLogger userFlowLogger = r112.A05;
                                long j = r112.A04;
                                AnonymousClass9J6 r94 = AnonymousClass65T.A0H;
                                userFlowLogger.flowMarkPoint(j, r94.A01);
                                if (r112.A00 == 0) {
                                    userFlowLogger.flowAnnotate(j, "badge_count", i3);
                                }
                                userFlowLogger.flowAnnotateWithCrucialData(j, "c", r94.A00);
                            }
                        }
                    }
                    0xY AR45 = AnonymousClass0xl.A00(r17).A00.AR4();
                    AR45.E5Z("launcher_badge_count", i3);
                    AR45.apply();
                    0xY AR46 = AnonymousClass0xl.A00(r17).A00.AR4();
                    AR46.E5Z("launcher_badge_count_direct", i2);
                    AR46.apply();
                    0xm A002 = AnonymousClass0xl.A00(r17);
                    int i7 = r5.A00;
                    0xY AR47 = A002.A00.AR4();
                    AR47.E5Z("open_thread_count_for_launcher_badge", i7);
                    AR47.apply();
                    0xm A003 = AnonymousClass0xl.A00(r17);
                    int i8 = r5.A01;
                    0xY AR48 = A003.A00.AR4();
                    AR48.E5Z("armadillo_thread_count_for_launcher_badge", i8);
                    AR48.apply();
                    if (i3 > 0 && userSession != null) {
                        "ig_launcher_badge".getClass();
                        0xI A013 = 0xI.A01("ig_launcher_badge", (String) null);
                        A013.A0C(C46326Dbu.A01(0, 9, 57), 0jh.A04.A01(userSession).A02(19f.A1s));
                        A013.A0C("launcher_name", A012);
                        A013.A08(Integer.valueOf(i3), "badge_count");
                        C60510iO.A00(userSession).EFq(A013);
                        return;
                    }
                    return;
                }
                return;
            }
            i4++;
        } while (i4 < 9);
        0xY AR49 = AnonymousClass0xl.A00(r17).A00.AR4();
        AR49.E5T("launcher_badge_supported", false);
        AR49.apply();
    }
}
