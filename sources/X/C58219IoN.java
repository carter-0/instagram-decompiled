package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.IoN  reason: case insensitive filesystem */
public final class C58219IoN extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58219IoN(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = str;
        this.A03 = obj3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        IGAIAgentType iGAIAgentType;
        switch (this.A00) {
            case 0:
                C53325GmB gmB = (C53325GmB) this.A03;
                ((0sP) this.A04).invoke(gmB);
                int i = this.A01;
                String str = gmB.A06;
                C62949Kp1 kp1 = gmB.A00;
                String A012 = kp1.A01();
                String str2 = gmB.A05;
                String str3 = this.A05;
                ((LRW) this.A02).A02(kp1.A00(), Integer.valueOf(i), str, A012, str2, "home", str3, (String) null, gmB.A02, i);
                break;
            case 3:
                C51967G9n.A16((C284945Oz) this.A02, false);
                ((C284945Oz) this.A04).Epw(this.A05);
                C51967G9n.A15((C284945Oz) this.A03, this.A01);
                break;
            case 4:
                AnonymousClass8A0 r1 = (AnonymousClass8A0) this.A04;
                int i2 = this.A01;
                String str4 = this.A05;
                AnonymousClass8A0.A01(r1, (AnonymousClass89v) this.A02, (AnonymousClass51M) this.A03, str4, new AnonymousClass9NK(r1, 4), (0sL) null, (0sL) null, i2, false, false);
                break;
            default:
                LRW lrw = (LRW) this.A02;
                C53316Gm2 gm2 = (C53316Gm2) this.A03;
                C62949Kp1 kp12 = gm2.A00;
                String A032 = kp12.A03();
                0qQ.A0B(A032, 0);
                1Ln A002 = LRW.A00(lrw);
                if (DbT.A1Y(A002)) {
                    A002.A0l("your_ais_row_clicked");
                    A002.A0j(AnonymousClass7TE.A10(A032));
                    A002.A0v(lrw.A02);
                    A002.Cgf();
                }
                String str5 = gm2.A03;
                String A033 = kp12.A03();
                String str6 = gm2.A02;
                if (kp12 instanceof K0Y) {
                    iGAIAgentType = IGAIAgentType.A04;
                } else {
                    iGAIAgentType = IGAIAgentType.A08;
                }
                lrw.A02(iGAIAgentType, (Integer) null, A033, str6, str5, "seeAll", this.A05, (String) null, (String) null, this.A01);
                C51965G9l.A1W(this.A04, gm2);
                break;
        }
        return C60340gF.A00;
    }
}
