package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: X.QDf  reason: case insensitive filesystem */
public final class C7440QDf extends C22071Xux {
    public int A00;
    public int A01;
    public SH8 A02;
    public byte[] A03;

    public C7440QDf() {
        super(false);
    }

    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A02();
        }
        this.A02 = null;
    }

    public final Uri getUri() {
        SH8 sh8 = this.A02;
        if (sh8 != null) {
            return sh8.A01;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A03, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A04(min);
        return min;
    }

    public final long E0f(SH8 sh8) {
        byte[] bArr;
        A03();
        this.A02 = sh8;
        Uri normalizeScheme = sh8.A01.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        C11366SPh.A03("data".equals(scheme), 002.A0R("Unsupported scheme: ", scheme));
        String[] A1b = Pxh.A1b(normalizeScheme.getSchemeSpecificPart(), ",");
        if (A1b.length == 2) {
            String str = A1b[1];
            if (A1b[0].contains(";base64")) {
                try {
                    bArr = Base64.decode(str, 0);
                    this.A03 = bArr;
                } catch (IllegalArgumentException e) {
                    throw new XQX(002.A0R("Error while parsing Base64 encoded string: ", str), e, 0, true);
                }
            } else {
                bArr = URLDecoder.decode(str, AnonymousClass2RN.A01.name()).getBytes(AnonymousClass2RN.A05);
                this.A03 = bArr;
            }
            long j = sh8.A00;
            int length = bArr.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.A01 = i;
                this.A00 = length - i;
                A05(sh8);
                return (long) this.A00;
            }
            this.A03 = null;
            throw new C8841RCg();
        }
        throw new XQX(AnonymousClass7TG.A0m(normalizeScheme, "Unexpected URI format: ", AnonymousClass7TE.A1A()), (Throwable) null, 0, true);
    }
}
