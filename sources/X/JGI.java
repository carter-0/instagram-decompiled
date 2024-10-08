package X;

import android.content.Context;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

public final class JGI extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGI(Object obj, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = i;
    }

    public static int A00(JGI jgi) {
        return C301445zH.A00(jgi.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, int i, int i2, boolean z) {
        r1.A06 = new JGI(obj, i, i2, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C52694Gb6.A04((C52693Gb5) this.A02, A0R, A00(this), this.A03);
                break;
            case 3:
                C56647I6c.A06(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 4:
                C56649I6e.A06(A0R, (C59550JNw) this.A02, A00(this), this.A03);
                break;
            case 5:
                I7I.A07(A0R, (0sK) this.A02, A00(this), this.A03);
                break;
            case 6:
                I7I.A01(A0R, (C61050Jvo) this.A02, A00(this), this.A03);
                break;
            case 7:
                C56619I4u.A02(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 8:
                C56577I2h.A00(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 9:
                C56577I2h.A01(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 10:
                C56601I3r.A01(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 11:
                C56668I6x.A06(A0R, (List) this.A02, A00(this), this.A03);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C56295Hw8.A01(A0R, (0sL) this.A02, A00(this), this.A03);
                break;
            case 13:
                C55077Hbm.A00(A0R, (0sP) this.A02, A00(this), this.A03);
                break;
            case 14:
                HcZ.A00(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 15:
                I7T.A0B(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            case 16:
                C56358Hx9.A00((Context) this.A02, A0R, A00(this), this.A03);
                break;
            case 17:
                C55251Heg.A00(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
            default:
                C56647I6c.A05(A0R, (C62320sa) this.A02, A00(this), this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
