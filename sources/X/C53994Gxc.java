package X;

import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxc  reason: case insensitive filesystem */
public final class C53994Gxc extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public 0sL A00;

    public final boolean A0N() {
        return true;
    }

    public C53994Gxc() {
        super("SizeSpecsWrapperComponent");
    }

    public final Object[] A0W() {
        return new Object[]{this.A00};
    }

    public final C251263mp A0c(2V1 r6, int i, int i2) {
        C243243Xz r1;
        0sL r4 = this.A00;
        AnonymousClass7TF.A1C(r6, 0, r4);
        C243243Xz r12 = (2VG) r6.A0E.get();
        if (r12 instanceof C243243Xz) {
            r1 = r12;
        } else {
            r1 = null;
        }
        return (C251263mp) r4.invoke(new AnonymousClass3Y5(r6, r1), new C245073cH(C244873bt.A00(i, i2)));
    }
}
