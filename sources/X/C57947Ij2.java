package X;

import java.util.List;

/* renamed from: X.Ij2  reason: case insensitive filesystem */
public final class C57947Ij2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C55640Hkz A02;
    public final /* synthetic */ List A03;

    public C57947Ij2(AnonymousClass0iw r1, C55640Hkz hkz, List list, int i) {
        this.A03 = list;
        this.A00 = i;
        this.A02 = hkz;
        this.A01 = r1;
    }

    public final void run() {
        C240923Ne.A01((C376699Iz) this.A03.get(this.A00), this.A01, this.A02.A01);
    }
}
