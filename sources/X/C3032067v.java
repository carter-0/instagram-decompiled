package X;

import android.util.Log;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mcs.SyncHandler;

/* renamed from: X.67v  reason: invalid class name and case insensitive filesystem */
public final class C3032067v extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ AccountSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3032067v(Mailbox mailbox, AccountSession accountSession) {
        super("getSyncHandlerToNotifyEnterAppForeground");
        this.A00 = mailbox;
        this.A01 = accountSession;
    }

    public final void run() {
        AppState appState;
        Mailbox mailbox = this.A00;
        mailbox.updateAppStateToForeground();
        SyncHandler syncHandler = mailbox.getSyncHandler();
        AccountSession accountSession = this.A01;
        if (syncHandler != null) {
            Execution.executeAsync(new C294905nE(syncHandler), accountSession, 2);
        } else {
            Log.e("MsysAppStateHandler", "SyncHandler is null when attempting to notify Msys of app foreground.");
        }
        synchronized (MsysInfraNoSqliteObjectHolder.class) {
            appState = MsysInfraNoSqliteObjectHolder.A03.A01;
        }
        if (appState != null) {
            appState.notifyAppEnterForeground(C300465xE.A00());
        } else {
            Log.e("MsysAppStateHandler", "appState or notificationCenter is null when attempting to notify Msys of app foreground.");
        }
    }
}
