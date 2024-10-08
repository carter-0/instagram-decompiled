package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.J7x  reason: case insensitive filesystem */
public final class C59141J7x extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass5Z4 r5;
        Object obj3 = obj;
        switch (this.A00) {
            case 0:
                HT9.A00(C51966G9m.A0R(obj, obj2), (LRW) this.A02, this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01));
                break;
            case 1:
                C286575Wy r4 = (C286575Wy) obj3;
                if (C51968G9o.A0B(obj2) == 2 && r4.Bwn()) {
                    r4.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(-400522180, "com.instagram.barcelona.common.ui.button.FollowButton.<anonymous> (FollowButton.kt:91)");
                    }
                    0sL r1 = (0sL) this.A03;
                    r4.ExS(572210563);
                    if (r1 != null) {
                        C51967G9n.A1P(r4, r1, 0);
                    }
                    C286565Wx r3 = (C286565Wx) r4;
                    C286565Wx.A0L(r3, false);
                    String str = this.A04;
                    int i = this.A01;
                    if (this.A02 == C54652HMj.SMALL_VERY_COMPACT) {
                        r5 = C51967G9n.A0b(r4, 572218506).A03;
                    } else {
                        r4.ExS(572220290);
                        r5 = (AnonymousClass5Z4) r4.AJO(AnonymousClass5ZZ.A00);
                    }
                    C286565Wx.A0L(r3, false);
                    AnonymousClass5ZZ.A0k(r4, r5, str, i, 384, 11262, 0);
                    if (0fL.A02()) {
                        0fL.A00(1463795234);
                        break;
                    }
                }
                break;
            case 2:
                C54883HWq.A00(C51966G9m.A0R(obj, obj2), (ImageUrl) this.A02, this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01));
                break;
            case 3:
            case 4:
                C56272Hvg.A01(C51966G9m.A0R(obj, obj2), this.A04, (List) this.A02, (0sP) this.A03, C51966G9m.A01(this.A01));
                break;
            case 8:
                C56279Hvn.A00(C51966G9m.A0R(obj, obj2), (C285975Tl) this.A03, this.A04, (0sL) this.A02, C51966G9m.A01(this.A01));
                break;
            case 9:
                C56281Hvp.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A02, this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01));
                break;
            case 10:
                C54933HYp.A00(C51966G9m.A0R(obj, obj2), this.A04, (0sP) this.A03, (AnonymousClass62P) this.A02, C51966G9m.A01(this.A01));
                break;
            case 11:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                String str2 = this.A04;
                C56668I6x.A04(A0R, (C55952HqG) this.A03, (OJf) this.A02, str2, C51966G9m.A01(this.A01));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C56345Hww.A00(C51966G9m.A0R(obj, obj2), this.A04, (0sP) this.A03, (AnonymousClass62P) this.A02, C51966G9m.A01(this.A01));
                break;
            case 13:
                I3A.A02(C51966G9m.A0R(obj, obj2), (ImmutableList) this.A03, this.A04, (0sP) this.A02, C51966G9m.A01(this.A01));
                break;
            case 14:
                String str3 = this.A04;
                C56642I5x.A03(C51966G9m.A0R(obj, obj2), (C55528HjA) this.A03, str3, (C62320sa) this.A02, C51966G9m.A01(this.A01));
                break;
            case 15:
                C55134Hci.A00(C51966G9m.A0R(obj, obj2), this.A04, (C62320sa) this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01));
                break;
            case 16:
                I5F.A02(C51966G9m.A0R(obj, obj2), (C59502JMa) this.A03, this.A04, (C62320sa) this.A02, C51966G9m.A01(this.A01));
                break;
            case 17:
                I5F.A03(C51966G9m.A0R(obj, obj2), (C57601IdS) this.A03, this.A04, (C62320sa) this.A02, C51966G9m.A01(this.A01));
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                I5G.A00((C304686Eu) this.A03, C51966G9m.A0R(obj, obj2), (C381879cj) this.A02, this.A04, C51966G9m.A01(this.A01));
                break;
            default:
                C56573I2d.A01(C51966G9m.A0R(obj, obj2), this.A04, (List) this.A02, (0sP) this.A03, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59141J7x(Object obj, Object obj2, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A01 = i;
    }
}
