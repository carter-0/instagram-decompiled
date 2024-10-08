package X;

import android.content.Context;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.calltag.gen.CallTagApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;
import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import java.util.concurrent.ExecutorService;
import org.webrtc.EglBase;

public final class OU3 {
    public static final EglBase.Context A0m;
    public AppstateApi A00;
    public CallEndedApi A01;
    public CallApi A02;
    public CallTagApi A03;
    public HdVideoApi A04;
    public RtcCallKey A05;
    public boolean A06;
    public final Context A07;
    public final NDK A08;
    public final NCR A09;
    public final AudioModule A0A;
    public final DevXAgentCallConfig A0B;
    public final ExternalCallProxy A0C;
    public final NDu A0D;
    public final UserSession A0E;
    public final C70774OKu A0F;
    public final OK2 A0G;
    public final C68368NCs A0H;
    public final NDM A0I;
    public final NCW A0J;
    public final NDB A0K;
    public final NDE A0L;
    public final NDI A0M;
    public final NDP A0N;
    public final XNW A0O;
    public final C7856Qbg A0P;
    public final NDW A0Q;
    public final NDY A0R;
    public final NDr A0S;
    public final NDx A0T;
    public final C54023Gy7 A0U;
    public final NDg A0V;
    public final O9Y A0W;
    public final NCn A0X;
    public final C68367NCq A0Y;
    public final NCu A0Z;
    public final OAA A0a;
    public final IGRTCSyncedClockHolder A0b;
    public final OZU A0c;
    public final NDl A0d;
    public final Integer A0e;
    public final String A0f;
    public final ExecutorService A0g;
    public final AnonymousClass0eM A0h = C73925Pm5.A00(this, 23);
    public final 0sP A0i;
    public final 0sL A0j;
    public final boolean A0k;
    public final boolean A0l;

