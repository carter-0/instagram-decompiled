package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wonderwall.model.WallPostInfo;
import org.webrtc.EglBase14Impl;

public final class JGE extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGE(int i, int i2, Object obj) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public static int A00(JGE jge) {
        return C301445zH.A00(jge.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, int i, int i2) {
        r1.A06 = new JGE(i, i2, obj);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                I3B.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case 1:
                C56670I6z.A03(C51966G9m.A0R(obj, obj2), (GraphGuardianContent) this.A02, A00(this));
                break;
            case 2:
                C56670I6z.A07(C51966G9m.A0R(obj, obj2), (JMH) this.A02, A00(this));
                break;
            case 3:
                I6X.A04(C51966G9m.A0R(obj, obj2), (C55817Hnx) this.A02, A00(this));
                break;
            case 4:
            case 5:
                I5B.A03(C51966G9m.A0R(obj, obj2), (C53029GhK) this.A02, A00(this));
                break;
            case 6:
                C56643I5y.A00(C51966G9m.A0R(obj, obj2), (C61065Jw3) this.A02, A00(this));
                break;
            case 7:
                C56643I5y.A04((AnonymousClass62P) this.A02, C51966G9m.A0R(obj, obj2), A00(this));
                break;
            case 8:
                C56643I5y.A03(C51966G9m.A0R(obj, obj2), (C53029GhK) this.A02, A00(this));
                break;
            case 9:
                I5C.A01(C51966G9m.A0R(obj, obj2), (WallPostInfo) this.A02, A00(this));
                break;
            case 10:
                I5C.A02(C51966G9m.A0R(obj, obj2), (WallPostInfo) this.A02, A00(this));
                break;
            case 11:
                C56462Hyu.A00(C51966G9m.A0R(obj, obj2), (0sL) this.A02, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C56644I5z.A03(C51966G9m.A0R(obj, obj2), (C53046Ghe) this.A02, A00(this));
                break;
            case 13:
                C56644I5z.A04(C51966G9m.A0R(obj, obj2), (C53046Ghe) this.A02, A00(this));
                break;
            case 14:
                I60.A02(C51966G9m.A0R(obj, obj2), (C53047Ghf) this.A02, A00(this));
                break;
            case 15:
                I60.A03(C51966G9m.A0R(obj, obj2), (C53047Ghf) this.A02, A00(this));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C55202Hds.A00(C51966G9m.A0R(obj, obj2), (C53029GhK) this.A02, A00(this));
                break;
            case 19:
                I5D.A03(C51966G9m.A0R(obj, obj2), (C53048Ghg) this.A02, A00(this));
                break;
            case 20:
                I70.A03(C51966G9m.A0R(obj, obj2), (C55754Hmp) this.A02, A00(this));
                break;
            case 21:
                I62.A01(C51966G9m.A0R(obj, obj2), (ImageUrl) this.A02, A00(this));
                break;
            case 22:
                I3L.A01(C51966G9m.A0R(obj, obj2), (JRL) this.A02, A00(this));
                break;
            case 23:
                C52609GZi gZi = (C52609GZi) obj2;
                0qQ.A0B(gZi, 1);
                int i = this.A01;
                if (i > 1) {
                    int A09 = C51970G9q.A09(((C53963Gx7) this.A02).A00.A04);
                    boolean z = gZi.A06;
                    boolean z2 = gZi.A05;
                    boolean z3 = gZi.A04;
                    boolean z4 = gZi.A07;
                    C61074JwC jwC = gZi.A03;
                    0qQ.A0B(jwC, 6);
                    gZi.setCurrentIndex(A09);
                    gZi.setIndicatorCount(i);
                    gZi.A06 = z;
                    gZi.A05 = z2;
                    gZi.A04 = z3;
                    gZi.A07 = z4;
                    gZi.setCarouselIndicatorViewBoxConfig(jwC);
                    gZi.requestLayout();
                }
                return C51965G9l.A0f(C58715IwO.A01(gZi, 17));
            default:
                I60.A04(C51966G9m.A0R(obj, obj2), (C53047Ghf) this.A02, A00(this));
                break;
        }
        return C60340gF.A00;
    }
}
