package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.OyC  reason: case insensitive filesystem */
public final class C72192OyC implements AnonymousClass0lh {
    public 0Jv A00;
    public final Context A01;
    public final UserSession A02;
    public final RealtimeClientManager A03;
    public final O9L A04;
    public final C72187Oxw A05;
    public final OWA A06;
    public final C71841Ori A07;
    public final PLN A08;
    public final C70989OVd A09;
    public final PLL A0A;
    public final PLM A0B;
    public final C70978OTz A0C;
    public final AnonymousClass0eM A0D = C73925Pm5.A00(this, 32);
    public final DevXAgentApi A0E;
    public final O9R A0F;

    public C72192OyC(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        OWA owa = new OWA(context, userSession, C66580MXl.A15(this, 36), C66580MXl.A15(this, 37));
        this.A06 = owa;
        O9L o9l = new O9L(userSession);
        this.A04 = o9l;
        O9R o9r = new O9R();
        this.A0F = o9r;
        RealtimeClientManager instance = RealtimeClientManager.getInstance(userSession);
        this.A03 = instance;
        AnonymousClass38W.A00();
        DevXAgentApi devXAgentApi = AnonymousClass2On.A00;
        this.A0E = devXAgentApi;
        C70989OVd oVd = new C70989OVd(context, devXAgentApi, userSession, instance, owa.A0G, o9l, o9r, owa, owa, this);
        this.A09 = oVd;
        this.A07 = new C71841Ori(userSession);
        C70978OTz oTz = new C70978OTz(context, userSession, o9l, oVd);
        this.A0C = oTz;
        this.A05 = (C72187Oxw) userSession.A01(C72187Oxw.class, C73852Pkp.A00);
        this.A08 = new PLN(userSession, this, oVd, oTz);
        this.A0A = new PLL(oVd);
        this.A0B = new PLM(this, oVd);
        o9r.A00.add(new POT(this));
    }

