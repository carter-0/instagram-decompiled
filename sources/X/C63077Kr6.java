package X;

import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.Kr6  reason: case insensitive filesystem */
public abstract class C63077Kr6 {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Object A02 = r8.A02();
        0qQ.A0C(A02, C273654mx.A00(30));
        C276544tV r6 = (C276544tV) A02;
        String A0F = r6.A0F();
        if (A0F != null) {
            String A0D = r6.A0D();
            if (A0D != null) {
                String A00 = AnonymousClass000.A00(475);
                int A03 = r6.A03(38, AnonymousClass972.MUTABLE_FLAG_MASK);
                if (A03 != Integer.MIN_VALUE) {
                    String A002 = AnonymousClass000.A00(476);
                    String A0E = r6.A0E();
                    if (A0E != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        0qQ.A07(currencyInstance);
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setCurrency(Currency.getInstance(A0E));
                        String format = currencyInstance.format(Integer.valueOf(A03));
                        0qQ.A07(format);
                        AnonymousClass1Nd.A00(C308206Td.A0B(r7)).A00(new C64663Lfp(new ExistingStandaloneFundraiserForFeedModel(A0F, A0D, format, (String) null)));
                        return null;
                    }
                    throw AnonymousClass7TE.A0w(A002);
                }
                throw AnonymousClass7TE.A0w(A00);
            }
            throw AnonymousClass7TE.A0w("Requires beneficiary short name");
        }
        throw AnonymousClass7TE.A0w("Requires fundraiser id");
    }
}
