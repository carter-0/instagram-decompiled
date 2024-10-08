package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.AYc  reason: case insensitive filesystem */
public final class C40263AYc implements AnonymousClass67Q {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ C333537Zi A01;
    public final /* synthetic */ OCA A02;
    public final /* synthetic */ C254743sy A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    public C40263AYc(C53401GnY gnY, C333537Zi r2, OCA oca, C254743sy r4, String str, String str2, String str3, List list, boolean z) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = gnY;
        this.A08 = z;
        this.A06 = str;
        this.A02 = oca;
        this.A05 = str2;
        this.A04 = str3;
        this.A07 = list;
    }

    public final void Eyr(AnonymousClass67Z r24) {
        AnonymousClass67Z r2 = r24;
        0qQ.A0B(r2, 0);
        DirectThreadKey A032 = C66647MaG.A03(this.A03);
        C333537Zi r5 = this.A01;
        C53401GnY gnY = this.A00;
        boolean z = this.A08;
        String str = this.A06;
        OCA oca = this.A02;
        String str2 = this.A05;
        String str3 = this.A04;
        C333537Zi.A01(gnY, (C254933tI) null, r5, oca, A032, str, str2, str3, new C41571Awd(gnY, r5, oca, A032, str, str2, str3, this.A07, z), z);
        r2.A02(new C72175Oxk(1));
        r2.A00();
    }
}
