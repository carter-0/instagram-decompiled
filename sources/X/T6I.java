package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;

public final class T6I implements 1Qd {
    public long A00;
    public 2ZL A01;
    public ByteArrayOutputStream A02;
    public final 2IR A03;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        ByteArrayOutputStream byteArrayOutputStream = this.A02;
        if (byteArrayOutputStream != null) {
            JTU.A1I(byteArrayOutputStream, byteBuffer);
        }
    }

    public final void onResponseStarted(2ZD r6) {
        long j;
        0qQ.A0B(r6, 0);
        1Fn A002 = r6.A00("Content-Length");
        if (A002 != null) {
            try {
                String str = A002.A01;
                0qQ.A06(str);
                Long A10 = AnonymousClass7TE.A10(str);
                if (A10 != null) {
                    j = A10.longValue();
                } else {
                    j = 0;
                }
                this.A00 = j;
            } catch (NumberFormatException unused) {
            }
        }
        this.A02 = Pxe.A0b();
        int i = r6.A01;
        this.A01 = new 2ZL(r6.A02, Collections.unmodifiableList(r6.A03), i, r6.A00);
    }

    public final void onComplete() {
        2ZL r4 = this.A01;
        ByteArrayOutputStream byteArrayOutputStream = this.A02;
        if (r4 == null || byteArrayOutputStream == null) {
            this.A03.onFailure(JTO.A0u("Failed to get response"));
            return;
        }
        r4.A00 = new C296015pJ(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), this.A00);
        this.A03.onSuccess(C12791T7b.A00(r4));
    }

    public final void onFailed(IOException iOException) {
        this.A03.onFailure(JTO.A0u("Failed to get response"));
    }

    public T6I(2IR r1) {
        this.A03 = r1;
    }
}
