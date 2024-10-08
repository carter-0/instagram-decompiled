package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OxM  reason: case insensitive filesystem */
public final class C72162OxM implements AnonymousClass67Q {
    public final /* synthetic */ C333537Zi A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ C352218Cl A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C72162OxM(C333537Zi r1, DirectThreadKey directThreadKey, C352218Cl r3, Boolean bool, String str, boolean z) {
        this.A00 = r1;
        this.A01 = directThreadKey;
        this.A02 = r3;
        this.A05 = z;
        this.A04 = str;
        this.A03 = bool;
    }

    public final void Eyr(AnonymousClass67Z r14) {
        0qQ.A0B(r14, 0);
        try {
            C333537Zi r2 = this.A00;
            DirectThreadKey directThreadKey = this.A01;
            C352218Cl r6 = this.A02;
            boolean z = this.A05;
            C333537Zi.A05((AnonymousClass9JH) null, (C254933tI) null, r2, (OCA) null, directThreadKey, (AnonymousClass3Q2) null, r6, this.A03, this.A04, (String) null, (String) null, z, false);
            r14.A02(new C72175Oxk(2));
        } catch (IllegalStateException e) {
            r14.A02(new C72176Oxl(e));
        }
        r14.A00();
    }
}
