package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

public final class TKN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C13754TgQ A03;
    public final /* synthetic */ File A04;

    public TKN(C13754TgQ tgQ, File file, int i, int i2, int i3) {
        this.A04 = file;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = tgQ;
    }

    public final void run() {
        Medium A032 = C282665Eg.A03(this.A04, 3, 0);
        int i = this.A01;
        int i2 = this.A00;
        A032.A0B = i;
        A032.A04 = i2;
        C349307zv r2 = new C349307zv(A032, i, i2, 0);
        int i3 = this.A02;
        r2.A07 = i3;
        r2.A0H = 0;
        r2.A06 = i3;
        this.A03.DtS(r2, i3);
    }
}