    public final void A02(Activity activity, C331537Rj r19) {
        0wj r1;
        String str;
        C331537Rj r8 = r19;
        0qQ.A0B(r8, 1);
        C71080Oaz oaz = this.A09.A0K;
        C68160N3a n3a = oaz.A03;
        if (n3a == null) {
            r1 = 0wj.A01;
            str = "Incoming params not present when accepting call";
        } else {
            RtcCallKey rtcCallKey = ((N9J) oaz.A00.A00).A00;
            if (rtcCallKey == null) {
                r1 = 0wj.A01;
                str = "Call key is not present when accepting the call";
            } else if (!rtcCallKey.equals(n3a.A03.A03)) {
                r1 = 0wj.A01;
                str = "Call ID mismatch when accepting call";
            } else {
                if (!A09()) {
                    C70996OVr oVr = C70996OVr.A03;
                    oVr.A00(AnonymousClass05K.A01, !n3a.A09);
                    oVr.A01("product_loading");
                }
                C58699Iw8 iw8 = new C58699Iw8(19, rtcCallKey, r8, this, n3a);
                Activity activity2 = activity;
                SJD sjd = new SJD(activity2, (ViewGroup) AnonymousClass7TE.A0b(C66581MXm.A0A(activity2), 16908290), this.A02, new C70777OKx(activity2), new C72893POd(iw8));
                if (!n3a.A09 || 1DL.A08(sjd.A04.A01, (String[]) Arrays.copyOf(new String[]{"android.permission.RECORD_AUDIO"}, 1))) {
                    C70777OKx oKx = sjd.A04;
                    String[] strArr = C70386O4n.A00;
                    0qQ.A0B(strArr, 0);
                    if (!1DL.A08(oKx.A01, (String[]) Arrays.copyOf(strArr, 2))) {
                        sjd.A02(true);
                        return;
                    } else {
                        iw8.invoke();
                        return;
                    }
                } else {
                    sjd.A01();
                    return;
                }
            }
        }
        DbT.A1Q(r1, str, 245701013);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0182, code lost:
        r0 = r14.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b8, code lost:
        if (r10 == 2) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01be, code lost:
        if (r9 != false) goto L_0x01c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C69465Nm9 r35, X.C69277Nid r36, com.instagram.model.rtc.RtcCallFunnelSessionId r37, com.instagram.model.rtc.RtcCallSource r38, com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.util.List r48, boolean r49, boolean r50) {
        /*
            r34 = this;
            r6 = 0
            r1 = 6
            r7 = r36
            r30 = r48
            r3 = r47
            r0 = r30
            X.C51973G9u.A0s(r1, r7, r3, r0)
            r2 = 9
            r31 = r45
            r33 = r38
            r1 = r31
            r0 = r33
            X.C51969G9p.A1O(r1, r2, r0)
            r9 = r34
            com.instagram.realtimeclient.RealtimeClientManager r1 = r9.A03
            java.lang.String r0 = "RTC_CALL_CONDITION"
            r1.addKeepAliveCondition(r0)
            java.util.List r4 = X.00k.A0X(r3)
            X.OWA r8 = r9.A06
            java.util.Iterator r3 = r4.iterator()
            r5 = 1
            r2 = 1
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)
            X.3mS r0 = r8.A0D
            X.3mU r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x002f
            r2 = 0
            goto L_0x002f
        L_0x0043:
            if (r2 == 0) goto L_0x0094
            com.instagram.common.session.UserSession r3 = r8.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311135284101566(0x8100c9000001be, double:3.0266463946471755E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0094
            X.OGi r10 = r8.A0B
            java.util.Iterator r11 = r4.iterator()
        L_0x005a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r3 = r11.next()
            X.3mS r0 = r10.A04
            X.27c r2 = r0.A01
            X.0qQ.A0B(r3, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.Map r0 = r2.A02     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x008f }
            X.Jw2 r0 = (X.C61064Jw2) r0     // Catch:{ all -> 0x008f }
            r1.unlock()
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r1 == 0) goto L_0x005a
            java.util.Map r0 = r10.A01
            r0.put(r3, r1)
            goto L_0x005a
        L_0x008f:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x0094:
            int r0 = r4.size()
            if (r0 != r5) goto L_0x00c7
            com.instagram.common.session.UserSession r3 = r8.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310319240380430(0x81000b0001000e, double:3.026130325311985E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00c7
            X.OGi r3 = r8.A0B
            java.lang.Object r1 = r4.get(r6)
            X.0qQ.A0B(r1, r6)
            java.util.Map r0 = r3.A02
            java.lang.String r2 = X.DbT.A11(r1, r0)
            if (r2 == 0) goto L_0x00c7
            java.lang.String r1 = (java.lang.String) r1
            java.util.ArrayList r1 = X.C66581MXm.A0z(r1)
            X.N2S r0 = new X.N2S
            r0.<init>(r2, r1)
            r3.A00 = r0
        L_0x00c7:
            java.util.Set r0 = r8.A0K
            r0.clear()
            r0.addAll(r4)
            r15 = r49
            java.lang.Integer r22 = X.JTP.A0j(r15)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r0 = r33
            X.7Rj r0 = r0.A01
            java.lang.String r3 = r0.A00
            X.Nid r2 = X.C69277Nid.NO_E2EE
            boolean r29 = X.C51969G9p.A1a(r7, r2)
            r1 = 0
            java.lang.String r24 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            r28 = r44
            r27 = r43
            r18 = r37
            r17 = r35
            r11 = r39
            r32 = r40
            r26 = r42
            r25 = r32
            r16 = r8
            r19 = r1
            r20 = r11
            r21 = r10
            r23 = r3
            java.lang.String r8 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.0qQ.A0B(r8, r5)
            X.OWb r13 = X.C71004OWb.A00
            java.lang.String r14 = "logStartCallQplStep threadId: "
            java.lang.String r12 = ", waterfallId: "
            r0 = r32
            java.lang.String r12 = X.002.A0u(r14, r0, r12, r8)
            java.lang.String r0 = "RtcCallAnalyticsManager"
            r13.A00(r0, r12)
            X.OVd r14 = r9.A09
            X.Oaz r13 = r14.A0K
            r9 = 0
            r28 = r49 ^ 1
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.N3Z r0 = new X.N3Z
            r24 = r46
            r27 = r50
            r22 = r41
            r16 = r0
            r17 = r7
            r18 = r33
            r19 = r11
            r20 = r12
            r21 = r32
            r23 = r31
            r25 = r4
            r26 = r30
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r13.A02 = r1
            r13.A04 = r1
            r13.A06 = r6
            r13.A02 = r0
            X.Nid r0 = r0.A00
            if (r0 == r2) goto L_0x0152
            r6 = 1
        L_0x0152:
            r13.A06 = r6
            X.N4R r0 = r13.A00
            java.lang.Object r0 = r0.A00
            X.N9J r0 = (X.N9J) r0
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x016d
            X.N9J r6 = new X.N9J
            r6.<init>(r1, r10, r12)
            X.N4R r0 = new X.N4R
            r0.<init>((X.N9J) r6, (java.lang.Integer) r10)
            X.C71080Oaz.A02(r0, r13)
        L_0x016d:
            if (r39 == 0) goto L_0x0180
            X.NfE r0 = r14.A0R
            X.05G r10 = r0.A0F
            r6 = 11
            X.Jw8 r0 = new X.Jw8
            r0.<init>((com.facebook.rsys.mediasync.gen.MediaSyncState) r1, (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r11, (java.lang.String) r1, (int) r6)
            X.0qQ.A0B(r10, r9)
            r10.FIA(r0)
        L_0x0180:
            if (r7 == r2) goto L_0x0193
            X.OVL r0 = r14.A0D
            X.3U9 r1 = X.OVL.A00(r0)
            if (r1 == 0) goto L_0x0193
            com.instagram.common.session.UserSession r0 = r0.A01
            boolean r0 = X.O0N.A00(r0, r1)
            if (r0 == 0) goto L_0x0193
            r9 = 1
        L_0x0193:
            X.Odx r6 = r14.A0Z
            r0 = 2
            X.DbW.A1N(r8, r0, r3)
            X.OKu r1 = r6.A0J
            boolean r0 = X.Xm7.A00
            r1.A00(r5, r15, r0)
            boolean r23 = X.C51969G9p.A1a(r7, r2)
            com.instagram.common.session.UserSession r5 = r6.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36600646144626624(0x82081800000fc0, double:3.209734228609886E-306)
            long r10 = X.182.A01(r2, r5, r0)
            if (r23 != 0) goto L_0x01ba
            r1 = 2
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x01c0
        L_0x01ba:
            r2 = 1
            if (r23 == 0) goto L_0x01c0
            r1 = 1
            if (r9 == 0) goto L_0x01c1
        L_0x01c0:
            r1 = 0
        L_0x01c1:
            X.Pn0 r0 = new X.Pn0
            r16 = r0
            r17 = r6
            r18 = r32
            r19 = r22
            r20 = r3
            r21 = r8
            r22 = r4
            r24 = r9
            r25 = r15
            r26 = r27
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.C71143Odx.A06(r6, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72192OyC.A03(X.Nm9, X.Nid, com.instagram.model.rtc.RtcCallFunnelSessionId, com.instagram.model.rtc.RtcCallSource, com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean):void");
    }

    public final void A04(C69277Nid nid, C69278Nie nie, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallKey rtcCallKey, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3) {
        C69277Nid nid2 = nid;
        C69278Nie nie2 = nie;
        String str7 = str;
        C51973G9u.A0r(0, str7, nid2, nie2);
        RtcCallKey rtcCallKey2 = rtcCallKey;
        String str8 = str4;
        AnonymousClass7TF.A1G(str8, 7, rtcCallKey2);
        List list2 = list;
        String str9 = str5;
        C51969G9p.A1O(str9, 11, list2);
        this.A03.addKeepAliveCondition("RTC_CALL_CONDITION");
        boolean z4 = z3;
        Integer A0j = JTP.A0j(z4 ? 1 : 0);
        OWA owa = this.A06;
        Integer num = AnonymousClass05K.A01;
        C69277Nid nid3 = C69277Nid.NO_E2EE;
        boolean A1a = C51969G9p.A1a(nid2, nid3);
        String A0b = AnonymousClass7TF.A0b();
        new String();
        String str10 = str9;
        String A012 = owa.A01((C69465Nm9) null, rtcCallFunnelSessionId, rtcCallKey2, (RtcStartCoWatchPlaybackArguments) null, num, A0j, str10, A0b, str7, str2, str3, (String) null, A1a);
        C70989OVd oVd = this.A09;
        C71080Oaz oaz = oVd.A0K;
        C69277Nid nid4 = nid2;
        C69278Nie nie3 = nie2;
        RtcCallKey rtcCallKey3 = rtcCallKey2;
        Integer num2 = num;
        String str11 = str7;
        C68162N3c n3c = new C68162N3c(nid4, nie3, rtcCallKey3, num2, str11, str6, str9, A012, str8, list2, z, z2, z4);
        oaz.A02 = null;
        oaz.A04 = null;
        boolean z5 = false;
        oaz.A06 = false;
        oaz.A04 = n3c;
        if (n3c.A00 != nid3) {
            z5 = true;
        }
        oaz.A06 = z5;
        if (!((N9J) oaz.A00.A00).A00()) {
            RtcCallKey rtcCallKey4 = n3c.A02;
            Integer num3 = AnonymousClass05K.A0C;
            C71080Oaz.A02(new N4R(new N9J(rtcCallKey4, num3, num), AnonymousClass05K.A00), oaz);
        }
        oVd.A0Q.A01.invoke();
    }

    public final void A05(RtcCallKey rtcCallKey, String str) {
        Object obj;
        CallApi callApi;
        0qQ.A0B(rtcCallKey, 0);
        C71143Odx odx = this.A09.A0Z;
        C71004OWb.A00.A00("RtcRsysInteractor", AnonymousClass7TG.A0m(rtcCallKey, "declineIncomingCall callKey: ", AnonymousClass7TE.A1A()));
        Iterator it = odx.A0S.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((NCZ) obj).A01.A05, rtcCallKey)) {
                break;
            }
        }
        NCZ ncz = (NCZ) obj;
        if (ncz != null && (callApi = ncz.A01.A02) != null) {
            callApi.removeWhenEnded();
            callApi.end(0, str, true);
        }
    }

    public final boolean A0A(RtcCallKey rtcCallKey) {
        0qQ.A0B(rtcCallKey, 0);
        C71143Odx odx = this.A09.A0Z;
        C71004OWb.A00.A00("RtcRsysInteractor", AnonymousClass7TG.A0m(rtcCallKey, "hasClient callKey: ", AnonymousClass7TE.A1A()));
        Set<NCZ> set = odx.A0S;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (NCZ ncz : set) {
                if (0qQ.A0K(ncz.A01.A05, rtcCallKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AudioModule A00() {
        C71143Odx odx = this.A09.A0Z;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C71143Odx.A06(odx, new C74180PqM(countDownLatch, 8), false, false);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            C71004OWb.A00.A02("RtcRsysInteractor", "Exception while initiating RTC Call Manager", e);
        }
        return odx.A03;
    }

    public final void A01(int i, boolean z) {
        RtcCallKey rtcCallKey;
        C71143Odx odx = this.A09.A0Z;
        C71004OWb oWb = C71004OWb.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("leaveCall removeAfterLeave: ");
        A1A.append(z);
        A1A.append(" callKey: ");
        NCZ ncz = odx.A06;
        if (ncz != null) {
            rtcCallKey = ncz.A01.A05;
        } else {
            rtcCallKey = null;
        }
        A1A.append(rtcCallKey);
        oWb.A00("RtcRsysInteractor", C51967G9n.A0r(A1A, ' '));
        C71143Odx.A04(odx, new C73940PmK(odx, i, z));
    }

    public final void A06(RtcCreateCallArgs rtcCreateCallArgs) {
        RtcCreateCallArgs rtcCreateCallArgs2 = rtcCreateCallArgs;
        RtcCallSource rtcCallSource = rtcCreateCallArgs2.A05;
        RtcThreadKey rtcThreadKey = rtcCallSource.A02;
        DirectThreadKey directThreadKey = rtcThreadKey.A00;
        String str = directThreadKey.A00;
        if (str == null) {
            str = "";
        }
        String str2 = directThreadKey.A01;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = rtcThreadKey.A04;
        String str4 = rtcThreadKey.A01;
        String str5 = rtcThreadKey.A03;
        RtcCallAudience rtcCallAudience = rtcCreateCallArgs2.A03;
        C69465Nm9 nm9 = rtcCreateCallArgs2.A01;
        C69277Nid nid = rtcCreateCallArgs2.A02;
        List list = rtcCallAudience.A05;
        List list2 = rtcCallAudience.A04;
        String str6 = rtcCallAudience.A01;
        String A0o = JTP.A0o(rtcCallAudience.A00);
        boolean z = rtcCreateCallArgs2.A0B;
        boolean z2 = rtcCreateCallArgs2.A0A;
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = rtcCreateCallArgs2.A07;
        A03(nm9, nid, rtcCreateCallArgs2.A04, rtcCallSource, rtcStartCoWatchPlaybackArguments, str, str2, str3, str4, str5, str6, A0o, list, list2, z, z2);
    }

    public final void A07(String str) {
        0wj r1;
        String str2;
        C71080Oaz oaz = this.A09.A0K;
        C68160N3a n3a = oaz.A03;
        if (n3a == null) {
            r1 = 0wj.A01;
            str2 = "Incoming params not present when declining call";
        } else {
            RtcCallKey rtcCallKey = ((N9J) oaz.A00.A00).A00;
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = n3a.A03;
            if (!0qQ.A0K(rtcCallKey, rtcCallConnectionEntity.A03)) {
                r1 = 0wj.A01;
                str2 = "Call ID mismatch when declining call";
            } else {
                new 1Fs(this.A01).A00.cancel(n3a.A07, n3a.A00);
                RtcCallKey rtcCallKey2 = rtcCallConnectionEntity.A03;
                if (A0A(rtcCallKey2)) {
                    A05(rtcCallKey2, str);
                }
                ((C70818OMn) this.A0D.getValue()).A00(rtcCallConnectionEntity, 002.A0R("[CallManager]", str), C74148Ppp.A00);
                if (((N9J) oaz.A00.A00).A01 == AnonymousClass05K.A01) {
                    oaz.A03();
                    return;
                }
                return;
            }
        }
        DbT.A1Q(r1, str2, 245701013);
    }

    public final void A08(String str) {
        if (str == null) {
            DbT.A1Q(0wj.A01, "Rtc message not present when declining live", 245701013);
        } else {
            ((C70818OMn) this.A0D.getValue()).A01(str, (String) null, "[CallManager] decline_live", C74149Ppq.A00);
        }
    }

    public final boolean A09() {
        return ((N9J) this.A09.A0K.A00.A00).A00();
    }

    public final void onSessionWillEnd() {
        C71841Ori ori = this.A07;
        C242853Wg.A00(ori.A01).A00(ori);
        ori.A00 = null;
    }
}
