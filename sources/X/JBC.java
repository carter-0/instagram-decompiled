package X;

import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

public final class JBC extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JBC(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A09 = z;
        this.A08 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C286575Wy r14 = (C286575Wy) obj;
            if (C51968G9o.A0C(obj2) != 2 || !r14.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(467450878, "com.instagram.creation.genai.magicmod.common.ui.MagicModBackdropSegmentedImage.<anonymous>.<anonymous> (MagicModBackdropSegmentedImage.kt:67)");
                }
                HYK.A00(r14, (MagicModPostCaptureTransform) this.A04, AnonymousClass5PI.A01(r14, new C59199JAd(this.A07, this.A03, this.A05, this.A06, this.A02, this.A01, 2, this.A09, this.A08), 853939522), 56);
                if (0fL.A02()) {
                    0fL.A00(287973068);
                }
            } else {
                r14.Evl();
            }
        } else {
            HY5.A00(C51966G9m.A0R(obj, obj2), (0sL) this.A05, (0sL) this.A06, (0sL) this.A04, (0sL) this.A03, (0sL) this.A07, C51966G9m.A01(this.A01), this.A02, this.A09, this.A08);
        }
        return C60340gF.A00;
    }
}
