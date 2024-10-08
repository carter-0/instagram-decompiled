package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.base.IgReactQEModule;

public final class JGJ extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGJ(Object obj, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    public static int A00(JGJ jgj) {
        return C301445zH.A00(jgj.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, String str, int i, int i2) {
        r1.A06 = new JGJ(obj, str, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.A00) {
            case 0:
                HT4.A00(C51966G9m.A0R(obj, obj2), (LRW) this.A02, this.A03, A00(this));
                break;
            case 1:
                C56203HuW.A01(C51966G9m.A0R(obj, obj2), (LRW) this.A02, this.A03, A00(this));
                break;
            case 2:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                C62320sa r5 = (C62320sa) this.A02;
                String str = this.A03;
                int A002 = A00(this);
                A0R.ExV(1737382226);
                if ((A002 & 6) == 0) {
                    i = C41848B3p.A01(A0R, r5) | A002;
                } else {
                    i = A002;
                }
                if ((A002 & 48) == 0) {
                    i |= G9t.A0P(A0R, str);
                }
                if ((i & 19) != 18 || !A0R.Bwn()) {
                    if (0fL.A02()) {
                        0fL.A01(-1937494717, "com.instagram.barcelona.common.ui.toast.BdsToastButton (BdsToastMessage.kt:160)");
                    }
                    AnonymousClass5ZZ.A09(A0R, C288235ba.A02(A0R, C287195Zj.A09(Modifier.A00, 20.0f, 5.0f), C51965G9l.A0R(0), r5), C51966G9m.A0h(A0R), str, (i >> 3) & 14);
                    if (0fL.A02()) {
                        0fL.A00(-791792341);
                    }
                } else {
                    A0R.Evl();
                }
                C286625Xd ASQ = A0R.ASQ();
                if (ASQ != null) {
                    A01(ASQ, r5, str, A002, 2);
                    break;
                }
                break;
            case 3:
                I7P.A0C(C51966G9m.A0R(obj, obj2), (C59485JLj) this.A02, this.A03, A00(this));
                break;
            case 4:
                GS8.A0D(C51966G9m.A0R(obj, obj2), (C59641JRj) this.A02, this.A03, A00(this));
                break;
            case 5:
                C56650I6f.A05(C51966G9m.A0R(obj, obj2), (AnonymousClass2DO) this.A02, this.A03, A00(this));
                break;
            case 6:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                C56636I5r.A03((C62320sa) this.A02, this.A03, A0R2, A00(this));
                break;
            case 7:
                C286575Wy A0R3 = C51966G9m.A0R(obj, obj2);
                C56636I5r.A04((C62320sa) this.A02, this.A03, A0R3, A00(this));
                break;
            case 8:
                C56651I6g.A03(C51966G9m.A0R(obj, obj2), (ImageUrl) this.A02, this.A03, A00(this));
                break;
            case 9:
                I6S.A05((C62320sa) this.A02, this.A03, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 10:
                I6S.A03(C51966G9m.A0R(obj, obj2), (GS7) this.A02, this.A03, A00(this));
                break;
            case 11:
                I6S.A04(C51966G9m.A0R(obj, obj2), this.A03, (0sP) this.A02, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C286575Wy A0R4 = C51966G9m.A0R(obj, obj2);
                I7A.A08((C62320sa) this.A02, this.A03, A0R4, A00(this));
                break;
            case 13:
                I7V.A06(C51966G9m.A0R(obj, obj2), (ImageUrl) this.A02, this.A03, A00(this));
                break;
            case 14:
                I7T.A0A(C51966G9m.A0R(obj, obj2), this.A03, (0sP) this.A02, A00(this));
                break;
            case 15:
                C55195Hdl.A00(C51966G9m.A0R(obj, obj2), (GifUrlImpl) this.A02, this.A03, A00(this));
                break;
            default:
                C55249Hee.A00(C51966G9m.A0R(obj, obj2), (C381879cj) this.A02, this.A03, A00(this));
                break;
        }
        return C60340gF.A00;
    }
}