    static {
        EglBase.Context eglBaseContext = EglBase.CC.create().getEglBaseContext();
        0qQ.A07(eglBaseContext);
        A0m = eglBaseContext;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: X.NDx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.NDx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: X.NDx} */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.NDu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.PwZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [X.NCs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Object, X.NDM] */
    /* JADX WARNING: type inference failed for: r0v27, types: [X.NDI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v28, types: [X.NDB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.NDP] */
    /* JADX WARNING: type inference failed for: r0v33, types: [X.NDW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v37, types: [X.NDY, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v38, types: [X.Gy7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.OFW, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OU3(android.content.Context r22, X.NDK r23, com.facebook.rsys.audiomodule.gen.AudioModule r24, com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig r25, X.AR0 r26, com.instagram.common.session.UserSession r27, X.C70774OKu r28, X.O27 r29, X.O9Y r30, X.NCn r31, X.OAA r32, com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder r33, java.lang.Integer r34, java.lang.String r35, X.0sP r36, X.0sP r37, X.0sL r38, boolean r39, boolean r40) {
        /*
            r21 = this;
            r4 = 3
            r2 = 4
            r3 = r21
            r3.<init>()
            r10 = r35
            r3.A0f = r10
            r6 = r22
            r3.A07 = r6
            r8 = r27
            r3.A0E = r8
            r0 = r31
            r3.A0X = r0
            r0 = r33
            r3.A0b = r0
            r0 = r32
            r3.A0a = r0
            r5 = r30
            r3.A0W = r5
            r0 = r38
            r3.A0j = r0
            r0 = r37
            r3.A0i = r0
            r0 = r34
            r3.A0e = r0
            r0 = r28
            r3.A0F = r0
            r0 = r24
            r3.A0A = r0
            r0 = r39
            r3.A0l = r0
            r0 = r40
            r3.A0k = r0
            r0 = r23
            r3.A08 = r0
            r0 = r25
            r3.A0B = r0
            r0 = 23
            X.0t0 r0 = X.C73925Pm5.A00(r3, r0)
            r3.A0h = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            X.0qQ.A07(r0)
            r3.A0g = r0
            X.NDu r0 = new X.NDu
            r0.<init>()
            r3.A0D = r0
            X.PqM r1 = new X.PqM
            r1.<init>(r3, r2)
            X.NCu r0 = new X.NCu
            r0.<init>(r6, r1)
            r3.A0Z = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313106674091754(0x810294000006ea, double:3.027893109615121E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0164
            X.NDx r0 = new X.NDx
            r0.<init>()
        L_0x007d:
            r3.A0T = r0
            r14 = 0
            r0 = 36315730899111415(0x8104f700000df7, double:3.02955268008446E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0158
            X.ND0 r1 = new X.ND0
            r1.<init>(r6)
        L_0x0090:
            r3.A0C = r1
            X.NDE r0 = new X.NDE
            r0.<init>(r5)
            r3.A0L = r0
            X.NCs r0 = new X.NCs
            r0.<init>()
            r3.A0H = r0
            X.NDM r0 = new X.NDM
            r0.<init>()
            r3.A0I = r0
            X.NDI r0 = new X.NDI
            r0.<init>()
            r3.A0M = r0
            X.NDB r0 = new X.NDB
            r0.<init>()
            r3.A0K = r0
            X.NDP r0 = new X.NDP
            r0.<init>()
            r3.A0N = r0
            X.NDr r0 = new X.NDr
            r1 = r26
            r0.<init>(r1, r8, r5)
            r3.A0S = r0
            X.XNW r0 = new X.XNW
            r0.<init>(r6, r8)
            r3.A0O = r0
            X.Qbg r0 = new X.Qbg
            r0.<init>()
            r3.A0P = r0
            X.NDW r0 = new X.NDW
            r0.<init>()
            r3.A0Q = r0
            X.NCq r0 = new X.NCq
            r0.<init>(r8)
            r3.A0Y = r0
            X.NCW r0 = new X.NCW
            r0.<init>(r5)
            r3.A0J = r0
            org.webrtc.EglBase$Context r20 = A0m
            com.facebook.rsys.audiomodule.gen.AudioModule r0 = r3.A0A
            X.OZU r15 = new X.OZU
            r16 = r6
            r18 = r8
            r19 = r5
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            r3.A0c = r15
            X.NDY r0 = new X.NDY
            r0.<init>()
            r3.A0R = r0
            X.Gy7 r0 = new X.Gy7
            r0.<init>()
            r3.A0U = r0
            X.OFW r1 = new X.OFW
            r1.<init>()
            X.NDg r0 = new X.NDg
            r0.<init>(r8, r1)
            r3.A0V = r0
            X.NDl r0 = new X.NDl
            r0.<init>(r6, r8)
            r3.A0d = r0
            r0 = 22
            r1 = r36
            X.Pm5 r13 = X.C73925Pm5.A01(r1, r0)
            r0 = 268542022(0x1001a046, float:2.5564234E-29)
            X.0na r11 = new X.0na
            r11.<init>(r0, r4, r14, r14)
            r12 = 0
            X.OqM r7 = new X.OqM
            r7.<init>(r3)
            r9 = r29
            X.NCR r5 = X.C73470PdC.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3.A09 = r5
            X.OK2 r4 = new X.OK2
            r4.<init>(r3)
            r3.A0G = r4
            com.facebook.rtc.platform.client.sharedcontextholder.EglContextHolder.eglBaseContext = r20
            r0 = 36313609185265833(0x810309000008a9, double:3.0282108997050583E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0157
            X.ODF r0 = r5.A09
            X.OOE r0 = r0.A00
            X.04u r0 = r0.A03
            r0.add(r4)
        L_0x0157:
            return
        L_0x0158:
            X.Oqm r0 = new X.Oqm
            r0.<init>()
            X.ND1 r1 = new X.ND1
            r1.<init>(r6, r0)
            goto L_0x0090
        L_0x0164:
            r0 = 0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OU3.<init>(android.content.Context, X.NDK, com.facebook.rsys.audiomodule.gen.AudioModule, com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig, X.AR0, com.instagram.common.session.UserSession, X.OKu, X.O27, X.O9Y, X.NCn, X.OAA, com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder, java.lang.Integer, java.lang.String, X.0sP, X.0sP, X.0sL, boolean, boolean):void");
    }
}
