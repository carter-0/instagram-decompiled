package X;

import java.util.ArrayList;

/* renamed from: X.OwZ  reason: case insensitive filesystem */
public final class C72114OwZ implements AnonymousClass68Z {
    public static final C72114OwZ A00 = new C72114OwZ();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C301345z0 r1 = (C301345z0) obj;
        0qQ.A0A(r1);
        0qQ.A0B(r1, 0);
        ArrayList A0v = DbS.A0v(C66580MXl.A04(r1));
        int A04 = C66580MXl.A04(r1);
        for (int i = 0; i < A04; i++) {
            long j = r1.mResultSet.getLong(i, 0);
            String A0t = C66581MXm.A0t(r1, i);
            0qQ.A07(A0t);
            String A0u = C66581MXm.A0u(r1, i);
            0qQ.A07(A0u);
            long j2 = r1.mResultSet.getLong(i, 3);
            String A0v2 = C66581MXm.A0v(r1, i);
            0qQ.A07(A0v2);
            int integer = r1.mResultSet.getInteger(i, 7);
            long j3 = r1.mResultSet.getLong(i, 8);
            String string = r1.mResultSet.getString(i, 9);
            String string2 = r1.mResultSet.getString(i, 10);
            Integer nullableInteger = r1.mResultSet.getNullableInteger(i, 11);
            Integer nullableInteger2 = r1.mResultSet.getNullableInteger(i, 12);
            Long nullableLong = r1.mResultSet.getNullableLong(i, 13);
            String string3 = r1.mResultSet.getString(i, 16);
            0qQ.A07(string3);
            Integer nullableInteger3 = r1.mResultSet.getNullableInteger(i, 17);
            Integer nullableInteger4 = r1.mResultSet.getNullableInteger(i, 18);
            String string4 = r1.mResultSet.getString(i, 19);
            Integer nullableInteger5 = r1.mResultSet.getNullableInteger(i, 21);
            Integer nullableInteger6 = r1.mResultSet.getNullableInteger(i, 22);
            boolean z = r1.mResultSet.getBoolean(i, 23);
            Long nullableLong2 = r1.mResultSet.getNullableLong(i, 24);
            Integer nullableInteger7 = r1.mResultSet.getNullableInteger(i, 26);
            Long nullableLong3 = r1.mResultSet.getNullableLong(i, 28);
            String string5 = r1.mResultSet.getString(i, 29);
            String string6 = r1.mResultSet.getString(i, 30);
            Integer nullableInteger8 = r1.mResultSet.getNullableInteger(i, 31);
            String string7 = r1.mResultSet.getString(i, 32);
            String string8 = r1.mResultSet.getString(i, 33);
            String string9 = r1.mResultSet.getString(i, 34);
            String string10 = r1.mResultSet.getString(i, 35);
            Integer nullableInteger9 = r1.mResultSet.getNullableInteger(i, 36);
            Integer nullableInteger10 = r1.mResultSet.getNullableInteger(i, 37);
            Integer nullableInteger11 = r1.mResultSet.getNullableInteger(i, 38);
            String string11 = r1.mResultSet.getString(i, 39);
            String string12 = r1.mResultSet.getString(i, 40);
            boolean z2 = r1.mResultSet.getBoolean(i, 41);
            A0v.add(new N3S(nullableInteger, nullableInteger2, nullableInteger3, nullableInteger4, nullableInteger5, nullableInteger6, nullableInteger7, nullableInteger8, nullableInteger9, nullableInteger10, nullableInteger11, r1.mResultSet.getNullableInteger(i, 25), nullableLong, nullableLong2, nullableLong3, A0t, A0u, A0v2, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, r1.mResultSet.getString(i, 42), r1.mResultSet.getString(i, 43), integer, j, j2, j3, z, z2, r1.mResultSet.getBoolean(i, 44), r1.mResultSet.getBoolean(i, 45)));
        }
        return A0v;
    }
}
