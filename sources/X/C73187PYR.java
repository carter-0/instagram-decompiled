package X;

import android.app.Application;
import android.content.res.Resources;

/* renamed from: X.PYR  reason: case insensitive filesystem */
public final class C73187PYR implements Runnable {
    public final /* synthetic */ C266444Yx A00;
    public final /* synthetic */ C67716MtV A01;

    public C73187PYR(C266444Yx r1, C67716MtV mtV) {
        this.A01 = mtV;
        this.A00 = r1;
    }

    public final void run() {
        C67716MtV mtV = this.A01;
        Application A0D = mtV.A0D();
        Resources A0A = AnonymousClass7TF.A0A(mtV.A0D());
        C266444Yx r1 = this.A00;
        0qQ.A0B(r1, 1);
        C59689JTv.A09(A0D, r1.A00(A0A));
    }
}
