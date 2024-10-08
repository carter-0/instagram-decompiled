package X;

import android.content.Context;
import android.util.Base64;
import java.util.Map;

/* renamed from: X.5jf  reason: invalid class name and case insensitive filesystem */
public final class C292875jf {
    public static C292875jf A01;
    public final 0xa A00;

    public final C293385ke A00() {
        0xa r7 = this.A00;
        int i = r7.getInt("pw_enc_key_id", -1);
        String string = r7.getString("pw_enc_public_key", (String) null);
        r7.getLong("pw_enc_key_expiry_timestamp_ms", -1);
        String string2 = r7.getString("pw_enc_key_state", (String) null);
        if (i == -1 || string == null || string2 == null) {
            return null;
        }
        return new C293385ke(i, string, string2);
    }

    public C292875jf(Context context) {
        Map map = 1CV.A09;
        this.A00 = new 1CW(context, "PasswordEncryptionKeyStorePrefs").A00();
    }

    public final void A01(String str, String str2) {
        String str3 = "ENCRYPTION_WITH_TAGGING";
        C293385ke r0 = new C293385ke(Integer.parseInt(str2), new String(Base64.decode(str, 2)), str3);
        int i = r0.A00;
        String str4 = r0.A02;
        if (1 - r0.A01.intValue() == 0) {
            str3 = "PLAINTEXT_WITH_TAGGING";
        }
        0xY AR4 = this.A00.AR4();
        AR4.E5Z("pw_enc_key_id", i);
        AR4.E5g("pw_enc_public_key", str4);
        AR4.E5c("pw_enc_key_expiry_timestamp_ms", -1);
        AR4.E5g("pw_enc_key_state", str3);
        AR4.apply();
    }
}
