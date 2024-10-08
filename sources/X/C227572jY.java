package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2jY  reason: invalid class name and case insensitive filesystem */
public final class C227572jY extends C227582jZ {
    public long A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final /* synthetic */ 1LU A03;

    public final void A00(IOException iOException) {
        this.A01 = true;
        this.A03.A01.markerEnd(42991645, this.A02, 3);
        throw iOException;
    }

    public final int read(byte[] bArr) {
        try {
            int read = this.A00.read(bArr);
            if (read != -1) {
                this.A00 += (long) read;
            }
            return read;
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C227572jY(1LU r3, InputStream inputStream, int i) {
        super(inputStream);
        this.A03 = r3;
        this.A02 = i;
    }

    public final void close() {
        int i;
        if (!this.A01 && (i = this.A02) != 0) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(42991645, i, "read_bytes", this.A00);
            lightweightQuickPerformanceLogger.markerEnd(42991645, i, 2);
        }
        try {
            super.close();
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.A00 += (long) read;
            }
            return read;
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final int read() {
        try {
            int read = this.A00.read();
            if (read != -1) {
                this.A00++;
            }
            return read;
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
