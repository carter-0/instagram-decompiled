package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxDatabaseCallback;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NA8 extends MailboxDatabaseCallback {
    public final /* synthetic */ C70812OMh A00;
    public final /* synthetic */ MailboxCallback A01;
    public final /* synthetic */ Database.OpenCallback A02;

    public NA8(C70812OMh oMh, MailboxCallback mailboxCallback, Database.OpenCallback openCallback) {
        this.A00 = oMh;
        this.A02 = openCallback;
        this.A01 = mailboxCallback;
    }

    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, DatabaseConnectionSettings databaseConnectionSettings) {
        Database.OpenCallback openCallback = this.A02;
        if (openCallback == null) {
            return true;
        }
        openCallback.onConfig(sqliteHolder, i, databaseConnectionSettings);
        return true;
    }

    public final void onOpenWithMessageSyncService(boolean z, MessageSyncService messageSyncService, Throwable th) {
        C70812OMh oMh = this.A00;
        AtomicBoolean atomicBoolean = oMh.A02;
        atomicBoolean.set(true);
        if (th != null) {
            oMh.A01 = null;
            oMh.A00 = null;
            atomicBoolean.set(false);
        }
        Database.OpenCallback openCallback = this.A02;
        if (openCallback != null) {
            openCallback.onOpen(z, th);
        }
        if (th == null) {
            this.A01.onCompletion(messageSyncService);
        }
        MailboxCallback mailboxCallback = oMh.A00;
        if (mailboxCallback != null) {
            mailboxCallback.onCompletion((Object) null);
        }
    }
}
