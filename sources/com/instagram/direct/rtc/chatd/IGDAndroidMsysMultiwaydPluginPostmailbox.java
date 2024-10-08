package com.instagram.direct.rtc.chatd;

import X.00k;
import X.0KC;
import X.0qQ;
import X.0sn;
import X.182;
import X.1X8;
import X.AnonymousClass38W;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C71092OcE;
import X.C74562PxB;
import X.DbS;
import X.O26;
import X.OWY;
import android.content.Context;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer;
import com.facebook.rsys.transport.gen.SendMessageStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rtc.chatd.utils.JavaCppHelper;
import com.facebook.wamsys.wcc.TransferStats;
import com.facebook.wamsys.wcc.XMPPStats;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import com.facebook.wamsys.wcp.MultiwaySendResult;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import java.util.ArrayList;
import java.util.List;

public final class IGDAndroidMsysMultiwaydPluginPostmailbox extends Postmailbox {
    public final JavaCppHelper javaCppHelper;

    public boolean IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMHandleInMultiwaySessionedNotification(MultiwayNotificationResult multiwayNotificationResult) {
        int i;
        int intValue;
        XMPPStats xmppStats;
        0qQ.A0B(multiwayNotificationResult, 0);
        byte[] data = multiwayNotificationResult.getData();
        TransferStats incomingStats = multiwayNotificationResult.getIncomingStats();
        if (incomingStats == null || (xmppStats = incomingStats.getXmppStats()) == null) {
            i = 0;
        } else {
            i = xmppStats.getEncryptedBytes();
        }
        if (data == null) {
            return true;
        }
        1X8 A00 = AnonymousClass38W.A00();
        UserSession userSession = this.mAppContext.userSession;
        1X8 r5 = A00;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36317496131065021L)) {
            r5.A05.A0F(userSession, data, 21, i);
            return true;
        }
        Context context = r5.A00;
        C71092OcE ocE = new C71092OcE(new OWY(context).A03(data), (String) null);
        Integer A03 = ocE.A03();
        if (A03 != null && A03.intValue() == 5) {
            r5.A00(context, userSession).A08(ocE);
        }
        Integer A032 = ocE.A03();
        if (A032 != null && ((intValue = A032.intValue()) == 5 || intValue == 4)) {
            C74562PxB ExK = O26.A00(userSession).A01.ExK();
            ExK.CmF("notification_source", "CHATD");
            r5.A05.A0E(ExK, userSession, ocE, 21);
        }
        r5.A00(context, userSession).A0B(data, 21, i, false);
        return true;
    }

    public void IGDAndroidMsysMultiwaydPluginPostmailboxImpl_MEMMultiwayMessageSessionedHandler(MultiwaySendResult multiwaySendResult, Object obj) {
        long j;
        int i;
        XMPPStats xmppStats;
        MultiwaySendResult multiwaySendResult2 = multiwaySendResult;
        0qQ.A0B(multiwaySendResult2, 0);
        MsysError error = multiwaySendResult2.getError();
        TransferStats outgoingStats = multiwaySendResult2.getOutgoingStats();
        if (outgoingStats == null || (xmppStats = outgoingStats.getXmppStats()) == null) {
            j = 0;
        } else {
            j = (long) xmppStats.getEncryptedBytes();
        }
        Object obj2 = obj;
        if (obj != null) {
            List convertUserData = convertUserData(obj2);
            if (AnonymousClass7TE.A1b(convertUserData)) {
                boolean z = false;
                Object obj3 = convertUserData.get(0);
                0qQ.A0C(obj3, "null cannot be cast to non-null type com.facebook.rsys.chatdtransportsender.gen.ChatDPublishDataContainer");
                ChatDPublishDataContainer chatDPublishDataContainer = (ChatDPublishDataContainer) obj3;
                SignalingTransportCallbackExt signalingTransportCallbackExt = chatDPublishDataContainer.extCallbacks;
                if (signalingTransportCallbackExt != null) {
                    if (error != null) {
                        i = error.getCode();
                    } else {
                        i = 0;
                    }
                    if (error == null) {
                        z = true;
                    }
                    signalingTransportCallbackExt.sendCompleteCallbackExt(new SendMessageStats(1, j, 0, 0, z, i, (String) null, 21));
                }
                SignalingTransportCallback signalingTransportCallback = chatDPublishDataContainer.callbacks;
                if (signalingTransportCallback == null) {
                    return;
                }
                if (error == null) {
                    signalingTransportCallback.sendSuccessCallback();
                } else {
                    signalingTransportCallback.sendFailureCallback();
                }
            } else {
                0KC.A0C("IGDAndroidMsysMultiwaydPlugin", "MEMMultiwayMessageSessionedHandler: Failed to parse userdata");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.rtc.chatd.utils.JavaCppHelper] */
    public IGDAndroidMsysMultiwaydPluginPostmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession) {
        this(accountSession, msysActiveUserSession, new Object());
    }

    private final List convertUserData(Object obj) {
        if (obj instanceof McfReference) {
            ArrayList convertPackedParamsToArrayList = this.javaCppHelper.convertPackedParamsToArrayList((McfReference) obj);
            0qQ.A0A(convertPackedParamsToArrayList);
            return convertPackedParamsToArrayList;
        } else if (obj instanceof ArrayList) {
            return 00k.A0a((Iterable) obj);
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Could not convert user data of type: ");
            0KC.A0C("IGDAndroidMsysMultiwaydPlugin", AnonymousClass7TF.A0i(DbS.A0z(obj.getClass()), A1A));
            return 0sn.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGDAndroidMsysMultiwaydPluginPostmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession, JavaCppHelper javaCppHelper2) {
        super(accountSession, msysActiveUserSession);
        0qQ.A0B(javaCppHelper2, 3);
        this.javaCppHelper = javaCppHelper2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.facebook.rtc.chatd.utils.JavaCppHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.facebook.rtc.chatd.utils.JavaCppHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.facebook.rtc.chatd.utils.JavaCppHelper} */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IGDAndroidMsysMultiwaydPluginPostmailbox(com.facebook.msys.mci.AccountSession r2, com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r3, com.facebook.rtc.chatd.utils.JavaCppHelper r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r1 = this;
            r0 = r5 & 4
            if (r0 == 0) goto L_0x0009
            com.facebook.rtc.chatd.utils.JavaCppHelper r4 = new com.facebook.rtc.chatd.utils.JavaCppHelper
            r4.<init>()
        L_0x0009:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.rtc.chatd.IGDAndroidMsysMultiwaydPluginPostmailbox.<init>(com.facebook.msys.mci.AccountSession, com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession, com.facebook.rtc.chatd.utils.JavaCppHelper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
