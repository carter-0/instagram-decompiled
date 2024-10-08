package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.messaging.standalonedatabase.StandaloneDatabaseUtilMCFBridgejniDispatcher;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6EU  reason: invalid class name */
public final class AnonymousClass6EU implements 0lm {
    public static final AnonymousClass6EV A05 = new Object();
    public StandaloneDatabaseHandle A00;
    public AnonymousClass62t A01;
    public boolean A02;
    public final UserSession A03;
    public final AuthData A04;

    public AnonymousClass6EU(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = C300325ww.A00(userSession);
    }

    public static final void A00(AnonymousClass6EW r3, AnonymousClass6EU r4) {
        if (!r4.A02) {
            r4.A02 = true;
            1aU A09 = 1aU.A09(C300345wy.A02(r4.A03, true));
            1a8 r1 = new 1a8((C269794fh) null);
            r1.A02(A09, new AnonymousClass62s(r1, r3, r4));
        }
    }

    public final C71619Onz A01() {
        StandaloneDatabaseHandle standaloneDatabaseHandle = this.A00;
        if (standaloneDatabaseHandle != null) {
            return new C71619Onz(standaloneDatabaseHandle);
        }
        return null;
    }

    public final void onUserSessionWillEnd(boolean z) {
        String str;
        AnonymousClass62t r3;
        if (z) {
            StandaloneDatabaseHandle standaloneDatabaseHandle = this.A00;
            if (!(standaloneDatabaseHandle == null || (r3 = this.A01) == null)) {
                AnonymousClass68L ASa = r3.mMailboxApiHandleMetaProvider.ASa(2);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
                if (!ASa.EJd(new C71644OoP(mailboxFutureImpl, standaloneDatabaseHandle, r3))) {
                    mailboxFutureImpl.cancel(false);
                }
            }
            AuthData authData = this.A04;
            if (authData.getFacebookUserID() != null) {
                String facebookUserID = authData.getFacebookUserID();
                if (facebookUserID != null) {
                    long parseLong = Long.parseLong(facebookUserID);
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    File databasePath = context.getDatabasePath("igd_wellbeing_database");
                    0qQ.A07(databasePath);
                    File parentFile = databasePath.getParentFile();
                    parentFile.getClass();
                    parentFile.mkdirs();
                    try {
                        str = databasePath.getCanonicalPath();
                    } catch (IOException unused) {
                        str = databasePath.getAbsolutePath();
                    }
                    StandaloneDatabaseUtilMCFBridgejniDispatcher.StandaloneDatabaseUtilDeleteDatabaseNative(parseLong, "IGDWellbeingDatabase", 002.A0R("file://", str));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            this.A02 = false;
        }
    }
}
