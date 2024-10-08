package X;

import com.facebook.advancedcryptotransportpushnotifications.mca.MailboxAdvancedCryptoTransportPushNotificationsJNI;
import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.instagramportabledb.mca.MailboxInstagramPortableDBJNI;
import com.facebook.memcontext.mca.MailboxMEMContextJNI;
import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.messengerencryptedbackupsmemris.mca.MailboxMessengerEncryptedBackupsMemrisJNI;
import com.facebook.notificationengineinstagramintegrator.mca.MailboxNotificationEngineInstagramIntegratorJNI;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.threadtheme.mca.MailboxThreadThemeJNI;
import com.facebook.urlblackholestandalone.mca.MailboxUrlBlackholeStandaloneJNI;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.NAc  reason: case insensitive filesystem */
public final class C68315NAc extends AnonymousClass681 {
    public final int A00;

    public C68315NAc(int i) {
        this.A00 = i;
    }

    public final List A01() {
        switch (this.A00) {
            case 0:
                return MailboxAdvancedCryptoTransportPushNotificationsJNI.getHeaderFields();
            case 1:
                return MailboxEncryptedBackupsJNI.getHeaderFields();
            case 2:
                return MailboxInstagramMemJNI.getHeaderFields();
            case 3:
                return MailboxInstagramPortableDBJNI.getHeaderFields();
            case 4:
                return MailboxMEMContextJNI.getHeaderFields();
            case 5:
                return MailboxMessengerEncryptedBackupsDirectJNI.getHeaderFields();
            case 6:
                return MailboxMessengerEncryptedBackupsMemrisJNI.getHeaderFields();
            case 7:
                return MailboxNotificationEngineInstagramIntegratorJNI.getHeaderFields();
            case 8:
                return MailboxSecureAuthPlatformPakeJNI.getHeaderFields();
            case 9:
                return MailboxSecureConsentFrameworkStandaloneJNI.getHeaderFields();
            case 10:
                return MailboxShimJNI.getHeaderFields();
            case 11:
                return MailboxTamJNI.getHeaderFields();
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return MailboxThreadThemeJNI.getHeaderFields();
            default:
                return MailboxUrlBlackholeStandaloneJNI.getHeaderFields();
        }
    }
}
