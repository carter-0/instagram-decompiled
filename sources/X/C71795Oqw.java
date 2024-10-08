package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.Oqw  reason: case insensitive filesystem */
public final class C71795Oqw implements C257113ws {
    public long A00;
    public boolean A01;
    public final AnonymousClass47P A02;
    public final C257113ws A03;

    public final /* synthetic */ void cancel() {
    }

    public final void close() {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    public final Map getResponseHeaders() {
        return this.A03.getResponseHeaders();
    }

    public final Uri getUri() {
        return this.A03.getUri();
    }

    public final long open(C257263x7 r10) {
        long open = this.A03.open(r10);
        this.A00 = open;
        if (open == 0) {
            return 0;
        }
        if (r10.A03 == -1 && open != -1) {
            r10 = r10.A00(0, open);
        }
        this.A01 = true;
        this.A02.E0i(r10);
        return this.A00;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read <= 0) {
            return read;
        }
        this.A02.write(bArr, i, read);
        long j = this.A00;
        if (j == -1) {
            return read;
        }
        this.A00 = j - ((long) read);
        return read;
    }

    public C71795Oqw(AnonymousClass47P r1, C257113ws r2) {
        this.A03 = r2;
        this.A02 = r1;
    }

    public final void addTransferListener(C250823m7 r2) {
        r2.getClass();
        this.A03.addTransferListener(r2);
    }
}
