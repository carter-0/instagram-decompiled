package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public final class JGA extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGA(int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
    }

    public static int A00(Object obj, JGA jga) {
        ((Number) obj).intValue();
        return C301445zH.A00(jga.A01 | 1);
    }

    public static void A01(C286625Xd r1, int i, int i2) {
        r1.A06 = new JGA(i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                I7A.A02((C286575Wy) obj, A00(obj2, this));
                break;
            case 1:
                I7A.A03((C286575Wy) obj, A00(obj2, this));
                break;
            case 2:
                C55066Hbb.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 3:
                C56656I6l.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 4:
                I54.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 5:
                I57.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 6:
                I36.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 7:
                C55129Hcd.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 8:
                I59.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 9:
                I6W.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 10:
                I6W.A01((C286575Wy) obj, A00(obj2, this));
                break;
            case 11:
                I7T.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                I7T.A01((C286575Wy) obj, A00(obj2, this));
                break;
            case 13:
                I7T.A02((C286575Wy) obj, A00(obj2, this));
                break;
            case 14:
                I7T.A03((C286575Wy) obj, A00(obj2, this));
                break;
            case 15:
                I3B.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 16:
                C56670I6z.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 17:
                C56356Hx7.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C56356Hx7.A01((C286575Wy) obj, A00(obj2, this));
                break;
            case 19:
                C56644I5z.A00((C286575Wy) obj, A00(obj2, this));
                break;
            case 20:
                C56644I5z.A01((C286575Wy) obj, A00(obj2, this));
                break;
            case 21:
                I60.A01((C286575Wy) obj, A00(obj2, this));
                break;
            case 22:
                I5F.A01((C286575Wy) obj, A00(obj2, this));
                break;
            default:
                I3K.A00((C286575Wy) obj, A00(obj2, this));
                break;
        }
        return C60340gF.A00;
    }
}
