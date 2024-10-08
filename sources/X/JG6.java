package X;

import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class JG6 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG6(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public static int A00(JG6 jg6) {
        return C301445zH.A00(jg6.A01 | 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                I68.A02((C56127HtF) this.A03, C51966G9m.A0R(obj, obj2), (Modifier) this.A05, (0sK) this.A04, A00(this), this.A02);
                break;
            case 1:
                AnonymousClass6JB.A00((AnonymousClass6J1) this.A03, C51966G9m.A0R(obj, obj2), this.A05, this.A04, this.A02, A00(this));
                break;
            case 2:
                HRV.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, (AnonymousClass5RD) this.A04, (0sL) this.A03, A00(this), this.A02);
                break;
            case 3:
                AnonymousClass6ID.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (AnonymousClass6I8) this.A05, (0sL) this.A03, A00(this), this.A02);
                break;
            case 4:
                I63.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (0sP) this.A03, (0sP) this.A05, A00(this), this.A02);
                break;
            case 5:
                C54764HRw.A00(C51966G9m.A0R(obj, obj2), (07T) this.A03, (AnonymousClass07Z) this.A04, (C62320sa) this.A05, A00(this), this.A02);
                break;
            case 6:
                C56647I6c.A04(C51966G9m.A0R(obj, obj2), (C60973JuV) this.A05, (LRW) this.A03, (0sL) this.A04, this.A02, A00(this));
                break;
            case 7:
            case 8:
                I6K.A05(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (0sL) this.A05, (AnonymousClass62P) this.A03, A00(this), this.A02);
                break;
            case 9:
                HL3 hl3 = (HL3) this.A03;
                HUP.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, hl3, (C62320sa) this.A05, A00(this), this.A02);
                break;
            case 10:
                HUU.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C53353Gmd) this.A05, (C62320sa) this.A04, A00(this), this.A02);
                break;
            case 11:
                C54823HUe.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C62320sa) this.A05, (0sK) this.A03, A00(this), this.A02);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C54827HUj.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (JV7) this.A05, (0sP) this.A04, A00(this), this.A02);
                break;
            case 13:
                C54829HUl.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (0sL) this.A05, (0sK) this.A03, A00(this), this.A02);
                break;
            case 14:
                HV3.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C299735vl) this.A05, (C62320sa) this.A04, A00(this), this.A02);
                break;
            case 15:
                0sP r2 = (0sP) this.A04;
                HV7.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, r2, (AnonymousClass62P) this.A05, A00(this), this.A02);
                break;
            case 16:
                AnonymousClass6C1.A00(C51966G9m.A0R(obj, obj2), (C304056Bz) this.A05, (Boolean) this.A04, (0sL) this.A03, A00(this), this.A02);
                break;
            case 17:
                C54871HWe.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (GSY) this.A03, (C62320sa) this.A05, A00(this), this.A02);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                Object obj3 = this.A05;
                HXF.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (JPH) this.A03, obj3, A00(this), this.A02);
                break;
            case 19:
                I7P.A0B(C51966G9m.A0R(obj, obj2), (C59485JLj) this.A05, (Integer) this.A04, (C62320sa) this.A03, A00(this), this.A02);
                break;
            case 20:
            case 21:
                I7M.A04(C51966G9m.A0R(obj, obj2), (C55843HoQ) this.A03, (CharSequence) this.A05, (0sP) this.A04, A00(this), this.A02);
                break;
            case 22:
                I2Y.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C286025Tq) this.A03, (0sP) this.A05, A00(this), this.A02);
                break;
            case 23:
                C54927HYj.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (Badge.AchievementBadge) this.A03, (0sP) this.A05, A00(this), this.A02);
                break;
            case 24:
                C54930HYm.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (Badge.ChallengeBadge) this.A03, (0sP) this.A05, A00(this), this.A02);
                break;
            case 25:
                C54940HYw.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (AchievementIntf) this.A03, (C62320sa) this.A05, A00(this), this.A02);
                break;
            case 26:
                HZ2.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (AchievementIntf) this.A03, (0sP) this.A05, A00(this), this.A02);
                break;
            case 27:
                HZ6.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (Badge) this.A03, (0sP) this.A05, A00(this), this.A02);
                break;
            case 28:
                C54180H2a h2a = (C54180H2a) this.A05;
                HZB.A00(C51966G9m.A0R(obj, obj2), (C52369GPq) this.A03, h2a, (C62320sa) this.A04, A00(this), this.A02);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                I5W.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C61082JwK) this.A05, (0sP) this.A04, A00(this), this.A02);
                break;
            case 30:
                C56303HwG.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (AnonymousClass2DO) this.A05, (C62320sa) this.A04, A00(this), this.A02);
                break;
            case 33:
                C55079Hbo.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C55647Hl6) this.A04, (0sJ) this.A05, A00(this), this.A02);
                break;
            case 34:
                List list = (List) this.A03;
                I54.A01(C51966G9m.A0R(obj, obj2), (IGRevShareProductType) this.A05, list, (0sP) this.A04, this.A02, A00(this));
                break;
            case 35:
                H1R h1r = (H1R) this.A03;
                C56331Hwi.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A05, h1r, (C53297Glj) this.A04, A00(this), this.A02);
                break;
            case 36:
                C56331Hwi.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C61082JwK) this.A05, (H1R) this.A03, A00(this), this.A02);
                break;
            case 37:
                I37.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (Integer) this.A04, (Integer) this.A05, A00(this), this.A02);
                break;
            case 38:
                ImmutableList immutableList = (ImmutableList) this.A04;
                I58.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, immutableList, (HMD) this.A05, A00(this), this.A02);
                break;
            case 39:
                C56670I6z.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (GSY) this.A03, (C62320sa) this.A05, A00(this), this.A02);
                break;
            default:
                int i = this.A02;
                List list2 = (List) this.A05;
                I7S.A08(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, list2, (C62320sa) this.A04, i, A00(this));
                break;
        }
        return C60340gF.A00;
    }
}
