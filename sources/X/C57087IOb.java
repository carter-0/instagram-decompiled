package X;

/* renamed from: X.IOb  reason: case insensitive filesystem */
public final class C57087IOb implements C232262tL {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0T(this.A01, this.A02, ':');
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C57087IOb iOb = (C57087IOb) obj;
        0qQ.A0B(iOb, 0);
        if (!0qQ.A0K(this.A02, iOb.A02) || !0qQ.A0K(this.A03, iOb.A03) || !0qQ.A0K(this.A00, iOb.A00)) {
            return false;
        }
        return true;
    }

    public C57087IOb(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public C57087IOb() {
        this("", "", "", "");
    }
}
