package X;

import android.content.Context;
import java.nio.charset.Charset;

public final /* synthetic */ class AX8 implements C3734495k {
    public final Context A00;
    public final C3734195g A01;

    public AX8(Context context, C3734195g r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final Object get() {
        C3734195g r5 = this.A01;
        Context context = this.A00;
        C3734195g.A01(r5);
        String A002 = C3735896d.A00(r5.A04.getBytes(Charset.defaultCharset()));
        C3734195g.A01(r5);
        return new C3735996e(context, (C3735295v) r5.A02.A03(C3735295v.class), 002.A0g(A002, "+", C3735896d.A00(r5.A01.A00.getBytes(Charset.defaultCharset()))));
    }
}
