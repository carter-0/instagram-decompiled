package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.9M7  reason: invalid class name */
public final class AnonymousClass9M7 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M7(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r5 = (C286575Wy) obj;
        Number number = (Number) obj2;
        switch (this.A00) {
            case 0:
                if ((number.intValue() & 3) == 2 && r5.Bwn()) {
                    r5.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(172607435, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
                    }
                    ((AnonymousClass6J1) this.A02).A6j(r5, this.A03, this.A01, 0);
                    if (0fL.A02()) {
                        0fL.A00(-1897517118);
                        break;
                    }
                }
                break;
            case 1:
                number.intValue();
                ((AnonymousClass5PJ) this.A03).A01(r5, this.A02, C301445zH.A00(this.A01) | 1);
                break;
            case 2:
                number.intValue();
                AndroidCompositionLocals_androidKt.A00(r5, (AndroidComposeView) this.A03, (0sL) this.A02, C301445zH.A00(this.A01 | 1));
                break;
            default:
                number.intValue();
                AnonymousClass5ZZ.A0w(r5, (AnonymousClass5Z4) this.A03, (0sL) this.A02, C301445zH.A00(this.A01 | 1));
                break;
        }
        return C60340gF.A00;
    }
}
