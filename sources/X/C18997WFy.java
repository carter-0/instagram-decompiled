package X;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: X.WFy  reason: case insensitive filesystem */
public final class C18997WFy implements X8F {
    public final VJR A00;
    public final AnonymousClass1Sl A01;
    public final String A02;
    public volatile C17299VQa A03 = new C17299VQa((X8F) null, (File) null);

    public final synchronized X8F A00() {
        X8F x8f;
        File file;
        C17299VQa vQa = this.A03;
        if (vQa.A00 == null || (file = vQa.A01) == null || !file.exists()) {
            if (!(this.A03.A00 == null || this.A03.A01 == null)) {
                0Gw.A02(this.A03.A01);
            }
            File file2 = new File((File) this.A01.get(), this.A02);
            try {
                C9247RUy.A00(file2);
                file2.getAbsolutePath();
                this.A03 = new C17299VQa(new C18998WFz(this.A00, file2), file2);
            } catch (RCG e) {
                throw e;
            }
        }
        x8f = this.A03.A00;
        x8f.getClass();
        return x8f;
    }

    public C18997WFy(VJR vjr, AnonymousClass1Sl r4, String str) {
        this.A00 = vjr;
        this.A01 = r4;
        this.A02 = str;
    }

    public final void AHR() {
        A00().AHR();
    }

    public final Collection B1v() {
        return A00().B1v();
    }

    public final void E5C() {
        try {
            A00().E5C();
        } catch (IOException e) {
            0I1.A01(C18997WFy.class, "purgeUnexpectedResources", e);
        }
    }

    public final long ECz(C17847Vh0 vh0) {
        return A00().ECz(vh0);
    }
}
