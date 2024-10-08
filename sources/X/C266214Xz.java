package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4Xz  reason: invalid class name and case insensitive filesystem */
public final class C266214Xz implements C257113ws {
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map A02 = Collections.emptyMap();
    public final C257113ws A03;

    public final /* synthetic */ void cancel() {
    }

    public final void close() {
        this.A03.close();
    }

    public final Map getResponseHeaders() {
        return this.A03.getResponseHeaders();
    }

    public final Uri getUri() {
        return this.A03.getUri();
    }

    public final long open(C257263x7 r5) {
        this.A01 = r5.A06;
        this.A02 = Collections.emptyMap();
        C257113ws r3 = this.A03;
        long open = r3.open(r5);
        Uri uri = r3.getUri();
        uri.getClass();
        this.A01 = uri;
        this.A02 = r3.getResponseHeaders();
        return open;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A00 += (long) read;
        }
        return read;
    }

    public C266214Xz(C257113ws r2) {
        r2.getClass();
        this.A03 = r2;
    }

    public final void addTransferListener(C250823m7 r2) {
        r2.getClass();
        this.A03.addTransferListener(r2);
    }
}
