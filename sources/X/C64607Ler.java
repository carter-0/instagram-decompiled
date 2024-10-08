package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Ler  reason: case insensitive filesystem */
public final class C64607Ler implements 1Qd {
    public 2ZD A00;
    public final File A01;
    public final FileOutputStream A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 1IX A05;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        JTU.A1I(this.A02, byteBuffer);
    }

    public C64607Ler(AnonymousClass839 r3, String str, String str2, String str3, 1IX r7) {
        this.A05 = r7;
        this.A03 = str2;
        this.A04 = str3;
        File A002 = r3.A00(str);
        if (!A002.exists()) {
            A002.createNewFile();
        }
        this.A01 = A002;
        this.A02 = JTO.A0t(A002);
    }

    public final void onComplete() {
        this.A02.close();
        2ZD r0 = this.A00;
        if (r0 == null || r0.A01 != 200) {
            this.A05.resumeWith(JTU.A0c(JTO.A0u(002.A0R("Unable to synthesize ", this.A04))));
        } else {
            this.A05.EJ1((0sP) null, AnonymousClass7TE.A1L(this.A03, this.A01));
        }
    }

    public final void onFailed(IOException iOException) {
        this.A02.close();
        1IX r2 = this.A05;
        if (iOException == null) {
            iOException = JTO.A0u(002.A0R("Unable to synthesize ", this.A04));
        }
        r2.resumeWith(JTO.A1B(iOException));
    }

    public final void onResponseStarted(2ZD r1) {
        this.A00 = r1;
    }
}
