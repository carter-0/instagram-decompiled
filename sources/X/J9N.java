package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ChallengeButtonInfo;

public final class J9N extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9N(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = str;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                int i2 = this.A02;
                C54781HSo.A00(A0R, (C66378MPk) this.A05, this.A06, (C62320sa) this.A04, (0sP) this.A03, i2, C51966G9m.A01(this.A01));
                break;
            case 1:
                AnonymousClass6E2.A02(A0R, (C3022462f) this.A05, this.A06, (0sP) this.A04, (AnonymousClass62P) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 2:
                Modifier modifier = (Modifier) this.A05;
                String str = this.A06;
                C56572I2c.A02(A0R, modifier, (C288095bM) this.A03, (IQK) this.A04, str, C51966G9m.A01(this.A01), this.A02);
                break;
            case 3:
                String str2 = this.A06;
                I4w.A00(A0R, (Modifier) this.A04, (ChallengeButtonInfo) this.A03, str2, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02);
                break;
            case 4:
                String str3 = this.A06;
                C55063HbY.A00(A0R, (Modifier) this.A03, (AnonymousClass6CC) this.A05, str3, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                String str4 = this.A06;
                I6X.A03(A0R, (Modifier) this.A04, (AnonymousClass2DO) this.A03, str4, (C62320sa) this.A05, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
