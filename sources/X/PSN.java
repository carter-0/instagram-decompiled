package X;

import com.facebook.msys.mca.MailboxNullable;
import java.util.HashMap;

public final class PSN implements 1aV {
    public final /* synthetic */ AnonymousClass4A0 A00;
    public final /* synthetic */ boolean A01;

    public PSN(AnonymousClass4A0 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int A04;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        0qQ.A0B(mailboxNullable, 0);
        C301345z0 r4 = (C301345z0) mailboxNullable.value;
        if (r4 != null && (A04 = C66580MXl.A04(r4)) != 0) {
            HashMap A1E = AnonymousClass7TE.A1E();
            for (int i = 0; i < A04; i++) {
                String string = r4.mResultSet.getString(i, 1);
                String A0v = C66580MXl.A0v(r4, i, 1);
                0qQ.A07(A0v);
                long A06 = JTS.A06(r4.mResultSet.getNullableLong(i, 3));
                boolean A1S = AnonymousClass7TF.A1S(r4.mResultSet.getInteger(i, 2), 2);
                A1E.put(string, new C251053mU(A0v, (String) null, C66581MXm.A0v(r4, i), A06, DbY.A04(r4.mResultSet.getNullableLong(i, 5)), A1S, false));
            }
            if (!A1E.isEmpty()) {
                r4.mResultSet.getCount();
                A1E.size();
                AnonymousClass4A0.A03(this.A00, A1E, this.A01, false);
            }
        }
    }
}
