package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Mgd  reason: case insensitive filesystem */
public final class C67005Mgd implements AnonymousClass2tH {
    public static final Executor A02 = new C67008Mgg();
    public C231452rh A00 = new Object();
    public final C231422re A01;

    public final List Au8() {
        return this.A01.A02;
    }

    public final void Eyp(ViewModelListUpdate viewModelListUpdate, AnonymousClass2tB r5) {
        this.A01.A01(00k.A0a(viewModelListUpdate.A00), new C67006Mge(this, r5));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2rh] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.3ot] */
    public C67005Mgd(C61480nO r5, Executor executor) {
        this.A01 = new C231422re(new C231472rj(new Object(), executor, new C67007Mgf(r5)), (C231452rh) new XEU(this));
    }

    public final void EcF(C231452rh r1) {
        this.A00 = r1;
    }
}
