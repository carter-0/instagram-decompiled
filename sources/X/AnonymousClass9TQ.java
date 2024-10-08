package X;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: X.9TQ  reason: invalid class name */
public final class AnonymousClass9TQ extends MediaDataSource {
    public IOException A00;
    public final MediaDataSource A01;

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr, 1);
        try {
            return this.A01.readAt(j, bArr2, i, i2);
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    public final void close() {
        try {
            this.A01.close();
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    public final long getSize() {
        try {
            return this.A01.getSize();
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    public AnonymousClass9TQ(MediaDataSource mediaDataSource) {
        this.A01 = mediaDataSource;
    }
}
