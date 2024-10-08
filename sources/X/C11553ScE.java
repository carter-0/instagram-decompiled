package X;

import com.facebookpay.confirmation.model.ECPConfirmationParams;

/* renamed from: X.ScE  reason: case insensitive filesystem */
public final class C11553ScE implements 1MD {
    public static final C11553ScE A00 = new C11553ScE();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i;
        ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
        String str = eCPConfirmationParams.A01;
        if (0qQ.A0K(str, "NEXT")) {
            i = 2131961165;
        } else if (0qQ.A0K(str, "CLOSE")) {
            i = 2131961164;
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Invalid confirmation CTA type {");
            A1A.append(eCPConfirmationParams);
            throw Pxg.A0d(".ctaType}", A1A);
        }
        return Integer.valueOf(i);
    }
}
