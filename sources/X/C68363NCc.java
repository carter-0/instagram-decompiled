package X;

import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;
import java.util.Set;
import java.util.Timer;

/* renamed from: X.NCc  reason: case insensitive filesystem */
public final class C68363NCc extends CallManagerCallClientCallbacks {
    public final /* synthetic */ C71143Odx A00;

    public final void onCallAdded(CallClient callClient) {
        0qQ.A0B(callClient, 0);
        C71143Odx odx = this.A00;
        C70585OCi oCi = odx.A05;
        if (oCi != null && C51971G9r.A1a(callClient, oCi.A00)) {
            odx.A05 = null;
        } else if (callClient instanceof NCZ) {
            Set set = odx.A0S;
            NCZ ncz = (NCZ) callClient;
            if (set.add(ncz)) {
                C71004OWb.A00.A00("RtcRsysInteractor", 002.A0O("CallClient Added, total: ", set.size()));
            }
            NCZ ncz2 = odx.A06;
            if (ncz2 == null || (!0qQ.A0K(ncz2.A0A, ncz.A0A) && C71143Odx.A07(odx.A06, odx))) {
                odx.A06 = ncz;
            }
        } else {
            throw DbT.A0m();
        }
    }

    public final void onCallRemoved(CallClient callClient) {
        0qQ.A0B(callClient, 0);
        if (callClient instanceof NCZ) {
            C71143Odx odx = this.A00;
            Set set = odx.A0S;
            set.remove(callClient);
            C71004OWb.A00.A00("RtcRsysInteractor", 002.A0O("CallClient Removed, total: ", set.size()));
            if (0qQ.A0K(odx.A06, callClient)) {
                odx.A06 = null;
            }
            OU3 ou3 = ((NCZ) callClient).A01;
            if (182.A06(0Tu.A05, ou3.A0E, 36313609185265833L)) {
                NCR ncr = ou3.A09;
                OK2 ok2 = ou3.A0G;
                0qQ.A0B(ok2, 0);
                ncr.A09.A00.A03.remove(ok2);
            }
            C7856Qbg qbg = ou3.A0P;
            if (qbg.A00 != null) {
                1IC.A01.remove(qbg);
                qbg.A00 = null;
            }
            ou3.A0g.shutdown();
            ou3.A0Z.A00 = null;
            ou3.A09.A01 = null;
            NDl nDl = ou3.A0d;
            OET oet = nDl.A01;
            if (oet != null) {
                IgRadioTsLoggerEngine igRadioTsLoggerEngine = oet.A00;
                if (igRadioTsLoggerEngine != null) {
                    igRadioTsLoggerEngine.stop();
                }
                Timer timer = oet.A01;
                timer.cancel();
                timer.purge();
            }
            nDl.A01 = null;
            nDl.A00 = null;
            ou3.A0O.stop();
        }
    }

    public C68363NCc(C71143Odx odx) {
        this.A00 = odx;
    }

