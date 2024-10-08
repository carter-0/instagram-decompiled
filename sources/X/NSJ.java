package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

public final class NSJ extends 0ng {
    public final /* synthetic */ C300205wi A00;
    public final /* synthetic */ C296065pO A01;
    public final /* synthetic */ byte[] A02;

    public final void run() {
        try {
            C296065pO r7 = this.A01;
            byte[] bArr = this.A02;
            int length = bArr.length;
            long j = r7.A00 + ((long) length);
            r7.A00 = j;
            if (j <= 104857600) {
                r7.A05.A01(bArr, false);
                Execution.executeAsync(new C68347NBj(r7, length), (AccountSession) null, 3);
                if (r7.A00 < r7.A01.longValue()) {
                    Execution.executeAsync(new NBR(r7), (AccountSession) null, 3);
                    return;
                }
                return;
            }
            throw new IOException("Maximum upload size exceeded");
        } catch (IOException e) {
            0KC.A0K(C273654mx.A00(1285), "Failed to update streaming DataTask.", e);
            throw new RejectedExecutionException("Failed to update streaming DataTask.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSJ(C300205wi r5, C296065pO r6, byte[] bArr) {
        super(1338936892, 3, true, false);
        this.A00 = r5;
        this.A01 = r6;
        this.A02 = bArr;
    }
}
