package com.instagram.direct.realtime.armadilloexpress.plugins.payloadcodecprovider;

import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C70144Nxy;
import X.C71074Oat;
import X.DbZ;
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
import com.mcrypto.MessengerCoreCryptoMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher;
import com.mcrypto.MessengerEncryptedMessagingMCFBridgejniDispatcher;

public final class IGPayloadCodecProviderImplPostmailbox extends Postmailbox {
    public final MsysActiveUserSession msysActiveUserSession;

    public byte[] IGPayloadCodecProviderImpl_MEMPayloadCodecProviderSerializedMsgApplicationCreateFromGroupInviteMessage(AccountContext accountContext, String str, String str2, Number number, String str3) {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGPayloadCodecProviderImplPostmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession2) {
        super(accountSession, msysActiveUserSession2);
        AnonymousClass7TG.A1O(accountSession, msysActiveUserSession2);
        this.msysActiveUserSession = msysActiveUserSession2;
    }

    public boolean IGPayloadCodecProviderImpl_MEMPayloadCodecProviderHandleDecryptedPayload(AccountContext accountContext, XQB xqb, XQD xqd, XQC xqc, Object obj, byte[] bArr, boolean z, XQE xqe, ValueHolder valueHolder, ValueHolder valueHolder2, long j) {
        int i;
        0qQ.A0B(accountContext, 0);
        XQC xqc2 = xqc;
        DbZ.A0t(1, xqb, xqd, xqc2);
        0qQ.A0B(obj, 4);
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr2, 5);
        AnonymousClass7TF.A1G(xqe, 7, valueHolder2);
        NativeHolder MEMDecryptedPayloadContextGetThreadIDNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadIDNative(xqc2.mNativeHolder);
        if (MEMDecryptedPayloadContextGetThreadIDNative == null) {
            throw AnonymousClass7TE.A0y();
        }
        long MEMThreadIDGetTransportIDNative = MessengerEncryptedMessagingCQLModelsMCFBridgejniDispatcher.MEMThreadIDGetTransportIDNative(MEMDecryptedPayloadContextGetThreadIDNative);
        long MCCDeviceJIDGetUserIDInt64ValueNative = MessengerCoreCryptoMCFBridgejniDispatcher.MCCDeviceJIDGetUserIDInt64ValueNative(MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetSenderJIDNative(xqc2.mNativeHolder));
        int MEMDecryptedPayloadContextGetThreadTypeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeNative(xqc2.mNativeHolder);
        long MEMDecryptedPayloadContextGetTimestampInSecNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetTimestampInSecNative(xqc2.mNativeHolder);
        String MEMDecryptedPayloadContextGetMessageIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageIdNative(xqc2.mNativeHolder);
        0qQ.A07(MEMDecryptedPayloadContextGetMessageIdNative);
        String MEMDecryptedPayloadContextGetMessageTraceIdNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetMessageTraceIdNative(xqc2.mNativeHolder);
        Number MEMDecryptedPayloadContextGetPayloadVersionNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetPayloadVersionNative(xqc2.mNativeHolder);
        if (MEMDecryptedPayloadContextGetPayloadVersionNative != null) {
            i = MEMDecryptedPayloadContextGetPayloadVersionNative.intValue();
        } else {
            i = 2;
        }
        int MEMDecryptedPayloadContextGetThreadModeNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadModeNative(xqc2.mNativeHolder);
        int MEMDecryptedPayloadContextGetThreadTypeTagNative = MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetThreadTypeTagNative(xqc2.mNativeHolder);
        UserSession userSession = this.msysActiveUserSession.userSession;
        MessengerEncryptedMessagingMCFBridgejniDispatcher.MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative(xqc2.mNativeHolder);
        long j2 = j;
        if (j != 0) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36318892002843335L)) {
                C70144Nxy.A00(userSession).A01(j2);
                return true;
            }
        }
        return C71074Oat.A01(userSession, MEMDecryptedPayloadContextGetMessageIdNative, MEMDecryptedPayloadContextGetMessageTraceIdNative, bArr2, MEMDecryptedPayloadContextGetThreadModeNative, MEMDecryptedPayloadContextGetThreadTypeNative, MEMDecryptedPayloadContextGetThreadTypeTagNative, i, j2, MEMThreadIDGetTransportIDNative, MCCDeviceJIDGetUserIDInt64ValueNative, MEMDecryptedPayloadContextGetTimestampInSecNative);
    }
}
