package X;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: X.Q6h  reason: case insensitive filesystem */
public final class C7353Q6h extends MediaDataSource {
    public long A00;
    public final /* synthetic */ AnonymousClass50S A01;
    public final /* synthetic */ C227922kK A02;

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public C7353Q6h(AnonymousClass50S r1, C227922kK r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.A00;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.A01.A04.available())) {
                    return -1;
                }
                this.A01.A01(j);
                this.A00 = j;
            }
            AnonymousClass50S r2 = this.A01;
            DataInputStream dataInputStream = r2.A04;
            if (i2 > dataInputStream.available()) {
                i2 = dataInputStream.available();
            }
            int read = r2.read(bArr, i, i2);
            if (read >= 0) {
                this.A00 += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.A00 = -1;
        return -1;
    }
}
