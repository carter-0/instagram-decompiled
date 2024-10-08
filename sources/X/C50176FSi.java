package X;

import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;
import java.lang.ref.WeakReference;

/* renamed from: X.FSi  reason: case insensitive filesystem */
public final class C50176FSi implements C253613r5 {
    public final String A00;
    public final WeakReference A01;

    public final void DCi(PandoError pandoError) {
    }

    public final /* bridge */ /* synthetic */ void DvP(Summary summary, Object obj) {
        C307446Qd r2 = (C307446Qd) this.A01.get();
        if (r2 != null) {
            C307446Qd.A03(new Q4K(r2, obj, this.A00));
        }
    }

    public C50176FSi(C307446Qd r2, String str) {
        this.A01 = new WeakReference(r2);
        this.A00 = str;
    }
}
