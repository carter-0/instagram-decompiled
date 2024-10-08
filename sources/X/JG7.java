package X;

import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class JG7 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = i;
    }

    public static int A00(JG7 jg7) {
        return C301445zH.A00(jg7.A01 | 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C54778HSl.A00(C51966G9m.A0R(obj, obj2), (C61011JvB) this.A05, (C62320sa) this.A03, (C62320sa) this.A04, (C62320sa) this.A02, A00(this));
                break;
            case 1:
                C56612I4m.A03(C51966G9m.A0R(obj, obj2), (C61060Jvy) this.A05, (C62320sa) this.A03, (C62320sa) this.A04, (0sL) this.A02, A00(this));
                break;
            case 2:
                C56204HuX.A00(C51966G9m.A0R(obj, obj2), (C59964JcX) this.A05, (LRW) this.A02, (0sL) this.A03, (0sK) this.A04, A00(this));
                break;
            case 3:
                HVD.A00(C51966G9m.A0R(obj, obj2), (AnonymousClass6D9) this.A04, (AnonymousClass3WR) this.A05, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 4:
                C56634I5o.A03(C51966G9m.A0R(obj, obj2), (C270284gU) this.A04, (Modifier) this.A03, (AnonymousClass2DO) this.A02, (AnonymousClass2DO) this.A05, A00(this));
                break;
            case 5:
                C56267Hvb.A01((C289525dk) this.A05, C51966G9m.A0R(obj, obj2), (ImageUrl) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 6:
                C56667I6w.A01(C51966G9m.A0R(obj, obj2), (C59721JVf) this.A02, (0sP) this.A04, (0sP) this.A03, (0sL) this.A05, A00(this));
                break;
            case 7:
                C56667I6w.A02(C51966G9m.A0R(obj, obj2), (C53294Glg) this.A05, (0sP) this.A03, (0sP) this.A02, (0sL) this.A04, A00(this));
                break;
            case 8:
                I7I.A04(C51966G9m.A0R(obj, obj2), (C61050Jvo) this.A05, (C62320sa) this.A04, (C62320sa) this.A02, (0sP) this.A03, A00(this));
                break;
            case 9:
                C55473HiH hiH = (C55473HiH) this.A03;
                C54919HYb.A00(C51966G9m.A0R(obj, obj2), (ImmutableList) this.A02, (C53390GnN) this.A05, hiH, (0sP) this.A04, A00(this));
                break;
            case 10:
                C56621I4x.A01(C51966G9m.A0R(obj, obj2), (C67741Mtu) this.A02, (C62320sa) this.A03, (C62320sa) this.A04, (0sP) this.A05, A00(this));
                break;
            case 11:
                I78.A02(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C317486nL) this.A03, (C317486nL) this.A02, (0sP) this.A05, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                I78.A06(C51966G9m.A0R(obj, obj2), (C53002Ggt) this.A05, (C55952HqG) this.A02, (List) this.A04, (List) this.A03, A00(this));
                break;
            case 13:
                C53027GhI ghI = (C53027GhI) this.A05;
                C56668I6x.A01(C51966G9m.A0R(obj, obj2), (AnonymousClass4DH) this.A03, (C55952HqG) this.A04, ghI, (OJf) this.A02, A00(this));
                break;
            case 14:
                C56291Hw4.A01((C56838IEj) this.A04, C51966G9m.A0R(obj, obj2), (C61084JwM) this.A05, (0sP) this.A03, (0sP) this.A02, A00(this));
                break;
            case 15:
                I79.A07(C51966G9m.A0R(obj, obj2), (C54621HLe) this.A04, (HBP) this.A05, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 16:
                I6S.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C48145EZn) this.A03, (ULT) this.A02, (0sP) this.A05, A00(this));
                break;
            case 17:
                GQS.A08(C51966G9m.A0R(obj, obj2), (GSV) this.A02, (Integer) this.A03, (0sP) this.A04, (0sP) this.A05, A00(this));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C56593I2x.A00(C51966G9m.A0R(obj, obj2), (C61079JwH) this.A05, (0sP) this.A03, (0sP) this.A02, (0sP) this.A04, A00(this));
                break;
            case 19:
                C2376138k r3 = (C2376138k) this.A03;
                I55.A00(C51966G9m.A0R(obj, obj2), (AnonymousClass9FM) this.A02, (AnonymousClass39A) this.A04, r3, (C62320sa) this.A05, A00(this));
                break;
            case 20:
                C55128Hcc.A00(C51966G9m.A0R(obj, obj2), (C55527Hj9) this.A05, (C62320sa) this.A04, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 21:
                I39.A02(C51966G9m.A0R(obj, obj2), (Integer) this.A04, (Integer) this.A05, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 22:
                SchoolInfo schoolInfo = (SchoolInfo) this.A05;
                I59.A01(C51966G9m.A0R(obj, obj2), (ImmutableList) this.A04, schoolInfo, (C62320sa) this.A03, (C62320sa) this.A02, A00(this));
                break;
            case 23:
                I7T.A07(C51966G9m.A0R(obj, obj2), (C53312Gly) this.A05, (C62320sa) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 24:
                C52744Gbw.A04(C51966G9m.A0R(obj, obj2), (JOX) this.A02, (C53557GqT) this.A05, (SettingsScreenViewModel) this.A04, (0sP) this.A03, A00(this));
                break;
            case 25:
                C55143Hcr.A00(C51966G9m.A0R(obj, obj2), (JOX) this.A02, (SettingsScreenViewModel) this.A04, (C53558GqU) this.A05, (0sP) this.A03, A00(this));
                break;
            case 26:
                I6Z.A03(C51966G9m.A0R(obj, obj2), (JOX) this.A03, (JOX) this.A02, (SettingsScreenViewModel) this.A04, (C53560GqW) this.A05, A00(this));
                break;
            case 27:
                C56643I5y.A01(C51966G9m.A0R(obj, obj2), (C53321Gm7) this.A05, (0sP) this.A04, (0sL) this.A03, (0sL) this.A02, A00(this));
                break;
            case 28:
                C56643I5y.A02(C51966G9m.A0R(obj, obj2), (C53321Gm7) this.A05, (0sL) this.A04, (0sL) this.A03, (0sL) this.A02, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C55201Hdr.A00(C51966G9m.A0R(obj, obj2), (AnonymousClass3WR) this.A05, (C55870Hor) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, A00(this));
                break;
            case 30:
                I5G.A01(C51966G9m.A0R(obj, obj2), (GSY) this.A05, (JRL) this.A04, (0sP) this.A03, (0sP) this.A02, A00(this));
                break;
            default:
                0sP r32 = (0sP) this.A02;
                I5G.A03(C51966G9m.A0R(obj, obj2), (JRL) this.A05, (C381879cj) this.A03, r32, (AnonymousClass62O) this.A04, A00(this));
                break;
        }
        return C60340gF.A00;
    }
}
