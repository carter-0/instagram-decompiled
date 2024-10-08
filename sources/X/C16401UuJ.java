package X;

import android.util.LruCache;
import java.util.concurrent.ExecutorService;

/* renamed from: X.UuJ  reason: case insensitive filesystem */
public final class C16401UuJ extends WHW implements C20990X8g, X7E {
    public final C19855Wga A00;
    public final /* synthetic */ C19855Wga A01;
    public final /* synthetic */ C19855Wga A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16401UuJ(LruCache lruCache, C19855Wga wga) {
        super(lruCache, wga);
        0qQ.A0B(lruCache, 2);
        this.A01 = wga;
        this.A02 = wga;
        this.A00 = wga;
    }

    public final boolean BO9() {
        return this.A01.BO9();
    }

    public final int BOz() {
        return this.A01.BOz();
    }

    public final VQB BiT() {
        return this.A02.BiT();
    }

    public final ExecutorService BsU() {
        return this.A02.BsU();
    }

    public final boolean CCO() {
        return this.A01.CCO();
    }

    public final int getMarkerId() {
        return this.A01.getMarkerId();
    }
}
