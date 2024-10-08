package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JAm  reason: case insensitive filesystem */
public final class C59208JAm extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59208JAm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A07 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = str;
        this.A03 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                C56663I6s.A02((C56151Htd) this.A04, (C56152Hte) this.A05, (C52882GeI) this.A07, A0R, (Modifier) this.A06, this.A08, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                List list = (List) this.A04;
                AnonymousClass4DH r3 = (AnonymousClass4DH) this.A05;
                I2H.A01(C51966G9m.A0R(obj, obj2), (LRW) this.A03, r3, this.A08, list, (0sP) this.A06, (0sP) this.A07, C51966G9m.A01(this.A01), this.A02);
                break;
            case 2:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                String str = this.A08;
                Modifier modifier = (Modifier) this.A04;
                IH8 ih8 = (IH8) this.A06;
                C56617I4s.A00((C52882GeI) this.A03, A0R2, modifier, (HMB) this.A05, ih8, (HLY) this.A07, str, C51966G9m.A01(this.A01), this.A02);
                break;
            case 3:
                C286575Wy A0R3 = C51966G9m.A0R(obj, obj2);
                String str2 = this.A08;
                HMB hmb = (HMB) this.A05;
                IH8 ih82 = (IH8) this.A06;
                C56617I4s.A01((C52882GeI) this.A03, A0R3, (Modifier) this.A04, hmb, ih82, (HLY) this.A07, str2, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                String str3 = this.A08;
                C54937HYt.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, (UserSession) this.A07, (C59488JLm) this.A04, str3, (List) this.A03, (0sP) this.A06, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
