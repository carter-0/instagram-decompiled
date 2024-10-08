package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.T7j  reason: case insensitive filesystem */
public final class C12796T7j implements AnonymousClass1DV {
    public final SharedPreferences A00;
    public final String A01;

    public final OutputStream C1a(Context context) {
        return new RC2(this.A00, this.A01);
    }

    public final Integer CAo() {
        return AnonymousClass05K.A0C;
    }

    public final InputStream Eyd(Context context) {
        String string = this.A00.getString(this.A01, (String) null);
        if (string == null) {
            return null;
        }
        int length = string.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
        }
        return new ByteArrayInputStream(new String(bArr).getBytes());
    }

    public final String getName() {
        return this.A01;
    }

    public C12796T7j(Context context, String str) {
        this.A00 = Pxe.A0H(context, "legacy_prefs");
        this.A01 = str;
    }
}
