package X;

import com.facebook.fxcal.mca.MailboxFXCALJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.5og  reason: invalid class name and case insensitive filesystem */
public final class C295665og implements MailboxFeature.DbConnectionResolutionCallback {
    public final /* synthetic */ C295655of A00;

    public final /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        C301345z0 r0;
        CQLResultSet cQLResultSet = (CQLResultSet) MailboxFXCALJNI.dispatchCqlOO(0, sqliteHolder);
        if (cQLResultSet == null) {
            r0 = null;
        } else {
            r0 = new C301345z0(cQLResultSet);
        }
        return new MailboxNullable(r0);
    }

    public C295665og(C295655of r1) {
        this.A00 = r1;
    }
}
