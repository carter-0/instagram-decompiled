package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.OoO  reason: case insensitive filesystem */
public final class C71643OoO implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C71643OoO(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    public final void onCompletion(Object obj) {
        Object obj2;
        if (this.A00 != 0) {
            C301345z0 r3 = (C301345z0) ((MailboxNullable) obj).value;
            if (r3 != null) {
                long A08 = C66580MXl.A08(r3.mResultSet.getString(0, 1));
                String A0u = C66581MXm.A0u(r3, 0);
                String string = r3.mResultSet.getString(0, 3);
                long A0P = AnonymousClass7TE.A0P(r3.mResultSet.getLong(0, 4));
                int integer = r3.mResultSet.getInteger(0, 6);
                byte[] blob = r3.mResultSet.getBlob(0, 5);
                long j = this.A01;
                0qQ.A0A(A0u);
                0qQ.A0A(string);
                C70985OUz.A00((C70985OUz) this.A02, A0u, string, blob, integer, j, A08, A0P);
                return;
            }
            return;
        }
        AnonymousClass67Z r5 = (AnonymousClass67Z) this.A02;
        long j2 = this.A01;
        MYb mYb = MYb.A0M;
        C301345z0 r1 = (C301345z0) ((MailboxNullable) obj).value;
        if (r1 == null || C66580MXl.A04(r1) <= 0) {
            obj2 = C2612848z.A00;
        } else {
            obj2 = new C257453xQ(C66580MXl.A0j(Long.valueOf(j2), r1.mResultSet.getLong(0, 0)));
        }
        r5.A02(obj2);
        r5.A00();
    }
}
