package X;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4XK  reason: invalid class name */
public final class AnonymousClass4XK implements AnonymousClass4XL {
    public Uri A00;
    public final C257113ws A01;

    public final /* synthetic */ void cancel() {
    }

    public final void close() {
        this.A01.close();
    }

    public final Uri getUri() {
        return this.A00;
    }

    public final long open(C257263x7 r3) {
        this.A00 = r3.A06;
        return this.A01.open(r3);
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.A01.read(bArr, i, i2);
        } catch (IOException e) {
            throw e;
        }
    }

    public AnonymousClass4XK(C257113ws r1) {
        this.A01 = r1;
    }

    public final void addTransferListener(C250823m7 r2) {
        r2.getClass();
        this.A01.addTransferListener(r2);
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
