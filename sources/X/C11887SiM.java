package X;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.SiM  reason: case insensitive filesystem */
public final class C11887SiM implements C13812Thf {
    public Object A00;
    public final C10172Rnn A01;
    public final String A02;

    public final void cancel() {
    }

    public final Class AvH() {
        return InputStream.class;
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        IllegalArgumentException illegalArgumentException;
        try {
            String str = this.A02;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    illegalArgumentException = AnonymousClass7TE.A0w("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(Pxe.A0v(indexOf, str), 0));
                    this.A00 = byteArrayInputStream;
                    tfA.D7o(byteArrayInputStream);
                    return;
                } else {
                    illegalArgumentException = AnonymousClass7TE.A0w("Not a base64 image data URL.");
                }
            } else {
                illegalArgumentException = AnonymousClass7TE.A0w("Not a valid image data URL.");
            }
            throw illegalArgumentException;
        } catch (IllegalArgumentException e) {
            tfA.DOG(e);
        }
    }

    public final void cleanup() {
        try {
            ((InputStream) this.A00).close();
        } catch (IOException unused) {
        }
    }

    public C11887SiM(C10172Rnn rnn, String str) {
        this.A02 = str;
        this.A01 = rnn;
    }
}
