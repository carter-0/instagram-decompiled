package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxDatabaseCallback;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public final class MZK extends MailboxDatabaseCallback {
    public final /* synthetic */ AnonymousClass68H A00;

    public MZK(AnonymousClass68H r1) {
        this.A00 = r1;
    }

    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, DatabaseConnectionSettings databaseConnectionSettings) {
        Database.OpenCallback A002 = this.A00.A05.A00();
        A002.getClass();
        A002.onConfig(sqliteHolder, i, databaseConnectionSettings);
        return true;
    }

    public final void onOpenWithMailbox(boolean z, Mailbox mailbox, Throwable th) {
        if (th != null) {
            AnonymousClass68H r2 = this.A00;
            0Sd.A03(DbW.A1a(r2.A02), "calling cleanupInternal() under the assumption mMailbox is null");
            r2.A04.A00(AnonymousClass05K.A0C);
            AnonymousClass68H.A01(r2);
        }
        Database.OpenCallback A002 = this.A00.A05.A00();
        A002.getClass();
        A002.onOpen(z, th);
    }
}
