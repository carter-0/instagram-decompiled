package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.63r  reason: invalid class name and case insensitive filesystem */
public final class C3025363r implements MailboxCallback {
    public final /* synthetic */ AnonymousClass638 A00;
    public final /* synthetic */ SettableFuture A01;

    public C3025363r(AnonymousClass638 r1, SettableFuture settableFuture) {
        this.A00 = r1;
        this.A01 = settableFuture;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AnonymousClass638 r2;
        SettableFuture settableFuture;
        C301055yO r0;
        Object obj2 = ((MailboxNullable) obj).value;
        if (obj2 == null) {
            0KC.A0D("AdvancedCryptoTransport", "Login type is not returned");
        } else {
            if ("PREVIOUSLY_REGISTERED".equals(obj2)) {
                r2 = this.A00;
                settableFuture = this.A01;
                r0 = C301055yO.A06;
            } else if ("NEW_REGISTRATION_HAPPENED".equals(obj2)) {
                r2 = this.A00;
                settableFuture = this.A01;
                AnonymousClass638 r02 = AnonymousClass638.$redex_init_class;
                r2.A00 = new C71740Oq0(r2, settableFuture);
                AccountSession accountSession = r2.A08;
                if (accountSession == null) {
                    0KC.A0C("AdvancedCryptoTransport", "Failed to get msys account session");
                    r0 = C301055yO.A08;
                } else {
                    SessionedNotificationCenter sessionedNotificationCenter = accountSession.getSessionedNotificationCenter();
                    AnonymousClass66d r3 = r2.A00;
                    r3.getClass();
                    sessionedNotificationCenter.addObserver(r3, "MCAMailboxAdvancedCryptoTransportDidRegistrationNotification", 1, (AnonymousClass2Lq) null);
                    return;
                }
            } else if ("ALREADY_LOGGED_IN".equals(obj2)) {
                r2 = this.A00;
                settableFuture = this.A01;
                r0 = C301055yO.A05;
            } else if (MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(obj2)) {
                r2 = this.A00;
                settableFuture = this.A01;
                r0 = C301055yO.A04;
            } else if ("MAILBOX_INVALID".equals(obj2)) {
                r2 = this.A00;
                settableFuture = this.A01;
                r0 = C301055yO.A03;
            } else if ("USING_MEM_LOGIN".equals(obj2)) {
                r2 = this.A00;
                settableFuture = this.A01;
                r0 = C301055yO.A0A;
            }
            AnonymousClass638.A01(r2, r0, settableFuture);
        }
        r2 = this.A00;
        settableFuture = this.A01;
        r0 = C301055yO.A02;
        AnonymousClass638.A01(r2, r0, settableFuture);
    }
}
