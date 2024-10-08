package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5pO  reason: invalid class name and case insensitive filesystem */
public final class C296065pO {
    public long A00;
    public Long A01;
    public final DataTask A02;
    public final NetworkSession A03;
    public final AnonymousClass1T9 A04;
    public final C8850RCq A05;
    public final 1HW A06;
    public final /* synthetic */ C300195wh A07;

    public C296065pO(DataTask dataTask, NetworkSession networkSession, 1HW r22, C300195wh r23) {
        C300195wh r3 = r23;
        this.A07 = r3;
        DataTask dataTask2 = dataTask;
        try {
            long j = dataTask2.mContentLength;
            Long valueOf = Long.valueOf(j);
            this.A01 = valueOf;
            if (j != 0) {
                1HW r9 = r22;
                this.A06 = r9;
                this.A00 = 0;
                this.A02 = dataTask2;
                NetworkSession networkSession2 = networkSession;
                this.A03 = networkSession2;
                C8850RCq rCq = new C8850RCq(r3.A01, 15000, valueOf.longValue());
                this.A05 = rCq;
                Execution.executeAsync(new NBi(this, r3), (AccountSession) null, 3);
                this.A04 = C299375v2.A00(dataTask2, r9, new C72586PBr(this), new C299365v1(dataTask2, networkSession2, r9, r3), (File) null, rCq);
                return;
            }
            throw new IOException("Content-Length cannot be empty for streaming upload");
        } catch (IOException e) {
            0KC.A0F("IgNetworkSession", "Error while initializing StreamingUploadDataTask", e);
            throw e;
        }
    }

    public static void A00(C296065pO r2) {
        try {
            r2.A05.close();
        } catch (IOException e) {
            0KC.A0J("IgNetworkSession", "Error while attempting to close StreamingUploadInputStream", e);
        }
    }
}
