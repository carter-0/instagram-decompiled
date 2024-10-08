package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;

/* renamed from: X.Eed  reason: case insensitive filesystem */
public abstract class C48444Eed {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        Object A00 = r15.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r3 = (C276544tV) A00;
        C276544tV A07 = r3.A07(40);
        if (A07 != null) {
            AE3 ae3 = null;
            String str = "";
            String A0G = r3.A0G();
            if (A0G != null) {
                str = A0G;
            }
            String A0F = r3.A0F();
            AE3 A002 = C49232Erb.A00(A07);
            String A0I = r3.A0I();
            int A03 = r3.A03(35, 0);
            C276544tV A072 = r3.A07(38);
            if (A072 != null) {
                ae3 = C49232Erb.A00(A072);
            }
            1Ng A003 = AnonymousClass1Nd.A00(C308206Td.A0B(r14));
            Object A032 = r15.A03(0);
            A003.A00(new C354818Nm(new C3499082j((NewFundraiserInfo) null, ae3, A002, A0I, DbW.A0k(r15, DbS.A0p(A032)), A0F, (String) A032, "", str, A03)));
            return null;
        }
        throw AnonymousClass7TE.A0w("Requires valid creator model");
    }
}
