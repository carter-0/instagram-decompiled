package X;

import java.io.IOException;

public final class EI3 extends 0ng {
    public final /* synthetic */ EVP A00;
    public final /* synthetic */ FH4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EI3(EVP evp, FH4 fh4) {
        super(702);
        this.A01 = fh4;
        this.A00 = evp;
    }

    public final void run() {
        C48103EVv eVv;
        FH4 fh4 = this.A01;
        FAB fab = fh4.A08;
        String str = fh4.A04.A06;
        1CV A002 = FAB.A00(fab);
        0qQ.A0A(A002);
        0xY AR4 = A002.AR4();
        try {
            String string = A002.getString(str, (String) null);
            if (string != null) {
                String str2 = C48324Ech.parseFromJson(16P.A00(string)).A04;
                C48103EVv[] values = C48103EVv.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        eVv = C48103EVv.UNKNOWN;
                        break;
                    }
                    eVv = values[i];
                    if (0qQ.A0K(eVv.A00, str2)) {
                        break;
                    }
                    i++;
                }
                if (eVv == C48103EVv.FACEBOOK) {
                    AR4.ED3("AccountCachingHelper.FACEBOOK_USER_ID");
                }
            }
        } catch (IOException e) {
            0wb.A07("ExternalAccountCachingHelper_deserialize_account_error", e);
        }
        AR4.ED3(str);
        AR4.apply();
        FH4.A03(this.A00, fh4);
    }
}
