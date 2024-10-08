package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6u2  reason: invalid class name */
public final class AnonymousClass6u2 implements 1Qd {
    public long A00;
    public long A01;
    public final /* synthetic */ 1JG A02;
    public final /* synthetic */ C331897Sw A03;
    public final /* synthetic */ ByteArrayOutputStream A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        long remaining = this.A01 + ((long) byteBuffer.remaining());
        this.A01 = remaining;
        long j = this.A00;
        if (j > 0) {
            11Z.A02(new AnonymousClass6u3(this.A03, this.A06, this.A07, C229632nm.A02(((float) remaining) / ((float) j), 0.0f, 1.0f)));
        }
        this.A04.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public final void onResponseStarted(2ZD r3) {
        0qQ.A0B(r3, 0);
        1Fn A002 = r3.A00("Content-Length");
        if (A002 != null) {
            try {
                String str = A002.A01;
                0qQ.A06(str);
                this.A00 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
    }

    public AnonymousClass6u2(1JG r1, C331897Sw r2, ByteArrayOutputStream byteArrayOutputStream, Runnable runnable, String str, String str2, boolean z, boolean z2) {
        this.A04 = byteArrayOutputStream;
        this.A03 = r2;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = r1;
        this.A05 = runnable;
        this.A09 = z;
        this.A08 = z2;
    }

    public final void onComplete() {
        C331897Sw r3 = this.A03;
        C331897Sw r0 = C331897Sw.A0A;
        ExecutorService executorService = r3.A07;
        1JG r2 = this.A02;
        String str = this.A06;
        executorService.execute(new C321386u4(r2, r3, this.A04, this.A05, str, this.A07, this.A09, this.A08));
    }

    public final void onFailed(IOException iOException) {
        this.A05.run();
    }
}
