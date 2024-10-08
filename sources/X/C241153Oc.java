package X;

import java.io.OutputStream;

/* renamed from: X.3Oc  reason: invalid class name and case insensitive filesystem */
public final class C241153Oc extends C241163Od {
    public final String A00;
    public final /* synthetic */ 1LP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C241153Oc(1LP r1, OutputStream outputStream, String str) {
        super(outputStream);
        this.A01 = r1;
        this.A00 = str;
    }

    public final void close() {
        this.A00.close();
        String str = this.A00;
        if (str != null) {
            this.A01.A01.add(str);
        }
    }
}