    /* JADX WARNING: type inference failed for: r23v1, types: [X.O27, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.facebook.rsys.callmanager.callclient.gen.CallClient] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r2 != 0) goto L_0x0075;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.rsys.callmanager.callclient.gen.CallClient createCallClient(java.lang.String r37, com.facebook.rsys.callmanager.gen.UserContext r38, com.facebook.rsys.callcontext.gen.CallContext r39) {
        /*
            r36 = this;
            r8 = r37
            r0 = r38
            r2 = r39
            X.AnonymousClass7TG.A1T(r8, r0, r2)
            r0 = r36
            X.Odx r7 = r0.A00
            X.OKu r6 = r7.A0J
            java.lang.Long r0 = r6.A00
            if (r0 == 0) goto L_0x0020
            long r0 = r0.longValue()
            r6.A01 = r8
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r4 = r6.A02
            java.lang.String r3 = "client_init_start"
            r4.flowMarkPoint(r0, r3)
        L_0x0020:
            java.util.HashSet r1 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.getCallingTags(r2)
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = "threads_hangouts"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0116
            java.lang.Integer r28 = X.AnonymousClass05K.A00
        L_0x0030:
            java.util.HashSet r1 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.getCallingTags(r2)
            r5 = 1
            if (r1 == 0) goto L_0x0113
            java.lang.String r0 = "e2ee"
            boolean r0 = r1.contains(r0)
            if (r0 != r5) goto L_0x0113
        L_0x003f:
            boolean r34 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.getIsMetaAiCall(r2)
            java.util.HashSet r1 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.getCallingTags(r2)
            r4 = 1
            if (r1 == 0) goto L_0x0110
            java.lang.String r0 = "creator_ai_embodiment"
            boolean r0 = r1.contains(r0)
            if (r0 != r4) goto L_0x0110
        L_0x0052:
            X.0rm r3 = X.C51965G9l.A11()
            r1 = 6
            X.PqM r0 = new X.PqM
            r0.<init>(r3, r1)
            X.C71143Odx.A05(r7, r0)
            X.OCi r0 = r7.A05
            if (r0 == 0) goto L_0x008f
            X.0sK r1 = r0.A01
            java.lang.Object r0 = r3.A00
            com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig r0 = (com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig) r0
            if (r0 == 0) goto L_0x008d
            com.facebook.rsys.audio.gen.AudioProxy r0 = r0.audioProxy
        L_0x006d:
            java.lang.Object r2 = r1.invoke(r8, r2, r0)
            com.facebook.rsys.callmanager.callclient.gen.CallClient r2 = (com.facebook.rsys.callmanager.callclient.gen.CallClient) r2
            if (r2 == 0) goto L_0x008f
        L_0x0075:
            java.lang.Long r0 = r6.A00
            if (r0 == 0) goto L_0x008c
            long r3 = r0.longValue()
            java.lang.String r0 = r6.A01
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x008c
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r6.A02
            java.lang.String r0 = "client_init_end"
            r1.flowMarkPoint(r3, r0)
        L_0x008c:
            return r2
        L_0x008d:
            r0 = 0
            goto L_0x006d
        L_0x008f:
            X.NCZ r2 = new X.NCZ
            X.AR0 r0 = r7.A0F
            r19 = r0
            android.content.Context r15 = r7.A0A
            com.instagram.common.session.UserSession r14 = r7.A0H
            org.webrtc.EglBase$Context r24 = X.OU3.A0m
            X.7l3 r1 = r7.A04
            X.OAP r0 = r7.A08
            X.O9Y r13 = r7.A0M
            X.AuC r16 = new X.AuC
            r17 = r15
            r18 = r1
            r20 = r14
            r21 = r13
            r22 = r0
            r23 = r8
            r25 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.NCn r25 = r16.invoke()
            X.0eM r0 = r7.A0U
            java.lang.Object r10 = r0.getValue()
            com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder r10 = (com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder) r10
            r0 = 7
            X.Pgi r9 = new X.Pgi
            r9.<init>(r7, r0)
            r1 = 35
            X.PgU r30 = X.C66580MXl.A14(r7, r1)
            X.OAA r12 = r7.A0P
            X.PqM r1 = new X.PqM
            r1.<init>(r7, r0)
            X.O27 r23 = new X.O27
            r23.<init>()
            com.facebook.msys.mca.Mailbox r11 = r7.A00
            com.facebook.rsys.audiomodule.gen.AudioModule r0 = r7.A03
            if (r4 == 0) goto L_0x010e
            X.0eM r7 = r7.A0T
            java.lang.Object r7 = r7.getValue()
            X.NDK r7 = (X.NDK) r7
        L_0x00e6:
            java.lang.Object r3 = r3.A00
            com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig r3 = (com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig) r3
            r26 = r12
            r27 = r10
            r29 = r8
            r31 = r1
            r32 = r9
            r33 = r5
            r35 = r4
            r20 = r19
            r21 = r14
            r22 = r6
            r24 = r13
            r16 = r11
            r17 = r7
            r18 = r0
            r19 = r3
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0075
        L_0x010e:
            r7 = 0
            goto L_0x00e6
        L_0x0110:
            r4 = 0
            goto L_0x0052
        L_0x0113:
            r5 = 0
            goto L_0x003f
        L_0x0116:
            java.lang.Integer r28 = X.AnonymousClass05K.A01
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68363NCc.createCallClient(java.lang.String, com.facebook.rsys.callmanager.gen.UserContext, com.facebook.rsys.callcontext.gen.CallContext):com.facebook.rsys.callmanager.callclient.gen.CallClient");
    }
}
