package X;

import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.camera.sizesetter.Size;
import java.util.List;

/* renamed from: X.SoG  reason: case insensitive filesystem */
public final class C12165SoG implements C340147km {
    public final FixedSizes A00;

    public final C343137pj Ap9(C340177kp r5, C340177kp r6, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        FixedSizes fixedSizes = this.A00;
        Size size = fixedSizes.A01;
        C343047pa r3 = new C343047pa(size.A01, size.A00);
        Size size2 = fixedSizes.A00;
        return new C343137pj(r3, new C343047pa(size2.A01, size2.A00), (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj Bc4(C340177kp r5, List list, List list2, int i, int i2, int i3) {
        FixedSizes fixedSizes = this.A00;
        Size size = fixedSizes.A01;
        C343047pa r3 = new C343047pa(size.A01, size.A00);
        Size size2 = fixedSizes.A00;
        return new C343137pj(r3, new C343047pa(size2.A01, size2.A00), (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("Only photo mode is used");
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("Only photo mode is used");
    }

    public C12165SoG(FixedSizes fixedSizes) {
        this.A00 = fixedSizes;
    }
}
