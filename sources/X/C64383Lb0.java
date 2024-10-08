package X;

import android.view.View;

/* renamed from: X.Lb0  reason: case insensitive filesystem */
public final class C64383Lb0 implements B14 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64383Lb0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void DFT(Object obj) {
        switch (this.A00) {
            case 0:
                AnonymousClass7N9 r3 = (AnonymousClass7N9) this.A02;
                String str = AnonymousClass7N9.A09;
                r3.A04.execute(new M8M((C71532dv) obj, (C16491Uvm) this.A01, r3));
                return;
            case 1:
                K4P.A00((View) this.A01, (C61078JwG) obj, (K4P) this.A02);
                return;
            default:
                C18409VrB.A01.put(this.A02, obj);
                ((AnonymousClass4D7) this.A01).resumeWith(obj);
                return;
        }
    }
}
