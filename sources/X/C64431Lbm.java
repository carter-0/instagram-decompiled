package X;

import java.util.List;

/* renamed from: X.Lbm  reason: case insensitive filesystem */
public final class C64431Lbm implements C13713Tfb {
    public final /* synthetic */ LFO A00;
    public final /* synthetic */ C252683pV A01;

    public C64431Lbm(LFO lfo, C252683pV r2) {
        this.A01 = r2;
        this.A00 = lfo;
    }

    public final void Db0(C8918RFl rFl) {
        C252683pV r3 = this.A01;
        r3.FIG(new C61130Jxg(rFl, rFl.A00));
        r3.AI3((Throwable) null);
    }

    public final void Db2(C61073JwB jwB) {
        C252683pV r3 = this.A01;
        r3.FIG(C64483Lck.A00);
        C61071Jw9 jw9 = LNj.A01;
        ((List) jw9.A04).clear();
        jw9.A02 = true;
        jw9.A01 = null;
        jw9.A00 = AnonymousClass05K.A00;
        r3.AI3((Throwable) null);
    }
}
