package X;

import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;

/* renamed from: X.Kr4  reason: case insensitive filesystem */
public abstract class C63075Kr4 {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Object A01 = r11.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        Object A02 = r11.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        Object A00 = r11.A00();
        0qQ.A0C(A00, C273654mx.A00(30));
        C276544tV r1 = (C276544tV) A00;
        String str3 = "";
        String str4 = str3;
        String A0F = r1.A0F();
        if (A0F != null) {
            str4 = A0F;
        }
        String A0D = r1.A0D();
        String str5 = str3;
        String A0H = r1.A0H();
        if (A0H != null) {
            str5 = A0H;
        }
        String A0E = r1.A0E();
        String A0I = r1.A0I();
        if (A0I != null) {
            str3 = A0I;
        }
        AnonymousClass1Nd.A00(C308206Td.A0B(r10)).A00(new C339557jn(new FundraiserDisplayInfoModel(str4, A0D, str5, A0E, str3), str, str2));
        return null;
    }
}
