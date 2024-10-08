package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ChallengeDetails;

public final class J9P extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9P(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A06 = str;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C56647I6c.A01(A0R, (Modifier) this.A03, (LRW) this.A02, this.A06, (0sP) this.A04, (0sP) this.A05, C51966G9m.A01(this.A01));
                break;
            case 1:
                C362088hK r3 = (C362088hK) this.A02;
                C56619I4u.A01(A0R, (HLB) this.A05, r3, this.A06, (C62320sa) this.A03, (C62320sa) this.A04, C51966G9m.A01(this.A01));
                break;
            case 2:
                I4w.A03(A0R, (ChallengeDetails) this.A02, this.A06, (0sP) this.A04, (0sJ) this.A03, (0sJ) this.A05, C51966G9m.A01(this.A01));
                break;
            default:
                C56286Hvu.A00(A0R, (C53399GnW) this.A05, this.A06, (C62320sa) this.A04, (0sP) this.A02, (0sP) this.A03, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
