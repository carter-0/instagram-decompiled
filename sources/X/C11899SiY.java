package X;

import java.io.InputStream;

/* renamed from: X.SiY  reason: case insensitive filesystem */
public final class C11899SiY implements C13694TfC {
    public final RC9 A00;

    public final /* bridge */ /* synthetic */ Object EJO() {
        RC9 rc9 = this.A00;
        rc9.reset();
        return rc9;
    }

    public final void cleanup() {
        this.A00.A01();
    }

    public C11899SiY(ST0 st0, InputStream inputStream) {
        RC9 rc9 = new RC9(st0, inputStream);
        this.A00 = rc9;
        rc9.mark(5242880);
    }
}
