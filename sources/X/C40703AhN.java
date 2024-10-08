package X;

/* renamed from: X.AhN  reason: case insensitive filesystem */
public final class C40703AhN implements C41824B2f {
    public final /* synthetic */ AGt A00;
    public final /* synthetic */ String A01;

    public C40703AhN(AGt aGt, String str) {
        this.A00 = aGt;
        this.A01 = str;
    }

    public final void D6B(boolean z, String str) {
        AGt aGt = this.A00;
        C39700A5q a5q = new C39700A5q(false, str);
        aGt.A01 = a5q;
        aGt.A0C.put(this.A01, a5q);
        AGt.A00(aGt);
    }

    public final void D6C(String str) {
        AGt aGt = this.A00;
        C39700A5q a5q = new C39700A5q(true, str);
        aGt.A01 = a5q;
        aGt.A0C.put(this.A01, a5q);
        AGt.A00(aGt);
    }

    public final void onFinish() {
        AGt aGt = this.A00;
        aGt.A00 = null;
        aGt.A05.removeCallbacks(aGt.A0B);
        if (aGt.A04) {
            AGt.A01(aGt);
        }
    }
}
