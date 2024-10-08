package X;

import com.instagram.common.session.UserSession;

public final class TTV extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTV(Object obj, String str, String str2, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return new KE0((UserSession) obj, this.A03, this.A02, this.A04);
            case 1:
                TTV.super.ACs(this.A03, this.A02, this.A04);
                break;
            case 2:
                TTV.super.ACt(this.A03, this.A02, this.A04);
                break;
            case 3:
                TTV.super.Ci8(this.A02, this.A04, this.A03);
                break;
            case 4:
                TTV.super.Ci9(this.A02, this.A04, this.A03);
                break;
            case 5:
                TTV.super.Cix(this.A02, this.A04, this.A03);
                break;
            case 6:
                TTV.super.Ciy(this.A02, this.A04, this.A03);
                break;
            default:
                TTV.super.A0x(this.A02, this.A04, this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
