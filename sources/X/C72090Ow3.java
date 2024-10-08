package X;

import java.util.ArrayList;

/* renamed from: X.Ow3  reason: case insensitive filesystem */
public final class C72090Ow3 implements AnonymousClass68Z {
    public static final C72090Ow3 A00 = new C72090Ow3();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C301345z0 r1 = (C301345z0) obj;
        0qQ.A0A(r1);
        0qQ.A0B(r1, 0);
        ArrayList A0v = DbS.A0v(C66580MXl.A04(r1));
        int A04 = C66580MXl.A04(r1);
        for (int i = 0; i < A04; i++) {
            long j = r1.mResultSet.getLong(i, 0);
            long j2 = r1.mResultSet.getLong(i, 1);
            String A0u = C66581MXm.A0u(r1, i);
            0qQ.A07(A0u);
            A0v.add(new N3E(r1.mResultSet.getNullableInteger(i, 5), r1.mResultSet.getNullableLong(i, 3), r1.mResultSet.getNullableLong(i, 6), r1.mResultSet.getNullableLong(i, 7), A0u, r1.mResultSet.getString(i, 4), r1.mResultSet.getString(i, 8), r1.mResultSet.getString(i, 9), r1.mResultSet.getString(i, 10), j, j2));
        }
        return A0v;
    }
}
