package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.62s  reason: invalid class name */
public final class AnonymousClass62s implements 1aV {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ AnonymousClass6EW A01;
    public final /* synthetic */ AnonymousClass6EU A02;

    public AnonymousClass62s(1a8 r1, AnonymousClass6EW r2, AnonymousClass6EU r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.msys.mca.MailboxFeature, X.62t] */
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        AnonymousClass681 r0 = AnonymousClass62t.A00;
        ? mailboxFeature = new MailboxFeature(new C3023662u((AccountSession) obj));
        AnonymousClass6EU r5 = this.A02;
        Context applicationContext = C60960kU.A00.getApplicationContext();
        0qQ.A07(applicationContext);
        File databasePath = applicationContext.getDatabasePath("igd_wellbeing_database");
        0qQ.A07(databasePath);
        File parentFile = databasePath.getParentFile();
        parentFile.getClass();
        parentFile.mkdirs();
        try {
            str = databasePath.getCanonicalPath();
        } catch (IOException unused) {
            str = databasePath.getAbsolutePath();
        }
        String A0R = 002.A0R("file://", str);
        AnonymousClass62x r3 = new AnonymousClass62x();
        AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        if (!ASa.EJd(new C301375z5(mailboxFutureImpl, r3, mailboxFeature, A0R))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new C301395z7(this.A01, r5));
        r5.A01 = mailboxFeature;
        this.A00.A00.dispose();
    }
}
