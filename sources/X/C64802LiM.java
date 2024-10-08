package X;

/* renamed from: X.LiM  reason: case insensitive filesystem */
public final class C64802LiM implements C232262tL {
    public Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64802LiM liM = (C64802LiM) obj;
        0qQ.A0B(liM, 0);
        if (!0qQ.A0K(this.A04, liM.A04) || !0qQ.A0K(this.A05, liM.A05) || !0qQ.A0K(this.A01, liM.A01) || !0qQ.A0K(this.A03, liM.A03) || !0qQ.A0K(this.A02, liM.A02)) {
            return false;
        }
        return true;
    }

    public C64802LiM(Long l, Long l2, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(str4, 6);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = l;
        this.A00 = l2;
        this.A02 = str4;
    }
}
