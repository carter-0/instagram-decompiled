package X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: X.3Ev  reason: invalid class name and case insensitive filesystem */
public final class C239093Ev extends 0ng {
    public final String A00;
    public final /* synthetic */ 1JS A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C239093Ev(1JS r2, String str) {
        super(427);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void run() {
        try {
            1JS r2 = this.A01;
            Writer writer = r2.A01;
            if (writer != null) {
                writer.write(this.A00);
                r2.A01.flush();
                int i = r2.A00 + 1;
                r2.A00 = i;
                if (i > r2.A02) {
                    r2.A04.ATE(new EHm(r2));
                }
            }
        } catch (IOException unused) {
        }
    }
}
