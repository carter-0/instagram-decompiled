package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.JAd  reason: case insensitive filesystem */
public final class C59199JAd extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59199JAd(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = z;
        this.A07 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Integer num;
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A00) {
            case 0:
                HUH.A00(C51966G9m.A0R(obj3, obj4), (C322946wf) this.A03, (C60103Jfj) this.A06, (C62320sa) this.A04, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, this.A08, this.A07);
                break;
            case 1:
                LineType lineType = (LineType) this.A06;
                boolean z = this.A08;
                C56234Hv1.A00(C51966G9m.A0R(obj3, obj4), (Modifier) this.A03, lineType, (C53292Gle) this.A05, (0sP) this.A04, C51966G9m.A01(this.A01), this.A02, z, this.A07);
                break;
            case 2:
                C286575Wy r8 = (C286575Wy) obj3;
                if (C51968G9o.A0C(obj4) == 2 && r8.Bwn()) {
                    r8.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(714458387, "com.instagram.creation.genai.magicmod.common.ui.MagicModBackdropSegmentedImage.<anonymous>.<anonymous>.<anonymous> (MagicModBackdropSegmentedImage.kt:68)");
                    }
                    C285245Qk r6 = Modifier.A00;
                    int i = this.A02;
                    int i2 = this.A01;
                    Object obj5 = this.A06;
                    if (C51967G9n.A1U(r8, 1138802584)) {
                        0fL.A01(1036332804, "com.instagram.creation.genai.magicmod.common.ui.detectMagicModImageTaps (MagicModBackdropSegmentedImage.kt:88)");
                    }
                    Modifier A022 = C287435a8.A02(r6, C287655aY.A00, new C59358JGk(obj5, i, i2, 1));
                    if (0fL.A02()) {
                        0fL.A00(2029343885);
                    }
                    C286565Wx r7 = (C286565Wx) r8;
                    C286565Wx.A0L(r7, false);
                    C3018260f r10 = (C3018260f) this.A03;
                    C3018260f r11 = (C3018260f) this.A04;
                    C55638Hkx hkx = (C55638Hkx) this.A05;
                    boolean z2 = this.A08;
                    boolean z3 = this.A07;
                    AnonymousClass5RD A0a = C51966G9m.A0a(false);
                    int A002 = C287425a7.A00(r8);
                    AnonymousClass5RM A042 = C286565Wx.A04(r7);
                    Modifier A012 = C287435a8.A01(r8, A022);
                    C51973G9u.A0y(r8, r7);
                    C51971G9r.A12(r8, A0a, A042);
                    0sL r1 = C287485aD.A02;
                    if (r7.A0K || !C51972G9s.A1Q(r8, A002)) {
                        C51971G9r.A13(r8, r1, A002);
                    }
                    C51965G9l.A18(r8, A012);
                    C289515dj r72 = C289515dj.A00;
                    if (z3) {
                        num = AnonymousClass05K.A01;
                    } else {
                        num = AnonymousClass05K.A0C;
                    }
                    C56275Hvj.A00(r72, r8, (Modifier) null, r10, r11, hkx, num, (Integer) null, 4678, 224, z2, false);
                    if (C51967G9n.A1R(r8)) {
                        0fL.A00(-1490150729);
                        break;
                    }
                }
                break;
            default:
                UserSession userSession = (UserSession) this.A06;
                C54939HYv.A00(C51966G9m.A0R(obj3, obj4), (Modifier) this.A04, userSession, (Badge) this.A03, (0sP) this.A05, C51966G9m.A01(this.A01), this.A02, this.A07, this.A08);
                break;
        }
        return C60340gF.A00;
    }
}
