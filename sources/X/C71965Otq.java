package X;

/* renamed from: X.Otq  reason: case insensitive filesystem */
public final class C71965Otq implements C232262tL {
    public final String A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "setting_header";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C71965Otq otq = (C71965Otq) obj;
        0qQ.A0B(otq, 0);
        if (!0qQ.A0K(this.A00, otq.A00) || !0qQ.A0K(this.A01, otq.A01)) {
            return false;
        }
        return true;
    }

    public C71965Otq(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
