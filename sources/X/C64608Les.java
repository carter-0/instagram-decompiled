package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Les  reason: case insensitive filesystem */
public final class C64608Les implements 1Qd {
    public 2ZD A00;
    public final File A01;
    public final FileOutputStream A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 1IX A07;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        JTU.A1I(this.A02, byteBuffer);
    }

    public C64608Les(File file, String str, String str2, String str3, 1IX r6, int i) {
        this.A07 = r6;
        this.A03 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = file;
        this.A02 = JTO.A0t(file);
    }

    public final void onComplete() {
        this.A02.close();
        2ZD r0 = this.A00;
        if (r0 == null || r0.A01 != 200) {
            this.A07.resumeWith(JTU.A0c(JTO.A0u(002.A0R(AnonymousClass000.A00(1043), this.A06))));
            return;
        }
        this.A07.EJ1((0sP) null, new C381809cM(JTP.A0t(this.A01), this.A04, this.A05, this.A03));
    }

    public final void onFailed(IOException iOException) {
        this.A02.close();
        1IX r2 = this.A07;
        if (iOException == null) {
            iOException = JTO.A0u(002.A0R(AnonymousClass000.A00(1043), this.A06));
        }
        r2.resumeWith(JTO.A1B(iOException));
    }

    public final void onResponseStarted(2ZD r1) {
        this.A00 = r1;
    }
}
