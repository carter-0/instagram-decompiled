package X;

/* renamed from: X.VzA  reason: case insensitive filesystem */
public final class C18731VzA {
    public C18035VkF A00;
    public boolean A01 = false;
    public final X69 A02;
    public final C17186VLq A03;

    public static void A00(C18731VzA vzA) {
        C18035VkF vkF = vzA.A00;
        if (vkF.A01) {
            C17617Vb9 vb9 = vzA.A03.A00;
            vb9.A02 = true;
            WM2 A002 = C18436Vrf.A00(vb9.A04.A04);
            A002.A00.remove(vb9.A05);
            return;
        }
        X6B x6b = (X6B) vkF.A00;
        if (x6b == null) {
            A01(vzA, (Object) null);
            return;
        }
        x6b.EJW(new C19109WLq(x6b, vzA), vzA.A03, (WLK) null);
    }

    public static void A01(C18731VzA vzA, Object obj) {
        vzA.A00 = vzA.A02.CrY(obj);
        A00(vzA);
    }

    public C18731VzA(X69 x69, C17186VLq vLq) {
        this.A03 = vLq;
        this.A02 = x69;
        A01(this, (Object) null);
    }
}
