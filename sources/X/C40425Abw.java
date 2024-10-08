package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.Abw  reason: case insensitive filesystem */
public final class C40425Abw implements C66478MTg {
    public final /* synthetic */ C357738Zk A00;
    public final /* synthetic */ C349307zv A01;
    public final /* synthetic */ File A02;

    public final void DEa(IOException iOException) {
        0qQ.A0B(iOException, 0);
        AnonymousClass8E3 r0 = this.A00.A0F;
        r0.A00.A14.A04(this.A01);
        0kD.A05("MusicPrecaptureController", AnonymousClass000.A00(948), iOException);
    }

    public final void Dob(File file) {
        0qQ.A0B(file, 0);
        long currentTimeMillis = System.currentTimeMillis();
        C349307zv r0 = this.A01;
        int i = r0.A0K;
        int i2 = r0.A08;
        int i3 = r0.A09;
        String str = r0.A0f;
        File file2 = this.A02;
        C349307zv r1 = new C349307zv(file2, (Integer) null, str, i, i2, i3, currentTimeMillis, currentTimeMillis, false, false, true);
        r1.A01 = r0.A01;
        int A012 = AIF.A01(file2.getPath());
        r1.A07 = A012;
        r1.A0H = 0;
        r1.A06 = A012;
        r1.A19 = true;
        this.A00.A0F.A00.A14.A04(r1);
    }

    public C40425Abw(C357738Zk r1, C349307zv r2, File file) {
        this.A01 = r2;
        this.A02 = file;
        this.A00 = r1;
    }
}
