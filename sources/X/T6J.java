package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class T6J implements 1Qd {
    public 2ZD A00;
    public final ByteArrayOutputStream A01 = Pxe.A0b();
    public final /* synthetic */ C10522Rtb A02;
    public final /* synthetic */ C7313Q3p A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Executor A05;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        JTU.A1I(this.A01, byteBuffer);
    }

    public T6J(C10522Rtb rtb, C7313Q3p q3p, String str, Executor executor) {
        this.A05 = executor;
        this.A02 = rtb;
        this.A03 = q3p;
        this.A04 = str;
    }

    public final void onComplete() {
        this.A05.execute(new C13066TJw(this.A02, this, this.A03, this.A04));
    }

    public final void onFailed(IOException iOException) {
        this.A05.execute(new TJB(this.A02, this.A03, iOException));
    }

    public final void onResponseStarted(2ZD r1) {
        this.A00 = r1;
    }
}
