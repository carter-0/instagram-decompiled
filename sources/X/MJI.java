package X;

import com.instagram.api.schemas.RepostRestrictedReason;

public final class MJI extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJI(Object obj, Object obj2, String str, String str2, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((C299665vd) this.A01).DeC((RepostRestrictedReason) this.A02, this.A03, this.A04, this.A05);
                break;
            case 1:
                ((0sK) this.A02).invoke(this.A03, this.A04, Boolean.valueOf(this.A05));
                AnonymousClass2S0.A01.A06();
                C51967G9n.A16((C284945Oz) this.A01, true);
                break;
            default:
                boolean z = this.A05;
                String str = this.A03;
                K66.A0C((C293505kq) this.A01, (K66) this.A02, str, this.A04, z);
                break;
        }
        return C60340gF.A00;
    }
}
