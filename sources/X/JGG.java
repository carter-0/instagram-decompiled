package X;

import com.instagram.react.modules.base.IgReactQEModule;

public final class JGG extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGG(String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i;
    }

    public static int A00(JGG jgg) {
        return C301445zH.A00(jgg.A01 | 1);
    }

    public static void A01(C286625Xd r1, String str, int i, int i2) {
        r1.A06 = new JGG(str, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C56630I5j.A04(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 1:
                C54877HWk.A00(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 2:
                C56650I6f.A06(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 3:
                C56616I4r.A03(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 4:
                C56667I6w.A06(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 5:
                C56667I6w.A07(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 6:
                C56637I5s.A02(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 7:
                C56637I5s.A03(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 8:
                I50.A02(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 9:
                I50.A03(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 10:
                GQS.A0A(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 11:
                I7V.A0F(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                I7V.A0G(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 13:
                I7V.A0H(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 14:
                I7V.A0I(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 15:
                C55127Hcb.A00(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 16:
                C55130Hce.A00(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            default:
                I62.A04(this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
        }
        return C60340gF.A00;
    }
}
