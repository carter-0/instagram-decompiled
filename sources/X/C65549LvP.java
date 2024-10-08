package X;

import java.util.Map;

/* renamed from: X.LvP  reason: case insensitive filesystem */
public final class C65549LvP implements C239283Fv {
    public final C239283Fv A00;
    public final Map A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C51763G0f(this, 0));

    public C65549LvP(C239283Fv r4, Map map) {
        0qQ.A0B(r4, 1);
        this.A00 = r4;
        this.A01 = map;
    }

    public final AnonymousClass0r6 BOP(String str, long j) {
        0qQ.A0B(str, 0);
        return new MC4(str, Aap(), j);
    }

    public final AnonymousClass0r6 C1k(String str, String str2) {
        0qQ.A0B(str, 0);
        return new MC5(str, str2, Aap());
    }

    public final C262294Dd AR3() {
        return this.A00.AR3();
    }

    public final AnonymousClass0r6 Aap() {
        return (AnonymousClass0r6) this.A02.getValue();
    }

    public final AnonymousClass0r6 AJX(String str) {
        return new C51623FxC(Aap(), 15);
    }

    public final AnonymousClass0r6 Agv(String str, boolean z) {
        return new MC7(this, str, Aap(), z);
    }

    public final AnonymousClass0r6 BI4(String str, int i) {
        return new MC6(this, Aap(), str, 0);
    }
}
