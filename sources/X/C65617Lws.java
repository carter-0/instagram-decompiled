package X;

/* renamed from: X.Lws  reason: case insensitive filesystem */
public final class C65617Lws implements C336227eH {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C65617Lws(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public final 1OC AMt(String str) {
        if (this.A00 != 0) {
            0qQ.A0B(str, 0);
            return FGQ.A03(((C65614Lwp) this.A01).A03, this.A02, str, this.A03);
        }
        String str2 = this.A03;
        String str3 = this.A02;
        1NY A0O = DbU.A0O((0lg) this.A01);
        A0O.A0A("direct_v2/direct_invite_category/");
        A0O.A0F = str2;
        A0O.A0R(CGZ.class, D13.class);
        return DbT.A0T(A0O, "category", str3);
    }
}
