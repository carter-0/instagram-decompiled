package X;

import android.util.LruCache;

/* renamed from: X.WgZ  reason: case insensitive filesystem */
public final class C19854WgZ implements C20990X8g, AnonymousClass6QN {
    public final C16403UuL A00;
    public final AnonymousClass0eM A01;
    public final C16401UuJ A02;
    public final C16402UuK A03;
    public final /* synthetic */ C19855Wga A04;

    public final boolean BO9() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int BOz() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CCO() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getMarkerId() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C19854WgZ(C19855Wga wga) {
        this.A04 = wga;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A03, new C58677Ivm(wga, 15));
        this.A01 = A002;
        this.A00 = new C16403UuL((LruCache) A002.getValue(), wga);
        this.A03 = new C16402UuK((LruCache) this.A01.getValue(), wga);
        this.A02 = new C16401UuJ((LruCache) this.A01.getValue(), wga);
    }
}
