package X;

import androidx.compose.ui.Modifier;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.wonderwall.model.WallText;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class JG4 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG4(int i, int i2, Object obj, Object obj2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = z;
        this.A01 = i;
    }

    public static int A00(JG4 jg4) {
        return C301445zH.A00(jg4.A01 | 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C56607I4g.A03(A0R, (Modifier) this.A03, (C62320sa) this.A02, A00(this), this.A04);
                break;
            case 1:
                boolean z = this.A04;
                C56168Htx.A00((C52693Gb5) this.A03, A0R, (C52430GSi) this.A02, A00(this), z);
                break;
            case 4:
                boolean z2 = this.A04;
                I2K.A01(A0R, (Modifier) this.A03, (C322946wf) this.A02, A00(this), z2);
                break;
            case 5:
                C52636GaA.A0D(A0R, (Modifier) this.A03, (C59489JLn) this.A02, A00(this), this.A04);
                break;
            case 6:
                C56272Hvg.A00(A0R, (C59493JLr) this.A02, (0sP) this.A03, A00(this), this.A04);
                break;
            case 7:
                C56573I2d.A00(A0R, (I12) this.A02, (0sP) this.A03, A00(this), this.A04);
                break;
            case 8:
                I6O.A05(A0R, (C62320sa) this.A02, (C62320sa) this.A03, A00(this), this.A04);
                break;
            case 9:
                C56577I2h.A02(A0R, (C62320sa) this.A02, (C62320sa) this.A03, A00(this), this.A04);
                break;
            case 10:
                HYX.A00(A0R, (HM3) this.A02, (C62320sa) this.A03, A00(this), this.A04);
                break;
            case 11:
                boolean z3 = this.A04;
                C56638I5t.A01(A0R, (C61042Jvg) this.A02, (C62320sa) this.A03, A00(this), z3);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                I78.A03(A0R, (C61072JwA) this.A03, (C62320sa) this.A02, A00(this), this.A04);
                break;
            case 13:
                C56668I6x.A07(A0R, (C62320sa) this.A02, (C62320sa) this.A03, A00(this), this.A04);
                break;
            case 14:
                ((I0S) this.A03).A00(A0R, (C62320sa) this.A02, A00(this), this.A04);
                break;
            case 15:
                boolean z4 = this.A04;
                C56329Hwg.A00(A0R, (Modifier) this.A02, (C62320sa) this.A03, A00(this), z4);
                break;
            case 16:
                C52744Gbw.A01(A0R, (C61083JwL) this.A03, (0sP) this.A02, A00(this), this.A04);
                break;
            case 17:
                C52744Gbw.A06(A0R, (List) this.A02, (0sP) this.A03, A00(this), this.A04);
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                I3E.A02(A0R, (Modifier) this.A02, (C62320sa) this.A03, A00(this), this.A04);
                break;
            case 19:
                I5D.A01(A0R, (WallText) this.A03, (C62320sa) this.A02, A00(this), this.A04);
                break;
            default:
                boolean z5 = this.A04;
                I2G.A01(A0R, (C62320sa) this.A03, (AnonymousClass62P) this.A02, A00(this), z5);
                break;
        }
        return C60340gF.A00;
    }
}
