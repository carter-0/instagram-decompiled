package com.instagram.direct.realtime.armadilloexpress.plugins.payloadcodecprovider;

import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass7TE;
import X.C51973G9u;
import X.C70144Nxy;
import X.C71074Oat;
import X.XQB;
import X.XQC;
import X.XQD;
import X.XQE;
import com.facebook.mcrypto.mcc.AccountContext;
import com.facebook.msys.mci.AccountSession;
import com.facebook.simplejni.NativeHolder;
import com.facebook.valueholder.ValueHolder;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.mcftypeholder.McfTypeHolder;
import com.mcrypto.MessengerCoreCryptoMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingMCFBridgejniDispatcher;

public abstract class Postmailbox {
    public MsysActiveUserSession mAppContext;
    public AccountSession mPluginContext;

    public void IGPayloadCodecProviderImplExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract boolean IGPayloadCodecProviderImpl_MEMPayloadCodecProviderHandleDecryptedPayload(AccountContext accountContext, XQB xqb, XQD xqd, XQC xqc, Object obj, byte[] bArr, boolean z, XQE xqe, ValueHolder valueHolder, ValueHolder valueHolder2, long j);

    public abstract byte[] IGPayloadCodecProviderImpl_MEMPayloadCodecProviderSerializedMsgApplicationCreateFromGroupInviteMessage(AccountContext accountContext, String str, String str2, Number number, String str3);

    public Postmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession) {
        this.mPluginContext = accountSession;
        this.mAppContext = msysActiveUserSession;
    }

    private byte[] IGPayloadCodecProviderImpl_MEMPayloadCodecProviderSerializedMsgApplicationCreateFromGroupInviteMessageJNI(AccountContext accountContext, String str, String str2, Number number, String str3) {
        return null;
    }

    private boolean IGPayloadCodecProviderImpl_MEMPayloadCodecProviderHandleDecryptedPayloadJNI(AccountContext accountContext, NativeHolder nativeHolder, NativeHolder nativeHolder2, NativeHolder nativeHolder3, Object obj, byte[] bArr, boolean z, NativeHolder nativeHolder4, ValueHolder valueHolder, ValueHolder valueHolder2, long j) {
        int i;
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        IGPayloadCodecProviderImplPostmailbox iGPayloadCodecProviderImplPostmailbox = (IGPayloadCodecProviderImplPostmailbox) this;
        byte[] bArr2 = bArr;
        C51973G9u.A0r(0, accountContext, obj, bArr2);
        0qQ.A0B(valueHolder2, 9);
        NativeHolder MEMDecryptedPayloadContextGetThreadIDNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadIDNative(nativeHolder3);
        if (MEMDecryptedPayloadContextGetThreadIDNative == null) {
            throw AnonymousClass7TE.A0y();
        }
        long MEMThreadIDGetTransportIDNative = MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher.MEMThreadIDGetTransportIDNative(MEMDecryptedPayloadContextGetThreadIDNative);
        long MCCDeviceJIDGetUserIDInt64ValueNative = MessengerCoreCryptoMCFBridgejniDispatcher.MCCDeviceJIDGetUserIDInt64ValueNative(MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetSenderJIDNative(nativeHolder3));
        int MEMDecryptedPayloadContextGetThreadTypeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeNative(nativeHolder3);
        long MEMDecryptedPayloadContextGetTimestampInSecNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetTimestampInSecNative(nativeHolder3);
        String MEMDecryptedPayloadContextGetMessageIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageIdNative(nativeHolder3);
        0qQ.A07(MEMDecryptedPayloadContextGetMessageIdNative);
        String MEMDecryptedPayloadContextGetMessageTraceIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageTraceIdNative(nativeHolder3);
        Number MEMDecryptedPayloadContextGetPayloadVersionNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetPayloadVersionNative(nativeHolder3);
        if (MEMDecryptedPayloadContextGetPayloadVersionNative != null) {
            i = MEMDecryptedPayloadContextGetPayloadVersionNative.intValue();
        } else {
            i = 2;
        }
        int MEMDecryptedPayloadContextGetThreadModeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadModeNative(nativeHolder3);
        int MEMDecryptedPayloadContextGetThreadTypeTagNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeTagNative(nativeHolder3);
        UserSession userSession = iGPayloadCodecProviderImplPostmailbox.msysActiveUserSession.userSession;
        MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative(nativeHolder3);
        long j2 = j;
        if (j != 0) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36318892002843335L)) {
                C70144Nxy.A00(userSession).A01(j2);
                return true;
            }
        }
        C71074Oat.A01(userSession, MEMDecryptedPayloadContextGetMessageIdNative, MEMDecryptedPayloadContextGetMessageTraceIdNative, bArr2, MEMDecryptedPayloadContextGetThreadModeNative, MEMDecryptedPayloadContextGetThreadTypeNative, MEMDecryptedPayloadContextGetThreadTypeTagNative, i, j2, MEMThreadIDGetTransportIDNative, MCCDeviceJIDGetUserIDInt64ValueNative, MEMDecryptedPayloadContextGetTimestampInSecNative);
        return true;
    }
}
