package X;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.common.dextricks.Constants;

public final class S2Z {
    public int A00 = 0;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public CharSequence A03 = null;
    public boolean A04 = true;

    public final C10714Rws A00() {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(this.A03)) {
            int i = this.A00;
            if (RRV.A00(i)) {
                if (i != 0) {
                    z = AnonymousClass7TF.A1P(i & Constants.LOAD_RESULT_PGO);
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(this.A02) && !z) {
                    throw AnonymousClass7TE.A0w("Negative text must be set and non-empty.");
                } else if (TextUtils.isEmpty(this.A02) || !z) {
                    return new C10714Rws(this.A03, this.A01, this.A02, this.A00, this.A04);
                } else {
                    throw AnonymousClass7TE.A0w("Negative text must not be set if device credential authentication is allowed.");
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (i == 15) {
                    str = "BIOMETRIC_STRONG";
                } else if (i == 255) {
                    str = "BIOMETRIC_WEAK";
                } else if (i == 32768) {
                    str = "DEVICE_CREDENTIAL";
                } else if (i == 32783) {
                    str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                } else if (i != 33023) {
                    str = String.valueOf(i);
                } else {
                    str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                }
                throw AnonymousClass7TE.A0w(002.A05(i2, "Authenticator combination is unsupported on API ", ": ", str));
            }
        } else {
            throw AnonymousClass7TE.A0w("Title must be set and non-empty.");
        }
    }
}
