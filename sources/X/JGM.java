package X;

import android.text.Spanned;
import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class JGM extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGM(List list, 0sP r3, int i, int i2) {
        super(2);
        this.A00 = i2;
        if (10 - i2 != 0) {
            this.A03 = list;
            this.A02 = r3;
        } else {
            this.A02 = list;
            this.A03 = r3;
        }
        this.A01 = i;
    }

    public static int A00(JGM jgm) {
        return C301445zH.A00(jgm.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, Object obj2, int i, int i2) {
        r1.A06 = new JGM(i, i2, obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
            case 1:
                I30.A02(A0R, (2bv) this.A03, (AnonymousClass4UC) this.A02, A00(this));
                break;
            case 2:
                I55.A02(A0R, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 3:
                I55.A03(A0R, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 4:
                I57.A01(A0R, (C15050ULg) this.A02, (H2X) this.A03, A00(this));
                break;
            case 5:
                I57.A02(A0R, (C15050ULg) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 6:
                C56347Hwy.A01((AnonymousClass62P) this.A02, (0sP) this.A03, A0R, A00(this));
                break;
            case 7:
                I7T.A06(A0R, (C61076JwE) this.A03, (0sP) this.A02, A00(this));
                break;
            case 8:
                I7T.A0C(A0R, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 9:
                I7T.A0D(A0R, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 10:
                C52744Gbw.A05(A0R, (List) this.A02, (0sP) this.A03, A00(this));
                break;
            case 11:
                C52741Gbt.A00(A0R, (C61083JwL) this.A02, (XRY) this.A03, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                C56670I6z.A05(A0R, (C49723F3m) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 14:
                C56354Hx5.A01(A0R, (C55818Hny) this.A03, (0sP) this.A02, A00(this));
                break;
            case 15:
                C56354Hx5.A00(A0R, (WallMenuConfig) this.A03, (0sP) this.A02, A00(this));
                break;
            case 16:
                C55193Hdj.A00(A0R, (C55663HlM) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 17:
                C56355Hx6.A00(A0R, (WallInfo) this.A03, (C53047Ghf) this.A02, A00(this));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C56355Hx6.A01(A0R, (WallInfo) this.A03, (C53047Ghf) this.A02, A00(this));
                break;
            case 19:
                I5B.A01(A0R, (C284945Oz) this.A02, (WallPostItem) this.A03, A00(this));
                break;
            case 20:
                I5B.A00((C289525dk) this.A03, A0R, (C62320sa) this.A02, A00(this));
                break;
            case 21:
                C56644I5z.A02(A0R, (C61063Jw1) this.A03, (C53046Ghe) this.A02, A00(this));
                break;
            case 22:
                I3F.A00(A0R, (Modifier) this.A02, (User) this.A03, A00(this));
                break;
            case 23:
                I3F.A02(A0R, (List) this.A03, (0sP) this.A02, A00(this));
                break;
            case 24:
                I70.A05(A0R, (C55754Hmp) this.A02, (C59504JMc) this.A03, A00(this));
                break;
            case 25:
                I70.A06(A0R, (C55754Hmp) this.A02, (C53566Gqh) this.A03, A00(this));
                break;
            case 26:
                I70.A01(A0R, (C53567Gqi) this.A03, (C55754Hmp) this.A02, A00(this));
                break;
            case 27:
                I70.A04(A0R, (C55754Hmp) this.A03, (C55755Hmq) this.A02, A00(this));
                break;
            case 28:
                I70.A00((Spanned) this.A03, A0R, (Modifier) this.A02, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                I70.A07(A0R, (C55754Hmp) this.A02, (AnonymousClass62P) this.A03, A00(this));
                break;
            case 30:
                I70.A02(A0R, (C53567Gqi) this.A03, (C55754Hmp) this.A02, A00(this));
                break;
            case 31:
                I62.A00(A0R, (Modifier) this.A03, (ImageUrl) this.A02, A00(this));
                break;
            case 32:
            case 33:
                I3K.A01(A0R, (C53388GnK) this.A03, (C74302Psc) this.A02, A00(this));
                break;
            default:
                C55250Hef.A00(A0R, (C53371Gmv) this.A03, (C62320sa) this.A02, A00(this));
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGM(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }
}
