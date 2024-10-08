package X;

import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;

/* renamed from: X.3r4  reason: invalid class name and case insensitive filesystem */
public final class C253603r4 implements C253613r5 {
    public final 2Kw A00;
    public final AnonymousClass2Kv A01;
    public final Throwable A02;

    public /* synthetic */ C253603r4(2Kw r3, AnonymousClass2Kv r4) {
        Throwable th = new Throwable();
        0qQ.A0B(r4, 1);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = th;
    }

    public final void DCi(PandoError pandoError) {
        2Kw r3 = this.A00;
        if (r3 != null) {
            r3.invoke(new Throwable(pandoError.message, this.A02));
        }
    }

    public final void DvP(Summary summary, Object obj) {
        this.A01.invoke(new C254583si(summary, obj));
    }
}
