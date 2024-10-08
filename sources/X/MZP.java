package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.armadillo.IGSecureMessageCryptoProvider;
import com.instagram.direct.msys.armadillo.IGSecureMessageMasterKeyProvider;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.function.Consumer;

public final class MZP implements Consumer {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1aD A01;
    public final /* synthetic */ 2I1 A02;
    public final /* synthetic */ IGFOAMessagingReadyLogger A03;

    public MZP(UserSession userSession, 1aD r2, 2I1 r3, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger) {
        this.A02 = r3;
        this.A03 = iGFOAMessagingReadyLogger;
        this.A01 = r2;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, com.instagram.direct.msys.armadillo.IGSecureMessageMasterKeyProvider] */
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        2I1 r5 = this.A02;
        r5.A04("secure_message_crypto_callback_start");
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = this.A03;
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogSecureMessageCryptoCallbackStart();
        }
        AnonymousClass68G r7 = this.A01.A04;
        if (r7.A03) {
            UserSession userSession = this.A00;
            synchronized (C304536Dv.class) {
                synchronized (C304546Dw.class) {
                    try {
                        if (!C304546Dw.A00) {
                            Long.parseLong(userSession.A06);
                            C304546Dw.A00 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                try {
                    if (!IGSecureMessageCryptoProvider.sInitialized) {
                        IGSecureMessageCryptoProvider.nativeRegisterCryptoProviderHandler();
                        IGSecureMessageCryptoProvider.sInitialized = true;
                    }
                    ? obj2 = new Object();
                    C304536Dv.A00 = obj2;
                    synchronized (obj2) {
                        if (!IGSecureMessageMasterKeyProvider.sInitialized) {
                            IGSecureMessageMasterKeyProvider.nativeRegisterMasterKeyProviderHandler();
                            IGSecureMessageMasterKeyProvider.sInitialized = true;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            AnonymousClass6E1 r3 = AnonymousClass6E0.A01;
            0qQ.A0A(mailbox);
            r3.A01(mailbox, userSession, 182.A06(0Tu.A05, userSession, 36330789054464787L));
        }
        if (r7.A05) {
            1an r1 = 1an.A00;
            UserSession userSession2 = this.A00;
            0qQ.A0A(mailbox);
            r1.A01(mailbox, userSession2);
        }
        r5.A04("secure_message_crypto_callback_end");
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogSecureMessageCryptoCallbackEnd();
        }
    }
}
