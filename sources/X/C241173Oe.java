package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.3Oe  reason: invalid class name and case insensitive filesystem */
public final class C241173Oe extends C241163Od {
    public long A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final /* synthetic */ 1LU A03;

    public final void A00(IOException iOException) {
        this.A01 = true;
        this.A03.A01.markerEnd(42991646, this.A02, 3);
        throw iOException;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C241173Oe(1LU r3, OutputStream outputStream, int i) {
        super(outputStream);
        this.A03 = r3;
        this.A02 = i;
    }

    public final void close() {
        int i;
        if (!this.A01 && (i = this.A02) != 0) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(42991646, i, "written_bytes", this.A00);
            lightweightQuickPerformanceLogger.markerEnd(42991646, i, 2);
        }
        try {
            super.close();
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void write(int i) {
        try {
            super.write(i);
            this.A00++;
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            super.write(bArr, i, i2);
            this.A00 += (long) i2;
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void write(byte[] bArr) {
        try {
            super.write(bArr);
            this.A00 += (long) bArr.length;
        } catch (IOException e) {
            A00(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
