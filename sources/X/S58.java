package X;

import java.io.IOException;
import java.io.InputStream;

public class S58 {
    public final byte[] A02(InputStream inputStream, int i) {
        try {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to read the value of the ASN.1 object", new Object[]{e}));
        }
    }

    public final int A00(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read >= 127) {
                int i = read & 127;
                read = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    read = (read << 8) + inputStream.read();
                }
                if (read == 0) {
                    throw new RuntimeException("The indefinite length form is not (yet) supported!");
                }
            }
            return read;
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to read the length of the ASN.1 object.", new Object[]{e}));
        }
    }

    public final SPJ A01(InputStream inputStream) {
        C8871RDn rDn;
        try {
            int read = inputStream.read();
            byte b = (byte) read;
            byte b2 = b & 192;
            for (C8904REw rEw : C8904REw.values()) {
                if (rEw.A00 == b2) {
                    if ((b & 32) == 0) {
                        rDn = C8871RDn.Primitive;
                    } else {
                        rDn = C8871RDn.Constructed;
                    }
                    int i = read & 31;
                    if (i <= 30) {
                        return SPJ.A00(rEw, i).A02(rDn);
                    }
                    int read2 = inputStream.read();
                    int i2 = 0;
                    do {
                        i2 = (i2 << 7) | (read2 & 127);
                        read2 = inputStream.read();
                    } while ((read2 & 128) > 0);
                    return SPJ.A00(rEw, i2).A02(rDn);
                }
            }
            throw AnonymousClass7TE.A0z("Could not parse ASN.1 Tag Class (should be impossible)");
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to parse ASN.1 tag", new Object[]{e}));
        }
    }
}
