package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.facebook.assistant.stella.ipc.common.request.IpcRequest;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mci.AccountSession;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient$runIpcRequest$1$1$onSuccess$1;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient$runIpcRequestAsFlow$1$1$onSuccess$1;
import com.instagram.direct.stella.api.IStellaDirectMessagingService;
import com.instagram.realtimeclient.RealtimeConstants;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OrO  reason: case insensitive filesystem */
public final class C71821OrO implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71821OrO(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void onFailure(Throwable th) {
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(th, 0);
                OZN ozn = (OZN) this.A03;
                ScheduledExecutorService scheduledExecutorService = OZN.A08;
                0KC.A0F("MwaIpcServiceClient", "runIpcRequest error: instrumentation interface failure", th);
                Integer num = AnonymousClass05K.A0Q;
                if (th instanceof UnsupportedOperationException) {
                    num = AnonymousClass05K.A0P;
                    synchronized (ozn.A06) {
                        ozn.A02 = false;
                        ozn.A01 = new Object();
                    }
                }
                IpcRequest ipcRequest = (IpcRequest) this.A01;
                C68378NEe nEe = ipcRequest.A00;
                String A0m = AnonymousClass7TG.A0m(th, "RunIpcRequest error: ", AnonymousClass7TE.A1A());
                if (31 - num.intValue() != 0) {
                    str = "failed_ipc_transport";
                } else {
                    str = "ipc_service_not_bound";
                }
                nEe.A07(str, A0m, false);
                ((1K2) this.A02).setException(th);
                OZN.A00(ipcRequest, ozn);
                return;
            case 1:
                0qQ.A0B(th, 0);
                0KC.A0O("MultiInstanceSingleBackgroundAccountSyncHandler", C273654mx.A00(1271), new Object[]{th.getMessage()});
                return;
            case 4:
                ((1K2) this.A01).set(OZH.A00(C69370NkA.SEND_MESSAGE_OPERATION_FAILED));
                C282285Cm.A00((UserSession) this.A03).A00();
                return;
            case 5:
                return;
            default:
                0qQ.A0B(th, 0);
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                C66583MXo.A1I(stellaIpcDirectMessagingServiceClient.userSession, AnonymousClass05K.A0Y, th);
                stellaIpcDirectMessagingServiceClient.onRequestFinished();
                return;
        }
    }

    public final void onSuccess(Object obj) {
        IpcRequest ipcRequest;
        OZN ozn;
        String str;
        ImmutableMap immutableMap;
        int A032;
        Parcel obtain;
        Parcel obtain2;
        C70529OAd oAd;
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient;
        String str2;
        String EHH;
        1K2 r2;
        String str3;
        String str4;
        C69370NkA nkA;
        AccountSession accountSession;
        AccountSession accountSession2;
        switch (this.A00) {
            case 0:
                boolean z = true;
                char c = 3;
                try {
                    ozn = (OZN) this.A03;
                    ScheduledExecutorService scheduledExecutorService = OZN.A08;
                    ipcRequest = (IpcRequest) this.A01;
                    C68378NEe nEe = ipcRequest.A00;
                    nEe.A04("execution_start");
                    if (obj != null) {
                        SmartGlassesTunnelInterface$Stub$Proxy smartGlassesTunnelInterface$Stub$Proxy = (SmartGlassesTunnelInterface$Stub$Proxy) obj;
                        0qQ.A0B(smartGlassesTunnelInterface$Stub$Proxy, 0);
                        JSONObject A11 = DbS.A11();
                        boolean z2 = ipcRequest instanceof C68380NEg;
                        if (z2) {
                            str = "contact_updates";
                        } else {
                            str = "call_state_updates";
                        }
                        A11.put("action", str);
                        ImmutableMap immutableMap2 = ipcRequest.A01;
                        if (immutableMap2 != null) {
                            JSONObject A112 = DbS.A11();
                            Iterator it = immutableMap2.entrySet().iterator();
                            while (it.hasNext()) {
                                C66584MXp.A18(it, A112);
                            }
                            A11.put("header", A112);
                        }
                        if (z2) {
                            immutableMap = ((C68380NEg) ipcRequest).A00;
                        } else {
                            immutableMap = ((NEh) ipcRequest).A00;
                        }
                        if (immutableMap != null) {
                            JSONObject A113 = DbS.A11();
                            Iterator it2 = immutableMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                C66584MXp.A18(it2, A113);
                            }
                            A11.put("payload", A113);
                        }
                        String A10 = DbT.A10(A11);
                        A032 = AnonymousClass0fD.A03(975034657);
                        obtain = Parcel.obtain();
                        obtain2 = Parcel.obtain();
                        obtain.writeInterfaceToken("com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface");
                        obtain.writeString(A10);
                        smartGlassesTunnelInterface$Stub$Proxy.A00.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        String readString = obtain2.readString();
                        obtain2.recycle();
                        obtain.recycle();
                        AnonymousClass0fD.A0A(1930552472, A032);
                        0qQ.A07(readString);
                        try {
                            JSONObject A17 = C66580MXl.A17(readString);
                            N1L n1l = (N1L) ipcRequest;
                            if (A17.optBoolean(RealtimeConstants.SEND_SUCCESS, false)) {
                                Object A0E = C268554db.A02().A0E(A17.optString("result"), n1l.A00);
                                0qQ.A07(A0E);
                                oAd = new C70529OAd((OKB) null, A0E);
                            } else {
                                oAd = new C70529OAd(new OKB(A17.getInt(TraceFieldType.ErrorCode), A17.optString("error_message")), (Object) null);
                            }
                            if (oAd.A01 != null) {
                                c = 2;
                            } else {
                                OKB okb = oAd.A00;
                                if (okb != null) {
                                    nEe.A07("failed_ipc_response", 002.A07(okb.A00, "Received error IPC response: ", okb.A01, " Code: "), true);
                                    c = 3376;
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            }
                            ((SettableFuture) this.A02).set(oAd);
                        } catch (Throwable th) {
                            th = th;
                            c = 3376;
                            try {
                                ipcRequest = (IpcRequest) this.A01;
                                C68378NEe nEe2 = ipcRequest.A00;
                                String A0m = AnonymousClass7TG.A0m(th, "Error executing IPC action: ", AnonymousClass7TE.A1A());
                                if (c != 3376) {
                                    z = false;
                                }
                                nEe2.A07("failed_ipc_transport", A0m, z);
                                ozn = (OZN) this.A03;
                                ScheduledExecutorService scheduledExecutorService2 = OZN.A08;
                                0KC.A0F("MwaIpcServiceClient", "Error while executing ipc action", th);
                                ((SettableFuture) this.A02).setException(th);
                                OZN.A00(ipcRequest, ozn);
                                return;
                            } catch (Throwable th2) {
                                OZN.A00((IpcRequest) this.A01, (OZN) this.A03);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                OZN.A00(ipcRequest, ozn);
                return;
            case 1:
                if (obj != null && !obj.equals(C301055yO.A05)) {
                    C71068Oan oan = (C71068Oan) this.A03;
                    MessageSyncService messageSyncService = (MessageSyncService) this.A01;
                    if (oan.A0J.get()) {
                        return;
                    }
                    if (DbX.A1Z(2HM.A00(oan.A0C.A01).A18)) {
                        if (oan.A04 == null) {
                            synchronized (messageSyncService) {
                                accountSession2 = messageSyncService.mAccountSession;
                            }
                            oan.A04 = new C3023662u(accountSession2);
                        }
                        synchronized (messageSyncService) {
                            accountSession = messageSyncService.mAccountSession;
                        }
                        C69685Nq7.A00(new C3023662u(accountSession), new TY5(oan, 26));
                        return;
                    }
                    oan.A07 = false;
                    return;
                }
                return;
            case 2:
                IStellaDirectMessagingService iStellaDirectMessagingService = (IStellaDirectMessagingService) obj;
                try {
                    String A022 = ((ONU) this.A01).A02();
                    if (iStellaDirectMessagingService != null) {
                        str2 = iStellaDirectMessagingService.EHH(A022);
                    } else {
                        str2 = null;
                    }
                    ((SettableFuture) this.A02).set(str2);
                    stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                    if (!(stellaIpcDirectMessagingServiceClient.context == null || iStellaDirectMessagingService == null)) {
                        iStellaDirectMessagingService.EBT(new StellaIpcDirectMessagingServiceClient$runIpcRequest$1$1$onSuccess$1(stellaIpcDirectMessagingServiceClient));
                        break;
                    }
                } catch (RemoteException e) {
                    stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                    C66583MXo.A1I(stellaIpcDirectMessagingServiceClient.userSession, AnonymousClass05K.A0N, e);
                    break;
                }
            case 3:
                IStellaDirectMessagingService iStellaDirectMessagingService2 = (IStellaDirectMessagingService) obj;
                try {
                    String A023 = ((ONU) this.A01).A02();
                    if (!(iStellaDirectMessagingService2 == null || (EHH = iStellaDirectMessagingService2.EHH(A023)) == null)) {
                        ((05G) this.A02).Epw(EHH);
                    }
                    stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                    if (!(stellaIpcDirectMessagingServiceClient.context == null || iStellaDirectMessagingService2 == null)) {
                        iStellaDirectMessagingService2.EBT(new StellaIpcDirectMessagingServiceClient$runIpcRequestAsFlow$1$1$onSuccess$1(stellaIpcDirectMessagingServiceClient, (05G) this.A02));
                        break;
                    }
                } catch (RemoteException e2) {
                    stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A03;
                    C66583MXo.A1I(stellaIpcDirectMessagingServiceClient.userSession, AnonymousClass05K.A0N, e2);
                    break;
                } catch (Throwable th4) {
                    ((StellaIpcDirectMessagingServiceClient) this.A03).onRequestFinished();
                    throw th4;
                }
            case 4:
                0eP r13 = (0eP) obj;
                if (r13 == null) {
                    str4 = null;
                } else if (AnonymousClass7TE.A1a(r13.A00)) {
                    String str5 = ((BBV) this.A02).A00;
                    r2 = (1K2) this.A01;
                    JSONObject A114 = DbS.A11();
                    try {
                        A114.put(RealtimeConstants.SEND_SUCCESS, true);
                        if (str5 != null) {
                            A114.putOpt("result", str5);
                        }
                    } catch (JSONException e3) {
                        C66583MXo.A1U(e3);
                    }
                    str3 = DbT.A10(A114);
                    r2.set(str3);
                    C282285Cm.A00((UserSession) this.A03).A00();
                    return;
                } else {
                    str4 = (String) r13.A01;
                }
                boolean A04 = C71115Od8.A04(str4);
                r2 = (1K2) this.A01;
                if (A04) {
                    nkA = C69370NkA.SEND_MESSAGE_LIMIT_EXCEED;
                } else {
                    nkA = C69370NkA.SEND_MESSAGE_OPERATION_FAILED;
                }
                str3 = OZH.A00(nkA);
                r2.set(str3);
                C282285Cm.A00((UserSession) this.A03).A00();
                return;
            default:
                ((View) this.A02).setVisibility(8);
                ((View) this.A01).setVisibility(8);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A03;
                clipsEditMetadataController.A0R = true;
                1Xj r0 = clipsEditMetadataController.A0D;
                if (r0 != null) {
                    r0.A0C.ER6((C272054k1) null);
                }
                clipsEditMetadataController.A0J().requestFocus();
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
        }
        stellaIpcDirectMessagingServiceClient.onRequestFinished();
    }
}
