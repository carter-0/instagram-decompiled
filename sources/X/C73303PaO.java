package X;

import android.util.Pair;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

/* renamed from: X.PaO  reason: case insensitive filesystem */
public final class C73303PaO implements Runnable {
    public final AnonymousClass7SD A00;
    public final DirectThreadKey A01;
    public final /* synthetic */ C330287Me A02;

    public C73303PaO(C330287Me r1, AnonymousClass7SD r2, DirectThreadKey directThreadKey) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = directThreadKey;
    }

    public final void run() {
        0fh.A01("IgRunnableId.PRELOAD_MESSAGES", -2122690091);
        try {
            C330287Me r4 = this.A02;
            AnonymousClass7SD r3 = this.A00;
            ArrayList Aax = 1bJ.A00(r4.A06).Aax(this.A01, false);
            r4.A02 = new Pair(Aax, r4.A08.F03(r3, Aax));
        } finally {
            0fh.A00(1337915615);
        }
    }
}
