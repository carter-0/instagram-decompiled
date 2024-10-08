package X;

import android.os.Bundle;

/* renamed from: X.Ee4  reason: case insensitive filesystem */
public abstract class C48409Ee4 {
    public static final Object A00(C307896Rx r31, AnonymousClass6Tm r32) {
        String str;
        AnonymousClass6Tm r0 = r32;
        C47361Dvv parseFromJson = F6K.parseFromJson(16P.A00(DbY.A0h(r0, 1)));
        0lg A0A = C308206Td.A0A((C307786Rm) Dba.A0V(r0, 0));
        0qQ.A0A(parseFromJson);
        String str2 = parseFromJson.A01.A01;
        0qQ.A07(str2);
        String str3 = parseFromJson.A01.A03;
        if (str3 != null) {
            FFR.A02().A02(str2, str3);
        }
        F19 f19 = parseFromJson.A01;
        if (!(!f19.A09 || (str = f19.A04) == null || str.length() == 0)) {
            C49924FEz A02 = FFR.A02();
            String str4 = parseFromJson.A01.A01;
            0qQ.A07(str4);
            String str5 = parseFromJson.A01.A04;
            0qQ.A07(str5);
            A02.A03(str4, str5);
        }
        String str6 = parseFromJson.A01.A01;
        0qQ.A07(str6);
        0tS A0h = DbT.A0h();
        if (A0h.A09().contains(str6)) {
            A0h.A0H(094.A03(str6, A0h.A09()));
        }
        F19 f192 = parseFromJson.A01;
        0qQ.A07(f192);
        Bundle A00 = FBN.A00(parseFromJson.A00);
        C49721F3j A0X = DbW.A0X();
        String str7 = f192.A05;
        0qQ.A07(str7);
        String str8 = f192.A06;
        0qQ.A07(str8);
        String str9 = f192.A01;
        0qQ.A07(str9);
        String str10 = f192.A00;
        0qQ.A07(str10);
        boolean z = f192.A0A;
        boolean z2 = f192.A0E;
        boolean z3 = f192.A0F;
        boolean z4 = f192.A0B;
        String str11 = f192.A02;
        boolean z5 = f192.A09;
        return Dba.A0U(A0X.A02(A00, str7, str8, str9, str10, str11, true, z, z2, z3, z4, false, z5, f192.A07, f192.A08), DbS.A0M(C308206Td.A04(r31), A0A));
    }
}
