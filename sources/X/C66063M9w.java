package X;

import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.M9w  reason: case insensitive filesystem */
public final class C66063M9w implements Runnable {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ 1OS A01;
    public final /* synthetic */ C65661fY A02;
    public final /* synthetic */ PendingMediaStore A03;
    public final /* synthetic */ String A04;

    public C66063M9w(C74551Pwk pwk, 1OS r2, C65661fY r3, PendingMediaStore pendingMediaStore, String str) {
        this.A03 = pendingMediaStore;
        this.A04 = str;
        this.A00 = pwk;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass3Q2 A032 = this.A03.A03(this.A04);
        if (A032 == null) {
            C74551Pwk pwk = this.A00;
            C270214gN r2 = C63565KzE.A02;
            C3265677h.A0Z(pwk.B3j(), AnonymousClass05K.A0N);
            pwk.DTM(r2, (String) null);
            return;
        }
        C65528Lur lur = new C65528Lur(this);
        A032.A0Y(lur);
        lur.DaJ(A032);
    }
}
