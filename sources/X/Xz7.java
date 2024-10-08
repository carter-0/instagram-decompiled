package X;

import android.net.Uri;
import java.io.IOException;

public final class Xz7 implements C266204Xy {
    public final int A00;
    public final long A01 = AnonymousClass4Y0.A03.getAndIncrement();
    public final C257263x7 A02;
    public final C266214Xz A03;
    public final C256363ve A04;
    public volatile Object A05;

    public final void AGO() {
    }

    public final void Cg1() {
        C266214Xz r3 = this.A03;
        r3.A00 = 0;
        XQY xqy = new XQY(r3, this.A02);
        try {
            if (!xqy.A00) {
                xqy.A03.open(xqy.A04);
                xqy.A00 = true;
            }
            Uri uri = r3.getUri();
            uri.getClass();
            this.A05 = this.A04.E1j(uri, xqy);
        } finally {
            try {
                xqy.close();
            } catch (IOException unused) {
            }
        }
    }

    public Xz7(C257113ws r3, C257263x7 r4, C256363ve r5, int i) {
        this.A03 = new C266214Xz(r3);
        this.A02 = r4;
        this.A00 = i;
        this.A04 = r5;
    }
}
