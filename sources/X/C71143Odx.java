package X;

import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.cryptocontextfactory.gen.CryptoContextFactory;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;

/* renamed from: X.Odx  reason: case insensitive filesystem */
public final class C71143Odx {
    public static boolean A0a;
    public Mailbox A00;
    public Mailbox A01;
    public AccountSession A02;
    public AudioModule A03;
    public C340307l3 A04;
    public C70585OCi A05;
    public NCZ A06;
    public C18014Vjq A07;
    public OAP A08;
    public AudioPipelineContext A09;
    public final Context A0A;
    public final CallManagerCallClientCallbacks A0B = new C68363NCc(this);
    public final CallManagerClient A0C = new C68366NCh(this);
    public final DevXAgentApi A0D;
    public final AnonymousClass1JW A0E;
    public final AR0 A0F;
    public final 02m A0G;
    public final UserSession A0H;
    public final RealtimeClientManager A0I;
    public final C70774OKu A0J;
    public final OVF A0K;
    public final OWA A0L;
    public final O9Y A0M;
    public final C47278Du6 A0N;
    public final C39870ACr A0O;
    public final OAA A0P;
    public final OK8 A0Q;
    public final Map A0R;
    public final Set A0S;
    public final AnonymousClass0eM A0T = AnonymousClass0eN.A00(0eO.A02, C73847Pkk.A00);
    public final AnonymousClass0eM A0U;
    public final C62320sa A0V;
    public final 0sP A0W;
    public final C262224Cq A0X;
    public final AnonymousClass0r6 A0Y;
    public final 0V2 A0Z;

    public static final boolean A07(NCZ ncz, C71143Odx odx) {
        Integer num;
        EngineModel engineModel;
        if (ncz != null) {
            N4R n4r = (N4R) C66583MXo.A0h(odx.A0Z);
            if (n4r == null || (engineModel = (EngineModel) n4r.A00) == null) {
                num = null;
            } else {
                int i = engineModel.state;
                num = Integer.valueOf(i);
                if (num != null && (i == 4 || i == 0)) {
                    C71004OWb.A00.A00("RtcRsysInteractor", "Current call is ended or idle, clearing it now.");
                    odx.A08(ncz);
                    return true;
                }
            }
            C71004OWb.A00.A00("RtcRsysInteractor", AnonymousClass7TG.A0m(num, "Current call not eligible to remove. currentState=", AnonymousClass7TE.A1A()));
        }
        return false;
    }

