package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.secureconsentframework.mca.MailboxSecureConsentFrameworkJNI;

/* renamed from: X.62o  reason: invalid class name and case insensitive filesystem */
public final class C3023262o implements MailboxFeature.DbConnectionResolutionCallback {
    public final /* synthetic */ C3023062m A00;

    public C3023262o(C3023062m r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        C301345z0 r0;
        CQLResultSet cQLResultSet = (CQLResultSet) MailboxSecureConsentFrameworkJNI.dispatchCqlOO(9, sqliteHolder);
        if (cQLResultSet == null) {
            r0 = null;
        } else {
            r0 = new C301345z0(cQLResultSet);
        }
        return new MailboxNullable(r0);
    }
}
