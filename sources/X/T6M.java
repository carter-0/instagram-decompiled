package X;

import com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

public final class T6M implements 1Qd {
    public Object A00;
    public final int A01 = 1;
    public final Object A02;

    public T6M(ZeroBalanceDetectionIg4aHttpRequest zeroBalanceDetectionIg4aHttpRequest, 1IX r3) {
        this.A00 = r3;
        this.A02 = zeroBalanceDetectionIg4aHttpRequest;
    }

    public final void onComplete() {
        if (this.A01 != 0) {
            RAG rag = new RAG(this, (C11223SFx) this.A02);
            0no A002 = 0no.A00();
            0qQ.A07(A002);
            A002.A01(rag, 0);
        }
    }

    public final void onFailed(IOException iOException) {
        AnonymousClass4D7 r2;
        C56067HsG A1B;
        if (this.A01 != 0) {
            RAH rah = new RAH((C11223SFx) this.A02, iOException);
            0no A002 = 0no.A00();
            0qQ.A07(A002);
            A002.A01(rah, 0);
            return;
        }
        if (iOException instanceof SocketTimeoutException) {
            0KC.A0F("Zero_ZeroBalanceDetectionIg4aHttpRequest", "call to AsyncHttpService failed with SocketTimeoutException", iOException);
        } else if (iOException != null) {
            0KC.A0F("Zero_ZeroBalanceDetectionIg4aHttpRequest", "call to AsyncHttpService failed with exception", iOException);
            r2 = (AnonymousClass4D7) this.A00;
            A1B = JTO.A1B(iOException);
            r2.resumeWith(A1B);
        }
        r2 = (AnonymousClass4D7) this.A00;
        A1B = new C56067HsG(-1);
        r2.resumeWith(A1B);
    }

    public final void onNewData(ByteBuffer byteBuffer) {
    }

    public final void onResponseStarted(2ZD r4) {
        int i;
        if (this.A01 != 0) {
            this.A00 = r4;
            return;
        }
        AnonymousClass4D7 r2 = (AnonymousClass4D7) this.A00;
        if (r4 == null) {
            i = -1;
        } else {
            i = r4.A01;
        }
        r2.resumeWith(new C56067HsG(i));
    }

    public T6M(C11223SFx sFx) {
        this.A02 = sFx;
    }
}
