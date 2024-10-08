package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.instagram.common.session.UserSession;

/* renamed from: X.5z7  reason: invalid class name and case insensitive filesystem */
public final class C301395z7 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass6EW A00;
    public final /* synthetic */ AnonymousClass6EU A01;

    public C301395z7(AnonymousClass6EW r1, AnonymousClass6EU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        0qQ.A0B(mailboxNullable, 0);
        AnonymousClass6EU r1 = this.A01;
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) mailboxNullable.value;
        r1.A00 = standaloneDatabaseHandle;
        if (standaloneDatabaseHandle == null) {
            r1.A02 = false;
        }
        AnonymousClass6EW r0 = this.A00;
        if (r0 != null) {
            2DU r12 = r0.A00;
            if (!r0.A01) {
                2DU.A03(r12);
            }
            UserSession userSession = r12.A09;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36322851954895397L)) {
                userSession.A01(C300675xb.class, new C73911Plm(userSession, 18));
            }
        }
    }
}
