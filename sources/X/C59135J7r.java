package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.J7r  reason: case insensitive filesystem */
public final class C59135J7r extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59135J7r(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C55508Hiq hiq = (C55508Hiq) this.A02;
                I51.A01(C51966G9m.A0R(obj, obj2), (C71144Ody) this.A03, hiq, (C53546GqH) this.A04, C51966G9m.A01(this.A01));
                break;
            case 1:
                GQY.A07(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C54698HPd) this.A02, (0sP) this.A04, C51966G9m.A01(this.A01));
                break;
            case 2:
                GQY.A06(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C46519DgM) this.A02, (0sP) this.A04, C51966G9m.A01(this.A01));
                break;
            case 3:
                I7A.A01((LazyListState) this.A04, C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (0sP) this.A02, C51966G9m.A01(this.A01));
                break;
            case 4:
                C286575Wy r14 = (C286575Wy) obj;
                if (C51968G9o.A0C(obj2) == 2 && r14.Bwn()) {
                    r14.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(2134158277, "com.instagram.partnerprogram.fragment.CategoryListComponent.<anonymous> (PublisherControlBlockedCategoriesComposeFragment.kt:191)");
                    }
                    C285245Qk r10 = Modifier.A00;
                    Modifier A022 = I28.A02(r14, r10);
                    IGRevShareProductType iGRevShareProductType = (IGRevShareProductType) this.A04;
                    int i = this.A01;
                    0sP r8 = (0sP) this.A03;
                    List list = (List) this.A02;
                    AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
                    int A002 = C287425a7.A00(r14);
                    C286565Wx r7 = (C286565Wx) r14;
                    AnonymousClass5RM A042 = C286565Wx.A04(r7);
                    Modifier A012 = C287435a8.A01(r14, A022);
                    C51973G9u.A0y(r14, r7);
                    C51971G9r.A12(r14, A0Z, A042);
                    0sL r1 = C287485aD.A02;
                    if (r7.A0K || !C51972G9s.A1Q(r14, A002)) {
                        C51971G9r.A13(r14, r1, A002);
                    }
                    C51965G9l.A18(r14, A012);
                    int ordinal = iGRevShareProductType.ordinal();
                    if (ordinal == 1) {
                        r14.ExS(105276866);
                        I54.A03(r14, r8, i, 0);
                    } else if (ordinal == 2) {
                        r14.ExS(105280706);
                        I54.A02(r14, r8, i, 0);
                    } else if (ordinal == 0) {
                        r14.ExS(105283950);
                    } else {
                        throw C51972G9s.A0v(r14, r7, 105274627);
                    }
                    C286565Wx.A0L(r7, false);
                    Iterator A17 = C51968G9o.A17(r14, list, 105285482);
                    int i2 = 0;
                    while (A17.hasNext()) {
                        Object next = A17.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        C47180Drv drv = (C47180Drv) next;
                        C52636GaA.A0L(r14, r10, new C57122IPl(new J6V(i2, 7, (Object) drv, (Object) r8), drv.A03), drv.A02, drv.A04);
                        i2 = i3;
                    }
                    if (C51971G9r.A1S(r14, r7, false)) {
                        0fL.A00(-1223309046);
                        break;
                    }
                }
                break;
            case 5:
                I6T.A03(C51966G9m.A0R(obj, obj2), (C47182Drx) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, C51966G9m.A01(this.A01));
                break;
            case 6:
                I6T.A05(C51966G9m.A0R(obj, obj2), (C47182Drx) this.A04, (C62320sa) this.A02, (0sP) this.A03, C51966G9m.A01(this.A01));
                break;
            case 7:
                C56594I2y.A01(C51966G9m.A0R(obj, obj2), (C319156q8) this.A02, (C62320sa) this.A03, (C62320sa) this.A04, C51966G9m.A01(this.A01));
                break;
            case 8:
                I38.A00(C51966G9m.A0R(obj, obj2), (ImmutableList) this.A04, (C62320sa) this.A03, (C62320sa) this.A02, C51966G9m.A01(this.A01));
                break;
            case 9:
                C52737Gbp.A00(C51966G9m.A0R(obj, obj2), (C52745Gbx) this.A04, (SettingsScreenViewModel) this.A02, (0sL) this.A03, C51966G9m.A01(this.A01));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                I5G.A02(C51966G9m.A0R(obj, obj2), (JRL) this.A04, (C381879cj) this.A03, (0sP) this.A02, C51966G9m.A01(this.A01));
                break;
            default:
                C55144Hcs.A00(C51966G9m.A0R(obj, obj2), (SettingsScreenViewModel) this.A03, (C53559GqV) this.A04, (0sP) this.A02, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
