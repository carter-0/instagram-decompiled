package X;

import java.util.UUID;

/* renamed from: X.6D8  reason: invalid class name */
public final class AnonymousClass6D8 {
    public final C270284gU A00 = new AnonymousClass5TX((C284895Os) null, new C377199Kx(this, 46));
    public final C270284gU A01 = new AnonymousClass5TX((C284895Os) null, new C377199Kx(this, 47));
    public final C270284gU A02 = new AnonymousClass5TX((C284895Os) null, new C377199Kx(this, 48));
    public final C270284gU A03 = new AnonymousClass5TX((C284895Os) null, new C377199Kx(this, 49));
    public final AnonymousClass6C3 A04;
    public final String A05;

    public AnonymousClass6D8(AnonymousClass6C3 r4) {
        0qQ.A0B(r4, 1);
        this.A04 = r4;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A05 = obj;
    }

    public final void A00() {
        C53341GmR gmR;
        AnonymousClass6C3 r5 = this.A04;
        String str = this.A05;
        C284945Oz r2 = r5.A07;
        if (!0qQ.A0K(r2.getValue(), str) && (gmR = (C53341GmR) r5.A0B.get(str)) != null) {
            r5.A04 = true;
            r2.Epw(str);
            r5.A02 = gmR.A01;
            r5.A01 = gmR.A00;
            r5.A00 = gmR.A00();
            r5.A03 = false;
        }
    }
}
