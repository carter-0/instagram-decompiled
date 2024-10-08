package X;

import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Arrays;

/* renamed from: X.9MU  reason: invalid class name */
public final class AnonymousClass9MU extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MU(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Object obj = this.A03;
            0qQ.A0C(obj, AnonymousClass000.A00(179));
            MediaFrameLayout mediaFrameLayout = ((C316006kx) obj).A1p;
            String format = String.format("Story Position %d Item %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(((C250973mM) this.A04).A03(((C310566bG) this.A05).A06, (C255773uh) this.A02))}, 2));
            0qQ.A07(format);
            mediaFrameLayout.setContentDescription(format);
        } else {
            AnonymousClass8A0 r1 = (AnonymousClass8A0) this.A05;
            AnonymousClass51M r3 = (AnonymousClass51M) this.A04;
            int i = this.A01;
            AnonymousClass89v r2 = (AnonymousClass89v) this.A02;
            AnonymousClass8A0.A01(r1, r2, r3, (String) new C377089Km(r2, 0).invoke(r3), new AnonymousClass9NK(r1, 2), (0sL) this.A03, (0sL) null, i, false, true);
        }
        return C60340gF.A00;
    }
}
