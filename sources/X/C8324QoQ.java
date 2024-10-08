package X;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: X.QoQ  reason: case insensitive filesystem */
public final class C8324QoQ extends C257213x2 {
    public int A00;
    public int A01;
    public C257263x7 A02;
    public byte[] A03;

    public C8324QoQ() {
        super(false);
    }

    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A01();
        }
        this.A02 = null;
    }

    public final Uri getUri() {
        C257263x7 r0 = this.A02;
        if (r0 != null) {
            return r0.A06;
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
        A03(min);
        return min;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    public final long open(C257263x7 r9) {
        byte[] bArr;
        A02();
        this.A02 = r9;
        Uri uri = r9.A06;
        String scheme = uri.getScheme();
        C256703wD.A05("data".equals(scheme), 002.A0R("Unsupported scheme: ", scheme));
        String[] A1b = Pxh.A1b(uri.getSchemeSpecificPart(), ",");
        if (A1b.length == 2) {
            String str = A1b[1];
            if (A1b[0].contains(";base64")) {
                try {
                    bArr = Base64.decode(str, 0);
                    this.A03 = bArr;
                } catch (IllegalArgumentException e) {
                    ? iOException = new IOException(002.A0R("Error while parsing Base64 encoded string: ", str), e);
                    iOException.A01 = true;
                    iOException.A00 = 0;
                    throw iOException;
                }
            } else {
                bArr = URLDecoder.decode(str, AnonymousClass2RN.A01.name()).getBytes(AnonymousClass2RN.A05);
                this.A03 = bArr;
            }
            long j = r9.A04;
            int length = bArr.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.A01 = i;
                int i2 = length - i;
                this.A00 = i2;
                long j2 = r9.A03;
                if (j2 != -1) {
                    this.A00 = (int) Math.min((long) i2, j2);
                }
                A04(r9);
                if (j2 == -1) {
                    return (long) this.A00;
                }
                return j2;
            }
            this.A03 = null;
            throw new C2609647s();
        }
        ? iOException2 = new IOException(AnonymousClass7TG.A0m(uri, "Unexpected URI format: ", AnonymousClass7TE.A1A()), (Throwable) null);
        iOException2.A01 = true;
        iOException2.A00 = 0;
        throw iOException2;
    }
}
