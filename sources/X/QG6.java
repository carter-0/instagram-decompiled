package X;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

public final class QG6 extends C293075k0 {
    public final /* synthetic */ AnonymousClass385 A00;
    public final /* synthetic */ UUID A01;

    public QG6(AnonymousClass385 r1, UUID uuid) {
        this.A00 = r1;
        this.A01 = uuid;
    }

    /* JADX INFO: finally extract failed */
    public final void A00() {
        AnonymousClass385 r2 = this.A00;
        WorkDatabase workDatabase = r2.A04;
        workDatabase.beginTransaction();
        try {
            A01(r2, this.A01.toString());
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            C255313tv.A00(workDatabase, r2.A07);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
