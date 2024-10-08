package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.Callable;

/* renamed from: X.Asl  reason: case insensitive filesystem */
public final class C41364Asl implements Callable {
    public final /* synthetic */ AnonymousClass9JH A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ C254933tI A02;
    public final /* synthetic */ C333537Zi A03;
    public final /* synthetic */ OCA A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ C352218Cl A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public C41364Asl(AnonymousClass9JH r1, C53401GnY gnY, C254933tI r3, C333537Zi r4, OCA oca, DirectThreadKey directThreadKey, AnonymousClass3Q2 r7, C352218Cl r8, Boolean bool, String str, String str2, String str3, boolean z) {
        this.A03 = r4;
        this.A01 = gnY;
        this.A05 = directThreadKey;
        this.A0C = z;
        this.A02 = r3;
        this.A0B = str;
        this.A04 = oca;
        this.A0A = str2;
        this.A09 = str3;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = bool;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C333537Zi r1 = this.A03;
        C53401GnY gnY = this.A01;
        DirectThreadKey directThreadKey = this.A05;
        boolean z = this.A0C;
        C254933tI r6 = this.A02;
        String str = this.A0B;
        OCA oca = this.A04;
        String str2 = this.A0A;
        String str3 = this.A09;
        C333537Zi.A01(gnY, r6, r1, oca, directThreadKey, str, str2, str3, new C58241Ioj(r1, this.A07, directThreadKey, this.A06, this.A00, r6, this.A08, gnY, oca, str2, str, str3, 0, z), z);
        return C60340gF.A00;
    }
}
