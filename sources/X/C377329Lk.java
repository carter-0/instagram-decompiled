package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9Lk  reason: invalid class name and case insensitive filesystem */
public final class C377329Lk extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377329Lk(Object obj, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy r6 = (C286575Wy) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && r6.Bwn()) {
                    r6.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(-730946946, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
                    }
                    C305646Iz r2 = (C305646Iz) this.A02;
                    C304996Ga r0 = r2.A01;
                    int i = this.A01;
                    AnonymousClass6It AX1 = r0.A01.AX1(i);
                    ((C305616Iu) AX1.A02).A00.invoke(r2.A00, Integer.valueOf(i - AX1.A01), r6, 0);
                    if (0fL.A02()) {
                        0fL.A00(-1252003122);
                        break;
                    }
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                ((AnonymousClass54O) this.A02).A06((C286575Wy) obj, C301445zH.A00(this.A01 | 1));
                break;
            case 2:
                C246453ed r7 = (C246453ed) obj2;
                0qQ.A0B(r7, 1);
                return C246473ef.A00((1Xj) this.A02, (ImageUrl) null, r7, this.A01, false);
            default:
                ((Number) obj2).intValue();
                C286975Yn.A00((C286575Wy) obj, (0sL) this.A02, C301445zH.A00(this.A01 | 1));
                break;
        }
        return C60340gF.A00;
    }
}
