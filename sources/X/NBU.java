package X;

import android.content.Context;
import com.facebook.instagram.msys.InstagramTableToProcedureNameMapRegisterer;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxDatabaseConfig;
import com.facebook.msys.mca.MailboxMessengerMediaSendManagerConfig;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mca.MessageSyncServiceConfig;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.DatabaseFileManager;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.List;

public final class NBU extends AnonymousClass45Y {
    public final /* synthetic */ C70812OMh A00;
    public final /* synthetic */ MailboxCallback A01;

    public final void run() {
        NBJ nbj;
        C300435xB A002 = C300435xB.A00((LightweightQuickPerformanceLogger) null);
        C70812OMh oMh = this.A00;
        AnonymousClass68F r3 = oMh.A03;
        AnonymousClass692 r4 = r3.A00;
        C300185wg r6 = r4.A01;
        Context context = r6.A01;
        SlimMailbox A02 = MZE.A02(r3);
        String A0R = 002.A0R(r4.A09, ".ephemeral");
        if (AnonymousClass7TE.A0t(A0R).isFile()) {
            DatabaseFileManager.deleteDatabaseFilesForPathNative(A0R);
        }
        MZE.A03(r3, A002, A02);
        C300255wo r1 = r3.A05;
        if (r1.get() != null) {
            ((InstagramTableToProcedureNameMapRegisterer) r1.get()).registerMappings();
        }
        NetworkSession A003 = MsysInfraNoSqliteObjectHolder.A00();
        A003.getClass();
        AccountSession accountSession = r4.A02;
        DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback = (DatabaseHealthMonitorFatalErrorCallback) r3.A04.get();
        if (databaseHealthMonitorFatalErrorCallback == null) {
            nbj = null;
        } else {
            nbj = new NBJ(oMh, databaseHealthMonitorFatalErrorCallback);
        }
        NA8 na8 = new NA8(oMh, this.A01, r3.A00());
        String A022 = r3.A02();
        String A004 = AnonymousClass6Eh.A00(context);
        MailboxDatabaseConfig A005 = MZE.A00(r3, A002, (MailboxCallback) null, na8, nbj);
        Object obj = r3.A03.get();
        obj.getClass();
        MailboxMessengerMediaSendManagerConfig A012 = MZE.A01(r3);
        String str = r6.A0E;
        Object obj2 = r3.A0M.get();
        obj2.getClass();
        int A0M = AnonymousClass7TE.A0M(obj2);
        C300355wz r32 = r4.A05;
        oMh.A01 = new MessageSyncService(accountSession, new MessageSyncServiceConfig(A022, A004, accountSession, A02, A005, A003, (DasmConfigCreator) obj, A012, str, (List) r3.A0L.get(), A0M, true, false, r32.A05, r32.A06, r32.A07, 500, true, 500, r32.A01, r32.A02, 500, r32.A03, r32.A04));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBU(C70812OMh oMh, MailboxCallback mailboxCallback) {
        super("LazyMessageSyncService.createMessageSyncService");
        this.A00 = oMh;
        this.A01 = mailboxCallback;
    }
}
