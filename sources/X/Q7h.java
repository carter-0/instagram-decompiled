package X;

import android.os.FileObserver;

public final class Q7h extends FileObserver {
    public final /* synthetic */ 1Uf A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass0eK A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7h(1Uf r2, String str, String str2, AnonymousClass0eK r5) {
        super(str, 2);
        this.A00 = r2;
        this.A01 = str2;
        this.A02 = r5;
    }

    public final void onEvent(int i, String str) {
        1Uf r0 = this.A00;
        String str2 = this.A01;
        r0.A02.put(str2, new 1Uo(str2, r0.A04, this.A02, r0.A00, r0.A06));
    }
}