    public final void A09(C71743Oq3 oq3, String str) {
        NCZ ncz = this.A06;
        if (ncz != null) {
            C70586OCj oCj = new C70586OCj(ncz, str);
            EglBase.Context context = OU3.A0m;
            C67679MsF msF = oq3.A01;
            if (msF == null) {
                AnonymousClass0eM r2 = oq3.A0A;
                msF = new C67679MsF(AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(r2)), C71743Oq3.A0B);
                oq3.A01 = msF;
                C71743Oq3.A00(oq3);
                C66583MXo.A0C(r2).addView(msF);
                C74362Ptc ptc = oq3.A02;
                if (ptc != null) {
                    oq3.A02 = ptc;
                    C67679MsF msF2 = oq3.A01;
                    if (msF2 != null) {
                        msF2.setVideoSizeChangeListener(ptc);
                    }
                }
                msF.setFirstFrameRendered(oq3.A03);
            }
            C67679MsF.A01(msF, context);
            oq3.A00 = oCj;
            VideoRenderApi videoRenderApi = oCj.A00.A01.A0D.A00;
            0JA.A03(videoRenderApi, "VideoRenderProxy setApi must be called");
            videoRenderApi.setRenderTarget(oCj.A01, msF, new StreamInfo(1, (String) null));
        }
    }

    public /* synthetic */ C71143Odx(Context context, DevXAgentApi devXAgentApi, AR0 ar0, UserSession userSession, RealtimeClientManager realtimeClientManager, OWA owa, O9Y o9y, C62320sa r12, 0sP r13, C262224Cq r14) {
        OK8 ok8 = new OK8(userSession);
        OVF ovf = new OVF(userSession);
        C40207AVx aVx = new C40207AVx(userSession);
        this.A0A = context;
        this.A0H = userSession;
        this.A0L = owa;
        this.A0F = ar0;
        this.A0V = r12;
        this.A0M = o9y;
        this.A0I = realtimeClientManager;
        this.A0X = r14;
        this.A0W = r13;
        this.A0D = devXAgentApi;
        this.A0Q = ok8;
        this.A0K = ovf;
        this.A0E = aVx;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 1, 0);
        this.A0Z = A012;
        this.A0Y = A012;
        this.A0P = new OAA(userSession);
        this.A0N = new C47278Du6(context, userSession);
        this.A0S = DbS.A0y();
        this.A0O = new C39870ACr();
        this.A0U = C73925Pm5.A00(this, 25);
        this.A0G = 02m.A0p;
        this.A0J = new C70774OKu();
        this.A0R = AnonymousClass7TE.A1H();
        ContextUtils.initialize(context.getApplicationContext());
        C71743Oq3.A0B = userSession;
    }

    public static final N4R A00(Mailbox mailbox, AccountSession accountSession, CryptoContextHolder cryptoContextHolder, C71143Odx odx) {
        String str;
        C71004OWb oWb = C71004OWb.A00;
        oWb.A00("RtcRsysInteractor", "createCallComponents");
        C70996OVr oVr = C70996OVr.A03;
        oVr.A01("engine_init_start");
        C71143Odx odx2 = odx;
        Context context = odx2.A0A;
        02m r1 = odx2.A0G;
        0qQ.A06(r1);
        UserSession userSession = odx2.A0H;
        Xm7.A00(context, r1, C70320O1y.A00(userSession));
        if (!A0a) {
            A0a = true;
            C300335wx.A00();
        }
        UserSession userSession2 = odx2.A0P.A00;
        0Tu r11 = 0Tu.A05;
        int i = 9;
        if (182.A06(r11, userSession2, 36319677974060600L)) {
            i = 25;
        }
        if (182.A06(r11, userSession2, 2342166677212638575L)) {
            i |= 32;
        }
        C71769OqV oqV = (C71769OqV) userSession.A01(C71769OqV.class, C73925Pm5.A01(userSession, 26));
        0qQ.A0B(oqV, 1);
        OverlayConfigManagerHolder createOverlayConfigManager = IGRTCCallManager.CProxy.createOverlayConfigManager(i, oqV);
        0qQ.A07(createOverlayConfigManager);
        if (182.A06(r11, userSession, 2342161102344820592L)) {
            C47278Du6 du6 = odx2.A0N;
            AudioPipelineContext audioPipelineContext = new AudioPipelineContext((byte[]) null, (McfReference) null, (McfReference) null, (McfReference) null, (McfReference) null, du6.copyValue(16), du6.copyValue(12));
            odx2.A09 = audioPipelineContext;
            odx2.A03 = AudioModule.CProxy.createImp(audioPipelineContext, createOverlayConfigManager);
        }
        odx2.A01 = mailbox;
        odx2.A02 = accountSession;
        Long BST = AnonymousClass7TF.A0Q(userSession).BST();
        if (BST != null) {
            str = BST.toString();
        } else {
            str = null;
        }
        IGRTCSignalingCoordinator createSignalingCoordinator = IGRTCSignalingCoordinator.CProxy.createSignalingCoordinator(userSession.A06, str, new C69144NfT(odx2), (McfReference) null, i);
        0qQ.A07(createSignalingCoordinator);
        C69143NfR nfR = new C69143NfR(odx2);
        C7855Qbe qbe = new C7855Qbe();
        C7854Qbc qbc = new C7854Qbc(context, DbW.A0J(userSession, "IGRTCEngine"), new C12075SmU(new S1R(userSession)));
        C15174UTz uTz = new C15174UTz(userSession);
        CallManagerClient callManagerClient = odx2.A0C;
        CallManagerCallClientCallbacks callManagerCallClientCallbacks = odx2.A0B;
        XAnalyticsHolder CGv = odx2.A0E.CGv();
        0qQ.A07(CGv);
        N4R n4r = new N4R(new OEP(callManagerCallClientCallbacks, callManagerClient, cryptoContextHolder, odx2.A0D, qbc, qbe, createOverlayConfigManager, uTz, CGv, createSignalingCoordinator, nfR, str, (Map) odx2.A0V.invoke()), createSignalingCoordinator);
        oVr.A01("engine_init_end");
        oWb.A00("RtcRsysInteractor", "createCallComponents end");
        return n4r;
    }

    public static void A02(C71143Odx odx, Object obj, int i) {
        A04(odx, new C74180PqM(obj, i));
    }

    public static final void A03(C71143Odx odx, 0sP r6) {
        UserSession userSession = odx.A0H;
        AccountSession A022 = C300345wy.A02(userSession, !userSession.A07());
        AnonymousClass6E1 r0 = AnonymousClass6E0.A01;
        C59104J6m j6m = new C59104J6m(24, (Object) r6, (Object) A022, (Object) odx);
        0qQ.A0B(A022, 1);
        Long BST = AnonymousClass7TF.A0Q(userSession).BST();
        if (BST == null) {
            AnonymousClass6E1.A00(new C74186PqS(24, (Object) j6m, (Object) A022), userSession);
            return;
        }
        CryptoContextHolder createContextHolderWithAccountSession = CryptoContextFactory.CProxy.createContextHolderWithAccountSession(BST.longValue(), A022);
        0qQ.A07(createContextHolderWithAccountSession);
        j6m.invoke(createContextHolderWithAccountSession);
    }

    public static final void A04(C71143Odx odx, 0sP r3) {
        NCZ ncz = odx.A06;
        if (ncz != null) {
            try {
                ncz.A01.A0g.execute(new C73257PZb(ncz, r3));
            } catch (RejectedExecutionException e) {
                0KC.A0J("RtcCallClient", "Call client rejected execution", e);
            }
        }
    }

    public static final void A05(C71143Odx odx, 0sP r5) {
        OVF ovf = odx.A0K;
        if (182.A06(0Tu.A05, ovf.A01, 36323668000124284L)) {
            N4R n4r = ovf.A00;
            if (n4r != null) {
                0nY.A00().ATE(new NSA(n4r, r5));
                return;
            }
            return;
        }
        ExecutorService executorService = ovf.A02;
        if (!executorService.isShutdown() && !executorService.isTerminated()) {
            try {
                N4R n4r2 = ovf.A00;
                if (n4r2 != null) {
                    executorService.execute(new C73258PZc(n4r2, r5));
                }
            } catch (RejectedExecutionException e) {
                0KC.A0J("RtcCallComponentsExecutor", "Operation execution rejected", e);
            }
        }
    }

    public static final void A06(C71143Odx odx, 0sP r8, boolean z, boolean z2) {
        OVF ovf;
        int i;
        1aU r2;
        0sP j6m;
        UserSession userSession = odx.A0H;
        if (!2HM.A00(userSession).A02()) {
            ovf = odx.A0K;
            i = 0;
        } else {
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36322375214835842L)) {
                if (z) {
                    if (!userSession.A07()) {
                        1as.A04.A0F(userSession, "RtcRsysInteractor");
                        r2 = AnonymousClass6AN.A02(userSession, AnonymousClass61K.RTC_CALL_START, !userSession.A07()).A00();
                        j6m = new GN2(19, odx, r8, z2);
                    } else {
                        return;
                    }
                }
                ovf = odx.A0K;
                i = 1;
            } else {
                if (z || 182.A06(r5, userSession, 36321645069084273L)) {
                    C70996OVr oVr = C70996OVr.A03;
                    oVr.A01("engine_init_and_connect_msys_e2ee_start");
                    1aD A002 = 1aD.A00(userSession, AnonymousClass61K.RTC_CALL_START);
                    0qQ.A07(A002);
                    if (182.A06(r5, userSession, 36318892003498701L) && !userSession.A07()) {
                        1as.A04.A0F(userSession, "RtcRsysInteractor");
                    }
                    oVr.A01("engine_init_and_connect_msys_e2ee_mailbox_init_start");
                    r2 = A002.A02;
                    0qQ.A07(r2);
                    j6m = new C59104J6m(26, (Object) A002, (Object) r8, (Object) odx);
                }
                ovf = odx.A0K;
                i = 1;
            }
            A01(r2, j6m);
            return;
        }
        ovf.A01(new C73574Pg4(odx, i), r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.NCZ r6) {
        /*
            r5 = this;
            X.OWb r4 = X.C71004OWb.A00
            java.lang.String r3 = "finishCall localCallId: "
            X.NCZ r0 = r5.A06
            r2 = 0
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r0.A0A
        L_0x000b:
            r0 = 32
            java.lang.String r1 = X.002.A0S(r3, r1, r0)
            java.lang.String r0 = "RtcRsysInteractor"
            r4.A00(r0, r1)
            if (r6 != 0) goto L_0x003f
            X.Pph r0 = X.C74140Pph.A00
            A04(r5, r0)
        L_0x001d:
            X.NCZ r0 = r5.A06
            if (r0 == 0) goto L_0x0025
            X.OU3 r0 = r0.A01
            com.instagram.model.rtc.RtcCallKey r2 = r0.A05
        L_0x0025:
            X.O9Y r0 = r5.A0M
            X.OVd r0 = r0.A00
            X.Oaz r1 = r0.A0K
            X.N4R r0 = r1.A00
            java.lang.Object r0 = r0.A00
            X.N9J r0 = (X.N9J) r0
            if (r2 == 0) goto L_0x003e
            com.instagram.model.rtc.RtcCallKey r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x003e
            r1.A03()
        L_0x003e:
            return
        L_0x003f:
            X.OU3 r1 = r6.A01
            com.facebook.rsys.callmanager.callclient.gen.CallEndedApi r0 = r1.A01
            if (r0 == 0) goto L_0x0048
            r0.removeCall()
        L_0x0048:
            com.instagram.model.rtc.RtcCallKey r0 = r1.A05
            if (r0 == 0) goto L_0x001d
            r2 = r0
            goto L_0x0025
        L_0x004e:
            r1 = r2
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71143Odx.A08(X.NCZ):void");
    }

    public final void A0A(C62320sa r3) {
        NCn A002;
        NCZ ncz = this.A06;
        if (ncz != null && (A002 = NCZ.A00(ncz)) != null && !A002.isCameraCurrentlyFacingFront() && A002.isSwitchCameraFacingSupported()) {
            A04(this, C74146Ppn.A00);
            r3.invoke();
        }
    }

    public final void A0B(boolean z) {
        A04(this, new C58736Iwj(23, this, z));
    }

    public static final void A01(1aU r4, 0sP r5) {
        1a8 A0O2 = C66580MXl.A0O();
        A0O2.A02(r4.A0H(), new PU9(22, r5, A0O2));
    }
}
