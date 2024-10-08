package X;

import android.content.Context;

/* renamed from: X.Aq2  reason: case insensitive filesystem */
public final class C41204Aq2 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ MVB A01;
    public final /* synthetic */ C310336ap A02;
    public final /* synthetic */ Integer A03;

    public C41204Aq2(Context context, MVB mvb, C310336ap r3, Integer num) {
        this.A02 = r3;
        this.A00 = context;
        this.A03 = num;
        this.A01 = mvb;
    }

    public final void run() {
        1xC r3 = 1xC.A01;
        C310336ap r2 = this.A02;
        r2.A0L = true;
        r2.A0G = AnonymousClass7TE.A16(this.A00, this.A03.intValue());
        r2.A0A(this.A01);
        r3.A00(new AnonymousClass3GP(r2.A00()));
    }
}
