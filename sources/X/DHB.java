package X;

import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class DHB implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ DirectPendingLayeredXma A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ DHB(AnonymousClass7Z6 r1, 1Xj r2, DirectPendingLayeredXma directPendingLayeredXma, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.A00 = r1;
        this.A08 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = directPendingLayeredXma;
        this.A01 = r2;
        this.A09 = z2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A08;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = this.A06;
        String str5 = this.A07;
        DirectPendingLayeredXma directPendingLayeredXma = this.A02;
        1Xj r8 = this.A01;
        boolean z2 = this.A09;
        C66665MaY A052 = C66669Mac.A05(r0.A00, oDs, C65621em.class, str, z);
        long A0H = AnonymousClass7TG.A0H();
        String A2Z = r8.A2Z();
        DirectThreadKey directThreadKey2 = directThreadKey;
        0qQ.A0B(directThreadKey2, 2);
        1bp r82 = new 1bp(A052, directThreadKey2, l, A0H);
        r82.A01 = directThreadKey2;
        r82.A02 = str2;
        r82.A05 = str3;
        r82.A00 = directPendingLayeredXma;
        r82.A04 = str4;
        r82.A06 = str5;
        r82.A03 = A2Z;
        r82.A07 = z2;
        return r82;
    }
}
