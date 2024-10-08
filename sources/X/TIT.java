package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class TIT implements Runnable {
    public final /* synthetic */ S6T A00;
    public final /* synthetic */ QLA A01;
    public final /* synthetic */ String A02;

    public TIT(S6T s6t, QLA qla, String str) {
        this.A00 = s6t;
        this.A01 = qla;
        this.A02 = str;
    }

    public final void run() {
        S6T s6t = this.A00;
        QLA qla = this.A01;
        String str = this.A02;
        Charset charset = StandardCharsets.UTF_8;
        0qQ.A08(charset);
        s6t.A01(qla, Pxf.A0p(Pxf.A1V(str, charset), 2));
    }
}
