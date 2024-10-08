package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;

/* renamed from: X.5v4  reason: invalid class name and case insensitive filesystem */
public final class C299385v4 implements 1Qd {
    public long A00;
    public C296005pI A01;
    public final DataTask A02;
    public final AnonymousClass5v3 A03;
    public final ByteArrayOutputStream A04 = new ByteArrayOutputStream();

    public final void onComplete() {
        C296005pI r4 = this.A01;
        if (r4 != null) {
            r4.A01.A00 = new C296015pJ(new ByteArrayInputStream(this.A04.toByteArray()), this.A00);
            this.A03.A00(r4);
            return;
        }
        this.A03.onFail(new C268664dn(new IOException("HttpResponse was not present.")));
    }

    public final void onFailed(IOException iOException) {
        this.A03.onFail(new C268664dn(iOException));
    }

    public final void onNewData(ByteBuffer byteBuffer) {
        C299365v1 r6 = this.A03.A01;
        DataTask dataTask = r6.A00;
        if (dataTask.mTaskType == 0 && dataTask.mTaskMode == 1) {
            C296005pI r5 = this.A01;
            if (r5 != null) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, 0, byteBuffer.remaining());
                Execution.executeAsync(new C68346NBh(new C268674do(new C296045pM(r5.A00, (File) null, bArr)), r6), (AccountSession) null, 3);
                return;
            }
            return;
        }
        this.A04.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public final void onResponseStarted(2ZD r6) {
        1Fn A002 = r6.A00("Content-Length");
        if (A002 != null) {
            try {
                this.A00 = Long.parseLong(A002.A01);
            } catch (NumberFormatException unused) {
            }
        }
        int i = r6.A01;
        this.A01 = new C296005pI(this.A02.mUrlRequest, new 2ZL(r6.A02, Collections.unmodifiableList(r6.A03), i, r6.A00));
    }

    public C299385v4(DataTask dataTask, AnonymousClass5v3 r3) {
        this.A03 = r3;
        this.A02 = dataTask;
    }
}
