package X;

import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.Kr7  reason: case insensitive filesystem */
public abstract class C63078Kr7 {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Object A03 = r10.A03(1);
        0qQ.A0C(A03, C273654mx.A00(30));
        C276544tV r6 = (C276544tV) A03;
        String A0F = r6.A0F();
        if (A0F != null) {
            String A0D = r6.A0D();
            if (A0D != null) {
                String A00 = AnonymousClass000.A00(475);
                int A032 = r6.A03(38, AnonymousClass972.MUTABLE_FLAG_MASK);
                if (A032 != Integer.MIN_VALUE) {
                    String A002 = AnonymousClass000.A00(476);
                    String A0E = r6.A0E();
                    if (A0E != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        0qQ.A07(currencyInstance);
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setCurrency(Currency.getInstance(A0E));
                        String format = currencyInstance.format(Integer.valueOf(A032));
                        0qQ.A07(format);
                        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = new ExistingStandaloneFundraiserForFeedModel(A0F, A0D, format, (String) null);
                        L7Q l7q = new L7Q(C308206Td.A04(r9), C308206Td.A0B(r9));
                        EXF exf = EXF.A0Y;
                        AnonymousClass36U A003 = AnonymousClass36R.A00(l7q.A00, l7q.A01, (AnonymousClass36P) l7q.A02.getValue());
                        AnonymousClass36W r2 = AnonymousClass36W.FOLLOWERS_SHARE;
                        JWU jwu = new JWU(r2);
                        jwu.A07 = true;
                        jwu.A0A = false;
                        A003.Ewc(exf, new MediaCaptureConfig(jwu), r2);
                        AnonymousClass6SR.A01().A0A = existingStandaloneFundraiserForFeedModel;
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
